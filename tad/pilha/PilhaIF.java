public interface PilhaIF {
    void empilhar(int elemento) throws PilhaCheiaException;
    int desempilhar() throws PilhaVaziaException;
    int topo() throws PilhaVaziaException;
    boolean estaVazia();
    boolean estaCheia();
}
