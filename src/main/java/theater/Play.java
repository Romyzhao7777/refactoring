package theater;

/**
 * Class representing a play with its name and type.
 */
public class Play {

    private String name;
    private String type;

    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    /**
     * Returns the name of this play.
     * @return the name of the play
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the type of this play.
     * @return the type of the play
     */
    public String getType() {
        return type;
    }
}
