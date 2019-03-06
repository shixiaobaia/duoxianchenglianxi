import static java.lang.Thread.*;

//继承thread类并覆写它的run()方法
class MyThread extends  Thread{
    public void run(){
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i+"MyThread");
        }

    }
}


public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread mt=new MyThread();
        mt.start();
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i+"THREADDEMO");
        }
    }
}
