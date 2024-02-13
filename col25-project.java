import java.util.*;
class Contact{
 private String name;
private String phoneNumber;
private String email; 

public Contact(String name,String phoneNumber,String email){
    this.name=name;
    this.phoneNumber=phoneNumber;
    this.email=email;
}
public String getName(){
    return name;
}
public String getphoneNumber(){
   return  phoneNumber;
}
public String getemail(){
    return email;
}
public void setphonenumber(String phoneNumber){
    this.phoneNumber=phoneNumber;
}
public void setEmail(String email){
    this.email=email;
}
}

class Phonebook{
  private  ArrayList<Contact> contacts;
    public Phonebook(){
        contacts=new ArrayList<>();
    }


    public void addcontact(Contact contact){
contacts.add(contact);
    }


    public Contact findContactbyName(String name){
for(Contact c:contacts){
if(c.getName().equalsIgnoreCase(name)){
return c;
}
}
return null;
    }
 

public boolean updateContact(String name,String phoneNumber,String email){
Contact c=findContactbyName(name);
if(c!=null){
    c.setphonenumber(phoneNumber);
    c.setEmail(email);
    return true;
}
  return false; 
}


public boolean deleteContact(String name){
    Contact c=findContactbyName(name);
if(c!=null){
    contacts.remove(c);
    return true;
}
return false;
}


public void displayAllContacts(){
    for(Contact c:contacts){
        System.out.println("Name :"+c.getName());       
         System.out.println("PhoneNumber :"+c.getphoneNumber());
        System.out.println("Email :"+c.getemail());
         System.out.println("-----------------------");


    }
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Phonebook phonebook=new Phonebook();


    while(true){//that means infinte time
System.out.println("phonebook menu");
System.out.println("1. Add Contact");
System.out.println("2. search Contact");
System.out.println("3. update Contact");
System.out.println("4. delete Contact");
System.out.println("5. dispaly All Contact");
System.out.println("6. exit");

 int choice=sc.nextInt();
 sc.nextLine();
 switch(choice){
    case 1:
    System.out.println("Enter Name:"); 
    String name=sc.nextLine();   
    System.out.println("Enter phonenumber :");
    String phonenumber=sc.nextLine();
    System.out.println("Enter email :");
    String  email=sc.nextLine();

    Contact c=new Contact(name,phonenumber,email);
    phonebook.addcontact(c);
    System.out.println("contact is added successfully");
    break;

    case 2:
    System.out.println("enter the search name");
    String name1=sc.nextLine();
    Contact c1=phonebook.findContactbyName(name1);
    if(c1!=null){
 System.out.println("Name :"+c1.getName());       
         System.out.println("PhoneNumber :"+c1.getphoneNumber());
        System.out.println("Email :"+c1.getemail());
    }
    else{
        System.out.println("contact not find");
    }
    break;
    
    case 3:
    System.out.println("enter name to update");
    String name2=sc.nextLine();
     System.out.println("Enter new phonenumber :");
    String phonenumber1=sc.nextLine();
    System.out.println("Enter new  email:");
    String  email1=sc.nextLine();

    boolean update=phonebook.updateContact(name2,phonenumber1,email1);
if(update==true){
    System.out.println("contact update successfully");
}
   else{
        System.out.println("contact not find");
   } 
    break;
    
    case 4:
    System.out.println("enter the name to delete");
    String name3=sc.nextLine();
    boolean deleted=phonebook.deleteContact(name3);
    if(deleted==true){
    System.out.println("contact delete successfully");
}
   else{
        System.out.println("contact not find");
   } 
    break;
    
    case 5:
    phonebook.displayAllContacts();
    break;
    
    case 6:
    System.out.println("exit phonebook");
    break;
}
}
}
}