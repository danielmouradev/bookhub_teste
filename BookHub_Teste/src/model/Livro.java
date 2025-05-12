package model;

import enums.Genero;

public class Livro {

    private Integer id;
    private String name;
    private String autor;
    private Genero genero;
    private Double preco;

    public Livro(){}

    public Livro(Integer id, String name, String autor, Genero genero, Double preco){
        this.id = id;
        this.name = name;
        this.autor = autor;
        this.genero = genero;
        this.preco = preco;
    }

    public String buscadorDeLivro(Livro livro){
        return null;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
