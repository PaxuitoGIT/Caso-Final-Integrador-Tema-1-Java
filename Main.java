import Ejercicio1.Cronometro;
import Ejercicio1.ValoresMaximos;

public class Main {
    public static void main(String[] args) {
        Cronometro cronometro = new Cronometro(1.0);
        double segundosTierra = 1000.0;
        double factorConversionPlaneta = 2.0;

        double segundosPlaneta = cronometro.convertirTiempoPlaneta(segundosTierra,factorConversionPlaneta);
        cronometro.mostrarTiempo(segundosPlaneta);

        ValoresMaximos valoresMaximos = new ValoresMaximos();
        valoresMaximos.mostrarValoresMaximos();
    }
}
