public class Project {
    private String projectName;
    private String descrition;

    public String getProject() {
        return String.format("%s \t: \t%s", this.projectName, this.descrition);
    }

    public Project(String name, String des) {
        this.projectName = name;
        this.descrition = des;
    }

} 
