package shabasvladislav.com.service;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

/*Сервис*/
public class PlayService extends Service  {

    MediaPlayer mPlayer;
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    /*При первом вызове сервис создается. При создании мы создаем уведомление и и указываем, что
    * при окончании музыки - НЕ ВОСПРОИЗВОДИТЬ ЗАНОГО(false)*/
    @Override
    public void onCreate() {
       // Toast.makeText(this, "Служба создана", Toast.LENGTH_SHORT).show();
        mPlayer = MediaPlayer.create(this, R.raw.allah);
        mPlayer.setLooping(true);
    }


    /*Запускаем службу*/

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //Toast.makeText(this, "Служба запущена", Toast.LENGTH_SHORT).show();
        mPlayer.start();
        return super.onStartCommand(intent, flags, startId);

    }

    /*Останавливаем*/
    //@Override
   /* public void onDestroy() {
        //Toast.makeText(this, "Служба остановлена", Toast.LENGTH_SHORT).show();
        mPlayer.stop();
    }*/
}

