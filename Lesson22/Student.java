package Lesson22;

public class Student {
    private StringBuilder name;
    private int course;
    private int grade;

    public StringBuilder getName(){
        StringBuilder name2 = new StringBuilder(name);
        return name2;
    }

    public void setName(StringBuilder name){
        if(name.length()>3){
            this.name=name;
        }
    }

    public int getCourse(){
        return course;
    }

    public void setCourse(int course) {
        if(course >=1 && course < 5){
            this.course=course;
        }
    }

    public int getGrade(){
        return grade;
    }

    public void setGrade(int grade){
        if(grade >=1 && grade <11) {
            this.grade = grade;
        }
    }

    public void ShowInfo(){
        System.out.println("Name: " + getName() + ", course:" + getCourse()+ ",  grade:"+ getGrade());
    }

}


