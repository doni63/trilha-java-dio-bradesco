public class SmartTv {
    private int canal;
    private int volume;
    private boolean ligada;

    public SmartTv(int canal, int volume, boolean ligada) {
        this.canal = canal;
        this.volume = volume;
        this.ligada = ligada;
    }

    public SmartTv() {

    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
    
    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void mudarCanal(int canal) {
        this.canal = canal;
        
        System.out.println("Canal atual: " + canal);
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }

    public void ligarTv() {
        if (ligada == false) {
            ligada = true;
        } else if (ligada == true) {
            ligada = true;
        }
        System.out.println("Tv ligada!");
    }

    public void desligarTv() {
        if (ligada ) {
            ligada = false;
        } else if (!ligada) {
            ligada = false;
        }
        System.out.println("Tv desligada!");
    }

}
