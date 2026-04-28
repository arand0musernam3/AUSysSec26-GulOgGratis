package il;

import b4.d;
import b4.q;
import b5.h;
import b5.j;
import d2.i;
import d2.m2;
import d2.w;
import d2.y;
import g3.j5;
import g3.q7;
import g3.r9;
import i4.g0;
import i4.r0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import l2.g;
import lv.t;
import lv.v;
import m3.f;
import m3.m;
import m3.n;
import m3.s;
import u3.e;
import x5.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f24061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f24062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f24063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Integer f24064e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function0 f24065f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f24066g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Function0 f24067h;

    public /* synthetic */ c(String str, String str2, String str3, Integer num, Function0 function0, String str4, Function0 function02, int i11) {
        this.f24060a = i11;
        this.f24061b = str;
        this.f24062c = str2;
        this.f24063d = str3;
        this.f24064e = num;
        this.f24065f = function0;
        this.f24066g = str4;
        this.f24067h = function02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f24060a) {
            case 0:
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    q7.a(d2.c.t(d2.c.z(m2.d(q.f5711a, 1.0f), t.f28253g)), g.b(12), 0L, 0L, 8, 0.0f, null, e.e(450712171, sVar, new c(this.f24061b, this.f24062c, this.f24063d, this.f24064e, this.f24065f, this.f24066g, this.f24067h, 1)), sVar, 12607488, 108);
                } else {
                    sVar.U();
                }
                break;
            default:
                n nVar2 = (n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                s sVar2 = (s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    long j9 = lv.s.J;
                    r0 r0Var = g0.f23254b;
                    q qVar = q.f5711a;
                    b4.t tVarZ = d2.c.z(v1.n.j(qVar, j9, r0Var), t.f28254h);
                    y yVarA = w.a(i.f13805e, d.f5695n, sVar2, 54);
                    int iHashCode = Long.hashCode(sVar2.T);
                    u3.i iVarL = sVar2.l();
                    b4.t tVarC = b4.a.c(tVarZ, sVar2);
                    j.R.getClass();
                    h hVar = b5.i.f5839b;
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(hVar);
                    } else {
                        sVar2.n0();
                    }
                    m3.i.C(yVarA, b5.i.f5843f, sVar2);
                    m3.i.C(iVarL, b5.i.f5842e, sVar2);
                    m3.i.v(sVar2, Integer.valueOf(iHashCode), b5.i.f5844g);
                    m3.i.z(sVar2, b5.i.f5845h);
                    m3.i.C(tVarC, b5.i.f5841d, sVar2);
                    r9.d(this.f24061b, null, 0L, 0L, null, 0L, null, new k(3), 0L, 0, false, 0, 0, null, v.f28270i, sVar2, 0, 12582912, 130046);
                    d2.c.f(m2.e(qVar, 16), sVar2);
                    r9.d(this.f24062c, null, 0L, 0L, null, 0L, null, new k(3), 0L, 0, false, 0, 0, null, v.f28274n, sVar2, 0, 12582912, 130046);
                    d2.c.f(m2.e(qVar, 32), sVar2);
                    Function0 function0 = this.f24065f;
                    boolean zF = sVar2.f(function0);
                    Object objM = sVar2.M();
                    f fVar = m.f29332a;
                    if (zF || objM == fVar) {
                        objM = new j5(12, function0);
                        sVar2.k0(objM);
                    }
                    v0.n.l(qVar, this.f24063d, null, null, null, false, false, null, this.f24064e, (Function0) objM, sVar2, 6, 252);
                    d2.c.f(m2.e(qVar, 8), sVar2);
                    Function0 function02 = this.f24067h;
                    boolean zF2 = sVar2.f(function02);
                    Object objM2 = sVar2.M();
                    if (zF2 || objM2 == fVar) {
                        objM2 = new j5(13, function02);
                        sVar2.k0(objM2);
                    }
                    v0.n.o(qVar, this.f24066g, null, null, null, false, (Function0) objM2, sVar2, 6, 0, 1020);
                    sVar2.q(true);
                } else {
                    sVar2.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}
