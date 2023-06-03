package OperacionesSwitch;

public class Operaciones {
    public static void main(String args[]){
        int num_one = 5;
        int num_two = 3;
        int result = 0;
        int opcion = 3;
        // Estructura de control Switch - case

        switch (opcion){
            case 1:
                result = num_one + num_two;
                System.out.println("La suma es: " + result);
                break;
            case 2:
                result = num_one - num_two;
                System.out.println("La resta es: " + result);
                break;
            case  3:
                result = num_one * num_two;
                System.out.println("La multiplicacion es: " + result);
                break;
            case 4:
                result = num_one / num_two;
                System.out.println("La division es: " + result);
                break;
            default:
        }
    }
}
