package com.example.SDIApp.DTO;

public class ManagerDTO {
    private Integer ManagerDTOid;
    private String name;
    private Double avgWorkerSalary;


    // constructors

    public ManagerDTO(Integer id, String name, Double salary)
    {
        this.ManagerDTOid = id;
        this.name = name;
        this.avgWorkerSalary = salary;
    }


    // getters

    public Integer getManagerDTOid() {
        return ManagerDTOid;
    }

    public String getName() {
        return name;
    }

    public Double getAvgWorkerSalary() {
        return avgWorkerSalary;
    }
}
