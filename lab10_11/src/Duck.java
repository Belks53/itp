public class Duck implements Swimmable, Flyable, Living{
    Boolean flyStatus = false;
    Boolean swimStatus = false;
    @Override
    public void swim(){
        System.out.println("Duck Swimming in the lake");
        swimStatus = true;
    }

    @Override
    public void stopSwimming() {
        if (swimStatus){
            System.out.println("Duck Stop swimming in the lake");
            swimStatus = false;
        }
    }

    @Override
    public void fly(){
        System.out.println("Duck Flying");
        flyStatus = true;
    }

    @Override
    public void stopFlying() {
        if (flyStatus){
            System.out.println("Duck Stop flying");
            flyStatus = false;
        }
    }

    @Override
    public void live() {
        Living.super.live();
    }
}
