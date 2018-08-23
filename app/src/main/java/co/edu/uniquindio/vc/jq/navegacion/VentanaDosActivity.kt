package co.edu.uniquindio.vc.jq.navegacion

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val VENTANA_DOS = "VentanaDosActivity"

class VentanaDosActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ventana_dos)
    }

    override fun onStart() {
        super.onStart()
        Log.v(VENTANA_DOS,"onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.v(VENTANA_DOS,"onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.v(VENTANA_DOS,"onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.v(VENTANA_DOS,"onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.v(VENTANA_DOS,"onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v(VENTANA_DOS,"onDestroy")
    }
}
