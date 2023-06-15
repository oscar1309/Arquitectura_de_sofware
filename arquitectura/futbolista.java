public class futbolista  extends empleado{
private int idFutbolista, dorsal, tiempoexp;
private String posicion;

public futbolista(int idEmpleado, int idRol, int edad, int telefono, String nombre, String apellido, String email,
        String eps) {
    super(idEmpleado, idRol, edad, telefono, nombre, apellido, email, eps);
    this.idFutbolista = idFutbolista;
    this.dorsal = dorsal;
    this.tiempoexp = tiempoexp;
    this.posicion = posicion;
}

public void setIdFutbolista(int idFutbolista) {
    this.idFutbolista=idFutbolista;
}

public void setDorsal(int dorsal) {
    this.dorsal = dorsal;
}
public void setTiempoExp(int tiempoexp) {
    this.tiempoexp = tiempoexp;
}
public void setPosicion(String posicion) {
    this.posicion = posicion;
}
@Override
    public String mostrardatos(){
        return "nombre:" +nombre + "\n apellido" + apellido  + "\n edad" + edad +"\n eps" 
        + eps +"\n posicion" + posicion + "\ndorsal:" +dorsal + "\ntiempoExp" + tiempoexp ;


}
}