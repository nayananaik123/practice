package javainonevedio.objectcourse;
import java.io.InputStream;
import java.sql.SQLOutput;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;


class Locker{
    private String password;
    private boolean lockedOrNot=true;
    private List<String> lockerItems=new ArrayList<>();

    public boolean isLockedOrNot(){
        return this.lockedOrNot;
    }
    public boolean lock(){
        System.out.println("Locked successfully");
        return this.lockedOrNot=true;
    }
    public boolean unlock(){
        System.out.println("Enter the password to Unlock");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++) {
            String password = sc.next();/* here next is in camel letter so its method and sc.
                                         which helps to take the  input from the console and store it in the password*/

            if (this.password != null && password.equals(this.password)) {
                 this.lockedOrNot = false;
                 return true;
            }
            System.out.println("password is wrong ..try again!!");
        }
        System.out.println("unsuccessful attempts");
        return false;
    }

    public void getLockerItems(){
        if(this.lockedOrNot) {
            boolean isUnlocked=unlock();
            if(!isUnlocked){
                return;            }
        }
        System.out.println(lockerItems);
        lock();
    }
    public boolean addItem(String item){
        if(this.lockedOrNot){
            System.out.println("Locker is locked ,unlock first to add "+item);
            if(!unlock()){
                return false;
            }
        }
        boolean addedOrNot=lockerItems.add(item);
        lock();
        return addedOrNot;
    }
    public boolean addItem(String... items) {
        if (this.lockedOrNot) {
            System.out.println("Locker is locked ,unlock first to add " +Arrays.toString(items));
            if (!unlock()) {
                return false;
            }
        }
        for(String item :items) {
            lockerItems.add(item);
        }
        lock();
        return true;
    }
    public void setPassword(String password){

        if(this.password==null){
            this.password=password;
        }

    }
}

public class Home {
    public String name;
    private int noOfRooms;
    public int noOfHall;
    List<String> furnitureList=new ArrayList<>();

    boolean isLocked=true;

    private Locker locker;

    public Home(String name,int noOfRooms,int noOfHall,List<String> furnitureList,Locker locker){
        /*how do you differentiate constructor and method?
        constrcutor starts with Capital letter*/
        this.name=name;
        this.noOfRooms=noOfRooms;
        this.noOfHall=noOfHall;
        this.furnitureList=furnitureList;
        this.locker=locker;
    }
     public boolean lock(){
        return this.isLocked=true;
     }
     public boolean unlock(){
        return this.isLocked=false;
     }
     public boolean isLockedOrNot(){
        return this.isLocked;
    }
    public Locker getLocker(){
        if(this.isLocked){
            System.out.println("Home is Locked");
            return null;
        }
        return this.locker;
    }
}
