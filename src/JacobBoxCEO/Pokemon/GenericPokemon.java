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
    public int battleHealth;
    public int battleAttack;
    public int battleDefense;
    public int battleSpcAttack;
    public int battleSpcDefense;
    public int battleSpeed;
    public float evasion;
    public float accuracy;
    public List<Type> types = new ArrayList<>();

    public GenericPokemon(String name, int baseHealth, int baseAttack, int baseDefense, int baseSpcAttack, int baseSpcDefense, int baseSpeed, Type type) {
        this.name = name;
        this.baseHealth = baseHealth;
        this.baseAttack = baseAttack;
        this.baseDefense = baseDefense;
        this.baseSpcAttack = baseSpcAttack;
        this.baseSpcDefense = baseSpcDefense;
        this.baseSpeed = baseSpeed;
        this.battleHealth = baseHealth;
        this.battleAttack = baseAttack;
        this.battleDefense = baseDefense;
        this.battleSpcAttack = baseSpcAttack;
        this.battleSpcDefense = baseSpcDefense;
        this.battleSpeed = baseSpeed;
        this.evasion = 1;
        this.accuracy = 1;
        this.types.add(type);
    }
    public GenericPokemon(String name, int baseHealth, int baseAttack, int baseDefense, int baseSpcAttack, int baseSpcDefense, int baseSpeed, Type type1, Type type2) {
        this.name = name;
        this.baseHealth = baseHealth;
        this.baseAttack = baseAttack;
        this.baseDefense = baseDefense;
        this.baseSpcAttack = baseSpcAttack;
        this.baseSpcDefense = baseSpcDefense;
        this.baseSpeed = baseSpeed;
        this.battleHealth = baseHealth;
        this.battleAttack = baseAttack;
        this.battleDefense = baseDefense;
        this.battleSpcAttack = baseSpcAttack;
        this.battleSpcDefense = baseSpcDefense;
        this.battleSpeed = baseSpeed;
        this.evasion = 1;
        this.accuracy = 1;
        this.types.add(type1);
        this.types.add(type2);
    }
}
