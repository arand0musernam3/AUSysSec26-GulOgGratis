package u70;

import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class e {
    public static void a(Throwable th2, Throwable th3) {
        th2.getClass();
        th3.getClass();
        if (th2 != th3) {
            b80.c.f6062a.a(th2, th3);
        }
    }

    public static String b(Throwable th2) {
        th2.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        string.getClass();
        return string;
    }
}
