package com.cormen.bim.service;

import com.cormen.bim.model.UmsMenu;
import com.cormen.bim.model.UmsPermission;
import com.cormen.bim.model.UmsRole;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 后台角色管理Service
 * Created by cormen on 2018/9/30.
 */
public interface UmsRoleService {
    /**
     * 添加角色
     */
    int create(UmsRole role);

    /**
     * 修改角色信息
     */
    int update(Long id, UmsRole role);

    /**
     * 批量删除角色
     */
    int delete(List<Long> ids);

    /**
     * 获取所有角色列表
     */
    List<UmsRole> list();

    /**
     * 分页获取角色列表
     */
    List<UmsRole> list(String keyword, Integer pageSize, Integer pageNum);

    /**
     * 根据管理员ID获取对应菜单
     */
    List<UmsMenu> getMenuList(Long adminId);

    /**
     * 获取角色相关菜单
     */
    List<UmsMenu> listMenu(Long roleId);


    /**
     * 给角色分配菜单
     */
    @Transactional
    int allocMenu(Long roleId, List<Long> menuIds);

   /*
   * 给角色分配权限
   * */
    @Transactional
    int allocPermission(long roleId,List<Long> permissions);

    /*
    * 获取角色相关权限
    * */
    List<UmsPermission> listPermission(Long roleId);
}
