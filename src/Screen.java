public class Screen implements ScreenSpec{
    String resolution;
    int refreshrate;
    int responsetime;

    @Override
    public String getResolution() {
        return resolution;
    }

    @Override
    public int getRefreshRate() {
        return refreshrate;
    }

    @Override
    public int getResponseTime() {
        return responsetime;
    }

    @Override
    public String toString() {
        return "resolution :" + resolution  +
                "\n refreshrate :" + refreshrate +
                "\n responsetime :" + responsetime;
    }
}
