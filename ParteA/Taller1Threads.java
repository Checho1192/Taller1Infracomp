public class Taller1Threads extends Thread {

    private int valorInicial;
    private int lims;
    private long ms;

    public Taller1Threads(int valorInicial, int lims, long ms) {
        this.valorInicial = valorInicial;
        this.lims = lims;
        this.ms = ms;
    }

    public void run() {
        if (this.valorInicial == 1) {
            for (int i = 0; i <= lims; i++) {
                if (i % 2 == 0)
                    System.out.println(Integer.toString(i));
                try {
                    Thread.sleep(this.ms);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } else {
            for (int i = 0; i <= lims; i++) {
                if (i % 2 != 0)
                    System.out.println(Integer.toString(i));
                try {
                    Thread.sleep(this.ms);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

	/**
	 * Metodo main para ejecutar el programa en entrada estandar
	 * args[0]: Limite superior
	 * args[1]: Tiempo a dormir el thread 1 en ms
	 * args[2]: Tiempo a dormir el thread 2 en ms
	 * @param args Array with the arguments described above
	 */
    public static void main(String[] args) {
        int lims = Integer.parseInt(args[0]);
        long ms = Long.parseLong(args[1]);
        long ms2 = Long.parseLong(args[2]);
        Taller1Threads t = new Taller1Threads(1, lims, ms);
        Taller1Threads t2 = new Taller1Threads(2, lims, ms2);
        t.start();
        t2.start();
    }
}