package ph;

import b4.q;
import b5.j;
import com.app.tgtg.R;
import d2.m2;
import d2.p;
import d2.z;
import i80.n;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lv.t;
import m3.s;
import o30.e0;
import ox.h;
import u3.i;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f35335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f35336c;

    public /* synthetic */ c(String str, String str2, int i11) {
        this.f35334a = i11;
        this.f35335b = str;
        this.f35336c = str2;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i11 = this.f35334a;
        String str = this.f35335b;
        switch (i11) {
            case 0:
                m3.n nVar = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((f2.d) obj).getClass();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    boolean zAreEqual = Intrinsics.areEqual(str, "LocalHeroes");
                    h.a(this.f35336c, zAreEqual ? R.drawable.local_hero_blob : R.drawable.gfx_star, zAreEqual ? 0 : 2, zAreEqual ? t.f28247a : t.f28253g, zAreEqual ? lv.s.C : lv.s.f28217b, sVar, 0);
                } else {
                    sVar.U();
                }
                break;
            default:
                m3.n nVar2 = (m3.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((z) obj).getClass();
                s sVar2 = (s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    b4.t tVarE = m2.e(m2.d(q.f5711a, 1.0f), 88);
                    u0 u0VarD = p.d(b4.d.f5687e, false);
                    int iHashCode = Long.hashCode(sVar2.T);
                    i iVarL = sVar2.l();
                    b4.t tVarC = b4.a.c(tVarE, sVar2);
                    j.R.getClass();
                    b5.h hVar = b5.i.f5839b;
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(hVar);
                    } else {
                        sVar2.n0();
                    }
                    m3.i.C(u0VarD, b5.i.f5843f, sVar2);
                    m3.i.C(iVarL, b5.i.f5842e, sVar2);
                    m3.i.v(sVar2, Integer.valueOf(iHashCode), b5.i.f5844g);
                    m3.i.z(sVar2, b5.i.f5845h);
                    m3.i.C(tVarC, b5.i.f5841d, sVar2);
                    e0.o(str, this.f35336c, sVar2, 0);
                    sVar2.q(true);
                } else {
                    sVar2.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}
