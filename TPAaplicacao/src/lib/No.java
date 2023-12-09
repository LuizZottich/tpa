package lib;

public class No<T> {
    private T chave;
    private No<T> filho_esquerda;
    private No<T> filho_direita;

    public No(T conteudo) {
        this.chave = conteudo;
        this.filho_esquerda = this.filho_direita = null;
    }

    public No() {
        this.chave = null;
        this.filho_esquerda = this.filho_direita = null;
    }

    public T getChave() {
        return this.chave;
    }

    public void setChave(T chave) {
        this.chave = chave;
    }

    public No<T> getFilho_esquerda() {
        return this.filho_esquerda;
    }

    public void setFilho_esquerda(No<T> filho_esquerda) {
        this.filho_esquerda = filho_esquerda;
    }

    public No<T> getFilho_direita() {
        return this.filho_direita;
    }

    public void setFilho_direita(No<T> filho_direita) {
        this.filho_direita = filho_direita;
    }
}

