package Lesson25;

class Mechenosec extends Fish {
    Mechenosec (String name) {
        super(name);
        this.name = name;
    }

    @Override
    public  void swim(){
        System.out.println("Mechenosec is a beautiful fish, which swims fast");
    }

    @Override
    public void eat() {
        System.out.println("Mechenosec is not carnivor,and she eats the normal fish food");
    }
}
