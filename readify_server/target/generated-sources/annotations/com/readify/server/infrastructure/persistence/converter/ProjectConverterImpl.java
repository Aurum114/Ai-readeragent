package com.readify.server.infrastructure.persistence.converter;

import com.readify.server.domain.project.model.Project;
import com.readify.server.infrastructure.persistence.entity.ProjectEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-05T18:36:44+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.44.0.v20251023-0518, environment: Java 21.0.8 (Eclipse Adoptium)"
)
public class ProjectConverterImpl implements ProjectConverter {

    @Override
    public ProjectEntity toEntity(Project project) {
        if ( project == null ) {
            return null;
        }

        ProjectEntity projectEntity = new ProjectEntity();

        projectEntity.setCreateTime( project.getCreateTime() );
        projectEntity.setDescription( project.getDescription() );
        projectEntity.setId( project.getId() );
        projectEntity.setName( project.getName() );
        projectEntity.setUpdateTime( project.getUpdateTime() );
        projectEntity.setUserId( project.getUserId() );

        return projectEntity;
    }

    @Override
    public Project toDomain(ProjectEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Project project = new Project();

        project.setCreateTime( entity.getCreateTime() );
        project.setDescription( entity.getDescription() );
        project.setId( entity.getId() );
        project.setName( entity.getName() );
        project.setUpdateTime( entity.getUpdateTime() );
        project.setUserId( entity.getUserId() );

        return project;
    }
}
