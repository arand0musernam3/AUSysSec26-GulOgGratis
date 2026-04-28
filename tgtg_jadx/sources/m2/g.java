package m2;

import a3.l2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x2.w f28856b;

    public /* synthetic */ g(x2.w wVar, int i11) {
        this.f28855a = i11;
        this.f28856b = wVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        z4.z zVarQ;
        h4.c cVar;
        switch (this.f28855a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                x2.w wVar = this.f28856b;
                m3.k1 k1Var = wVar.f43798s;
                w2.s1 s1Var = wVar.f43781a;
                boolean zD = m5.t0.d(s1Var.d().f41929d);
                if (((zD && ((x2.b0) k1Var.getValue()) == x2.b0.Cursor) || (!zD && ((x2.b0) k1Var.getValue()) == x2.b0.Selection)) && wVar.l() == null && ((Boolean) wVar.f43791k.getValue()).booleanValue() && (zVarQ = wVar.q()) != null) {
                    h4.c cVarC = l2.c(zVarQ);
                    h4.c cVarS = na0.a.S(zVarQ.S(cVarC.f()), cVarC.e());
                    z4.z zVarQ2 = wVar.q();
                    if (zVarQ2 == null) {
                        c2.a.d("textLayoutCoordinates should not be null.");
                        qc.y.m();
                    } else {
                        long j9 = s1Var.d().f41929d;
                        if (m5.t0.d(j9)) {
                            h4.c cVarK = wVar.k();
                            cVar = na0.a.S(zVarQ2.S(cVarK.f()), cVarK.e());
                        } else {
                            long jS = zVarQ2.S(wVar.o(true));
                            long jS2 = zVarQ2.S(wVar.o(false));
                            m5.q0 q0VarG = wVar.f43782b.f43008b.g();
                            if (q0VarG == null) {
                                cVar = h4.c.f21379e;
                            } else {
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (zVarQ2.S((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(q0VarG.c((int) (j9 >> 32)).f21381b)) & 4294967295L)) & 4294967295L));
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (zVarQ2.S((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(q0VarG.c((int) (j9 & 4294967295L)).f21381b)) & 4294967295L)) & 4294967295L));
                                int i11 = (int) (jS >> 32);
                                int i12 = (int) (jS2 >> 32);
                                cVar = new h4.c(Math.min(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12)), Math.max(Float.intBitsToFloat((int) (jS & 4294967295L)), Float.intBitsToFloat((int) (jS2 & 4294967295L))));
                            }
                        }
                        if (cVar.i(cVarS)) {
                        }
                    }
                }
                break;
            case 5:
                break;
            case 6:
                this.f28856b.d();
                break;
            case 7:
                break;
            case 8:
                v2.h hVar = this.f28856b.f43781a.f43043a;
                y2.c cVar2 = y2.c.MergeIfPossible;
                hVar.f41936b.a().m();
                v2.a aVar = hVar.f41936b;
                v2.k.g(aVar, 0, aVar.f41920b.length());
                v2.h.a(hVar, true, cVar2);
                break;
            default:
                Function0 function0 = this.f28856b.l;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
        return Unit.f26487a;
    }
}
