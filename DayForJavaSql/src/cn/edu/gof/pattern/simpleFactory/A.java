package cn.edu.gof.pattern.simpleFactory;

public class A implements interfaceABC{
    public A(){
        System.out.println("创建A");
    }
    @Override
    public void show() {
        System.out.println("就选择是你了A");
    }
}
