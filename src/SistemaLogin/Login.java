/*2. Realizar un programa que simule un inicio de sesión solicitando el
        nombre de usuario y la contraseña, para posteriormente comprarlos y
        mostrar un mensaje en pantalla que diga: inicio de sesión correcto /
        nombre de usuario o password incorrectos.*/

package SistemaLogin;

import java.util.Scanner;

public class Login {
    public static void main(String args[]){
        String usuario = "", password = "";
        Scanner entrada = new Scanner(System.in);

        System.out.println("Programa Login");

        System.out.print("Ingresa nombre de usuario: ");
        usuario = entrada.nextLine();

        System.out.print("Ingrese password: ");
        password = entrada.nextLine();

        if (usuario.equals("Luis") && password.equals("123456")){
            System.out.println("Ingreso de sesión exitoso !!");
        }else {
            System.out.println("Usuario o password incorrectos, intente nuevamente!");
        }
    }
}
