package hello;

/**
 * Created by Adil Bozov on 30.08.2016 г..
 */
public class StaticMembers {

    public static int StaticMember;
    public int nonStaticMember;
    public static final String finalMemeber = "DSA";
    public  final String nonFinalMemeber = "asd";

    public static void main(String [] args){

        // from static methods can't call non static methods
        //testStaticVariables();
        StaticMember = 15;

        StaticMembers member = new StaticMembers();
        member.nonStaticMember = 123;
        finalMemeber = "asd";

    }


    public void testStaticVariables(){
        nonFinalMemeber = "asd";
        nonStaticMember = 15;
        StaticMember = 25;
    }

}
