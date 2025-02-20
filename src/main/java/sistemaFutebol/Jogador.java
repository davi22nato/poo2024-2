package sistemaFutebol;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private String nome;
    private int idade;
    private String posicao;
    private int numeroCamisa;
    private int codigoJogador;

    public Jogador(String nome, int idade, String posicao, int numeroCamisa, int codigoJogador) {
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
        this.numeroCamisa = numeroCamisa;
        this.codigoJogador = codigoJogador;
    }

    public int getCodigoJogador() {
        return codigoJogador;
    }

    public void setCodigoJogador(int codigoJogador) {
        this.codigoJogador = codigoJogador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", posicao='" + posicao + '\'' +
                ", numeroCamisa=" + numeroCamisa + " codigo" +
                " do jogador"+ codigoJogador ;
    }
}

