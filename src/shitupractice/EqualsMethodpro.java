package shitupractice;

public class EqualsMethodpro {
    public int id;
    public String name;

    EqualsMethodpro(int id, String name) {
        this.id = id;
        this.name = name;

    }
    EqualsMethodpro(){

    }

    public static void main(String[] args) throws Throwable {
        EqualsMethodpro e = new EqualsMethodpro(1, "Prakash");
        EqualsMethodpro e1 = new EqualsMethodpro(5, "shital");
        EqualsMethodpro e2 = new EqualsMethodpro(1, "Prakash");
        EqualsMethodpro e3 = new EqualsMethodpro(8, "sinu");
        EqualsMethodpro e4 = e;


        System.out.println(e1.equals(e));
        System.out.println(e2.equals(e3));
        System.out.println(e2.equals(e));
        System.out.println(e4.equals(e));

        //getclass() method

        Object o = new String("hi");
        Class<?> aClass = o.getClass();
        System.out.println(aClass.getName());
        EqualsMethodpro eq=new EqualsMethodpro();
        eq.finalize();

    }
    // Overriding finalize() to perform cleanup
        @Override
        protected void finalize() throws Throwable {
            try {
                System.out.println("Inside Geeks's finalize()");
            } catch (Throwable e) {
                throw e;
            } finally {
                System.out.println("Calling finalize() of Object class");

                // call to Object class finalize()
                super.finalize();
            }

    }
}

