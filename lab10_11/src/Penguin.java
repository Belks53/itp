public class Penguin implements  Swimmable, Living{
    Boolean swimStatus = false;
    @Override
    public void swim(){
        System.out.println("Swimming in the swimming pool");
        swimStatus = true;
    }

    @Override
    public void stopSwimming() {
        if (swimStatus) {
            System.out.println("Stop swimming in the swimming pool");
            swimStatus = false;
        }
    }

    @Override
    public void live() {
        Living.super.live();
    }
}
