package ep;

import android.content.Context;
import com.app.tgtg.feature.orderview.charity.CharityOrderActivity;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.user.response.charity.LocalDivergenceDay;
import d2.m2;
import g9.f0;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import m3.b1;
import m3.c3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements i80.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f16239e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f16240f;

    public /* synthetic */ d(c3 c3Var, CharityOrderActivity charityOrderActivity, b1 b1Var, b1 b1Var2, f0 f0Var) {
        this.f16235a = 1;
        this.f16236b = c3Var;
        this.f16238d = charityOrderActivity;
        this.f16239e = b1Var;
        this.f16240f = b1Var2;
        this.f16237c = f0Var;
    }

    @Override // i80.o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11 = this.f16235a;
        m3.f fVar = m3.m.f29332a;
        int i12 = 10;
        Object obj5 = this.f16240f;
        Object obj6 = this.f16239e;
        Object obj7 = this.f16237c;
        Object obj8 = this.f16238d;
        Object obj9 = this.f16236b;
        int i13 = 0;
        switch (i11) {
            case 0:
                Context context = (Context) obj8;
                f0 f0Var = (f0) obj7;
                e.n nVar = (e.n) obj6;
                d0 d0Var = (d0) obj5;
                m3.n nVar2 = (m3.n) obj3;
                ((Integer) obj4).getClass();
                ((s1.l) obj).getClass();
                ((g9.l) obj2).getClass();
                boolean z11 = ((c3) obj9).getValue() == hp.a.RATE_LIMIT_REACHED;
                m3.s sVar = (m3.s) nVar2;
                boolean zH = sVar.h(context) | sVar.h(f0Var) | sVar.h(nVar);
                Object objM = sVar.M();
                if (zH || objM == fVar) {
                    objM = new a0.g(context, f0Var, nVar, i12);
                    sVar.k0(objM);
                }
                Function0 function0 = (Function0) objM;
                boolean zH2 = sVar.h(d0Var) | sVar.h(f0Var);
                Object objM2 = sVar.M();
                if (zH2 || objM2 == fVar) {
                    objM2 = new k(d0Var, f0Var, 2);
                    sVar.k0(objM2);
                }
                lp.d.f(null, z11, function0, (Function1) objM2, sVar, 0);
                break;
            case 1:
                CharityOrderActivity charityOrderActivity = (CharityOrderActivity) obj8;
                b1 b1Var = (b1) obj6;
                b1 b1Var2 = (b1) obj5;
                f0 f0Var2 = (f0) obj7;
                m3.n nVar3 = (m3.n) obj3;
                ((Integer) obj4).getClass();
                int i14 = CharityOrderActivity.f9162o;
                ((s1.l) obj).getClass();
                ((g9.l) obj2).getClass();
                d2.c.f(m2.e(m2.d(b4.q.f5711a, 1.0f), 40), nVar3);
                Order order = (Order) ((c3) obj9).getValue();
                if (order == null) {
                    m3.s sVar2 = (m3.s) nVar3;
                    sVar2.a0(152893737);
                    sVar2.q(false);
                } else {
                    m3.s sVar3 = (m3.s) nVar3;
                    sVar3.a0(152893738);
                    boolean zH3 = sVar3.h(f0Var2);
                    Object objM3 = sVar3.M();
                    if (zH3 || objM3 == fVar) {
                        objM3 = new go.e(f0Var2, i13);
                        sVar3.k0(objM3);
                    }
                    charityOrderActivity.K(order, b1Var, b1Var2, (Function1) objM3, nVar3, 432);
                    sVar3.q(false);
                }
                break;
            default:
                Set set = (Set) obj9;
                ArrayList arrayList = (ArrayList) obj8;
                Ref.ObjectRef objectRef = (Ref.ObjectRef) obj7;
                b1 b1Var3 = (b1) obj6;
                Function1 function1 = (Function1) obj5;
                int iIntValue = ((Integer) obj2).intValue();
                m3.n nVar4 = (m3.n) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((g2.l) obj).getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= ((m3.s) nVar4).d(iIntValue) ? 32 : 16;
                }
                m3.s sVar4 = (m3.s) nVar4;
                if (sVar4.R(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    LocalDate localDateAtDay = ((YearMonth) b1Var3.getValue()).atDay(iIntValue + 1);
                    localDateAtDay.getClass();
                    String strName = localDateAtDay.getDayOfWeek().name();
                    Set set2 = set;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj10 : set2) {
                        if (!((LocalDivergenceDay) obj10).isAvailable()) {
                            arrayList2.add(obj10);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(e0.o(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((LocalDivergenceDay) it.next()).getDate());
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj11 : set2) {
                        if (((LocalDivergenceDay) obj11).isAvailable()) {
                            arrayList4.add(obj11);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList(e0.o(arrayList4, 10));
                    Iterator it2 = arrayList4.iterator();
                    while (it2.hasNext()) {
                        arrayList5.add(((LocalDivergenceDay) it2.next()).getDate());
                    }
                    ti.w.a(localDateAtDay, !arrayList3.contains(localDateAtDay) && (arrayList5.contains(localDateAtDay) || arrayList.contains(strName)), ((List) objectRef.element).contains(localDateAtDay), LocalDate.now().isAfter(localDateAtDay), new lw.o(localDateAtDay, objectRef, function1, 21), sVar4, 0);
                } else {
                    sVar4.U();
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f16235a = i11;
        this.f16236b = obj;
        this.f16238d = obj2;
        this.f16237c = obj3;
        this.f16239e = obj4;
        this.f16240f = obj5;
    }
}
