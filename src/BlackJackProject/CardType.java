package BlackJackProject;
public enum CardType {
	Spade,
	Diamond,
	Club,
	Heart;
	 public static CardType randomtype() {
	        return values()[(int) (Math.random() * values().length)];
	    }
}
