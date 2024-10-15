package JacobBoxCEO.Moves;

import JacobBoxCEO.Enums.Type;

public class GenericMove {
    protected String name;
    int pp;
    boolean isPhysical;
    public Type type;

    public String getName() {
        return name;
    }

    public GenericMove(String name, int pp, boolean isPhysical, Type type) {
        this.name = name;
        this.pp = pp;
        this.isPhysical = isPhysical;
        this.type = type;
    }

    public void use() {
        if (pp-- >= 0) {
            pp--;
        }
        else {
            System.out.println("Not enough pp!");
        }
    }
}
