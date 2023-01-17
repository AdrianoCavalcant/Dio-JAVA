public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual : " + smartTv.volume);


        System.out.println("Tv Ligada ? " + smartTv.ligada);
        System.out.println("Canal atual " + smartTv.canal);
        System.out.println("Volume do canal " + smartTv.volume);

        smartTv.mudarCanal(10);
        System.out.println("Canal atual ? " + smartTv.canal);
    

        smartTv.ligar ();
        System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> TV Desligada ? " + smartTv.ligada);

    }






}

