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