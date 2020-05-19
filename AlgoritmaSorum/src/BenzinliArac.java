
public class BenzinliArac extends Arac{
    
    public BenzinliArac(int speed, String model, String renk) {
        super(speed, model, renk);
        model="HYUNDAI ACCENT";
        renk="GOLD";
         speed=200;
         System.out.println("Benzinli Aracın Özellikleri");
        System.out.println("Model:"+model+"\nRenk:"+renk+"\nHız:"+speed);
    }
     @Override
    public void Calistir(){
         System.out.println("HYUNDAI ACCENT çalışıyor...");
    }
      @Override
    public void Durdur(){
        System.out.println("HYUNDAI ACCENT durduruldu...");
    }
    private void Hareketli(){
         System.out.println("HYUNDAI ACCENT Hareket ediyor...");
         
     }
}
