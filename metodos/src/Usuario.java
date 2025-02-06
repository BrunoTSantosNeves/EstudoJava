public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTV = new SmartTV();

        /*
         * smartTV.ligada = true; smartTV.volume = 30; smartTV.canal = 1;
         */

        System.out.println("TV ligada: " + smartTV.ligada);
        System.out.println("Canal: " + smartTV.canal);
        System.out.println("Volume: " + smartTV.volume);


        

        smartTV.aumentarVolume();
        System.out.println("Aumentando o volume..." + smartTV.volume);
        smartTV.aumentarVolume();
        System.out.println("Aumentando o volume..." + smartTV.volume);
        smartTV.aumentarVolume();
        System.out.println("Aumentando o volume..." + smartTV.volume);

        smartTV.diminuirVolume();
        System.out.println("Diminuindo o volume..." + smartTV.volume);

        smartTV.ligar();
        System.out.println("TV ligada: " + smartTV.ligada);

       /*
       smartTV.desligar();
        System.out.println("TV ligada: " + smartTV.ligada);
       */ 

        smartTV.mudarCanal(true);
        System.out.println("Canal: " + smartTV.canal);
        smartTV.escolherCanal(5);
        System.out.println("Canal: " + smartTV.canal);
    }
    
}