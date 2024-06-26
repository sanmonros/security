package com.spring.security.services.models.validations;

import com.spring.security.persistence.entities.UserEntity;
import com.spring.security.services.models.dto.ResponseDTO;

public class UserValidations {

    public ResponseDTO validate(UserEntity user){
        ResponseDTO response = new ResponseDTO();

        response.setNumOfErrors(0);
        if(user.getFirstName()== null ||
                user.getFirstName().length()<3 ||
                user.getFirstName().length()>15){
            response.setNumOfErrors(response.getNumOfErrors() +1 );
            response.setMessage("El campo firstname no puede ser nulo, también " +
                    "tiene que tener entre 3 y 15 caracteres");
        }
        if(user.getLastName()== null ||
                user.getLastName().length()<3 ||
                user.getLastName().length()>30){
            response.setNumOfErrors(response.getNumOfErrors() +1 );
            response.setMessage("El campo lastname no puede ser nulo, también " +
                    "tiene que tener entre 3 y 15 caracteres");
        }

        if(user.getEmail()==null || !user.getEmail().matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")){
            response.setNumOfErrors(response.getNumOfErrors() +1 );
            response.setMessage("El campo email no es valido");
        }
        if(user.getPassword()==null || !user.getPassword().matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,16}$")){
            response.setNumOfErrors(response.getNumOfErrors() +1 );
            response.setMessage("La contraseña debe tener entre 8 y 16 caracteres, al menos un numero, una minúscula y una mayúscula");
        }

        return response;
    }
}
