package bx;

import android.content.Context;
import android.util.Log;
import ax.a0;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class i {
    public static final synchronized w a() {
        w wVar;
        ClassNotFoundException e5;
        IOException e11;
        String str;
        Context contextA = a0.a();
        w wVar2 = null;
        try {
            try {
                FileInputStream fileInputStreamOpenFileInput = contextA.openFileInput("AppEventsLogger.persistedevents");
                fileInputStreamOpenFileInput.getClass();
                h hVar = new h(new BufferedInputStream(fileInputStreamOpenFileInput));
                try {
                    Object object = hVar.readObject();
                    object.getClass();
                    wVar = (w) object;
                    try {
                        hVar.close();
                        try {
                            contextA.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                        } catch (Exception e12) {
                            e = e12;
                            str = "bx.i";
                            Log.w(str, "Got unexpected exception when removing events file: ", e);
                        }
                    } catch (FileNotFoundException unused) {
                        wVar2 = wVar;
                        wVar = wVar2;
                    } catch (IOException e13) {
                        e11 = e13;
                        Log.w("bx.i", "Got unexpected exception while reading events: ", e11);
                        try {
                            contextA.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                        } catch (Exception e14) {
                            e = e14;
                            str = "bx.i";
                            Log.w(str, "Got unexpected exception when removing events file: ", e);
                        }
                    } catch (ClassNotFoundException e15) {
                        e5 = e15;
                        Log.w("bx.i", "Got unexpected exception while reading events: ", e5);
                        try {
                            contextA.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                        } catch (Exception e16) {
                            e = e16;
                            str = "bx.i";
                            Log.w(str, "Got unexpected exception when removing events file: ", e);
                        }
                    }
                } finally {
                }
            } finally {
                try {
                    contextA.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                } catch (Exception e17) {
                    Log.w("bx.i", "Got unexpected exception when removing events file: ", e17);
                }
            }
        } catch (FileNotFoundException unused2) {
        } catch (IOException e18) {
            wVar = null;
            e11 = e18;
        } catch (ClassNotFoundException e19) {
            wVar = null;
            e5 = e19;
        }
        if (wVar == null) {
            wVar = new w();
        }
        return wVar;
    }

    public static final void b(w wVar) {
        Context contextA = a0.a();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(contextA.openFileOutput("AppEventsLogger.persistedevents", 0)));
            try {
                objectOutputStream.writeObject(wVar);
                objectOutputStream.close();
            } finally {
            }
        } catch (IOException e5) {
            Log.w("bx.i", "Got unexpected exception while persisting events: ", e5);
            try {
                contextA.getFileStreamPath("AppEventsLogger.persistedevents").delete();
            } catch (Exception unused) {
            }
        }
    }
}
