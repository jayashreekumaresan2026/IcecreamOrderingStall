package com.company;

class MenuList {
    String name;
    String flavors;
    double cost;

    void getItemDetail(String name, String flavors, double cost) {
        this.name = name;
        this.flavors = flavors;
        this.cost = cost;

    }
    void showMenuItems()
    {
        System.out.println(name + "  | " + flavors + " |  " + cost + " |");
    }


}

public class IcecreamStall {
    public static void main(String[] args) {
        int i;
        MenuList[] itemArray = new MenuList[3];
        MenuList itemList1 = new MenuList();
        System.out.println("      ICECREAM MENU LIST     ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        itemList1.getItemDetail("Stick", "Chocolate  ", 3);
        MenuList itemList2 = new MenuList();
        itemList2.getItemDetail("Cone ", " Strawberry", 1);
        MenuList itemList3 = new MenuList();
        itemList3.getItemDetail("Cup  ", "  vanilla  ", 50);
        itemArray[0] = itemList1;
        itemArray[1] = itemList2;
        itemArray[2] = itemList3;
        for (i = 0; i < (itemArray.length); i++) {
            itemArray[i].showMenuItems();
        }

    }
}
