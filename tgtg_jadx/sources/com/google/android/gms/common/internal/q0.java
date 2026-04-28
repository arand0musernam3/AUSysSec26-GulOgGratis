package com.google.android.gms.common.internal;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11178c;

    public q0(String str, String str2, boolean z11) {
        i0.e(str);
        this.f11176a = str;
        i0.e(str2);
        this.f11177b = str2;
        this.f11178c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return i0.k(this.f11176a, q0Var.f11176a) && i0.k(this.f11177b, q0Var.f11177b) && i0.k(null, null) && this.f11178c == q0Var.f11178c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11176a, this.f11177b, null, 4225, Boolean.valueOf(this.f11178c)});
    }

    public final String toString() {
        String str = this.f11176a;
        if (str != null) {
            return str;
        }
        i0.h(null);
        throw null;
    }
}
