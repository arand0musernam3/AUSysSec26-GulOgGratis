package cj;

import androidx.lifecycle.c1;
import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import ao.g3;
import com.app.tgtg.model.remote.ParcelDeliveryOptionId;
import com.app.tgtg.model.remote.item.Address;
import com.app.tgtg.model.remote.item.PickupCountry;
import com.app.tgtg.model.remote.item.Picture;
import com.app.tgtg.model.remote.item.StoreInformation;
import com.app.tgtg.model.remote.item.StoreLocation;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.ItemType;
import com.app.tgtg.model.remote.manufacturer.response.DeliveryOption;
import com.app.tgtg.model.remote.manufacturer.response.DeliveryOptionMethod;
import com.app.tgtg.model.remote.manufacturer.response.DeliveryOptionsLocal;
import com.app.tgtg.model.remote.manufacturer.response.ParcelMdoCategory;
import com.app.tgtg.model.remote.manufacturer.response.PickupOptionLocal;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.user.requests.UserAddress;
import com.google.android.gms.internal.measurement.cg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ui.m3;
import y80.a2;
import y80.h1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcj/e0;", "Landroidx/lifecycle/l1;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCheckoutParcelViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutParcelViewModel.kt\ncom/app/tgtg/feature/checkout/viewmodels/CheckoutParcelViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,728:1\n777#2:729\n873#2,2:730\n1915#2,2:732\n1807#2,3:734\n296#2,2:738\n296#2,2:740\n1915#2,2:742\n1#3:737\n*S KotlinDebug\n*F\n+ 1 CheckoutParcelViewModel.kt\ncom/app/tgtg/feature/checkout/viewmodels/CheckoutParcelViewModel\n*L\n424#1:729\n424#1:730,2\n458#1:732,2\n475#1:734,3\n615#1:738,2\n618#1:740,2\n627#1:742,2\n*E\n"})
public final class e0 extends l1 {
    public final a2 A;
    public final h1 B;
    public final a2 C;
    public final h1 D;
    public final a2 E;
    public final h1 F;
    public final a2 G;
    public final h1 H;
    public final a2 I;
    public final h1 J;
    public final androidx.lifecycle.o0 K;
    public int L;
    public final u70.t M;
    public String N;
    public DeliveryOptionMethod O;
    public DeliveryOptionMethod P;
    public boolean Q;
    public int R;
    public UserAddress S;
    public nr.a T;
    public boolean U;
    public boolean V;
    public final androidx.lifecycle.o0 W;
    public boolean X;
    public final a2 Y;
    public final h1 Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f8209a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final a2 f8210a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m3 f8211b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final h1 f8212b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g3 f8213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lz.i f8214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final cv.b f8215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final mv.x f8216f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a2 f8217g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h1 f8218h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a2 f8219i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h1 f8220j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a2 f8221k;
    public final h1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a2 f8222m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h1 f8223n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a2 f8224o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h1 f8225p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a2 f8226q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h1 f8227r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a2 f8228s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h1 f8229t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final a2 f8230u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final h1 f8231v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final a2 f8232w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final h1 f8233x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final a2 f8234y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final h1 f8235z;

