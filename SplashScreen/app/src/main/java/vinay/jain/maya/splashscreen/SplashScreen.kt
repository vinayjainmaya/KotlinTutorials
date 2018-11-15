package vinay.jain.maya.splashscreen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity;


class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        var mHandler: Handler = Handler()
        var mRunnable: Runnable = Runnable {

            var i: Intent = Intent(this@SplashScreen, MainActivity::class.java)
            startActivity(i)
            finish()
        }

        mHandler.postDelayed(mRunnable,5000)

    }

}
