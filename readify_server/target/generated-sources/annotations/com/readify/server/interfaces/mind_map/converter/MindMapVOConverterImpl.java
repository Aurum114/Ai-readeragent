package com.readify.server.interfaces.mind_map.converter;

import com.readify.server.domain.mind_map.model.MindMap;
import com.readify.server.interfaces.mind_map.vo.MindMapVO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-05T18:36:44+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.44.0.v20251023-0518, environment: Java 21.0.8 (Eclipse Adoptium)"
)
public class MindMapVOConverterImpl implements MindMapVOConverter {

    @Override
    public MindMapVO toVO(MindMap mindMap) {
        if ( mindMap == null ) {
            return null;
        }

        MindMapVO mindMapVO = new MindMapVO();

        mindMapVO.setDescription( mindMap.getDescription() );
        mindMapVO.setFileId( mindMap.getFileId() );
        mindMapVO.setId( mindMap.getId() );
        mindMapVO.setProjectId( mindMap.getProjectId() );
        mindMapVO.setTitle( mindMap.getTitle() );
        mindMapVO.setType( mindMap.getType() );

        return mindMapVO;
    }

    @Override
    public MindMap toDomain(MindMapVO mindMapVO) {
        if ( mindMapVO == null ) {
            return null;
        }

        MindMap mindMap = new MindMap();

        mindMap.setDescription( mindMapVO.getDescription() );
        mindMap.setFileId( mindMapVO.getFileId() );
        mindMap.setId( mindMapVO.getId() );
        mindMap.setProjectId( mindMapVO.getProjectId() );
        mindMap.setTitle( mindMapVO.getTitle() );
        mindMap.setType( mindMapVO.getType() );

        return mindMap;
    }

    @Override
    public List<MindMapVO> toVOList(List<MindMap> mindMaps) {
        if ( mindMaps == null ) {
            return null;
        }

        List<MindMapVO> list = new ArrayList<MindMapVO>( mindMaps.size() );
        for ( MindMap mindMap : mindMaps ) {
            list.add( toVO( mindMap ) );
        }

        return list;
    }

    @Override
    public void updateMindMapVO(MindMap mindMap, MindMapVO mindMapVO) {
        if ( mindMap == null ) {
            return;
        }

        mindMapVO.setDescription( mindMap.getDescription() );
        mindMapVO.setFileId( mindMap.getFileId() );
        mindMapVO.setId( mindMap.getId() );
        mindMapVO.setProjectId( mindMap.getProjectId() );
        mindMapVO.setTitle( mindMap.getTitle() );
        mindMapVO.setType( mindMap.getType() );
    }
}
