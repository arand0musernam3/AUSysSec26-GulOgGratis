package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q2 implements c5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c5 f11777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11778b;

    public q2(String str) {
        this.f11777a = c5.U;
        this.f11778b = str;
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final Iterator c() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final Boolean d() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final String e() {
        throw new IllegalStateException("Control is not a String");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) obj;
        return this.f11778b.equals(q2Var.f11778b) && this.f11777a.equals(q2Var.f11777a);
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final Double h() {
        throw new IllegalStateException("Control is not a double");
    }

    public final int hashCode() {
        return this.f11777a.hashCode() + (this.f11778b.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final c5 j(String str, b7 b7Var, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    @Override // com.google.android.gms.internal.measurement.c5
    public final c5 m() {
        return new q2(this.f11778b, this.f11777a.m());
    }

    public q2(String str, c5 c5Var) {
        this.f11777a = c5Var;
        this.f11778b = str;
    }
}
