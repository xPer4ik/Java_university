package Task_17.Task_17_1;

public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view){
        this.model = model;
        this.view = view;
    }
    public void setStudentName(String name){
        this.model.setName(name);
    }
    public String getStudentName(){
        return this.model.getName();
    }
    public void setStudentRollNo(String rollNo){
        this.model.setRollNo(rollNo);
    }
    public String getStudentRollNo(){
        return this.model.getRollNo();
    }
    public void updateView(){
        view.printStudentDetails(model.getRollNo(), model.getName());
    }
}
