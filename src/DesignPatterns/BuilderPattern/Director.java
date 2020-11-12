package DesignPatterns.BuilderPattern;

class Director {
    Mobile mob;
    public void contruct(Mobile mob){
        this.mob = mob;
        mob.addName();
        mob.addCamera();
        mob.addProcessor();
        mob.addStorage();
    }
}
