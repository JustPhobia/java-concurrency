package Module3.Threads.SynchronizedNumbers;

public class OddThread implements Runnable {
    NumberPrinter printer;
    int index;

    public OddThread(NumberPrinter printer, int index) {
        this.printer = printer;
        this.index = index;
    }

    @Override
    public void run() {
        int num = 0;
        while (num < index) {
            printer.oddPrint(index);
            num++;
        }
    }
}
