import java.util.*;

public class AddressBook {

    ArrayList<BuddyInfo> buddyColl = new ArrayList<>();

    BuddyInfo buddy2 = new BuddyInfo("Mustafa");
    BuddyInfo buddy3 = new BuddyInfo("Mohammed");
    BuddyInfo buddy4 = new BuddyInfo("Michael");
    BuddyInfo buddy5 = new BuddyInfo("John");

    public AddressBook(){
        buddyColl.add(buddy2);
        buddyColl.add(buddy3);
        buddyColl.add(buddy4);
        buddyColl.add(buddy5);
    }

    public static void main(String[] args){
        System.out.println("Address Book");
    }

    public void addBuddy(String name){
        BuddyInfo newBuddy = new BuddyInfo(name);
        buddyColl.add(newBuddy);
    }

    public void removeBuddy(String name){
        buddyColl.removeIf(newBuddy -> newBuddy.getName().equals(name));
    }
}



