public class IncrementoContador {
    private int contador = 0;

    public void incrementar(){
        for (int i = 0; i < 10000; i++) {
            contador++;
        }
    }

    public int getContador(){
        return contador;
    }

    public static void main(String[] args) {
        IncrementoContador t = new IncrementoContador();
        for (int i = 0; i < 1000; i++) {
            t.incrementar();
        }
        System.out.println(t.getContador());
    }
}
