package k50;

import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f25990a = Logger.getLogger(a.class.getName());

    public static InputStream a(String str) {
        InputStream resourceAsStream = a.class.getResourceAsStream(str);
        if (resourceAsStream == null) {
            f25990a.log(Level.WARNING, "File " + str + " not found");
        }
        return resourceAsStream;
    }
}
