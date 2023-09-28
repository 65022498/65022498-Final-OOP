import java.util.ArrayList;

public class Employee implements Job, Person {

    private String name;
    private int age;
    private String position;
    private String empID;
    private ArrayList<Project> myProjects;

    Employee() {
        myProjects = new ArrayList<Project>();
    }


    public void addProject(Project project) {
        myProjects.add(project);
    }


    public void showDetail() {
        String lineSpacing = "********************************************************\n";
        String detail = String.format("Name: %s\nPosition: %s\nEmpID: %s", getName(), getPosition(), getEmpID());
        String title = String.format("Project(%d)", myProjects.size());

        System.out.println(lineSpacing + detail);
        System.out.println(title);
        for (Project project : myProjects) {
            System.out.println("\t" + project.getProject());
        }
        System.out.println();
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        if( name.length() == 0) {
            System.out.println("can\'t set the name as \"\\\"");
            return;
        }

        this.name = name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getPosition() {
        return this.position;
    }

    @Override
    public void setPosition(String pos) {
        this.position = pos;
    }

    @Override
    public String getEmpID() {
        return this.empID;
    }

    @Override
    public void setEmpID(String id) {
        this.empID = id;
    }
    
}
