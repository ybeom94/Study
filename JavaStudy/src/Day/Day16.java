package Day;


public class Day16
{
    public static void main(String[] args)
    {
        // B b = new B();
        // A a = b;

        // AA aa = new BB();
        // aa.bb // -> X

    //     Animal animal = null;

    //     int input = 0;
    //     switch (input)
    //     {
    //         case 1:
    //             animal = new Dog();
    //             break;
    //         case 2:
    //             animal = new Cow();
    //             break;
    //         case 3:
    //             animal = new Horse();
    //     }

    //     if (animal != null)
    //     {
    //         animal.Run();
    //     }

        // Shape shape = new Line();
        // shape.draw();

        // shape = new Square();
        // shape.draw();

        // shape = new Circle();
        // shape.draw();

        // Runnable r = new Runnable()
        // {
        //     @Override
        //     public void run()
        //     {
        //         System.out.println("쓰레드1 실행");
        //     }
        // };
        // new Thread(r).start();

        // Runnable rr = ()->
        // {
        //     System.out.println("쓰레드2 실행");
        // };
        // new Thread(rr).start();



    }
}

class Animal
{
    
}

interface IFlayable
{
    void fly();
}

interface IMoveable
{
    void Move();
}

class Duck extends Animal implements IFlayable, IMoveable
{
    @Override
    public void Move() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Move'");
    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fly'");
    }

}

// abstract class Shape
// {   
//     String color;
//     abstract void setColor(String color);
//     abstract void draw();
// }

// class Line extends Shape
// {

//     @Override
//     void setColor(String color)
//     {
//         this.color = color;
//     }

//     @Override
//     void draw()
//     {
        
//     }

// }

// class Square extends Shape
// {

//     @Override
//     void setColor(String color)
//     {
        
//     }

//     @Override
//     void draw()
//     {
        
//     }

// }

// class Circle extends Shape
// {

//     @Override
//     void setColor(String color)
//     {
        
//     }

//     @Override
//     void draw()
//     {

//     }

// }

// abstract class Animal
// {
//     public abstract void Run();
// }

// class Dog extends Animal
// {
//     @Override
//     public void Run()
//     {
        
//     }
// }

// class Cow extends Animal
// {
//     @Override
//     public void Run()
//     {
        
//     }
// }

// class Horse extends Animal
// {
//     @Override
//     public void Run()
//     {
        
//     }
// }

// class AA
// {
//     int a, b;
//     public void aa()
//     {
//         System.out.println("AA:aa() Call..");
//     }
// }

// class BB extends AA
// {
//     int c;
//     public void bb()
//     {
//         System.out.println("BB:bb() Call..");
//     }
// }

// class A
// {
//     public A()
//     {
//         System.out.println("A() Call..");
//     }
// }

// class B extends A
// {
//     public B()
//     {
//         System.out.println("B() Call..");
//     }
// }