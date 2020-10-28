import java.util.HashMap;
import java.util.Map;

public class CommandFactory implements ICommandFactory {
    private Map<String,ICommand>  commandMap;

    public CommandFactory() {
        commandMap = new HashMap<>();
    }
    
    @Override
    public ICommand createCommand(String command) {
        return null;
    }

    private void registerCommand(){
        commandMap.put("e", new CMDEditMenu());
    }

    
}
