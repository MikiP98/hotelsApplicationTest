package pl.mikolaj.pokora.hotelsapplicationtest.remote.rest.dto.response;

import java.util.List;

public class hotelsDto {

    private List<hotelDto> hotels;


    public List<hotelDto> getHotels() {
        return hotels;
    }

    public void setHotels(List<hotelDto> hotels) {
        this.hotels = hotels;
    }
}
