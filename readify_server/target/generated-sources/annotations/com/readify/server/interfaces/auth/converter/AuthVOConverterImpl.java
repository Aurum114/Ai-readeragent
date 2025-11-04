package com.readify.server.interfaces.auth.converter;

import com.readify.server.domain.auth.model.AuthUser;
import com.readify.server.interfaces.auth.vo.LoginVO;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-03T22:50:17+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
public class AuthVOConverterImpl implements AuthVOConverter {

    @Override
    public void updateLoginVO(AuthUser user, LoginVO loginVO) {
        if ( user == null ) {
            return;
        }

        loginVO.setId( user.getId() );
        loginVO.setUsername( user.getUsername() );
        loginVO.setEnabled( user.getEnabled() );
        loginVO.setCreateTime( user.getCreateTime() );
        loginVO.setUpdateTime( user.getUpdateTime() );
    }
}
