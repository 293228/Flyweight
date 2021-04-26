package Flyweight;

import java.util.ArrayList;

public class DeviceFactory<device> implements Cloneable{

    public ArrayList devices = new ArrayList();
    private int totalTerminal = 0;

    public DeviceFactory() {
        NetworkDevice nb1 = new Switch("Cisco-WS-C2950-24");
        devices.add(nb1);
        NetworkDevice nb2 = new Hub("TP-LINK-HF8M");
        devices.add(nb2);
    }

    public NetworkDevice getNetworkDevice(String type){
        if ( type.equalsIgnoreCase("cisco")){
            totalTerminal++;
            return (NetworkDevice) devices.get(0);
        }
        else if(type.equalsIgnoreCase("tp")){
            totalTerminal++;
            return (NetworkDevice) devices.get(1);
        }
        else {
            return  null;
        }
    }

    public NetworkDevice copeDevice(String type) throws CloneNotSupportedException{
        if (type.equalsIgnoreCase("cisco")){
            NetworkDevice device = (NetworkDevice) devices.get(0);
            NetworkDevice copyDevice = device.clone();
            devices.add(copyDevice);
            return copyDevice;
        }
        else if (type.equalsIgnoreCase("tp")){
            NetworkDevice device = (NetworkDevice) devices.get(1);
            NetworkDevice copyDevice = device.clone();
            devices.add(copyDevice);
            return copyDevice;
        }
        else {
            return null;
        }
    }


    public int getTotalDevice(){
        return devices.size();
    }

    public int getTotalTerminal(){
        return totalTerminal;
    }


}
