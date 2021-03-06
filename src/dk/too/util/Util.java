package dk.too.util;

import android.content.Context;
import android.os.Environment;
import dk.too.timetable.App;

public class Util {
    
    public static String getExtPath(){
        
        String ext = Environment.getExternalStorageState();
        
        if(ext.equals(Environment.MEDIA_MOUNTED)){
            return Environment.getExternalStorageDirectory().getAbsolutePath();
        }
        else{
            return null;
        }
    }

    public static String getLocalDir(){
        Context context = App.get().getApplicationContext();
        return context.getFilesDir().toString();
    }
    
    public static String arrToStr(String[] array, String delimiter) {
        StringBuilder arTostr = new StringBuilder();
        if (array.length > 0) {
            arTostr.append(array[0]);
            for (int i=1; i<array.length; i++) {
                arTostr.append(delimiter);
                arTostr.append(array[i]);
            }
        }
        return arTostr.toString();
    }


}
