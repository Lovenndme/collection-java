package Animal;

public abstract class Animals {
    protected String name;
    protected int age;
    protected String gender;
    protected double price;
    protected String distinctiveFeatures;

    public Animals() {
    }

    public Animals(String name, int age, String gender, double price, String distinctiveFeatures) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.price = price;
        this.distinctiveFeatures = distinctiveFeatures;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //声明和get，set

    public String getDistinctiveFeatures() {
        return distinctiveFeatures;
    }

    public void setDistinctiveFeatures(String distinctiveFeatures) {
        this.distinctiveFeatures = distinctiveFeatures;
    }
    //构造器

    public abstract String toString();
}
