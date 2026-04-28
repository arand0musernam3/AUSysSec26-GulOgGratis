package cj;

import a3.h3;
import a3.x1;
import android.app.Application;
import android.content.SharedPreferences;
import androidx.lifecycle.c1;
import androidx.lifecycle.m1;
import ao.g3;
import com.adyen.checkout.components.core.PaymentMethod;
import com.adyen.checkout.components.core.StoredPaymentMethod;
import com.adyen.checkout.core.Environment;
import com.adyen.checkout.core.internal.data.model.ModelObject;
import com.app.tgtg.model.local.BioDataFormat;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.OrderId;
import com.app.tgtg.model.remote.PaymentId;
import com.app.tgtg.model.remote.VoucherId;
import com.app.tgtg.model.remote.manufacturer.request.BasketBriefItem;
import com.app.tgtg.model.remote.order.AuthPayloadType;
import com.app.tgtg.model.remote.order.Authorization;
import com.app.tgtg.model.remote.order.AuthorizationPayload;
import com.app.tgtg.model.remote.order.DiscountPayment;
import com.app.tgtg.model.remote.order.response.PaymentProvider;
import com.app.tgtg.model.remote.order.response.ProviderType;
import com.app.tgtg.model.remote.payment.PaymentMethods;
import com.app.tgtg.model.remote.payment.PaymentMethodsKt;
import com.app.tgtg.model.remote.payment.PaymentType;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.payment.response.BiometricsResponse;
import com.braze.h2;
import d40.t1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.x0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONObject;
import ui.f1;
import ui.g2;
import ui.i1;
import ui.k2;
import ui.m3;
import ui.n2;
import ui.o1;
import ui.r1;
import ui.u1;
import ui.w1;
import v80.b2;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcj/s0;", "Landroidx/lifecycle/b;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPaymentViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentViewModel.kt\ncom/app/tgtg/feature/checkout/viewmodels/PaymentViewModel\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,1519:1\n221#2,2:1520\n221#2,2:1522\n221#2,2:1532\n1586#3:1524\n1661#3,3:1525\n1586#3:1528\n1661#3,3:1529\n1915#3:1534\n1916#3:1536\n1586#3:1537\n1661#3,3:1538\n1#4:1535\n29#5:1541\n*S KotlinDebug\n*F\n+ 1 PaymentViewModel.kt\ncom/app/tgtg/feature/checkout/viewmodels/PaymentViewModel\n*L\n312#1:1520,2\n327#1:1522,2\n435#1:1532,2\n356#1:1524\n356#1:1525,3\n419#1:1528\n419#1:1529,3\n481#1:1534\n481#1:1536\n1489#1:1537\n1489#1:1538,3\n1495#1:1541\n*E\n"})
public final class s0 extends androidx.lifecycle.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f8385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m3 f8386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b70.c f8387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cv.b f8388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final gs.a f8389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g3 f8390f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final at.c0 f8391g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b2 f8392h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b2 f8393i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BiometricsResponse f8394j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f8395k;
    public final u70.t l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u70.t f8396m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final u70.t f8397n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f8398o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f8399p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f8400q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public PaymentMethods f8401r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f8402s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f8403t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f8404u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f8405v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f8406w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f8407x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public t1 f8408y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(Application application, c1 c1Var, m3 m3Var, b70.c cVar, cv.b bVar, gs.a aVar, g3 g3Var, at.c0 c0Var) {
        super(application);
        c1Var.getClass();
        bVar.getClass();
        aVar.getClass();
        g3Var.getClass();
        c0Var.getClass();
        this.f8385a = c1Var;
        this.f8386b = m3Var;
        this.f8387c = cVar;
        this.f8388d = bVar;
        this.f8389e = aVar;
        this.f8390f = g3Var;
        this.f8391g = c0Var;
        this.l = u70.l.b(new cg.e(8));
        this.f8396m = u70.l.b(new aa.e(this, 24));
        this.f8397n = u70.l.b(new cg.e(9));
        this.f8400q = System.currentTimeMillis();
        this.f8403t = new ArrayList();
        this.f8406w = 300000L;
        this.f8407x = true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Path cross not found for [B:103:0x0333, B:67:0x0200], limit reached: 135 */
    /* JADX WARN: Path cross not found for [B:122:0x03d3, B:126:0x03ee], limit reached: 135 */
    /* JADX WARN: Path cross not found for [B:83:0x028b, B:103:0x0333], limit reached: 135 */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x03b0 -> B:33:0x00dc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:133:0x040d -> B:134:0x040e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(cj.s0 r24, java.lang.String r25, z70.c r26) {
        /*
            Method dump skipped, instruction units count: 1094
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cj.s0.a(cj.s0, java.lang.String, z70.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v6 */
    public static void o(s0 s0Var, AuthorizationPayload authorizationPayload, PaymentMethods paymentMethods, String str, Price price, Map map, Map map2, String str2, String str3) {
        String strJ;
        List list;
        s0Var.getClass();
        c1 c1Var = s0Var.f8385a;
        authorizationPayload.getClass();
        paymentMethods.getClass();
        if (str.length() == 0 || (strJ = s0Var.j()) == null || strJ.length() == 0 || paymentMethods.getPaymentProvider() == null) {
            return;
        }
        s0Var.f8405v = false;
        s0Var.f8398o = authorizationPayload.getStorePaymentCard();
        s0Var.f8402s = str;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new Authorization(new AuthorizationPayload((String) null, ((VoucherId) entry.getKey()).m306unboximpl(), false, (String) null, AuthPayloadType.VOUCHER_AUTH_PAYLOAD, (String) null, (String) null, (String) null, (String) null, 493, (DefaultConstructorMarker) null), PaymentProvider.VOUCHER, s0Var.j(), (Price) entry.getValue()));
            }
        }
        if (map2 != null) {
            for (Map.Entry entry2 : map2.entrySet()) {
                arrayList2.add(new DiscountPayment(((VoucherId) entry2.getKey()).m306unboximpl(), (Price) entry2.getValue(), null));
            }
        }
        s0Var.f8404u = !arrayList2.isEmpty();
        arrayList.add(new Authorization(authorizationPayload, paymentMethods.getPaymentProvider(), s0Var.j(), price));
        cv.b bVar = s0Var.f8388d;
        cv.i iVar = cv.i.ACTION_PAYMENT_STARTED;
        dv.a aVar = dv.a.PAYMENT_METHOD;
        PaymentType paymentType = paymentMethods.getPaymentType();
        Pair pair = new Pair(aVar, new dv.c(paymentType != null ? paymentType.name() : null));
        Pair pair2 = new Pair(dv.a.ORDER_ID, new dv.c(str));
        Pair pair3 = new Pair(dv.a.PAYMENT_PROVIDER, new dv.c(paymentMethods.getPaymentProvider().name()));
        Pair pair4 = new Pair(dv.a.IS_SAVED_PAYMENT_METHOD, new dv.c(Boolean.valueOf(s0Var.f8398o)));
        Pair pair5 = new Pair(dv.a.IS_DEFAULT_PAYMENT_METHOD, new dv.c(false));
        dv.a aVar2 = dv.a.ITEM_ID;
        Object objC = "";
        if (Intrinsics.areEqual((Boolean) c1Var.a("isMultiItem"), Boolean.TRUE)) {
            aj.c cVarE = s0Var.e();
            if (cVarE == null || (list = cVarE.f1494a) == null) {
                objC = kotlin.collections.c0.c("");
            } else {
                objC = new ArrayList(kotlin.collections.e0.o(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    objC.add(((BasketBriefItem) it.next()).getItemId());
                }
            }
        } else {
            String strF = s0Var.f();
            if (strF == null) {
                strF = null;
            }
            if (strF != null) {
                objC = strF;
            }
        }
        Pair pair6 = new Pair(aVar2, new dv.c(objC));
        dv.a aVar3 = dv.a.STORE_ID;
        String str4 = s0Var.f8399p;
        if (str4 == null) {
            str4 = null;
        }
        Pair pair7 = new Pair(aVar3, new dv.c(str4));
        Pair pair8 = new Pair(dv.a.ITEM_TYPE, new dv.c(str2));
        Pair pair9 = new Pair(dv.a.PICKUP_WINDOW_START_SECOND, new dv.c(str3));
        Pair pair10 = new Pair(dv.a.SHIPPING_METHOD, new dv.c((String) c1Var.a("shippingId")));
        dv.a aVar4 = dv.a.BASKET_ID;
        aj.c cVarE2 = s0Var.e();
        Map mapE = x0.e(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, new Pair(aVar4, new dv.c(cVarE2 != null ? cVarE2.f1496c : null)), new Pair(dv.a.DISCOUNT_USED, new dv.c(Boolean.valueOf(s0Var.f8404u))));
        dv.b bVar2 = new dv.b();
        bVar2.f15174a.putAll(mapE);
        bVar.c(iVar, bVar2);
        s0Var.f8392h = v80.f0.B(m1.d(s0Var), null, null, new a0(s0Var, str, arrayList, arrayList2, (x70.c) null), 3);
    }

    public static PaymentMethod w(PaymentMethods paymentMethods) {
        paymentMethods.getClass();
        ModelObject.Serializer<PaymentMethod> serializer = PaymentMethod.SERIALIZER;
        String adyenPayload = paymentMethods.getAdyenPayload();
        adyenPayload.getClass();
        return (PaymentMethod) serializer.deserialize(new JSONObject(adyenPayload));
    }

    public final void b(String str) {
        str.getClass();
        v80.f0.B(m1.d(this), null, null, new g0(this, str, null, 0), 3);
    }

    public final void c() {
        v80.f0.B(m1.d(this), null, null, new h0(this, null, 0), 3);
    }

    public final void d() {
        BiometricsResponse biometricsResponse = this.f8394j;
        if (biometricsResponse == null) {
            k().k(new g2(new Exception("BioData is null")));
            return;
        }
        String savedPaymentMethodIdentifier = biometricsResponse.getSavedPaymentMethodIdentifier();
        savedPaymentMethodIdentifier.getClass();
        ArrayList arrayListV = ft.c.v();
        if (!arrayListV.isEmpty()) {
            savedPaymentMethodIdentifier = r8.k.m(CollectionsKt.U(arrayListV, MessageLogView.COMMA_SEPARATOR, null, null, null, 62), MessageLogView.COMMA_SEPARATOR, savedPaymentMethodIdentifier);
        }
        SharedPreferences.Editor editorEdit = ft.c.x().edit();
        String strY = ft.c.y();
        if (strY == null) {
            strY = null;
        }
        editorEdit.putString(strY + "_storeCardNoBio", savedPaymentMethodIdentifier);
        editorEdit.apply();
    }

    public final aj.c e() {
        return (aj.c) this.f8385a.a("basketCheckoutData");
    }

    public final String f() {
        ItemId itemId = (ItemId) this.f8385a.a("itemId");
        if (itemId != null) {
            return itemId.m205unboximpl();
        }
        return null;
    }

    public final String g() {
        PaymentId paymentId = (PaymentId) this.f8385a.a("paymentId");
        if (paymentId != null) {
            return paymentId.m241unboximpl();
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:72|73|253|74|75|251|76|77|249|78) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:(1:263)|154|(1:161)(2:156|(1:158)(1:159))|162|163|247|164|229|230|(0)|233|234|25|(1:27)|239|240) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:40|(9:261|42|(0)(2:46|(7:62|267|63|(5:65|265|66|67|(4:69|241|70|(10:72|73|253|74|75|251|76|77|249|78)(1:106))(1:107))(1:114)|115|(2:117|SW:118)|124)(2:48|(1:60)(2:50|(2:255|52)(1:59))))|230|(2:243|232)|233|234|25|(2:239|240)(3:31|(2:34|35)|37))|150|245|151|152|(16:263|154|(1:161)(2:156|(1:158)(1:159))|162|163|247|164|229|230|(0)|233|234|25|(1:27)|239|240)(12:178|259|179|(2:183|215)(2:184|(3:188|(1:213)(2:190|(1:192)(4:193|194|195|(1:197)(2:204|(1:206))))|214)(2:186|229))|230|(0)|233|234|25|(0)|239|240)) */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0335, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x033a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x033f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0433, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0438, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x043d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c0, code lost:
    
        if (r0 != r8) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0172, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0173, code lost:
    
        r5 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x017a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x017b, code lost:
    
        r5 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0182, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0183, code lost:
    
        r5 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x018a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x018b, code lost:
    
        r19 = r2;
        r10 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0190, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0191, code lost:
    
        r19 = r2;
        r10 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0196, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0197, code lost:
    
        r19 = r2;
        r10 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x019c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x019d, code lost:
    
        r10 = r5;
        r19 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01a1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01a2, code lost:
    
        r10 = r5;
        r19 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01a6, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01a7, code lost:
    
        r10 = r5;
        r19 = r2;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:261:0x00d5, B:150:0x02e3], limit reached: 266 */
    /* JADX WARN: Path cross not found for [B:263:0x02ef, B:178:0x0350], limit reached: 266 */
    /* JADX WARN: Path cross not found for [B:40:0x00c9, B:228:0x0457], limit reached: 266 */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0461 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r12v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:238:0x04ed -> B:25:0x008a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c0 -> B:14:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r21, z70.c r22) {
        /*
            Method dump skipped, instruction units count: 1350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cj.s0.h(java.lang.String, z70.c):java.lang.Object");
    }

    public final void i(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (str2.length() == 0) {
            k().k(new g2(new Exception("OrderId is empty")));
            return;
        }
        this.f8393i = v80.f0.B(m1.d(this), null, null, new j0(new AtomicBoolean(true), this, str, str2, System.currentTimeMillis(), null), 3);
    }

    public final String j() {
        return (String) this.f8385a.a("returnUrl");
    }

    public final androidx.lifecycle.o0 k() {
        return (androidx.lifecycle.o0) this.l.getValue();
    }

    public final void l(PaymentMethods paymentMethods) {
        paymentMethods.getClass();
        androidx.lifecycle.o0 o0VarK = k();
        ModelObject.Serializer<StoredPaymentMethod> serializer = StoredPaymentMethod.SERIALIZER;
        String adyenPayload = paymentMethods.getAdyenPayload();
        adyenPayload.getClass();
        o0VarK.k(new i1((StoredPaymentMethod) serializer.deserialize(new JSONObject(adyenPayload)), paymentMethods.getShowZipcode(), PaymentMethodsKt.getAdyenEnvironment(paymentMethods)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(com.app.tgtg.model.remote.payment.PaymentMethods r9, javax.crypto.Cipher r10, z70.c r11) {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cj.s0.m(com.app.tgtg.model.remote.payment.PaymentMethods, javax.crypto.Cipher, z70.c):java.lang.Object");
    }

    public final void n(Cipher cipher) {
        String savedPaymentMethodIdentifier;
        String biometricsSecret;
        cipher.getClass();
        BiometricsResponse biometricsResponse = this.f8394j;
        if (biometricsResponse == null || (savedPaymentMethodIdentifier = biometricsResponse.getSavedPaymentMethodIdentifier()) == null) {
            h2.b("BioData alias is null");
            return;
        }
        BiometricsResponse biometricsResponse2 = this.f8394j;
        if (biometricsResponse2 == null || (biometricsSecret = biometricsResponse2.getBiometricsSecret()) == null) {
            h2.b("BioData biometricsSecret is null");
            return;
        }
        this.f8387c.getClass();
        b70.a aVarB = b70.c.b(cipher, biometricsSecret);
        String strEncodeAes = BioDataFormat.INSTANCE.encodeAes(aVarB.f6053a, aVarB.f6054b);
        ArrayList arrayListE = ft.c.e();
        String strM = !arrayListE.isEmpty() ? r8.k.m(CollectionsKt.U(arrayListE, MessageLogView.COMMA_SEPARATOR, null, null, null, 62), MessageLogView.COMMA_SEPARATOR, savedPaymentMethodIdentifier) : savedPaymentMethodIdentifier;
        SharedPreferences sharedPreferences = ft.e.f17920a;
        x70.c cVar = null;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("currentLoginData");
            sharedPreferences = null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        String strY = ft.c.y();
        if (strY == null) {
            strY = null;
        }
        editorEdit.putString(strY + "_storeCurrentCardWithBio", strM);
        editorEdit.apply();
        if (!ft.c.w().contains(savedPaymentMethodIdentifier)) {
            ArrayList arrayListW = ft.c.w();
            String strM2 = !arrayListW.isEmpty() ? r8.k.m(CollectionsKt.U(arrayListW, MessageLogView.COMMA_SEPARATOR, null, null, null, 62), MessageLogView.COMMA_SEPARATOR, savedPaymentMethodIdentifier) : savedPaymentMethodIdentifier;
            SharedPreferences.Editor editorEdit2 = ft.c.x().edit();
            String strY2 = ft.c.y();
            if (strY2 == null) {
                strY2 = null;
            }
            editorEdit2.putString(strY2 + "_storeCardWithBio", strM2);
            editorEdit2.apply();
        }
        v80.f0.B(m1.d(this), null, null, new x1(this, savedPaymentMethodIdentifier, strEncodeAes, cVar, 13), 3);
    }

    public final void p(PaymentMethods paymentMethods) {
        paymentMethods.getClass();
        this.f8401r = paymentMethods;
        PaymentProvider paymentProvider = paymentMethods.getPaymentProvider();
        int i11 = paymentProvider == null ? -1 : f0.$EnumSwitchMapping$0[paymentProvider.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                k().k(new u1(paymentMethods));
                return;
            } else if (i11 == 3) {
                k().k(new k2());
                return;
            } else {
                if (i11 != 4) {
                    return;
                }
                k().k(new w1());
            }
        }
        Environment adyenEnvironment = PaymentMethodsKt.getAdyenEnvironment(paymentMethods);
        if (paymentMethods.getProviderType() == ProviderType.ADYEN_SAVED_PAYMENT) {
            if (paymentMethods.getPaymentType() != PaymentType.CREDITCARD) {
                if (paymentMethods.getPaymentType() == PaymentType.BCMCCARD) {
                    k().k(new f1(paymentMethods));
                    return;
                }
                return;
            }
            boolean zI = CollectionsKt.I(ft.c.e(), paymentMethods.getCardIdentifier());
            cv.i iVar = cv.i.DEBUG_ADYEN_BIOMETRICS;
            Pair[] pairArr = (Pair[]) Arrays.copyOf(new Pair[]{new Pair(dv.a.EXISTS, new dv.c(Boolean.valueOf(zI)))}, 1);
            dv.b bVar = new dv.b();
            x0.i(bVar.f15174a, pairArr);
            this.f8388d.c(iVar, bVar);
            Environment adyenEnvironment2 = PaymentMethodsKt.getAdyenEnvironment(paymentMethods);
            if (paymentMethods.getCardIdentifier() != null && ft.c.e().contains(paymentMethods.getCardIdentifier())) {
                k().k(new ui.x(paymentMethods));
                return;
            }
            androidx.lifecycle.o0 o0VarK = k();
            ModelObject.Serializer<StoredPaymentMethod> serializer = StoredPaymentMethod.SERIALIZER;
            String adyenPayload = paymentMethods.getAdyenPayload();
            adyenPayload.getClass();
            o0VarK.k(new i1((StoredPaymentMethod) serializer.deserialize(new JSONObject(adyenPayload)), paymentMethods.getShowZipcode(), adyenEnvironment2));
            return;
        }
        if (paymentMethods.getProviderType() == ProviderType.ADYEN_PAYMENT_METHOD) {
            PaymentType paymentType = paymentMethods.getPaymentType();
            switch (paymentType != null ? f0.$EnumSwitchMapping$1[paymentType.ordinal()] : -1) {
                case 1:
                    k().k(new ui.g0(w(paymentMethods), paymentMethods.getShowZipcode(), adyenEnvironment));
                    break;
                case 2:
                    k().k(new ui.j0(w(paymentMethods), adyenEnvironment));
                    break;
                case 3:
                    k().k(new ui.r(w(paymentMethods), adyenEnvironment));
                    break;
                case 4:
                    androidx.lifecycle.o0 o0VarK2 = k();
                    String adyenPayload2 = paymentMethods.getAdyenPayload();
                    adyenPayload2.getClass();
                    o0VarK2.k(new ui.m0(adyenPayload2));
                    break;
                case 5:
                    androidx.lifecycle.o0 o0VarK3 = k();
                    String adyenPayload3 = paymentMethods.getAdyenPayload();
                    adyenPayload3.getClass();
                    o0VarK3.k(new ui.u(adyenPayload3));
                    break;
                case 6:
                    androidx.lifecycle.o0 o0VarK4 = k();
                    String adyenPayload4 = paymentMethods.getAdyenPayload();
                    adyenPayload4.getClass();
                    o0VarK4.k(new ui.s0(adyenPayload4));
                    break;
                case 7:
                    androidx.lifecycle.o0 o0VarK5 = k();
                    String adyenPayload5 = paymentMethods.getAdyenPayload();
                    adyenPayload5.getClass();
                    o0VarK5.k(new ui.c1(adyenPayload5));
                    break;
                case 8:
                    androidx.lifecycle.o0 o0VarK6 = k();
                    String adyenPayload6 = paymentMethods.getAdyenPayload();
                    adyenPayload6.getClass();
                    o0VarK6.k(new r1(adyenPayload6));
                    break;
                case 9:
                    androidx.lifecycle.o0 o0VarK7 = k();
                    String adyenPayload7 = paymentMethods.getAdyenPayload();
                    adyenPayload7.getClass();
                    o0VarK7.k(new o1(adyenPayload7));
                    break;
                case 10:
                    k().k(new ui.p0(w(paymentMethods), adyenEnvironment));
                    break;
                case 11:
                    k().k(new ui.a0(w(paymentMethods), adyenEnvironment));
                    break;
                case 12:
                    k().k(new ui.d0(w(paymentMethods), adyenEnvironment));
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(com.app.tgtg.model.remote.payment.PaymentMethods r8, z70.c r9) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cj.s0.q(com.app.tgtg.model.remote.payment.PaymentMethods, z70.c):java.lang.Object");
    }

    public final b70.b r() {
        String savedPaymentMethodIdentifier;
        BiometricsResponse biometricsResponse = this.f8394j;
        if (biometricsResponse == null || (savedPaymentMethodIdentifier = biometricsResponse.getSavedPaymentMethodIdentifier()) == null) {
            h2.b("BioData alias is null");
            return null;
        }
        b70.b bVarD = this.f8387c.d(savedPaymentMethodIdentifier);
        if (bVarD.f6056b) {
            cv.i iVar = cv.i.DEBUG_ADYEN_BIOMETRICS;
            Pair[] pairArr = (Pair[]) Arrays.copyOf(new Pair[]{new Pair(dv.a.REASON, new dv.c("OEM auth before init - enrollment"))}, 1);
            dv.b bVar = new dv.b();
            x0.i(bVar.f15174a, pairArr);
            this.f8388d.c(iVar, bVar);
        }
        return bVarD;
    }

    public final void s(String str) {
        BiometricsResponse biometricsResponse = this.f8394j;
        String savedPaymentMethodIdentifier = biometricsResponse != null ? biometricsResponse.getSavedPaymentMethodIdentifier() : null;
        u70.t tVar = this.f8397n;
        if (savedPaymentMethodIdentifier != null) {
            ArrayList arrayListV = ft.c.v();
            BiometricsResponse biometricsResponse2 = this.f8394j;
            biometricsResponse2.getClass();
            if (!CollectionsKt.I(arrayListV, biometricsResponse2.getSavedPaymentMethodIdentifier())) {
                ArrayList arrayListW = ft.c.w();
                BiometricsResponse biometricsResponse3 = this.f8394j;
                biometricsResponse3.getClass();
                if (!CollectionsKt.I(arrayListW, biometricsResponse3.getSavedPaymentMethodIdentifier())) {
                    ((av.e) tVar.getValue()).k(OrderId.m209boximpl(str));
                    return;
                }
            }
        }
        BiometricsResponse biometricsResponse4 = this.f8394j;
        if ((biometricsResponse4 != null ? biometricsResponse4.getSavedPaymentMethodIdentifier() : null) != null) {
            ArrayList arrayListW2 = ft.c.w();
            BiometricsResponse biometricsResponse5 = this.f8394j;
            biometricsResponse5.getClass();
            if (CollectionsKt.I(arrayListW2, biometricsResponse5.getSavedPaymentMethodIdentifier())) {
                PaymentMethods paymentMethods = this.f8401r;
                if ((paymentMethods != null ? paymentMethods.getPaymentProvider() : null) == PaymentProvider.ADYEN) {
                    ((av.e) tVar.getValue()).k(OrderId.m209boximpl(str));
                    return;
                }
                return;
            }
        }
        k().k(new n2(str));
    }

    public final void t(String str) {
        str.getClass();
        v80.f0.B(m1.d(this), null, null, new g0(this, str, null, 1), 3);
    }

    public final void u(long j9, PaymentMethods paymentMethods, String str, String str2, ArrayList arrayList) {
        String strJ = j();
        if (strJ == null || strJ.length() == 0) {
            return;
        }
        c1 c1Var = this.f8385a;
        Boolean bool = (Boolean) c1Var.a("isMultiItem");
        Boolean bool2 = Boolean.TRUE;
        if (!Intrinsics.areEqual(bool, bool2) || e() == null) {
            if (Intrinsics.areEqual((Boolean) c1Var.a("isMultiItem"), bool2) || f() == null) {
                return;
            }
            String strF = f();
            strF.getClass();
            if (strF.length() <= 0) {
                return;
            }
        }
        v80.f0.B(m1.d(this), null, null, new h3(this, j9, paymentMethods, str, str2, arrayList, (x70.c) null), 3);
    }

    public final void v(String str) {
        str.getClass();
        this.f8385a.d(PaymentId.m233boximpl(str), "paymentId");
    }

    public final void x(cv.i iVar, Map map) {
        dv.b bVar;
        iVar.getClass();
        if (map != null) {
            bVar = new dv.b();
            bVar.f15174a.putAll(map);
        } else {
            bVar = null;
        }
        this.f8388d.c(iVar, bVar);
    }
}
