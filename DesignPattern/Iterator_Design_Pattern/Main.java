package Iterator_Design_Pattern;

public class Main {

    public static void main(String[] args) {

        UserManagement userManagement = new UserManagement();
        userManagement.addUser(new User("Sujan", "User12"));
        userManagement.addUser(new User("Sophia", "User13"));
        userManagement.addUser(new User("Subin", "User14"));
        userManagement.addUser(new User("Binita", "User15"));
        userManagement.addUser(new User("Deoki", "User16"));

        MyIterator myIterator = userManagement.getIterator();
        while(myIterator.hasNext()){
            User user = (User)myIterator.next();
            System.out.println(user.getName());
           // System.out.println(user.getUserId());

        }
    }
}
