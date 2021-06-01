package sg.edu.rp.c346.id20015553.democontextmenutranslation2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvTranslatedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTranslatedText = findViewById(R.id.tvTranslatedText);
        registerForContextMenu(tvTranslatedText);
    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        getMenuInflater().inflate(R.menu.menu_main, menu);

    }



    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if(item.getTitle().equals("English")){
            tvTranslatedText.setText("Hello");
            return true;
        }
        else if(item.getTitle().equals("Italian")){
            tvTranslatedText.setText("Ciao");
            return true;
        }

        return super.onContextItemSelected(item);
    }


}