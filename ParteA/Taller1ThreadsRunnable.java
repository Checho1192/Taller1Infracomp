public class Taller1ThreadsRunnable implements Runnable {

    private int valorInicial;
    private int lims;
    private long ms;

    public Taller1ThreadsRunnable(int valorInicial, int lims, long ms) {
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

    public static void main(String[] args) {
        int lims = Integer.parseInt(args[0]);
        long ms = Long.parseLong(args[1]);
        long ms2 = Long.parseLong(args[2]);
        Thread t = new Thread(new Taller1ThreadsRunnable(1,lims,ms));
        Thread t2 = new Thread(new Taller1ThreadsRunnable(2,lims,ms2));
        t.start();
        t2.start();
    }
}
