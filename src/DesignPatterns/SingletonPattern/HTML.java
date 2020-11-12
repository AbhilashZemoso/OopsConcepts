package DesignPatterns.SingletonPattern;

class HTML {
    public void get(){
        System.out.println("Get data from Database");
        Database.getAccess();
    }

    public void post(){
        System.out.println("Post data to Database");
        Database.getAccess();
    }
}
