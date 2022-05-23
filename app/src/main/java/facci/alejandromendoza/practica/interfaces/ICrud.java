package facci.alejandromendoza.practica.interfaces;

public interface ICrud {
    void Guardar(String Cedula, String Nombres, String Apellidos);
    void ConsultaGeneral();
    void Modificar();
    void Eliminar();
}
