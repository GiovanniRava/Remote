public class second {
    public second(long gui) {
        this.gui = gui;
    }

    private final long gui;

    public long getGui() {
        return gui;
    }
    public String polloarrosto (final int polli){
        return "numero di pollo arrosto:"+polli;
    }
    public static void main(String[] args) {
        second primo =new second(5);
        System.out.println(primo.polloarrosto(primo.getGui()));
    }
} 