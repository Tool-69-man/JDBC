package cn.edu.gof.pattern.Prototype;

import cn.edu.gof.pattern.simpleFactory.C;

//原型模式子类
class ConcteatePrototype extends Prototype{
    //属性
    private String atter;

    //方法
    public void setAtter(String atter) {
        this.atter = atter;
    }
    public String getAtter() {
        return this.atter;
    }
    //克隆重写
    public Prototype clone() {
        Prototype prototype = new ConcteatePrototype();
        ((ConcteatePrototype)prototype).setAtter(this.atter);
        return prototype;
    }
    //默认构造
}
public class DemoByPrototype{
    public static void main(String[] args) {
        ConcteatePrototype prototype = new ConcteatePrototype();
        prototype.setAtter("sun");
        ConcteatePrototype copy = (ConcteatePrototype)prototype.clone();
        System.out.println(copy.getAtter());
    }
}