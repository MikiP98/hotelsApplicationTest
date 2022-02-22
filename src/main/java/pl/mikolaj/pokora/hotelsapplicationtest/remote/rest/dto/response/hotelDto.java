package pl.mikolaj.pokora.hotelsapplicationtest.remote.rest.dto.response;

import java.util.List;

public class hotelDto {

    private Integer id;
    private String name;
    private List<roomDto> rooms;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<roomDto> getRooms() {
        return rooms;
    }

    public void setRooms(List<roomDto> rooms) {
        this.rooms = rooms;
    }
}
