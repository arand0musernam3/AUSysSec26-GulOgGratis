package ve;

import android.util.Log;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f42247a = new b();

    public static void a() {
        f42247a.getClass();
        he.a aVar = he.e.f21898a;
    }

    public static void b(String str) {
        f42247a.getClass();
        HashSet hashSet = b.f42246a;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, null);
        hashSet.add(str);
    }

    public static void c(String str, Throwable th2) {
        f42247a.getClass();
        HashSet hashSet = b.f42246a;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th2);
        hashSet.add(str);
    }
}
