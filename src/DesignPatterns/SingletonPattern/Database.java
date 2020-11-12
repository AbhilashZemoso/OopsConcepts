package DesignPatterns.SingletonPattern;

public class Database {
    //private static final Database obj = new Database();
    private Database() {
        System.out.println("Instance Created\n");
    }

    public static Database getAccess() {
        Database db = CreateDatabase.obj;
        System.out.println("Data accessed\n");
        return db;
    }

    private static class CreateDatabase {
        private static final Database obj = new Database();
    }
}
