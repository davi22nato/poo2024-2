package sistemaFutebol;

public interface SistemaFutebol {
    public void cadastraJogador(int codigoJogador, String nome)
            throws JogadorExistenteException;
    public Jogador pesquisaJogador(int codigoJogador)
            throws JogadorInexsitenteExcepiton;
    public void removerJogador(int codigoJogador)
            throws JogadorInexistenteException;
    public void atualizarDadosJogador()
    // atualizar dados, posição e camisa
    // pesquisar jogador por time
    //
}
