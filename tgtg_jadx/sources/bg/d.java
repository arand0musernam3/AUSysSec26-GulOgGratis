package bg;

import com.app.tgtg.model.remote.item.response.AllergensInfo;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.manufacturer.response.DeliveryOptionsLocal;
import com.app.tgtg.model.remote.mapService.response.MapFilters;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.profile.response.ProfileFeature;
import g3.w6;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import w2.o1;
import w2.s1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f6137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6140f;

    public /* synthetic */ d(DeliveryOptionsLocal deliveryOptionsLocal, String str, boolean z11, i80.n nVar, Function1 function1, int i11) {
        this.f6135a = 13;
        this.f6138d = deliveryOptionsLocal;
        this.f6136b = str;
        this.f6137c = z11;
        this.f6139e = nVar;
        this.f6140f = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        sk.b bVar;
        int iG;
        int iG2;
        int i11 = this.f6135a;
        int i12 = 1;
        Object obj3 = this.f6140f;
        Object obj4 = this.f6136b;
        Object obj5 = this.f6139e;
        Object obj6 = this.f6138d;
        switch (i11) {
            case 0:
                ((Integer) obj2).getClass();
                m.c((b4.t) obj6, (String) obj4, (Function0) obj5, (g) obj3, this.f6137c, (m3.n) obj, m3.i.F(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                o00.x0.c((List) obj6, (String) obj4, (w6) obj5, this.f6137c, (Function2) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                w.b.j((Order) obj6, (co.q) obj4, (co.c) obj5, this.f6137c, (Function1) obj3, (m3.n) obj, m3.i.F(24577));
                break;
            case 3:
                ((Integer) obj2).getClass();
                cp.a.m((String) obj4, (Boolean) obj6, this.f6137c, (Function0) obj5, (Function0) obj3, (m3.n) obj, m3.i.F(385));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ej.d.a((MapFilters) obj6, (List) obj4, (gj.c0) obj5, (jj.c) obj3, this.f6137c, (m3.n) obj, m3.i.F(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ji.i.g((List) obj6, (ArrayList) obj3, this.f6137c, (String) obj4, (Function0) obj5, (m3.n) obj, m3.i.F(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                lp.d.m((hp.g) obj4, (Function1) obj3, this.f6137c, (Function0) obj5, (b4.t) obj6, (m3.n) obj, m3.i.F(24577));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ni.g.c((g4.l) obj6, this.f6137c, (m3.b1) obj4, (m3.b1) obj5, (m3.b1) obj3, (m3.n) obj, m3.i.F(224263));
                break;
            case 8:
                ((Integer) obj2).getClass();
                pm.a.e((List) obj6, this.f6137c, (Function1) obj4, (Function1) obj5, (Function1) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                ps.a.a((List) obj6, this.f6137c, (Function0) obj5, (Function1) obj4, (Function0) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                rn.a.c((ProfileFeature) obj6, this.f6137c, (Function0) obj5, (Function1) obj4, (Function0) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 11:
                sk.b bVar2 = (sk.b) obj6;
                BasicItem basicItem = (BasicItem) obj5;
                String str = (String) obj4;
                String str2 = (String) obj3;
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zH = sVar.h(bVar2) | sVar.h(basicItem) | sVar.f(str) | sVar.f(str2);
                    boolean z11 = this.f6137c;
                    boolean zG = zH | sVar.g(z11);
                    Object objM = sVar.M();
                    m3.f fVar = m3.m.f29332a;
                    if (zG || objM == fVar) {
                        bVar = bVar2;
                        dp.w wVar = new dp.w(bVar, basicItem, str, str2, z11);
                        sVar.k0(wVar);
                        objM = wVar;
                    } else {
                        bVar = bVar2;
                    }
                    Function0 function0 = (Function0) objM;
                    boolean zH2 = sVar.h(bVar);
                    Object objM2 = sVar.M();
                    if (zH2 || objM2 == fVar) {
                        objM2 = new rv.a(bVar, 3);
                        sVar.k0(objM2);
                    }
                    Function0 function02 = (Function0) objM2;
                    AllergensInfo allergensInfo = basicItem.getInformation().getAllergensInfo();
                    boolean zH3 = sVar.h(bVar);
                    Object objM3 = sVar.M();
                    if (zH3 || objM3 == fVar) {
                        objM3 = new sg.c(bVar, i12);
                        sVar.k0(objM3);
                    }
                    xi.d.a(function0, function02, basicItem, allergensInfo, false, (Function1) objM3, sVar, 0, 16);
                } else {
                    sVar.U();
                }
                break;
            case 12:
                ((Integer) obj2).getClass();
                tp.b.d((List) obj6, (op.c) obj4, (List) obj5, this.f6137c, (Function1) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                wi.p.c((DeliveryOptionsLocal) obj6, (String) obj4, this.f6137c, (i80.n) obj5, (Function1) obj3, (m3.n) obj, m3.i.F(1));
                break;
            case 14:
                Ref.LongRef longRef = (Ref.LongRef) obj6;
                x2.w wVar2 = (x2.w) obj4;
                m2.t0 t0Var = (m2.t0) obj5;
                Ref.LongRef longRef2 = (Ref.LongRef) obj3;
                longRef.element = h4.b.f(longRef.element, ((h4.b) obj2).f21378a);
                o1 o1Var = wVar2.f43782b;
                s1 s1Var = wVar2.f43781a;
                m5.q0 q0VarG = o1Var.f43008b.g();
                if (q0VarG != null) {
                    m5.r rVar = q0VarG.f29618b;
                    wVar2.z(t0Var, h4.b.f(longRef2.element, longRef.element));
                    boolean z12 = this.f6137c;
                    if (z12) {
                        iG = rVar.g(wVar2.n());
                    } else {
                        long j9 = s1Var.d().f41929d;
                        int i13 = m5.t0.f29649c;
                        iG = (int) (j9 >> 32);
                    }
                    int i14 = iG;
                    if (z12) {
                        long j11 = s1Var.d().f41929d;
                        int i15 = m5.t0.f29649c;
                        iG2 = (int) (j11 & 4294967295L);
                    } else {
                        iG2 = rVar.g(wVar2.n());
                    }
                    int i16 = iG2;
                    long j12 = s1Var.d().f41929d;
                    long jA = wVar2.A(s1Var.d(), i14, i16, z12, a3.k0.f435h, false, false);
                    if (m5.t0.d(j12) || !m5.t0.d(jA)) {
                        s1Var.j(jA);
                    }
                }
                break;
            default:
                ((Integer) obj2).getClass();
                yj.a.f(this.f6137c, (vj.c) obj6, (Function0) obj5, (Function2) obj4, (Function0) obj3, (m3.n) obj, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ d(hp.g gVar, Function1 function1, boolean z11, Function0 function0, b4.t tVar, int i11) {
        this.f6135a = 6;
        this.f6136b = gVar;
        this.f6140f = function1;
        this.f6137c = z11;
        this.f6139e = function0;
        this.f6138d = tVar;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, boolean z11, int i11, int i12) {
        this.f6135a = i12;
        this.f6138d = obj;
        this.f6136b = obj2;
        this.f6139e = obj3;
        this.f6140f = obj4;
        this.f6137c = z11;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, boolean z11, u70.f fVar, int i11, int i12) {
        this.f6135a = i12;
        this.f6138d = obj;
        this.f6136b = obj2;
        this.f6139e = obj3;
        this.f6137c = z11;
        this.f6140f = fVar;
    }

    public /* synthetic */ d(Object obj, boolean z11, Object obj2, Object obj3, Object obj4, int i11, int i12) {
        this.f6135a = i12;
        this.f6138d = obj;
        this.f6137c = z11;
        this.f6136b = obj2;
        this.f6139e = obj3;
        this.f6140f = obj4;
    }

    public /* synthetic */ d(Object obj, boolean z11, Function0 function0, Function1 function1, Function0 function02, int i11, int i12) {
        this.f6135a = i12;
        this.f6138d = obj;
        this.f6137c = z11;
        this.f6139e = function0;
        this.f6136b = function1;
        this.f6140f = function02;
    }

    public /* synthetic */ d(String str, Boolean bool, boolean z11, Function0 function0, Function0 function02, int i11) {
        this.f6135a = 3;
        this.f6136b = str;
        this.f6138d = bool;
        this.f6137c = z11;
        this.f6139e = function0;
        this.f6140f = function02;
    }

    public /* synthetic */ d(List list, ArrayList arrayList, boolean z11, String str, Function0 function0, int i11) {
        this.f6135a = 5;
        this.f6138d = list;
        this.f6140f = arrayList;
        this.f6137c = z11;
        this.f6136b = str;
        this.f6139e = function0;
    }

    public /* synthetic */ d(Ref.LongRef longRef, Ref.LongRef longRef2, m2.t0 t0Var, x2.w wVar, boolean z11) {
        this.f6135a = 14;
        this.f6138d = longRef;
        this.f6136b = wVar;
        this.f6139e = t0Var;
        this.f6140f = longRef2;
        this.f6137c = z11;
    }

    public /* synthetic */ d(sk.b bVar, BasicItem basicItem, String str, String str2, boolean z11) {
        this.f6135a = 11;
        this.f6138d = bVar;
        this.f6139e = basicItem;
        this.f6136b = str;
        this.f6140f = str2;
        this.f6137c = z11;
    }

    public /* synthetic */ d(boolean z11, vj.c cVar, Function0 function0, Function2 function2, Function0 function02, int i11) {
        this.f6135a = 15;
        this.f6137c = z11;
        this.f6138d = cVar;
        this.f6139e = function0;
        this.f6136b = function2;
        this.f6140f = function02;
    }
}
