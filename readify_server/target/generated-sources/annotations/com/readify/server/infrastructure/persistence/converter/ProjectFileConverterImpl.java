package com.readify.server.infrastructure.persistence.converter;

import com.readify.server.domain.project.model.ProjectFile;
import com.readify.server.infrastructure.persistence.entity.ProjectFileEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-05T18:36:44+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.44.0.v20251023-0518, environment: Java 21.0.8 (Eclipse Adoptium)"
)
public class ProjectFileConverterImpl implements ProjectFileConverter {

    @Override
    public ProjectFileEntity toEntity(ProjectFile projectFile) {
        if ( projectFile == null ) {
            return null;
        }

        ProjectFileEntity projectFileEntity = new ProjectFileEntity();

        projectFileEntity.setCreateTime( projectFile.getCreateTime() );
        projectFileEntity.setDeleted( projectFile.getDeleted() );
        projectFileEntity.setFileId( projectFile.getFileId() );
        projectFileEntity.setId( projectFile.getId() );
        projectFileEntity.setProjectId( projectFile.getProjectId() );
        projectFileEntity.setUpdateTime( projectFile.getUpdateTime() );
        projectFileEntity.setUserId( projectFile.getUserId() );

        return projectFileEntity;
    }

    @Override
    public ProjectFile toDomain(ProjectFileEntity entity) {
        if ( entity == null ) {
            return null;
        }

        ProjectFile.ProjectFileBuilder projectFile = ProjectFile.builder();

        projectFile.createTime( entity.getCreateTime() );
        projectFile.deleted( entity.getDeleted() );
        projectFile.fileId( entity.getFileId() );
        projectFile.id( entity.getId() );
        projectFile.projectId( entity.getProjectId() );
        projectFile.updateTime( entity.getUpdateTime() );
        projectFile.userId( entity.getUserId() );

        return projectFile.build();
    }
}
