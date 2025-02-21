public class Facebook extends Mensagem {
    @Override
    public void eviaMensagem(){
        ConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook");
        SalvaHistoricoMensagem();
    }

    @Override
    public void MensagemRecebida(){
        System.out.println("Mensagem recebida atraves do Facebook");
    }

}
