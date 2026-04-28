package ah;

import a60.r;
import aa.l0;
import android.util.Log;
import androidx.lifecycle.m1;
import bx.o;
import com.app.tgtg.model.remote.payment.VoucherPaymentInformation;
import com.app.tgtg.model.remote.voucher.DiscountVoucher;
import h2.b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.e0;
import v80.f0;
import v80.i1;
import w.j0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends z70.i implements i80.n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1466j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f1467k;
    public /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, x70.c cVar, int i11) {
        super(3, cVar);
        this.f1466j = i11;
        this.l = obj;
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f1466j) {
            case 0:
                j jVar = new j((k) this.l, (x70.c) obj3, 0);
                jVar.f1467k = (Throwable) obj2;
                return jVar.invokeSuspend(Unit.f26487a);
            case 1:
                j jVar2 = new j(3, (x70.c) obj3, 1);
                jVar2.f1467k = (VoucherPaymentInformation) obj;
                jVar2.l = (List) obj2;
                return jVar2.invokeSuspend(Unit.f26487a);
            case 2:
                j jVar3 = new j((dt.c) this.l, (x70.c) obj3, 2);
                jVar3.f1467k = (Throwable) obj2;
                return jVar3.invokeSuspend(Unit.f26487a);
            case 3:
                j jVar4 = new j(3, (x70.c) obj3, 3);
                jVar4.f1467k = (f8.d) obj;
                jVar4.l = (h8.g) obj2;
                return jVar4.invokeSuspend(Unit.f26487a);
            case 4:
                j jVar5 = new j(3, (x70.c) obj3, 4);
                jVar5.f1467k = (l1.b) obj;
                jVar5.l = (m0.j) obj2;
                return jVar5.invokeSuspend(Unit.f26487a);
            case 5:
                j jVar6 = new j((oh.c) this.l, (x70.c) obj3, 5);
                jVar6.f1467k = (Throwable) obj2;
                return jVar6.invokeSuspend(Unit.f26487a);
            case 6:
                j jVar7 = new j((oj.a) this.l, (x70.c) obj3, 6);
                jVar7.f1467k = (Throwable) obj2;
                return jVar7.invokeSuspend(Unit.f26487a);
            default:
                j jVar8 = new j((j0) this.l, (x70.c) obj3, 7);
                jVar8.f1467k = (Throwable) obj2;
                return jVar8.invokeSuspend(Unit.f26487a);
        }
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        x70.c cVar = null;
        switch (this.f1466j) {
            case 0:
                Throwable th2 = (Throwable) this.f1467k;
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                k kVar = (k) this.l;
                f0.B(m1.d(kVar), null, null, new l0(th2, kVar, cVar, 2), 3);
                break;
            case 1:
                VoucherPaymentInformation voucherPaymentInformation = (VoucherPaymentInformation) this.f1467k;
                List list = (List) this.l;
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                v70.e eVarB = c0.b();
                if (voucherPaymentInformation != null) {
                    eVarB.add(new aj.h(voucherPaymentInformation));
                }
                List listL0 = CollectionsKt.l0(list, new r(1));
                ArrayList arrayList = new ArrayList(e0.o(listL0, 10));
                Iterator it = listL0.iterator();
                while (it.hasNext()) {
                    arrayList.add(new aj.i((DiscountVoucher) it.next()));
                }
                eVarB.addAll(arrayList);
                break;
            case 2:
                Throwable th3 = (Throwable) this.f1467k;
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                dt.c cVar2 = (dt.c) this.l;
                f0.B(m1.d(cVar2), null, null, new l0(th3, cVar2, cVar, 13), 3);
                break;
            case 3:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                f8.d dVar = (f8.d) this.f1467k;
                h8.g gVar = (h8.g) this.l;
                Set setKeySet = gVar.a().keySet();
                ArrayList arrayList2 = new ArrayList(e0.o(setKeySet, 10));
                Iterator it2 = setKeySet.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((h8.e) it2.next()).f21665a);
                }
                LinkedHashMap linkedHashMapB = dVar.b();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMapB.entrySet()) {
                    if (!arrayList2.contains((String) entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                h8.a aVarC = gVar.c();
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    String str = (String) entry2.getKey();
                    Object value = entry2.getValue();
                    if (value instanceof Boolean) {
                        aVarC.g(wd.a.k(str), value);
                    } else if (value instanceof Float) {
                        aVarC.g(wd.a.t(str), value);
                    } else if (value instanceof Integer) {
                        aVarC.g(wd.a.z(str), value);
                    } else if (value instanceof Long) {
                        aVarC.g(wd.a.C(str), value);
                    } else if (value instanceof String) {
                        aVarC.g(wd.a.G(str), value);
                    } else if (value instanceof Set) {
                        str.getClass();
                        aVarC.g(new h8.e(str), (Set) value);
                    }
                }
                break;
            case 4:
                y70.a aVar5 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                break;
            case 5:
                Throwable th4 = (Throwable) this.f1467k;
                y70.a aVar6 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                oh.c cVar3 = (oh.c) this.l;
                sa0.a.f38953a.d(th4);
                Iterator it3 = f0.t(m1.d(cVar3).f999a).getChildren().iterator();
                while (it3.hasNext()) {
                    ((i1) it3.next()).a(null);
                }
                cVar3.f32552a.f27834f.i(lh.a.f27776e);
                f0.B(m1.d(cVar3), null, null, new b1(cVar3, cVar, 22), 3);
                break;
            case 6:
                Throwable th5 = (Throwable) this.f1467k;
                y70.a aVar7 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                oj.a aVar8 = (oj.a) this.l;
                sa0.a.f38953a.d(th5);
                f0.B(m1.d(aVar8), null, null, new b1(aVar8, cVar, 23), 3);
                break;
            default:
                y70.a aVar9 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                Throwable th6 = (Throwable) this.f1467k;
                Log.e("PipePresenceSrc", "Error in camera ID flow collection.", th6);
                j0 j0Var = (j0) this.l;
                if (j0Var.f42708h.get()) {
                    j0Var.a(null, th6);
                } else {
                    o.K(Log.d("PipePresenceSrc", "Ignoring error because monitoring is stopped."));
                }
                break;
        }
        return Unit.f26487a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i11, x70.c cVar, int i12) {
        super(i11, cVar);
        this.f1466j = i12;
    }
}
