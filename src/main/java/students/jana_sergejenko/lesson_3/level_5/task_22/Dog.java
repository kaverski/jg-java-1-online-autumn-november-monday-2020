package students.jana_sergejenko.lesson_3.level_5.task_22;

class Dog {
    String name;
    int age;
    String color;

    public Dog(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color=color;
    }
    String changeColor(String color) {
        return this.color=color;
    }

    public void voice(){
        System.out.println("Dog name: " + this.name + "\ndog age: " + this.age + "\ndog color "+color);
    }
}