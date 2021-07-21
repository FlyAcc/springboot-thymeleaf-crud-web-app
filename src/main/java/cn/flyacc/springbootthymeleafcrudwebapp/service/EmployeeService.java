package cn.flyacc.springbootthymeleafcrudwebapp.service;

import cn.flyacc.springbootthymeleafcrudwebapp.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
}
