package com.google.android.gms.internal.measurement;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b3 implements j30.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ b3 f11271b = new b3(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ b3 f11272c = new b3(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b3 f11273d = new b3(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b3 f11274e = new b3(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11275a;

    public /* synthetic */ b3(int i11) {
        this.f11275a = i11;
    }

    @Override // j30.e
    public final Object apply(Object obj) {
        switch (this.f11275a) {
            case 0:
                Context context = (Context) obj;
                String str = c3.f11300b;
                if (str == null) {
                    synchronized (c3.class) {
                        try {
                            str = c3.f11300b;
                            if (str == null) {
                                String strB = ma.b(context, "com.google.android.gms.measurement");
                                c3.f11300b = strB;
                                str = strB;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return str;
            case 1:
                s5 s5Var = qc.f11791i;
                return "";
            case 2:
                bb bbVar = (bb) obj;
                kd kdVarZ = ld.z();
                if (bbVar == null) {
                    return (ld) kdVarZ.d();
                }
                for (db dbVar : bbVar.x()) {
                    md mdVarZ = nd.z();
                    String strT = dbVar.t();
                    mdVarZ.b();
                    ((nd) mdVarZ.f11483b).A(strT);
                    int iH = dbVar.H();
                    int i11 = iH - 1;
                    if (iH == 0) {
                        throw null;
                    }
                    if (i11 == 0) {
                        long jU = dbVar.u();
                        mdVarZ.b();
                        ((nd) mdVarZ.f11483b).B(jU);
                    } else if (i11 == 1) {
                        boolean zV = dbVar.v();
                        mdVarZ.b();
                        ((nd) mdVarZ.f11483b).C(zV);
                    } else if (i11 == 2) {
                        double dW = dbVar.w();
                        mdVarZ.b();
                        ((nd) mdVarZ.f11483b).D(dW);
                    } else if (i11 == 3) {
                        String strX = dbVar.x();
                        mdVarZ.b();
                        ((nd) mdVarZ.f11483b).E(strX);
                    } else {
                        if (i11 != 4) {
                            com.braze.h2.b("No known flag type");
                            return null;
                        }
                        u0 u0VarY = dbVar.y();
                        mdVarZ.b();
                        ((nd) mdVarZ.f11483b).F(u0VarY);
                    }
                    nd ndVar = (nd) mdVarZ.d();
                    kdVarZ.b();
                    ((ld) kdVarZ.f11483b).F(ndVar);
                }
                String strW = bbVar.w();
                kdVarZ.b();
                ((ld) kdVarZ.f11483b).D(strW);
                String strT2 = bbVar.t();
                kdVarZ.b();
                ((ld) kdVarZ.f11483b).B(strT2);
                long jY = bbVar.y();
                kdVarZ.b();
                ((ld) kdVarZ.f11483b).E(jY);
                if (bbVar.u()) {
                    u0 u0VarV = bbVar.v();
                    kdVarZ.b();
                    ((ld) kdVarZ.f11483b).C(u0VarV);
                }
                return (ld) kdVarZ.d();
            default:
                zzmk zzmkVar = (zzmk) obj;
                if (zzmkVar.f12099a != 29514) {
                    throw zzmkVar;
                }
                tb tbVarW = ub.w();
                pb pbVarG = qb.G();
                long jCurrentTimeMillis = System.currentTimeMillis();
                pbVarG.b();
                ((qb) pbVarG.f11483b).I(jCurrentTimeMillis);
                tbVarW.b();
                ((ub) tbVarW.f11483b).x((qb) pbVarG.d());
                return (ub) tbVarW.d();
        }
    }
}
