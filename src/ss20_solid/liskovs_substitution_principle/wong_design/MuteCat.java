package ss20_solid.liskovs_substitution_principle.wong_design;

public class MuteCat extends Animal  {

    public void makeNoise() {
        throw new RuntimeException("I can't make noise");
    }
}
