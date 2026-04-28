package c60;

import b4.q;
import b4.t;
import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.remote.manufacturer.response.BasketItem;
import com.app.tgtg.model.remote.manufacturer.response.BasketResponse;
import com.tgtg.componentlibrary.component.avatar.PantryAvatarKt;
import com.tgtg.componentlibrary.component.avatar.model.AvatarSize;
import com.tgtg.componentlibrary.component.avatar.model.AvatarVariant;
import d2.h2;
import d2.i2;
import d2.m2;
import d2.n1;
import g3.s0;
import g3.v;
import i4.g0;
import i4.r0;
import i4.v0;
import i80.n;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import l2.g;
import m3.b1;
import m3.i;
import m3.i1;
import m3.m;
import m3.s;
import um.u;
import us.j;
import v1.a0;
import ym.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7775a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f7780f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f7781g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f7782h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f7783i;

    public /* synthetic */ d(int i11, int i12, BasketManager basketManager, BasketItem basketItem, n nVar, b1 b1Var, i1 i1Var, u uVar) {
        this.f7776b = uVar;
        this.f7780f = basketItem;
        this.f7781g = basketManager;
        this.f7778d = i11;
        this.f7779e = i12;
        this.f7782h = b1Var;
        this.f7777c = nVar;
        this.f7783i = i1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7775a) {
            case 0:
                ((Integer) obj2).intValue();
                PantryAvatarKt.PantryAvatar((t) this.f7776b, (n) this.f7777c, (String) this.f7780f, (String) this.f7781g, (AvatarVariant) this.f7782h, (AvatarSize) this.f7783i, (m3.n) obj, i.F(this.f7778d | 1), this.f7779e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                s0.b((t) this.f7776b, (v0) this.f7780f, (g3.u) this.f7781g, (v) this.f7782h, (a0) this.f7783i, (n) this.f7777c, (m3.n) obj, i.F(this.f7778d | 1), this.f7779e);
                break;
            case 2:
                ((Integer) obj2).getClass();
                na0.a.H((BasketResponse) this.f7776b, (List) this.f7777c, (n1) this.f7780f, (BasketManager) this.f7781g, this.f7778d, (u) this.f7782h, (z) this.f7783i, (m3.n) obj, i.F(this.f7779e | 1));
                break;
            default:
                final u uVar = (u) this.f7776b;
                final BasketItem basketItem = (BasketItem) this.f7780f;
                final BasketManager basketManager = (BasketManager) this.f7781g;
                final b1 b1Var = (b1) this.f7782h;
                final n nVar = (n) this.f7777c;
                final i1 i1Var = (i1) this.f7783i;
                m3.n nVar2 = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = (s) nVar2;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    t tVarD = m2.d(q.f5711a, 1.0f);
                    long j9 = lv.s.J;
                    t tVarJ = v1.n.j(tVarD, j9, g0.f23254b);
                    g3.u uVarP = s0.p(j9, sVar, 6);
                    l2.f fVarB = g.b(12);
                    boolean zH = sVar.h(uVar) | sVar.h(basketItem);
                    Object objM = sVar.M();
                    if (zH || objM == m.f29332a) {
                        objM = new j(8, uVar, basketItem);
                        sVar.k0(objM);
                    }
                    Function0 function0 = (Function0) objM;
                    final int i11 = this.f7778d;
                    final int i12 = this.f7779e;
                    s0.c(function0, tVarJ, false, fVarB, uVarP, null, u3.e.e(530568022, sVar, new n() { // from class: vm.g
                        @Override // i80.n
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            final b1 b1Var2;
                            final int i13;
                            final BasketItem basketItem2;
                            m3.n nVar3 = (m3.n) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            ((d2.z) obj3).getClass();
                            s sVar2 = (s) nVar3;
                            if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                long j11 = lv.s.J;
                                r0 r0Var = g0.f23254b;
                                b4.q qVar = b4.q.f5711a;
                                t tVarB = d2.c.B(v1.n.j(qVar, j11, r0Var), 0.0f, lv.t.f28251e, 1);
                                i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5692j, sVar2, 0);
                                int iHashCode = Long.hashCode(sVar2.T);
                                u3.i iVarL = sVar2.l();
                                t tVarC = b4.a.c(tVarB, sVar2);
                                b5.j.R.getClass();
                                b5.h hVar = b5.i.f5839b;
                                sVar2.e0();
                                if (sVar2.S) {
                                    sVar2.k(hVar);
                                } else {
                                    sVar2.n0();
                                }
                                m3.i.C(i2VarA, b5.i.f5843f, sVar2);
                                m3.i.C(iVarL, b5.i.f5842e, sVar2);
                                m3.i.v(sVar2, Integer.valueOf(iHashCode), b5.i.f5844g);
                                m3.i.z(sVar2, b5.i.f5845h);
                                m3.i.C(tVarC, b5.i.f5841d, sVar2);
                                final u uVar2 = uVar;
                                boolean zH2 = sVar2.h(uVar2);
                                final i80.n nVar4 = nVar;
                                boolean zF = zH2 | sVar2.f(nVar4);
                                BasketItem basketItem3 = basketItem;
                                boolean zH3 = zF | sVar2.h(basketItem3);
                                int i14 = i12;
                                boolean zD = zH3 | sVar2.d(i14);
                                Object objM2 = sVar2.M();
                                b1 b1Var3 = b1Var;
                                if (zD || objM2 == m3.m.f29332a) {
                                    b1Var2 = b1Var3;
                                    final i1 i1Var2 = i1Var;
                                    i13 = i14;
                                    basketItem2 = basketItem3;
                                    Function1 function1 = new Function1() { // from class: vm.d
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj6) {
                                            int iIntValue3 = ((Integer) obj6).intValue();
                                            if (iIntValue3 == -749) {
                                                uVar2.s(um.g.MAX_ITEM_COUNT);
                                            } else {
                                                i80.n nVar5 = nVar4;
                                                b1 b1Var4 = b1Var2;
                                                if (nVar5 != null) {
                                                    nVar5.invoke(basketItem2.getItemId(), Integer.valueOf(i13 + iIntValue3), b1Var4.getValue());
                                                }
                                                i1 i1Var3 = i1Var2;
                                                i1Var3.i(i1Var3.h() + 1);
                                                b1Var4.setValue(Boolean.TRUE);
                                            }
                                            return Unit.f26487a;
                                        }
                                    };
                                    sVar2.k0(function1);
                                    objM2 = function1;
                                } else {
                                    i13 = i14;
                                    basketItem2 = basketItem3;
                                    b1Var2 = b1Var3;
                                }
                                BasketItem basketItem4 = basketItem2;
                                b1 b1Var4 = b1Var2;
                                lx.u.c(i11, i13, 221184, basketManager, basketItem4, (Function1) objM2, sVar2, b1Var4);
                                t tVarB2 = d2.c.B(qVar, lv.t.f28252f, 0.0f, 2);
                                if (1.0f <= 0.0d) {
                                    e2.a.a("invalid weight; must be greater than zero");
                                }
                                na0.a.G(basketItem4, b3.i.e(1.0f, tVarB2, true), sVar2, 0);
                                na0.a.F(basketItem4, b1Var4, f4.g.b(m2.e(m2.q(qVar, 62), 32), l2.g.b(4)), sVar2, 48);
                                sVar2.q(true);
                            } else {
                                sVar2.U();
                            }
                            return Unit.f26487a;
                        }
                    }), sVar, 100663344, 228);
                } else {
                    sVar.U();
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ d(t tVar, v0 v0Var, g3.u uVar, v vVar, a0 a0Var, n nVar, int i11, int i12) {
        this.f7776b = tVar;
        this.f7780f = v0Var;
        this.f7781g = uVar;
        this.f7782h = vVar;
        this.f7783i = a0Var;
        this.f7777c = nVar;
        this.f7778d = i11;
        this.f7779e = i12;
    }

    public /* synthetic */ d(t tVar, n nVar, String str, String str2, AvatarVariant avatarVariant, AvatarSize avatarSize, int i11, int i12) {
        this.f7776b = tVar;
        this.f7777c = nVar;
        this.f7780f = str;
        this.f7781g = str2;
        this.f7782h = avatarVariant;
        this.f7783i = avatarSize;
        this.f7778d = i11;
        this.f7779e = i12;
    }

    public /* synthetic */ d(BasketResponse basketResponse, List list, n1 n1Var, BasketManager basketManager, int i11, u uVar, z zVar, int i12) {
        this.f7776b = basketResponse;
        this.f7777c = list;
        this.f7780f = n1Var;
        this.f7781g = basketManager;
        this.f7778d = i11;
        this.f7782h = uVar;
        this.f7783i = zVar;
        this.f7779e = i12;
    }
}
