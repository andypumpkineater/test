// public class Person {
//     //属性
//     private String name;
//     //构造方法
//     public Person(String name){
//         this.name=name;
//     }
//     //方法
//     public void printName(){
//         System.out.println("THE PERSON'S NAME IS "+this.name);
//     }

   
// }
public class Person {
    // 属性
    private String name;

    // 构造方法
    public Person(String name) {
        this.name = name;
    }

    // 方法
    public void printName() {
        System.out.println("The person's name is: " + this.name);
    }

    // 主方法
    public static void main(String[] args) {
        Person person = new Person("Alice");
        person.printName();
    }
}

