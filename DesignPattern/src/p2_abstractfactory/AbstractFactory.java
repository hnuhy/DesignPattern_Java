package p2_abstractfactory;

//创建型：抽象工厂
public class AbstractFactory {
    public static  void main(String[] args){
        Factory factory = new Factory1();
        ProductA productA =factory.createA();
        productA.info();
        ProductB productB  = factory.createB();
        productB.info();
    }

}

interface Factory{
    public ProductA createA();
    public ProductB createB();
}

class Factory1 implements Factory{

    @Override
    public ProductA createA(){
        return new ProductA1();
    }

    @Override
    public ProductB createB(){
        return new ProductB2();
    }
}

class Factory2 implements Factory{

    @Override
    public ProductA createA(){
        return new ProductA2();
    }

    @Override
    public ProductB createB(){
        return new ProductB1();
    }
}

interface ProductA{
    public void info();
}

class ProductA1 implements ProductA{

    @Override
    public void info(){
        System.out.println("A1");
    }
}

class ProductA2 implements ProductA{

    @Override
    public void info(){
        System.out.println("A2");
    }
}

interface ProductB{
    public void info();
}

class ProductB1 implements ProductB{

    @Override
    public void info(){
        System.out.println("B1");
    }
}

class ProductB2 implements ProductB{

    @Override
    public void info(){
        System.out.println("B2");
    }
}
