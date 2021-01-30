public class IncrementoContadorThreads extends Thread {

	private static int contador = 0;

	public void run() {
		for (int i = 0; i < 10000; i++) {
			contador++;
		}
	}

	public static void main(String[] args) {
		IncrementoContadorThreads[] t = new IncrementoContadorThreads[1000];
		for (int i = 0; i < t.length; i++) {
			t[i] = new IncrementoContadorThreads();
			t[i].start();
		}

		System.out.println(contador);
	}

}