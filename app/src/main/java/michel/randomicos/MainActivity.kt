package michel.randomicos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity(), View.OnClickListener { // deixa a classe como view click listener
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonRandom.setOnClickListener(this) // herda da própria classe o onclick! há outras maneiras mas essa é a mais correta!
        textNumber.setOnClickListener(this)


    }

    override fun onClick(v: View?) {

        if(v?.id== R.id.buttonRandom || v?.id == R.id.textNumber){
            val id = random()
        }

    }


    //função para sortear um número inteiro aleátorio
    fun random() : Int{
         return Random.nextInt(50) +1
    }


}