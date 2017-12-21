package znlccy.com.electroniceporium;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import znlccy.com.electronicemporium.R;

/**
 * @Author Chencongye
 * @Date 2017/12/15 13:27
 * @Version 1.0.0
 * @Instructions 实现注册界面
 */

public class Registered extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registered);
    }

    public void onClick() {
        View v = findViewById(R.id.username_id);
        v.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                return false;
            }
        });
    }

    public void initUI() {
        TextView username = (TextView) findViewById(R.id.username_id);
    }

}
