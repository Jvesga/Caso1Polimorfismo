package main;

import Polimorfismo.Animal;
import Polimorfismo.Serpiente;
import Polimorfismo.Vaca;

public class Main 
{
    public static void main(String[] args) 
    {
     Vaca daisy = new Vaca();
     Animal animal = new Vaca();
     Serpiente Serpiente = new Serpiente();
     
     System.out.println("daisy dice: " + daisy.hablar());
     System.out.println("animal dice: " + animal.hablar());
     System.out.println("Serpiente dice: " + Serpiente.hablar());

    }    
}
