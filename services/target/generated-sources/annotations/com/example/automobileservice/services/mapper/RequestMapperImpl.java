package com.example.automobileservice.services.mapper;

import com.example.automobileservice.entity.Request;
import com.example.automobileservice.services.dto.RequestDto;
import com.example.automobileservice.services.dto.RequestDto.RequestDtoBuilder;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-13T11:52:29+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 18.0.2.1 (Oracle Corporation)"
)
@Component
public class RequestMapperImpl implements RequestMapper {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private AmenityMapper amenityMapper;

    @Override
    public RequestDto mapToDto(Request request) {
        if ( request == null ) {
            return null;
        }

        RequestDtoBuilder<?, ?> requestDto = RequestDto.builder();

        requestDto.amenityDto( amenityMapper.mapToDto( request.getAmenity() ) );
        requestDto.userDto( userMapper.mapToDto( request.getUser() ) );
        requestDto.id( request.getId() );

        return requestDto.build();
    }

    @Override
    public Request mapDtoToEntity(RequestDto requestDto) {
        if ( requestDto == null ) {
            return null;
        }

        Request request = new Request();

        request.setAmenity( amenityMapper.mapDtoToEntity( requestDto.getAmenityDto() ) );
        request.setUser( userMapper.mapDtoToEntity( requestDto.getUserDto() ) );
        request.setId( requestDto.getId() );

        return request;
    }
}
