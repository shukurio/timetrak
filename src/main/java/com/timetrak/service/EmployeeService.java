package com.timetrak.service;


import com.timetrak.dto.request.EmployeeRequestDTO;
import com.timetrak.dto.response.EmployeeResponseDTO;
import com.timetrak.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface EmployeeService {

    // Basic CRUD operations
    EmployeeResponseDTO getEmployeeById(Long id);
    EmployeeResponseDTO getEmployeeByUsername(String username);
    Page<EmployeeResponseDTO> getAllEmployees(Pageable pageable);
    Page<EmployeeResponseDTO> getAllActiveEmployees(Pageable pageable);
    EmployeeResponseDTO updateEmployee(Long id, EmployeeResponseDTO EmployeeResponseDTO);
    void deleteEmployee(Long id);

    // Employee management
    void activateEmployee(Long id);
    void deactivateEmployee(Long id);
    Page<EmployeeResponseDTO> searchEmployees(String query, Pageable pageable);
    Page<EmployeeResponseDTO> getEmployeesByDepartment(Long departmentId, Pageable pageable);

    // Legacy methods (keeping for backward compatibility)
    EmployeeResponseDTO registerEmployee(EmployeeRequestDTO dto);
    Optional<Employee> findByUsername(String username);
    //TODO login Auth Request
    //TODO Employee Statistics

    String getEmployeeNameById(Long id);
}

