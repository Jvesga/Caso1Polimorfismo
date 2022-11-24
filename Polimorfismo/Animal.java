package Polimorfismo;

public class Animal 
{
    //Atributos
    private int peso=0;
    
    //Metodo
    public void setPeso(int peso) 
    {
        this.peso=peso;   
    }

    public int getPeso() 
    {
    return peso;
    }

    public String hablar()
    {
        return "Los animales no hablan mk";
    }
}
