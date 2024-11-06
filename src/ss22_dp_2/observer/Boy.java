package ss22_dp_2.observer;

public class Boy implements Observer {
    private String name;
    public Boy(String name) {
        this.name = name;
    }
    @Override
    public void care(){
        System.out.println(this.name + "Are you OK");
    }
}
