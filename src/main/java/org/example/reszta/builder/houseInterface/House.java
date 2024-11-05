package org.example.reszta.builder.houseInterface;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class House {
    private String walls;
    private String floors;
    private String rooms;
    private String roof;
    private String windows;
    private String doors;
    private String garage;

    @Override
    public String
    toString() {
        return "House{" +
                "walls='" + walls + '\'' +
                ", floors='" + floors + '\'' +
                ", rooms='" + rooms + '\'' +
                ", roof='" + roof + '\'' +
                ", windows='" + windows + '\'' +
                ", doors='" + doors + '\'' +
                ", garage='" + garage + '\'' +
                '}';
    }
}