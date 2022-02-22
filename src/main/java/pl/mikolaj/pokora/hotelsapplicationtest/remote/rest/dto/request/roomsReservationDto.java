package pl.mikolaj.pokora.hotelsapplicationtest.remote.rest.dto.request;

import java.util.List;

public class roomsReservationDto {

    private List<roomReservationDto> roomsReservation;
    private personDto person;


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
