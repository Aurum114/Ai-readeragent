package com.readify.server.interfaces.user.converter;

import com.readify.server.domain.user.model.User;
import com.readify.server.interfaces.user.vo.UserVO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-03T22:50:17+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
public class UserVOConverterImpl implements UserVOConverter {

    @Override
    public UserVO toVO(User user) {
        if ( user == null ) {
            return null;
        }

        UserVO userVO = new UserVO();

        userVO.setId( user.getId() );
        userVO.setUsername( user.getUsername() );
        userVO.setEnabled( user.getEnabled() );
        userVO.setCreateTime( user.getCreateTime() );
        userVO.setUpdateTime( user.getUpdateTime() );

        return userVO;
    }

    @Override
    public User toDomain(UserVO userVO) {
        if ( userVO == null ) {
            return null;
        }

        User user = new User();

        user.setId( userVO.getId() );
        user.setUsername( userVO.getUsername() );
        user.setEnabled( userVO.getEnabled() );
        user.setCreateTime( userVO.getCreateTime() );
        user.setUpdateTime( userVO.getUpdateTime() );

        return user;
    }

    @Override
    public List<UserVO> toVOList(List<User> users) {
        if ( users == null ) {
            return null;
        }

        List<UserVO> list = new ArrayList<UserVO>( users.size() );
        for ( User user : users ) {
            list.add( toVO( user ) );
        }

        return list;
    }

    @Override
    public void updateUserVO(User user, UserVO userVO) {
        if ( user == null ) {
            return;
        }

        userVO.setId( user.getId() );
        userVO.setUsername( user.getUsername() );
        userVO.setEnabled( user.getEnabled() );
        userVO.setCreateTime( user.getCreateTime() );
        userVO.setUpdateTime( user.getUpdateTime() );
    }
}
