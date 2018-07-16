package sg.edu.rp.c346.exercise2;

/**
 * Created by 16020089 on 16/7/2018.
 */

public class Employeeitem {

    private String name;
    private String job;
    private Float pay;

    public Employeeitem(String name, String job, Float pay) {
        this.name = name;
        this.job = job;
        this.pay = pay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Float getPay() {
        return pay;
    }

    public void setPay(Float pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Employeeitem{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", pay=" + pay +
                '}';
    }
}
