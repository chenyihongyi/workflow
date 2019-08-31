package com.workflow.demo.controller.system.login;

import com.workflow.demo.controller.base.BaseController;
import com.workflow.demo.service.fhoa.datajur.DatajurManager;
import com.workflow.demo.service.system.appuser.AppuserManager;
import com.workflow.demo.service.system.buttonrightsManager.ButtonrightsManager;
import com.workflow.demo.service.system.fhbutton.FhbuttonManager;
import com.workflow.demo.service.system.fhlog.FHlogManager;
import com.workflow.demo.service.system.loginimg.LogInImgManager;
import com.workflow.demo.service.system.role.RoleManager;
import com.workflow.demo.service.system.user.UserManager;
import com.workflow.demo.service.system.menu.MenuManager;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @Author: Elvis
 * @Date: 2019/8/31 21:10
 */
@Controller
public class LoginController extends BaseController {

    @Resource(name="userService")
    private UserManager userService;
    @Resource(name="menuService")
    private MenuManager menuService;
    @Resource(name="roleService")
    private RoleManager roleService;
    @Resource(name="buttonrightsService")
    private ButtonrightsManager buttonrightsService;
    @Resource(name="fhbuttonService")
    private FhbuttonManager fhbuttonService;
    @Resource(name="appuserService")
    private AppuserManager appuserService;
    @Resource(name="datajurService")
    private DatajurManager datajurService;
    @Resource(name="fhlogService")
    private FHlogManager FHLOG;
    @Resource(name="loginimgService")
    private LogInImgManager loginimgService;

}
