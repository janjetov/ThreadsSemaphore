package testcase.semaphoreTC_MailRead;

import org.testng.annotations.Test;

public class mTC4 extends mBaseClass {

    String tcName = "TC-4";
    int preThreadSleepInterval = random.nextInt(initialThreadSleepIntervalMAX);
    int postThreadSleepInterval = random.nextInt(initialThreadSleepIntervalMAX);

    @Test
    public void test4() throws InterruptedException {
        System.out.println("*** " + tcName + ": starting");
        Thread.sleep(preThreadSleepInterval);

        MailRead mr = new MailRead(tcName);
        boolean mainFound = mr.findMail();
        if (mainFound){
            System.out.println("--- " + tcName + " mail found.");
        } else {
            System.out.println("--- " + tcName + " mail NOT found.");
        }

        Thread.sleep(postThreadSleepInterval);
        System.out.println("*** " + tcName + " end.");
    }

}
