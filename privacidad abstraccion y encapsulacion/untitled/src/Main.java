public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo= new Vehiculo();
        vehiculo.setTipo("Coche");
        System.out.println(vehiculo.getTipo());
    }
}
class Vehiculo{
    private String tipo;

    public void setTipo(String valor){
        this.tipo= valor;
    }
    public String getTipo(){
        return this.tipo;
    }
}