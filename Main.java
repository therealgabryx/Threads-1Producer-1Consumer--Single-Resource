class Main {
  protected static int risorsa_comune;

  public static void main(String[] args) {
    Semaforo pieno = new Semaforo(0);
    Semaforo vuoto = new Semaforo(1);
    Produttore prod = new Produttore(pieno, vuoto);
    Consumatore cons = new Consumatore(pieno, vuoto);

    prod.start();
    cons.start();
  }
}