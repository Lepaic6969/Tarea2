import java.util.Scanner;

public class Funciones {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Por favor ingrese el precio del producto sin IVA.");
        double precio=Integer.parseInt(sc.nextLine());
        double precioConIva=incluirIva(precio);
        System.out.println("El valor del producto con IVA es de: $"+precioConIva);

    }
    public static double incluirIva(double precio){
        return precio*1.21; //Se tiene en cuenta el IVA de España que es del 21%.
    }
}
