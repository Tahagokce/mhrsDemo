package com.mhrs.mhrsdemo.business.concretes;

import com.mhrs.mhrsdemo.business.abstracts.RoleService;
import com.mhrs.mhrsdemo.dataAccess.abstracts.RoleDao;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleManager implements RoleService {

    private final RoleDao roleDao;

}
