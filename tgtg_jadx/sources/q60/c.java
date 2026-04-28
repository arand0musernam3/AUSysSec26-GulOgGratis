package q60;

import b4.q;
import b4.t;
import b5.j;
import bx.k;
import com.tgtg.componentlibrary.component.iconbutton.PantryIconButtonKt;
import com.tgtg.componentlibrary.component.iconbutton.model.IconButtonGeometry;
import d2.h2;
import d2.i2;
import d2.m2;
import g3.v0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m3.e0;
import m3.f;
import m3.i;
import m3.m;
import m3.n;
import m3.s;
import u3.e;
import z5.h;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f36344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f36345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f36346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f36347e;

    public /* synthetic */ c(boolean z11, IconButtonGeometry iconButtonGeometry, long j9, Function2 function2) {
        this.f36343a = 1;
        this.f36344b = z11;
        this.f36345c = iconButtonGeometry;
        this.f36346d = j9;
        this.f36347e = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f36343a) {
            case 0:
                IconButtonGeometry iconButtonGeometry = (IconButtonGeometry) this.f36345c;
                Function2 function2 = (Function2) this.f36347e;
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e0 e0Var = v0.f19606a;
                    long j9 = this.f36346d;
                    i.a(b3.i.u(j9, e0Var), e.e(-1305250554, sVar, new c(this.f36344b, iconButtonGeometry, j9, function2)), sVar, 56);
                } else {
                    sVar.U();
                }
                break;
            case 1:
                IconButtonGeometry iconButtonGeometry2 = (IconButtonGeometry) this.f36345c;
                Function2 function22 = (Function2) this.f36347e;
                n nVar2 = (n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                s sVar2 = (s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    PantryIconButtonKt.a(this.f36344b, iconButtonGeometry2, this.f36346d, function22, sVar2, 0);
                } else {
                    sVar2.U();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                PantryIconButtonKt.a(this.f36344b, (IconButtonGeometry) this.f36345c, this.f36346d, (Function2) this.f36347e, (n) obj, i.F(1));
                break;
            default:
                t tVar = (t) this.f36345c;
                final a3.t tVar2 = (a3.t) this.f36347e;
                n nVar3 = (n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                s sVar3 = (s) nVar3;
                if (sVar3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    long j11 = this.f36346d;
                    boolean z11 = this.f36344b;
                    f fVar = m.f29332a;
                    if (j11 != 9205357640488583168L) {
                        sVar3.a0(3458246);
                        d2.b bVar = z11 ? d2.c.f13756b : d2.c.f13755a;
                        t tVarK = m2.k(tVar, h.b(j11), h.a(j11), 0.0f, 0.0f, 12);
                        i2 i2VarA = h2.a(bVar, b4.d.f5692j, sVar3, 0);
                        int iHashCode = Long.hashCode(sVar3.T);
                        u3.i iVarL = sVar3.l();
                        t tVarC = b4.a.c(tVarK, sVar3);
                        j.R.getClass();
                        b5.h hVar = b5.i.f5839b;
                        sVar3.e0();
                        if (sVar3.S) {
                            sVar3.k(hVar);
                        } else {
                            sVar3.n0();
                        }
                        i.C(i2VarA, b5.i.f5843f, sVar3);
                        i.C(iVarL, b5.i.f5842e, sVar3);
                        i.v(sVar3, Integer.valueOf(iHashCode), b5.i.f5844g);
                        i.z(sVar3, b5.i.f5845h);
                        i.C(tVarC, b5.i.f5841d, sVar3);
                        boolean zH = sVar3.h(tVar2);
                        Object objM = sVar3.M();
                        if (zH || objM == fVar) {
                            final int i11 = 0;
                            objM = new Function0() { // from class: a3.f
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i11) {
                                        case 0:
                                            return Boolean.valueOf((tVar2.a() & 9223372034707292159L) != 9205357640488583168L);
                                        default:
                                            return Boolean.valueOf((tVar2.a() & 9223372034707292159L) != 9205357640488583168L);
                                    }
                                }
                            };
                            sVar3.k0(objM);
                        }
                        k.j(6, q.f5711a, (Function0) objM, sVar3, z11);
                        sVar3.q(true);
                        sVar3.q(false);
                    } else {
                        sVar3.a0(4389176);
                        boolean zH2 = sVar3.h(tVar2);
                        Object objM2 = sVar3.M();
                        if (zH2 || objM2 == fVar) {
                            final int i12 = 1;
                            objM2 = new Function0() { // from class: a3.f
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i12) {
                                        case 0:
                                            return Boolean.valueOf((tVar2.a() & 9223372034707292159L) != 9205357640488583168L);
                                        default:
                                            return Boolean.valueOf((tVar2.a() & 9223372034707292159L) != 9205357640488583168L);
                                    }
                                }
                            };
                            sVar3.k0(objM2);
                        }
                        k.j(0, tVar, (Function0) objM2, sVar3, z11);
                        sVar3.q(false);
                    }
                } else {
                    sVar3.U();
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ c(long j9, boolean z11, Object obj, Object obj2, int i11) {
        this.f36343a = i11;
        this.f36346d = j9;
        this.f36344b = z11;
        this.f36345c = obj;
        this.f36347e = obj2;
    }

    public /* synthetic */ c(boolean z11, IconButtonGeometry iconButtonGeometry, long j9, Function2 function2, int i11) {
        this.f36343a = 2;
        this.f36344b = z11;
        this.f36345c = iconButtonGeometry;
        this.f36346d = j9;
        this.f36347e = function2;
    }
}
