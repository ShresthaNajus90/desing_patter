package Observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main  {

    public static void main(String[] args) throws IOException {

        YoutubeChannel channel = new YoutubeChannel();
        Observer sujan = new Subscriber("sujan");
        Observer subin = new Subscriber("subin");
        channel.subscribe(sujan);
        channel.subscribe(subin);
        channel.notifyChanges(" Learn design pattern");

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        while (true){
            System.out.println("Press 1 for upload Video");
            System.out.println("Press 2 New Subscriber");
            System.out.println("Press 3 for Exit");

            int c = Integer.parseInt(br.readLine());
            if(c==1){
                //upload Video
                System.out.println("Enter New Vidoes");
                String vidoeTitle = br.readLine();
                channel.notifyChanges(vidoeTitle);
            } else
            if(c==2){
                //New Subscriber
                System.out.println("Enter Subscriber name");
                String name = br.readLine();
               Subscriber subscriber = new Subscriber(name);
               channel.subscribe(subscriber);
                break;
            }else
            if(c==3){
                //Exit
                System.out.println("Thakn you for using this app !!");
            }else {
                // wrong input2

                System.out.println("Wrong Input");
            }
        }
    }
}
