package caixa.generica;

public class Generica <T>  {
    private T objeto;

    public Generica(T objeto) {
        this.objeto = objeto;
    }

    public T getObjeto() {
        return objeto;
    }

    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }
}
