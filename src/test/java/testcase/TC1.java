package testcase;

import org.testng.annotations.Test;

public class TC1 extends TestBase{

    String tcName = "TC-1";
    int initialThreadSleepInterval = 10;

    int sleepMaxCount = 100;
    int sleepCount = 0;


    @Test
    public void test1() throws InterruptedException {

        Thread.sleep(initialThreadSleepInterval);

        while (sleepCount < sleepMaxCount) {
            if (semaphore) {
                semaphore = false;
                System.out.println("\n::: " + tcName + " ::: Semaphore DOWN. \nStarting '" + tcName + ".");
                break;
            } else {
                System.out.println("... '" + tcName + "' waiting...");
                Thread.sleep(1000);
                sleepCount++;
            }
        }

        System.out.println("--- Outside WHILE..");

        if (sleepCount == sleepMaxCount){
            System.err.println("SleepMaxCount exceeded !!!!!!!!!!");
            return;
        }


        for (int j = 0; j < 1000; j++) {
            if ((j % 2000) == 0) {
                System.out.println("*** '" + tcName + "' WORKING ***");
            }
            Thread.sleep(10);
        }

        System.out.println("*** '" + tcName + "' FINISHED work.");

        System.out.println("'" + tcName + "' Semaphore UP. \nEnd '"+ tcName + "'.");
        semaphore = true;

    }
}
