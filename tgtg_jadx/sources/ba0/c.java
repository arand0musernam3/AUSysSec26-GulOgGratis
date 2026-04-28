package ba0;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.x0;
import kotlin.text.StringsKt;
import kotlin.text.b0;
import q90.d0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArraySet f6078a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f6079b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = d0.class.getPackage();
        String name = r22 != null ? r22.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(d0.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(x90.h.class.getName(), "okhttp.Http2");
        linkedHashMap.put(t90.e.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f6079b = x0.k(linkedHashMap);
    }

    public static void a(String str, int i11, String str2, Throwable th2) {
        int iMin;
        str.getClass();
        str2.getClass();
        String strX = (String) f6079b.get(str);
        if (strX == null) {
            strX = b0.x(23, str);
        }
        if (Log.isLoggable(strX, i11)) {
            if (th2 != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th2);
            }
            int length = str2.length();
            int i12 = 0;
            while (i12 < length) {
                int iF = StringsKt.F(str2, '\n', i12, false, 4);
                if (iF == -1) {
                    iF = length;
                }
                while (true) {
                    iMin = Math.min(iF, i12 + 4000);
                    Log.println(i11, strX, str2.substring(i12, iMin));
                    if (iMin >= iF) {
                        break;
                    } else {
                        i12 = iMin;
                    }
                }
                i12 = iMin + 1;
            }
        }
    }

    public static void b(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (f6078a.add(logger)) {
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(d.f6080a);
        }
    }
}
