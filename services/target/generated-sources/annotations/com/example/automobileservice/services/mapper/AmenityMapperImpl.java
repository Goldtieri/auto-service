package com.example.automobileservice.services.mapper;

import com.example.automobileservice.entity.Amenity;
import com.example.automobileservice.services.dto.AmenityDto;
import com.example.automobileservice.services.dto.AmenityDto.AmenityDtoBuilder;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-13T11:52:29+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 18.0.2.1 (Oracle Corporation)"
)
@Component
public class AmenityMapperImpl implements AmenityMapper {

    @Override
    public AmenityDto mapToDto(Amenity amenity) {
        if ( amenity == null ) {
            return null;
        }

        AmenityDtoBuilder<?, ?> amenityDto = AmenityDto.builder();

        amenityDto.id( amenity.getId() );
        amenityDto.description( amenity.getDescription() );

        return amenityDto.build();
    }

    @Override
    public Amenity mapDtoToEntity(AmenityDto amenityDto) {
        if ( amenityDto == null ) {
            return null;
        }

        Amenity amenity = new Amenity();

        amenity.setId( amenityDto.getId() );
        amenity.setDescription( amenityDto.getDescription() );

        return amenity;
    }
}
