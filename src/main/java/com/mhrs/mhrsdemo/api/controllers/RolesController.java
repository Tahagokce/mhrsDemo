package com.mhrs.mhrsdemo.api.controllers;


import com.mhrs.mhrsdemo.business.abstracts.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/roles")
public class RolesController {

    private RoleService roleService;

    @Autowired
    public RolesController(RoleService roleService) {
        this.roleService = roleService;
    }
}
