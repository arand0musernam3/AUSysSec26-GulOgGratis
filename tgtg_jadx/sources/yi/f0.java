package yi;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.o0;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.c1;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import b5.r1;
import bg.b1;
import bg.k0;
import bg.w0;
import cj.h0;
import cj.l0;
import cj.s0;
import com.adyen.checkout.card.CardComponent;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.components.core.StoredPaymentMethod;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.core.Environment;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.googlepay.GooglePayComponent;
import com.adyen.checkout.ui.core.AdyenComponentView;
import com.app.tgtg.R;
import com.app.tgtg.model.local.AppConstants;
import com.app.tgtg.model.local.payment.AdyenActionComponents;
import com.app.tgtg.model.local.payment.ResumePaymentData;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.OrderId;
import com.app.tgtg.model.remote.PaymentId;
import com.app.tgtg.model.remote.VoucherId;
import com.app.tgtg.model.remote.item.BasicItemInformation;
import com.app.tgtg.model.remote.item.PickupInterval;
import com.app.tgtg.model.remote.item.StoreInformation;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.manufacturer.request.BasketBriefItem;
import com.app.tgtg.model.remote.order.AuthPayloadType;
import com.app.tgtg.model.remote.order.Authorization;
import com.app.tgtg.model.remote.order.AuthorizationPayload;
import com.app.tgtg.model.remote.order.response.PaymentProvider;
import com.app.tgtg.model.remote.payment.EdenredPayload;
import com.app.tgtg.model.remote.payment.PaymentMethods;
import com.app.tgtg.model.remote.payment.PaymentMethodsKt;
import com.app.tgtg.model.remote.payment.PaymentType;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.payment.PriceSpecification;
import com.app.tgtg.model.remote.payment.SatispayPayload;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.x0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import v80.b2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lyi/f0;", "Lcom/google/android/material/bottomsheet/m;", "Lzi/f;", "<init>", "()V", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPaymentFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentFragment.kt\ncom/app/tgtg/feature/checkout/fragments/PaymentFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,1673:1\n106#2,15:1674\n172#2,9:1689\n1#3:1698\n29#4:1699\n*S KotlinDebug\n*F\n+ 1 PaymentFragment.kt\ncom/app/tgtg/feature/checkout/fragments/PaymentFragment\n*L\n109#1:1674,15\n127#1:1689,9\n1480#1:1699\n*E\n"})
public final class f0 extends u implements zi.f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n1 f45982g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public zi.e f45983h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public dj.a f45984i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f45985j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public GooglePayComponent f45986k;
    public w0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f45987m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public PaymentMethods f45988n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b1 f45989o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public v f45990p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n1 f45991q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final u70.t f45992r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c0 f45993s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public pg.k f45994t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final al.i f45995u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f45996v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f45997w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final u6.f f45998x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final qt.b f45999y;

    public f0() {
        super(1);
        u70.j jVarA = u70.l.a(u70.m.NONE, new ky.i(new d0(this, 3), 25));
        this.f45982g = new n1(Reflection.getOrCreateKotlinClass(s0.class), new xj.c(jVarA, 2), new r1(21, this, jVarA), new xj.c(jVarA, 3));
        this.f45985j = "Not set";
        this.f45991q = new n1(Reflection.getOrCreateKotlinClass(cj.q.class), new d0(this, 0), new d0(this, 2), new d0(this, 1));
        this.f45992r = u70.l.b(new w(this, 0));
        this.f45993s = new c0(this);
        this.f45995u = new al.i(this, 8);
        this.f45998x = new u6.f(this);
        this.f45999y = new qt.b(this, 1);
    }

    public static void R(f0 f0Var, PaymentMethods paymentMethods, PaymentProvider paymentProvider, Action action, int i11) {
        if ((i11 & 2) != 0) {
            paymentProvider = null;
        }
        if ((i11 & 4) != 0) {
            action = null;
        }
        if (f0Var.requireActivity().isFinishing() || f0Var.f45989o != null) {
            return;
        }
        Bundle bundle = new Bundle();
        PaymentType paymentType = paymentMethods.getPaymentType();
        paymentType.getClass();
        bundle.putInt("logo", paymentType.getLargeIconRes());
        bundle.putInt("name", paymentType.getTitleResId());
        if (paymentProvider != null) {
            bundle.putSerializable("providerType", paymentProvider);
        }
        if (action != null) {
            bundle.putParcelable("action", action);
        }
        b1 b1Var = new b1();
        b1Var.setArguments(bundle);
        f0Var.f45989o = b1Var;
        b1Var.show(f0Var.getChildFragmentManager(), "waitingThirdParty");
    }

    public static /* synthetic */ void u(f0 f0Var, String str, int i11) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        f0Var.t(str, false);
    }

    public static void v(f0 f0Var, boolean z11, int i11) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        String str = (i11 & 2) != 0 ? null : "waitingThirdParty - cancelOrderPressed";
        b1 b1Var = f0Var.f45989o;
        if (b1Var != null) {
            b1Var.dismiss();
        }
        f0Var.f45989o = null;
        f0Var.f45987m = false;
        if (z11) {
            f0Var.t(String.valueOf(str), true);
        }
    }

    public final cj.q A() {
        return (cj.q) this.f45991q.getValue();
    }

    public final s0 B() {
        return (s0) this.f45982g.getValue();
    }

    public final Price C() {
        PriceSpecification priceSpecification = (PriceSpecification) A().f8349j.f45488a.getValue();
        if (priceSpecification != null) {
            return priceSpecification.getTotal();
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yi.f0.D(java.lang.String):void");
    }

    public final void E(Intent intent) {
        Environment adyenEnvironment;
        PaymentMethods paymentMethods = this.f45988n;
        if ((paymentMethods != null ? paymentMethods.getPaymentProvider() : null) == PaymentProvider.ADYEN) {
            PaymentMethods paymentMethods2 = this.f45988n;
            if ((paymentMethods2 != null ? paymentMethods2.getPaymentType() : null) != PaymentType.CASH_APP_PAY) {
                this.f45985j = "Redirect";
                PaymentMethods paymentMethods3 = this.f45988n;
                if (paymentMethods3 == null || (adyenEnvironment = PaymentMethodsKt.getAdyenEnvironment(paymentMethods3)) == null) {
                    adyenEnvironment = AppConstants.INSTANCE.getAdyenEnvironment();
                }
                x().getRedirectComponent(this.f45993s, adyenEnvironment).handleIntent(intent);
            }
        }
    }

    public final void F(String str) {
        this.f45987m = true;
        PaymentMethods paymentMethods = (PaymentMethods) A().f8353o.f45488a.getValue();
        if (paymentMethods != null) {
            R(this, paymentMethods, null, null, 14);
        }
        AuthPayloadType authPayloadType = AuthPayloadType.ADYEN_AUTH_PAYLOAD;
        PaymentMethods paymentMethods2 = this.f45988n;
        paymentMethods2.getClass();
        PaymentType paymentType = paymentMethods2.getPaymentType();
        paymentType.getClass();
        I(new AuthorizationPayload((String) null, (String) null, false, paymentType.name(), authPayloadType, str, (String) null, (String) null, (String) null, 455, (DefaultConstructorMarker) null));
    }

    public final void G(String str, String str2) {
        str2.getClass();
        A().b();
        D(null);
        B().x(cv.i.CORE_PURCHASE_ERROR, x0.d(new Pair(dv.a.TYPE, new dv.c(str)), new Pair(dv.a.MESSAGE, new dv.c(str2))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0793  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x07b0  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x07cc  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x07f8  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0807  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0810  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x084f A[LOOP:1: B:338:0x0849->B:340:0x084f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0a33  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0a65  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0a68  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0a76  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0a8e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0198  */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r3v110 */
    /* JADX WARN: Type inference failed for: r3v152 */
    /* JADX WARN: Type inference failed for: r3v153 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13, types: [dj.a] */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r5v24, types: [dv.b] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v66, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(java.lang.String r39) {
        /*
            Method dump skipped, instruction units count: 2947
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yi.f0.H(java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.Map] */
    public final void I(AuthorizationPayload authorizationPayload) {
        PickupInterval pickupIntervalL;
        PickupInterval pickupIntervalL2;
        PriceSpecification priceSpecification = (PriceSpecification) A().f8349j.f45488a.getValue();
        Price total = priceSpecification != null ? priceSpecification.getTotal() : null;
        if (total == null) {
            w("totalPrice is null");
            return;
        }
        aj.n nVar = (aj.n) A().f8355q.f45488a.getValue();
        String strH = A().h();
        if (strH == null) {
            w("orderId is null");
            return;
        }
        this.f45996v = true;
        if (Intrinsics.areEqual(nVar, aj.k.f1503a)) {
            s0 s0VarB = B();
            Object value = A().f8353o.f45488a.getValue();
            value.getClass();
            PaymentMethods paymentMethods = (PaymentMethods) value;
            PriceSpecification priceSpecification2 = (PriceSpecification) A().f8349j.f45488a.getValue();
            Map<VoucherId, Price> voucherWithPriceMap = priceSpecification2 != null ? priceSpecification2.getVoucherWithPriceMap() : null;
            String strZ = z();
            BasicItem basicItemF = A().f();
            if (basicItemF != null && (pickupIntervalL2 = mv.d.l(basicItemF)) != null) {
                pickupWindowStartSecond = pickupIntervalL2.getPickupWindowStartSecond();
            }
            s0.o(s0VarB, authorizationPayload, paymentMethods, strH, total, voucherWithPriceMap, null, strZ, pickupWindowStartSecond);
        } else {
            s0 s0VarB2 = B();
            Object value2 = A().f8353o.f45488a.getValue();
            value2.getClass();
            PaymentMethods paymentMethods2 = (PaymentMethods) value2;
            String strZ2 = z();
            BasicItem basicItemF2 = A().f();
            String pickupWindowStartSecond = (basicItemF2 == null || (pickupIntervalL = mv.d.l(basicItemF2)) == null) ? null : pickupIntervalL.getPickupWindowStartSecond();
            PriceSpecification priceSpecification3 = (PriceSpecification) A().f8349j.f45488a.getValue();
            s0.o(s0VarB2, authorizationPayload, paymentMethods2, strH, total, null, priceSpecification3 != null ? priceSpecification3.getDiscountsWithPriceMap() : null, strZ2, pickupWindowStartSecond);
        }
        View view = getView();
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v7 */
    public final void J() {
        Map<VoucherId, Price> map;
        List list;
        PickupInterval pickupIntervalL;
        PriceSpecification priceSpecification = (PriceSpecification) A().f8349j.f45488a.getValue();
        if ((priceSpecification != null ? priceSpecification.getTotal() : null) == null) {
            w("totalPrice is null");
            return;
        }
        String strH = A().h();
        if (strH == null) {
            w("orderId is null");
            return;
        }
        s0 s0VarB = B();
        c1 c1Var = s0VarB.f8385a;
        PriceSpecification priceSpecification2 = (PriceSpecification) A().f8349j.f45488a.getValue();
        Map<VoucherId, Price> voucherWithPriceMap = priceSpecification2 != null ? priceSpecification2.getVoucherWithPriceMap() : null;
        String strZ = z();
        BasicItem basicItemF = A().f();
        String pickupWindowStartSecond = (basicItemF == null || (pickupIntervalL = mv.d.l(basicItemF)) == null) ? null : pickupIntervalL.getPickupWindowStartSecond();
        if (strH.length() == 0) {
            return;
        }
        cv.b bVar = s0VarB.f8388d;
        cv.i iVar = cv.i.ACTION_PAYMENT_STARTED;
        Pair pair = new Pair(dv.a.PAYMENT_METHOD, new dv.c("VOUCHER"));
        Pair pair2 = new Pair(dv.a.ORDER_ID, new dv.c(strH));
        Pair pair3 = new Pair(dv.a.PAYMENT_PROVIDER, new dv.c("VOUCHER"));
        dv.a aVar = dv.a.IS_SAVED_PAYMENT_METHOD;
        Boolean bool = Boolean.FALSE;
        Pair pair4 = new Pair(aVar, new dv.c(bool));
        Pair pair5 = new Pair(dv.a.IS_DEFAULT_PAYMENT_METHOD, new dv.c(bool));
        dv.a aVar2 = dv.a.ITEM_ID;
        Object objC = "";
        if (Intrinsics.areEqual((Boolean) c1Var.a("isMultiItem"), Boolean.TRUE)) {
            aj.c cVarE = s0VarB.e();
            if (cVarE == null || (list = cVarE.f1494a) == null) {
                map = voucherWithPriceMap;
                objC = kotlin.collections.c0.c("");
            } else {
                map = voucherWithPriceMap;
                objC = new ArrayList(kotlin.collections.e0.o(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    objC.add(((BasketBriefItem) it.next()).getItemId());
                }
            }
        } else {
            map = voucherWithPriceMap;
            String strF = s0VarB.f();
            if (strF == null) {
                strF = null;
            }
            if (strF != null) {
                objC = strF;
            }
        }
        Pair pair6 = new Pair(aVar2, new dv.c(objC));
        dv.a aVar3 = dv.a.STORE_ID;
        String str = s0VarB.f8399p;
        if (str == null) {
            str = null;
        }
        Pair pair7 = new Pair(aVar3, new dv.c(str));
        Pair pair8 = new Pair(dv.a.ITEM_TYPE, new dv.c(strZ));
        Pair pair9 = new Pair(dv.a.PICKUP_WINDOW_START_SECOND, new dv.c(pickupWindowStartSecond));
        Pair pair10 = new Pair(dv.a.SHIPPING_METHOD, new dv.c((String) c1Var.a("shippingId")));
        dv.a aVar4 = dv.a.BASKET_ID;
        aj.c cVarE2 = s0VarB.e();
        Map mapE = x0.e(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, new Pair(aVar4, new dv.c(cVarE2 != null ? cVarE2.f1496c : null)), new Pair(dv.a.DISCOUNT_USED, new dv.c(Boolean.valueOf(s0VarB.f8404u))));
        dv.b bVar2 = new dv.b();
        bVar2.f15174a.putAll(mapE);
        bVar.c(iVar, bVar2);
        ArrayList arrayList = new ArrayList();
        if (map != null) {
            for (Map.Entry<VoucherId, Price> entry : map.entrySet()) {
                arrayList.add(new Authorization(new AuthorizationPayload((String) null, entry.getKey().m306unboximpl(), false, (String) null, AuthPayloadType.VOUCHER_AUTH_PAYLOAD, (String) null, (String) null, (String) null, (String) null, 493, (DefaultConstructorMarker) null), PaymentProvider.VOUCHER, s0VarB.j(), entry.getValue()));
            }
        }
        s0VarB.f8392h = v80.f0.B(m1.d(s0VarB), null, null, new al.j(s0VarB, strH, arrayList, (x70.c) null), 3);
    }

    public final void K(EdenredPayload edenredPayload) {
        String redirectUrl;
        if (this.f45987m) {
            return;
        }
        PaymentMethods paymentMethods = (PaymentMethods) A().f8353o.f45488a.getValue();
        if (paymentMethods != null) {
            R(this, paymentMethods, null, null, 14);
        }
        if (edenredPayload == null || (redirectUrl = edenredPayload.getRedirectUrl()) == null) {
            return;
        }
        this.f45987m = true;
        b1 b1Var = this.f45989o;
        if (b1Var != null) {
            b1.r(b1Var, PaymentProvider.EDENRED, null, null, edenredPayload, 6);
        }
        B().f8385a.d(Boolean.TRUE, "resumePolling");
        s0 s0VarB = B();
        Uri uri = Uri.parse(redirectUrl);
        if (uri != null) {
            s0VarB.f8391g.a(uri);
        }
    }

    public final void L(SatispayPayload satispayPayload) {
        String redirectUrl;
        if (this.f45987m || satispayPayload == null || (redirectUrl = satispayPayload.getRedirectUrl()) == null) {
            return;
        }
        this.f45987m = true;
        b1 b1Var = this.f45989o;
        if (b1Var != null) {
            b1.r(b1Var, PaymentProvider.SATISPAY, null, satispayPayload, null, 10);
        }
        s0 s0VarB = B();
        Uri uri = Uri.parse(redirectUrl);
        if (uri != null) {
            s0VarB.f8391g.a(uri);
        }
    }

    public final void M(int i11) {
        pg.k kVar = this.f45994t;
        kVar.getClass();
        ((TextView) kVar.f34932f).setText(getString(i11));
    }

    public final void N(Integer num, int i11) {
        k0 k0Var = new k0(requireActivity());
        k0Var.e(i11);
        k0Var.c(R.string.order_has_been_canceled_popup_btn);
        k0Var.f6180k = true;
        View viewRequireView = requireView();
        viewRequireView.getClass();
        k0Var.f6184p = viewRequireView;
        if (num != null) {
            k0Var.a(num.intValue());
        }
        k0Var.f();
    }

    public final void O(lz.i iVar) {
        if (!isAdded()) {
            if (this.f45997w <= 5) {
                new Handler(Looper.getMainLooper()).postDelayed(new v30.a(7, this, iVar), 500L);
                return;
            }
            return;
        }
        w0 w0Var = this.l;
        if (w0Var != null) {
            w0Var.a();
        }
        bg.g0 g0Var = new bg.g0();
        g0Var.setArguments((Bundle) iVar.f28446b);
        g0Var.show(getChildFragmentManager(), "error_view");
        this.f45997w = 0;
    }

    public final void P() {
        w0 w0Var;
        if (getContext() == null) {
            return;
        }
        Context contextD = p70.g.d(getContext());
        contextD.getClass();
        if (((Activity) contextD).isFinishing()) {
            return;
        }
        if (this.l == null) {
            this.l = new w0(getContext());
        }
        View view = getView();
        if (view == null || (w0Var = this.l) == null) {
            return;
        }
        w0Var.b(view);
    }

    public final void Q() {
        w0 w0Var = this.l;
        if (w0Var != null) {
            w0Var.a();
        }
        View view = getView();
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // com.google.android.material.bottomsheet.m, k.z, androidx.fragment.app.y
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.getClass();
        lx.u.u(((com.google.android.material.bottomsheet.l) dialogOnCreateDialog).getOnBackPressedDispatcher(), this, new y(this, 2));
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.embedded_payment, viewGroup, false);
        int i11 = R.id.adyenComponentView;
        AdyenComponentView adyenComponentView = (AdyenComponentView) pd.g.t(R.id.adyenComponentView, viewInflate);
        if (adyenComponentView != null) {
            i11 = R.id.btnBackArrow;
            ImageView imageView = (ImageView) pd.g.t(R.id.btnBackArrow, viewInflate);
            if (imageView != null) {
                i11 = R.id.btnClose;
                ImageView imageView2 = (ImageView) pd.g.t(R.id.btnClose, viewInflate);
                if (imageView2 != null) {
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) viewInflate;
                    i11 = R.id.paymentTitle;
                    TextView textView = (TextView) pd.g.t(R.id.paymentTitle, viewInflate);
                    if (textView != null) {
                        this.f45994t = new pg.k(linearLayoutCompat, adyenComponentView, imageView, imageView2, textView, 2);
                        linearLayoutCompat.getClass();
                        return linearLayoutCompat;
                    }
                }
            }
        }
        c50.w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
        return null;
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f45994t = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    @Override // androidx.fragment.app.y, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() {
        /*
            r6 = this;
            super.onStart()
            cj.q r0 = r6.A()
            y80.h1 r0 = r0.f8357s
            y80.y1 r0 = r0.f45488a
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 8
            if (r0 != 0) goto L5f
            boolean r0 = r6.f45996v
            if (r0 == 0) goto L1e
            goto L5f
        L1e:
            android.view.View r0 = r6.getView()
            if (r0 == 0) goto L68
            r6.B()
            com.app.tgtg.model.remote.payment.PaymentMethods r2 = r6.f45988n
            r2.getClass()
            com.app.tgtg.model.remote.order.response.ProviderType r3 = r2.getProviderType()
            com.app.tgtg.model.remote.order.response.ProviderType r4 = com.app.tgtg.model.remote.order.response.ProviderType.ADYEN_SAVED_PAYMENT
            r5 = 0
            if (r3 != r4) goto L4d
            java.lang.String r3 = r2.getCardIdentifier()
            if (r3 == 0) goto L4d
            java.util.ArrayList r3 = ft.c.e()
            java.lang.String r2 = r2.getCardIdentifier()
            boolean r2 = r3.contains(r2)
            if (r2 != 0) goto L4b
            r2 = 1
            goto L57
        L4b:
            r2 = r5
            goto L57
        L4d:
            com.app.tgtg.model.remote.payment.PaymentType r2 = r2.getPaymentType()
            if (r2 == 0) goto L4b
            boolean r2 = r2.getComesWithInternalLayout()
        L57:
            if (r2 != 0) goto L5a
            goto L5b
        L5a:
            r1 = r5
        L5b:
            r0.setVisibility(r1)
            return
        L5f:
            android.view.View r0 = r6.getView()
            if (r0 == 0) goto L68
            r0.setVisibility(r1)
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yi.f0.onStart():void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws Throwable {
        StoreInformation storeInformationM;
        view.getClass();
        super.onViewCreated(view, bundle);
        v6.d activity = getActivity();
        activity.getClass();
        this.f45983h = (zi.e) activity;
        this.f45988n = (PaymentMethods) h0.g.t(requireArguments(), "selectedPaymentMethod", PaymentMethods.class);
        B().f8400q = requireArguments().getLong("orderCreatedAt", System.currentTimeMillis());
        s0 s0VarB = B();
        BasicItem basicItemF = A().f();
        x70.c cVar = null;
        s0VarB.f8399p = (basicItemF == null || (storeInformationM = mv.d.m(basicItemF)) == null) ? null : storeInformationM.m370getStoreId7QsYvu8();
        ItemId itemId = (ItemId) h0.g.t(requireArguments(), "itemId", ItemId.class);
        String strM205unboximpl = itemId != null ? itemId.m205unboximpl() : null;
        boolean z11 = requireArguments().getBoolean("isMultiItem", false);
        aj.c cVar2 = (aj.c) h0.g.t(requireArguments(), "basketCheckoutData", aj.c.class);
        if (!z11 && strM205unboximpl == null) {
            w("itemId is null");
            return;
        }
        if (z11 && cVar2 == null) {
            w("basketData is null");
            return;
        }
        if (!((Boolean) A().f8357s.f45488a.getValue()).booleanValue() && this.f45988n == null) {
            w("selected paymentmethod is null");
            return;
        }
        pg.k kVar = this.f45994t;
        kVar.getClass();
        mv.d.x((ImageView) kVar.f34930d, new y(this, 0));
        pg.k kVar2 = this.f45994t;
        kVar2.getClass();
        mv.d.x((ImageView) kVar2.f34931e, new y(this, 1));
        s0 s0VarB2 = B();
        av.e eVar = (av.e) s0VarB2.f8397n.getValue();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        eVar.e(viewLifecycleOwner, this.f45999y);
        ((androidx.lifecycle.k0) s0VarB2.f8396m.getValue()).e(getViewLifecycleOwner(), this.f45995u);
        if (requireArguments().getBoolean("resumePaymentFlow", false)) {
            ResumePaymentData resumePaymentData = (ResumePaymentData) v80.f0.E(kotlin.coroutines.g.f26549a, new h0(B(), cVar, 1));
            if (resumePaymentData != null && !requireActivity().isFinishing() && this.f45989o == null) {
                A().q(resumePaymentData.getSelectedPaymentMethods());
                A().S = true;
                if (resumePaymentData.isMultiItem()) {
                    aj.c basketCheckoutData = resumePaymentData.getBasketCheckoutData();
                    if (basketCheckoutData != null) {
                        cj.q qVarA = A();
                        qVarA.f8331a.d(basketCheckoutData, "BASKET_CHECKOUT_DATA");
                        qVarA.S = false;
                    }
                } else {
                    String strM194getItemIdRWxzYZM = resumePaymentData.m194getItemIdRWxzYZM();
                    if (strM194getItemIdRWxzYZM != null) {
                        cj.q qVarA2 = A();
                        v80.f0.E(kotlin.coroutines.g.f26549a, new cj.o(qVarA2, strM194getItemIdRWxzYZM, cVar, 1));
                        qVarA2.S = false;
                    }
                }
                Bundle bundle2 = new Bundle();
                PaymentType paymentType = resumePaymentData.getSelectedPaymentMethods().getPaymentType();
                paymentType.getClass();
                bundle2.putInt("logo", paymentType.getLargeIconRes());
                bundle2.putInt("name", paymentType.getTitleResId());
                String strM195getOrderIdreIZeYA = resumePaymentData.m195getOrderIdreIZeYA();
                strM195getOrderIdreIZeYA.getClass();
                bundle2.putParcelable("orderId", OrderId.m209boximpl(strM195getOrderIdreIZeYA));
                b1 b1Var = new b1();
                b1Var.setArguments(bundle2);
                this.f45989o = b1Var;
                b1Var.show(getChildFragmentManager(), "waitingThirdParty");
                s0 s0VarB3 = B();
                c1 c1Var = s0VarB3.f8385a;
                c1Var.d(Boolean.TRUE, "resumePolling");
                String strM196getPaymentIdTaD0F3M = resumePaymentData.m196getPaymentIdTaD0F3M();
                c1Var.d(strM196getPaymentIdTaD0F3M != null ? PaymentId.m233boximpl(strM196getPaymentIdTaD0F3M) : null, "paymentId");
                s0VarB3.f8401r = resumePaymentData.getSelectedPaymentMethods();
                s0VarB3.f8395k = true;
                s0VarB3.f8392h = v80.f0.B(m1.d(s0VarB3), null, null, new al.n(resumePaymentData, s0VarB3, cVar, 8), 3);
            }
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnShowListener(new h(this, 1));
        }
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) throws Throwable {
        BasicItemInformation information;
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            x70.c cVar = null;
            if (A().f8334b0) {
                aj.c cVarD = A().d();
                if (cVarD != null) {
                    cj.q qVarA = A();
                    qVarA.f8331a.d(cVarD, "BASKET_CHECKOUT_DATA");
                    qVarA.S = false;
                }
            } else {
                BasicItem basicItemF = A().f();
                if (basicItemF != null && (information = basicItemF.getInformation()) != null) {
                    String strMo340getItemIdFvU5WIY = information.mo340getItemIdFvU5WIY();
                    if (!A().S) {
                        cj.q qVarA2 = A();
                        strMo340getItemIdFvU5WIY.getClass();
                        v80.f0.E(kotlin.coroutines.g.f26549a, new cj.o(qVarA2, strMo340getItemIdFvU5WIY, cVar, 1));
                        qVarA2.S = false;
                    }
                }
            }
            Boolean bool = (Boolean) B().f8385a.a("paidHasBeenCalled");
            if (!(bool != null ? bool.booleanValue() : false) || A().h() == null) {
                return;
            }
            b2 b2Var = B().f8393i;
            if (b2Var != null) {
                b2Var.a(null);
            }
            if (!B().f8403t.isEmpty()) {
                s0 s0VarB = B();
                String strH = A().h();
                strH.getClass();
                s0VarB.t(strH);
                return;
            }
            String strG = B().g();
            if (strG != null) {
                String strM241unboximpl = PaymentId.m233boximpl(strG).m241unboximpl();
                s0 s0VarB2 = B();
                String strH2 = A().h();
                strH2.getClass();
                strM241unboximpl.getClass();
                s0VarB2.i(strM241unboximpl, strH2);
            }
        }
    }

    public final void s(StoredPaymentMethod storedPaymentMethod, boolean z11, Environment environment) {
        x xVar = new x(this, 3);
        try {
            o0 o0VarRequireActivity = requireActivity();
            o0VarRequireActivity.getClass();
            try {
                CardComponent cardComponentA = new bj.n(o0VarRequireActivity, storedPaymentMethod, z11, environment, xVar, this).a(y());
                Q();
                M(PaymentType.CREDITCARD.getTitleResId());
                pg.k kVar = this.f45994t;
                kVar.getClass();
                AdyenComponentView adyenComponentView = (AdyenComponentView) kVar.f34929c;
                LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                adyenComponentView.attach(cardComponentA, viewLifecycleOwner);
            } catch (CheckoutException e5) {
                e = e5;
                sa0.a.f38953a.e(e, e0.f.k("CurrencyCode == ", y().getCurrency()), new Object[0]);
            }
        } catch (CheckoutException e11) {
            e = e11;
        }
    }

    public final void t(String str, boolean z11) {
        zi.e eVar;
        String strH;
        s0 s0VarB = B();
        if ((s0VarB.g() == null ? false : ((Boolean) v80.f0.E(kotlin.coroutines.g.f26549a, new l0(s0VarB, null))).booleanValue()) && (strH = A().h()) != null) {
            H(strH);
            return;
        }
        zi.e eVar2 = this.f45983h;
        if (eVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paymentCallbacks");
            eVar = null;
        } else {
            eVar = eVar2;
        }
        boolean z12 = A().f8334b0;
        BasicItem basicItemF = A().f();
        aj.c cVarD = A().d();
        String strJ = B().j();
        if (strJ == null) {
            strJ = AppConstants.RETURN_URL_ITEMVIEW_ADYEN;
        }
        eVar.k(z12, basicItemF, cVarD, z11, strJ);
        if (str != null) {
            cv.b bVar = B().f8388d;
            cv.i iVar = cv.i.DEBUG_CHECKOUT_FAILED;
            Pair[] pairArr = (Pair[]) Arrays.copyOf(new Pair[]{new Pair(dv.a.CHECKOUT_ERROR_CAUSE, new dv.c(aj.d.ORDER_ABORTED + " :" + str))}, 1);
            dv.b bVar2 = new dv.b();
            x0.i(bVar2.f15174a, pairArr);
            bVar.c(iVar, bVar2);
        }
        dismiss();
    }

    public final void w(String str) {
        dismissAllowingStateLoss();
        u(this, "Generic error -> ".concat(str), 1);
        Toast.makeText(requireContext(), R.string.generic_err_undefined_error, 0).show();
    }

    public final AdyenActionComponents x() {
        return (AdyenActionComponents) this.f45992r.getValue();
    }

    public final Amount y() {
        Price priceC = C();
        return new Amount(priceC != null ? priceC.getCurrency() : null, C() != null ? r2.getMinorUnits() : 0L);
    }

    public final String z() {
        if (A().f8334b0) {
            return "MANUFACTURER";
        }
        BasicItem basicItemF = A().f();
        if (basicItemF != null) {
            return basicItemF.getItemType().name();
        }
        return null;
    }
}
