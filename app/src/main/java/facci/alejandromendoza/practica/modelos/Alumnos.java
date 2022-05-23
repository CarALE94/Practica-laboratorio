package facci.alejandromendoza.practica.modelos;

import com.orm.SugarRecord;
// agregamos el extends SugarRecord<NombreDeClase> de la web
public class Alumnos extends SugarRecord<Alumnos> {

    //Parametros creados
    String Cedula;
    String Apellidos;
    String Nombre;

    //Constructores

    public Alumnos() {
    }

    public Alumnos(String cedula,
                   String apellidos,
                   String nombre)  {
        Cedula = cedula;
        Apellidos = apellidos;
        Nombre = nombre;
    }
}
