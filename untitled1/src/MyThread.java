public class MyThread {
    public static void main(String[] args){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("i am running from this thread :" + Thread.currentThread());
            }
        });

        Runnable runnable = ()-> System.out.println("i am running from runnable :" +Thread.currentThread());

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("i am running from this runnable"+ Thread.currentThread());
            }
        };

        Thread t = new Thread(){
            @Override
            public void run() {
                super.run();
                System.out.println("i am running inside new thread" + Thread.currentThread());
            }
        };
        System.out.println("i am from main : " + Thread.currentThread());
        thread.start();
runnable.run();
r.run();
t.start();

    }
}
