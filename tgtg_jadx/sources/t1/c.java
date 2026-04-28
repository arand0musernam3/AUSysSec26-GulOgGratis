package t1;

import c5.j2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FloatCompanionObject;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f39380a = new k(Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f39381b = new l(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f39382c = new m(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f39383d = new n(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f39384e = new k(Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l f39385f = new l(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m f39386g = new m(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final n f39387h = new n(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float[] f39388i = new float[91];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final v1 f39389j = new v1(new rk.z(13), new w1(0));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final v1 f39390k = new v1(new rk.z(14), new rk.z(15));
    public static final v1 l = new v1(new rk.z(16), new rk.z(17));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final v1 f39391m = new v1(new rk.z(18), new rk.z(19));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final v1 f39392n = new v1(new rk.z(20), new rk.z(21));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final v1 f39393o = new v1(new rk.z(22), new rk.z(23));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final v1 f39394p = new v1(new rk.z(24), new rk.z(25));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final v1 f39395q = new v1(new rk.z(26), new rk.z(27));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final v1 f39396r = new v1(new rk.z(28), new rk.z(29));

    public static b a(float f11) {
        Float fValueOf = Float.valueOf(f11);
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return new b(fValueOf, f39389j, Float.valueOf(0.01f), 8);
    }

    public static j b(float f11, float f12, int i11) {
        if ((i11 & 2) != 0) {
            f12 = 0.0f;
        }
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return new j(f39389j, Float.valueOf(f11), new k(f12), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final d0 c(g0 g0Var, float f11, float f12, c0 c0Var, m3.n nVar, int i11) {
        Float fValueOf = Float.valueOf(f11);
        Float fValueOf2 = Float.valueOf(f12);
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        int i12 = (i11 & 1022) | 32768;
        m3.s sVar = (m3.s) nVar;
        Object objM = sVar.M();
        m3.f fVar = m3.m.f29332a;
        if (objM == fVar) {
            objM = new d0(g0Var, fValueOf, fValueOf2, c0Var);
            sVar.k0(objM);
        }
        d0 d0Var = (d0) objM;
        boolean zH = ((((i12 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 && sVar.h(fValueOf2)) || (i12 & MLKEMEngine.KyberPolyBytes) == 256) | sVar.h(c0Var);
        Object objM2 = sVar.M();
        if (zH || objM2 == fVar) {
            androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.c cVar = new androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.c(24, fValueOf, d0Var, fValueOf2, c0Var);
            sVar.k0(cVar);
            objM2 = cVar;
        }
        m3.i.j((Function0) objM2, sVar);
        boolean zH2 = sVar.h(g0Var);
        Object objM3 = sVar.M();
        if (zH2 || objM3 == fVar) {
            objM3 = new ry.b(4, g0Var, d0Var);
            sVar.k0(objM3);
        }
        m3.i.d(d0Var, (Function1) objM3, sVar);
        return d0Var;
    }

    public static final float d(s sVar, float f11, float f12) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        z zVar = sVar.f39564a;
        k kVar = new k(0.0f);
        int iB = kVar.b();
        int i11 = 0;
        while (i11 < iB) {
            kVar.e(zVar.l(i11 == 0 ? f11 : 0.0f, i11 == 0 ? f12 : 0.0f), i11);
            i11++;
        }
        return kVar.f39470a;
    }

    public static final o e(o oVar) {
        o oVarC = oVar.c();
        int iB = oVarC.b();
        for (int i11 = 0; i11 < iB; i11++) {
            oVarC.e(oVar.a(i11), i11);
        }
        return oVarC;
    }

    public static j f(j jVar, float f11, float f12, int i11) {
        if ((i11 & 1) != 0) {
            f11 = ((Number) jVar.f39464b.getValue()).floatValue();
        }
        if ((i11 & 2) != 0) {
            f12 = ((k) jVar.f39465c).f39470a;
        }
        return new j(jVar.f39463a, Float.valueOf(f11), new k(f12), jVar.f39466d, jVar.f39467e, jVar.f39468f);
    }

    public static c0 g(t tVar, p0 p0Var, int i11) {
        if ((i11 & 2) != 0) {
            p0Var = p0.Restart;
        }
        return new c0(tVar, p0Var, 0);
    }

    public static final g0 h(m3.n nVar) {
        m3.s sVar = (m3.s) nVar;
        Object objM = sVar.M();
        if (objM == m3.m.f29332a) {
            objM = new g0();
            sVar.k0(objM);
        }
        g0 g0Var = (g0) objM;
        g0Var.a(sVar, 0);
        return g0Var;
    }

    public static z0 i() {
        return new z0(0);
    }

    public static b1 j(float f11, float f12, Object obj, int i11) {
        if ((i11 & 1) != 0) {
            f11 = 1.0f;
        }
        if ((i11 & 2) != 0) {
            f12 = 1500.0f;
        }
        if ((i11 & 4) != 0) {
            obj = null;
        }
        return new b1(f11, f12, obj);
    }

    public static u1 k(int i11, int i12, u uVar, int i13) {
        if ((i13 & 1) != 0) {
            i11 = 300;
        }
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        if ((i13 & 4) != 0) {
            uVar = w.f39593a;
        }
        return new u1(i11, i12, uVar);
    }

    public static final Object l(Function1 function1, z70.c cVar) {
        if (cVar.getContext().get(j2.f7262a) == null) {
            return m3.i.u(cVar.getContext()).t(function1, cVar);
        }
        org.bouncycastle.jce.provider.a.c();
        return null;
    }
}
