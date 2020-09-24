package DesignPatterns;

class Singleton {
    private Singleton() {
        System.out.println("Instance Created\n");
    }

    private static class CreateSingleton{
        private static final Singleton obj = new Singleton();
    }

    public static Singleton createInstance() {
        return CreateSingleton.obj;
    }
}

class SingletonDemo {
    public static void main(String args[]){
        Singleton.createInstance();
        Singleton.createInstance();
    }
}
