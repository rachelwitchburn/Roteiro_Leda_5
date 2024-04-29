public class MinhaFila implements FilaIF {
    private int[] fila;
    private int inicio, fim, tamanho, capacidade;

    public MinhaFila(int capacidade) {
        this.capacidade = capacidade;
        fila = new int[capacidade];
        inicio = 0;
        fim = 0;
        tamanho = 0;
    }

    public void enfileirar(int elemento) throws FilaCheiaException {
        if (tamanho == capacidade) throw new FilaCheiaException("Fila cheia");
        fila[fim] = elemento;
        fim = (fim + 1) % capacidade;
        tamanho++;
    }

    public int desenfileirar() throws FilaVaziaException {
        if (estaVazia()) throw new FilaVaziaException("Fila vazia");
        int elemento = fila[inicio];
        inicio = (inicio + 1) % capacidade;
        tamanho--;
        return elemento;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int tamanho() {
        return tamanho;
    }
}
