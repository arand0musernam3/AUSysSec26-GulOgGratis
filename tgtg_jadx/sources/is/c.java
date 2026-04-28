package is;

import ao.p2;
import com.app.tgtg.model.remote.DailyReminder;
import com.app.tgtg.model.remote.item.response.BasicItem;
import f2.l;
import i80.n;
import ii.s;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.b1;
import m3.c3;
import w2.g0;
import xj.k;
import yj.m;
import yj.p;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24156a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f24157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f24158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f24159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b1 f24160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f24161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f24162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f24163h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f24164i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f24165j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f24166k;
    public final /* synthetic */ Object l;

    public /* synthetic */ c(b1 b1Var, Function2 function2, Function1 function1, String str, String str2, String str3, String str4, String str5, String str6, String str7, b1 b1Var2) {
        this.f24158c = b1Var;
        this.f24159d = function2;
        this.f24157b = function1;
        this.f24161f = str;
        this.f24162g = str2;
        this.f24163h = str3;
        this.f24164i = str4;
        this.f24165j = str5;
        this.f24166k = str6;
        this.l = str7;
        this.f24160e = b1Var2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Function1 function1;
        c3 c3Var;
        b1 b1Var;
        k kVar;
        Function1 function12;
        Function2 function2;
        Function1 function13;
        k kVar2;
        int i11;
        String str;
        switch (this.f24156a) {
            case 0:
                String str2 = (String) this.f24161f;
                String str3 = (String) this.f24162g;
                String str4 = (String) this.f24163h;
                String str5 = (String) this.f24164i;
                String str6 = (String) this.f24165j;
                String str7 = (String) this.f24166k;
                String str8 = (String) this.l;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                DailyReminder dailyReminder = (DailyReminder) this.f24158c.getValue();
                if (dailyReminder != null) {
                    this.f24159d.invoke(dailyReminder, bool);
                    this.f24160e.setValue(a.a.g(str2, str3, str4, str5, str6, str7, str8, dailyReminder));
                    this.f24157b.invoke(dailyReminder);
                }
                break;
            default:
                k kVar3 = (k) this.f24161f;
                c3 c3Var2 = (c3) this.f24162g;
                Function0 function0 = (Function0) this.f24163h;
                final c3 c3Var3 = (c3) this.f24164i;
                c3 c3Var4 = (c3) this.f24165j;
                Function1 function14 = (Function1) this.f24166k;
                c3 c3Var5 = (c3) this.l;
                l lVar = (l) obj;
                lVar.getClass();
                if (((Boolean) c3Var2.getValue()).booleanValue()) {
                    l.q(lVar, null, new u3.d(new s(function0, c3Var3, 3), true, -789555876), 3);
                }
                List list = (List) c3Var4.getValue();
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (((BasicItem) obj2).getItemsAvailable() > 0) {
                            arrayList.add(obj2);
                        }
                    }
                } else {
                    arrayList = null;
                }
                List list2 = (List) c3Var4.getValue();
                if (list2 != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : list2) {
                        if (((BasicItem) obj3).getItemsAvailable() == 0) {
                            arrayList3.add(obj3);
                        }
                    }
                    arrayList2 = arrayList3;
                } else {
                    arrayList2 = null;
                }
                Function1 function15 = this.f24157b;
                b1 b1Var2 = this.f24158c;
                if (arrayList != null) {
                    m mVar = new m(0);
                    int size = arrayList.size();
                    p2 p2Var = new p2(28, mVar, arrayList);
                    ks.c cVar = new ks.c(2, arrayList);
                    function1 = function15;
                    kVar = kVar3;
                    p pVar = new p(arrayList, kVar, function1, function14, c3Var5, b1Var2, 0);
                    c3Var = c3Var5;
                    b1Var = b1Var2;
                    function12 = function14;
                    lVar.r(size, p2Var, cVar, new u3.d(pVar, true, 802480018));
                } else {
                    function1 = function15;
                    c3Var = c3Var5;
                    b1Var = b1Var2;
                    kVar = kVar3;
                    function12 = function14;
                }
                int iL = ft.c.l();
                final k kVar4 = kVar;
                final Function1 function16 = function1;
                final Function2 function22 = this.f24159d;
                if (iL >= 10) {
                    function2 = function22;
                    function13 = function16;
                    kVar2 = kVar4;
                } else {
                    final int i12 = 0;
                    n nVar = new n() { // from class: yj.h
                        @Override // i80.n
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            int i13 = i12;
                            f2.d dVar = (f2.d) obj4;
                            m3.n nVar2 = (m3.n) obj5;
                            int iIntValue = ((Integer) obj6).intValue();
                            switch (i13) {
                                case 0:
                                    dVar.getClass();
                                    m3.s sVar = (m3.s) nVar2;
                                    if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        q.b(kVar4, (List) c3Var3.getValue(), function16, function22, sVar, 0);
                                    } else {
                                        sVar.U();
                                    }
                                    break;
                                default:
                                    dVar.getClass();
                                    m3.s sVar2 = (m3.s) nVar2;
                                    if (sVar2.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        q.b(kVar4, (List) c3Var3.getValue(), function16, function22, sVar2, 0);
                                    } else {
                                        sVar2.U();
                                    }
                                    break;
                            }
                            return Unit.f26487a;
                        }
                    };
                    function2 = function22;
                    function13 = function16;
                    kVar2 = kVar4;
                    l.q(lVar, null, new u3.d(nVar, true, -1443441275), 3);
                }
                if (arrayList2 != null) {
                    if (!arrayList2.isEmpty()) {
                        l.q(lVar, null, new u3.d(new oo.s(17, kVar2, this.f24160e), true, -1497867954), 3);
                    }
                    lVar.r(arrayList2.size(), new z3.a(1, arrayList2, new g0(29)), new ks.c(3, arrayList2), new u3.d(new p(arrayList2, kVar2, function13, function12, c3Var, b1Var, 1), true, 802480018));
                }
                if (ft.c.l() >= 10) {
                    final int i13 = 1;
                    final k kVar5 = kVar2;
                    final Function1 function17 = function13;
                    final Function2 function23 = function2;
                    i11 = 3;
                    str = null;
                    l.q(lVar, null, new u3.d(new n() { // from class: yj.h
                        @Override // i80.n
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            int i132 = i13;
                            f2.d dVar = (f2.d) obj4;
                            m3.n nVar2 = (m3.n) obj5;
                            int iIntValue = ((Integer) obj6).intValue();
                            switch (i132) {
                                case 0:
                                    dVar.getClass();
                                    m3.s sVar = (m3.s) nVar2;
                                    if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        q.b(kVar5, (List) c3Var3.getValue(), function17, function23, sVar, 0);
                                    } else {
                                        sVar.U();
                                    }
                                    break;
                                default:
                                    dVar.getClass();
                                    m3.s sVar2 = (m3.s) nVar2;
                                    if (sVar2.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        q.b(kVar5, (List) c3Var3.getValue(), function17, function23, sVar2, 0);
                                    } else {
                                        sVar2.U();
                                    }
                                    break;
                            }
                            return Unit.f26487a;
                        }
                    }, true, -711265820), 3);
                } else {
                    i11 = 3;
                    str = null;
                }
                l.q(lVar, str, yj.a.f46047g, i11);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ c(k kVar, c3 c3Var, Function0 function0, c3 c3Var2, c3 c3Var3, Function1 function1, Function1 function12, c3 c3Var4, b1 b1Var, Function2 function2, b1 b1Var2) {
        this.f24161f = kVar;
        this.f24162g = c3Var;
        this.f24163h = function0;
        this.f24164i = c3Var2;
        this.f24165j = c3Var3;
        this.f24157b = function1;
        this.f24166k = function12;
        this.l = c3Var4;
        this.f24158c = b1Var;
        this.f24159d = function2;
        this.f24160e = b1Var2;
    }
}
