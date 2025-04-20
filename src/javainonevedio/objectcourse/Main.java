package javainonevedio.objectcourse;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> furnitureList=new ArrayList<>();
        furnitureList.add("Chair");
        furnitureList.add("Sofa");
        furnitureList.add("bed");
        furnitureList.add("cupboard");

        Locker locker=new Locker();
        locker.setPassword("A123");
        Home home = new Home("Nayana", 5, 1,furnitureList, locker);
        home.unlock();
        Locker inhome=home.getLocker();
        if(inhome!=null) {
            
            inhome.addItem("money","diamond","platinum","chain");
            inhome.getLockerItems();
        }

    }
}
