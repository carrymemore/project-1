import java.util.HashMap;
import java.util.Map;
//Person(3) getAge() getSex() getWeight() put(int,string) remove(int) contains(int) entrySet();
public class Person {
    private int age;
    private boolean sex;
    private int weight;
    private static Map<Integer, String> map= new HashMap<>();

    public Person(int ag, boolean se, int weigh){
        age= ag;
        sex= se;
        weight= weigh;
        System.out.print("New person info saved.");
    }

    public Person(){
        System.out.print("Entry cant be empty.");
    }

    public int getAge(){
        return age;
    }

    public boolean getSex(){
        return sex;
    }

    public int getWeight(){
        return weight;
    }

    public void put(int ke, String valu){
        if(map.containsKey(ke)){ System.out.print(ke + "has been updated."); }
        else{System.out.print(ke + "created.");}
        map.put(ke, valu);
    }

    public void remove(int ke){
        map.remove(ke);
    }

    public String contains(int ke){
        if(map.containsKey(ke)){
            System.out.print(ke + "found.");
            return map.get(ke);
        }
        else{
            System.out.print(ke + "not found.");
            return null;
        }
    }

    public Object entrySet(){
        if(map.isEmpty()){return null;}
        else{return map.entrySet();}
    }

}


