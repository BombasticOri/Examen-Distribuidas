package pregunta3;

import java.util.Random;

public class Utilidades {

	static int numAzar(int n) {
        Random randomNumber = new Random();
        return randomNumber.nextInt(n);
    }

	static void esperarTiempoAzar(int i) {
        try {
            Random randomNumber = new Random();
            int r = i/1000;
            randomNumber.nextInt(i);
            r = i * 1000;
            Thread.sleep(i);
        } catch (Exception e) {

        }
	}
}
