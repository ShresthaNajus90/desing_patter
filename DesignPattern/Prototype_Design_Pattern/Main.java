package Prototype_Design_Pattern;

public class Main {

    public static void  main(String[] args) throws InterruptedException {

     System.out.println("Crating object using prototype");

        NetWorkConnection netWorkConnection = new NetWorkConnection();
        netWorkConnection.setIp("153.534.3453");
        netWorkConnection.LoadData();

        try{
            NetWorkConnection  netWorkConnection2 = (NetWorkConnection) netWorkConnection.clone();
            NetWorkConnection  netWorkConnection3 = (NetWorkConnection) netWorkConnection.clone();
            netWorkConnection.getDomins().remove(0);

            System.out.println(netWorkConnection);
            System.out.println(netWorkConnection2);
            System.out.println(netWorkConnection3);
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
