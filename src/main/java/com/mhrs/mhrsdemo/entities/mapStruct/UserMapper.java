package com.mhrs.mhrsdemo.entities.mapStruct;

import com.mhrs.mhrsdemo.entities.concretes.User;
import com.mhrs.mhrsdemo.entities.dto.UserLoginDto;
import com.mhrs.mhrsdemo.entities.dto.UserRegisterDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

      UserLoginDto mapLoginToUser(User user);

      UserRegisterDto mapRegisterToUser(User user);

      User mapUserToRegister(UserRegisterDto userRegisterDto);

      User mapUserToLogin(UserLoginDto  userLoginDto);

}
