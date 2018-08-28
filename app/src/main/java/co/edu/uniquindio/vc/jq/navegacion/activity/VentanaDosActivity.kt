package co.edu.uniquindio.vc.jq.navegacion.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import co.edu.uniquindio.vc.jq.navegacion.R
import co.edu.uniquindio.vc.jq.navegacion.vo.Estudiante

const val VENTANA_DOS = "VentanaDosActivity"

class VentanaDosActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ventana_dos)
        Log.v(VENTANA_DOS,"onCreate")

        var estudiante = intent.getParcelableExtra<Estudiante>(PARCELABLE)
        Log.v("Ventana dos", "-----------------------")
        Log.v("Ventana dos: ","nombre: ${estudiante.nombre}")
        Log.v("Ventana dos: ","unico: ${estudiante.esHijoUnico}")
        Log.v("Ventana dos: ","fecha: ${estudiante.fechaNacimiento}")
        Log.v("Ventana dos: ","notas: ${estudiante.notas?.contentToString()}")
        Log.v("Ventana dos: ","número amigos: ${estudiante.amigos.size}")
        Log.v("Ventana dos", "-----------------------")
        var amigo = estudiante.amigos[0]
        Log.v("Ventana dos: ","amigo nombre: ${amigo.nombre}")
        Log.v("Ventana dos: ","amigo unico: ${amigo.esHijoUnico}")
        Log.v("Ventana dos: ","amigo fecha: ${amigo.fechaNacimiento}")
        Log.v("Ventana dos: ","amigo notas: ${amigo.notas?.contentToString()}")
        Log.v("Ventana dos: ","amigo número amigos: ${amigo.amigos.size}")

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
