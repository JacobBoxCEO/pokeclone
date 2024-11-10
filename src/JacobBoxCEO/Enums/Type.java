package JacobBoxCEO.Enums;

import java.util.Map;

public enum Type {
    NORMAL("Normal", Map.ofEntries(
            Map.entry("Rock", 0.5f),
            Map.entry("Ghost", 0f),
            Map.entry("Steel", 0.5f)
    )),
    FIRE("Fire", Map.ofEntries(
            Map.entry("Fire", 0.5f),
            Map.entry("Water", 0.5f),
            Map.entry("Grass", 2f),
            Map.entry("Ice", 2f),
            Map.entry("Bug", 2f),
            Map.entry("Rock", 0.5f),
            Map.entry("Dragon", 0.5f),
            Map.entry("Steel", 2f)
    )),
    FIGHTING("Fighting", Map.ofEntries(
            Map.entry("Normal", 2f),
            Map.entry("Ice", 2f),
            Map.entry("Poison", 0.5f),
            Map.entry("Flying", 0.5f),
            Map.entry("Psychic", 0.5f),
            Map.entry("Bug", 0.5f),
            Map.entry("Rock", 2f),
            Map.entry("Ghost", 0f),
            Map.entry("Dark", 2f),
            Map.entry("Steel", 2f),
            Map.entry("Fairy", 2f)
    )),
    WATER("Water", Map.ofEntries(
            Map.entry("Fire", 2f),
            Map.entry("Water", 0.5f),
            Map.entry("Grass", 0.5f),
            Map.entry("Ground", 2f),
            Map.entry("Rock", 2f),
            Map.entry("Dragon", 2f)
    )),
    FLYING("Flying", Map.ofEntries(
            Map.entry("Grass", 2f),
            Map.entry("Electric", 0.5f),
            Map.entry("Fighting", 2f),
            Map.entry("Bug", 2f),
            Map.entry("Rock", 0.5f),
            Map.entry("Steel", 0.5f)
    )),
    GRASS("Grass", Map.ofEntries(
            Map.entry("Fire", 0.5f),
            Map.entry("Water", 2f),
            Map.entry("Grass", 0.5f),
            Map.entry("Poison", 0.5f),
            Map.entry("Ground", 2f),
            Map.entry("Flying", 0.5f),
            Map.entry("Bug", 0.5f),
            Map.entry("Rock", 2f),
            Map.entry("Dragon", 0.5f),
            Map.entry("Steel", 0.5f)
    )),
    POISON("Poison", Map.ofEntries(
            Map.entry("Grass", 2f),
            Map.entry("Poison", 0.5f),
            Map.entry("Ground", 0.5f),
            Map.entry("Rock", 0.5f),
            Map.entry("Ghost", 0.5f),
            Map.entry("Steel", 0f),
            Map.entry("Fairy", 2f)
    )),
    ELECTRIC("Electric", Map.ofEntries(
            Map.entry("Water",2f),
            Map.entry("Grass",0.5f),
            Map.entry("Electric",0.5f),
            Map.entry("Ground",0f),
            Map.entry("Flying",2f),
            Map.entry("Dragon",0.5f)
    )),
    GROUND("Ground", Map.ofEntries(
            Map.entry("Fire",2f),
            Map.entry("Grass",0.5f),
            Map.entry("Electric",2f),
            Map.entry("Poison",2f),
            Map.entry("Flying",0f),
            Map.entry("Bug",0.5f),
            Map.entry("Rock",2f),
            Map.entry("Steel",2f)
    )),
    PSYCHIC("Psychic", Map.ofEntries(
            Map.entry("Fighting",2f),
            Map.entry("Poison",2f),
            Map.entry("Psychic",0.5f),
            Map.entry("Dark",0f),
            Map.entry("Steel",0.5f)
    )),
    ROCK("Rock", Map.ofEntries(
            Map.entry("Fire",2f),
            Map.entry("Ice",2f),
            Map.entry("Fighting",0.5f),
            Map.entry("Ground",0.5f),
            Map.entry("Flying",2f),
            Map.entry("Bug",2f),
            Map.entry("Steel",0.5f)
    )),
    ICE("Ice", Map.ofEntries(
            Map.entry("Fire",0.5f),
            Map.entry("Water",0.5f),
            Map.entry("Grass",2f),
            Map.entry("Ice",0.5f),
            Map.entry("Ground",2f),
            Map.entry("Flying",2f),
            Map.entry("Dragon",2f),
            Map.entry("Steel",0.5f)
    )),
    BUG("Bug", Map.ofEntries(
            Map.entry("Fire",0.5f),
            Map.entry("Grass",2f),
            Map.entry("Fighting",0.5f),
            Map.entry("Poison",0.5f),
            Map.entry("Flying",0.5f),
            Map.entry("Psychic",2f),
            Map.entry("Ghost",0.5f),
            Map.entry("Dark",2f),
            Map.entry("Steel",0.5f),
            Map.entry("Fairy",0.5f)
    )),
    DRAGON("Dragon", Map.ofEntries(
            Map.entry("Dragon",2f),
            Map.entry("Steel",0.5f),
            Map.entry("Fairy",0f)
    )),
    GHOST("Ghost", Map.ofEntries(
            Map.entry("Normal",0f),
            Map.entry("Psychic",2f),
            Map.entry("Ghost",2f),
            Map.entry("Dark",0.5f)
    )),
    DARK("Dark", Map.ofEntries(
            Map.entry("Fighting",0.5f),
            Map.entry("Psychic",2f),
            Map.entry("Ghost",2f),
            Map.entry("Dark",0.5f),
            Map.entry("Fairy",0.5f)
    )),
    STEEL("Steel", Map.ofEntries(
            Map.entry("Fire",0.5f),
            Map.entry("Water",0.5f),
            Map.entry("Electric",0.5f),
            Map.entry("Ice",2f),
            Map.entry("Rock",2f),
            Map.entry("Steel",0.5f),
            Map.entry("Fairy",2f)
    )),
    FAIRY("Fairy", Map.ofEntries(
            Map.entry("Fire",0.5f),
            Map.entry("Fighting",2f),
            Map.entry("Poison",0.5f),
            Map.entry("Dragon",2f),
            Map.entry("Dark",2f),
            Map.entry("Steel",0.5f)
    ));
    private final String name;
    private final Map<String, Float> typeMap;

    Type(String name, Map<String, Float> typeMap) {
        this.name = name;
        this.typeMap = typeMap;
    }
    public float getEffectiveness(Type type) {
        return this.typeMap.getOrDefault(type.name, 1f);
    }
}
