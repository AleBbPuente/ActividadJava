public class Promedio {

    public static void main(String[] args) {

        String nombre, apellido;
        nombre="Alejandra";
        apellido="Puente";
        System.out.println("Nombre del Alumno: " + nombre+" " +apellido);

        int[] calificacion = new int[]{80, 100, 100, 70, 100};
        int sum = 0;
        for (int i = 0; i < calificacion.length; i++)
            sum = sum + calificacion[i];
        double promedio = sum / calificacion.length;
        System.out.println("Promedio: " + promedio);


        if ( promedio >= 100) {
                System.out.println("Calificacion Final: A");
            } else if ( promedio >=90) {
                System.out.println("Calficacion Final: B");
            } else if ( promedio >=80) {
                System.out.println("Calificacion Final: C");
            } else if ( promedio >=70) {
                System.out.println("Calificacion Final: D");
            } else if ( promedio >=60) {
                System.out.println("Calificacion Final: E");
            } else if ( promedio >=50) {
                System.out.println("Calificacion Final: F");
            }
        }
    }

