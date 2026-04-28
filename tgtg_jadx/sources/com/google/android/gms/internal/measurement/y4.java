package com.google.android.gms.internal.measurement;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public interface y4 {
    static c5 l(y4 y4Var, f5 f5Var, b7 b7Var, ArrayList arrayList) {
        String str = f5Var.f11408a;
        if (y4Var.i(str)) {
            c5 c5VarB = y4Var.b(str);
            if (c5VarB instanceof b4) {
                return ((b4) c5VarB).a(b7Var, arrayList);
            }
            i4.a.f(r8.k.l(str, " is not a function"));
            return null;
        }
        if ("hasOwnProperty".equals(str)) {
            fa.c("hasOwnProperty", arrayList, 1);
            return y4Var.i(((i5) b7Var.f11283c).e(b7Var, (c5) arrayList.get(0)).e()) ? c5.f11307e0 : c5.f11308f0;
        }
        i4.a.f(e0.f.k("Object has no function ", str));
        return null;
    }

    c5 b(String str);

    void g(String str, c5 c5Var);

    boolean i(String str);
}
