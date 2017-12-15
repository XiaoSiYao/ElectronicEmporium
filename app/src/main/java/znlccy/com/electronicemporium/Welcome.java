package znlccy.com.electronicemporium;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Welcome extends AppCompatActivity {

    private Button openIndexBtn;

    private ImageButton imageOpenBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        openIndexBtn = (Button) findViewById(R.id.index_id);
        openIndexBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Welcome.this,SettingsActivity.class);
                intent.putExtra("name","chencongye");
                startActivity(intent);
            }
        });

        imageOpenBtn = (ImageButton) findViewById(R.id.imagebtn_open);
        imageOpenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Welcome.this,Index.class);
                intent.putExtra("name","chencongye");
                startActivity(intent);
            }
        });
    }

    public void sendJsonData() {

    }
}
