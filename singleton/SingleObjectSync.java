package singleton;

public class SingleObjectSync {

    private volatile static SingleObjectSync instance;

    private SingleObjectSync() {
    }

    public static SingleObjectSync getInstance(){
        if(instance == null){
            synchronized (SingleObjectSync.class){
                if (instance == null){
                    instance = new SingleObjectSync();
                }
            }
        }
        return instance;
    }

}
