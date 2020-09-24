import java.util.*;

public class AddressBook {

    ArrayList<BuddyInfo> buddyColl = new ArrayList<>();

    BuddyInfo buddy2 = new BuddyInfo("Mustafa", "Ottawa","613");
    BuddyInfo buddy3 = new BuddyInfo("Mohammed","Toronto","647");
    BuddyInfo buddy4 = new BuddyInfo("Michael","Scarborough","416");
    BuddyInfo buddy5 = new BuddyInfo("John","Mississauga","905");

    public AddressBook(){
        buddyColl.add(buddy2);
        buddyColl.add(buddy3);
        buddyColl.add(buddy4);
        buddyColl.add(buddy5);
    }

    public static void main(String[] args){
        System.out.println("Address Book");
    }

    public void addBuddy(BuddyInfo newBuddy){
        buddyColl.add(newBuddy);
    }

    public void removeBuddy(BuddyInfo newBuddy){
        buddyColl.remove(newBuddy);
    }
}



