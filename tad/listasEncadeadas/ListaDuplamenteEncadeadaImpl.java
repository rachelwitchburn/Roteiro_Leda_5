

public class ListaDuplamenteEncadeadaImpl implements ListaDuplamenteEncadeadaIF {
    private NodoListaDuplamenteEncadeada head;
    private NodoListaDuplamenteEncadeada tail;

    public ListaDuplamenteEncadeadaImpl() {
        head = null;
        tail = null;
    }

    @Override
    public void inserirInicio(int valor) {
        NodoListaDuplamenteEncadeada novoNodo = new NodoListaDuplamenteEncadeada(valor);
        if (head == null) {
            head = novoNodo;
            tail = novoNodo;
        } else {
            novoNodo.setProximo(head);
            head.setAnterior(novoNodo);
            head = novoNodo;
        }
    }

    @Override
    public void inserirFim(int valor) {
        NodoListaDuplamenteEncadeada novoNodo = new NodoListaDuplamenteEncadeada(valor);
        if (tail == null) {
            head = novoNodo;
            tail = novoNodo;
        } else {
            tail.setProximo(novoNodo);
            novoNodo.setAnterior(tail);
            tail = novoNodo;
        }
    }

    @Override
    public boolean remover(int valor) {
        if (head == null) return false;
        if (head.getValor() == valor) {
            head = head.getProximo();
            if (head != null) head.setAnterior(null);
            else tail = null;
            return true;
        }
        NodoListaDuplamenteEncadeada current = head;
        while (current != null) {
            if (current.getValor() == valor) {
                if (current.getProximo() != null) {
                    current.getProximo().setAnterior(current.getAnterior());
                } else {
                    tail = current.getAnterior();
                }
                if (current.getAnterior() != null) {
                    current.getAnterior().setProximo(current.getProximo());
                }
                return true;
            }
            current = current.getProximo();
        }
        return false;
    }

    @Override
    public int contar() {
        int count = 0;
        NodoListaDuplamenteEncadeada current = head;
        while (current != null) {
            count++;
            current = current.getProximo();
        }
        return
