package eu.berdosi.app.heartbeat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        var thirdbtn: Button = findViewById(R.id.thirdbtn)

        thirdbtn.setOnClickListener(){
            val intent = Intent(applicationContext, HeartBeatActivity2::class.java)
            startActivity(intent)
        }
    }
}