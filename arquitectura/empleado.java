public class empleado {
    int idEmpleado, idRol, edad, telefono;
    String nombre, apellido,email,eps;
    public empleado(int idEmpleado, int idRol, int edad, int telefono, String nombre, 
    String apellido, String email,String eps) {
        this.idEmpleado = idEmpleado;
        this.idRol = idRol;
        this.edad = edad;
        this.telefono = telefono;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.eps = eps;
    }

    public String mostrardatos(){
        return "nombre:" +nombre + "\n apellido" + apellido  + "\n edad" + edad +"\n eps" + eps;
        
    }
    }