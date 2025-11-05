package com.readify.server.infrastructure.persistence.converter;

import com.readify.server.domain.project.model.Project;
import com.readify.server.infrastructure.persistence.entity.ProjectEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-05T13:30:58+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
public class ProjectConverterImpl implements ProjectConverter {

    @Override
    public ProjectEntity toEntity(Project project) {
        if ( project == null ) {
            return null;
        }

        ProjectEntity projectEntity = new ProjectEntity();

        projectEntity.setId( project.getId() );
        projectEntity.setUserId( project.getUserId() );
        projectEntity.setName( project.getName() );
        projectEntity.setDescription( project.getDescription() );
        projectEntity.setCreateTime( project.getCreateTime() );
        projectEntity.setUpdateTime( project.getUpdateTime() );

        return projectEntity;
    }

    @Override
    public Project toDomain(ProjectEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Project project = new Project();

        project.setId( entity.getId() );
        project.setUserId( entity.getUserId() );
        project.setName( entity.getName() );
        project.setDescription( entity.getDescription() );
        project.setCreateTime( entity.getCreateTime() );
        project.setUpdateTime( entity.getUpdateTime() );

        return project;
    }
}
