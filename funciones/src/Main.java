public class Main {

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        int resultado = 0;


        miCoche.Puertamas();
        resultado = suma( 4, 5, 7);



        System.out.println(resultado);
        System.out.println(miCoche.puertas);
    }
    public static int suma(int a, int b, int c){
        return a + b + c;
    }





}
class Coche{
    public int puertas = 0;
    public void Puertamas(){
        this.puertas++;
    }
    public void Puertamenos(){
        this.puertas--;
    }
}