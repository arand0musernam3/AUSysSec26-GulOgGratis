package jk;

import com.app.tgtg.model.remote.order.Order;
import cv.i;
import ek.h;
import ek.j;
import ek.l;
import ek.n;
import ek.p;
import ek.q;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import wr.g;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f25292b;

    public /* synthetic */ b(q qVar, int i11) {
        this.f25291a = i11;
        this.f25292b = qVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Order order;
        Order order2;
        Order order3;
        Order order4;
        Order order5;
        Order order6;
        Order order7;
        Order order8;
        Order order9;
        Order order10;
        switch (this.f25291a) {
            case 0:
                this.f25292b.d();
                break;
            case 1:
                this.f25292b.d();
                break;
            case 2:
                q qVar = this.f25292b;
                qVar.getClass();
                qVar.f(i.OTHER_HELPCENTER_ACTION_CLICKED);
                hk.d dVar = qVar.f16075k;
                hk.b bVar = dVar != null ? dVar.f22101i : null;
                switch (bVar == null ? -1 : p.$EnumSwitchMapping$1[bVar.ordinal()]) {
                    case -1:
                        break;
                    case 0:
                    default:
                        e40.a.f();
                        break;
                    case 1:
                        Order order11 = null;
                        wr.b bVar2 = wr.b.BAD_ORDER_EXPERIENCE;
                        wr.e eVar = wr.e.ALLERGIC_TO_ORDER;
                        hk.c cVarB = qVar.b();
                        String strM429getOrderIdreIZeYA = (cVarB == null || (order = cVarB.f22092d) == null) ? null : order.m429getOrderIdreIZeYA();
                        hk.c cVarB2 = qVar.b();
                        Order order12 = cVarB2 != null ? cVarB2.f22092d : null;
                        hk.c cVarB3 = qVar.b();
                        if (cVarB3 != null) {
                            order11 = cVarB3.f22092d;
                        }
                        qVar.c(new h(new g(null, bVar2, false, eVar, order12, order11 != null ? "order" : "helpDesk", strM429getOrderIdreIZeYA, 85)));
                        break;
                    case 2:
                        Order order13 = null;
                        wr.b bVar3 = wr.b.BAD_ORDER_EXPERIENCE;
                        wr.e eVar2 = wr.e.STORE_CLOSED;
                        hk.c cVarB4 = qVar.b();
                        String strM429getOrderIdreIZeYA2 = (cVarB4 == null || (order2 = cVarB4.f22092d) == null) ? null : order2.m429getOrderIdreIZeYA();
                        hk.c cVarB5 = qVar.b();
                        Order order14 = cVarB5 != null ? cVarB5.f22092d : null;
                        hk.c cVarB6 = qVar.b();
                        if (cVarB6 != null) {
                            order13 = cVarB6.f22092d;
                        }
                        qVar.c(new h(new g(null, bVar3, true, eVar2, order14, order13 != null ? "order" : "helpDesk", strM429getOrderIdreIZeYA2, 81)));
                        break;
                    case 3:
                        Order order15 = null;
                        wr.b bVar4 = wr.b.BAD_ORDER_EXPERIENCE;
                        hk.c cVarB7 = qVar.b();
                        String strM429getOrderIdreIZeYA3 = (cVarB7 == null || (order3 = cVarB7.f22092d) == null) ? null : order3.m429getOrderIdreIZeYA();
                        hk.c cVarB8 = qVar.b();
                        Order order16 = cVarB8 != null ? cVarB8.f22092d : null;
                        hk.c cVarB9 = qVar.b();
                        if (cVarB9 != null) {
                            order15 = cVarB9.f22092d;
                        }
                        qVar.c(new h(new g(null, bVar4, true, null, order16, order15 != null ? "order" : "helpDesk", strM429getOrderIdreIZeYA3, 89)));
                        break;
                    case 4:
                        Order order17 = null;
                        wr.b bVar5 = wr.b.DELIVERY_ISSUE;
                        hk.c cVarB10 = qVar.b();
                        String strM429getOrderIdreIZeYA4 = (cVarB10 == null || (order4 = cVarB10.f22092d) == null) ? null : order4.m429getOrderIdreIZeYA();
                        hk.c cVarB11 = qVar.b();
                        Order order18 = cVarB11 != null ? cVarB11.f22092d : null;
                        wr.e eVar3 = wr.e.NO_SELECTION;
                        hk.c cVarB12 = qVar.b();
                        if (cVarB12 != null) {
                            order17 = cVarB12.f22092d;
                        }
                        qVar.c(new h(new g(null, bVar5, false, eVar3, order18, order17 != null ? "order" : "helpDesk", strM429getOrderIdreIZeYA4, 85)));
                        break;
                    case 5:
                        Order order19 = null;
                        wr.b bVar6 = wr.b.CATERING_ISSUE;
                        hk.c cVarB13 = qVar.b();
                        String strM429getOrderIdreIZeYA5 = (cVarB13 == null || (order5 = cVarB13.f22092d) == null) ? null : order5.m429getOrderIdreIZeYA();
                        hk.c cVarB14 = qVar.b();
                        Order order20 = cVarB14 != null ? cVarB14.f22092d : null;
                        wr.e eVar4 = wr.e.CATERING_PROBLEM;
                        hk.c cVarB15 = qVar.b();
                        if (cVarB15 != null) {
                            order19 = cVarB15.f22092d;
                        }
                        qVar.c(new h(new g(null, bVar6, false, eVar4, order20, order19 != null ? "order" : "helpDesk", strM429getOrderIdreIZeYA5, 85)));
                        break;
                    case 6:
                        Order order21 = null;
                        wr.b bVar7 = wr.b.NEXT_DAY_DELIVERY_ISSUE;
                        hk.c cVarB16 = qVar.b();
                        String strM429getOrderIdreIZeYA6 = (cVarB16 == null || (order6 = cVarB16.f22092d) == null) ? null : order6.m429getOrderIdreIZeYA();
                        hk.c cVarB17 = qVar.b();
                        Order order22 = cVarB17 != null ? cVarB17.f22092d : null;
                        wr.e eVar5 = wr.e.NEXT_DAY_DELIVERY_PROBLEM;
                        hk.c cVarB18 = qVar.b();
                        if (cVarB18 != null) {
                            order21 = cVarB18.f22092d;
                        }
                        qVar.c(new h(new g(null, bVar7, false, eVar5, order22, order21 != null ? "order" : "helpDesk", strM429getOrderIdreIZeYA6, 85)));
                        break;
                    case 7:
                        qVar.c(l.f16061d);
                        break;
                    case 8:
                        qVar.c(l.f16058a);
                        break;
                    case 9:
                        wr.b bVar8 = wr.b.BAD_ORDER_EXPERIENCE;
                        wr.e eVar6 = wr.e.MISSED_COLLECTION_WINDOW;
                        hk.c cVarB19 = qVar.b();
                        String strM429getOrderIdreIZeYA7 = (cVarB19 == null || (order7 = cVarB19.f22092d) == null) ? null : order7.m429getOrderIdreIZeYA();
                        hk.c cVarB20 = qVar.b();
                        Order order23 = cVarB20 != null ? cVarB20.f22092d : null;
                        hk.c cVarB21 = qVar.b();
                        qVar.c(new h(new g(null, bVar8, false, eVar6, order23, (cVarB21 != null ? cVarB21.f22092d : null) != null ? "order" : "helpDesk", strM429getOrderIdreIZeYA7, 85)));
                        break;
                    case 10:
                        wr.b bVar9 = wr.b.BAD_ORDER_EXPERIENCE;
                        wr.e eVar7 = wr.e.STORE_CLOSED;
                        hk.c cVarB22 = qVar.b();
                        String strM429getOrderIdreIZeYA8 = (cVarB22 == null || (order8 = cVarB22.f22092d) == null) ? null : order8.m429getOrderIdreIZeYA();
                        hk.c cVarB23 = qVar.b();
                        Order order24 = cVarB23 != null ? cVarB23.f22092d : null;
                        hk.c cVarB24 = qVar.b();
                        qVar.c(new h(new g(null, bVar9, false, eVar7, order24, (cVarB24 != null ? cVarB24.f22092d : null) != null ? "order" : "helpDesk", strM429getOrderIdreIZeYA8, 85)));
                        break;
                    case 11:
                        wr.b bVar10 = wr.b.BAD_ORDER_EXPERIENCE;
                        wr.e eVar8 = wr.e.NO_FOOD;
                        hk.c cVarB25 = qVar.b();
                        String strM429getOrderIdreIZeYA9 = (cVarB25 == null || (order9 = cVarB25.f22092d) == null) ? null : order9.m429getOrderIdreIZeYA();
                        hk.c cVarB26 = qVar.b();
                        Order order25 = cVarB26 != null ? cVarB26.f22092d : null;
                        hk.c cVarB27 = qVar.b();
                        qVar.c(new h(new g(null, bVar10, false, eVar8, order25, (cVarB27 != null ? cVarB27.f22092d : null) != null ? "order" : "helpDesk", strM429getOrderIdreIZeYA9, 85)));
                        break;
                    case 12:
                        String strM429getOrderIdreIZeYA10 = null;
                        wr.b bVar11 = wr.b.STORE_SUGGESTION;
                        hk.c cVarB28 = qVar.b();
                        if (cVarB28 != null && (order10 = cVarB28.f22092d) != null) {
                            strM429getOrderIdreIZeYA10 = order10.m429getOrderIdreIZeYA();
                        }
                        qVar.c(new h(new g(null, bVar11, false, null, null, null, strM429getOrderIdreIZeYA10, 253)));
                        break;
                    case 13:
                        qVar.c(l.f16059b);
                        break;
                    case 14:
                        ct.a aVar = ct.a.CAREER;
                        String careersUrl = qVar.f16066b.n().getCareersUrl();
                        careersUrl.getClass();
                        qVar.c(new n(aVar, careersUrl));
                        break;
                }
                break;
            default:
                q qVar2 = this.f25292b;
                String instagramUrl = qVar2.f16066b.n().getInstagramUrl();
                if (instagramUrl != null) {
                    qVar2.c(new j(instagramUrl));
                }
                break;
        }
        return Unit.f26487a;
    }
}
