package abstraction;

public class Tv extends Device {
    public Tv(String name) {
        super(name);
    }

    @Override
    public void emitNoise() {
        System.out.println("Sound");
    }
}
