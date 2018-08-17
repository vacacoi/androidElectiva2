package co.edu.uniquindio.vc.jq.navegacion

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View


/**
 * Actividad encargada de manejar navegación de la App
 * @author JQ--VC
 * @version 1.0
 */
class NavegacionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navegacion)
    }

    fun pasarAVentanados(view: View){

        Log.v("NavegacionActivity","Voy a pasar a ventana dos prueba")

    }
}
