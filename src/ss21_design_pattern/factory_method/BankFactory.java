package ss21_design_pattern.factory_method;

public class BankFactory {
    private BankFactory(){};
    public static Bank getBank(TypeBank typBank){
       switch (typBank){
           case VIETCOMBANK:
               return VietComBank.getInstance();
           case TPBANK:
               return new TPBank();
           case SACOMBANK:
               return new SacomBank();
           default:
               throw new RuntimeException("Loại ngân hàng không tồn tại");
       }
    }
}
