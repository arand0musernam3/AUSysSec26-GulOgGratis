package fg;

import b4.t;
import com.app.tgtg.model.remote.item.response.BasicItem;
import d2.m2;
import g3.ba;
import g3.na;
import g3.r9;
import g3.s0;
import g3.v0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l3.m0;
import m3.s;
import m3.v1;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17679a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f17680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f17681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17682d;

    public /* synthetic */ d(float f11, long j9, u3.d dVar) {
        this.f17680b = f11;
        this.f17681c = j9;
        this.f17682d = dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17679a) {
            case 0:
                ((Integer) obj2).getClass();
                zz.f.c((BasicItem) this.f17682d, this.f17681c, this.f17680b, (m3.n) obj, m3.i.F(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                s0.d((t) this.f17682d, this.f17680b, this.f17681c, (m3.n) obj, m3.i.F(433));
                break;
            default:
                u3.d dVar = (u3.d) this.f17682d;
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    t tVarY = d2.c.y(m2.p(b4.q.f5711a, ba.f18380c, ba.f18379b, this.f17680b, 0.0f, 8), ba.f18381d);
                    u0 u0VarD = d2.p.d(b4.d.f5683a, false);
                    int iHashCode = Long.hashCode(sVar.T);
                    u3.i iVarL = sVar.l();
                    t tVarC = b4.a.c(tVarY, sVar);
                    b5.j.R.getClass();
                    b5.h hVar = b5.i.f5839b;
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(hVar);
                    } else {
                        sVar.n0();
                    }
                    m3.i.C(u0VarD, b5.i.f5843f, sVar);
                    m3.i.C(iVarL, b5.i.f5842e, sVar);
                    b5.g gVar = b5.i.f5844g;
                    if (sVar.S || !Intrinsics.areEqual(sVar.M(), Integer.valueOf(iHashCode))) {
                        e0.f.y(iHashCode, sVar, iHashCode, gVar);
                    }
                    m3.i.C(tVarC, b5.i.f5841d, sVar);
                    m3.i.b(new v1[]{b3.i.u(this.f17681c, v0.f19606a), r9.f19436a.a(na.a(m0.f27047d, sVar))}, dVar, sVar, 8);
                    sVar.q(true);
                } else {
                    sVar.U();
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ d(t tVar, float f11, long j9, int i11) {
        this.f17682d = tVar;
        this.f17680b = f11;
        this.f17681c = j9;
    }

    public /* synthetic */ d(BasicItem basicItem, long j9, float f11, int i11) {
        this.f17682d = basicItem;
        this.f17681c = j9;
        this.f17680b = f11;
    }
}
