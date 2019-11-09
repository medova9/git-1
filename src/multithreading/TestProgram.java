package multithreading;


class SomeThing			//Нечто, реализующее интерфейс Runnable
        implements Runnable		//(содержащее метод run())
{
    public void run()		//Этот метод будет выполняться в побочном потоке
    {
        System.out.println("Привет из побочного потока!");
    }
}

public class TestProgram			//Класс с методом main()
{
    static SomeThing mThing;	//mThing - объект класса, реализующего интерфейс Runnable

//    public static void main(String[] args)
//    {
//        mThing = new SomeThing();
//
//        Thread myThready = new Thread(mThing);	//Создание потока "myThready"
//        myThready.start();				//Запуск потока
//
//        System.out.println("Главный поток завершён...");
//    }
    public static void main(String[] args)
    {
        //Создание потока
        Thread myThready = new Thread(new Runnable()
        {
            public void run() //Этот метод будет выполняться в побочном потоке
            {
                System.out.println("Привет из побочного потока!");
            }
        });
        myThready.start();	//Запуск потока

        System.out.println("Главный поток завершён...");
    }
}

class DemoJoin {
    public static void main(String args[]) {
        NewThread ob1 = new NewThread("One");
        NewThread ob2 = new NewThread("Two");
        NewThread ob3 = new NewThread("Three");
        System.out.println("Thread One is alive: " + ob1.t.isAlive());
        System.out.println("Thread Two is alive: " + ob2.t.isAlive());
        System.out.println("Thread Three is alive: " +
                ob3.t.isAlive());
        try {
            System.out.println("Waiting for threads to finish.");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Thread One is alive: " + ob1.t.isAlive());
        System.out.println("Thread Two is alive: " + ob2.t.isAlive());
        System.out.println("Thread Three is alive: " +
                ob3.t.isAlive());
        System.out.println("Main thread exiting.");
    }
}
class NewThread implements Runnable {
    String name;
    Thread t;
    NewThread(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
        t.start();
    }
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " interrupted.");
        }
        System.out.println(name + " exiting.");
    }
}
class GetStateDemo implements Runnable{
    public void run() {
        Thread.State state = Thread.currentThread().getState();
        System.out.println(Thread.currentThread().getName() + " " +
                state);
    }
    public static void main(String args[]) {
        Thread th1 = new Thread(new GetStateDemo());
        th1.start();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        Thread.State state = th1.getState();
        System.out.println(th1.getName() + " " + state);
    }
}

class PriorityDemo {
    public static void main(String args[]) {
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        Clicker hi = new Clicker();
        Clicker lo = new Clicker();
        hi.setPriority(Thread.NORM_PRIORITY + 2);
        lo.setPriority(Thread.NORM_PRIORITY - 2);
        lo.start();
        hi.start();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        lo.stopClick();
        hi.stopClick();
        try {
            hi.join();
            lo.join();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }
        System.out.println("Low-priority thread: " + lo.click);
        System.out.println("High-priority thread: " + hi.click);
    }
}
class Clicker extends Thread {
    int click = 0;
    private volatile boolean running = true;
    public Clicker() {
    }
    public void run() {
        while (running) {
            click++;
        }
    }
    public void stopClick() {
        running = false;
    }
}

class MyThread extends Thread {
    public MyThread(String threadname, ThreadGroup tgOb) {
        super(tgOb, threadname);
        System.out.println("New thread: " + this);
        start();
    }
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(getName() + ": " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Exception in " + getName());
        }
        System.out.println(getName() + " exiting.");
    }
}
class ThreadGroupDemo {
    public static void main(String[] args) {
        ThreadGroup groupA = new ThreadGroup("Group A");
        ThreadGroup groupB = new ThreadGroup("Group B");
        MyThread ob1 = new MyThread("One", groupA);
        MyThread ob2 = new MyThread("Two", groupA);
        MyThread ob3 = new MyThread("Three", groupB);
        MyThread ob4 = new MyThread("Four", groupB);
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        groupA.interrupt();
    }
}
class ThreadGroupListDemo {
    public static void main(String[] args) {
        ThreadGroup mainGroup = new ThreadGroup("mainGroup");
        ThreadGroup groupA = new ThreadGroup(mainGroup, "Group A");
        ThreadGroup groupB = new ThreadGroup(mainGroup, "Group B");
        MyThread ob1 = new MyThread("One", groupA);
        MyThread ob2 = new MyThread("Two", groupA);
        MyThread ob3 = new MyThread("Three", groupB);
        MyThread ob4 = new MyThread("Four", groupB);
        groupA.list();
        groupB.list();
        mainGroup.interrupt();
    }
}
class ThreadUncaughtExceptionDemo {
    public static void main(String[] args) {
        Thread t = new Thread(new SimpleThread());
        t.setUncaughtExceptionHandler(new
                                              Thread.UncaughtExceptionHandler() {
                                                  public void uncaughtException(Thread t, Throwable e) {
                                                      System.out.println(t + " throws exception: " + e);
                                                  }
                                              });
        t.start();
    }
}
class SimpleThread implements Runnable {
    public void run() {
        throw new RuntimeException("It is a greate exception.");
    }
}
class ThreadDefaultUncaughtExceptionDemo {
    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler(new
                                                          Thread.UncaughtExceptionHandler() {
                                                              public void uncaughtException(Thread t, Throwable e) {
                                                                  System.out.println(t + " (default handler)throws " +
                                                                          "exception: " + e);
                                                              }
                                                          });
        Thread t1 = new Thread(new MyThread1());
        Thread t2 = new Thread(new MyThread1());
        t2.setUncaughtExceptionHandler(new
                                               Thread.UncaughtExceptionHandler() {
                                                   public void uncaughtException(Thread t, Throwable e) {
                                                       System.out.println(t + " throws exception: " + e);
                                                   }
                                               });
        t1.start();
        t2.start();
    }
}
class MyThread1 implements Runnable {
    public void run() {
        throw new RuntimeException();
    }
}
class ThreadGroupUncaughtExceptionDemo {
    public static void main(String[] args) {
        NewThreadGroup g = new NewThreadGroup("one");
        ThreadD t1 = new ThreadD("1", g);
        ThreadD t2 = new ThreadD("2", g);
        ThreadD t3 = new ThreadD("3", g);
        t3.setUncaughtExceptionHandler(new
                                               Thread.UncaughtExceptionHandler() {
                                                   public void uncaughtException(Thread t, Throwable e) {
                                                       System.out.println(t + " throws exception: " + e);
                                                   }
                                               });
        t1.start();
        t2.start();
        t3.start();
    }
}
class NewThreadGroup extends ThreadGroup {
    NewThreadGroup(String n) {
        super(n);
    }
    NewThreadGroup(ThreadGroup parent, String n) {
        super(parent, n);
    }
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println(t + " has unhandled exception:" + e);
    }
}
class ThreadD extends Thread {
    public ThreadD(String threadname, ThreadGroup tgOb) {
        super(tgOb, threadname);
    }
    public void run() {
        throw new RuntimeException("Oy, exception!!!");
    }
}