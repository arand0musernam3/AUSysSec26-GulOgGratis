package lw;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.text.style.URLSpan;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController;
import androidx.lifecycle.m1;
import androidx.work.impl.WorkDatabase;
import com.app.tgtg.R;
import com.app.tgtg.feature.login.LoginActivity;
import com.app.tgtg.feature.orderview.surprisebag.SurpriseBagOrderActivity;
import com.app.tgtg.feature.postpurchase.email.AddEmailFragment;
import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.local.LatestBasketInteraction;
import com.app.tgtg.model.local.LatestInteractionOrigin;
import com.app.tgtg.model.remote.ParcelDeliveryOptionId;
import com.app.tgtg.model.remote.manufacturer.response.BasketItem;
import com.app.tgtg.model.remote.manufacturer.response.BasketWarningMessage;
import com.app.tgtg.model.remote.manufacturer.response.PickupOptionLocal;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.user.requests.CollectionTime;
import com.app.tgtg.model.remote.voucher.BasicVoucher;
import com.app.tgtg.model.remote.voucher.DiscountVoucher;
import com.app.tgtg.model.remote.voucher.VoucherMode;
import com.braze.configuration.CachedConfigurationProvider;
import com.braze.storage.o1;
import f0.f2;
import g3.q3;
import g3.w6;
import ib.g0;
import ib.w;
import ii.j0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import m2.c2;
import m3.b1;
import m3.h1;
import m3.q2;
import mv.r0;
import n3.l0;
import nk.q0;
import no.e0;
import no.m0;
import o00.x0;
import org.bouncycastle.iana.AEADAlgorithm;
import org.json.JSONObject;
import q90.s;
import ss.j1;
import ss.w0;
import v80.b0;
import v80.f0;
import z3.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f28329d;

    public /* synthetic */ o(Object obj, Object obj2, Object obj3, int i11) {
        this.f28326a = i11;
        this.f28327b = obj;
        this.f28328c = obj2;
        this.f28329d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [x70.c] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        DiscountVoucher discountVoucher;
        int i11;
        int i12 = this.f28326a;
        int i13 = 1;
        String strMo529getIdVUJ7vw4 = 0;
        strMo529getIdVUJ7vw4 = 0;
        Object obj = this.f28329d;
        Object obj2 = this.f28328c;
        Object obj3 = this.f28327b;
        switch (i12) {
            case 0:
                return o1.a((Context) obj3, (String) obj2, (String) obj);
            case 1:
                ConnectivityManager connectivityManager = (ConnectivityManager) obj2;
                mb.d dVar = (mb.d) obj;
                if (((Ref.BooleanRef) obj3).element) {
                    w.d().a(mb.i.f29920a, "NetworkRequestConstraintController unregister callback");
                    connectivityManager.unregisterNetworkCallback(dVar);
                }
                return Unit.f26487a;
            case 2:
                hr.i iVar = (hr.i) obj3;
                ((b1) obj).setValue(Boolean.FALSE);
                cv.i iVar2 = cv.i.ACTION_LOG_OUT;
                iVar.getClass();
                iVar2.getClass();
                iVar.f22430b.c(iVar2, null);
                f0.B(iVar.f22435g, null, null, new hr.h(iVar, null), 3);
                ((Function0) obj2).invoke();
                return Unit.f26487a;
            case 3:
                Function1 function1 = (Function1) obj3;
                URLSpan uRLSpan = (URLSpan) obj2;
                TextView textView = (TextView) obj;
                if (function1 != null) {
                    String url = uRLSpan.getURL();
                    url.getClass();
                    function1.invoke(url);
                } else {
                    textView.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(uRLSpan.getURL())));
                }
                return Unit.f26487a;
            case 4:
                m3.a aVar = (m3.a) obj3;
                q2 q2Var = (q2) obj2;
                l0 l0Var = (l0) obj;
                if (aVar != null) {
                    q2Var.a(q2Var.c(aVar) - q2Var.f29400t);
                }
                List listA = a4.c.a(q2Var, null, q2Var.f29400t, null);
                a4.d dVar2 = (a4.d) CollectionsKt.X(listA);
                Integer num = dVar2 != null ? dVar2.f683b : null;
                List listJ = l0Var.j(num);
                if (num != null && !listJ.isEmpty()) {
                    listJ = CollectionsKt.d0(CollectionsKt.J(1, listJ), c0.c(new a4.d(((a4.d) CollectionsKt.O(listJ)).f682a, null, num)));
                }
                return new a4.a(CollectionsKt.d0(listJ, listA));
            case 5:
                int i14 = SurpriseBagOrderActivity.f9178y;
                f0.B((b0) obj3, null, null, new q3((w6) obj2, strMo529getIdVUJ7vw4, 11), 3).J(new no.m((SurpriseBagOrderActivity) obj, 2));
                return Unit.f26487a;
            case 6:
                SurpriseBagOrderActivity surpriseBagOrderActivity = (SurpriseBagOrderActivity) obj3;
                b1 b1Var = (b1) obj2;
                Order order = (Order) obj;
                int i15 = SurpriseBagOrderActivity.f9178y;
                if (r0.u(surpriseBagOrderActivity)) {
                    m0 m0VarM = surpriseBagOrderActivity.C();
                    m0VarM.getClass();
                    f0.B(m1.d(m0VarM), null, null, new e0(m0VarM, null), 3);
                    surpriseBagOrderActivity.C().l(cv.i.ACTION_SEND_INVITATION, h0.g.E(new Pair(dv.a.ORDER_ID, new dv.c(order.m429getOrderIdreIZeYA()))));
                } else {
                    b1Var.setValue(oo.f.GENERIC);
                }
                return Unit.f26487a;
            case 7:
                b1 b1Var2 = (b1) obj;
                float fB = nv.c.b((h4.c) ((b1) obj3).getValue());
                float fB2 = 0.0f;
                if (((Boolean) ((b1) obj2).getValue()).booleanValue() && !((h4.c) b1Var2.getValue()).h() && fB > 0.0f) {
                    fB2 = nv.c.b((h4.c) b1Var2.getValue()) / fB;
                }
                return Float.valueOf(fB2);
            case 8:
                ns.g gVar = (ns.g) obj2;
                ((Function0) obj3).invoke();
                if (((Boolean) ((b1) obj).getValue()).booleanValue()) {
                    gVar.a();
                    String strA = dv.d.REDEEMED.a();
                    strA.getClass();
                    gVar.f31385c.d(cv.i.SCREEN_SPECIAL_REWARD, dv.a.STATE, strA);
                }
                return Unit.f26487a;
            case 9:
                Function0 function0 = (Function0) obj;
                int size = ((ArrayList) obj3).size() - ((o9.d) obj2).getPreviousEntries().size();
                for (int i16 = 0; i16 < size; i16++) {
                    function0.invoke();
                }
                return Unit.f26487a;
            case 10:
                Function1 function12 = (Function1) obj2;
                List list = (List) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : ((u) obj3).f47060b) {
                    if (((Boolean) entry.getValue()).booleanValue()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Set setKeySet = linkedHashMap.keySet();
                ArrayList arrayList = new ArrayList(kotlin.collections.e0.o(setKeySet, 10));
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    arrayList.add((CollectionTime) list.get(((Number) it.next()).intValue()));
                }
                function12.invoke(arrayList);
                return Unit.f26487a;
            case 11:
                return com.braze.communication.e.a((com.braze.requests.util.d) obj3, (Map) obj2, (JSONObject) obj);
            case 12:
                return CredentialProviderController.maybeReportErrorFromResultReceiver$lambda$1((Executor) obj3, (n7.l) obj2, obj);
            case 13:
                rb.p pVar = (rb.p) obj3;
                UUID uuid = (UUID) obj2;
                ib.h hVar = (ib.h) obj;
                pVar.getClass();
                String string = uuid.toString();
                w wVarD = w.d();
                String str = rb.p.f37856c;
                wVarD.a(str, "Updating progress for " + uuid + " (" + hVar + ")");
                WorkDatabase workDatabase = pVar.f37857a;
                workDatabase.b();
                try {
                    qb.o oVarE = workDatabase.x().e(string);
                    if (oVarE == null) {
                        throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    if (oVarE.f36829b == g0.RUNNING) {
                        qb.k kVar = new qb.k(string, hVar);
                        qb.l lVarW = workDatabase.w();
                        lVarW.getClass();
                        x0.A(lVarW.f36807a, false, true, new c2(20, lVarW, kVar));
                    } else {
                        w.d().g(str, "Ignoring setProgressAsync(...). WorkSpec (" + string + ") is not in a RUNNING state.");
                    }
                    workDatabase.q();
                    return null;
                } finally {
                }
            case 14:
                hr.i iVar3 = (hr.i) obj3;
                ((b1) obj).setValue(Boolean.FALSE);
                cv.i iVar4 = cv.i.ACTION_LOG_OUT;
                iVar3.getClass();
                iVar4.getClass();
                iVar3.f22430b.c(iVar4, null);
                f0.B(iVar3.f22435g, null, null, new hr.h(iVar3, null), 3);
                sa0.a.f38953a.f("On logout clicked and called", new Object[0]);
                ((j0) ((ub.a) obj2).f40981b).f23922c.f44310a.a(LoginActivity.f9032j);
                return Unit.f26487a;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                f0.B((b0) obj3, null, null, new mn.g((w6) obj2, (m1.a) obj, strMo529getIdVUJ7vw4, 18), 3);
                return Unit.f26487a;
            case 16:
                aj.n nVar = (aj.n) obj3;
                m1.a aVar2 = (m1.a) obj2;
                q0 q0Var = (q0) obj;
                aj.l lVar = nVar instanceof aj.l ? (aj.l) nVar : null;
                if (lVar != null && (discountVoucher = lVar.f1504a) != null) {
                    strMo529getIdVUJ7vw4 = discountVoucher.mo529getIdVUJ7vw4();
                }
                ((y80.m1) ((f2) aVar2.f28697a).f16653f).i(new ok.n(new ok.l0(q0Var.f31035a, q0Var.f31040f, strMo529getIdVUJ7vw4, nVar instanceof aj.k)));
                return Unit.f26487a;
            case 17:
                f0.B((b0) obj3, null, null, new mn.g((w6) obj2, (t5.a) obj, strMo529getIdVUJ7vw4, 22), 3);
                return Unit.f26487a;
            case 18:
                return CachedConfigurationProvider.readResourceValue$lambda$4((com.braze.configuration.d) obj3, (String) obj2, obj);
            case 19:
                return CredentialProviderCreateRestoreCredentialController.invokePlayServices$lambda$4$lambda$1((Executor) obj3, (n7.l) obj2, (n7.c) obj);
            case 20:
                sk.d dVar3 = (sk.d) obj3;
                String str2 = (String) obj2;
                m1.a aVar3 = ((qk.l) dVar3.f39048a.getValue()).f37190e;
                vj.e eVar = ((vj.c) obj).f42411a;
                aVar3.getClass();
                str2.getClass();
                eVar.getClass();
                ((y80.m1) ((f2) aVar3.f28697a).f16653f).i(new ok.c(str2, eVar));
                dVar3.dismiss();
                return Unit.f26487a;
            case 21:
                LocalDate localDate = (LocalDate) obj3;
                Ref.ObjectRef objectRef = (Ref.ObjectRef) obj2;
                Function1 function13 = (Function1) obj;
                boolean zContains = ((List) objectRef.element).contains(localDate);
                T t9 = objectRef.element;
                T tZ = zContains ? CollectionsKt.Z((Iterable) t9, localDate) : CollectionsKt.e0((Collection) t9, localDate);
                objectRef.element = tZ;
                function13.invoke(tZ);
                return Unit.f26487a;
            case 22:
                AddEmailFragment addEmailFragment = (AddEmailFragment) obj3;
                b1 b1Var3 = (b1) obj2;
                h1 h1Var = (h1) obj;
                if (((String) b1Var3.getValue()).length() == 0 || r0.s((String) b1Var3.getValue())) {
                    h1Var.i(R.string.postpurchase_email_promt_error_valid_email);
                } else {
                    to.f fVar = (to.f) addEmailFragment.f9203g.getValue();
                    String str3 = (String) b1Var3.getValue();
                    String strB = ((qo.h) addEmailFragment.f9202f.getValue()).b();
                    to.c cVar = new to.c(addEmailFragment, i13);
                    sg.c cVar2 = new sg.c(addEmailFragment, 6);
                    str3.getClass();
                    f0.B(m1.d(fVar), null, null, new af.b(fVar, strB, str3, cVar, cVar2, (x70.c) null, 17), 3);
                }
                return Unit.f26487a;
            case 23:
                ((u3.b) obj3).a();
                u3.a aVar4 = ((u3.c) obj2).f40643c;
                int i17 = ((Ref.IntRef) obj).element;
                do {
                    i11 = aVar4.get();
                } while (!aVar4.compareAndSet(i11, ((i11 >>> 27) & 15) == i17 ? i11 - 1 : i11));
                return Unit.f26487a;
            case 24:
                z20.b bVar = ((q90.j) obj3).f36518b;
                bVar.getClass();
                return bVar.k(((q90.a) obj).f36408h.f36626d, ((s) obj2).a());
            case 25:
                t5.a aVar5 = (t5.a) obj3;
                DiscountVoucher discountVoucher2 = (DiscountVoucher) obj2;
                VoucherMode voucherMode = VoucherMode.DISCOUNT;
                aVar5.getClass();
                voucherMode.getClass();
                discountVoucher2.getClass();
                ((w0) aVar5.f39791b).f39263c.i(new ts.d(voucherMode, discountVoucher2));
                ((b1) obj).setValue(Boolean.TRUE);
                return Unit.f26487a;
            case 26:
                t5.a aVar6 = (t5.a) obj3;
                VoucherMode voucherMode2 = VoucherMode.REGULAR;
                BasicVoucher basicVoucher = ((j1) obj2).f39193a;
                aVar6.getClass();
                voucherMode2.getClass();
                basicVoucher.getClass();
                ((w0) aVar6.f39791b).f39263c.i(new ts.d(voucherMode2, basicVoucher));
                ((b1) obj).setValue(Boolean.TRUE);
                return Unit.f26487a;
            case 27:
                BasketManager basketManager = (BasketManager) obj3;
                um.u uVar = (um.u) obj;
                for (BasketItem basketItem : (ArrayList) obj2) {
                    if (basketItem.getWarnings().contains(BasketWarningMessage.SOLD_OUT)) {
                        if (basketManager != null) {
                            basketManager.setQuantity(basketItem.getItemId(), 0, LatestBasketInteraction.FORCE_ADJUST, LatestInteractionOrigin.SCREEN_BASKET);
                        }
                    } else if (basketItem.getWarnings().contains(BasketWarningMessage.OVER_LIMIT) && basketManager != null) {
                        basketManager.setQuantity(basketItem.getItemId(), basketItem.getMaxAvailableQuantity(), LatestBasketInteraction.FORCE_ADJUST, LatestInteractionOrigin.SCREEN_BASKET);
                    }
                }
                uVar.l(um.g.MISSING_PRODUCTS);
                return Unit.f26487a;
            case 28:
                return com.braze.events.d.a((com.braze.events.d) obj3, (Class) obj2, obj);
            default:
                ((Function2) obj3).invoke(ParcelDeliveryOptionId.m221boximpl(((PickupOptionLocal) obj2).m403getDeliveryOptionIdViwp_pU()), ((wi.e) obj).f43433b);
                return Unit.f26487a;
        }
    }
}
