/**
 * FlowerColor
 */

package flower.store;

public enum FlowerColor {
    /**
     * Flower colors.
     */
    RED("#FF0000"), BLUE("#0000FF"), PINK("#FFC0CB"), WHITE("#FFFFFF");
    private final String stringRepresentation;

    /**
     * Flower color constructor.
     */
    FlowerColor(final String stringRepresentationn) {
        this.stringRepresentation = stringRepresentationn;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }
}
