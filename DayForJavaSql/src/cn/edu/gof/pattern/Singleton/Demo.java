package cn.edu.gof.pattern.Singleton;
//单例构造模式：只存在唯一一个类实例的对象



//instance 属性属于static
//Singleton声明的对象都有共同的引用


//一个类产生 唯一 一个对象
class Singleton{
    //（final最终定义），static 调用构造类      instance  代替构造
    private static final Singleton instance=new Singleton();
    int num=0;
    //构造私有
    private Singleton(){
    }
    //类中函数
    public void print(){
        num++;
        System.out.println("类中函数"+num);

    }
    //获取本类
    public static Singleton getInstance(){
        return instance;
    }

}


public class Demo {
    public static void main(String[] args) {
//    Singleton s =  new Singleton();    //构造私有不能创建
        Singleton s=null;
        s=Singleton.getInstance();
        s.print();

        Singleton singleton=null;
        singleton = Singleton.getInstance();
        singleton.print();

    }
}
