package website.zaripov.factorymethod;

/**
 *
 * @author vadim
 */
public abstract class Computer {

    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();

    @Override
    public String toString() {
        return "\n\tRAM: " + this.getRAM() + "\n\tHDD: " + getHDD() + "\n\tCPU: " + getCPU();
    }
}
