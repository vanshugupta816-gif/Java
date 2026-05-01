
import java.awt.*;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    static void main(String[] args) {
        WeakHashMap<String , Image> imageCache = new WeakHashMap<>();
//        String key1 = new String("img1");
//        String key2 = new String("img2");
        imageCache.put(new String("img1"), new Image("Image 1"));
        imageCache.put(new String("img2"), new Image("Image 2"));
        System.out.println(imageCache);
//        key1 = null;
//        key2 = null;
        System.gc();
        simulateApplicationRunning();
        System.out.println("Cache after running (same entries may be cleared):" + imageCache);
    }

    private static void simulateApplicationRunning(){
         try{
             System.out.println("Simulating application running...");
             Thread.sleep(10000);
         } catch (InterruptedException e){
             e.printStackTrace();
         }
    }
}
class Image{
    private String name;

    public Image(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
