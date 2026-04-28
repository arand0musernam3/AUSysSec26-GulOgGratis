package cj;

import androidx.lifecycle.c1;
import androidx.lifecycle.l1;
import ao.g3;
import com.app.tgtg.model.remote.OrderId;
import com.app.tgtg.model.remote.UserSettings;
import com.app.tgtg.model.remote.item.Address;
import com.app.tgtg.model.remote.item.PickupCountry;
import com.app.tgtg.model.remote.item.StoreInformation;
import com.app.tgtg.model.remote.item.StoreLocation;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.ItemType;
import com.app.tgtg.model.remote.manufacturer.response.BasketPriceSpecificationsResponse;
import com.app.tgtg.model.remote.manufacturer.response.BasketResponse;
import com.app.tgtg.model.remote.manufacturer.response.DeliveryOptionMethod;
import com.app.tgtg.model.remote.order.response.ProviderType;
import com.app.tgtg.model.remote.payment.CardStatus;
import com.app.tgtg.model.remote.payment.ExtendedPriceSpecification;
import com.app.tgtg.model.remote.payment.PaymentMethods;
import com.app.tgtg.model.remote.payment.PaymentType;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.payment.PriceSpecification;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import ui.m3;
import y80.a1;
import y80.a2;
import y80.g1;
import y80.h1;
import y80.m1;
import y80.x1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcj/q;", "Landroidx/lifecycle/l1;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCheckoutOverviewViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutOverviewViewModel.kt\ncom/app/tgtg/feature/checkout/viewmodels/CheckoutOverviewViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1331:1\n777#2:1332\n873#2,2:1333\n777#2:1336\n873#2,2:1337\n777#2:1339\n873#2,2:1340\n1586#2:1342\n1661#2,3:1343\n1642#2,10:1346\n1915#2:1356\n1916#2:1358\n1652#2:1359\n1586#2:1360\n1661#2,3:1361\n1586#2:1364\n1661#2,3:1365\n1#3:1335\n1#3:1357\n*S KotlinDebug\n*F\n+ 1 CheckoutOverviewViewModel.kt\ncom/app/tgtg/feature/checkout/viewmodels/CheckoutOverviewViewModel\n*L\n745#1:1332\n745#1:1333,2\n799#1:1336\n799#1:1337,2\n805#1:1339\n805#1:1340,2\n1132#1:1342\n1132#1:1343,3\n1191#1:1346,10\n1191#1:1356\n1191#1:1358\n1191#1:1359\n1209#1:1360\n1209#1:1361,3\n1265#1:1364\n1265#1:1365,3\n1191#1:1357\n*E\n"})
public final class q extends l1 {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final h8.e f8330j0 = new h8.e("hasPaymentTooltipBeenSeen");
    public final u70.t A;
    public final m1 B;
    public final g1 C;
    public final a2 D;
    public final h1 E;
    public final a2 F;
    public final h1 G;
    public final m1 H;
    public final g1 I;
    public List J;
    public final a2 K;
    public final a2 L;
    public final h1 M;
    public String N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public int T;
    public int U;
    public Integer V;
    public String W;
    public final androidx.lifecycle.o0 X;
    public Boolean Y;
    public final u70.t Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f8331a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public String f8332a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g3 f8333b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f8334b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cv.b f8335c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public BasketPriceSpecificationsResponse f8336c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m3 f8337d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public DeliveryOptionMethod f8338d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final at.c0 f8339e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public List f8340e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d8.f f8341f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public BasketResponse f8342f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a2 f8343g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public List f8344g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h1 f8345h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f8346h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a2 f8347i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public PaymentMethods f8348i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h1 f8349j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a2 f8350k;
    public final a2 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h1 f8351m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a2 f8352n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final h1 f8353o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a2 f8354p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h1 f8355q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a2 f8356r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h1 f8357s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a2 f8358t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final h1 f8359u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ExtendedPriceSpecification f8360v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final a2 f8361w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final h1 f8362x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final m1 f8363y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final g1 f8364z;

