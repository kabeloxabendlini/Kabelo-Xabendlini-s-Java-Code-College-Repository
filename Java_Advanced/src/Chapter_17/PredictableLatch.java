/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_17;

/**
 *
 * @author Admin
 */
import java.util.concurrent.*;

class PredictableLatch {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        CountDownLatch latch = new CountDownLatch(1);
        executor.execute(() -> waitForLatchThenPrint(latch));
        System.out.println("back in main");
        latch.countDown();
        executor.shutdown();
    }

    private static void waitForLatchThenPrint(CountDownLatch latch) {
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("top o’ the stack");
    }
}
