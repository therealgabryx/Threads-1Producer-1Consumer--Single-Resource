import java.util.Random;

class Consumatore extends Thread {
  Semaforo pieno;
  Semaforo vuoto;
  Random att = new Random();

  public Consumatore(Semaforo s1, Semaforo s2) {
    pieno = s1;
    vuoto = s2;
  }

  public void run() {
    int dato;
    int attesa;

    while (true) {
      attesa = att.nextInt(100) * 25;

      pieno.P();
        dato = Main.risorsa_comune;
        System.out.println("Consumatore: dato letto: " + dato);
      vuoto.V();

      try {
        Thread.sleep(attesa);
      } catch (Exception e) {}
    }
  }
}