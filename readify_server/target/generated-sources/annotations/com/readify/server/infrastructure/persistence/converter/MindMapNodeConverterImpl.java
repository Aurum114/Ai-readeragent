package com.readify.server.infrastructure.persistence.converter;

import com.readify.server.domain.mind_map.model.MindMapNode;
import com.readify.server.infrastructure.persistence.entity.MindMapNodeEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-05T18:36:44+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.44.0.v20251023-0518, environment: Java 21.0.8 (Eclipse Adoptium)"
)
public class MindMapNodeConverterImpl implements MindMapNodeConverter {

    @Override
    public MindMapNodeEntity toEntity(MindMapNode node) {
        if ( node == null ) {
            return null;
        }

        MindMapNodeEntity mindMapNodeEntity = new MindMapNodeEntity();

        mindMapNodeEntity.setContent( node.getContent() );
        mindMapNodeEntity.setCreatedTime( node.getCreatedTime() );
        mindMapNodeEntity.setDeleted( node.getDeleted() );
        mindMapNodeEntity.setFileId( node.getFileId() );
        mindMapNodeEntity.setId( node.getId() );
        mindMapNodeEntity.setLevel( node.getLevel() );
        mindMapNodeEntity.setMindMapId( node.getMindMapId() );
        mindMapNodeEntity.setParentId( node.getParentId() );
        mindMapNodeEntity.setProjectId( node.getProjectId() );
        mindMapNodeEntity.setSequence( node.getSequence() );
        mindMapNodeEntity.setUpdatedTime( node.getUpdatedTime() );

        return mindMapNodeEntity;
    }

    @Override
    public MindMapNode toDomain(MindMapNodeEntity entity) {
        if ( entity == null ) {
            return null;
        }

        MindMapNode mindMapNode = new MindMapNode();

        mindMapNode.setContent( entity.getContent() );
        mindMapNode.setCreatedTime( entity.getCreatedTime() );
        mindMapNode.setDeleted( entity.getDeleted() );
        mindMapNode.setFileId( entity.getFileId() );
        mindMapNode.setId( entity.getId() );
        mindMapNode.setLevel( entity.getLevel() );
        mindMapNode.setMindMapId( entity.getMindMapId() );
        mindMapNode.setParentId( entity.getParentId() );
        mindMapNode.setProjectId( entity.getProjectId() );
        mindMapNode.setSequence( entity.getSequence() );
        mindMapNode.setUpdatedTime( entity.getUpdatedTime() );

        return mindMapNode;
    }

    @Override
    public List<MindMapNodeEntity> toEntityList(List<MindMapNode> nodes) {
        if ( nodes == null ) {
            return null;
        }

        List<MindMapNodeEntity> list = new ArrayList<MindMapNodeEntity>( nodes.size() );
        for ( MindMapNode mindMapNode : nodes ) {
            list.add( toEntity( mindMapNode ) );
        }

        return list;
    }

    @Override
    public List<MindMapNode> toDomainList(List<MindMapNodeEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<MindMapNode> list = new ArrayList<MindMapNode>( entities.size() );
        for ( MindMapNodeEntity mindMapNodeEntity : entities ) {
            list.add( toDomain( mindMapNodeEntity ) );
        }

        return list;
    }
}
