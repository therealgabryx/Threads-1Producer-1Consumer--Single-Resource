import java.util.Random;

class Produttore extends Thread {
  Semaforo pieno;
  Semaforo vuoto;
  Random att = new Random();

  public Produttore(Semaforo s1, Semaforo s2) {
    pieno = s1;
    vuoto = s2;
  }

  public void run() {
    int attesa;
    int k = 0;

    while (true) {
      attesa = att.nextInt(100) * 25;

      vuoto.P();
        Main.risorsa_comune = k;
        System.out.println("Produttore: dato scritto: " + k);
        k++;
      pieno.V();

      try {
        Thread.sleep(attesa);
      } catch (Exception e) {}
    }
  }
}