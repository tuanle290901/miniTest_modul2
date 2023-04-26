public class Student {

    private int id;
    private String name;
    private int age;
    private int gender;
    private int avgPoint;
    private int classroom;


    public Student() {

    }

    public Student(int id, String name, int age, int gender, int avgPoint, int classroom) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.avgPoint = avgPoint;
        this.classroom = classroom;
    }




    public Student(int id, String name, int age, int gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Student(int i, String tuanle) {
    }

    public Student(String id, String name, String age, String gender, String avgPoint, String classroom) {
    }

    public Student(String id, String name) {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getAvgPoint() {
        return avgPoint;
    }

    public void setAvgPoint(int avgPoint) {
        this.avgPoint = avgPoint;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", avgPoint=" + avgPoint +
                ", Classroom='" + classroom + '\'' +
                '}';
    }
}