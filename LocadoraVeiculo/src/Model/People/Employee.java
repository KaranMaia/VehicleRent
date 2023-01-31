package Model.People;

public class Employee extends People {

    private String registry;

    private String password;

    public Employee(String cpf, String name, String registry, String password) {
        this.setCpf(cpf);
        this.setName(name);
        this.setPassword(password);
        this.setRegistry(registry);
    }

    @Override
    public String toString() {
        String name = this.getName();
        String registry = this.getRegistry();
        String phrase = "Funcionário " + name + ", portador da Matrícula " + registry + ".";

        return phrase;
    }

    public String getRegistry() {
        return registry;
    }

    public void setRegistry(String registry) {
        this.registry = registry;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
