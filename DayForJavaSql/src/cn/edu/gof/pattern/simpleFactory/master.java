package cn.edu.gof.pattern.simpleFactory;

public class master {
    public static void main(String[] args) {
//        simpleFactoryPattern sfp;
//        interfaceABC ifabc;
        interfaceABC ifabc;
        ifabc=simpleFactoryPattern.get("C");
        ifabc.show();
    }
}
