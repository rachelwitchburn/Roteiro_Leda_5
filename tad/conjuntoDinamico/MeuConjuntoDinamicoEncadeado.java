public class MeuConjuntoDinamicoEncadeado implements ConjuntoDinamicoIF {
    private No cabeca;
    private int tamanho;

    private class No {
        int elemento;
        No proximo;

        No(int elemento) {
            this.elemento = elemento;
            this.proximo = null;
        }
    }

    public MeuConjuntoDinamicoEncadeado() {
        cabeca = null;
        tamanho = 0;
    }

    public void adicionar(int elemento) {
        if (!contem(elemento)) {
            No novoNo = new No(elemento);
            novoNo.proximo = cabeca;
            cabeca = novoNo;
            tamanho++;
        }
    }

    public boolean remover(int elemento) {
        No atual = cabeca;
        No anterior = null;
        while (atual != null) {
            if (atual.elemento == elemento) {
                if (anterior == null) {
                    cabeca = atual.proximo;
                } else {
                    anterior.proximo = atual.proximo;
                }
                tamanho--;
                return true;
            }
            anterior = atual;
            atual = atual.proximo;
        }
        return false;
    }

    public boolean contem(int elemento) {
        No atual = cabeca;
        while (atual != null) {
            if (atual.elemento == elemento) {
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }

    public int tamanho() {
        return tamanho;
    }

    public boolean estaVazio() {
        return tamanho == 0;
    }
}
