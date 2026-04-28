package rf;

import android.content.Context;
import android.util.Log;
import androidx.lifecycle.m1;
import cg.q0;
import cj.e0;
import cj.q;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.StoreId;
import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.mapService.response.Clusters;
import com.app.tgtg.model.remote.mapService.response.LocationDetailItem;
import com.app.tgtg.model.remote.mapService.response.MapClustersResponse;
import com.app.tgtg.model.remote.payment.PaymentMethods;
import com.app.tgtg.model.remote.payment.PaymentType;
import com.app.tgtg.model.remote.user.response.Address;
import com.app.tgtg.model.remote.voucher.BasicVoucher;
import com.app.tgtg.model.remote.voucher.response.VoucherType;
import g9.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.MatchResult;
import kotlin.text.StringsKt;
import m0.p;
import m3.b1;
import m3.g1;
import mv.r0;
import om.o;
import oq.u;
import org.bouncycastle.iana.AEADAlgorithm;
import ss.d1;
import ss.e1;
import ss.k1;
import ss.l1;
import ss.w;
import ss.w0;
import ts.l;
import ts.s;
import ts.x;
import uf.k;
import v80.b0;
import v80.b2;
import v80.g2;
import v80.i1;
import w.j0;
import xl.j;
import yi.r;
import yk.h;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f37968j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f37969k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Object obj2, x70.c cVar, int i11) {
        super(2, cVar);
        this.f37968j = i11;
        this.f37969k = obj;
        this.l = obj2;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f37968j) {
            case 0:
                return new c((j30.g) this.f37969k, (String) this.l, cVar, 0);
            case 1:
                return new c((Double) this.f37969k, (g1) this.l, cVar, 1);
            case 2:
                return new c((b0) this.f37969k, (b1) this.l, cVar, 2);
            case 3:
                return new c((rm.c) this.f37969k, (Map) this.l, cVar, 3);
            case 4:
                c cVar2 = new c((rq.d) this.l, cVar, 4);
                cVar2.f37969k = obj;
                return cVar2;
            case 5:
                return new c((ry.b) this.f37969k, (Context) this.l, cVar, 5);
            case 6:
                return new c((x) this.f37969k, (w) this.l, cVar, 6);
            case 7:
                c cVar3 = new c((w) this.l, cVar, 7);
                cVar3.f37969k = obj;
                return cVar3;
            case 8:
                return new c((l) this.f37969k, (w0) this.l, cVar, 8);
            case 9:
                c cVar4 = new c((w0) this.l, cVar, 9);
                cVar4.f37969k = obj;
                return cVar4;
            case 10:
                c cVar5 = new c((tg.i) this.l, cVar, 10);
                cVar5.f37969k = obj;
                return cVar5;
            case 11:
                return new c((k) this.f37969k, (MatchResult) this.l, cVar, 11);
            case 12:
                return new c((Address) this.f37969k, (g4.l) this.l, cVar, 12);
            case 13:
                return new c((d1) this.f37969k, (b1) this.l, cVar, 13);
            case 14:
                return new c((k1) this.f37969k, (b1) this.l, cVar, 14);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                c cVar6 = new c((Function0) this.l, cVar, 15);
                cVar6.f37969k = obj;
                return cVar6;
            case 16:
                c cVar7 = new c((v9.c) this.l, cVar, 16);
                cVar7.f37969k = obj;
                return cVar7;
            case 17:
                return new c((q) this.f37969k, (b1) this.l, cVar, 17);
            case 18:
                return new c((j0) this.f37969k, (e6.i) this.l, cVar, 18);
            case 19:
                c cVar8 = new c((w2.q) this.l, cVar, 19);
                cVar8.f37969k = obj;
                return cVar8;
            case 20:
                c cVar9 = new c((x2.w) this.l, cVar, 20);
                cVar9.f37969k = obj;
                return cVar9;
            case 21:
                c cVar10 = new c((xg.x) this.l, cVar, 21);
                cVar10.f37969k = obj;
                return cVar10;
            case 22:
                return new c((j) this.f37969k, (f0) this.l, cVar, 22);
            case 23:
                c cVar11 = new c((ye.q) this.l, cVar, 23);
                cVar11.f37969k = obj;
                return cVar11;
            case 24:
                return new c((r) this.f37969k, (b1) this.l, cVar, 24);
            case 25:
                return new c((r) this.f37969k, (List) this.l, cVar, 25);
            case 26:
                return new c((xj.k) this.f37969k, (b1) this.l, cVar, 26);
            case 27:
                return new c((h) this.f37969k, (String) this.l, cVar, 27);
            default:
                return new c((Integer) this.f37969k, (b1) this.l, cVar, 28);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f37968j) {
            case 0:
                return ((c) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 1:
                return ((c) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 2:
                return ((c) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 3:
                return ((c) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 4:
                return ((c) create((u) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 5:
                return ((c) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 6:
                return ((c) create((y80.j) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 7:
                return ((c) create((e1) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 8:
                return ((c) create((y80.j) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 9:
                return ((c) create((l1) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 10:
                return ((c) create((vg.g) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 11:
                return ((c) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 12:
                return ((c) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 13:
                return ((c) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 14:
                return ((c) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return ((c) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 16:
                ((c) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
                throw null;
            case 17:
                return ((c) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 18:
                return ((c) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 19:
                return ((c) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 20:
                return ((c) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 21:
                return ((c) create((xg.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 22:
                return ((c) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 23:
                if (obj == null) {
                    return ((c) create(null, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
                }
                org.bouncycastle.jce.provider.a.c();
                return null;
            case 24:
                return ((c) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 25:
                return ((c) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 26:
                return ((c) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 27:
                return ((c) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            default:
                return ((c) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // z70.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ArrayList arrayList;
        MapClustersResponse mapClustersResponse;
        List<Clusters> clusters;
        List<LocationDetailItem> locationDetailItems;
        p pVarN;
        int i11 = this.f37968j;
        int i12 = 2;
        int i13 = 0;
        boolean z11 = false;
        int i14 = 3;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object obj2 = this.l;
        switch (i11) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                ((hf.g) ((j30.g) this.f37969k).f24502b).e((String) obj2);
                return Unit.f26487a;
            case 1:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                Double d3 = (Double) this.f37969k;
                if (d3 != null) {
                    ((g1) obj2).i((float) d3.doubleValue());
                }
                return Unit.f26487a;
            case 2:
                y70.a aVar3 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                v80.f0.B((b0) this.f37969k, null, null, new q0((b1) obj2, objArr == true ? 1 : 0, 7), 3);
                return Unit.f26487a;
            case 3:
                y70.a aVar4 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                rm.c cVar = (rm.c) this.f37969k;
                MapClustersResponse mapClustersResponse2 = cVar.f38141a;
                List<BasicItem> fullDetailItems = mapClustersResponse2 != null ? mapClustersResponse2.getFullDetailItems() : null;
                if ((fullDetailItems == null || fullDetailItems.isEmpty()) && (((arrayList = cVar.f38142b) == null || arrayList.isEmpty()) && (mapClustersResponse = cVar.f38141a) != null && (clusters = mapClustersResponse.getClusters()) != null)) {
                    for (Clusters clusters2 : clusters) {
                        linkedHashMap.put(new LatLngInfo(clusters2.getLocation().getLatitude(), clusters2.getLocation().getLongitude()), o.CLUSTER);
                    }
                }
                Map map = (Map) obj2;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        LatLngInfo latLngInfo = new LatLngInfo(((LatLngInfo) entry.getKey()).getLatitude(), ((LatLngInfo) entry.getKey()).getLongitude());
                        if (((List) entry.getValue()).size() != 1) {
                            List list = (List) entry.getValue();
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            for (Object obj3 : list) {
                                String strM370getStoreId7QsYvu8 = mv.d.m((BasicItem) obj3).m370getStoreId7QsYvu8();
                                StoreId storeIdM269boximpl = strM370getStoreId7QsYvu8 != null ? StoreId.m269boximpl(strM370getStoreId7QsYvu8) : null;
                                Object arrayList2 = linkedHashMap2.get(storeIdM269boximpl);
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                    linkedHashMap2.put(storeIdM269boximpl, arrayList2);
                                }
                                ((List) arrayList2).add(obj3);
                            }
                            if (linkedHashMap2.size() > 1) {
                                linkedHashMap.put(latLngInfo, o.MULTI_STORES);
                            } else {
                                Iterable iterable = (Iterable) entry.getValue();
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj4 : iterable) {
                                    if (r0.t((BasicItem) obj4)) {
                                        arrayList3.add(obj4);
                                    }
                                }
                                if (arrayList3.isEmpty()) {
                                    linkedHashMap.put(latLngInfo, o.SOLD_OUT);
                                } else {
                                    linkedHashMap.put(latLngInfo, o.MULTI_ITEMS);
                                }
                            }
                        } else if (r0.t((BasicItem) ((List) entry.getValue()).get(0))) {
                            linkedHashMap.put(latLngInfo, o.SINGLE_ITEM);
                        } else {
                            linkedHashMap.put(latLngInfo, o.SOLD_OUT);
                        }
                    }
                }
                MapClustersResponse mapClustersResponse3 = cVar.f38141a;
                if (mapClustersResponse3 != null && (locationDetailItems = mapClustersResponse3.getLocationDetailItems()) != null) {
                    for (LocationDetailItem locationDetailItem : locationDetailItems) {
                        linkedHashMap.put(new LatLngInfo(locationDetailItem.getLocation().getLatitude(), locationDetailItem.getLocation().getLongitude()), o.PARTIAL_DETAIL);
                    }
                }
                return linkedHashMap;
            case 4:
                u uVar = (u) this.f37969k;
                y70.a aVar5 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                ((rq.d) obj2).f38160b.j(uVar);
                return Unit.f26487a;
            case 5:
                y70.a aVar6 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                ry.b bVar = (ry.b) this.f37969k;
                String string = ((Context) obj2).getString(R.string.map_unknown_address);
                string.getClass();
                bVar.invoke(string);
                return Unit.f26487a;
            case 6:
                y70.a aVar7 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                x xVar = (x) this.f37969k;
                VoucherType voucherType = xVar.f40471a.getVoucherType();
                VoucherType voucherType2 = VoucherType.USER_REFERRAL;
                w wVar = (w) obj2;
                BasicVoucher basicVoucher = xVar.f40471a;
                if (voucherType == voucherType2) {
                    wVar.f39256d.i(new ts.u(basicVoucher));
                } else {
                    wVar.f39256d.i(new s(basicVoucher.getVoucherType(), basicVoucher.mo529getIdVUJ7vw4(), 4));
                }
                return Unit.f26487a;
            case 7:
                e1 e1Var = (e1) this.f37969k;
                y70.a aVar8 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                ((w) obj2).f39260h.j(e1Var);
                return Unit.f26487a;
            case 8:
                y70.a aVar9 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                l lVar = (l) this.f37969k;
                BasicVoucher basicVoucher2 = lVar.f40455b;
                BasicVoucher basicVoucher3 = lVar.f40455b;
                w0 w0Var = (w0) obj2;
                if (basicVoucher2.getVoucherType() == VoucherType.USER_REFERRAL) {
                    w0Var.f39263c.i(new ts.i(basicVoucher3));
                } else {
                    w0Var.f39263c.i(new ts.g(lVar.f40454a, basicVoucher3.mo529getIdVUJ7vw4()));
                }
                return Unit.f26487a;
            case 9:
                l1 l1Var = (l1) this.f37969k;
                y70.a aVar10 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                ((w0) obj2).f39267g.j(l1Var);
                return Unit.f26487a;
            case 10:
                tg.i iVar = (tg.i) obj2;
                vg.g gVar = (vg.g) this.f37969k;
                y70.a aVar11 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                String string2 = StringsKt.e0(gVar.f42319a).toString();
                if (StringsKt.H(string2)) {
                    if (((vg.a) iVar.f40168g.getValue()).f42317a != vg.f.SELECT_AREA_SEARCH_BOX) {
                        iVar.j(vg.f.NONE, ((vg.a) iVar.f40162a.f40151f.getValue()).f42318b);
                    }
                    iVar.k(new vg.g("", null, null, null, 8));
                } else if (gVar.f42322d == vg.d.NONE) {
                    v80.f0.B(m1.d(iVar), null, null, new tg.e(iVar, string2, objArr2 == true ? 1 : 0, i13), 3);
                }
                return Unit.f26487a;
            case 11:
                y70.a aVar12 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                hf.g gVar2 = ((k) this.f37969k).f41117a;
                String str = (String) ((MatchResult) obj2).a().get(1);
                gVar2.getClass();
                str.getClass();
                gVar2.f22031e.remove(str);
                return Unit.f26487a;
            case 12:
                y70.a aVar13 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                if (((Address) this.f37969k) != null) {
                    ((g4.p) ((g4.l) obj2)).b(true);
                }
                return Unit.f26487a;
            case 13:
                y70.a aVar14 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                d1 d1Var = (d1) this.f37969k;
                if (d1Var.f39159f != null || d1Var.f39157d != null) {
                    ((b1) obj2).setValue(Boolean.TRUE);
                }
                return Unit.f26487a;
            case 14:
                y70.a aVar15 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                k1 k1Var = (k1) this.f37969k;
                if (k1Var.f39206g != null || k1Var.f39203d != null) {
                    ((b1) obj2).setValue(Boolean.TRUE);
                }
                return Unit.f26487a;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                y70.a aVar16 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                CoroutineContext coroutineContext = ((b0) this.f37969k).getCoroutineContext();
                Function0 function0 = (Function0) obj2;
                try {
                    g2 g2Var = new g2();
                    g2Var.f42103f = v80.f0.w(v80.f0.t(coroutineContext), g2Var);
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g2.f42101g;
                    while (true) {
                        int i15 = atomicIntegerFieldUpdater.get(g2Var);
                        if (i15 != 0) {
                            if (i15 != 2 && i15 != 3) {
                                g2.n(i15);
                                throw null;
                            }
                        } else if (!atomicIntegerFieldUpdater.compareAndSet(g2Var, i15, 0)) {
                        }
                    }
                    try {
                        return function0.invoke();
                    } finally {
                        g2Var.m();
                    }
                } catch (InterruptedException e5) {
                    throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e5);
                }
            case 16:
                y70.a aVar17 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                throw null;
            case 17:
                y70.a aVar18 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                q qVar = (q) this.f37969k;
                List list2 = (List) ((b1) obj2).getValue();
                qVar.getClass();
                list2.getClass();
                ArrayList arrayList4 = new ArrayList();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    PaymentType paymentType = ((PaymentMethods) it.next()).getPaymentType();
                    String strName = paymentType != null ? paymentType.name() : null;
                    if (strName != null) {
                        arrayList4.add(strName);
                    }
                }
                cv.i iVar2 = cv.i.SCREEN_PAYMENT_OPTIONS_LIST_PRESENTED;
                Pair pair = new Pair(dv.a.PAYMENT_TYPES, new dv.c(arrayList4));
                dv.a aVar19 = dv.a.ITEM_TYPE;
                BasicItem basicItemF = qVar.f();
                qVar.s(iVar2, h0.g.E(pair, new Pair(aVar19, new dv.c(basicItemF != null ? basicItemF.getItemType().name() : null))));
                return Unit.f26487a;
            case 18:
                e6.i iVar3 = (e6.i) obj2;
                j0 j0Var = (j0) this.f37969k;
                y70.a aVar20 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                try {
                    String[] cameraIdList = j0Var.f42710j.getCameraIdList();
                    cameraIdList.getClass();
                    ArrayList arrayList5 = new ArrayList();
                    int length = cameraIdList.length;
                    while (i13 < length) {
                        String str2 = cameraIdList[i13];
                        try {
                            str2.getClass();
                            pVarN = w0.e.n(str2, null, null);
                        } catch (IllegalArgumentException e11) {
                            Log.w("PipePresenceSrc", "Could not create CameraIdentifier for system ID: " + str2, e11);
                            pVarN = null;
                        }
                        if (pVarN != null) {
                            arrayList5.add(pVarN);
                        }
                        i13++;
                        break;
                    }
                    Log.d("PipePresenceSrc", "[FetchData] Refreshed camera list from hardware: " + arrayList5);
                    j0Var.a(arrayList5, null);
                    iVar3.b(arrayList5);
                    break;
                } catch (Exception e12) {
                    Log.e("PipePresenceSrc", "[FetchData] Failed to refresh camera list from hardware.", e12);
                    j0Var.a(null, e12);
                    iVar3.d(e12);
                }
                return Unit.f26487a;
            case 19:
                y70.a aVar21 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                b0 b0Var = (b0) this.f37969k;
                w2.q qVar2 = (w2.q) obj2;
                AtomicReference atomicReference = qVar2.f43018b;
                b2 b2VarB = v80.f0.B(b0Var, null, null, new tm.d((i1) atomicReference.getAndSet(null), qVar2, objArr3 == true ? 1 : 0, 14), 3);
                while (true) {
                    if (atomicReference.compareAndSet(null, b2VarB)) {
                        z11 = true;
                    } else if (atomicReference.get() != null) {
                    }
                }
                return Boolean.valueOf(z11);
            case 20:
                y70.a aVar22 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                b0 b0Var2 = (b0) this.f37969k;
                x2.w wVar2 = (x2.w) obj2;
                v80.f0.B(b0Var2, null, null, new m2.f0(wVar2, objArr5 == true ? 1 : 0, i12), 3);
                return v80.f0.B(b0Var2, null, null, new m2.f0(wVar2, objArr4 == true ? 1 : 0, i14), 3);
            case 21:
                xg.b0 b0Var3 = (xg.b0) this.f37969k;
                y70.a aVar23 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                ((xg.x) obj2).f44303c.j(b0Var3);
                return Unit.f26487a;
            case 22:
                f0 f0Var = (f0) obj2;
                y70.a aVar24 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                j jVar = (j) this.f37969k;
                if (jVar instanceof xl.g) {
                    g9.p.e(f0Var, new am.i(((xl.g) jVar).f44453a));
                } else if (jVar instanceof xl.i) {
                    xl.i iVar4 = (xl.i) jVar;
                    g9.p.e(f0Var, new am.l(iVar4.f44455a, iVar4.f44456b));
                } else if (jVar instanceof xl.h) {
                    g9.p.e(f0Var, new am.f(((xl.h) jVar).f44454a));
                }
                return Unit.f26487a;
            case 23:
                y70.a aVar25 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                if (this.f37969k == null) {
                    return Unit.f26487a;
                }
                org.bouncycastle.jce.provider.a.c();
                return null;
            case 24:
                r rVar = (r) this.f37969k;
                y70.a aVar26 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                if (((Boolean) ((b1) obj2).getValue()).booleanValue()) {
                    e0 e0VarU = rVar.u();
                    v80.f0.B(m1.d(e0VarU), null, null, new cj.r(e0VarU, objArr6 == true ? 1 : 0, 5), 3);
                    f0 f0Var2 = rVar.f46018i;
                    if (f0Var2 != null) {
                        g9.p.f(f0Var2, aj.e.PARCEL_ADDRESS_ENTRY.a());
                    }
                }
                return Unit.f26487a;
            case 25:
                y70.a aVar27 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                r rVar2 = (r) this.f37969k;
                e0 e0VarU2 = rVar2.u();
                List list3 = (List) obj2;
                list3.getClass();
                cv.i iVar5 = cv.i.TEMP_ACTION_SEE_ELEMENT;
                dv.b bVarE = h0.g.E(new Pair(dv.a.VERTICAL_POSITION, new dv.c(list3)));
                iVar5.getClass();
                e0VarU2.f8215e.c(iVar5, bVarE);
                rVar2.w();
                return Unit.f26487a;
            case 26:
                y70.a aVar28 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                if (((Boolean) ((b1) obj2).getValue()).booleanValue()) {
                    ((xj.k) this.f37969k).f44412g.f41307a.a(f70.k.f17493a);
                }
                return Unit.f26487a;
            case 27:
                y70.a aVar29 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                h hVar = (h) this.f37969k;
                String str3 = (String) obj2;
                str3.getClass();
                hVar.f46133f.d(cv.i.SCREEN_LOCATIONPICKER, dv.a.SOURCE, str3);
                return Unit.f26487a;
            default:
                y70.a aVar30 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                Integer num = (Integer) this.f37969k;
                if (num != null) {
                    ((b1) obj2).setValue(num);
                }
                return Unit.f26487a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, x70.c cVar, int i11) {
        super(2, cVar);
        this.f37968j = i11;
        this.l = obj;
    }
}
