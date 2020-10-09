package com.tom.student;

public class Student {
    String id;
    String name;
    int english;
    int math;

    //IntelliJ??????  alt+Insert
    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }
    public int highest(){
//        int max = (english>math)? english : math;
        return (english > math) ? english : math;
    }
    public int getAverage(){
        return (english+math)/2;
    }
    public void print(){
        int average = getAverage();
        char grading = 'F';
        System.out.print(name + "\t" + english + "\t" + math
        + "\t" + getAverage() + "\t" + ((getAverage()>=60)? "PASS": "FAILED") );

        switch(average/10){
            case 10:
            case 9:
                 grading = 'A';
                 break;
            case 8:
                grading = 'B';
                break;
            case 7:
                grading = 'C';
                break;
            case 6:
                grading = 'D';
                break;
            default:
                grading = 'F';
                break;
        }
        System.out.println("\t" + grading);
//        if(getAverage()>=60){
//            System.out.println("\t PASS");
//        } else{
//            System.out.println("FAILED");
//        }

}
}
