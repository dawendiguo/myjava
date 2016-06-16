public class Student{
    public     String name;
    public      double score;
    Student(String n,double s){
        this.name = n;;
        this.score = s;}

    public String tostring(){
        String output = this.name + " The score: "+ this.score;
        return output;
    }
}
