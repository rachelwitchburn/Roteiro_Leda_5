public class ListaEncadeadaImpl implements ListaEncadeadaIF {
    private NodoListaEncadeada head;

    public ListaEncadeadaImpl() {
        head = null;
    }

    @Override
    public void inserirInicio(int valor) {
        NodoListaEncadeada novoNodo = new NodoListaEncadeada(valor);
        novoNodo.setProximo(head);
        head = novoNodo;
    }

    @Override
    public void inserirFim(int valor) {
        NodoListaEncadeada novoNodo = new NodoListaEncadeada(valor);
        if (head == null) {
            head = novoNodo;
        } else {
            NodoListaEncadeada current = head;
            while (current.getProximo() != null) {
                current = current.getProximo();
            }
            current.setProximo(novoNodo);
        }
    }

    @Override
    public boolean remover(int valor) {
        if (head == null) return false;
        if (head.getValor() == valor) {
            head = head.getProximo();
            return true;
        }
        NodoListaEncadeada current = head;
        while (current.getProximo() != null) {
            if (current.getProximo().getValor() == valor) {
                current.setProximo(current.getProximo().getProximo());
                return true;
            }
            current = current.getProximo();
        }
        return false;
    }

    @Override
    public int contar() {
        int count = 0;
        NodoListaEncadeada current = head;
        while (current != null) {
            count++;
            current = current.getProximo();
        }
        return count;
    }
}
