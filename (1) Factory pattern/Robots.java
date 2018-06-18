public class Robots {

    private String name, type, action;

    void setName(String nameOf){name = nameOf; }
    private String getName(){return name; }

    void setType(String typeOf){type = typeOf; }
    private String getType(){return type; }

    void setAction(String actionOf){action = actionOf; }
    private String getAction(){return action; }

    public void inAction(){

        System.out.println(getName() + " is the " + getType() + " robot. " + getName() + " is " + getAction());
    }

}
