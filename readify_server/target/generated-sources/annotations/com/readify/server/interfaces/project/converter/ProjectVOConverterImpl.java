package com.readify.server.interfaces.project.converter;

import com.readify.server.domain.project.model.Project;
import com.readify.server.interfaces.project.vo.ProjectVO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-05T18:36:44+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.44.0.v20251023-0518, environment: Java 21.0.8 (Eclipse Adoptium)"
)
public class ProjectVOConverterImpl implements ProjectVOConverter {

    @Override
    public ProjectVO toVO(Project project) {
        if ( project == null ) {
            return null;
        }

        ProjectVO projectVO = new ProjectVO();

        projectVO.setCreateTime( project.getCreateTime() );
        projectVO.setDescription( project.getDescription() );
        projectVO.setId( project.getId() );
        projectVO.setName( project.getName() );
        projectVO.setUpdateTime( project.getUpdateTime() );
        projectVO.setUserId( project.getUserId() );

        return projectVO;
    }

    @Override
    public Project toDomain(ProjectVO projectVO) {
        if ( projectVO == null ) {
            return null;
        }

        Project project = new Project();

        project.setCreateTime( projectVO.getCreateTime() );
        project.setDescription( projectVO.getDescription() );
        project.setId( projectVO.getId() );
        project.setName( projectVO.getName() );
        project.setUpdateTime( projectVO.getUpdateTime() );
        project.setUserId( projectVO.getUserId() );

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

        projectVO.setCreateTime( project.getCreateTime() );
        projectVO.setDescription( project.getDescription() );
        projectVO.setId( project.getId() );
        projectVO.setName( project.getName() );
        projectVO.setUpdateTime( project.getUpdateTime() );
        projectVO.setUserId( project.getUserId() );
    }
}
