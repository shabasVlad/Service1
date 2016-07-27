package shabasvladislav.com.service;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

public class PlayService extends Service  {

    MediaPlayer mPlayer;
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        Toast.makeText(this, "Служба создана", Toast.LENGTH_SHORT).show();
        mPlayer = MediaPlayer.create(this, R.raw.allah);
        mPlayer.setLooping(false);
    }


    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
        Toast.makeText(this, "Служба запущена", Toast.LENGTH_SHORT).show();
        mPlayer.start();
    }

    @Override
    public void onDestroy() {
        Toast.makeText(this, "Служба остановлена", Toast.LENGTH_SHORT).show();
        mPlayer.stop();
    }
}
