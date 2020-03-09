package EPAM.EPAM_DesinPatterns;

import java.util.logging.Logger;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Logger;

public class Singleton implements Serializable{
    private static final long serialVersionId = -7604766932017737115L;
    private Singleton(){
    }
    private static class SingletonHelper{
        private static final Singleton ins = new Singleton();
    }
    public static Singleton getInstance(){
        return SingletonHelper.ins;
    }
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Singleton instOne = Singleton.getInstance();
        Logger logger = Logger.getLogger(Singleton.class.getName());
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
        out.writeObject(instOne);
        out.close();
        ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
        Singleton instTwo = (Singleton) in.readObject();
        in.close();
        logger.info("InstanceOne hashCode="+instOne.hashCode());
        logger.info("InstanceTwo hashCode="+instTwo.hashCode());
        
    }
}