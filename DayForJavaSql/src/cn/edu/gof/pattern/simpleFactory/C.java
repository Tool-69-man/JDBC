package cn.edu.gof.pattern.simpleFactory;

public class C implements interfaceABC{
    public C(){
        System.out.println("创建C");
    }

    @Override
    public void show() {
        System.out.println("选择C");
    }
}
