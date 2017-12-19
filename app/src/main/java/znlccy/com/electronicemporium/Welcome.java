package znlccy.com.electronicemporium;

import android.app.job.JobInfo;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.ArrayMap;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Map;

public class Welcome extends AppCompatActivity {

    /*声明打开第二个activity窗口*/
    private Button openIndexBtn;

    /*声明登录按钮*/
    private Button loginBtn;

    /*声明注册按钮*/
    private Button registeredBtn;

    /*声明用户名编辑框*/
    private EditText username;

    /*声明密码编辑框*/
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        openIndexBtn = (Button) findViewById(R.id.index_id);
        openIndexBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Welcome.this,Index.class);
                intent.putExtra("name","chencongye");
                startActivity(intent);
            }
        });

       loginBtn = (Button) findViewById(R.id.login_id);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Intent intent = new Intent(Welcome.this,Index.class);
                intent.putExtra("username","chencongye");*/
            }
        });

        registeredBtn = (Button) findViewById(R.id.registered_id);
        registeredBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Welcome.this,Registered.class);
                startActivity(intent);

            }
        });
        password = (EditText) findViewById(R.id.userpassword_id);
        username = (EditText) findViewById(R.id.username_id);
        password.setText(username.getText().toString());
    }

    public void sendJsonData() {
        
    }
}
