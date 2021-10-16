package lemon;

public class FreshLemon {

    private String acidity;
    private String color;
    private int size;

    public FreshLemon(String acidity, String color, int size) {
        this.acidity = acidity;
        this.color = color;
        this.size = size;
    }

    public static FreshLemon ofAcidityAndColorAndSize(String acidity, String color, int size) {
        return new FreshLemon(
                acidity, color, size
        );
    }

    public String getAcidity() {
        return acidity;
    }

    public void setAcidity(String acidity) {
        this.acidity = acidity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
