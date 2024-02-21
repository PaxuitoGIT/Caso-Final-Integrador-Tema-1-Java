public class Cronometro {
    private final double factorConversion;

    public Cronometro(double factorConversion) {
        this.factorConversion = factorConversion;
    }

    public double convertirSegundos(double segundos) {
        return segundos * factorConversion;
    }

    public double convertirMinutos(double minutos) {
        return convertirSegundos(minutos * 60);
    }

    public double convertirHoras(double horas) {
        return convertirMinutos(horas * 24);
    }

    public double convertirDias(double dias) {
        return convertirHoras(dias * 24);
    }

    public double convertirTiempoPlaneta(double segundosTierra, double factorConversionPlaneta) {
        return segundosTierra * factorConversionPlaneta;
    }

    public double convertirAnios(double anios) {
        return convertirDias(anios * 365);
    }

    public void mostrarTiempo(double segundos) {
        double minutos = segundos / 60;
        double horas = minutos / 60;
        double dias = horas / 24;
        double anios = dias / 365;

        System.out.println("Segundos: " + segundos);
        System.out.println("Minutos: " + minutos);
        System.out.println("Horas: " + horas);
        System.out.print("Dias: " +dias);
        System.out.println("Años: " +anios);
    }
}
