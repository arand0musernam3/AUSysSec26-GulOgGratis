package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class rf extends sf {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final sf f11834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final sf f11835f;

    static {
        sf sfVarB = new rf(null, new q1.k1(0)).b();
        f11834e = sfVarB;
        rf rfVar = new rf(sfVarB, new q1.k1(0));
        boolean z11 = !rfVar.f11858c;
        Boolean bool = Boolean.TRUE;
        na0.a.e0("Can't mutate after handing to trace", z11);
        na0.a.e0("Key already present", !rfVar.c());
        rfVar.f11857b.put(sf.f11855d, bool);
        f11835f = rfVar.b();
    }
}
