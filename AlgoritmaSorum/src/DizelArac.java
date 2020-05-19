
public class DizelArac extends Arac{
    
    public DizelArac(int speed, String model, String renk) {
        super(speed, model, renk);
        model="MERCEDES E250 CDI";
        renk="SİYAH";
        speed=260;
         System.out.println("Dizel Aracın Özellikleri");
        System.out.println("Model:"+model+"\nRenk:"+renk+"\nHız:"+speed);
    }
    @Override
    public void Calistir(){
           System.out.println("MERCEDES E250 CDI çalışıyor...");
    }
      @Override
    public void Durdur(){
     System.out.println(" MERCEDES E250 CDI durduruldu...");
    }
    private void Hareketli(){
         
          System.out.println(" MERCEDES E250 CDI Hareket ediyor...");
     }
}
