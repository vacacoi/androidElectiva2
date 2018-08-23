package co.edu.uniquindio.vc.jq.navegacion

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast

const val CODIGO_VENTANA_NAV = 100
const val RESULTADO = "RESULTADO"
const val NAVEGACION_ACTIVITY = "NavegacionActivity"

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

    /**
     * Permite pasar a ventana dos
     * @param view botón que genera el evento
     */
    fun pasarAVentanados(view: View){

       // Log.v("NavegacionActivity","Voy a pasar a ventana dos prueba")
        val intent = Intent(this,VentanaDosActivity::class.java);
        startActivity(intent);

    }

    /**
     * Permite pasar a ventana tres
     */
    fun pasarAVentanatres(view: View){

        val intent = Intent(this,VentanaTresActivity::class.java)
        startActivityForResult(intent, CODIGO_VENTANA_NAV)

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        val resultado = data?.getExtras()?.getString(RESULTADO);
        if (resultCode == RESULT_OK) {
            Toast.makeText(this, "$resultCode volví a la ventana inicial $resultado", Toast.LENGTH_LONG).show()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.v(NAVEGACION_ACTIVITY,"onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.v(NAVEGACION_ACTIVITY,"onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.v(NAVEGACION_ACTIVITY,"onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.v(NAVEGACION_ACTIVITY,"onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.v(NAVEGACION_ACTIVITY,"onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v(NAVEGACION_ACTIVITY,"onDestroy")
    }

}
