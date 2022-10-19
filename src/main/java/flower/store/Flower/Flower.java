/**
 * Flowers
 */

package flower.store.Flower;

import flower.store.FlowerColor;
import flower.store.FlowerType;
import lombok.Getter;
import lombok.Setter;


@Setter
public class Flower {
    @Getter
    private double sepalLength;
    protected FlowerColor color;
    @Getter
    private double price;

    private FlowerType flowerType;

    public String getColor() {
        return color.toString();
    }

    public final FlowerType getFlowerType() {
        return flowerType;
    }
}

