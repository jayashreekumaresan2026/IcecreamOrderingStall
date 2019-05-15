package com.company;

class MenuList {
    String name;
    String flavors;

    void getItemDetail(String name, String flavors) {
        this.name = name;
        this.flavors = flavors;


    }
    void showMenuItems()
    {
        System.out.println("|"+name + "  | " + flavors + " |  " );
    }


}

public class IcecreamStall {
    public static void main(String[] args) {
        int i;
        MenuList[] itemArray = new MenuList[3];
        MenuList itemList1 = new MenuList();
        System.out.println("      ICE CREAM MENU LIST     ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        itemList1.getItemDetail("Stick", " Chocolate  ");
        MenuList itemList2 = new MenuList();
        itemList2.getItemDetail("Cone ", " Strawberry");
        MenuList itemList3 = new MenuList();
        itemList3.getItemDetail("Cup  ", "  vanilla  ");
        itemArray[0] = itemList1;
        itemArray[1] = itemList2;
        itemArray[2] = itemList3;
        for (i = 0; i < (itemArray.length); i++) {
            itemArray[i].showMenuItems();
        }

    }
}