    public e0(c1 c1Var, m3 m3Var, g3 g3Var, lz.i iVar, cv.b bVar, mv.u uVar, mv.x xVar) {
        c1Var.getClass();
        g3Var.getClass();
        bVar.getClass();
        uVar.getClass();
        xVar.getClass();
        this.f8209a = c1Var;
        this.f8211b = m3Var;
        this.f8213c = g3Var;
        this.f8214d = iVar;
        this.f8215e = bVar;
        this.f8216f = xVar;
        Boolean bool = Boolean.FALSE;
        a2 a2VarC = y80.r.c(bool);
        this.f8217g = a2VarC;
        this.f8218h = new h1(a2VarC);
        a2 a2VarC2 = y80.r.c(null);
        this.f8219i = a2VarC2;
        this.f8220j = new h1(a2VarC2);
        a2 a2VarC3 = y80.r.c(null);
        this.f8221k = a2VarC3;
        this.l = new h1(a2VarC3);
        a2 a2VarC4 = y80.r.c(null);
        this.f8222m = a2VarC4;
        this.f8223n = new h1(a2VarC4);
        a2 a2VarC5 = y80.r.c(null);
        this.f8224o = a2VarC5;
        this.f8225p = new h1(a2VarC5);
        a2 a2VarC6 = y80.r.c(null);
        this.f8226q = a2VarC6;
        this.f8227r = new h1(a2VarC6);
        a2 a2VarC7 = y80.r.c(null);
        this.f8228s = a2VarC7;
        this.f8229t = new h1(a2VarC7);
        a2 a2VarC8 = y80.r.c(bool);
        this.f8230u = a2VarC8;
        this.f8231v = new h1(a2VarC8);
        a2 a2VarC9 = y80.r.c("");
        this.f8232w = a2VarC9;
        this.f8233x = new h1(a2VarC9);
        a2 a2VarC10 = y80.r.c(bool);
        this.f8234y = a2VarC10;
        this.f8235z = new h1(a2VarC10);
        a2 a2VarC11 = y80.r.c(bool);
        this.A = a2VarC11;
        this.B = new h1(a2VarC11);
        a2 a2VarC12 = y80.r.c(bool);
        this.C = a2VarC12;
        this.D = new h1(a2VarC12);
        a2 a2VarC13 = y80.r.c(null);
        this.E = a2VarC13;
        this.F = new h1(a2VarC13);
        a2 a2VarC14 = y80.r.c(null);
        this.G = a2VarC14;
        this.H = new h1(a2VarC14);
        a2 a2VarC15 = y80.r.c(null);
        this.I = a2VarC15;
        this.J = new h1(a2VarC15);
        this.K = new androidx.lifecycle.o0();
        this.L = 1;
        this.M = u70.l.b(new cg.e(7));
        this.W = new androidx.lifecycle.o0(null);
        a2 a2VarC16 = y80.r.c(null);
        this.Y = a2VarC16;
        this.Z = new h1(a2VarC16);
        a2 a2VarC17 = y80.r.c(null);
        this.f8210a0 = a2VarC17;
        this.f8212b0 = new h1(a2VarC17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d2, code lost:
    
        if (kotlin.Unit.f26487a != r2) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(cj.e0 r13, z70.c r14) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cj.e0.a(cj.e0, z70.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cf, code lost:
    
        if (kotlin.Unit.f26487a != r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(cj.e0 r13, z70.c r14) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cj.e0.b(cj.e0, z70.c):java.lang.Object");
    }

    public static PickupOptionLocal f(DeliveryOption deliveryOption) {
        String strP;
        Double distance;
        String deliveryOptionId = deliveryOption.getDeliveryOptionId();
        deliveryOptionId.getClass();
        String strM222constructorimpl = ParcelDeliveryOptionId.m222constructorimpl(deliveryOptionId);
        String title = deliveryOption.getTitle();
        Picture carrierIcon = deliveryOption.getCarrierIcon();
        Price price = deliveryOption.getPrice();
        if (deliveryOption.getExpectedDeliveryTime() != null) {
            strP = mv.p0.p(deliveryOption.getExpectedDeliveryTime() + "Z");
        } else {
            strP = null;
        }
        String strL = deliveryOption.getCutOffTime() != null ? r8.k.l(deliveryOption.getCutOffTime(), "Z") : null;
        DeliveryOptionMethod deliveryMethod = deliveryOption.getDeliveryMethod();
        DeliveryOptionMethod deliveryOptionMethod = DeliveryOptionMethod.PICKUP_POINT;
        return new PickupOptionLocal(strM222constructorimpl, title, carrierIcon, price, strP, strL, (deliveryMethod != deliveryOptionMethod || (distance = deliveryOption.getDistance()) == null) ? null : mv.d.h(distance.doubleValue()), deliveryOption.getDeliveryMethod() == deliveryOptionMethod ? deliveryOption.getAddress() : null, deliveryOption.getDeliveryMethod() == deliveryOptionMethod ? deliveryOption.getOpeningHourPeriod() : null, null);
    }

    public final void c() {
        v80.f0.B(m1.d(this), null, null, new r(this, null, 0), 3);
    }

    public final String d() {
        StoreInformation storeInformationM;
        StoreLocation storeLocation;
        Address address;
        PickupCountry pickupCountry;
        if (e() == null) {
            return this.f8213c.m().getCountryCode();
        }
        BasicItem basicItemE = e();
        String isoCode = (basicItemE == null || (storeInformationM = mv.d.m(basicItemE)) == null || (storeLocation = storeInformationM.getStoreLocation()) == null || (address = storeLocation.getAddress()) == null || (pickupCountry = address.getPickupCountry()) == null) ? null : pickupCountry.getIsoCode();
        return isoCode == null ? "" : isoCode;
    }

    public final BasicItem e() {
        return (BasicItem) this.f8209a.a("ITEM");
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0257, code lost:
    
        if (kotlin.Unit.f26487a == r1) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c2, code lost:
    
        if (kotlin.Unit.f26487a == r1) goto L131;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.app.tgtg.model.remote.manufacturer.response.DeliveryOptionsResponse r14, z70.c r15) {
        /*
            Method dump skipped, instruction units count: 605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cj.e0.g(com.app.tgtg.model.remote.manufacturer.response.DeliveryOptionsResponse, z70.c):java.lang.Object");
    }

    public final Boolean h() {
        if (l()) {
            h1 h1Var = this.l;
            if (h1Var.f45488a.getValue() != null) {
                return Boolean.valueOf(!Intrinsics.areEqual(((UserAddress) h1Var.f45488a.getValue()) != null ? r0.getPostalCode() : null, this.f8233x.f45488a.getValue()));
            }
        }
        return null;
    }

    public final boolean i() {
        Boolean bool = (Boolean) this.f8209a.a("IS_MULTI_ITEM");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean j() {
        if (!l()) {
            return false;
        }
        UserAddress userAddress = (UserAddress) this.l.f45488a.getValue();
        return !Intrinsics.areEqual(userAddress != null ? userAddress.getPostalCode() : null, this.f8233x.f45488a.getValue());
    }

    public final void k(String str, DeliveryOptionMethod deliveryOptionMethod) {
        if (deliveryOptionMethod != null) {
            this.N = deliveryOptionMethod.getTrackingValue();
        }
        x70.c cVar = null;
        if (str != null) {
            v80.f0.B(m1.d(this), null, null, new aa.l0(this, str, cVar, 10), 3);
            ParcelDeliveryOptionId.m221boximpl(str);
        } else {
            this.N = null;
            v80.f0.B(m1.d(this), null, null, new r(this, cVar, 2), 3);
        }
    }

    public final boolean l() {
        BasicItem basicItemE = e();
        return (basicItemE != null ? basicItemE.getItemType() : null) == ItemType.CATERING && this.f8213c.w();
    }

    public final void m(cv.i iVar) {
        iVar.getClass();
        this.f8215e.b(iVar);
    }

    public final void n() {
        ParcelMdoCategory parcelMdoCategory;
        ParcelMdoCategory parcelMdoCategory2;
        List<PickupOptionLocal> mdoPickupOptions;
        List<ParcelMdoCategory> parcelMdoCategories;
        Object next;
        List<ParcelMdoCategory> parcelMdoCategories2;
        Object next2;
        a2 a2Var = this.f8222m;
        DeliveryOptionsLocal deliveryOptionsLocal = (DeliveryOptionsLocal) a2Var.getValue();
        if (deliveryOptionsLocal == null || (parcelMdoCategories2 = deliveryOptionsLocal.getParcelMdoCategories()) == null) {
            parcelMdoCategory = null;
        } else {
            Iterator<T> it = parcelMdoCategories2.iterator();
            while (true) {
                if (it.hasNext()) {
                    next2 = it.next();
                    if (((ParcelMdoCategory) next2).getMdoCategoryType() == DeliveryOptionMethod.PICKUP_POINT) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            parcelMdoCategory = (ParcelMdoCategory) next2;
        }
        DeliveryOptionsLocal deliveryOptionsLocal2 = (DeliveryOptionsLocal) a2Var.getValue();
        if (deliveryOptionsLocal2 == null || (parcelMdoCategories = deliveryOptionsLocal2.getParcelMdoCategories()) == null) {
            parcelMdoCategory2 = null;
        } else {
            Iterator<T> it2 = parcelMdoCategories.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((ParcelMdoCategory) next).getMdoCategoryType() == DeliveryOptionMethod.HOME) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            parcelMdoCategory2 = (ParcelMdoCategory) next;
        }
        ArrayList arrayList = new ArrayList();
        if (cg.q(parcelMdoCategory != null ? parcelMdoCategory.getMdoPickupOptions() : null)) {
            arrayList.add(DeliveryOptionMethod.PICKUP_POINT.getTrackingValue());
        }
        if (cg.q(parcelMdoCategory2 != null ? parcelMdoCategory2.getMdoPickupOptions() : null) && parcelMdoCategory2 != null && (mdoPickupOptions = parcelMdoCategory2.getMdoPickupOptions()) != null) {
            for (PickupOptionLocal pickupOptionLocal : mdoPickupOptions) {
                arrayList.add(DeliveryOptionMethod.HOME.getTrackingValue());
            }
        }
        boolean z11 = true;
        if (!this.Q && (this.R <= 1 || this.N == null)) {
            z11 = false;
        }
        cv.i iVar = cv.i.SCREEN_SHIPPING_METHOD;
        Pair pair = new Pair(dv.a.SHOWN_METHOD, new dv.c(arrayList));
        dv.a aVar = dv.a.PRESELECTED_METHOD;
        DeliveryOptionMethod deliveryOptionMethod = this.P;
        Pair pair2 = new Pair(aVar, new dv.c(deliveryOptionMethod != null ? deliveryOptionMethod.getTrackingValue() : null));
        dv.a aVar2 = dv.a.SELECTED_METHOD;
        DeliveryOptionMethod deliveryOptionMethod2 = this.O;
        dv.b bVarE = h0.g.E(pair, pair2, new Pair(aVar2, new dv.c(deliveryOptionMethod2 != null ? deliveryOptionMethod2.getTrackingValue() : null)), new Pair(dv.a.CHANGE_AVAILABLE, new dv.c(Boolean.valueOf(z11))));
        iVar.getClass();
        this.f8215e.c(iVar, bVarE);
    }

    public final boolean o() {
        if (!this.f8213c.n().getShowDeliveryOptions()) {
            return false;
        }
        BasicItem basicItemE = e();
        return (basicItemE != null ? basicItemE.getItemType() : null) == ItemType.MANUFACTURER || i();
    }
}
