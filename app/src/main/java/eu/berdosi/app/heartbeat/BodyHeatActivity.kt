package eu.berdosi.app.heartbeat

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.inputmethod.InputMethodManager
import android.widget.Button

class BodyHeatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_body_heat)

        var secbtn: Button = findViewById(R.id.secbtn)
        secbtn.setOnClickListener(){
            val intent = Intent(applicationContext, ThirdActivity::class.java)
            startActivity(intent)
        }
    }
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        // InputMethodManager をキャストしながら取得
        val inputMethodManager: InputMethodManager =
            getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager

        // エルビス演算子でViewを取得できなければ return false
        // focusViewには入力しようとしているのEditTextが取得されるはず
        val focusView = currentFocus ?: return false

        // このメソッドでキーボードを閉じる
        inputMethodManager.hideSoftInputFromWindow(
            focusView.windowToken,
            InputMethodManager.HIDE_NOT_ALWAYS
        )

        return false
    }
}