    public q(c1 c1Var, g3 g3Var, cv.b bVar, m3 m3Var, at.c0 c0Var, d8.f fVar) {
        c1Var.getClass();
        g3Var.getClass();
        bVar.getClass();
        c0Var.getClass();
        fVar.getClass();
        this.f8331a = c1Var;
        this.f8333b = g3Var;
        this.f8335c = bVar;
        this.f8337d = m3Var;
        this.f8339e = c0Var;
        this.f8341f = fVar;
        Boolean bool = Boolean.FALSE;
        a2 a2VarC = y80.r.c(bool);
        this.f8343g = a2VarC;
        this.f8345h = new h1(a2VarC);
        a2 a2VarC2 = y80.r.c(null);
        this.f8347i = a2VarC2;
        this.f8349j = new h1(a2VarC2);
        this.f8350k = y80.r.c(null);
        kotlin.collections.n0 n0Var = kotlin.collections.n0.f26529a;
        a2 a2VarC3 = y80.r.c(n0Var);
        this.l = a2VarC3;
        this.f8351m = new h1(a2VarC3);
        a2 a2VarC4 = y80.r.c(null);
        this.f8352n = a2VarC4;
        this.f8353o = new h1(a2VarC4);
        a2 a2VarC5 = y80.r.c(aj.m.f1505a);
        this.f8354p = a2VarC5;
        this.f8355q = new h1(a2VarC5);
        a2 a2VarC6 = y80.r.c(bool);
        this.f8356r = a2VarC6;
        this.f8357s = new h1(a2VarC6);
        a2 a2VarC7 = y80.r.c(0);
        this.f8358t = a2VarC7;
        this.f8359u = new h1(a2VarC7);
        a2 a2VarC8 = y80.r.c(null);
        this.f8361w = a2VarC8;
        this.f8362x = new h1(a2VarC8);
        m1 m1VarB = y80.r.b(0, 0, null, 6);
        this.f8363y = m1VarB;
        this.f8364z = new g1(m1VarB);
        this.A = u70.l.b(new cg.e(5));
        m1 m1VarB2 = y80.r.b(0, 0, null, 6);
        this.B = m1VarB2;
        this.C = new g1(m1VarB2);
        a2 a2VarC9 = y80.r.c(bool);
        this.D = a2VarC9;
        this.E = new h1(a2VarC9);
        a2 a2VarC10 = y80.r.c(bool);
        this.F = a2VarC10;
        this.G = new h1(a2VarC10);
        m1 m1VarB3 = y80.r.b(0, 0, null, 7);
        this.H = m1VarB3;
        this.I = new g1(m1VarB3);
        this.J = n0Var;
        a2 a2VarC11 = y80.r.c(n0Var);
        this.K = a2VarC11;
        a2 a2VarC12 = y80.r.c(null);
        this.L = a2VarC12;
        this.M = y80.r.x(new a1(new h1(a2VarC12), new h1(a2VarC11), new ah.j(3, (x70.c) null, 1)), androidx.lifecycle.m1.d(this), new x1(5000L, LongCompanionObject.MAX_VALUE), n0Var);
        this.T = 1;
        this.U = 5;
        this.X = new androidx.lifecycle.o0(null);
        this.Z = u70.l.b(new cg.e(6));
        this.f8344g0 = n0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0116, code lost:
    
        if (kotlin.Unit.f26487a == r8) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011a, code lost:
    
        r0 = r9;
        r2 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01b4, code lost:
    
        if (kotlin.Unit.f26487a != r8) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01b8, code lost:
    
        r0 = r3;
        r2 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01ee, code lost:
    
        if (kotlin.Unit.f26487a == r8) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0258, code lost:
    
        if (kotlin.Unit.f26487a != r8) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x026e, code lost:
    
        if (kotlin.Unit.f26487a == r8) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0287, code lost:
    
        if (kotlin.Unit.f26487a != r8) goto L97;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0238  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(cj.q r16, java.lang.String r17, z70.c r18) {
        /*
            Method dump skipped, instruction units count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cj.q.a(cj.q, java.lang.String, z70.c):java.lang.Object");
    }

    public static void o(q qVar, String str, ct.a aVar, Integer num) {
        qVar.getClass();
        aVar.getClass();
        at.c0.c(qVar.f8339e, str, aVar, num, false, 16);
    }

    public final void b() {
        ((av.e) this.Z.getValue()).i(Boolean.TRUE);
        String strH = h();
        if (strH != null) {
            v80.f0.B(androidx.lifecycle.m1.d(this), null, null, new defpackage.j(this, strH, (x70.c) null, 2), 3);
        }
    }

    public final void c(boolean z11, PaymentMethods paymentMethods, List list) {
        Object next;
        Object next2;
        Object next3;
        list.getClass();
        this.f8346h0 = z11;
        this.f8348i0 = paymentMethods;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next4 = it.next();
            PaymentMethods paymentMethods2 = (PaymentMethods) next4;
            if (paymentMethods2.getProviderType() == ProviderType.EDENRED_SAVED_PAYMENT ? n(paymentMethods2) : true) {
                arrayList.add(next4);
            }
        }
        x70.c cVar = null;
        if (arrayList.isEmpty()) {
            v80.f0.B(androidx.lifecycle.m1.d(this), null, null, new c(this, cVar, 0), 3);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            PaymentMethods paymentMethods3 = (PaymentMethods) obj;
            if ((paymentMethods3.getProviderType() == ProviderType.ADYEN_SAVED_PAYMENT && paymentMethods3.getCardStatus() == CardStatus.ACTIVE) || (paymentMethods3.getProviderType() == ProviderType.EDENRED_SAVED_PAYMENT && n(paymentMethods3))) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((PaymentMethods) next).isPreferred()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        PaymentMethods paymentMethods4 = (PaymentMethods) next;
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
            PaymentMethods paymentMethods5 = (PaymentMethods) next2;
            if (paymentMethods5.isPreferred() && paymentMethods5.getPaymentType() == PaymentType.SATISPAY) {
                break;
            }
        }
        PaymentMethods paymentMethods6 = (PaymentMethods) next2;
        Iterator it4 = arrayList.iterator();
        while (true) {
            if (!it4.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it4.next();
            PaymentMethods paymentMethods7 = (PaymentMethods) next3;
            if (paymentMethods7.isPreferred() && paymentMethods7.getPaymentType() != PaymentType.CREDITCARD) {
                break;
            }
        }
        v80.f0.B(androidx.lifecycle.m1.d(this), null, null, new d(paymentMethods4, this, paymentMethods6, z11, paymentMethods, (PaymentMethods) next3, null), 3);
    }

    public final aj.c d() {
        return (aj.c) this.f8331a.a("BASKET_CHECKOUT_DATA");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f2, code lost:
    
        if (kotlin.Unit.f26487a != r0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013b, code lost:
    
        if (kotlin.Unit.f26487a != r0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b9, code lost:
    
        if (kotlin.Unit.f26487a == r0) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c9 A[PHI: r12 r13
      0x00c9: PHI (r12v4 java.lang.String) = (r12v2 java.lang.String), (r12v11 java.lang.String) binds: [B:45:0x00c5, B:21:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x00c9: PHI (r13v15 java.lang.Object) = (r13v14 java.lang.Object), (r13v1 java.lang.Object) binds: [B:45:0x00c5, B:21:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r12, z70.c r13) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cj.q.e(java.lang.String, z70.c):java.lang.Object");
    }

    public final BasicItem f() {
        return (BasicItem) this.f8331a.a("ITEM");
    }

    public final ItemType g() {
        ItemType itemType;
        if (this.f8334b0) {
            return ItemType.MANUFACTURER;
        }
        BasicItem basicItemF = f();
        return (basicItemF == null || (itemType = basicItemF.getItemType()) == null) ? ItemType.UNKNOWN : itemType;
    }

    public final String h() {
        OrderId orderId = (OrderId) this.f8331a.a("ORDER_ID");
        if (orderId != null) {
            return orderId.m217unboximpl();
        }
        return null;
    }

    public final String i() {
        StoreInformation storeInformationM;
        StoreLocation storeLocation;
        Address address;
        PickupCountry pickupCountry;
        int i11 = a.$EnumSwitchMapping$0[g().ordinal()];
        if (i11 != 1 && i11 != 2) {
            return null;
        }
        if (this.f8334b0) {
            aj.c cVarD = d();
            if (cVarD != null) {
                return cVarD.f1495b;
            }
            return null;
        }
        BasicItem basicItemF = f();
        if (basicItemF == null || (storeInformationM = mv.d.m(basicItemF)) == null || (storeLocation = storeInformationM.getStoreLocation()) == null || (address = storeLocation.getAddress()) == null || (pickupCountry = address.getPickupCountry()) == null) {
            return null;
        }
        return pickupCountry.getIsoCode();
    }

    public final void j() {
        v80.f0.B(androidx.lifecycle.m1.d(this), null, null, new c(this, null, 1), 3);
    }

    public final String k() {
        BasicItem basicItemF = f();
        String str = null;
        ItemType itemType = basicItemF != null ? basicItemF.getItemType() : null;
        int i11 = itemType == null ? -1 : a.$EnumSwitchMapping$0[itemType.ordinal()];
        g3 g3Var = this.f8333b;
        if (i11 == 1) {
            String manufacturerTermsUrl = g3Var.n().getManufacturerTermsUrl();
            return manufacturerTermsUrl == null ? "" : manufacturerTermsUrl;
        }
        if (i11 == 2) {
            UserSettings userSettingsN = g3Var.n();
            String cateringTermsUrl = userSettingsN.getCateringTermsUrl();
            if (cateringTermsUrl != null && !StringsKt.H(cateringTermsUrl)) {
                str = cateringTermsUrl;
            }
            return str == null ? userSettingsN.getTermsUrl() : str;
        }
        if (i11 != 3) {
            return g3Var.n().getTermsUrl();
        }
        String charityTermsUrl = g3Var.n().getCharityTermsUrl();
        if (charityTermsUrl == null || StringsKt.H(charityTermsUrl)) {
            return null;
        }
        return charityTermsUrl;
    }

    public final av.e l() {
        return (av.e) this.A.getValue();
    }

    public final String m() {
        if (this.f8334b0) {
            return "MANUFACTURER";
        }
        BasicItem basicItemF = f();
        if (basicItemF != null) {
            return basicItemF.getItemType().name();
        }
        return null;
    }

    public final boolean n(PaymentMethods paymentMethods) {
        PriceSpecification priceSpecification;
        Price total;
        paymentMethods.getClass();
        Price availableAmount = paymentMethods.getAvailableAmount();
        return (availableAmount == null || (priceSpecification = (PriceSpecification) this.f8347i.getValue()) == null || (total = priceSpecification.getTotal()) == null || !Intrinsics.areEqual(availableAmount.getCurrency(), total.getCurrency()) || availableAmount.getMinorUnits() < total.getMinorUnits()) ? false : true;
    }

    public final void p(boolean z11) {
        v80.f0.B(androidx.lifecycle.m1.d(this), null, null, new c(this, null, 6), 3);
    }

    public final void q(PaymentMethods paymentMethods) {
        paymentMethods.getClass();
        v80.f0.B(androidx.lifecycle.m1.d(this), null, null, new m(1, this, paymentMethods, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r() {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cj.q.r():void");
    }

    public final void s(cv.i iVar, dv.b bVar) {
        iVar.getClass();
        this.f8335c.c(iVar, bVar);
    }

    public final void t() {
        v80.f0.B(androidx.lifecycle.m1.d(this), null, null, new p(this, null), 3);
    }
}
