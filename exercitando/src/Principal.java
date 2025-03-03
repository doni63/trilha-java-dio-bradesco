public class Principal {
    public static void main(String[] args) throws Exception {
        

        SmartTv tv = new SmartTv();
        tv.setLigada(false);
        tv.setVolume(10);
        tv.setCanal(5);

      
       /* tv.aumentarVolume();
       System.out.println("Volume aumentou para " + tv.getVolume());
       tv.diminuirVolume();
       System.out.println("Volume diminuiu para " + tv.getVolume());
       tv.aumentarCanal();
       System.out.println("Canal aumentou para " + tv.getCanal());
       tv.diminuirCanal();
       System.out.println("Canal diminuiu para " + tv.getCanal());
       */

       tv.ligarTv();
       //tv.desligarTv();
       
       tv.mudarCanal(38);

    }
}
