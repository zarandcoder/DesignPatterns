package website.zaripov.factorymethod;

public class ComputerFactory {
    
    //Dies ist die Fabrikmethode
    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        if("PC".equalsIgnoreCase(type)) {
            return new PC(ram, hdd, cpu);
        } else if("Server".equalsIgnoreCase(type)) {
            return new Server(ram, hdd, cpu);
        }
        return null;
    }
    
    public static void main(String[] args) {
        
        Computer pc = ComputerFactory.getComputer("PC", "100GB", "100TB", "Intel Core I20");
        Computer server = ComputerFactory.getComputer("Server", "500GB", "1000TB", "Intel Core Xeon");
        
        System.out.println("PC Config setup: " + pc);
        System.out.println("Server Config setup: " + server);
    }
}
