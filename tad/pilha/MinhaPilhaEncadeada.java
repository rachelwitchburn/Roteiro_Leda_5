public class MinhaPilhaEncadeada implements PilhaIF {
    private Nodo topo;

    private class Nodo {
        int elemento;
        Nodo proximo;

        Nodo(int elemento) {
            this.elemento = elemento;
            this.proximo = null;
        }
    }

    public MinhaPilhaEncadeada() {
        topo = null;
    }

    @Override
    public void empilhar(int elemento) {
        Nodo novoNodo = new Nodo(elemento);
        novoNodo.proximo = topo;
        topo = novoNodo;
    }

    @Override
    public int desempilhar() throws PilhaVaziaException {
        if (estaVazia()) {
            throw new PilhaVaziaException("Pilha está vazia");
        }
        int elemento = topo.elemento;
        topo = topo.proximo;
        return elemento;
    }

    @Override
    public int topo() throws PilhaVaziaException {
        if (estaVazia()) {
            throw new PilhaVaziaException("Pilha está vazia");
        }
        return topo.elemento;
    }

    @Override
    public boolean estaVazia() {
        return topo == null;
    }

    @Override
    public boolean estaCheia() {
        return false;
    }
}
