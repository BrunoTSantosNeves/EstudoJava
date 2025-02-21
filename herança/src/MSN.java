public class MSN extends Mensagem{
    public void eviaMensagem(){
        ConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN");
        SalvaHistoricoMensagem();
    }

    public void MensagemRecebida(){
        System.out.println("Mensagem recebida atraves do MSN");
    }

}
