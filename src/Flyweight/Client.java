package Flyweight;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException{
        NetworkDevice nb1,nb2,nb3,nb4,nb5,nb6,nb7;
        DeviceFactory df = new DeviceFactory();

        nb1 = df.getNetworkDevice("cisco");
        nb1.use();

        nb2 = df.getNetworkDevice("cisco");
        nb2.use();

        nb3 = df.getNetworkDevice("cisco");
        nb3.use();

        nb4 = df.getNetworkDevice("tp");
        nb4.use();

        nb5 = df.getNetworkDevice("tp");
        nb5.use();

        nb6 = df.copeDevice("cisco");
        nb6.use();

        nb7 = df.copeDevice("tp");
        nb7.use();

        System.out.println("Total Device:"+df.getTotalDevice());
        System.out.println("Total Terminal:"+df.getTotalTerminal());



    }

}
