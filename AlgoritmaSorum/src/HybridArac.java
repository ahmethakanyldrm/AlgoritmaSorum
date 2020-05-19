
public class HybridArac extends Arac{
    
    public HybridArac(int speed, String model, String renk) {
        super(speed, model, renk);
        model="TOYOTA CHR";
        renk="KIRMIZI";
        speed=60;
        System.out.println("Hybrid Aracın Özellikleri");
    
    }

    @Override
    public void Calistir(){
            System.out.println("TOYOTA CHR çalışıyor...");
    }
    
    @Override
    public void Durdur(){
       System.out.println("TOYOTA CHR durduruldu...");
    }
     private void Hareketli(){
            System.out.println("TOYOTA CHR Hareket ediyor...");
         
     }
}
