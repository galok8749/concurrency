package numberprinter;

public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 100; ++i) {
            Thread t = new Thread(new HelloPrinter());
//            calling start method instead run , if we directly call run it will not create thread
//            start internally going to call run, start will create new memory for the thread
            t.start();
//            System.out.println("Number is " + i);
        }
    }
}
