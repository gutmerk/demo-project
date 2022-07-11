 class FixedQueue implements ICharQ {
    private char q[];
    private int putloc, getloc;

    public FixedQueue (int size) {
        q = new char [size];
        putloc = getloc = 0;
    }

    public void put (char ch) {
        if (putloc ==q.length) {
            System.out.println(" - Ochered' zapolnena");
            return;
        }
        q[putloc++] = ch;
    }

    public char get () {
        if (getloc == putloc) {
            System.out.println (" - Ochered' pusta");
            return (char) 0;
        }
        return q [getloc++];
    }

}
