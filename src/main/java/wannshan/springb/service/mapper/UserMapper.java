package wannshan.springb.service.mapper;

//import org.apache.ibatis.annotations.Param;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import wannshan.springb.model.TSysMenu;
import wannshan.springb.model.TSysRole;
import wannshan.springb.model.TSysUser;

import java.util.List;

/**
 * 文件功能：xxxx
 * Created by yufei on 2018/4/11.
 */
@Mapper
public interface UserMapper {

    List<TSysMenu> getMenusByUserName(@Param("UserName") String UserName);

    List<TSysUser> loadUsersByUsername(@Param("userName") String userName);

    List<TSysRole> loadUserRolesByUserName(@Param("userName") String userName);
}
