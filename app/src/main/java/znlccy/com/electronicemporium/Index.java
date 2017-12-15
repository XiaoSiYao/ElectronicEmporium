package znlccy.com.electronicemporium;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Index extends AppCompatActivity {

    private EditText showEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        showEditText = (EditText) findViewById(R.id.showText_id);
        Intent intent = new Intent();
        String content = intent.getStringExtra("name");
        System.err.println(content);
        showEditText.setText(content);
    }
}
