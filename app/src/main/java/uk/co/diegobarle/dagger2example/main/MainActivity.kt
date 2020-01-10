package uk.co.diegobarle.dagger2example.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*
import uk.co.diegobarle.dagger2example.R
import uk.co.diegobarle.dagger2example.di.injector

class MainActivity : AppCompatActivity() {

    private val mainViewModel by lazy {
        ViewModelProviders.of(this, injector.mainViewModelFactory()).get(MainViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvTitle.text = mainViewModel.title
    }

    fun sendMessage(view: View){
        val result = mainViewModel.sendMessage(etMessage.text.toString())
        etMessage.setText("")
        Toast.makeText(this, result.message, Toast.LENGTH_SHORT).show()
    }
}
