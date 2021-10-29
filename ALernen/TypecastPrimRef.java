package ALernen;
public class TypecastPrimRef {
    public static void main(String[] args) {

        // String s = (String) 1;      // inline Cannot cast from int to String
        // int i = (int) "1";          // inline Cannot cast from String to int

        Long lông = (Long) 2L; // Alternativ: Long lông = 2L;
        System.out.println((Boolean) true);
        ((Integer) 2).toString();


        //Selber
        System.out.println(((Integer) 2).toString());
    }
}
