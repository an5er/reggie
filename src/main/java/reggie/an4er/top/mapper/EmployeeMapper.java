package reggie.an4er.top.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import reggie.an4er.top.entity.Employee;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
