package semaphoreTC_MailRead;

import org.testng.annotations.Test;

public class mTC5 extends mBaseClass {

    String tcName = "TC-5";
    int preThreadSleepInterval = random.nextInt(initialThreadSleepIntervalMAX);
    int postThreadSleepInterval = random.nextInt(initialThreadSleepIntervalMAX);

    @Test
    public void test5() throws InterruptedException {
        System.out.println("*** " + tcName + ": starting");
        Thread.sleep(preThreadSleepInterval);

        MailRead mr = new MailRead(tcName);
        boolean mainFound = mr.findMail();
        if (mainFound){
            System.out.println("... " + tcName + " mail found.");
        } else {
            System.out.println("... " + tcName + " mail NOT found.");
        }

        Thread.sleep(postThreadSleepInterval);
        System.out.println("*** " + tcName + " end.");
    }

}
