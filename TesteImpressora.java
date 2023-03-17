public class TesteImpressora {
    public static void main (String [] args) {
    Impressora mostrar = new Impressora();
    mostrar.exibir(1.2f);
    mostrar.exibir(1.2f, 2.3f);
    mostrar.exibir(3.4f, "3.4");
    mostrar.exibir( "5.8", 1.1f);
    mostrar.exibir("7.8", "3.4", "5.6");
    mostrar.exibir(1, 2, "2");
    }
}