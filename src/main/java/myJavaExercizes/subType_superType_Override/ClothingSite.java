package myJavaExercizes.subType_superType_Override;

import java.util.ArrayList;
import java.util.List;

public class ClothingSite {
    public static void main(String[] args) {
        ShirtItem newShirt = new ShirtItem();
        checkoutItem(newShirt);
        JacketItem newJacket = new JacketItem();
        checkoutItem(newJacket);

        List<ClothingItem> myClothes = new ArrayList<>();
        myClothes.add(newJacket);
        myClothes.add(newShirt);

        checkOutAllItems(myClothes);
    }

    static void checkoutItem(ClothingItem item) {
        System.out.println("Item purchased: " + item.getName() + ", price: " + item.getPrice());
    }

    static void checkOutAllItems(List <ClothingItem> myNewCloths) {
        for (ClothingItem cloths: myNewCloths) {
            checkoutItem(cloths);
        }
    }
}
