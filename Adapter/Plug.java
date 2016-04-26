//Adaptee class
public class Plug implements Outlet{
 
    public Volt voltage(){
        return new Volt(120);
    }
}
