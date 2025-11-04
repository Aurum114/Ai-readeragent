package com.readify.server.infrastructure.persistence.converter;

import com.readify.server.domain.file.model.File;
import com.readify.server.infrastructure.persistence.entity.FileEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-03T22:50:16+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
public class FileConverterImpl implements FileConverter {

    @Override
    public FileEntity toEntity(File file) {
        if ( file == null ) {
            return null;
        }

        FileEntity fileEntity = new FileEntity();

        fileEntity.setId( file.getId() );
        fileEntity.setOriginalName( file.getOriginalName() );
        fileEntity.setStorageName( file.getStorageName() );
        fileEntity.setSize( file.getSize() );
        fileEntity.setMimeType( file.getMimeType() );
        fileEntity.setStoragePath( file.getStoragePath() );
        fileEntity.setMd5( file.getMd5() );
        fileEntity.setCreateTime( file.getCreateTime() );
        fileEntity.setUpdateTime( file.getUpdateTime() );
        fileEntity.setDeleted( file.getDeleted() );
        fileEntity.setVectorized( file.getVectorized() );

        return fileEntity;
    }

    @Override
    public File toDomain(FileEntity entity) {
        if ( entity == null ) {
            return null;
        }

        File.FileBuilder file = File.builder();

        file.id( entity.getId() );
        file.originalName( entity.getOriginalName() );
        file.storageName( entity.getStorageName() );
        file.size( entity.getSize() );
        file.mimeType( entity.getMimeType() );
        file.storagePath( entity.getStoragePath() );
        file.md5( entity.getMd5() );
        file.createTime( entity.getCreateTime() );
        file.updateTime( entity.getUpdateTime() );
        file.deleted( entity.getDeleted() );
        file.vectorized( entity.getVectorized() );

        return file.build();
    }
}
