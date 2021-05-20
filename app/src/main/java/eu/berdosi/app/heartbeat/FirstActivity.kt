package eu.berdosi.app.heartbeat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        var firstbt:Button = findViewById(R.id.firstbt)

        firstbt.setOnClickListener(){
            val intent = Intent(applicationContext, BodyHeatActivity::class.java)
            startActivity(intent)
        }
    }
}