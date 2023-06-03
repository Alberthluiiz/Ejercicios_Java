package CicloDoWhile;

public class CicloDoWhile {
    public static void main(String args []){
        int i = 2000;

        do {
            System.out.print(i + ", ");
            i-= 200;
        }while (i >= 0);
    }
}
