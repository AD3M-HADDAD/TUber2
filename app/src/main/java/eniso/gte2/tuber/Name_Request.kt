package eniso.gte2.tuber
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import eniso.gte2.tuber.databinding.ActivityNameRequestBinding
import eniso.gte2.tuber.databinding.ActivityNumberRequestBinding

class Name_Request : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val actionBar: ActionBar? = supportActionBar
        actionBar?.hide()
        val binding = ActivityNameRequestBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            binding.button.setBackgroundColor(Color.LTGRAY)
            if (binding.editTextFN.text.isEmpty())
            {
                Toast.makeText(this,  "You need to enter your first name", Toast.LENGTH_LONG).show()
            }
            else if (binding.editTextLN.text.isEmpty()){
                Toast.makeText(this,  "You need to enter your last name", Toast.LENGTH_LONG).show()
            }
            else{
//                val int = Intent(this,Email_Request::class.java)
//                startActivity(int)
            }
        }
    }
}