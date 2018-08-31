package co.edu.uniquindio.vc.jq.navegacion.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import co.edu.uniquindio.vc.jq.navegacion.R
import co.edu.uniquindio.vc.jq.navegacion.vo.Salon
import java.lang.reflect.Array
import java.util.*

class VentanaTresActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ventana_tres)

        var salon = intent.getParcelableExtra<Salon>(PARCELABLE)

        Log.v("Ventana tres", "-----------------------")
        Log.v("Ventana tres: ","Número de salón: ${salon.numeroSalon}")
        Log.v("Ventana tres: ","Número de sillas: ${salon.numeroSillas}")

        val  varSalon = salon.listaEstudiante

        Log.v("Ventana tres:","Estudiantes: "+varSalon)




        }


    override fun onBackPressed() {
        val i = getIntent()
        i.putExtra(RESULTADO, "Info de otra actividad")
        setResult(RESULT_OK, i)
        finish()
        super.onBackPressed()
    }

}
