package cn.edu.gof.pattern.simpleFactory;




public class simpleFactoryPattern {
    public static interfaceABC get(String str){
        interfaceABC abc=null;
        if (str.equalsIgnoreCase("A")){
            System.out.println("初始A");
            return new A();
        }else if (str.equalsIgnoreCase("B")){
            System.out.println("初始化B");
            return new B();
        }else if (str.equalsIgnoreCase("C")){
            System.out.println("初始化C");
            return new C();
        }
        System.out.println("输入错误，返回空");
        return abc;
    }
}
