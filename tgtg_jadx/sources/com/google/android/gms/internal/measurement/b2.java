package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b2 implements c5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11270a;

    public b2(Boolean bool) {
        this.f11270a = bool == null ? false : bool.booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final Iterator c() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final Boolean d() {
        return Boolean.valueOf(this.f11270a);
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final String e() {
        return Boolean.toString(this.f11270a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b2) && this.f11270a == ((b2) obj).f11270a;
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final Double h() {
        return Double.valueOf(true != this.f11270a ? 0.0d : 1.0d);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f11270a).hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final c5 j(String str, b7 b7Var, ArrayList arrayList) {
        boolean zEquals = "toString".equals(str);
        boolean z11 = this.f11270a;
        if (zEquals) {
            return new f5(Boolean.toString(z11));
        }
        a40.d0.h(Boolean.toString(z11), ".", str, " is not a function.");
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final c5 m() {
        return new b2(Boolean.valueOf(this.f11270a));
    }

    public final String toString() {
        return String.valueOf(this.f11270a);
    }
}
