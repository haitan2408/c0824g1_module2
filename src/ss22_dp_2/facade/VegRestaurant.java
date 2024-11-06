package ss22_dp_2.facade;

public class VegRestaurant implements Hotel {
    @Override
    public Menu getMenus() {
        VegMenu vegMenu = new VegMenu();
        return vegMenu;
    }
}
