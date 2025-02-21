public class Mensagem {
    public void eviaMensagem(){
        ConectadoInternet();
        System.out.println("Enviando mensagem");
        SalvaHistoricoMensagem();
    }

    public void MensagemRecebida(){
        System.out.println("Mensagem recebida");
    }

    protected void ConectadoInternet(){
        System.out.println("Validado a conexão com a internet");
    }

    protected void SalvaHistoricoMensagem(){
        System.out.println("Salvado o histórico de mensagem");
    }
}