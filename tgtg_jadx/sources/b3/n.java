package b3;

import com.app.tgtg.model.remote.item.response.SortingChoice;
import com.app.tgtg.model.remote.manufacturer.response.AddressSearchElement;
import com.app.tgtg.model.remote.order.Order;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import g3.k8;
import g3.na;
import g3.r9;
import g3.t2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l3.n0;
import m3.e0;
import org.bouncycastle.iana.AEADAlgorithm;
import z4.c0;
import z4.u0;
import zendesk.messaging.android.internal.conversationscreen.delegates.ImageMessageContainerAdapterDelegate;
import zendesk.messaging.android.internal.conversationscreen.delegates.TextMessageContainerAdapterDelegate;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f5621b;

    public /* synthetic */ n(int i11, int i12, Function2 function2) {
        this.f5620a = i12;
        this.f5621b = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        y3.e eVar;
        int i11 = this.f5620a;
        b4.q qVar = b4.q.f5711a;
        Function2 function2 = this.f5621b;
        switch (i11) {
            case 0:
                ((Integer) obj2).getClass();
                s.c(function2, (m3.n) obj, m3.i.F(1));
                return Unit.f26487a;
            case 1:
                Integer num = (Integer) obj;
                num.intValue();
                Object obj3 = (String) obj2;
                obj3.getClass();
                function2.invoke(num, obj3);
                return Unit.f26487a;
            case 2:
                Object obj4 = (String) obj;
                Object obj5 = (String) obj2;
                obj4.getClass();
                obj5.getClass();
                function2.invoke(obj4, obj5);
                return Unit.f26487a;
            case 3:
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                function2.invoke((SortingChoice) obj, bool);
                return Unit.f26487a;
            case 4:
                Boolean bool2 = (Boolean) obj2;
                bool2.booleanValue();
                function2.invoke((SortingChoice) obj, bool2);
                return Unit.f26487a;
            case 5:
                Boolean bool3 = (Boolean) obj2;
                bool3.booleanValue();
                function2.invoke((SortingChoice) obj, bool3);
                return Unit.f26487a;
            case 6:
                Boolean bool4 = (Boolean) obj2;
                bool4.booleanValue();
                function2.invoke((SortingChoice) obj, bool4);
                return Unit.f26487a;
            case 7:
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    u0 u0VarD = d2.p.d(b4.d.f5683a, false);
                    int iHashCode = Long.hashCode(sVar.T);
                    u3.i iVarL = sVar.l();
                    b4.t tVarC = b4.a.c(qVar, sVar);
                    b5.j.R.getClass();
                    b5.h hVar = b5.i.f5839b;
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(hVar);
                    } else {
                        sVar.n0();
                    }
                    m3.i.C(u0VarD, b5.i.f5843f, sVar);
                    m3.i.C(iVarL, b5.i.f5842e, sVar);
                    b5.g gVar = b5.i.f5844g;
                    if (sVar.S || !Intrinsics.areEqual(sVar.M(), Integer.valueOf(iHashCode))) {
                        e0.f.y(iHashCode, sVar, iHashCode, gVar);
                    }
                    m3.i.C(tVarC, b5.i.f5841d, sVar);
                    w.a0.w(0, function2, sVar, true);
                } else {
                    sVar.U();
                }
                return Unit.f26487a;
            case 8:
                m3.n nVar2 = (m3.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                m3.s sVar2 = (m3.s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    u0 u0VarD2 = d2.p.d(b4.d.f5683a, false);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    u3.i iVarL2 = sVar2.l();
                    b4.t tVarC2 = b4.a.c(qVar, sVar2);
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
                    b5.g gVar2 = b5.i.f5844g;
                    if (sVar2.S || !Intrinsics.areEqual(sVar2.M(), Integer.valueOf(iHashCode2))) {
                        e0.f.y(iHashCode2, sVar2, iHashCode2, gVar2);
                    }
                    m3.i.C(tVarC2, b5.i.f5841d, sVar2);
                    w.a0.w(0, function2, sVar2, true);
                } else {
                    sVar2.U();
                }
                return Unit.f26487a;
            case 9:
                m3.n nVar3 = (m3.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                m3.s sVar3 = (m3.s) nVar3;
                if (sVar3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    u0 u0VarD3 = d2.p.d(b4.d.f5683a, false);
                    int iHashCode3 = Long.hashCode(sVar3.T);
                    u3.i iVarL3 = sVar3.l();
                    b4.t tVarC3 = b4.a.c(qVar, sVar3);
                    b5.j.R.getClass();
                    b5.h hVar3 = b5.i.f5839b;
                    sVar3.e0();
                    if (sVar3.S) {
                        sVar3.k(hVar3);
                    } else {
                        sVar3.n0();
                    }
                    m3.i.C(u0VarD3, b5.i.f5843f, sVar3);
                    m3.i.C(iVarL3, b5.i.f5842e, sVar3);
                    b5.g gVar3 = b5.i.f5844g;
                    if (sVar3.S || !Intrinsics.areEqual(sVar3.M(), Integer.valueOf(iHashCode3))) {
                        e0.f.y(iHashCode3, sVar3, iHashCode3, gVar3);
                    }
                    m3.i.C(tVarC3, b5.i.f5841d, sVar3);
                    w.a0.w(0, function2, sVar3, true);
                } else {
                    sVar3.U();
                }
                return Unit.f26487a;
            case 10:
                m3.n nVar4 = (m3.n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                m3.s sVar4 = (m3.s) nVar4;
                if (sVar4.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    u0 u0VarD4 = d2.p.d(b4.d.f5683a, false);
                    int iHashCode4 = Long.hashCode(sVar4.T);
                    u3.i iVarL4 = sVar4.l();
                    b4.t tVarC4 = b4.a.c(qVar, sVar4);
                    b5.j.R.getClass();
                    b5.h hVar4 = b5.i.f5839b;
                    sVar4.e0();
                    if (sVar4.S) {
                        sVar4.k(hVar4);
                    } else {
                        sVar4.n0();
                    }
                    m3.i.C(u0VarD4, b5.i.f5843f, sVar4);
                    m3.i.C(iVarL4, b5.i.f5842e, sVar4);
                    b5.g gVar4 = b5.i.f5844g;
                    if (sVar4.S || !Intrinsics.areEqual(sVar4.M(), Integer.valueOf(iHashCode4))) {
                        e0.f.y(iHashCode4, sVar4, iHashCode4, gVar4);
                    }
                    m3.i.C(tVarC4, b5.i.f5841d, sVar4);
                    w.a0.w(0, function2, sVar4, true);
                } else {
                    sVar4.U();
                }
                return Unit.f26487a;
            case 11:
                m3.n nVar5 = (m3.n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                m3.s sVar5 = (m3.s) nVar5;
                if (sVar5.R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    r9.a(m5.u0.a(na.a(n0.f27063g, sVar5), 0L, 0L, null, null, 0L, null, 3, 0L, null, null, 16744447), function2, sVar5, 0);
                } else {
                    sVar5.U();
                }
                return Unit.f26487a;
            case 12:
                ((Integer) obj2).getClass();
                k8.c(function2, (m3.n) obj, m3.i.F(1));
                return Unit.f26487a;
            case 13:
                return ImageMessageContainerAdapterDelegate.ViewHolder.createImageCell$lambda$11$lambda$10$lambda$9(function2, (String) obj, (String) obj2);
            case 14:
                return TextMessageContainerAdapterDelegate.ViewHolder.createTextCell$lambda$18$lambda$17$lambda$16(function2, (String) obj, (String) obj2);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                m3.n nVar6 = (m3.n) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                m3.s sVar6 = (m3.s) nVar6;
                if (sVar6.R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    b4.t tVarM = c0.m(qVar, "Container");
                    u0 u0VarD5 = d2.p.d(b4.d.f5683a, true);
                    int iHashCode5 = Long.hashCode(sVar6.T);
                    u3.i iVarL5 = sVar6.l();
                    b4.t tVarC5 = b4.a.c(tVarM, sVar6);
                    b5.j.R.getClass();
                    b5.h hVar5 = b5.i.f5839b;
                    sVar6.e0();
                    if (sVar6.S) {
                        sVar6.k(hVar5);
                    } else {
                        sVar6.n0();
                    }
                    m3.i.C(u0VarD5, b5.i.f5843f, sVar6);
                    m3.i.C(iVarL5, b5.i.f5842e, sVar6);
                    b5.g gVar5 = b5.i.f5844g;
                    if (sVar6.S || !Intrinsics.areEqual(sVar6.M(), Integer.valueOf(iHashCode5))) {
                        e0.f.y(iHashCode5, sVar6, iHashCode5, gVar5);
                    }
                    m3.i.C(tVarC5, b5.i.f5841d, sVar6);
                    w.a0.w(0, function2, sVar6, true);
                } else {
                    sVar6.U();
                }
                return Unit.f26487a;
            case 16:
                Object obj6 = (String) obj;
                Object obj7 = (AddressSearchElement) obj2;
                obj6.getClass();
                obj7.getClass();
                function2.invoke(obj6, obj7);
                return Unit.f26487a;
            case 17:
                Object obj8 = (String) obj;
                obj8.getClass();
                function2.invoke(obj8, (String) obj2);
                return Unit.f26487a;
            case 18:
                Object obj9 = (Order) obj;
                Boolean bool5 = (Boolean) obj2;
                bool5.booleanValue();
                obj9.getClass();
                function2.invoke(obj9, bool5);
                return Unit.f26487a;
            case 19:
                y3.a aVar = (y3.a) obj;
                List list = (List) function2.invoke(aVar, obj2);
                int size = list.size();
                for (int i12 = 0; i12 < size; i12++) {
                    Object obj10 = list.get(i12);
                    if (obj10 != null && (eVar = aVar.f45392b) != null && !eVar.a(obj10)) {
                        throw new IllegalArgumentException(("item at index " + i12 + " can't be saved: " + obj10).toString());
                    }
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new ArrayList(list);
            default:
                m3.n nVar7 = (m3.n) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                e0 e0Var = PantryThemeKt.f13343a;
                m3.s sVar7 = (m3.s) nVar7;
                if (sVar7.R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    t2.b(null, null, null, this.f5621b, sVar7, 0, 7);
                } else {
                    sVar7.U();
                }
                return Unit.f26487a;
        }
    }

    public /* synthetic */ n(int i11, Function2 function2) {
        this.f5620a = i11;
        this.f5621b = function2;
    }
}
