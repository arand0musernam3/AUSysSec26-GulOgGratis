package o00;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q0 f31730a;

    static {
        q0 q0Var;
        try {
            q0Var = s0.f31740a;
        } catch (NoClassDefFoundError unused) {
            q0Var = null;
        }
        if (q0Var == null) {
            StringBuilder sb2 = new StringBuilder();
            for (int i11 = 0; i11 < 3; i11++) {
                String str = q0.f31737a[i11];
                try {
                    q0Var = (q0) Class.forName(str).getConstructor(null).newInstance(null);
                } catch (Throwable th2) {
                    th = th2;
                    sb2.append('\n');
                    sb2.append(str);
                    sb2.append(": ");
                    if (th instanceof InvocationTargetException) {
                        th = th.getCause();
                    }
                    sb2.append(th);
                }
            }
            throw new IllegalStateException(sb2.insert(0, "No logging platforms found:").toString());
        }
        f31730a = q0Var;
    }
}
