package vinay.jain.maya.viewonclick

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*;

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onClick(v: View?) {
        bottom.setText("Third type of Onclick is working fine")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button2.setOnClickListener {
            bottom.setText("First type of Onclick is working fine")
        }

        button4.setOnClickListener(listen);
        button5.setOnClickListener(this@MainActivity);
    }

    val listen : View.OnClickListener = View.OnClickListener { view ->
        bottom.setText("Second type of Onclick is working fine")
    }
}
