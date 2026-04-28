package b5;

import c5.e3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 extends Lambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5905c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(c5.y yVar, Function2 function2, int i11) {
        super(2);
        this.f5903a = 1;
        this.f5904b = yVar;
        this.f5905c = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5903a) {
            case 0:
                i4.t tVar = (i4.t) obj;
                l4.b bVar = (l4.b) obj2;
                s1 s1Var = (s1) this.f5904b;
                m0 m0Var = s1Var.f5966p;
                if (m0Var.J()) {
                    s1Var.I = tVar;
                    s1Var.H = bVar;
                    ((c5.y) p0.a(m0Var)).getSnapshotObserver().f5819a.d(s1Var, s1.P, (o1) this.f5905c);
                    s1Var.L = false;
                } else {
                    s1Var.L = true;
                }
                break;
            case 1:
                ((Number) obj2).intValue();
                c5.v0.a((c5.y) this.f5904b, (Function2) this.f5905c, (m3.n) obj, m3.i.F(1));
                break;
            case 2:
                int iIntValue = ((Number) obj).intValue();
                j5.t tVar2 = (j5.t) obj2;
                d4.e eVar = (d4.e) this.f5905c;
                if (!((e3) this.f5904b).f7185b.a(tVar2.f24699g)) {
                    eVar.k(iIntValue, tVar2);
                    eVar.f14039h.h(Unit.f26487a);
                }
                break;
            default:
                m3.n nVar = (m3.n) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Boolean bool = (Boolean) ((z4.j0) this.f5904b).f47155g.getValue();
                    boolean zBooleanValue = bool.booleanValue();
                    Function2 function2 = (Function2) this.f5905c;
                    sVar.d0(bool);
                    boolean zG = sVar.g(zBooleanValue);
                    if (zBooleanValue) {
                        function2.invoke(sVar, 0);
                    } else {
                        if (sVar.l != 0) {
                            m3.v.a("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!sVar.S) {
                            if (zG) {
                                m3.l2 l2Var = sVar.G;
                                int i11 = l2Var.f29325g;
                                int i12 = l2Var.f29326h;
                                n3.b bVar2 = sVar.M;
                                bVar2.getClass();
                                bVar2.d(false);
                                bVar2.f30440b.f30437h.K(n3.i.f30464c);
                                m3.t.a(sVar.f29434s, i11, i12);
                                sVar.G.t();
                            } else {
                                sVar.T();
                            }
                        }
                    }
                    if (sVar.f29440y && sVar.G.f29327i == sVar.f29441z) {
                        sVar.f29441z = -1;
                        sVar.f29440y = false;
                    }
                    sVar.q(false);
                } else {
                    sVar.U();
                }
                break;
        }
        return Unit.f26487a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n1(int i11, Object obj, Object obj2) {
        super(2);
        this.f5903a = i11;
        this.f5904b = obj;
        this.f5905c = obj2;
    }
}
