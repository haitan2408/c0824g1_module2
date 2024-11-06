package ss22_dp_2.facade;

public class NonVegRestaurant implements Hotel {
    @Override
    public Menu getMenus() {
        NonVegMenu nonVegMenu = new NonVegMenu();
        return nonVegMenu;
    }
}
