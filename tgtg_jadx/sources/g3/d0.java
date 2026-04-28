package g3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18431a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f18435e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f18436f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f18437g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f18438h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f18439i;

    public /* synthetic */ d0(m3.c3 c3Var, m3.c3 c3Var2, k4.h hVar, m3.c3 c3Var3, t1.p1 p1Var, t1.p1 p1Var2, k4.h hVar2, x xVar) {
        this.f18432b = c3Var;
        this.f18433c = c3Var2;
        this.f18437g = hVar;
        this.f18434d = c3Var3;
        this.f18435e = p1Var;
        this.f18436f = p1Var2;
        this.f18438h = hVar2;
        this.f18439i = xVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        k4.d dVar;
        m3.c3 c3Var;
        x xVar;
        float f11;
        switch (this.f18431a) {
            case 0:
                m3.c3 c3Var2 = (m3.c3) this.f18432b;
                m3.c3 c3Var3 = (m3.c3) this.f18433c;
                k4.h hVar = (k4.h) this.f18437g;
                m3.c3 c3Var4 = (m3.c3) this.f18434d;
                m3.c3 c3Var5 = (m3.c3) this.f18435e;
                m3.c3 c3Var6 = (m3.c3) this.f18436f;
                k4.h hVar2 = (k4.h) this.f18438h;
                x xVar2 = (x) this.f18439i;
                k4.d dVar2 = (k4.d) obj;
                long j9 = ((i4.v) c3Var2.getValue()).f23317a;
                long j11 = ((i4.v) c3Var3.getValue()).f23317a;
                float fC0 = dVar2.c0(g0.f18647c);
                float f12 = hVar.f25944a;
                float f13 = f12 / 2.0f;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar2.d() >> 32));
                boolean zC = i4.v.c(j9, j11);
                k4.g gVar = k4.g.f25943a;
                if (zC) {
                    dVar = dVar2;
                    k4.d.M(dVar, j9, 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(fC0)) << 32) | (((long) Float.floatToRawIntBits(fC0)) & 4294967295L), gVar, 226);
                    xVar = xVar2;
                    c3Var = c3Var5;
                    f11 = 0.0f;
                } else {
                    dVar = dVar2;
                    c3Var = c3Var5;
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f12)) << 32) | (((long) Float.floatToRawIntBits(f12)) & 4294967295L);
                    float f14 = fIntBitsToFloat - (2 * f12);
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L);
                    float fMax = Math.max(0.0f, fC0 - f12);
                    k4.d.M(dVar, j9, jFloatToRawIntBits, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L), gVar, BERTags.FLAGS);
                    float f15 = fIntBitsToFloat - f12;
                    float f16 = fC0 - f13;
                    xVar = xVar2;
                    f11 = 0.0f;
                    k4.d.M(dVar, j11, (((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(f13)) & 4294967295L), (((long) Float.floatToRawIntBits(f15)) & 4294967295L) | (Float.floatToRawIntBits(f15) << 32), (((long) Float.floatToRawIntBits(f16)) & 4294967295L) | (((long) Float.floatToRawIntBits(f16)) << 32), hVar, BERTags.FLAGS);
                }
                long j12 = ((i4.v) c3Var4.getValue()).f23317a;
                float fFloatValue = ((Number) c3Var.getValue()).floatValue();
                float fFloatValue2 = ((Number) c3Var6.getValue()).floatValue();
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (dVar.d() >> 32));
                float fC = ba0.g.C(0.4f, 0.5f, fFloatValue2);
                float fC2 = ba0.g.C(0.7f, 0.5f, fFloatValue2);
                float fC3 = ba0.g.C(0.5f, 0.5f, fFloatValue2);
                float fC4 = ba0.g.C(0.3f, 0.5f, fFloatValue2);
                xVar.f19742a.f23258a.rewind();
                i4.h hVar3 = xVar.f19742a;
                hVar3.f(0.2f * fIntBitsToFloat2, fC3 * fIntBitsToFloat2);
                hVar3.e(fC * fIntBitsToFloat2, fC2 * fIntBitsToFloat2);
                hVar3.e(0.8f * fIntBitsToFloat2, fIntBitsToFloat2 * fC4);
                i4.j jVar = xVar.f19743b;
                jVar.f23265a.setPath(hVar3 != null ? hVar3.f23258a : null, false);
                i4.h hVar4 = xVar.f19744c;
                hVar4.f23258a.rewind();
                jVar.a(f11, jVar.f23265a.getLength() * fFloatValue, hVar4);
                k4.d.r0(dVar, xVar.f19744c, j12, 0.0f, hVar2, 52);
                break;
            default:
                z3.r rVar = (z3.r) this.f18432b;
                fn.c cVar = (fn.c) this.f18433c;
                Function1 function1 = (Function1) this.f18434d;
                Function1 function12 = (Function1) this.f18435e;
                Function2 function2 = (Function2) this.f18436f;
                Function1 function13 = (Function1) this.f18437g;
                Function0 function0 = (Function0) this.f18438h;
                z3.u uVar = (z3.u) this.f18439i;
                f2.l lVar = (f2.l) obj;
                lVar.getClass();
                lVar.r(rVar.size(), null, new cn.n(rVar, 5), new u3.d(new gn.y(rVar, cVar, function1, function12, function2, function13, function0, rVar, uVar), true, 2039820996));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ d0(z3.r rVar, fn.c cVar, Function1 function1, Function1 function12, Function2 function2, Function1 function13, Function0 function0, z3.u uVar) {
        this.f18432b = rVar;
        this.f18433c = cVar;
        this.f18434d = function1;
        this.f18435e = function12;
        this.f18436f = function2;
        this.f18437g = function13;
        this.f18438h = function0;
        this.f18439i = uVar;
    }
}
