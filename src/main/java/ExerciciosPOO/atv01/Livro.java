package ExerciciosPOO.atv01;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int paginas;

    public Livro(String titulo, String autor, int anoPublicacao, int paginas){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String toString(){
        return "Livro " + this.titulo + "do autor "+ this.autor +"publicado em "+ this.anoPublicacao+ "tem"+ this.paginas+ " páginas";
    }


}
