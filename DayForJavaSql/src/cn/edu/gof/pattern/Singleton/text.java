package cn.edu.gof.pattern.Singleton;

class One{
    int num=0;

    public void print() {
      num++;
        System.out.println(num+"函数");
    }
}

public class text {
    public static void main(String[] args) {
        One one =new One();
        one.print();
          One tow =new One();
        tow.print();

    }
}
