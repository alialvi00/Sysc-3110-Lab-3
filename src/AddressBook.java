import java.util.*;

public class AddressBook {

    ArrayList<BuddyInfo> buddyColl = new ArrayList<>();

    BuddyInfo buddy2 = new BuddyInfo("Mustafa", "Ottawa","613");
    BuddyInfo buddy3 = new BuddyInfo("Mohammed","Toronto","647");
    BuddyInfo buddy4 = new BuddyInfo("Michael","Scarborough","416");
    BuddyInfo buddy5 = new BuddyInfo("John","Mississauga","905");

    public static void main(String[] args){
        System.out.println("Address Book");
        AddressBook addy = new AddressBook();
        addy.addBuddy(addy.buddy2);
        addy.removeBuddy(addy.buddy2);
    }

    public void addBuddy(BuddyInfo newBuddy){
        buddyColl.add(newBuddy);
    }

    public void removeBuddy(BuddyInfo newBuddy){
        buddyColl.remove(newBuddy);
    }
}



