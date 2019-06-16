package Service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class service extends Service {
    public Context context=this;
    public Handler handler=null;
    public Runnable runnable=null;






//    @androidx.annotation.Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate(){
        Toast.makeText(this, "Service Created", Toast.LENGTH_SHORT).show();

        handler= new Handler();

        runnable=new Runnable() {
            @Override
            public void run() {
                double randomNo = getRandonDoubleBetweenRange(1, 100);
                Toast.makeText(context, "Random no:" + randomNo, Toast.LENGTH_SHORT).show();
                handler.postDelayed(runnable)
            }
        };



        }

    private double getRandonDoubleBetweenRange(int i, int i1) {
    }
}
}
