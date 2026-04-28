package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile n f3012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f3013b;

    static {
        n nVar = new n();
        Map map = Collections.EMPTY_MAP;
        f3013b = nVar;
    }

    public static n a() {
        n nVar;
        x0 x0Var = x0.f3059c;
        n nVar2 = f3012a;
        if (nVar2 != null) {
            return nVar2;
        }
        synchronized (n.class) {
            try {
                nVar = f3012a;
                if (nVar == null) {
                    Class cls = m.f3010a;
                    n nVar3 = null;
                    if (cls != null) {
                        try {
                            nVar3 = (n) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    nVar = nVar3 != null ? nVar3 : f3013b;
                    f3012a = nVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }
}
