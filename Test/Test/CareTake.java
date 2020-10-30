package Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class CareTake {
    private Map<Integer, Meme> memeMap;

    public CareTake(){
        memeMap = new LinkedHashMap<>();
    }

    public void add(Meme m){
        memeMap.put(m.getId(), m);
    }

    public Meme get(int id){
        return memeMap.get(id);
    }
    
}
