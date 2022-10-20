public class main {


    String languages;

    public main(String lang) {

        languages = lang;
        System.out.println(languages + "Programming language ");

    }


    public static void main(String[] args)
    {

        main obj1= new main("Java");
        main obj2 = new main("Python");
    }

}
