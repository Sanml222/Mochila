package co.edu.uniquindio.mochila.Clases;

public class Elemento {
    private String nombre;
    private int peso;
    private int beneficio;

    public Elemento(String nombre, int peso, int beneficio) {
        this.nombre = nombre;
        this.peso = peso;
        this.beneficio = beneficio;
    }

    public int getPeso() {
        return peso;
    }

    public int getBeneficio() {
        return beneficio;
    }

    @Override
    public String toString() {
        return nombre + " (Peso: " + peso + ", Beneficio: " + beneficio + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Elemento elemento = (Elemento) obj;
        return peso == elemento.peso && beneficio == elemento.beneficio && nombre.equals(elemento.nombre);
    }
}
