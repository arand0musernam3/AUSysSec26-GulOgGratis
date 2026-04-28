package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ec f11299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile String f11300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s5 f11301c;

    static {
        b3 b3Var = b3.f11271b;
        int i11 = k30.m.f25911c;
        ic icVar = new ic(b3Var, true, k30.d0.f25887j);
        rc rcVar = new rc();
        rcVar.f11829a = icVar;
        f11301c = new s5(rcVar, 12);
        f11299a = new ec("__phenotype_server_token", rcVar, "");
        f11300b = null;
    }

    public static String a() {
        return (String) f11299a.get();
    }
}
