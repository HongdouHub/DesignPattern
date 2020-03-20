package designpattern.no9_prototype.test4;

public class ConcretePrototype2 implements Prototype {

    private String name;

    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public ConcretePrototype2 clone() {
        ConcretePrototype2 prototype = new ConcretePrototype2();
        prototype.setName(this.name);
        prototype.setAge(this.age);
        return prototype;
    }

    @Override
    public String toString() {
        return "ConcretePrototype2{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
