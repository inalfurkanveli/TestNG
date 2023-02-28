package utilities;

public class ResuableMethods {

    public  static  void bekle(int saniye){


        try {
            Thread.sleep(saniye*1000);
        }catch (InterruptedException e){

        }
    }
}
