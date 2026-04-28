package k50;

import h50.g;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f25991a = Logger.getLogger(b.class.getName());

    public static List a(InputStream inputStream) throws Throwable {
        ObjectInputStream objectInputStream;
        Throwable th2;
        IOException e5;
        Logger logger = f25991a;
        if (inputStream == null) {
            return Collections.EMPTY_LIST;
        }
        try {
            objectInputStream = new ObjectInputStream(inputStream);
            try {
                try {
                    g gVar = new g();
                    ArrayList arrayList = new ArrayList();
                    gVar.f21476a = arrayList;
                    gVar.readExternal(objectInputStream);
                    if (arrayList.isEmpty()) {
                        throw new IllegalStateException("Empty metadata");
                    }
                    try {
                        objectInputStream.close();
                        return arrayList;
                    } catch (IOException e11) {
                        logger.log(Level.WARNING, "Error closing input stream (ignored)", (Throwable) e11);
                        return arrayList;
                    }
                } catch (IOException e12) {
                    e5 = e12;
                    throw new IllegalStateException("Unable to parse metadata file", e5);
                }
            } catch (Throwable th3) {
                th2 = th3;
            }
            th2 = th3;
        } catch (IOException e13) {
            objectInputStream = null;
            e5 = e13;
        } catch (Throwable th4) {
            objectInputStream = null;
            th2 = th4;
        }
        if (objectInputStream != null) {
            try {
                objectInputStream.close();
            } catch (IOException e14) {
                logger.log(Level.WARNING, "Error closing input stream (ignored)", (Throwable) e14);
            }
        } else {
            try {
                inputStream.close();
            } catch (IOException e15) {
                logger.log(Level.WARNING, "Error closing input stream (ignored)", (Throwable) e15);
            }
        }
        throw th2;
    }
}
