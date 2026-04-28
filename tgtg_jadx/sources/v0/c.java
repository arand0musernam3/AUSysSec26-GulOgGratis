package v0;

import android.content.Context;
import android.os.Build;
import h7.i0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f41589a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f41590b = new HashMap();

    public static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        int iHashCode = context.getApplicationContext().hashCode();
        int i11 = Build.VERSION.SDK_INT;
        Context context2 = null;
        String str = String.format("%d-%d-%s", Integer.valueOf(iHashCode), Integer.valueOf(i11 >= 34 ? i0.m(context) : 0), i11 >= 30 ? f5.b.c(context) : null);
        synchronized (f41589a) {
            try {
                HashMap map = f41590b;
                WeakReference weakReference = (WeakReference) map.get(str);
                if (weakReference != null) {
                    Context context3 = (Context) weakReference.get();
                    if (context3 != null) {
                        context2 = context3;
                    } else {
                        map.remove(str);
                    }
                }
                if (context2 != null) {
                    return context2;
                }
                if (i11 >= 34) {
                    applicationContext = i0.b(applicationContext, i0.m(context));
                }
                if (i11 >= 30) {
                    String strC = f5.b.c(context);
                    if (!Objects.equals(strC, f5.b.c(applicationContext))) {
                        applicationContext = f5.b.a(applicationContext, strC);
                    }
                }
                map.put(str, new WeakReference(applicationContext));
                return applicationContext;
            } finally {
            }
        }
    }
}
