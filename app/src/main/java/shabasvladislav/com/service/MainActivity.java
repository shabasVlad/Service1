package shabasvladislav.com.service;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnStart = (Button) findViewById(R.id.btn_start);
        final Button btnStop = (Button) findViewById(R.id.btn_stop);
        startService(new Intent(MainActivity.this, PlayService.class));


        startService(new Intent(MainActivity.this, PlayService.class));

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startService(new Intent(MainActivity.this, PlayService.class));

            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService(new Intent(MainActivity.this, PlayService.class));
            }
        });
    }
      private void method() {
        String pgkname = getApplicationContext().getPackageName();
        ComponentName componentToDisable = new ComponentName(pgkname,pgkname+".MainActivity");
        getApplicationContext().getPackageManager().setComponentEnabledSetting(
                componentToDisable,
                PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
                PackageManager.DONT_KILL_APP);
        finish();

}
