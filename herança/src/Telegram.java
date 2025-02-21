public class Telegram  extends Mensagem{
    public void eviaMensagem(){
        ConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
        SalvaHistoricoMensagem();
    }

    public void MensagemRecebida(){
        System.out.println("Mensagem recebida atraves do telegram");
    }

}
