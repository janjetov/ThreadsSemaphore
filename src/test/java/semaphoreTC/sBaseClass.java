package semaphoreTC;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class sBaseClass {
    static Semaphore semaphore = new Semaphore(1);

    protected Random random = new Random();
    protected final int initialThreadSleepIntervalMAX = 3000;

}
