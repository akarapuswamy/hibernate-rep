package util;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class CricketPlayer extends Player {
	
	@Column
	private String PlayerName;
	@Column
	private String PlayerType;
	
	public CricketPlayer() {
		super();
	}

	public CricketPlayer(String name, String bodytype, String playerName, String playerType) {
		super(name, bodytype);
		PlayerName = playerName;
		PlayerType = playerType;
	}

	public String getPlayerName() {
		return PlayerName;
	}

	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}

	public String getPlayerType() {
		return PlayerType;
	}

	public void setPlayerType(String playerType) {
		PlayerType = playerType;
	}

	@Override
	public String toString() {
		return "CricketPlayer [PlayerName="
	+ PlayerName + ", PlayerType="
				+ PlayerType + "]"+super.toString();
	}
	}
