package pl.mikolaj.pokora.hotelsapplicationtest.remote.rest.dto.response;

import pl.mikolaj.pokora.hotelsapplicationtest.remote.rest.dto.status;

import java.util.List;

public class reservationDto {

    private Integer id;
    private status status;
    private List<roomReservationDto> roomsReservation;
    private personDto person;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public pl.mikolaj.pokora.hotelsapplicationtest.remote.rest.dto.status getStatus() {
        return status;
    }

    public void setStatus(pl.mikolaj.pokora.hotelsapplicationtest.remote.rest.dto.status status) {
        this.status = status;
    }

    public List<roomReservationDto> getRoomsReservation() {
        return roomsReservation;
    }

    public void setRoomsReservation(List<roomReservationDto> roomsReservation) {
        this.roomsReservation = roomsReservation;
    }

    public personDto getPerson() {
        return person;
    }

    public void setPerson(personDto person) {
        this.person = person;
    }
}
