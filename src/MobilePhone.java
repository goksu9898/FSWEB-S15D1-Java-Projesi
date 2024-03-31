import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts = new ArrayList<>();

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
    }
    public Boolean addNewContact(Contact contact) {
        if (!myContacts.contains(contact)) {
            myContacts.add(contact);
            return true;
        } else {
            return false;
        }
    }

    public boolean updateContact(Contact newContact, Contact oldContact) {
        if (myContacts.contains(oldContact)) {
            int index = myContacts.indexOf(oldContact);
            myContacts.set(index, newContact);
            return true;
        } else return false;
    }

    public boolean removeContact(Contact contact) {
        if (findContact(contact) != -1) {
            myContacts.remove(contact);
            return true;
        } else {
            return false;
        }
    }

    public int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    public int findContact(String contactName) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String contactName) {
        int index = findContact(contactName);
        if(index == -1) {
            return null;
        }
        return myContacts.get(index);
    }

    public void printContact() {
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println(i + 1 + ". " + myContacts.get(i).getName() + "-> " + myContacts.get(i).getPhoneNumber());
        }

    }

}
