public class MobilePhoneMain {
    public static void main(String[] args) {
     MobilePhone mobilePhone=new MobilePhone("554");
     Contact contact1= Contact.createContact("göksu","534");
     Contact contact2= Contact.createContact("cansu","544");
     mobilePhone.addNewContact(contact1);
     mobilePhone.addNewContact(contact2);
     System.out.println(mobilePhone.queryContact("tolga"));
     Contact contact3= Contact.createContact("göksu", "555");
     mobilePhone.updateContact(contact3,contact1);
     mobilePhone.printContact();
     mobilePhone.removeContact(contact2);
     mobilePhone.printContact();
    }
}
