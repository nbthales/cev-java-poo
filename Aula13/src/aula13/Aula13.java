package aula13;
public class Aula13 {
    public static void main(String[] args) {
        // Programa Principal
        /*Mamifero x = new Mamifero();
        Lobo y = new Lobo();
        Cachorro z = new Cachorro();
        x.emitirSom();
        y.emitirSom();
        z.emitirSom();*/
        
        Cachorro c = new Cachorro();
        c.reagir("Olá");
        c.reagir("Vai apanhar");
        c.reagir(11,45);
        c.reagir(21,00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);
        
    }
    
}
