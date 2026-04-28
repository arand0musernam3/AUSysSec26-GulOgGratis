package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j5 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b4 f11510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b7 f11511b;

    public j5(b4 b4Var, b7 b7Var) {
        this.f11510a = b4Var;
        this.f11511b = b7Var;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        c5 c5Var = (c5) obj;
        c5 c5Var2 = (c5) obj2;
        if (c5Var instanceof g5) {
            return !(c5Var2 instanceof g5) ? 1 : 0;
        }
        if (c5Var2 instanceof g5) {
            return -1;
        }
        b4 b4Var = this.f11510a;
        return b4Var == null ? c5Var.e().compareTo(c5Var2.e()) : (int) fa.r(b4Var.a(this.f11511b, Arrays.asList(c5Var, c5Var2)).h().doubleValue());
    }
}
