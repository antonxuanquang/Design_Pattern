package Observer_Pattern;

import java.util.HashMap;

public interface Observer {
	public void update(HashMap<String, Double> prices);
}
