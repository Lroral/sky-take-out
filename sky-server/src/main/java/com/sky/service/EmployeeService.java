package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);


    /**
     * 新增员工
     * @param employeeDTO
     */

    void save(EmployeeDTO employeeDTO);

    /**
     * 分页查询员工
     * @param employeePageQueryDTO
     */
    PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);

    /**
     * 启用禁用员工状态
     * @param id
     * @param status
     */
    void startOrStop(Long id, Integer status);

    /**
     * 根据ID查询员工信息
     * @param id
     * @return
     */
    Employee getById(Long id);

    /**
     * 更新员工信息
     * @param employeeDTO
     */
    void update(EmployeeDTO employeeDTO);
}
