public class Main {
    public static void main(String[] args) {

        Coche coche = new Coche();
        coche.acelerar();
        System.out.println(coche.velocidadActual);
        coche.desacelerar();
        System.out.println(coche.velocidadActual);
    }
}
class Coche{
    int numeroDePuertas0;
    int velocidadMaxima;
    float velocidadActual;
    public void acelerar(){
        velocidadActual ++;
    }
    public void desacelerar(){
        velocidadActual --;
    }

}