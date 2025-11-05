package com.readify.server.infrastructure.persistence.converter;

import com.readify.server.domain.file.model.File;
import com.readify.server.infrastructure.persistence.entity.FileEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-05T18:36:44+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.44.0.v20251023-0518, environment: Java 21.0.8 (Eclipse Adoptium)"
)
public class FileConverterImpl implements FileConverter {

    @Override
    public FileEntity toEntity(File file) {
        if ( file == null ) {
            return null;
        }

        FileEntity fileEntity = new FileEntity();

        fileEntity.setCreateTime( file.getCreateTime() );
        fileEntity.setDeleted( file.getDeleted() );
        fileEntity.setId( file.getId() );
        fileEntity.setMd5( file.getMd5() );
        fileEntity.setMimeType( file.getMimeType() );
        fileEntity.setOriginalName( file.getOriginalName() );
        fileEntity.setSize( file.getSize() );
        fileEntity.setStorageName( file.getStorageName() );
        fileEntity.setStoragePath( file.getStoragePath() );
        fileEntity.setUpdateTime( file.getUpdateTime() );
        fileEntity.setVectorized( file.getVectorized() );

        return fileEntity;
    }

    @Override
    public File toDomain(FileEntity entity) {
        if ( entity == null ) {
            return null;
        }

        File.FileBuilder file = File.builder();

        file.createTime( entity.getCreateTime() );
        file.deleted( entity.getDeleted() );
        file.id( entity.getId() );
        file.md5( entity.getMd5() );
        file.mimeType( entity.getMimeType() );
        file.originalName( entity.getOriginalName() );
        file.size( entity.getSize() );
        file.storageName( entity.getStorageName() );
        file.storagePath( entity.getStoragePath() );
        file.updateTime( entity.getUpdateTime() );
        file.vectorized( entity.getVectorized() );

        return file.build();
    }
}
