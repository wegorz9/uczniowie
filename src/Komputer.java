public interface Komputer extends Comparable<Komputer>{
    void uruchom();
    void zepsujSie();

    @Override
    default int compareTo(Komputer o){
        int len = Math.max(o.getClass().getName().length(), this.getClass().getName().length());
        int result = 0;
        int index = 0;
        while (result == 0){
            if(index >= len) return 0;
            result = Character.compare(this.getClass().getName().charAt(index), o.getClass().getName().charAt(index));
            index++;
        }
        return result;
    }
}
