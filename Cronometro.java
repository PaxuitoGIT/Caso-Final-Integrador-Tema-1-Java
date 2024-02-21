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

    public double convertirAnios(double anios) {
        return convertirDias(anios * 365);
    }
}
