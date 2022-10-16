package p1_simplefactory;

//简单工厂
public class SimpleFactory {
    public static  void main(String[] args){
        Product product = Factory.create("B");
        product.info();
    }
}

class Factory{
    public  static Product create(String type){
        Product product = null;

        switch(type){
            case "A":
                product = new ProductA();
                break;
            case "B":
                product  = new ProductB();
                break;
        }

        return product;
    }
}

abstract class Product {
  public abstract void info();
}



class ProductA extends Product{

    @Override
    public void info(){
        System.out.println("A");
    }
}

class ProductB extends Product{

    @Override
    public void info(){
        System.out.println("B");
    }
}