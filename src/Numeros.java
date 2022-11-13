
import java.util.Scanner;

public class Numeros {

    Scanner sc = new Scanner(System.in);
    int ceros = 0, positivos = 0, negativos = 0;

    public void comprobar() {
        for (int i = 0; i < 10; i++) {
            System.out.println("numero: ");
            int numero = sc.nextInt();
            if (numero == 0) {
                ceros++;
            }
            else if (numero > 0) {
                positivos++;
            }
            else negativos++;
        }
        System.out.println("ceros: " + ceros + "\npositivos: " + positivos + "\nnegativos: " + negativos);
    }
}
