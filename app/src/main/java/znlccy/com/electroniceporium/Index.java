package znlccy.com.electroniceporium;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.Toast;

import znlccy.com.electronicemporium.R;

public class Index extends AppCompatActivity {

    private EditText showEditText;

    /*private Long mTime;

    private Long mStart;*/

    private Long result;

    private int i;

    private int count;

    /*private Handler mHandler = new Handler(public void handleMessage(Message message) {
            long current = System.currentTimeMillis();
            mTime += current-mStart;
            mStart = current;
            TextView counter = (TextView) Index.this.findViewById(R.id.username_id);
            counter.setText(DateUtils.formatElapsedTime(mTime/1000));
            mHandler.sendEmptyMessageDelayed(0,250);
        };
    );*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        Toast.makeText(Index.this, "你好", Toast.LENGTH_SHORT).show();
        WebView webView = (WebView) findViewById(R.id.web_id);
        webView.loadUrl("http://www.baidu.com");
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setPluginState(WebSettings.PluginState.ON);
        webSettings.setSupportZoom(true);
        webSettings.setBuiltInZoomControls(true);
        /*webView.setWebViewClient(new WebViewClient(;
            @Override
            public boolean shouldOverrideUrlLoading(WebView myview,String url)
            {
                webView.loadUrl(url);
                return true;
            }
        ));*/
    }

    public void initUI() {
        /*检测所有网络和IO异常*/
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder()
                .detectAll()
                .penaltyLog()
                .penaltyDialog()
                .build()
        );
    }

    /*检测ApplicationInfo标志就行*/
    public static boolean isDebugMode(Context context) {
        PackageManager pm = context.getPackageManager();
        try {
            ApplicationInfo info = pm.getApplicationInfo(context.getPackageName(),0);
            return (info.flags & ApplicationInfo.FLAG_DEBUGGABLE) != 0;
        } catch (PackageManager.NameNotFoundException e) {
        }

        return true;
    }

    /*声明点击事件*/
    public void onClick(View view) {
        if (view.getId() == R.id.login_id)
        {

        } else if(view.getId()== R.id.registered_id)
        {

        }
    }

    /*异步下载文件任务*/
    /*private class DownloadFilesTask extends AsyncTask<URL,Integer,Long> {
        protected Long doInBackground(URL... urls) {
            while (true) {
                //Do Some Work
                publishProgress((int)((i/(float) count)*100));
            }
            *//*return result;*//*
        }
        protected void onProgressUpdate(Integer... progress) {
            setSecondaryProgress(progress[0]);
        }

        protected void onPostExcute(Long result) {
            showDialog(0);
        }
    }*/
}




