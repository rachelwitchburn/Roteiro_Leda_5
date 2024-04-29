public class MinhaPilha implements PilhaIF {
    private int[] elementos;
    private int topo;
    private final int capacidade;

    public MinhaPilha(int capacidade) {
        this.capacidade = capacidade;
        elementos = new int[capacidade];
        topo = -1;
    }

    @Override
    public void empilhar(int elemento) throws PilhaCheiaException {
        if (estaCheia()) {
            throw new PilhaCheiaException("Pilha está cheia");
        }
        elementos[++topo] = elemento;
    }

    @Override
    public int desempilhar() throws PilhaVaziaException {
        if (estaVazia()) {
            throw new PilhaVaziaException("Pilha está vazia");
        }
        return elementos[topo--];
    }

    @Override
    public int topo() throws PilhaVaziaException {
        if (estaVazia()) {
            throw new PilhaVaziaException("Pilha está vazia");
        }
        return elementos[topo];
    }

    @Override
    public boolean estaVazia() {
        return topo == -1;
    }

    @Override
    public boolean estaCheia() {
        return topo == capacidade - 1;
    }
}
