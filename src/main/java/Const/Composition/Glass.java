package Const.Composition;

public class Glass {
    int Glass_num;



    public int getGlass_num() {
        return Glass_num;
    }

    @Override
    public String toString() {
        return "Glass{" +
                "Glass_num=" + Glass_num +
                '}';
    }

    public void setGlass_num(int glass_num) {
        Glass_num = glass_num;
    }

    public Glass(int glass_num) {
        Glass_num = glass_num;
    }
}
