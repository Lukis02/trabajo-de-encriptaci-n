import java.util.Scanner;
public class cifrado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {

            System.out.println("Introduce un texto");
            String texto = sc.nextLine();
            System.out.println("Presione 1 para cifrar, o 2 para descifrar");
            Integer eleccion = sc.nextInt();
            switch (eleccion) {
                case 1:
                opscifrado.cifrar();
                    break;
                case 2:
                opscifrado.descifrar();
                    break;
                default:
                    System.out.println("Por favor introduce datos válidos");
                    break;
            }
        }
    }
}
