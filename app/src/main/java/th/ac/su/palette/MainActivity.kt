package th.ac.su.Palette

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var tvColor: TextView? = null
    private var btnOne: Button? = null
    private var btnTwo: Button? = null
    private var btnThree: Button? = null
    private var btnFour: Button? = null
    private var btnFive: Button? = null
    private var btnSix: Button? = null

    protected fun onCreate(savedInstanceState: Bundle) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvColor = findViewById(R.id.tvColor)
        btnOne = findViewById(R.id.btnOne)
        btnTwo = findViewById(R.id.btnTwo)
        btnThree = findViewById(R.id.btnThree)
        btnFour = findViewById(R.id.btnFour)
        btnFive = findViewById(R.id.btnFive)
        btnSix = findViewById(R.id.btnSix)

        btnOne!!.setOnClickListener {
            tvColor!!.text = "225-235-221"
            tvColor!!.setBackgroundColor(Color.rgb(235, 225, 221))
        }

        btnTwo!!.setOnClickListener {
            tvColor!!.text = "236-203-202"
            tvColor!!.setBackgroundColor(Color.rgb(236, 203, 202))
        }

        btnThree!!.setOnClickListener {
            tvColor!!.text = "117-131-156"
            tvColor!!.setBackgroundColor(Color.rgb(117, 131, 156))
        }

        btnFour!!.setOnClickListener {
            tvColor!!.text = "153-169-191"
            tvColor!!.setBackgroundColor(Color.rgb(153, 169, 191))
        }

        btnFive!!.setOnClickListener {
            tvColor!!.text = "195-204-213"
            tvColor!!.setBackgroundColor(Color.rgb(195, 204, 213))
        }

        btnSix!!.setOnClickListener {
            tvColor!!.text = "221-226-229"
            tvColor!!.setBackgroundColor(Color.rgb(221, 226, 229))
        }

    }
}
