package ss21_design_pattern.factory_method;

public class VietComBank implements Bank {
    private static VietComBank instance = new VietComBank();

    private VietComBank() {}

    public static VietComBank getInstance() {
        return instance;
    }

    @Override
    public String getNameBank() {
        return "VietComBank";
    }
}
