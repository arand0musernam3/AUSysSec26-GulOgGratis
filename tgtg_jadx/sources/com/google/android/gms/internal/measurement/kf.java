package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class kf extends b4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s5 f11575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f11576d;

    public kf(s5 s5Var) {
        super("require");
        this.f11576d = new HashMap();
        this.f11575c = s5Var;
    }

    @Override // com.google.android.gms.internal.measurement.b4
    public final c5 a(b7 b7Var, List list) {
        c5 c5Var;
        fa.c("require", list, 1);
        String strE = ((i5) b7Var.f11283c).e(b7Var, (c5) list.get(0)).e();
        HashMap map = this.f11576d;
        if (map.containsKey(strE)) {
            return (c5) map.get(strE);
        }
        HashMap map2 = (HashMap) this.f11575c.f11844b;
        if (map2.containsKey(strE)) {
            try {
                c5Var = (c5) ((Callable) map2.get(strE)).call();
            } catch (Exception unused) {
                com.braze.h2.b("Failed to create API implementation: ".concat(String.valueOf(strE)));
                return null;
            }
        } else {
            c5Var = c5.U;
        }
        if (c5Var instanceof b4) {
            map.put(strE, (b4) c5Var);
        }
        return c5Var;
    }
}
