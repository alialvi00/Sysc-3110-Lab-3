import java.util.*;

public class AddressBook {

    ArrayList<BuddyInfo> buddyColl;

    public AddressBook(){
        buddyColl = new ArrayList<>();
    }

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Ali","Carleton",613);
        AddressBook addy = new AddressBook();
        addy.addBuddy(buddy);
        addy.removeBuddy(0);
    }

    public void addBuddy(BuddyInfo newBuddy){
        if(newBuddy != null)
            buddyColl.add(newBuddy);
    }

    public BuddyInfo removeBuddy(int index){
        if(index >= 0 && index < buddyColl.size()){
            return buddyColl.remove(index);
        }
        return null;
    }
}



