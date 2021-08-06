import java.util.Scanner;

public class Main {
    private static void inPutCommand(String input){
        if(input.equals("/help")){
            System.out.println("Example to give a command:");
            System.out.println("Command name,input");
            System.out.println("Person,23,0,666         remove int          entryset");
            System.out.println("Useful Command: Person(int,bool,int) getAge() getSex() getWeight() put(int,string) remove(int) contains(int) entrySet();");

        }else{
            int i=0;
            StringBuilder str = new StringBuilder();
            while (i < input.length()){
                if( input.charAt(i) != ' ' || input.charAt(i) != ',') {
                str.append(input.charAt(i));
                i++;
                }
            }
            String command = str.toString().toLowerCase();
            switch (command) {
                case "person":
                    System.out.println("something needs to be done here");
                    break;
                case "getage":
                    System.out.println("something needs to be done here");
                    break;
                case "getsex":
                    System.out.println("something needs to be done here");
                    break;
                case "getweight":
                    System.out.println("something needs to be done here");
                    break;
                case "put":
                    System.out.println("something needs to be done here");
                    break;
                case "remove":
                    System.out.println("something needs to be done here");
                    break;
                case "contains":
                    System.out.println("something needs to be done here");
                    break;
                case "entrySet":
                    System.out.println("something needs to be done here");
                    break;

            }
        }




    }

    public static void main(String[] args) throws NullPointerException{
        while (true){
            System.out.println("");
            System.out.println("Waiting for input. /help for more");
            Scanner sc = new Scanner(System.in);
            if(sc.hasNext()){
                String input=sc.next();
                inPutCommand(input);
            }
            // Person p1 = new Person(1);


        }
    }
}
//1.创建类Person，其中存储的成员数据为:age(int),sex(boolean),weight(int)，至少有一个构造函数可以初始化这三个属性值，同时提供获取这三个属性值的public方法

//2.实现 增删改查 +List private static Map<Integer,String> map=new HashMap<>();

