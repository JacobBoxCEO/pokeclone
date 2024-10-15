package JacobBoxCEO.Pokemon;

import JacobBoxCEO.Enums.Type;

import java.util.ArrayList;
import java.util.List;

public class GenericPokemon {
    protected String name;
    public int baseHealth;
    public int baseAttack;
    public int baseDefense;
    public int baseSpcAttack;
    public int baseSpcDefense;
    public int baseSpeed;
    public List<Type> types = new ArrayList<Type>();

    public GenericPokemon(String name, int baseHealth, int baseAttack, int baseDefense, int baseSpcAttack, int baseSpcDefense, int baseSpeed, Type type) {
        this.name = name;
        this.baseHealth = baseHealth;
        this.baseAttack = baseAttack;
        this.baseDefense = baseDefense;
        this.baseSpcAttack = baseSpcAttack;
        this.baseSpcDefense = baseSpcDefense;
        this.baseSpeed = baseSpeed;
        this.types.add(type);
    }
}
