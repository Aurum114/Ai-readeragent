package com.readify.server.infrastructure.persistence.converter;

import com.readify.server.domain.mind_map.model.MindMap;
import com.readify.server.infrastructure.persistence.entity.MindMapEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-05T13:30:58+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
public class MindMapConverterImpl implements MindMapConverter {

    @Override
    public MindMapEntity toEntity(MindMap mindMap) {
        if ( mindMap == null ) {
            return null;
        }

        MindMapEntity mindMapEntity = new MindMapEntity();

        mindMapEntity.setId( mindMap.getId() );
        mindMapEntity.setProjectId( mindMap.getProjectId() );
        mindMapEntity.setFileId( mindMap.getFileId() );
        mindMapEntity.setTitle( mindMap.getTitle() );
        mindMapEntity.setType( mindMap.getType() );
        mindMapEntity.setDescription( mindMap.getDescription() );
        mindMapEntity.setUserId( mindMap.getUserId() );
        mindMapEntity.setCreatedAt( mindMap.getCreatedAt() );
        mindMapEntity.setUpdatedAt( mindMap.getUpdatedAt() );
        mindMapEntity.setIsDeleted( mindMap.getIsDeleted() );

        return mindMapEntity;
    }

    @Override
    public MindMap toDomain(MindMapEntity entity) {
        if ( entity == null ) {
            return null;
        }

        MindMap mindMap = new MindMap();

        mindMap.setId( entity.getId() );
        mindMap.setProjectId( entity.getProjectId() );
        mindMap.setFileId( entity.getFileId() );
        mindMap.setTitle( entity.getTitle() );
        mindMap.setType( entity.getType() );
        mindMap.setDescription( entity.getDescription() );
        mindMap.setUserId( entity.getUserId() );
        mindMap.setCreatedAt( entity.getCreatedAt() );
        mindMap.setUpdatedAt( entity.getUpdatedAt() );
        mindMap.setIsDeleted( entity.getIsDeleted() );

        return mindMap;
    }
}
