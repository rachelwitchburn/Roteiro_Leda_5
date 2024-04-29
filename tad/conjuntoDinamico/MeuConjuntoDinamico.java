public class MeuConjuntoDinamico implements ConjuntoDinamicoIF {
    private int[] elementos;
    private int tamanho;

    public MeuConjuntoDinamico() {
        elementos = new int[10];
        tamanho = 0;
    }

    public void adicionar(int elemento) {
        if (!contem(elemento)) {
            if (tamanho == elementos.length) {
                int[] novoArray = new int[elementos.length * 2];
                System.arraycopy(elementos, 0, novoArray, 0, elementos.length);
                elementos = novoArray;
            }
            elementos[tamanho++] = elemento;
        }
    }

    public boolean remover(int elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i] == elemento) {
                elementos[i] = elementos[--tamanho];
                return true;
            }
        }
        return false;
    }

    public boolean contem(int elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i] == elemento) {
                return true;
            }
        }
        return false;
    }

    public int tamanho() {
        return tamanho;
    }

    public boolean estaVazio() {
        return tamanho == 0;
    }
}
