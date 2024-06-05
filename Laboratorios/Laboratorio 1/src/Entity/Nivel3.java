package Entity;

public class Nivel3 extends Colaboradores{
    private int TelCorporativo;
    private String TarjetaDeCredito;

    public Nivel3(String nombre, String apellido, String cedula) {
        super(nombre, apellido, cedula);
    }

    public int getTelCorporativo() {
        return TelCorporativo;
    }

    public void setTelCorporativo(int telCorporativo) {
        TelCorporativo = telCorporativo;
    }

    public String getTarjetaDeCredito() {
        return TarjetaDeCredito;
    }

    public void setTarjetaDeCredito(String tarjetaDeCredito) {
        TarjetaDeCredito = tarjetaDeCredito;
    }

    @Override
    public double horasExtrasNivel3(double salario, int horasExtras){
        double horExtra;
        horExtra = salario + (horasExtras * 2);
        return horExtra;
    }

    public void imprimirNivel3(){
        System.out.println(
                "Información Colaborador de Nivel 3:" + "\n\n" +
                "Nombre: " + getNom() + "\n" +
                "Apellido: " + getape() + "\n" +
                "Cédula: " + getCedula() + "\n" +
                "Departamento: " + getDepartamento() + "\n" +
                "Edad: " + calcularEdad(getFechaDeNacimiento()) + "\n" +
                "Salario: " + calcularSalarioBase(getSalario(), getHorasTrabajadasDiariamente()) + "\n" +
                "Nivel Colaborador: " + getNivelColaborador() + "\n"+
                "Estatus: " + getEstatusEmpresa() + "\n" +
                "Horas Extras: " + horasExtrasNivel3(getSalario(), getHorasExtras()) + "\n" +
                "Numero de Extensión: " + getNumExtInterna() + "\n" +
                "Teléfono Corporativo: " + getTelCorporativo()  + "\n" +
                "Tarjeta de Crédito: " + getTarjetaDeCredito()
        );
    }
}
