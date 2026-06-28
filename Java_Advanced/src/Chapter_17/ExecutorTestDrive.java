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

class ExecutorTestDrive {
    public static void main(String[] args) {
        ExecutorService executor
                = Executors.newSingleThreadExecutor();
        executor.execute(()
                -> System.out.println("top o' the stack"));
        System.out.println("back in main");
        executor.shutdown();
    }
}