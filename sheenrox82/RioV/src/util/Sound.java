package sheenrox82.RioV.src.util;


public class Sound {
    
    private String name;
    private boolean mob;
    private boolean item;
    
    public Sound(String name){
        this(name, false, false);
    }
    
    public Sound(String name, boolean mob){
        this(name, mob, false);
    }
    
    public Sound(boolean item, String name){
        this(name, false, item);
    }
    
    public Sound(String name, boolean mob, boolean item){
        this.name = name;
        this.mob = mob;
        this.item = item;
        SoundGenerator.addSound(this);
    }
    
    public String getName(){
        return name;
    }
    
    public String getPrefixedName(){
        return Util.MOD_ID + ":" + name;
    }
    
    public boolean isMob(){
        return mob;
    }
    
    public boolean isItem(){
        return item;
    }
}