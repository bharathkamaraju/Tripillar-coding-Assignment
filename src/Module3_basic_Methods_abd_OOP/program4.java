package Module3_basic_Methods_abd_OOP;

public class program4 {
        int Add(int a, int b) {
            int add = a + b;
            return add;
        }

        int Sub(int a, int b) {
            int sub = a - b;
            return sub;
        }

        public static void main(String[] args) {
            program4 ob = new program4();
            program4 os = new program4();
            System.out.println(ob.Add(5, 6));
            System.out.println(os.Sub(10, 6));
        }
    }

