public class Elprimo extends second{
    final int var=9;
    Elprimo(final int var){
       super(var);
    }
    public static void main(String[] args) {
        second primo =new second(5);
        System.out.println(primo.polloarrosto(primo.getGui()));
    }
}