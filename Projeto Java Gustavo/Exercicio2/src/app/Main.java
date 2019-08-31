
package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
    System.out.println("Informe a cor da sua Bike:");     
    Bicicleta minhaBike = new Bicicleta("Monaco", 1500);
    Scanner leia = new Scanner(System.in);
    String pintura = leia.next();
    minhaBike.setValor(1200);
    minhaBike.setPintura(pintura);
    minhaBike.setMontagem(150);
    
    
    System.out.println("----------------");
    System.out.println(minhaBike.getMarca());
    System.out.println(minhaBike.getPintura());
    System.out.println(minhaBike.getValor());
    System.out.println(minhaBike.getMontagem());
    System.out.println(minhaBike.getMontagem() + minhaBike.getValor());
    }
    
}
