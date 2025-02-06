public class SmartTV {
    
    boolean ligada = true;
    int volume = 30;
    int canal = 1;
    
    /*
     * Aumenta o canal da TV em +1
     */

    public void escolherCanal(int Newcanal) {
        if (ligada) {
            canal = Newcanal;
        }
    }

    /*
     * Pode passar qualquer valor para o canal que será incrementado ou decrementado
     */

    public void mudarCanal(boolean paraCima) {
        if (ligada) {
            if (paraCima) {
                canal++;
            } else {
                canal--;
            }
        }
    }


    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        if (ligada) {
            volume++;
        }
    }

    public void diminuirVolume() {
        if (ligada) {
            volume--;
        }
    }
}