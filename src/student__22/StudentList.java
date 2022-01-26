
package student__22;


public class StudentList {
    public static void main(String[] args){
       Student[] studentList = new Student[4];
       studentList[0]= new Student("s1","Sanuja Kumarage");
       studentList[1]= new Student("s2","John Cox");
       studentList[2]= new Student("s3","Jessie Holmes");
    
       
       
       for(int i=0; i<studentList.length; i++){
         System.out.println(studentList[i].getstudentId());
         System.out.println(studentList[i].getstudentName());
         
       }
       
    }
    
}
