package Builder_Design_patter;

public class Mian {

    public static void main(String[] args){

        User user = new User.UserBuilder().setUserName("sujan")
                .setUserId("UserId:2343")
                .setEmail("sujan@Dev.com").build();

            System.out.println(user);

        User user1 = User.UserBuilder.builder()
                .setUserName("sujan")
                .setUserId("UserId:2343")
                .setEmail("sujan@Dev.com").build();
        System.out.println(user1);
    }

}
