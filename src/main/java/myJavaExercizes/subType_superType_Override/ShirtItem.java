package myJavaExercizes.subType_superType_Override;

public class ShirtItem extends ClothingItem{
    @Override
    int getPrice() {
        return 10;
    }

    @Override
    String getName() {
        return "Shirt";
    }
}
