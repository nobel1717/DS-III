package Entity;

public class Colaboradores {
    // Atributos
    private String Nom;
    private String ape;
    private String Cedula;
    private String Departamento;
    private int FechaDeNacimiento;
    private double Salario;
    private int HorasTrabajadasDiariamente;
    private int NivelColaborador;
    private String EstatusEmpresa;
    private int HorasExtras;
    private int NumExtInterna;

    // Constructores
    public Colaboradores(String Nom, String ape, String cedula, String departamento, int fechaDeNacimiento, double salario, int horasTrabajadasDiariamente, int nivelColaborador, String estatusEmpresa, int horasExtras, int numExtInterna) {
        Nom = Nom;
        ape = ape;
        Cedula = cedula;
        Departamento = departamento;
        FechaDeNacimiento = fechaDeNacimiento;
        Salario = salario;
        HorasTrabajadasDiariamente = horasTrabajadasDiariamente;
        NivelColaborador = nivelColaborador;
        EstatusEmpresa = estatusEmpresa;
        HorasExtras = horasExtras;
        NumExtInterna = numExtInterna;
    }

    public Colaboradores(String Nom, String ape, String cedula) {
        Nom = Nom;
        ape = ape;
        Cedula = cedula;
    }

    // Get y Set
    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        Nom = Nom;
    }

    public String getape() {
        return ape;
    }

    public void setape(String ape) {
        ape = ape;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String cedula) {
        Cedula = cedula;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String departamento) {
        Departamento = departamento;
    }

    public int getFechaDeNacimiento() {
        return FechaDeNacimiento;
    }

    public void setFechaDeNacimiento(int fechaDeNacimiento) {
        FechaDeNacimiento = fechaDeNacimiento;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }

    public int getHorasTrabajadasDiariamente() {
        return HorasTrabajadasDiariamente;
    }

    public void setHorasTrabajadasDiariamente(int horasTrabajadasDiariamente) {
        HorasTrabajadasDiariamente = horasTrabajadasDiariamente;
    }

    public int getNivelColaborador() {
        return NivelColaborador;
    }

    public void setNivelColaborador(int nivelColaborador) {
        NivelColaborador = nivelColaborador;
    }

    public String getEstatusEmpresa() {
        return EstatusEmpresa;
    }

    public void setEstatusEmpresa(String estatusEmpresa) {
        EstatusEmpresa = estatusEmpresa;
    }

    public int getHorasExtras() {
        return HorasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        HorasExtras = horasExtras;
    }

    public int getNumExtInterna() {
        return NumExtInterna;
    }

    public void setNumExtInterna(int numExtInterna) {
        NumExtInterna = numExtInterna;
    }

    // Métodos propios
    public double calcularSalarioBase(double salario, int horasTrabajadasDiariamente){
        double salarioBase;
        salarioBase = salario + (horasTrabajadasDiariamente * 30);
        return salarioBase;
    }

    public int calcularEdad(int fechaDeNacimiento){
        int edad;
        edad = 2023 - fechaDeNacimiento;
        return edad;
    }

    public double horasExtras(double salario, int horasExtras){
        double hExtras;
        hExtras = salario * horasExtras * 1.5;
        return hExtras;
    }

    public double horasExtrasNivel3(double salario, int horasExtras){
        double hExtras;
        hExtras = salario * horasExtras * 2;
        return hExtras;
    }
}
