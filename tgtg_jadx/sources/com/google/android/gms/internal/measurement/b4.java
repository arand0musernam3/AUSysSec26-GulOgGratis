package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b4 implements c5, y4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f11277b = new HashMap();

    public b4(String str) {
        this.f11276a = str;
    }

    public abstract c5 a(b7 b7Var, List list);

    @Override // com.google.android.gms.internal.measurement.y4
    public final c5 b(String str) {
        HashMap map = this.f11277b;
        return map.containsKey(str) ? (c5) map.get(str) : c5.U;
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final Iterator c() {
        return new t4(this.f11277b.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final Boolean d() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final String e() {
        return this.f11276a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4)) {
            return false;
        }
        b4 b4Var = (b4) obj;
        String str = this.f11276a;
        if (str != null) {
            return str.equals(b4Var.f11276a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.y4
    public final void g(String str, c5 c5Var) {
        HashMap map = this.f11277b;
        if (c5Var == null) {
            map.remove(str);
        } else {
            map.put(str, c5Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final Double h() {
        return Double.valueOf(Double.NaN);
    }

    public final int hashCode() {
        String str = this.f11276a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.y4
    public final boolean i(String str) {
        return this.f11277b.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final c5 j(String str, b7 b7Var, ArrayList arrayList) {
        return "toString".equals(str) ? new f5(this.f11276a) : y4.l(this, new f5(str), b7Var, arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public c5 m() {
        return this;
    }
}
