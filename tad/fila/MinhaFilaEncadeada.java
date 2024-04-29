public class MinhaFilaEncadeada implements FilaIF {
    private No cabeca, cauda;
    private int tamanho;

    private class No {
        int elemento;
        No proximo;

        No(int elemento) {
            this.elemento = elemento;
            this.proximo = null;
        }
    }

    public MinhaFilaEncadeada() {
        cabeca = cauda = null;
        tamanho = 0;
    }

    public void enfileirar(int elemento) {
        No novoNo = new No(elemento);
        if (estaVazia()) {
            cabeca = cauda = novoNo;
        } else {
            cauda.proximo = novoNo;
            cauda = novoNo;
        }
        tamanho++;
    }

    public int desenfileirar() throws FilaVaziaException {
        if (estaVazia()) throw new FilaVaziaException("Fila vazia");
        int elemento = cabeca.elemento;
        cabeca = cabeca.proximo;
        if (cabeca == null) cauda = null;
        tamanho--;
        return elemento;
    }

    public boolean estaVazia() {
        return cabeca == null;
    }

    public int tamanho() {
        return tamanho;
    }
}
