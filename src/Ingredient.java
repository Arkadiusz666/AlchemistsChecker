import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by arkad_000 on 2016-05-24.
 */
public class Ingredient {
    IngredientName name;
    Set<Particle> possibleParticles; //list of possible particles belonging to this ingredient;
    //TODO solving problems of +/+ (linked symbols with other ingredients)


    public Ingredient(IngredientName name) {
        this.name = name;
        possibleParticles = new HashSet<>();
        Particle particle1 = new Particle("plus","minus","MINUS");
        Particle particle2 = new Particle("minus","plus","PLUS");
        Particle particle3 = new Particle("MINUS","plus","minus");
        Particle particle4 = new Particle("PLUS","minus","plus");
        Particle particle5 = new Particle("minus","MINUS","plus");
        Particle particle6 = new Particle("plus","PLUS","minus");
        Particle particle7 = new Particle("MINUS","MINUS","MINUS");
        Particle particle8 = new Particle("PLUS","PLUS","PLUS");
    }
}
