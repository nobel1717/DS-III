package ClasePrincipal;

import Entity.Nivel1;
import Entity.Nivel2;
import Entity.Nivel3;

public class Main {
    public static void main(String[] args) {

        // Colaborador Nivel 1
        Nivel1 nivel1 = new Nivel1("Victor", "Gonzalez", "4-304-1003", 85);
        nivel1.setDepartamento("Departamento De ventas");
        nivel1.setFechaDeNacimiento(2005);
        nivel1.setSalario(750.30);
        nivel1.setHorasTrabajadasDiariamente(7);
        nivel1.setNivelColaborador(1);
        nivel1.setEstatusEmpresa("Empleado");
        nivel1.setHorasExtras(8);
        nivel1.setNumExtInterna(92);
        nivel1.setVentasRealizadas(76);
        System.out.println("\n*** Nivel 1 ***");
        nivel1.imprimirNivel1();
        System.out.println("Bono de Ventas: " + nivel1.bonoVentas(nivel1.getVentasRealizadas()));

        // Colaborador Nivel 2
        Nivel2 nivel2 = new Nivel2("Julio", "Varela","8-1165-531", "Departamento de Gerencia", 1992, 930.50, 8, 2, "Subgerente", 10, 200);
        System.out.println("\n*** Nivel 2 ***");
        nivel2.imprimirNivel2();
        System.out.println("Días Vacaciones: " + nivel2.vacaExtraor(7));

        // Colaborador Nivel 3
        Nivel3 nivel3 = new Nivel3("Carlos", "Melgar","8-1094-744");
        nivel3.setDepartamento("Departamento de Gerencia");
        nivel3.setFechaDeNacimiento(1990);
        nivel3.setSalario(1500.00);
        nivel3.setHorasTrabajadasDiariamente(6);
        nivel3.setNivelColaborador(3);
        nivel3.setEstatusEmpresa("Gerente");
        nivel3.setHorasExtras(4);
        nivel3.setNumExtInterna(300);
        nivel3.setTelCorporativo(2530307);
        nivel3.setTarjetaDeCredito("5463-4328-6273-9352");
        System.out.println("\n*** Nivel 3 ***");
        nivel3.imprimirNivel3();

    }
}
