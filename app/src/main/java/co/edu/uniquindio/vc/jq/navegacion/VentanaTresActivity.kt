package co.edu.uniquindio.vc.jq.navegacion

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class VentanaTresActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ventana_tres)
    }


    override fun onBackPressed() {
        val i = getIntent()
        i.putExtra(RESULTADO, "Info de otra actividad")
        setResult(RESULT_OK, i)
        finish()
        super.onBackPressed()
    }

}
