/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vm.Q2.mapper;

import com.vm.Q2.dto.UserDTO;
import com.vm.Q2.models.User;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


/**
 *
 * @author Ashok
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface UserMapper {
 
       UserDTO  userToUserDTO(User user);
       
       User userDTOToUser(UserDTO userDTO);
       
       List<UserDTO> usersToUserDTOs(List<User> user);

     
}
