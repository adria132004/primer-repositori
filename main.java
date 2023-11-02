public class main () {
    public static void main (String[]arg){
        System.out.println(suma(6,4));
        System.out.println(resta(6,4));
    }

    public static int resta (int a, int b){
        int operacio = a-b;
        return operacio;
    }

    public static int suma (int a, int b){
        int operacio = a+b;
        return operacio;
    }
}

