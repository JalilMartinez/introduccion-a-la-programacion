public class Main {

    public static void main(String[] args) {
        int numeroIf = 1;
        if(numeroIf == 0){
            System.out.println("Es cero");
        } else if (numeroIf < 0) {
            System.out.println("Es negativo");
        } else {
            System.out.println("es positivo");
        }
        int numeroWhile = 0;
        while ( numeroWhile<3){
            numeroWhile ++;
            System.out.println(numeroWhile);
        }
        numeroWhile =2;
        do{
            numeroWhile ++;
            System.out.println(numeroWhile);
        }while ( numeroWhile<3);

        for(int numeroFor=0; numeroFor<3;numeroFor++){
            System.out.println(numeroFor);
        }
        String estacion = "Verano";
        switch (estacion){
            case "Primavera": System.out.println("Es primavera"); break;
            case "Verano": System.out.println("Es Verano"); break;
            case "Otoño": System.out.println("Es Otoño"); break;
            case "Invierno": System.out.println("Es Invierno"); break;
            default: System.out.println("No hay ninguna estacion");
        }
    }
}