package g3;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ga {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d2.b2 f18696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f18697b = l3.e.f26945a;

    static {
        float f11 = 0;
        f18696a = new d2.b2(f11, f11, f11, f11);
        int i11 = l3.d.f26929a;
        int i12 = l3.c.f26926a;
        int i13 = l3.b.f26913a;
        int i14 = l3.a.f26833a;
    }

    public static n1 a(m3.n nVar) {
        ka kaVarF = i.f(nVar);
        m3.s sVar = (m3.s) nVar;
        Object objM = sVar.M();
        m3.f fVar = m3.m.f29332a;
        if (objM == fVar) {
            objM = new fw.b(28);
            sVar.k0(objM);
        }
        Function0 function0 = (Function0) objM;
        t1.b1 b1VarD = s0.D(l3.f0.DefaultEffects, nVar);
        t1.s sVarA = s1.k1.a(nVar);
        boolean zF = ((m3.s) nVar).f(kaVarF) | ((m3.s) nVar).f(function0);
        m3.s sVar2 = (m3.s) nVar;
        boolean zF2 = zF | sVar2.f(b1VarD) | sVar2.f(sVarA) | sVar2.g(false);
        Object objM2 = sVar2.M();
        if (zF2 || objM2 == fVar) {
            objM2 = new n1(kaVarF, b1VarD, sVarA, function0);
            sVar2.k0(objM2);
        }
        return (n1) objM2;
    }

    public static fa b(p0 p0Var) {
        fa faVar = p0Var.f19259a0;
        if (faVar != null) {
            return faVar;
        }
        fa faVar2 = new fa(r0.d(p0Var, l3.f.f26951a), r0.d(p0Var, l3.f.f26953c), r0.d(p0Var, l3.f.f26952b), r0.d(p0Var, l3.f.f26955e), r0.d(p0Var, l3.f.f26956f), r0.d(p0Var, l3.f.f26954d));
        p0Var.f19259a0 = faVar2;
        return faVar2;
    }

    public static d5 c(m3.n nVar) {
        ka kaVarF = i.f(nVar);
        m3.s sVar = (m3.s) nVar;
        Object objM = sVar.M();
        m3.f fVar = m3.m.f29332a;
        if (objM == fVar) {
            objM = new fw.b(28);
            sVar.k0(objM);
        }
        Function0 function0 = (Function0) objM;
        boolean zF = ((m3.s) nVar).f(kaVarF) | ((m3.s) nVar).f(function0);
        m3.s sVar2 = (m3.s) nVar;
        Object objM2 = sVar2.M();
        if (zF || objM2 == fVar) {
            objM2 = new d5(kaVarF, function0);
            sVar2.k0(objM2);
        }
        return (d5) objM2;
    }

    public static fa d(long j9, long j11, long j12, long j13, m3.n nVar, int i11) {
        long j14 = i4.v.f23315h;
        long j15 = (i11 & 4) != 0 ? j14 : j11;
        long j16 = (i11 & 8) != 0 ? j14 : j12;
        long j17 = (i11 & 16) != 0 ? j14 : j13;
        fa faVarB = b((p0) ((m3.s) nVar).j(r0.f19375a));
        long j18 = j9 != 16 ? j9 : faVarB.f18628a;
        long j19 = j14 != 16 ? j14 : faVarB.f18629b;
        if (j15 == 16) {
            j15 = faVarB.f18630c;
        }
        long j21 = j15;
        if (j16 == 16) {
            j16 = faVarB.f18631d;
        }
        long j22 = j16;
        if (j17 == 16) {
            j17 = faVarB.f18632e;
        }
        long j23 = j17;
        if (j14 == 16) {
            j14 = faVarB.f18633f;
        }
        return new fa(j18, j19, j21, j22, j23, j14);
    }
}
