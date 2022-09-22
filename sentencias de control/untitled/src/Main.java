public class Main {
    public static void main(String[] args) {
        int contador = 0;
        String estacion = "primavera";
        if(estacion=="primavera"){
            System.out.println("Es primavera");
        } else if (estacion=="Verano") {
            System.out.println("Es verano");
        }else{
            System.out.println("es otra estacion");
        }
        while(contador<10){

            System.out.println(contador);
            contador++;
        }
        contador = 0;
        do{
            System.out.println(contador);
            contador++;
        }while(contador < 1);

        int n =2;
        for(int i=0;i<n;i++){
            System.out.println(i+"for");
        }

        int valores[]=new int[5];
        for(int i=0;i< valores.length;i++){
            System.out.println(valores[i]);
        }

        String ab = "Ab";
        switch (ab){
            case "Ab": System.out.println("Ave");
                        break;
            default: System.out.println("nada");
        }

    }
}