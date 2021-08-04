package com.cormen.bim.dao;

import com.cormen.bim.model.UmsMenu;
import com.cormen.bim.model.UmsPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 自定义后台角色管理Dao
 * Created by cormen on 2020/2/2.
 */
public interface UmsRoleDao {
    /**
     * 根据后台用户ID获取菜单
     */
    List<UmsMenu> getMenuList(@Param("adminId") Long adminId);
    /**
     * 根据角色ID获取菜单
     */
    List<UmsMenu> getMenuListByRoleId(@Param("roleId") Long roleId);

    List<UmsPermission> getPermissionByRoleId(@Param("roleId") Long roleId);

}
