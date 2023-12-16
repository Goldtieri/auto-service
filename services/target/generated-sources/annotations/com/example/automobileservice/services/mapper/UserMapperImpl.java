package com.example.automobileservice.services.mapper;

import com.example.automobileservice.entity.UserEntity;
import com.example.automobileservice.entity.UserEntity.UserEntityBuilder;
import com.example.automobileservice.services.dto.UserDto;
import com.example.automobileservice.services.dto.UserDto.UserDtoBuilder;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-13T11:52:29+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 18.0.2.1 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto mapToDto(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        UserDtoBuilder<?, ?> userDto = UserDto.builder();

        userDto.id( userEntity.getId() );
        userDto.firstName( userEntity.getFirstName() );
        userDto.lastName( userEntity.getLastName() );
        userDto.middleName( userEntity.getMiddleName() );
        userDto.email( userEntity.getEmail() );
        userDto.phoneNumber( userEntity.getPhoneNumber() );
        userDto.login( userEntity.getLogin() );
        userDto.password( userEntity.getPassword() );
        userDto.role( userEntity.getRole() );

        return userDto.build();
    }

    @Override
    public UserEntity mapDtoToEntity(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        UserEntityBuilder userEntity = UserEntity.builder();

        userEntity.id( userDto.getId() );
        userEntity.firstName( userDto.getFirstName() );
        userEntity.lastName( userDto.getLastName() );
        userEntity.middleName( userDto.getMiddleName() );
        userEntity.email( userDto.getEmail() );
        userEntity.phoneNumber( userDto.getPhoneNumber() );
        userEntity.login( userDto.getLogin() );
        userEntity.password( userDto.getPassword() );
        userEntity.role( userDto.getRole() );

        return userEntity.build();
    }
}
