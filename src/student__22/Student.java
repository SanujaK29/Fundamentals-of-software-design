
package student__22;


public class Student {
    
    private String studentId;
    private String studentName;
    
    public Student (String studentId,String studentName){
    
        this.studentId=studentId;
        this.studentName=studentName;
  }
    
    public String getstudentId(){
        return studentId;
    }
    
    public void setstudentId (String studentId){
    this.studentId= studentId;
    
    }
    
        public String getstudentName(){
        return studentName;
    }
    
    public void setstudentName (String studentName){
    this.studentName= studentName;
    
    }

            

 }
