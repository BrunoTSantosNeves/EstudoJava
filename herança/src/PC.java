public class PC {
    public static void main(String[] args) {
        Facebook  facebook = new Facebook();
        MSN msn = new MSN();
        Telegram telegram = new Telegram();

        // Chamando métodos das classes derivadas
        facebook.eviaMensagem();
        facebook.MensagemRecebida();

        msn.eviaMensagem();
        msn.MensagemRecebida();

        telegram.eviaMensagem();
        telegram.MensagemRecebida();
    }
}
