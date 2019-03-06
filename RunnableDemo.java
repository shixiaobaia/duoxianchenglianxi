
class MiThread implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(100);//线程休眠
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i+"MyThread");
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        MiThread  my=new MiThread();//创建实现接口的对象
        Thread  th=new Thread(my);//创建线程对象
        th.start();//启动线程
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i+"RunnableDemo");//主线程信息
        }
    }
}
