package DesignPatterns;

import javax.xml.crypto.Data;

class Database {
    //private static final Database obj = new Database();
    private Database() {
        System.out.println("Instance Created\n");
    }

    private static class CreateDatabase{
        private static final Database obj = new Database();
    }

    public static Database getAccess() {
        Database db = CreateDatabase.obj;
        System.out.println("Data accessed\n");
        return db;
    }
}

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

class SingletonDemo {
    public static void main(String args[]){
        HTML tab1 = new HTML();
        tab1.get();
        tab1.post();
        HTML tab2 = new HTML();
        tab2.get();
        tab2.get();
        tab2.post();
    }
}
