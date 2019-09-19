import java.util.HashMap;
import java.util.Map;
//For example
//      String water = "H2O";
//        parseMolecule.getAtoms(water); // return [H: 2, O: 1]
//
//        String magnesiumHydroxide = "Mg(OH)2";
//        parseMolecule.getAtoms(magnesiumHydroxide); // return ["Mg": 1, "O": 2, "H": 2]
//
//        String fremySalt = "K4[ON(SO3)2]2";
//        parseMolecule.getAtoms(fremySalt); // return ["K": 4, "O": 14, "N": 2, "S": 4]
//
//        parseMolecule.getAtoms("pie"); // throw an IllegalArgumentException

public class ParseMolecule {

    public static Map<String,Integer> getAtoms(String formula) {
        formula.split("([A-Z](?:[a-z]|))");

        return new HashMap<String,Integer>();
    }

    public static void main(String[] args) {
        getAtoms("Mg(OH)2");
    }

}
