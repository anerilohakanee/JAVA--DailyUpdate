package Constructor;

class Project{

    String projectName = "OnlineEdu";
    int noOfEmp = 20;

    void ClientInfo(){

        String clientName = "Incubator";
        

        System.out.println("Client Name :" + clientName);
        System.out.println("Project Name :" + projectName);
        System.out.println("No. Of Employes :" + noOfEmp);

    }

    public static void main(String[] args) {
        
        System.out.println("In main");

        Project obj = new Project();
        obj.ClientInfo();
    }
}