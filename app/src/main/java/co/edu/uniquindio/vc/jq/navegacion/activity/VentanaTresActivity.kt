package co.edu.uniquindio.vc.jq.navegacion.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import co.edu.uniquindio.vc.jq.navegacion.R
import co.edu.uniquindio.vc.jq.navegacion.vo.Salon

class VentanaTresActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ventana_tres)

        var salon = intent.getParcelableExtra<Salon>(PARCELABLE)

        Log.v("Ventana tres", "-----------------------")
        Log.v("Ventana tres: ","Número de salón: ${salon.numeroSalon}")
        Log.v("Ventana tres: ","Número de sillas: ${salon.numeroSillas}")

        val  varSalon = salon.listaEstudiante.iterator()

        while (varSalon.hasNext()){
            Log.v("Ventana tres: ","Estudiante: ${varSalon.next()}")


        }



        }


    override fun onBackPressed() {
        val i = getIntent()
        i.putExtra(RESULTADO, "Info de otra actividad")
        setResult(RESULT_OK, i)
        finish()
        super.onBackPressed()
    }

}
