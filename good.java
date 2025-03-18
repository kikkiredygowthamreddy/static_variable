class phone
{
    String mobile;
    int price;
 static String name;
    public void show()
{
 System.out.println(mobile + " : " + name);
}
}

public class good{
    public static void main(String args[]){

phone ob1 = new phone();
ob1.mobile = "nokia";
ob1.price = 230;
phone.name = "dell";

phone.name = "gemini";

ob1.show();
    }
}