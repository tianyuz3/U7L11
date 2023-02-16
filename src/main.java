public class main {
    public static void main(String[] args) {
        Address test = new Address("1313","Mockingbird","6A","Springfield","MO","65123");
        System.out.println(test.toString());
        Address test2 = new Address("1313 Mockingbird Lane Apt 6A, Springfield, MO 65123");
        System.out.println(test2.toString());
    }
}
