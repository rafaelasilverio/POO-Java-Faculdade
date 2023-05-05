package aula11.Heranca;

public class main {
    public static void main(String[] args) 
    {
        Homem homem = new Homem();
        homem.andar();
        Animal animal = new Animal();
        animal.andar();
        Mamifero mamifero = new Mamifero();
        mamifero.andar();
    }
}
