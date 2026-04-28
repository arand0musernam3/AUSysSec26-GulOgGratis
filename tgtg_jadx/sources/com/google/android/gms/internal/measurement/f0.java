package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f11400a = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h0 f11401b;

    static {
        h0 h0Var;
        int i11 = 0;
        while (true) {
            if (i11 >= 2) {
                h0Var = new h0();
                break;
            }
            h0Var = null;
            try {
                h0Var = (h0) Class.forName(f11400a[i11]).asSubclass(h0.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Throwable unused) {
            }
            if (h0Var != null) {
                break;
            } else {
                i11++;
            }
        }
        f11401b = h0Var;
    }
}
