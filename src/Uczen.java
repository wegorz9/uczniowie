public interface Uczen extends Comparable<Uczen> {
    void uczSie();

    @Override
    default int compareTo(Uczen o) {
        return this.getClass().getName().length() - o.getClass().getName().length();
    }

    //    '\o/'

}
