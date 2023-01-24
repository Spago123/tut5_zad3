package ba.unsa.etf.rpr;

/**
 * Connection to a Data Base using Singleton
 */
public class DataBaseGave {
    private static DataBaseGave instance;

    private DataBaseGave(){
    }

    public static DataBaseGave getInstance(String value){
        if(instance==null){
            instance = new DataBaseGave();
        }
        return instance;
    }
}
