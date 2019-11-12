package com.svk.springboot.springbootproject.dto.validators;

import com.svk.springboot.springbootproject.dto.UserDTO;
import com.svk.springboot.springbootproject.dto.annotations.PasswordMatches;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object> {

   public void initialize(PasswordMatches constraint) {
   }

   public boolean isValid(Object obj, ConstraintValidatorContext context) {
      UserDTO user = (UserDTO) obj;
      return user.getPassword().equals(user.getMatchingPassword());
   }
}
