public interface ConjuntoDinamicoIF {
    void adicionar(int elemento);
    boolean remover(int elemento);
    boolean contem(int elemento);
    int tamanho();
    boolean estaVazio();
}
