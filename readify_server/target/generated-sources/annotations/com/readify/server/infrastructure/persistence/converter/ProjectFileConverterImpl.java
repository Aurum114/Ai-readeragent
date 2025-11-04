package com.readify.server.infrastructure.persistence.converter;

import com.readify.server.domain.project.model.ProjectFile;
import com.readify.server.infrastructure.persistence.entity.ProjectFileEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-03T22:50:17+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
public class ProjectFileConverterImpl implements ProjectFileConverter {

    @Override
    public ProjectFileEntity toEntity(ProjectFile projectFile) {
        if ( projectFile == null ) {
            return null;
        }

        ProjectFileEntity projectFileEntity = new ProjectFileEntity();

        projectFileEntity.setId( projectFile.getId() );
        projectFileEntity.setProjectId( projectFile.getProjectId() );
        projectFileEntity.setUserId( projectFile.getUserId() );
        projectFileEntity.setFileId( projectFile.getFileId() );
        projectFileEntity.setCreateTime( projectFile.getCreateTime() );
        projectFileEntity.setUpdateTime( projectFile.getUpdateTime() );
        projectFileEntity.setDeleted( projectFile.getDeleted() );

        return projectFileEntity;
    }

    @Override
    public ProjectFile toDomain(ProjectFileEntity entity) {
        if ( entity == null ) {
            return null;
        }

        ProjectFile.ProjectFileBuilder projectFile = ProjectFile.builder();

        projectFile.id( entity.getId() );
        projectFile.projectId( entity.getProjectId() );
        projectFile.userId( entity.getUserId() );
        projectFile.fileId( entity.getFileId() );
        projectFile.createTime( entity.getCreateTime() );
        projectFile.updateTime( entity.getUpdateTime() );
        projectFile.deleted( entity.getDeleted() );

        return projectFile.build();
    }
}
