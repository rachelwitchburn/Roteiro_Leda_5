public interface ListaDuplamenteEncadeadaIF {
    void inserirInicio(int valor);
    void inserirFim(int valor);
    boolean remover(int valor);
    int contar();
    boolean estaVazia();
}
