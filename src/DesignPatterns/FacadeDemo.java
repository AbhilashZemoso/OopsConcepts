package DesignPatterns;

class RobotBody
{
    public static void createRobot()
    {
        System.out.println(" Refer the manual before creation of a robot.");
    }

    public void createHands()
    {
        System.out.println(" Hands manufactured.");
    }

    public void createRemainingParts()
    {
        System.out.println(" Remaining parts (other than hands) are created.");
    }

    public static void destroyRobot()
    {
        System.out.println(" Refer the manual before destroying of a robot.");
    }

    public void destroyHands()
    {
        System.out.println(" The robot's hands are destroyed.");
    }

    public void destroyRemainingParts()
    {
        System.out.println(" The robot's remaining parts are destroyed.");
    }
}

class RobotColor
{
    public void setDefaultColor()
    {
        System.out.println(" This is steel color robot.");
    }
    public void setGreenColor()
    {
        System.out.println(" This is a green color robot.");
    }
}

class RobotHands
{
    public void setMilanoHands()
    {
        System.out.println(" The robot will have EH1 Milano hands.");
    }
    public void setRobonautHands()
    {
        System.out.println(" The robot will have Robonaut hands.");
    }
    public void resetMilanoHands()
    {
        System.out.println(" EH1 Milano hands are about to be destroyed.");
    }
    public void resetRobonautHands()
    {
        System.out.println(" Robonaut hands are about to be destroyed.");
    }
}

class RobotFacade
{
    RobotColor rColor;
    RobotHands rHands ;
    RobotBody rBody;
    public RobotFacade()
    {
        rColor = new RobotColor();
        rHands = new RobotHands();
        rBody = new RobotBody();
    }
    //Constructing a Milano Robot
    public void constructMilanoRobot()
    {
        RobotBody.createRobot();
        System.out.println("Creation of a Milano Robot Start.");
        rColor.setDefaultColor();
        rHands.setMilanoHands();
        rBody.createHands();
        rBody.createRemainingParts();
        System.out.println(" Milano Robot Creation End.");
        System.out.println();
    }
    //Constructing a Robonaut Robot
    public void constructRobonautRobot()
    {
        RobotBody.createRobot();
        System.out.println("Initiating the creational process of a Robonaut Robot.");
        rColor.setGreenColor();
        rHands.setRobonautHands();
        rBody.createHands();
        rBody.createRemainingParts();
        System.out.println("A Robonaut Robot is created.");
        System.out.println();
    }
    //Destroying a Milano Robot
    public void destroyMilanoRobot()
    {
        RobotBody.destroyRobot();
        System.out.println(" Milano Robot's destruction process is started.");
        rHands.resetMilanoHands();
        rBody.destroyHands();
        rBody.destroyRemainingParts();
        System.out.println(" Milano Robot's destruction process is over.");
        System.out.println();
    }
    //Destroying a Robonaut Robot
    public void destroyRobonautRobot()
    {
        RobotBody.destroyRobot();
        System.out.println(" Initiating a Robonaut Robot's destruction process.");
        rHands.resetRobonautHands();
        rBody.destroyHands();
        rBody.destroyRemainingParts();
        System.out.println(" A Robonaut Robot is destroyed.");
        System.out.println();
    }
}

public class FacadeDemo {
    public static void main(String[] args) {
        System.out.println("***Facade Pattern Demo***\n");
        //Creating Robots
        RobotFacade milanoRobotFacade = new RobotFacade();
        milanoRobotFacade.constructMilanoRobot();
        RobotFacade robonautRobotFacade = new RobotFacade();
        robonautRobotFacade.constructRobonautRobot();
        //Destroying robots
        milanoRobotFacade.destroyMilanoRobot();
        robonautRobotFacade.destroyRobonautRobot();
    }
}
