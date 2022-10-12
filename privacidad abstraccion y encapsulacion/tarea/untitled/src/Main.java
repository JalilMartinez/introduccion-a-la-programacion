public class Main {
    public static void main(String[] args) {
        Persona persona= new Persona();
        persona.setNombre("Jalil");
        persona.setTelefono(55681695);
        persona.setEdad(23);
        System.out.println(persona.getNombre());
        System.out.println(persona.getTelefono());
        System.out.println(persona.getEdad());

    }
}
class Persona{
    private String nombre;
    private int edad;
    private int telefono;

    public void setNombre(String valor){
        this.nombre= valor;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setEdad(int valor){
        this.edad= valor;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setTelefono(int valor){
        this.telefono= valor;
    }
    public int getTelefono(){
        return this.telefono;
    }
}

