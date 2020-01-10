package uk.co.diegobarle.dagger2example.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import uk.co.diegobarle.dagger2example.Dagger2ExampleApp
import uk.co.diegobarle.dagger2example.R
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as Dagger2ExampleApp).appComponent.inject(this)
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
