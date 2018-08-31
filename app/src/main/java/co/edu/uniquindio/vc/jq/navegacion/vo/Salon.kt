package co.edu.uniquindio.vc.jq.navegacion.vo

import android.os.Parcel
import android.os.Parcelable


class Salon(var numeroSalon:String,
            var numeroSillas:String,
            var listaEstudiante:List<String>): Parcelable {

    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString(),
            parcel.createStringArrayList())

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(numeroSalon)
        parcel.writeString(numeroSillas)
        parcel.writeStringList(listaEstudiante)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Salon> {
        override fun createFromParcel(parcel: Parcel): Salon {
            return Salon(parcel)
        }

        override fun newArray(size: Int): Array<Salon?> {
            return arrayOfNulls(size)
        }
    }


}