package semaphoreTC_MailRead;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class MailRead {
    static Semaphore semaphore = new Semaphore(1);

    protected Random random = new Random();
    private String className;

    public MailRead(String className) {
        this.className = className;
    }

    public boolean findMail() throws InterruptedException {
        System.out.println("#-- " + className + ": findMail started");
        try {
            semaphore.acquire();
            System.out.println("\n### " + className + ": semaphore.acquire()");

            //Useful work - Reading mails
            for (int i = 0; i < random.nextInt(3) + 3; i++) {
                System.out.println("### " + className + ": Reading mails....");
                Thread.sleep(1000);
            }
        } finally {
            System.out.println("### " + className + ": semaphore.release();\n");
            semaphore.release();
            System.out.println("#-- " + className + ": findMail end.");
        }

        return random.nextBoolean();
    }

}
