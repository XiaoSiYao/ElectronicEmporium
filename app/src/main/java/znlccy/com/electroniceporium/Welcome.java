package znlccy.com.electroniceporium;

import android.app.Notification;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import znlccy.com.electronicemporium.R;

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
                int icon = R.drawable.scroll;
                CharSequence ticker = "Hello World!";
                long now = System.currentTimeMillis();
                Notification notification = new Notification(icon,ticker,now);

               /* NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                Context context = getApplicationContext();
                CharSequence title = "Hello World!";
                String message = "This is a message.";
                PendingIntent pendingIntent = PendingIntent.getActivity(this,0,intent,0);
                notification.*/
            }
        });

        registeredBtn = (Button) findViewById(R.id.registered_id);
        registeredBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Welcome.this,Registered.class);
                startActivity(intent);
                /*Toast.makeText(Welcome.this,"注册",Toast.LENGTH_SHORT).show();*/
            }
        });
        password = (EditText) findViewById(R.id.userpassword_id);
        username = (EditText) findViewById(R.id.username_id);
        password.setText(username.getText().toString());
    }

    public void sendJsonData() {
        
    }


}

