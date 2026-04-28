package cg;

import com.app.tgtg.model.remote.item.Picture;
import com.app.tgtg.model.remote.voucher.FilteredStore;
import d2.m2;
import g3.r9;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m3.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8104a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f8106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f8107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f8109f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f8110g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f8111h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f8112i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f8113j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f8114k;

    public /* synthetic */ s0(Integer num, m5.u0 u0Var, Integer num2, m5.u0 u0Var2, b1 b1Var, z4.z zVar, float f11, Function0 function0, boolean z11, int i11) {
        this.f8108e = num;
        this.f8110g = u0Var;
        this.f8109f = num2;
        this.f8111h = u0Var2;
        this.f8112i = b1Var;
        this.f8113j = zVar;
        this.f8106c = f11;
        this.f8114k = function0;
        this.f8107d = z11;
        this.f8105b = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b4.q qVar;
        boolean z11;
        switch (this.f8104a) {
            case 0:
                ((Integer) obj2).getClass();
                j.r((Integer) this.f8108e, (m5.u0) this.f8110g, (Integer) this.f8109f, (m5.u0) this.f8111h, (b1) this.f8112i, (z4.z) this.f8113j, this.f8106c, (Function0) this.f8114k, this.f8107d, (m3.n) obj, m3.i.F(this.f8105b | 1));
                return Unit.f26487a;
            default:
                List list = (List) this.f8108e;
                x60.l lVar = (x60.l) this.f8109f;
                x60.m mVar = (x60.m) this.f8110g;
                x60.j jVar = (x60.j) this.f8111h;
                x60.h hVar = (x60.h) this.f8112i;
                String str = (String) this.f8113j;
                String str2 = (String) this.f8114k;
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    List listM0 = CollectionsKt.m0(list, list.size() <= 3 ? list.size() : 3);
                    int size = listM0.size();
                    int i11 = this.f8105b;
                    int i12 = size + (i11 > 0 ? 1 : 0);
                    float f11 = lVar.f43995g;
                    float f12 = this.f8106c;
                    float f13 = (i12 * f11) - ((i12 - 1) * f12);
                    b4.q qVar2 = b4.q.f5711a;
                    b4.t tVarE = m2.e(m2.q(qVar2, f13), f11);
                    z4.u0 u0VarD = d2.p.d(b4.d.f5683a, false);
                    int iHashCode = Long.hashCode(sVar.T);
                    u3.i iVarL = sVar.l();
                    b4.t tVarC = b4.a.c(tVarE, sVar);
                    b5.j.R.getClass();
                    b5.h hVar2 = b5.i.f5839b;
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(hVar2);
                    } else {
                        sVar.n0();
                    }
                    m3.i.C(u0VarD, b5.i.f5843f, sVar);
                    m3.i.C(iVarL, b5.i.f5842e, sVar);
                    m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
                    m3.i.z(sVar, b5.i.f5845h);
                    m3.i.C(tVarC, b5.i.f5841d, sVar);
                    sVar.a0(-1739212426);
                    int i13 = 0;
                    for (Iterator it = listM0.iterator(); it.hasNext(); it = it) {
                        Object next = it.next();
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            kotlin.collections.d0.n();
                            throw null;
                        }
                        FilteredStore filteredStore = (FilteredStore) next;
                        Picture storeLogo = filteredStore.getStoreLogo();
                        String currentUrl = storeLogo != null ? storeLogo.getCurrentUrl() : null;
                        String str3 = "";
                        if (currentUrl == null) {
                            currentUrl = "";
                        }
                        String name = filteredStore.getName();
                        if (name != null) {
                            str3 = name;
                        }
                        a.a.s(currentUrl, str3, this.f8107d, b4.a.d(d2.c.w(qVar2, (f11 - f12) * i13, 0.0f, 2), listM0.size() - i13), sVar, 0);
                        f12 = f12;
                        i13 = i14;
                    }
                    float f14 = f12;
                    sVar.q(false);
                    if (i11 > 0) {
                        sVar.a0(1919472717);
                        b4.t tVarJ = v1.n.j(m2.m(b4.a.d(d2.c.w(qVar2, (f11 - f14) * listM0.size(), 0.0f, 2), listM0.size() - r7), f11), hVar.G, l2.g.f26790a);
                        z4.u0 u0VarD2 = d2.p.d(b4.d.f5687e, false);
                        int iHashCode2 = Long.hashCode(sVar.T);
                        u3.i iVarL2 = sVar.l();
                        b4.t tVarC2 = b4.a.c(tVarJ, sVar);
                        b5.j.R.getClass();
                        b5.h hVar3 = b5.i.f5839b;
                        sVar.e0();
                        if (sVar.S) {
                            sVar.k(hVar3);
                        } else {
                            sVar.n0();
                        }
                        m3.i.C(u0VarD2, b5.i.f5843f, sVar);
                        m3.i.C(iVarL2, b5.i.f5842e, sVar);
                        m3.i.v(sVar, Integer.valueOf(iHashCode2), b5.i.f5844g);
                        m3.i.z(sVar, b5.i.f5845h);
                        m3.i.C(tVarC2, b5.i.f5841d, sVar);
                        qVar = qVar2;
                        z11 = true;
                        r9.d(str2, null, hVar.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43960i, sVar, 0, 0, 131066);
                        sVar.q(true);
                        sVar.q(false);
                    } else {
                        qVar = qVar2;
                        z11 = true;
                        sVar.a0(1920236712);
                        sVar.q(false);
                    }
                    sVar.q(z11);
                    d2.c.f(m2.q(qVar, mVar.f44016m), sVar);
                    r9.d(str, null, hVar.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43968r, sVar, 0, 0, 131066);
                } else {
                    sVar.U();
                }
                return Unit.f26487a;
        }
    }

    public /* synthetic */ s0(List list, int i11, x60.l lVar, float f11, x60.m mVar, x60.j jVar, x60.h hVar, String str, boolean z11, String str2) {
        this.f8108e = list;
        this.f8105b = i11;
        this.f8109f = lVar;
        this.f8106c = f11;
        this.f8110g = mVar;
        this.f8111h = jVar;
        this.f8112i = hVar;
        this.f8113j = str;
        this.f8107d = z11;
        this.f8114k = str2;
    }
}
