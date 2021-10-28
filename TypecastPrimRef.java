public class TypecastPrimRef {
    public static void main(String[] args) {
        Long lông = (Long) 2L; // Alternativ: Long lông = 2L;
        System.out.println((Boolean) true);
        ((Integer) 2).toString();


        //Selber
        System.out.println(((Integer) 2).toString());
    }
}
