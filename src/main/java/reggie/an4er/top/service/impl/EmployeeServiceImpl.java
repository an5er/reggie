package reggie.an4er.top.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import reggie.an4er.top.entity.Employee;
import reggie.an4er.top.mapper.EmployeeMapper;
import reggie.an4er.top.service.EmployeeService;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
