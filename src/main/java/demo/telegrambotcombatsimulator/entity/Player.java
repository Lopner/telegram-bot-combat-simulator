package demo.telegrambotcombatsimulator.entity;

import demo.telegrambotcombatsimulator.enums.PlayerStatusType;
import demo.telegrambotcombatsimulator.enums.DirectionStatusType;

import lombok.Getter;
import lombok.Setter;

import static demo.telegrambotcombatsimulator.enums.DirectionStatusType.D_EMPTY;
import static demo.telegrambotcombatsimulator.enums.PlayerStatusType.P_EMPTY;
import static demo.telegrambotcombatsimulator.service.CombatService.MAX_HP;

@Getter
@Setter
public class Player {

    private String name;
    private int health;
    private DirectionStatusType attackDirection;
    private DirectionStatusType defenseDirection;
    private PlayerStatusType status;
    private String message;

    public Player () {
        this.name = "empty";
        this.health = MAX_HP;
        this.attackDirection = D_EMPTY;
        this.defenseDirection = D_EMPTY;
        this.status = P_EMPTY;
        this.message = "empty";
    }

    public Player (String name) {
        this();
        this.name = name;
    }
}
