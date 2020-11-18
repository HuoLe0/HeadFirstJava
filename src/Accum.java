class Accum {
    private static Accum a = new Accum();
    private int conter = 0;

    private Accum() {
    }

    public static Accum getAccum() {
        return a;
    }

    public int getCount() {
        return conter;
    }

    public void updateCounter(int add) {
        conter += add;}
}
