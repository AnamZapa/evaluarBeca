import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String nombreCompleto;
        int puntosExtra, asistencia;
        double primeraNota, segundaNota, tercertaNota, promedioGeneral, sumaNotas, notaFinal;
        System.out.println("Por favor ingrese el nombre del alumno: ");
        nombreCompleto = sc.nextLine();
        System.out.println("Por favor ingrese la nota de Lógica de programación: ");
        primeraNota = sc.nextDouble();
        System.out.println("Por favor ingrese la nota de Introducción a la programación: ");
        segundaNota = sc.nextDouble();
        System.out.println("Por favor ingrese la nota de Metodologías Ágiles para la programación: ");
        tercertaNota = sc.nextDouble();
        System.out.println("Por favor ingrese la cantidad de asistencias que obtuvo el alumno: ");
        asistencia = sc.nextInt();
        sumaNotas = (primeraNota+segundaNota+tercertaNota);
        System.out.println("La suma de las notas del alumno es: "+sumaNotas);
        promedioGeneral = (sumaNotas/3);
        System.out.println("El promedio del alumno es de: "+promedioGeneral);
        puntosExtra = (asistencia/5);
        System.out.println("Los puntos extra por asistencia es de: "+puntosExtra);
        notaFinal = (promedioGeneral+puntosExtra);
        System.out.println("La nota final para el alumno: "+nombreCompleto+" con puntos extras, es de: "+notaFinal);
        if (notaFinal >= 4.5) {
            System.out.println("El alumno: "+nombreCompleto+" es elegible para la beca");
        } else {
            System.out.println("El alumno: "+nombreCompleto+" NO es elegible para la beca");
        }
    }
}
