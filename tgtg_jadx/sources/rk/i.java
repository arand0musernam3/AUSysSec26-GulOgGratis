package rk;

import c5.t1;
import kotlin.jvm.functions.Function0;
import m3.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38069a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f38070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v80.b0 f38071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t1 f38072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f38073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f38074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f38075g;

    public i(String str, v80.b0 b0Var, t1 t1Var, b1 b1Var, Function0 function0, b1 b1Var2) {
        this.f38070b = str;
        this.f38071c = b0Var;
        this.f38072d = t1Var;
        this.f38073e = b1Var;
        this.f38075g = function0;
        this.f38074f = b1Var2;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f38069a) {
            case 0:
                b4.t tVar = (b4.t) obj;
                ((Number) obj3).intValue();
                tVar.getClass();
                m3.s sVar = (m3.s) ((m3.n) obj2);
                sVar.a0(663417020);
                j5.j jVar = new j5.j(0);
                if (this.f38070b == null) {
                    jVar = null;
                }
                j5.j jVar2 = jVar;
                Object objM = sVar.M();
                if (objM == m3.m.f29332a) {
                    objM = w.a0.g(sVar);
                }
                b4.t tVarD = androidx.compose.foundation.b.d(tVar, (b2.l) objM, this.f38070b, jVar2, new dp.x((Object) this.f38071c, (Object) this.f38072d, (b1) this.f38073e, 4), new h((Function0) this.f38075g, (b1) this.f38074f, 0), 388);
                sVar.q(false);
                return tVarD;
            default:
                b4.t tVar2 = (b4.t) obj;
                ((Number) obj3).intValue();
                tVar2.getClass();
                m3.s sVar2 = (m3.s) ((m3.n) obj2);
                sVar2.a0(-310878134);
                j5.j jVar3 = new j5.j(0);
                if (this.f38070b == null) {
                    jVar3 = null;
                }
                j5.j jVar4 = jVar3;
                Object objM2 = sVar2.M();
                if (objM2 == m3.m.f29332a) {
                    objM2 = w.a0.g(sVar2);
                }
                b4.t tVarB = androidx.compose.foundation.b.b(tVar2, (b2.l) objM2, null, false, this.f38070b, jVar4, new ti.m(this.f38071c, (m1.a) this.f38073e, (String) this.f38074f, this.f38072d, (String) this.f38075g), 4);
                sVar2.q(false);
                return tVarB;
        }
    }

    public i(String str, v80.b0 b0Var, m1.a aVar, String str2, t1 t1Var, String str3) {
        this.f38070b = str;
        this.f38071c = b0Var;
        this.f38073e = aVar;
        this.f38074f = str2;
        this.f38072d = t1Var;
        this.f38075g = str3;
    }
}
