package p1_factorymethod;

//创建型：工厂方法
public class FactoryMethod {

    public static  void main(String[] args){
        Factory factory = new FactoryB();
        Product product  = factory.create();
        product.info();
    }

}

interface Factory{
    public Product create();
}

class FactoryA implements Factory{

    @Override
    public Product create(){
        return new ProductA();
    }
}

class FactoryB implements Factory{

    @Override
    public Product create(){
        return new ProductB();
    }
}

interface Product{
    public  void info();
}

class ProductA implements Product{

    @Override
    public void info(){
        System.out.println("A");
    }
}

class ProductB implements Product{

    @Override
    public void info(){
        System.out.println("B");
    }
}
