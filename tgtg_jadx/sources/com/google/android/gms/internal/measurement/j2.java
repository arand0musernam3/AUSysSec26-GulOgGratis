package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j2 f11503c = new j2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f11505b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s5 f11504a = new s5(1);

    public final m2 a(Class cls) {
        m2 m2VarZ;
        ConcurrentHashMap concurrentHashMap = this.f11505b;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return (m2) obj;
        }
        s5 s5Var = this.f11504a;
        s5Var.getClass();
        h1 h1Var = n2.f11652a;
        if (!k1.class.isAssignableFrom(cls)) {
            int i11 = p0.f11740a;
        }
        l2 l2VarB = ((s5) s5Var.f11844b).b(cls);
        if ((l2VarB.f11587d & 2) == 2) {
            int i12 = p0.f11740a;
            h1 h1Var2 = n2.f11652a;
            h1 h1Var3 = d1.f11333a;
            m2VarZ = new f2(h1Var2, l2VarB.f11584a);
        } else {
            int i13 = p0.f11740a;
            int i14 = g2.f11430a;
            int i15 = w1.f11987a;
            h1 h1Var4 = n2.f11652a;
            h1 h1Var5 = l2VarB.a() + (-1) != 1 ? d1.f11333a : null;
            int i16 = a2.f11241a;
            m2VarZ = e2.z(l2VarB, h1Var4, h1Var5);
        }
        m2 m2Var = (m2) concurrentHashMap.putIfAbsent(cls, m2VarZ);
        return m2Var != null ? m2Var : m2VarZ;
    }
}
