package ict.TagLib;

import java.util.Map;

public interface TagLib {
    public Map<String, String> getMsgs(); // get the map of the strings

    public String getMsg(String id); // get the single msg from map

    public void print(String id); // print the msg

    public void println(String id); // print line of the msg
}
