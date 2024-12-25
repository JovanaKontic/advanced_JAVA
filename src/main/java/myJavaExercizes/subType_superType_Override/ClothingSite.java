package myJavaExercizes.subType_superType_Override;

public class ClothingSite {
    public static void main(String[] args) {
        ShirtItem newShirt = new ShirtItem();
        checkoutItem(newShirt);
        JacketItem newJacket = new JacketItem();
        checkoutItem(newJacket);
    }

    static void checkoutItem(ClothingItem item) {
        System.out.println("Item purchased: " + item.getName() + ", price: " + item.getPrice());
    }
}
