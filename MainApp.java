public class MainApp {
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String PURPLE_BACKGROUND_BRIGHT = "\033[0;105m"; // PURPLE
    
    public static void main(String[] args) {

        Employee star = CreateEmployee("Star Butterfly", 18, "Animation", "svfe");
        Employee alice = CreateEmployee("Alice", 21, "UX/UI", "u12");
        Employee poppy = CreateEmployee("Poppy", 32, "Fullstack", "h19");

        star.addProject( new Project("Marco", "Design Character for animation."));
        star.addProject( new Project("Frozen", "Frozen 3 Aniamtion 3D"));
        star.addProject( new Project("Corn", "Creating Product's doll"));


        alice.addProject( new Project("Mimi Po", "Developing web application"));
        alice.addProject( new Project("UP Academy", "Developing a mobile application"));

        poppy.addProject( new Project("Uwu express", "Developing E-commerce website."));
        
        star.showDetail();
        alice.showDetail();
        poppy.showDetail();
    }

    public static Employee CreateEmployee(String name, int age, String pos, String id) {
        Employee emp = new Employee();
        emp.setName(name);
        emp.setAge(age);
        emp.setPosition(pos);
        emp.setEmpID(id);

        return emp;
    }


}
