package com.readify.server.infrastructure.persistence.converter;

import com.readify.server.domain.user.model.User;
import com.readify.server.infrastructure.persistence.entity.UserEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-03T22:50:17+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
public class UserConverterImpl implements UserConverter {

    @Override
    public UserEntity toEntity(User user) {
        if ( user == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setId( user.getId() );
        userEntity.setUsername( user.getUsername() );
        userEntity.setEnabled( user.getEnabled() );
        userEntity.setCreateTime( user.getCreateTime() );
        userEntity.setUpdateTime( user.getUpdateTime() );

        return userEntity;
    }

    @Override
    public User toDomain(UserEntity entity) {
        if ( entity == null ) {
            return null;
        }

        User user = new User();

        user.setId( entity.getId() );
        user.setUsername( entity.getUsername() );
        user.setEnabled( entity.getEnabled() );
        user.setCreateTime( entity.getCreateTime() );
        user.setUpdateTime( entity.getUpdateTime() );

        return user;
    }
}
