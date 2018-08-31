package co.edu.uniquindio.vc.jq.navegacion.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import co.edu.uniquindio.vc.jq.navegacion.R
import co.edu.uniquindio.vc.jq.navegacion.vo.Estudiante
import co.edu.uniquindio.vc.jq.navegacion.vo.Salon
import kotlinx.android.synthetic.main.activity_navegacion.*
import java.util.*
import kotlin.collections.ArrayList

const val CODIGO_VENTANA_NAV = 100
const val RESULTADO = "RESULTADO"
const val NAVEGACION_ACTIVITY = "NavegacionActivity"
const val LLAVE_MENSAJE = "Llave-mensaje"
const val PARCELABLE = "LLAVE_PARCELABLE"


/**
 * Actividad encargada de manejar navegación de la App
 * @author JQ--VC
 * @version 1.0
 */
class NavegacionActivity : AppCompatActivity() {

    lateinit var estudiante: Estudiante
    lateinit var salon: Salon

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navegacion)
        Log.v(NAVEGACION_ACTIVITY,"onCreate")


        val notas = floatArrayOf(1.2f,3f,4.5f,5f)
        estudiante = Estudiante(Date(),"Juan Wilmer",true,notas)
        val amigo:Estudiante = Estudiante(Date(),"Carlos",false,notas)
        estudiante.amigos.add(amigo)


        val estudiantes:List<String> = listOf("Jessica","Victor","Julian","Carlos")

        salon = Salon("45","50",estudiantes)
    }


    /**
     * Permite cambiar el mensaje de saludo
     * @param view boton qie genera el evento
     */
    fun cambiarMensaje(view: View){

        txt_mensaje_uno.text= resources.getString(R.string.txt_ventana_uno_mensaje_dos)


    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)

        outState?.putString(LLAVE_MENSAJE,txt_mensaje_uno.text.toString())
    }


    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)

        txt_mensaje_uno.text=savedInstanceState?.getString(LLAVE_MENSAJE)
    }

    /**
     * Permite pasar a ventana dos
     * @param view botón que genera el evento
     */
    fun pasarAVentanados(view: View){

       // Log.v("NavegacionActivity","Voy a pasar a ventana dos prueba")
        val intent = Intent(this, VentanaDosActivity::class.java);
        intent.putExtra(PARCELABLE,estudiante)
        startActivity(intent)

    }

    /**
     * Permite pasar a ventana tres
     */
    fun pasarAVentanatres(view: View){

        val intent = Intent(this, VentanaTresActivity::class.java)
        startActivityForResult(intent, CODIGO_VENTANA_NAV)
        intent.putExtra(PARCELABLE,salon)
        startActivity(intent)

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
