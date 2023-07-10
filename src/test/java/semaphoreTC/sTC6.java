package semaphoreTC;

import org.testng.annotations.Test;

public class sTC6 extends sBaseClass{

    String tcName = "TC-6";

    //    int initialThreadSleepInterval = 10;
    int preThreadSleepInterval = random.nextInt(initialThreadSleepIntervalMAX);
    int postThreadSleepInterval = random.nextInt(initialThreadSleepIntervalMAX);

    //    int workDurationSeconds = 6;
    int workDurationSeconds = random.nextInt(3) + 3;



    @Test
    public void test6() throws InterruptedException {
        System.out.println("*** " + tcName + " starting");
        Thread.sleep(preThreadSleepInterval);

        try {
            semaphore.acquire();
            System.out.println(tcName + " - semaphore.acquire();");
            try {
                //Useful work
                for (int i = 0; i < workDurationSeconds; i++) {
                    System.out.println(tcName + " - WORKING");
                    Thread.sleep(1000);
                }
            } finally {
                System.out.println(tcName + " - semaphore.release();\n");
                Thread.sleep(1000);  //leave some time for console output
                semaphore.release();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        Thread.sleep(postThreadSleepInterval);
        System.out.println("*** " + tcName + " end.");
    }

}
