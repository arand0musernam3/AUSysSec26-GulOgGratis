package bn;

import a3.n2;
import com.app.tgtg.model.local.LatestInteractionOrigin;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import com.tgtg.componentlibrary.component.badgelabel.PantryBadgeLabelKt;
import com.tgtg.componentlibrary.component.badgelabel.model.BadgeLabelColors;
import com.tgtg.componentlibrary.component.badgelabel.model.BadgeLabelGeometry;
import d2.m2;
import g3.s0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6440a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f6441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f6446g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f6447h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f6448i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f6449j;

    public /* synthetic */ f(b4.t tVar, String str, String str2, BadgeLabelColors badgeLabelColors, BadgeLabelGeometry badgeLabelGeometry, boolean z11, Function2 function2, Function2 function22, int i11) {
        this.f6444e = tVar;
        this.f6445f = str;
        this.f6442c = str2;
        this.f6446g = badgeLabelColors;
        this.f6447h = badgeLabelGeometry;
        this.f6441b = z11;
        this.f6448i = function2;
        this.f6449j = function22;
        this.f6443d = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6440a) {
            case 0:
                x60.h hVar = (x60.h) this.f6444e;
                x60.k kVar = (x60.k) this.f6445f;
                Function1 function1 = (Function1) this.f6442c;
                final BaseItemMnuV2 baseItemMnuV2 = (BaseItemMnuV2) this.f6446g;
                final x60.m mVar = (x60.m) this.f6447h;
                final LatestInteractionOrigin latestInteractionOrigin = (LatestInteractionOrigin) this.f6448i;
                final ym.z zVar = (ym.z) this.f6449j;
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    b4.t tVarE = m2.e(m2.q(b4.q.f5711a, 195), 214);
                    g3.u uVarP = s0.p(hVar.G, sVar, 0);
                    l2.f fVarB = l2.g.b(kVar.f43987k);
                    g3.v vVarQ = s0.q(4, 0.0f, 0.0f, 0.0f, 62);
                    boolean zF = sVar.f(function1) | sVar.h(baseItemMnuV2);
                    Object objM = sVar.M();
                    if (zF || objM == m3.m.f29332a) {
                        objM = new n2(29, function1, baseItemMnuV2);
                        sVar.k0(objM);
                    }
                    final int i11 = this.f6443d;
                    final boolean z11 = this.f6441b;
                    s0.c((Function0) objM, tVarE, false, fVarB, uVarP, vVarQ, u3.e.e(705439677, sVar, new i80.n() { // from class: bn.i
                        @Override // i80.n
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            float f11 = mVar.l;
                            m3.n nVar2 = (m3.n) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            ((d2.z) obj3).getClass();
                            m3.s sVar2 = (m3.s) nVar2;
                            if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                b4.q qVar = b4.q.f5711a;
                                b4.t tVarZ = d2.c.z(qVar, f11);
                                d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar2, 0);
                                int iHashCode = Long.hashCode(sVar2.T);
                                u3.i iVarL = sVar2.l();
                                b4.t tVarC = b4.a.c(tVarZ, sVar2);
                                b5.j.R.getClass();
                                b5.h hVar2 = b5.i.f5839b;
                                sVar2.e0();
                                if (sVar2.S) {
                                    sVar2.k(hVar2);
                                } else {
                                    sVar2.n0();
                                }
                                m3.i.C(yVarA, b5.i.f5843f, sVar2);
                                m3.i.C(iVarL, b5.i.f5842e, sVar2);
                                m3.i.v(sVar2, Integer.valueOf(iHashCode), b5.i.f5844g);
                                m3.i.z(sVar2, b5.i.f5845h);
                                m3.i.C(tVarC, b5.i.f5841d, sVar2);
                                BaseItemMnuV2 baseItemMnuV22 = baseItemMnuV2;
                                jb.u.j(baseItemMnuV22, sVar2, 0);
                                jb.u.k(baseItemMnuV22, sVar2, 0);
                                d2.c.f(m2.e(qVar, f11), sVar2);
                                jb.u.q(baseItemMnuV22, i11, z11, latestInteractionOrigin, zVar, sVar2, 0);
                                sVar2.q(true);
                            } else {
                                sVar2.U();
                            }
                            return Unit.f26487a;
                        }
                    }), sVar, 100663344, 196);
                } else {
                    sVar.U();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                cp.a.e((String) this.f6444e, (List) this.f6445f, (List) this.f6446g, this.f6441b, (Function1) this.f6442c, (String) this.f6447h, (g4.v) this.f6448i, (Function1) this.f6449j, (m3.n) obj, m3.i.F(14180353), this.f6443d);
                break;
            default:
                ((Integer) obj2).getClass();
                PantryBadgeLabelKt.b((b4.t) this.f6444e, (String) this.f6445f, (String) this.f6442c, (BadgeLabelColors) this.f6446g, (BadgeLabelGeometry) this.f6447h, this.f6441b, (Function2) this.f6448i, (Function2) this.f6449j, (m3.n) obj, m3.i.F(this.f6443d | 1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ f(String str, List list, List list2, boolean z11, Function1 function1, String str2, g4.v vVar, Function1 function12, int i11, int i12) {
        this.f6444e = str;
        this.f6445f = list;
        this.f6446g = list2;
        this.f6441b = z11;
        this.f6442c = function1;
        this.f6447h = str2;
        this.f6448i = vVar;
        this.f6449j = function12;
        this.f6443d = i12;
    }

    public /* synthetic */ f(x60.h hVar, x60.k kVar, Function1 function1, BaseItemMnuV2 baseItemMnuV2, x60.m mVar, int i11, boolean z11, LatestInteractionOrigin latestInteractionOrigin, ym.z zVar) {
        this.f6444e = hVar;
        this.f6445f = kVar;
        this.f6442c = function1;
        this.f6446g = baseItemMnuV2;
        this.f6447h = mVar;
        this.f6443d = i11;
        this.f6441b = z11;
        this.f6448i = latestInteractionOrigin;
        this.f6449j = zVar;
    }
}
