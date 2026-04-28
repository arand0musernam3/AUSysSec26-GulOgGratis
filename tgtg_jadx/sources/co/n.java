package co;

import a3.l3;
import android.content.Context;
import android.graphics.Typeface;
import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.item.PickupInterval;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.payment.PaymentMethods;
import com.app.tgtg.model.remote.payment.PriceSpecification;
import com.app.tgtg.model.remote.specialrewards.SpecialReward;
import com.google.android.gms.internal.measurement.cg;
import f2.c0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import m2.h0;
import m2.l1;
import m2.r0;
import m3.b1;
import m3.i1;
import mv.p0;
import v80.b0;
import v80.d0;
import v80.f0;
import zendesk.messaging.android.internal.conversationscreen.TimeConstants;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f8775j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f8776k;
    public final /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f8777m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f8778n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(List list, Function1 function1, b0 b0Var, Function1 function12, x70.c cVar) {
        super(2, cVar);
        this.f8775j = 0;
        this.f8776k = list;
        this.l = function1;
        this.f8778n = b0Var;
        this.f8777m = function12;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f8775j) {
            case 0:
                return new n((List) this.f8776k, (Function1) this.l, (b0) this.f8778n, (Function1) this.f8777m, cVar);
            case 1:
                n nVar = new n((i1) this.l, (b1) this.f8777m, (b1) this.f8778n, cVar, 1);
                nVar.f8776k = obj;
                return nVar;
            case 2:
                return new n((List) this.f8776k, (c0) this.l, (dn.k) this.f8777m, (z3.u) this.f8778n, cVar, 2);
            case 3:
                return new n((v2.h) this.f8776k, (Function2) this.l, (b1) this.f8777m, (i1) this.f8778n, cVar, 3);
            case 4:
                return new n((he.k) this.f8776k, (Context) this.l, (String) this.f8777m, (String) this.f8778n, cVar, 4);
            case 5:
                n nVar2 = new n((w4.y) this.l, (l1) this.f8777m, (l3) this.f8778n, cVar, 5);
                nVar2.f8776k = obj;
                return nVar2;
            case 6:
                return new n((b0) this.f8778n, (ns.g) this.f8776k, (SpecialReward) this.l, (b1) this.f8777m, cVar);
            case 7:
                return new n((LatLngInfo) this.f8776k, (rt.f) this.l, (String) this.f8777m, (Context) this.f8778n, cVar, 7);
            case 8:
                return new n((uf.k) this.f8776k, (String) this.l, (ArrayList) this.f8777m, (ArrayList) this.f8778n, cVar, 8);
            case 9:
                return new n((rt.f) this.f8776k, (Context) this.l, (tg.i) this.f8777m, (b1) this.f8778n, cVar, 9);
            default:
                return new n((cj.q) this.f8776k, (PaymentMethods) this.l, (b1) this.f8777m, (b1) this.f8778n, cVar, 10);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f8775j) {
        }
        return ((n) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f8775j;
        x70.c cVar = null;
        int i12 = 0;
        Object obj2 = this.l;
        Object obj3 = this.f8778n;
        Object obj4 = this.f8777m;
        switch (i11) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                Function1 function1 = (Function1) obj2;
                b0 b0Var = (b0) obj3;
                Function1 function12 = (Function1) obj4;
                for (Order order : (List) this.f8776k) {
                    PickupInterval pickupInterval = order.getPickupInterval();
                    String intervalStart = pickupInterval != null ? pickupInterval.getIntervalStart() : null;
                    intervalStart.getClass();
                    long jH = p0.h(intervalStart);
                    PickupInterval pickupInterval2 = order.getPickupInterval();
                    String intervalEnd = pickupInterval2 != null ? pickupInterval2.getIntervalEnd() : null;
                    intervalEnd.getClass();
                    long jH2 = p0.h(intervalEnd);
                    long jO = p0.o();
                    long j9 = jH - jO;
                    long j11 = jH2 - jO;
                    boolean z11 = 1 <= j9 && j9 <= TimeConstants.FIFTEEN_MINUTES_DIFFERENCE;
                    boolean z12 = jO >= jH && jO <= jH + TimeConstants.ONE_MINUTE_DIFFERENCE;
                    boolean z13 = 1 <= j11 && j11 <= TimeConstants.FIFTEEN_MINUTES_DIFFERENCE;
                    if (z11 || z12 || z13) {
                        function1.invoke(q.MAXIMISED);
                        function12.invoke(f0.B(b0Var, null, null, new o(new defpackage.c(function1, 1), cVar, i12), 3));
                    }
                }
                break;
            case 1:
                b0 b0Var2 = (b0) this.f8776k;
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                mv.d.v(b0Var2, ((i1) obj2).h(), new bm.j((b1) obj4, 10), new y((b1) obj3, null, 2), 2);
                break;
            case 2:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                if (cg.q((List) this.f8776k)) {
                    List list = ((c0) obj2).j().f17192k;
                    ArrayList arrayList = new ArrayList(e0.o(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new Integer(((f2.t) ((f2.m) it.next())).f17199a));
                    }
                    gn.a.j((dn.k) obj4, (z3.u) obj3, arrayList);
                }
                break;
            case 3:
                b1 b1Var = (b1) obj4;
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                if (((v2.h) this.f8776k).b().f41928c.length() >= 5) {
                    b1Var.setValue(Boolean.TRUE);
                    i1 i1Var = (i1) obj3;
                    i1Var.i(i1Var.h() + 1);
                } else {
                    ((Function2) obj2).invoke("", "");
                    b1Var.setValue(Boolean.FALSE);
                }
                break;
            case 4:
                y70.a aVar5 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                for (oe.d dVar : ((he.k) this.f8776k).f21931f.values()) {
                    Context context = (Context) obj2;
                    dVar.getClass();
                    String str = dVar.f32464a;
                    String str2 = dVar.f32466c;
                    try {
                        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), r8.k.m((String) obj4, str, (String) obj3));
                        try {
                            typefaceCreateFromAsset.getClass();
                            str2.getClass();
                            boolean z14 = StringsKt.z(str2, "Italic", false);
                            boolean z15 = StringsKt.z(str2, "Bold", false);
                            int i13 = (z14 && z15) ? 3 : z14 ? 2 : z15 ? 1 : 0;
                            if (typefaceCreateFromAsset.getStyle() != i13) {
                                typefaceCreateFromAsset = Typeface.create(typefaceCreateFromAsset, i13);
                            }
                            dVar.f32467d = typefaceCreateFromAsset;
                        } catch (Exception unused) {
                            ve.c.f42247a.getClass();
                            he.a aVar6 = he.e.f21898a;
                        }
                    } catch (Exception unused2) {
                        ve.c.f42247a.getClass();
                        he.a aVar7 = he.e.f21898a;
                    }
                }
                break;
            case 5:
                y70.a aVar8 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                b0 b0Var3 = (b0) this.f8776k;
                d0 d0Var = d0.UNDISPATCHED;
                w4.y yVar = (w4.y) obj2;
                f0.B(b0Var3, null, d0Var, new r0(yVar, (l1) obj4, cVar, i12), 1);
                f0.B(b0Var3, null, d0Var, new gf.g(yVar, (l3) obj3, cVar, 28), 1);
                break;
            case 6:
                y70.a aVar9 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                f0.B((b0) obj3, null, null, new nk.j((ns.g) this.f8776k, (SpecialReward) obj2, (b1) obj4, null, 6), 3);
                break;
            case 7:
                y70.a aVar10 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                LatLngInfo latLngInfo = (LatLngInfo) this.f8776k;
                if (latLngInfo != null) {
                    ((rt.f) obj2).a(new h0(latLngInfo, (String) obj4, (Context) obj3, 12));
                }
                break;
            case 8:
                String str3 = (String) obj2;
                y70.a aVar11 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                uf.k kVar = (uf.k) this.f8776k;
                kf.b bVar = kVar.f41121e;
                if (bVar != null) {
                    bVar.b("--> remove file: " + CollectionsKt.n0(2, StringsKt__StringsKt.split$default(str3, new String[]{"-"}, false, 0, 6, null)) + ", dropped events: " + ((ArrayList) obj4).size() + ", retry events: " + ((ArrayList) obj3).size());
                }
                kVar.f41117a.e(str3);
                break;
            case 9:
                y70.a aVar12 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                ((rt.f) this.f8776k).a(new h0((Context) obj2, (tg.i) obj4, (b1) obj3, 15));
                break;
            default:
                y70.a aVar13 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                if (((PriceSpecification) ((b1) obj4).getValue()) != null) {
                    ((b1) obj3).setValue(Boolean.valueOf(((cj.q) this.f8776k).n((PaymentMethods) obj2)));
                }
                break;
        }
        return Unit.f26487a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj, Object obj2, Object obj3, x70.c cVar, int i11) {
        super(2, cVar);
        this.f8775j = i11;
        this.l = obj;
        this.f8777m = obj2;
        this.f8778n = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj, Object obj2, Object obj3, Object obj4, x70.c cVar, int i11) {
        super(2, cVar);
        this.f8775j = i11;
        this.f8776k = obj;
        this.l = obj2;
        this.f8777m = obj3;
        this.f8778n = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(b0 b0Var, ns.g gVar, SpecialReward specialReward, b1 b1Var, x70.c cVar) {
        super(2, cVar);
        this.f8775j = 6;
        this.f8778n = b0Var;
        this.f8776k = gVar;
        this.l = specialReward;
        this.f8777m = b1Var;
    }
}
