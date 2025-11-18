public abstract class Creature {
    String name = null;
    Boolean isAlive = false;

    abstract public void bear(String name);

    abstract public void die();

    public void shoutName() {
        if (name != null) {
            System.out.println("I am " + name);
        }
        else  {
            System.out.println("ERROR");
        }
    }
}

