package Flyweight;

public interface NetworkDevice extends Cloneable{

    String getType();
    void use();
    NetworkDevice clone() throws CloneNotSupportedException;

}
