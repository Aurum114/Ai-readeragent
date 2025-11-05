package com.readify.server.interfaces.project.converter;

import com.readify.server.domain.project.model.Project;
import com.readify.server.interfaces.project.vo.ProjectVO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-05T13:30:57+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
public class ProjectVOConverterImpl implements ProjectVOConverter {

    @Override
    public ProjectVO toVO(Project project) {
        if ( project == null ) {
            return null;
        }

        ProjectVO projectVO = new ProjectVO();

        projectVO.setId( project.getId() );
        projectVO.setUserId( project.getUserId() );
        projectVO.setName( project.getName() );
        projectVO.setDescription( project.getDescription() );
        projectVO.setCreateTime( project.getCreateTime() );
        projectVO.setUpdateTime( project.getUpdateTime() );

        return projectVO;
    }

    @Override
    public Project toDomain(ProjectVO projectVO) {
        if ( projectVO == null ) {
            return null;
        }

        Project project = new Project();

        project.setId( projectVO.getId() );
        project.setUserId( projectVO.getUserId() );
        project.setName( projectVO.getName() );
        project.setDescription( projectVO.getDescription() );
        project.setCreateTime( projectVO.getCreateTime() );
        project.setUpdateTime( projectVO.getUpdateTime() );

        return project;
    }

    @Override
    public List<ProjectVO> toVOList(List<Project> projects) {
        if ( projects == null ) {
            return null;
        }

        List<ProjectVO> list = new ArrayList<ProjectVO>( projects.size() );
        for ( Project project : projects ) {
            list.add( toVO( project ) );
        }

        return list;
    }

    @Override
    public void updateProjectVO(Project project, ProjectVO projectVO) {
        if ( project == null ) {
            return;
        }

        projectVO.setId( project.getId() );
        projectVO.setUserId( project.getUserId() );
        projectVO.setName( project.getName() );
        projectVO.setDescription( project.getDescription() );
        projectVO.setCreateTime( project.getCreateTime() );
        projectVO.setUpdateTime( project.getUpdateTime() );
    }
}
