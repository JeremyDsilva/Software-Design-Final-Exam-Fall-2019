import lala.LaLa;
import noonoo.NooNoo;
import po.Po;

public class App {

    public static void main(String[] args) {
        
        int numOfLaLa = 3;
        int numOfPo = 2;
        
        NooNoo nooNoo = new NooNoo();   
        
        for(int i = 0; i < numOfLaLa; ++i) {
            nooNoo.addObserver(new LaLa());
        }
        
        for(int i = 0; i < numOfPo; ++i) {
            nooNoo.addObserver(new Po());
        }       
        
        System.out.println("---------------------------------------------------");
        
        new Thread(nooNoo).start();
    }

}
