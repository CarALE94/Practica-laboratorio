package facci.alejandromendoza.practica.crud;

import android.util.Log;

import facci.alejandromendoza.practica.interfaces.ICrud;
import facci.alejandromendoza.practica.modelos.Alumnos;

public class AlumnosCRUD implements ICrud {
    @Override
    public void Guardar(
            String Cedula,
            String Nombres,
            String Apellidos) {
        Alumnos alumnos = new Alumnos(
                Cedula,
                Nombres,
                Apellidos);
        alumnos.save();
        Log.e("", "DATOS GUARDADOS");
    }

    @Override
    public void ConsultaGeneral() {

    }

    @Override
    public void Modificar(){

    }

    @Override
    public void Eliminar(){

    }
}



