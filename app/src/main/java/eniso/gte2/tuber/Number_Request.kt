package eniso.gte2.tuber

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import eniso.gte2.tuber.databinding.ActivityNumberRequestBinding

class Number_Request : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val actionBar: ActionBar? = supportActionBar
        actionBar?.hide()
        val binding = ActivityNumberRequestBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button4.setOnClickListener {
            binding.button4.setBackgroundColor(Color.LTGRAY)
            binding.button.setBackgroundColor(Color.TRANSPARENT)
            if (binding.editTextPhone.text.isEmpty())
            {
                Toast.makeText(this,  "You need to enter your mobile number", Toast.LENGTH_LONG).show()
            }
            else if (binding.editTextPhone.text.length !=8)
            {   Toast.makeText(this,  "You need to enter a valid mobile number", Toast.LENGTH_LONG).show()}
            else if (binding.editTextPhone.text.contains("."))
            {   Toast.makeText(this,  "You need to enter a valid mobile number", Toast.LENGTH_LONG).show()}
            else if (binding.editTextPhone.text.contains(","))
            {   Toast.makeText(this,  "You need to enter a valid mobile number", Toast.LENGTH_LONG).show()}
            else if (binding.editTextPhone.text.contains("+"))
            {   Toast.makeText(this,  "You need to enter a valid mobile number", Toast.LENGTH_LONG).show()}
            else if (binding.editTextPhone.text.contains("*"))
            {   Toast.makeText(this,  "You need to enter a valid mobile number", Toast.LENGTH_LONG).show()}
            else if (binding.editTextPhone.text.contains("/"))
            {   Toast.makeText(this,  "You need to enter a valid mobile number", Toast.LENGTH_LONG).show()}
            else if (binding.editTextPhone.text.contains("("))
            {   Toast.makeText(this,  "You need to enter a valid mobile number", Toast.LENGTH_LONG).show()}
            else if (binding.editTextPhone.text.contains(")"))
            {   Toast.makeText(this,  "You need to enter a valid mobile number", Toast.LENGTH_LONG).show()}
            else if (binding.editTextPhone.text.contains("#"))
            {   Toast.makeText(this,  "You need to enter a valid mobile number", Toast.LENGTH_LONG).show()}
            else if (binding.editTextPhone.text.contains("-"))
            {   Toast.makeText(this,  "You need to enter a valid mobile number", Toast.LENGTH_LONG).show()}
            else if (binding.editTextPhone.text.contains(" "))
            {   Toast.makeText(this,  "You need to enter a valid mobile number", Toast.LENGTH_LONG).show()}
            else {
                val int = Intent(this,Email_Request::class.java)
                startActivity(int)
            }
        }
        binding.button.setOnClickListener {
            binding.button.setBackgroundColor(Color.LTGRAY)
            binding.button4.setBackgroundColor(Color.TRANSPARENT)
            val int = Intent(this,Email_Request::class.java)
            startActivity(int)
        }

    }
}