package cogwedmc.model;

/* A simple class to encode a single transition from a source
   state to a destination state
*/
public class SingleTransition {

    // Source and destination states are just strings
    private String source;
    private String destination;

    public SingleTransition(String s, String d) {
	source = s;
	destination = d;
    }

    public String getSource() {
	return source;
    }

    public String getDestination() {
	return destination;
    }

    public void setSource(String s) {
	source = s;
    }

    public void setDestination(String d) {
	destination = d;
    }

    // To compare to single transitions
    @Override
    public boolean equals(Object o) {
	if (o == null) return false;
	if (!(o instanceof SingleTransition)) return false;
	SingleTransition st = (SingleTransition) o;
	return this.source.equals(st.getSource()) &&
	    this.destination.equals(st.getDestination());
    }
}
