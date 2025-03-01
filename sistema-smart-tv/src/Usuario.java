public class Usuario {
    
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        //Diminuindo o volume da Tv 
        
        smartTv.diminuirVolume ();
        smartTv.diminuirVolume ();
        smartTv.diminuirVolume ();
        smartTv.aumentarVolume ();

        System.out.println("Volume atual: " + smartTv.volume);
        
        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.mudarCanal(13);

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);


        //Ligando e desligando a Tv
        smartTv.ligar ();
        System.out.println("Novo Status -> Tv Ligada? " + smartTv.ligada);

        smartTv.desligar ();
        System.out.println("Novo Status -> Tv Ligada? " + smartTv.ligada + "\n");
    }
}
