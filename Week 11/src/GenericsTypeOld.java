public class GenericsTypeOld {
    private Object t;
    public Object get() {
        return t;
    }
    public void set(Object t) {
        this.t = t;
    }
    public static void main(String args[]){
        GenericsTypeOld type = new GenericsTypeOld();
        type.set("Java");
        System.out.println(type.get());

        GenericsTypeOld type1 = new GenericsTypeOld();
        type1.set((int) type.get());
        System.out.println(type1.get());

//        String str = (String) type.get();
//        System.out.println(str);

//        String str = type.get();
//        System.out.println(str);
//type casting, error prone and can cause ClassCastException
    }
}
