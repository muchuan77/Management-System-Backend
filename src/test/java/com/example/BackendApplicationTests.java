package com.example;


import com.example.entity.Employee;
import com.example.entity.User;
import com.example.mapper.EmployeeMapper;
import com.example.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hibernate.validator.internal.util.Contracts.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BackendApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private EmployeeMapper employeeMapper;

    @Test
    public void testUserCRUD() {
        // Add User
        User user = new User();
        user.setUsername("testUser");
        user.setPassword("password");
        int addUserResult = userMapper.insert(user);
        assertEquals(1, addUserResult);

        // Get User by Id
        User getUser = userMapper.selectById(user.getId());
        assertNotNull(getUser);
        assertEquals("testUser", getUser.getUsername());

        // Update User
        user.setUsername("updatedUser");
        int updateUserResult = userMapper.updateById(user);
        assertEquals(1, updateUserResult);

        // Delete User
        int deleteUserResult = userMapper.deleteById(user.getId());
        assertEquals(1, deleteUserResult);
    }

    @Test
    public void testEmployeeCRUD() {
        // Add Employee
        Employee employee = new Employee();
        employee.setEmployeeName("testEmployee");
        employee.setAge(25);
        employee.setGender("Male");
        employee.setAddress("Test Address");
        employee.setManHour(40);

        int addEmployeeResult = employeeMapper.insert(employee);
        assertEquals(1, addEmployeeResult);

        // Get Employee by Id
        Employee getEmployee = employeeMapper.selectById(employee.getId());
        assertNotNull(getEmployee);
        assertEquals("testEmployee", getEmployee.getEmployeeName());

        // Update Employee
        employee.setEmployeeName("updatedEmployee");
        int updateEmployeeResult = employeeMapper.updateById(employee);
        assertEquals(1, updateEmployeeResult);

        // Delete Employee
        int deleteEmployeeResult = employeeMapper.deleteById(employee.getId());
        assertEquals(1, deleteEmployeeResult);
    }
}
