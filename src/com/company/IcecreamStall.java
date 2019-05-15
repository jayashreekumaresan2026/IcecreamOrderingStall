package com.company;

class MenuList {
    String name;
    String flavors;
    double iceCreamCost;
    double flavourCost;

    void getItemDetail(String name, double iceCreamCost, String flavors, double flavourCost) {
        this.name = name;
        this.flavors = flavors;
        this.iceCreamCost = iceCreamCost;
        this.flavourCost = flavourCost;

    }

    void showMenuItems() {
        System.out.println("|" + name + "  | " + iceCreamCost + " |  " + flavors + "  | " + flavourCost);
    }


}

class SumTypeAndflavoursCost {
    void sumTypeAndflavoursCost(MenuList menuList) {
        double typeandflavourcost;
        typeandflavourcost = menuList.iceCreamCost + menuList.flavourCost;
        System.out.println(typeandflavourcost);

    }

}

public class IcecreamStall {
    public static void main(String[] args) {
        int i;
        MenuList[] itemArray = new MenuList[3];
        MenuList itemList1 = new MenuList();
        System.out.println("      ICE CREAM MENU LIST     ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        itemList1.getItemDetail("Stick", 20, "chocolate", 5);
        MenuList itemList2 = new MenuList();
        itemList2.getItemDetail("Cone ", 30, "strawberry", 9);
        MenuList itemList3 = new MenuList();
        itemList3.getItemDetail("Cup  ", 25, "vanilla", 15);
        itemArray[0] = itemList1;
        itemArray[1] = itemList2;
        itemArray[2] = itemList3;
        for (i = 0; i < (itemArray.length); i++) {
            itemArray[i].showMenuItems();
        }
        SumTypeAndflavoursCost object1 = new SumTypeAndflavoursCost();
        System.out.println();
        System.out.println("Sum cost each of itemType and flavour");
        object1.sumTypeAndflavoursCost(itemList1);
        object1.sumTypeAndflavoursCost(itemList2);
        object1.sumTypeAndflavoursCost(itemList3);

    }
}

