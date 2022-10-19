package flower.store;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    private final List<FlowerPack> flowerPacks = new ArrayList<>();

    public void add(FlowerPack pack) {
        flowerPacks.add(pack);
    }

    public double getPrice() {
        return flowerPacks.stream().mapToDouble(FlowerPack::getPrice).sum();
    }

    public boolean ContainsFlowerType(FlowerType type) {
        return flowerPacks.stream().anyMatch(pack -> pack.GetFlowerType() == type);
    }
}

