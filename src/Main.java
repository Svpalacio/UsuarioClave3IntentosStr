//Ejercicio 3: lo mismo que en ejercicio 2 pero agregar que la cantidad de intentos es 3
//si el usuario y la contraseña se ingresan 3 veces mal, entonces mostrar mensaje:cuenta bloqueada
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String usuarioCorrecto, claveCorrecta, usuario, clave;
        int intentosFallidos;
        boolean ingreso;
        ingreso = true;
        usuarioCorrecto = "sole";
        claveCorrecta = "123";
        intentosFallidos=0;
        while ((ingreso == true ) && (intentosFallidos<3)) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese usuario: ");
            usuario = sc.nextLine();
            System.out.println("Ingrese clave: ");
            clave = sc.nextLine();
            if (usuarioCorrecto.equals(usuario) && claveCorrecta.equals(clave)) {
                System.out.println("Ingreso al Sistema!!!");
                ingreso = false;
            }else{
                System.out.println("* * * Error usuario y clave * * *");
                intentosFallidos= intentosFallidos+1;
            }
        }
        if (intentosFallidos==3) {
            System.out.println("CUENTA BLOQUEADA!!!");
        }
    }
}
