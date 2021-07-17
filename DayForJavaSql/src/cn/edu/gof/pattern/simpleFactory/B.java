package cn.edu.gof.pattern.simpleFactory;

public class B implements interfaceABC{
    public B(){
        System.out.println("创建B");
    }
    @Override
    public void show(){
        System.out.println("选择B");
    }

}
