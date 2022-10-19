package flower.store;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlowerStore {
    private final List<FlowerBucket> flowerBuckets = new ArrayList<>();

    public void AddBucket(FlowerBucket bucket) {
        flowerBuckets.add(bucket);
    }

    public List<FlowerBucket> Search(FlowerType type) {
        return flowerBuckets.stream().filter(bucket -> bucket.ContainsFlowerType(type)).collect(Collectors.toList());
    }
}
