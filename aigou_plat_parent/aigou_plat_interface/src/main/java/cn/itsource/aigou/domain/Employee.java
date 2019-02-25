package cn.itsource.aigou.domain;

public class Employee {
    private Long id;
    private String name;
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Employee(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public Employee() {
    }
}
