
public class Arac {
    private int speed;
    private String model;
    private String renk;
    
    public  Arac(int s, String mod,String ren){
        speed=s;
        s=100;
        model=mod;
        mod="BİLGİ YOK";
        renk=ren;
        ren="BİLGİ YOK";
        
   }
    
    public void Calistir(){
        System.out.println(model+" çalışıyor...");
        
    }
     public void Durdur(){
                 
         System.out.println(model+" durduruldu...");
     }
     
     private void Hareketli(){
         System.out.println(model+" Hareket ediyor...");
         
     }
   
     public void bilgileriGoster(){
         System.out.println("model: "+model+"\nrenk: "+renk+"\nhız: "+speed);
     }
     public static void main(String[] args) {
        Arac a1=new HybridArac(60,"TOYOTA CHR","KIRMIZI");
      
        a1.bilgileriGoster();
        a1.Calistir();
        a1.Durdur();
        a1.Hareketli();
      System.out.println("************");
        
      Arac a2=new DizelArac(260,"MERCEDES E250 CDI" ,"SİYAH" );
       a2.model="MERCEDES E250 CDI";
       a2.renk="Siyah";
       a2.speed=260;
       a2.Calistir();
       a2.Durdur();
       a2.Hareketli();
      
      System.out.println("--------");
         
      Arac a3=new BenzinliArac(260,"MERCEDES E250 CDI" ,"SİYAH" );
       a3.model="HYUNDAI ACCENT";
       a3.renk="GOLD";
       a3.speed=200;
       a3.Calistir();
       a3.Durdur();
       a3.Hareketli();
       
    }
}
