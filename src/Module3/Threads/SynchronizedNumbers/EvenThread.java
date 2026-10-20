package Module3.Threads.SynchronizedNumbers;

public class EvenThread implements Runnable{
    NumberPrinter printer;
    int index;

    public EvenThread(NumberPrinter printer, int index) {
        this.printer = printer;
        this.index = index;
    }

    @Override
    public void run() {
        int num = 0;
        while (num < index) {
            printer.evenPrint(index);
            num++;
        }

    }
}
