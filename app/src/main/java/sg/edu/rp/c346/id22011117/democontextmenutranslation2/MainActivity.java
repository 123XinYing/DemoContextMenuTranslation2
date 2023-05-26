package sg.edu.rp.c346.id22011117.democontextmenutranslation2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvTranslatedText;
    TextView tvTranslatedText2;
    String wordClicked = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTranslatedText = findViewById(R.id.textViewTranslatedText);
        registerForContextMenu(tvTranslatedText);
        tvTranslatedText2 = findViewById(R.id.textViewTranslatedText2);
        registerForContextMenu(tvTranslatedText2);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add(0, 0, 0, "Chinese");
        menu.add(0, 1, 1, "Japanese");

        if (v == tvTranslatedText) {
            wordClicked = "what";
        } else if (v == tvTranslatedText2) {
            wordClicked = "when";
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if (wordClicked.equalsIgnoreCase("what")) {
            if (item.getItemId() == 0) {
                Toast.makeText(MainActivity.this, "Chinese is chosen", Toast.LENGTH_SHORT).show();
                tvTranslatedText.setText("shenme");
                return true;
            } else if (item.getItemId() == 1) {
                Toast.makeText(MainActivity.this, "Japanese is chosen", Toast.LENGTH_SHORT).show();
                tvTranslatedText.setText("nani");
                return true;
            }
        } else if (wordClicked.equalsIgnoreCase("when")) {
            if (item.getItemId() == 0) {
                Toast.makeText(MainActivity.this, "Chinese is chosen", Toast.LENGTH_SHORT).show();
                tvTranslatedText2.setText("jishi");
                return true;
            } else if (item.getItemId() == 1) {
                Toast.makeText(MainActivity.this, "Japanese is chosen", Toast.LENGTH_SHORT).show();
                tvTranslatedText2.setText("itsu");
                return true;
            }
        }

        return super.onContextItemSelected(item);
    }



}