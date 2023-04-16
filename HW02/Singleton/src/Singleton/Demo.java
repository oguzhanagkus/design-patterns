package Singleton;

public class Demo {
    public static void main(String[] args) {
        try {
            Singleton unique = Singleton.getInstance();
            System.out.println(unique.hashCode());
            Object cloned = unique.clone();
            System.out.println(cloned.hashCode());
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }
}

/* ------------------------- */

class Parent implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

/* ------------------------- */ // For question 1

/*
class Singleton {
    private volatile static Singleton uniqueInstance;
    private Singleton() {}

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
*/

/* ------------------------- */ // For question 2

/*
class Singleton {
    private volatile static Singleton uniqueInstance;
    private Singleton() {}

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone();
        return uniqueInstance;
    }
}
*/

/* ------------------------- */ // For question 3.1

/*
class Singleton extends Parent {
    private volatile static Singleton uniqueInstance;
    private Singleton() {}

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
*/

/* ------------------------- */  // For question 3.2

class Singleton extends Parent {
    private volatile static Singleton uniqueInstance;
    private Singleton() {}

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return uniqueInstance;
    }
}