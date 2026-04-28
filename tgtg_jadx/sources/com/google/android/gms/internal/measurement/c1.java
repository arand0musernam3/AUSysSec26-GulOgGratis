package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile c1 f11297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c1 f11298b;

    static {
        c1 c1Var = new c1();
        Map map = Collections.EMPTY_MAP;
        f11298b = c1Var;
    }

    public static c1 a() {
        c1 c1Var = f11297a;
        if (c1Var != null) {
            return c1Var;
        }
        synchronized (c1.class) {
            try {
                c1 c1Var2 = f11297a;
                if (c1Var2 != null) {
                    return c1Var2;
                }
                int i11 = p0.f11740a;
                c1 c1VarD = g1.d();
                f11297a = c1VarD;
                return c1VarD;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
