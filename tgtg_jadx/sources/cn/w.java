package cn;

import com.app.tgtg.feature.main.fragments.browse.map.bottomSheet.MapBottomSheet;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.HighlightedItemMnuV2;
import com.app.tgtg.model.remote.profile.response.ProfileFeature;
import com.app.tgtg.model.remote.voucher.response.AddNewVoucherResponse;
import com.tgtg.componentlibrary.component.chip.model.ChipGeometry;
import d2.m2;
import d2.z1;
import g3.r9;
import g3.s0;
import g3.v2;
import g3.w6;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.b1;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class w implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f8595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f8599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f8600g;

    public /* synthetic */ w(b4.t tVar, String str, i4.v vVar, Integer num, boolean z11, Boolean bool, int i11) {
        this.f8594a = 11;
        this.f8596c = tVar;
        this.f8598e = str;
        this.f8597d = vVar;
        this.f8599f = num;
        this.f8595b = z11;
        this.f8600g = bool;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i11 = this.f8594a;
        int i12 = 7;
        boolean z15 = this.f8595b;
        b4.q qVar = b4.q.f5711a;
        Object obj3 = this.f8600g;
        Object obj4 = this.f8599f;
        Object obj5 = this.f8598e;
        Object obj6 = this.f8597d;
        Object obj7 = this.f8596c;
        switch (i11) {
            case 0:
                ym.y yVar = (ym.y) obj7;
                HighlightedItemMnuV2 highlightedItemMnuV2 = (HighlightedItemMnuV2) obj6;
                String str = (String) obj5;
                String str2 = (String) obj4;
                String str3 = (String) obj3;
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    b4.t tVarA = f4.g.a(m2.e(m2.d(qVar, 1.0f), 232), z15 ? 1.0f : 0.4f);
                    g3.u uVarP = s0.p(lv.s.J, sVar, 6);
                    l2.f fVarB = l2.g.b(12);
                    g3.v vVarQ = s0.q(4, 0.0f, 0.0f, 0.0f, 62);
                    boolean zH = sVar.h(yVar) | sVar.h(highlightedItemMnuV2);
                    Object objM = sVar.M();
                    if (zH || objM == m3.m.f29332a) {
                        objM = new bs.b(i12, yVar, highlightedItemMnuV2);
                        sVar.k0(objM);
                    }
                    s0.c((Function0) objM, tVarA, false, fVarB, uVarP, vVarQ, u3.e.e(-1952636026, sVar, new x(0, highlightedItemMnuV2, str, str2, str3)), sVar, 100663296, 196);
                } else {
                    sVar.U();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                g3.b.a((u3.d) obj7, (Function0) obj6, (b4.t) obj5, this.f8595b, (v2) obj4, (z1) obj3, (m3.n) obj, m3.i.F(7));
                break;
            case 2:
                ((Integer) obj2).getClass();
                hg.i.d((String) obj5, (u3.d) obj7, (u3.d) obj6, (String) obj4, this.f8595b, (Function0) obj3, (m3.n) obj, m3.i.F(433));
                break;
            case 3:
                Function2 function2 = (Function2) obj7;
                ChipGeometry chipGeometry = (ChipGeometry) obj6;
                String str4 = (String) obj5;
                Function2 function22 = (Function2) obj4;
                Function2 function23 = (Function2) obj3;
                m3.n nVar2 = (m3.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                m3.s sVar2 = (m3.s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    if (function2 != null) {
                        sVar2.a0(-1803092711);
                        b4.t tVarM = m2.m(qVar, chipGeometry.m782getIconSizeD9Ej5fM());
                        u0 u0VarD = d2.p.d(b4.d.f5687e, false);
                        z11 = z15;
                        int iHashCode = Long.hashCode(sVar2.T);
                        u3.i iVarL = sVar2.l();
                        b4.t tVarC = b4.a.c(tVarM, sVar2);
                        b5.j.R.getClass();
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
                        function2.invoke(sVar2, 0);
                        sVar2.q(true);
                        if (str4.length() > 0) {
                            sVar2.a0(-1802868147);
                            d2.c.f(m2.m(qVar, chipGeometry.m780getGapD9Ej5fM()), sVar2);
                            z12 = false;
                            sVar2.q(false);
                        } else {
                            z12 = false;
                            sVar2.a0(-1802797033);
                            sVar2.q(false);
                        }
                        sVar2.q(z12);
                    } else {
                        z11 = z15;
                        z12 = false;
                        sVar2.a0(-1802787113);
                        sVar2.q(false);
                    }
                    if (function22 != null) {
                        sVar2.a0(-1802746441);
                        b4.t tVarA2 = f4.g.a(qVar, z11 ? 1.0f : 0.5f);
                        u0 u0VarD2 = d2.p.d(b4.d.f5683a, z12);
                        int iHashCode2 = Long.hashCode(sVar2.T);
                        u3.i iVarL2 = sVar2.l();
                        b4.t tVarC2 = b4.a.c(tVarA2, sVar2);
                        b5.j.R.getClass();
                        b5.h hVar2 = b5.i.f5839b;
                        sVar2.e0();
                        if (sVar2.S) {
                            sVar2.k(hVar2);
                        } else {
                            sVar2.n0();
                        }
                        m3.i.C(u0VarD2, b5.i.f5843f, sVar2);
                        m3.i.C(iVarL2, b5.i.f5842e, sVar2);
                        m3.i.v(sVar2, Integer.valueOf(iHashCode2), b5.i.f5844g);
                        m3.i.z(sVar2, b5.i.f5845h);
                        m3.i.C(tVarC2, b5.i.f5841d, sVar2);
                        function22.invoke(sVar2, 0);
                        sVar2.q(true);
                        if (str4.length() > 0) {
                            sVar2.a0(-1802503618);
                            d2.c.f(m2.m(qVar, chipGeometry.m771getAvatarRightPaddingD9Ej5fM()), sVar2);
                            z14 = false;
                            sVar2.q(false);
                        } else {
                            z14 = false;
                            sVar2.a0(-1802418089);
                            sVar2.q(false);
                        }
                        sVar2.q(z14);
                    } else {
                        sVar2.a0(-1802408169);
                        sVar2.q(z12);
                    }
                    if (str4.length() > 0) {
                        sVar2.a0(-1802356244);
                        r9.d(str4, null, 0L, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, chipGeometry.getTextStyle(), sVar2, 0, 24960, 110590);
                        z13 = false;
                        sVar2.q(false);
                    } else {
                        z13 = false;
                        sVar2.a0(-1802181993);
                        sVar2.q(false);
                    }
                    if (function23 == null) {
                        sVar2.a0(-1802154962);
                    } else {
                        sVar2.a0(-2136344013);
                        function23.invoke(sVar2, 0);
                    }
                    sVar2.q(z13);
                } else {
                    sVar2.U();
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                lj.d.b((String) obj5, (Function0) obj7, (Function0) obj6, (Function0) obj4, this.f8595b, (i80.n) obj3, (m3.n) obj, m3.i.F(196609));
                break;
            case 5:
                ((Integer) obj2).getClass();
                lp.c.a((b4.t) obj7, (Function1) obj6, (Function0) obj5, this.f8595b, (Function1) obj4, (Function0) obj3, (m3.n) obj, m3.i.F(24577));
                break;
            case 6:
                ((Integer) obj2).getClass();
                lx.u.p((np.b) obj7, this.f8595b, (Function0) obj6, (Function0) obj4, (Function0) obj3, (String) obj5, (m3.n) obj, m3.i.F(3505));
                break;
            case 7:
                List list = (List) obj7;
                MapBottomSheet mapBottomSheet = (MapBottomSheet) obj6;
                Function1 function1 = (Function1) obj5;
                Function1 function12 = (Function1) obj4;
                Function1 function13 = (Function1) obj3;
                m3.n nVar3 = (m3.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i13 = MapBottomSheet.f9095y;
                m3.s sVar3 = (m3.s) nVar3;
                if (!sVar3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    sVar3.U();
                } else if (list.size() == 1) {
                    sVar3.a0(1996068924);
                    mapBottomSheet.j((BasicItem) CollectionsKt.O(list), this.f8595b, function1, function12, function13, sVar3, 0);
                    sVar3.q(false);
                } else {
                    sVar3.a0(1996509465);
                    pm.a.g(list, function1, function12, sVar3, 0);
                    sVar3.q(false);
                }
                break;
            case 8:
                ((Integer) obj2).getClass();
                int i14 = MapBottomSheet.f9095y;
                ((MapBottomSheet) obj7).j((BasicItem) obj6, this.f8595b, (Function1) obj5, (Function1) obj4, (Function1) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                rn.a.g((ProfileFeature) obj7, this.f8595b, (Function0) obj6, (Function1) obj5, (b1) obj4, (Function0) obj3, (m3.n) obj, m3.i.F(24577));
                break;
            case 10:
                ((Integer) obj2).getClass();
                rs.k.b((w6) obj7, (t5.a) obj6, (Function0) obj4, (AddNewVoucherResponse) obj3, (String) obj5, this.f8595b, (m3.n) obj, m3.i.F(385));
                break;
            case 11:
                ((Integer) obj2).getClass();
                w.b.k((b4.t) obj7, (String) obj5, (i4.v) obj6, (Integer) obj4, this.f8595b, (Boolean) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                yj.a.e((w6) obj7, this.f8595b, (vj.c) obj6, (Function0) obj5, (Function2) obj4, (Function0) obj3, (m3.n) obj, m3.i.F(1));
                break;
            default:
                ((Integer) obj2).getClass();
                yj.q.a((xj.k) obj7, (Function1) obj6, (Function1) obj5, (Function2) obj4, (Function0) obj3, this.f8595b, (m3.n) obj, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ w(int i11, int i12, Object obj, Object obj2, Object obj3, Object obj4, u70.f fVar, boolean z11) {
        this.f8594a = i12;
        this.f8596c = obj;
        this.f8597d = fVar;
        this.f8598e = obj2;
        this.f8595b = z11;
        this.f8599f = obj3;
        this.f8600g = obj4;
    }

    public /* synthetic */ w(MapBottomSheet mapBottomSheet, BasicItem basicItem, boolean z11, Function1 function1, Function1 function12, Function1 function13, int i11) {
        this.f8594a = 8;
        this.f8596c = mapBottomSheet;
        this.f8597d = basicItem;
        this.f8595b = z11;
        this.f8598e = function1;
        this.f8599f = function12;
        this.f8600g = function13;
    }

    public /* synthetic */ w(w6 w6Var, t5.a aVar, Function0 function0, AddNewVoucherResponse addNewVoucherResponse, String str, boolean z11, int i11) {
        this.f8594a = 10;
        this.f8596c = w6Var;
        this.f8597d = aVar;
        this.f8599f = function0;
        this.f8600g = addNewVoucherResponse;
        this.f8598e = str;
        this.f8595b = z11;
    }

    public /* synthetic */ w(Object obj, boolean z11, Object obj2, u70.f fVar, Object obj3, Function0 function0, int i11, int i12) {
        this.f8594a = i12;
        this.f8596c = obj;
        this.f8595b = z11;
        this.f8597d = obj2;
        this.f8598e = fVar;
        this.f8599f = obj3;
        this.f8600g = function0;
    }

    public /* synthetic */ w(String str, u70.f fVar, u70.f fVar2, Object obj, boolean z11, u70.f fVar3, int i11, int i12) {
        this.f8594a = i12;
        this.f8598e = str;
        this.f8596c = fVar;
        this.f8597d = fVar2;
        this.f8599f = obj;
        this.f8595b = z11;
        this.f8600g = fVar3;
    }

    public /* synthetic */ w(List list, MapBottomSheet mapBottomSheet, boolean z11, Function1 function1, Function1 function12, Function1 function13) {
        this.f8594a = 7;
        this.f8596c = list;
        this.f8597d = mapBottomSheet;
        this.f8595b = z11;
        this.f8598e = function1;
        this.f8599f = function12;
        this.f8600g = function13;
    }

    public /* synthetic */ w(Function2 function2, ChipGeometry chipGeometry, String str, Function2 function22, boolean z11, Function2 function23) {
        this.f8594a = 3;
        this.f8596c = function2;
        this.f8597d = chipGeometry;
        this.f8598e = str;
        this.f8599f = function22;
        this.f8595b = z11;
        this.f8600g = function23;
    }

    public /* synthetic */ w(np.b bVar, boolean z11, Function0 function0, Function0 function02, Function0 function03, String str, int i11) {
        this.f8594a = 6;
        this.f8596c = bVar;
        this.f8595b = z11;
        this.f8597d = function0;
        this.f8599f = function02;
        this.f8600g = function03;
        this.f8598e = str;
    }

    public /* synthetic */ w(xj.k kVar, Function1 function1, Function1 function12, Function2 function2, Function0 function0, boolean z11, int i11) {
        this.f8594a = 13;
        this.f8596c = kVar;
        this.f8597d = function1;
        this.f8598e = function12;
        this.f8599f = function2;
        this.f8600g = function0;
        this.f8595b = z11;
    }

    public /* synthetic */ w(boolean z11, ym.y yVar, HighlightedItemMnuV2 highlightedItemMnuV2, String str, String str2, String str3) {
        this.f8594a = 0;
        this.f8595b = z11;
        this.f8596c = yVar;
        this.f8597d = highlightedItemMnuV2;
        this.f8598e = str;
        this.f8599f = str2;
        this.f8600g = str3;
    }
}
