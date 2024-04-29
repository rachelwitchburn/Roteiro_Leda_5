public interface FilaIF {
    void enfileirar(int elemento) throws FilaCheiaException;
    int desenfileirar() throws FilaVaziaException;
    boolean estaVazia();
    int tamanho();
}
