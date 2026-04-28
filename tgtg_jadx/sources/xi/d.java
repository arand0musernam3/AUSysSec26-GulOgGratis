package xi;

import androidx.lifecycle.m1;
import b4.q;
import b4.t;
import b5.h;
import b5.j;
import bn.h0;
import cj.l;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.ParcelDeliveryOptionId;
import com.app.tgtg.model.remote.item.BasicItemInformation;
import com.app.tgtg.model.remote.item.response.AllergensInfo;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.ItemType;
import com.app.tgtg.model.remote.item.response.PackagingOptions;
import com.app.tgtg.model.remote.payment.PaymentMethods;
import com.app.tgtg.model.remote.payment.PaymentType;
import com.app.tgtg.model.remote.payment.PriceSpecification;
import com.app.tgtg.model.remote.user.requests.UserAddress;
import d2.b2;
import d2.h2;
import d2.i;
import d2.i2;
import d2.m2;
import d2.u;
import d2.w;
import d2.y;
import g3.e0;
import g3.p;
import g3.r9;
import g3.s0;
import i4.g0;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.StringsKt;
import lv.v;
import m3.b1;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import m5.l0;
import mv.p0;
import o00.x0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import q5.o;
import r8.k;
import v1.y1;
import vm.r;
import w.a0;
import y80.h1;
import y80.x1;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u3.d f44367a = new u3.d(new tp.a(10), false, 139169908);

    public static final void a(Function0 function0, Function0 function02, BasicItem basicItem, AllergensInfo allergensInfo, boolean z11, Function1 function1, n nVar, int i11, int i12) {
        boolean z12;
        int i13;
        boolean z13;
        char c3;
        boolean z14;
        boolean z15;
        boolean z16;
        char c7;
        BasicItem basicItem2 = basicItem;
        function0.getClass();
        function02.getClass();
        s sVar = (s) nVar;
        sVar.c0(-385346150);
        int i14 = i11 | (sVar.h(function0) ? 4 : 2) | (sVar.h(function02) ? 32 : 16) | (sVar.h(basicItem2) ? 256 : 128) | (sVar.f(allergensInfo) ? NewHope.SENDB_BYTES : 1024);
        int i15 = i12 & 16;
        if (i15 != 0) {
            i13 = i14 | 24576;
            z12 = z11;
        } else {
            z12 = z11;
            i13 = i14 | (sVar.g(z12) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192);
        }
        int i16 = i13 | (sVar.h(function1) ? 131072 : 65536);
        if (sVar.R(i16 & 1, (74899 & i16) != 74898)) {
            boolean z17 = i15 != 0 ? false : z12;
            y1 y1VarQ = v1.n.q(sVar);
            q qVar = q.f5711a;
            t tVarR = v1.n.r(qVar, y1VarQ, true);
            y yVarA = w.a(i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarR, sVar);
            j.R.getClass();
            h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            r9.d(k.f(40, R.string.allergens_popup_header, qVar, sVar, sVar), m2.d(qVar, 1.0f), lv.s.C, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, v.f28271j, sVar, 432, 12582912, 130040);
            int i17 = i16 >> 6;
            int i18 = i17 & 14;
            ArrayList arrayList = new ArrayList();
            if (basicItem2 != null) {
                if (basicItem2.getInformation().isEdible()) {
                    arrayList.add(g.ALLERGENS);
                }
                if (!p0.B(mv.d.l(basicItem2).getIntervalStart()) && basicItem2.getItemType() != ItemType.CATERING) {
                    arrayList.add(g.COLLECTION_INFO);
                }
                if (basicItem2.getInformation().getPackagingOption() == PackagingOptions.MUST_BRING_PACKAGING || basicItem2.getInformation().getPackagingOption() == PackagingOptions.ADDITIONAL_CHARGES_MAY_APPLY || basicItem2.getInformation().getPackagingOption() == PackagingOptions.ADDITIONAL_CHARGES_MANDATED) {
                    arrayList.add(g.PACKAGING_INFO);
                }
            }
            sVar.a0(215352047);
            int i19 = 0;
            for (Object obj : arrayList) {
                int i21 = i19 + 1;
                if (i19 < 0) {
                    d0.n();
                    throw null;
                }
                int i22 = b.$EnumSwitchMapping$0[((g) obj).ordinal()];
                if (i22 != 1) {
                    c3 = 2;
                    if (i22 != 2) {
                        c7 = 3;
                        if (i22 != 3) {
                            throw e0.f.v(sVar, 1559941634, false);
                        }
                        sVar.a0(1559948750);
                        i(basicItem2, sVar, i18);
                        z16 = false;
                        sVar.q(false);
                    } else {
                        z16 = false;
                        c7 = 3;
                        sVar.a0(1559946671);
                        d(basicItem2, sVar, i18);
                        sVar.q(false);
                    }
                    z14 = z16;
                    z15 = z17;
                } else {
                    c3 = 2;
                    sVar.a0(1559943133);
                    z14 = false;
                    boolean z18 = z17;
                    b(allergensInfo, basicItem2, z18, function1, sVar, (i17 & 7168) | ((i16 >> 9) & 14) | ((i16 >> 3) & 112) | (i17 & 896));
                    z15 = z18;
                    sVar.q(false);
                }
                if (i19 != arrayList.size() - 1) {
                    sVar.a0(1113862384);
                    s0.g(null, 1, lv.s.H, sVar, 432, 1);
                    sVar.q(z14);
                } else {
                    sVar.a0(1114007495);
                    sVar.q(z14);
                }
                basicItem2 = basicItem;
                i19 = i21;
                z17 = z15;
            }
            boolean z19 = z17;
            sVar.q(false);
            float f11 = 16;
            float f12 = 44;
            t tVarD = m2.d(m2.b(d2.c.B(qVar, f11, 0.0f, 2), 0.0f, f12, 1), 1.0f);
            l2.f fVarB = l2.g.b(20);
            b2 b2Var = p.f19253a;
            s0.a(function0, tVarD, false, fVarB, p.a(lv.s.f28217b, 0L, 0L, 0L, sVar, 14), null, null, null, null, f44367a, sVar, (i16 & 14) | 805306416, 484);
            d2.c.f(m2.m(qVar, f11), sVar);
            t tVarJ = v1.n.j(m2.d(m2.b(d2.c.D(qVar, 0.0f, 0.0f, 0.0f, f11, 7), 0.0f, f12, 1), 1.0f), i4.v.f23314g, g0.f23254b);
            boolean z21 = (i16 & 112) == 32;
            Object objM = sVar.M();
            if (z21 || objM == m.f29332a) {
                objM = new r(14, function02);
                sVar.k0(objM);
            }
            t tVarF = b3.i.f(b4.d.f5695n, androidx.compose.foundation.b.c(tVarJ, false, null, null, (Function0) objM, 15));
            u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = b4.a.c(tVarF, sVar);
            j.R.getClass();
            h hVar2 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, b5.i.f5843f, sVar);
            m3.i.C(iVarL2, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode2), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC2, b5.i.f5841d, sVar);
            r9.d(f0.U(sVar, R.string.orderview_delegate_accept_invitation_cta_decline), u.f13938a.a(qVar, b4.d.f5687e), lv.s.D, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, sVar, MLKEMEngine.KyberPolyBytes, 0, 262136);
            sVar = sVar;
            sVar.q(true);
            sVar.q(true);
            z13 = z19;
        } else {
            sVar.U();
            z13 = z12;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new e0(function0, function02, basicItem, allergensInfo, z13, function1, i11, i12);
        }
    }

    public static final void b(AllergensInfo allergensInfo, BasicItem basicItem, boolean z11, Function1 function1, n nVar, int i11) {
        int i12;
        boolean z12;
        String strJ;
        s sVar = (s) nVar;
        sVar.c0(1835247577);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(allergensInfo) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(basicItem) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            z12 = z11;
            i12 |= sVar.g(z12) ? 256 : 128;
        } else {
            z12 = z11;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(function1) ? NewHope.SENDB_BYTES : 1024;
        }
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            q qVar = q.f5711a;
            d2.c.f(m2.m(qVar, 24), sVar);
            if (allergensInfo == null || !allergensInfo.getShownOnCheckout() || allergensInfo.getTitle() == null) {
                strJ = (basicItem != null ? basicItem.getItemType() : null) == ItemType.CATERING ? b3.i.j(1372996739, R.string.catering_allergens_popup_title, sVar, sVar, false) : (basicItem == null || !mv.d.p(basicItem)) ? b3.i.j(1373002234, R.string.allergens_popup_title, sVar, sVar, false) : b3.i.j(1372999779, R.string.item_view_description_tab_text, sVar, sVar, false);
            } else {
                sVar.a0(1372994988);
                sVar.q(false);
                strJ = allergensInfo.getTitle();
            }
            r9.d(strJ, d2.c.B(qVar, 40, 0.0f, 2), lv.s.C, 0L, null, 0L, null, new x5.k(5), 0L, 0, false, 0, 0, null, v.f28275o, sVar, 432, 12582912, 130040);
            d2.c.f(m2.m(qVar, 8), sVar);
            h(allergensInfo, basicItem, z12, function1, sVar, i12 & 8190);
            d2.c.f(m2.m(qVar, 20), sVar);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a(allergensInfo, basicItem, z11, function1, i11, 0);
        }
    }

    public static final void c(PriceSpecification priceSpecification, final cj.q qVar, final cj.e0 e0Var, final Function0 function0, Function1 function1, final Function0 function02, final Function0 function03, final Function0 function04, final Function0 function05, final boolean z11, final b1 b1Var, final Function0 function06, final Function2 function2, n nVar, final int i11) {
        Function1 function12;
        PriceSpecification priceSpecification2;
        boolean z12;
        qVar.getClass();
        e0Var.getClass();
        h1 h1Var = e0Var.l;
        function0.getClass();
        function1.getClass();
        function02.getClass();
        function03.getClass();
        function04.getClass();
        function05.getClass();
        b1Var.getClass();
        function06.getClass();
        function2.getClass();
        s sVar = (s) nVar;
        sVar.c0(-633639599);
        int i12 = i11 | (sVar.h(priceSpecification) ? 4 : 2) | (sVar.h(qVar) ? 32 : 16) | (sVar.h(e0Var) ? 256 : 128) | (sVar.h(function0) ? NewHope.SENDB_BYTES : 1024) | (sVar.h(function1) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar.h(function02) ? 131072 : 65536) | (sVar.h(function03) ? 1048576 : 524288) | (sVar.h(function04) ? 8388608 : 4194304) | (sVar.h(function05) ? 67108864 : 33554432) | (sVar.g(z11) ? 536870912 : 268435456);
        int i13 = 6 | (sVar.h(function06) ? 32 : 16) | (sVar.h(function2) ? 256 : 128);
        if (sVar.R(i12 & 1, ((i12 & 306783379) == 306783378 && (i13 & 147) == 146) ? false : true)) {
            y1 y1VarQ = v1.n.q(sVar);
            h1 h1Var2 = e0Var.Z;
            b1 b1VarN = m3.i.n(h1Var, sVar, 0);
            b1 b1VarN2 = m3.i.n(h1Var2, sVar, 0);
            b1 b1VarN3 = m3.i.n(qVar.f8353o, sVar, 0);
            h1 h1Var3 = qVar.E;
            at.w wVar = new at.w(10, new y80.i[]{h1Var, h1Var3, h1Var2, e0Var.f8233x}, new l(qVar, e0Var, null));
            a9.a aVarD = m1.d(qVar);
            x1 x1Var = new x1(5000L, LongCompanionObject.MAX_VALUE);
            int i14 = cj.a.$EnumSwitchMapping$0[qVar.g().ordinal()];
            b1 b1VarN4 = m3.i.n(y80.r.x(wVar, aVarD, x1Var, Boolean.valueOf(i14 == 1 ? h1Var.f45488a.getValue() == null || ((Boolean) h1Var3.f45488a.getValue()).booleanValue() || (e0Var.o() && h1Var2.f45488a.getValue() == null) : i14 == 2 && (h1Var.f45488a.getValue() == null || e0Var.j()))), sVar, 0);
            t tVarR = v1.n.r(m2.f13850c, y1VarQ, true);
            y yVarA = w.a(i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarR, sVar);
            j.R.getClass();
            h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            UserAddress userAddress = (UserAddress) b1VarN.getValue();
            ParcelDeliveryOptionId parcelDeliveryOptionId = (ParcelDeliveryOptionId) b1VarN2.getValue();
            String strM229unboximpl = parcelDeliveryOptionId != null ? parcelDeliveryOptionId.m229unboximpl() : null;
            int i15 = i12 >> 3;
            int i16 = i15 & 14;
            int i17 = i15 & 126;
            int i18 = i12 >> 9;
            int i19 = i13 << 18;
            vi.c.c(qVar, e0Var, userAddress, strM229unboximpl, function0, function05, function04, function06, function2, sVar, (i15 & 3670016) | i17 | ((i12 << 3) & 57344) | (458752 & i18) | (29360128 & i19) | (i19 & 234881024));
            sVar = sVar;
            vi.c.u(qVar, z11, function02, sVar, ((i12 >> 24) & 112) | i16 | (i18 & 896));
            vi.c.x(qVar, sVar, i16);
            vi.c.e(qVar, sVar, i16);
            priceSpecification2 = priceSpecification;
            vi.c.m(priceSpecification2, sVar, i12 & 14);
            function12 = function1;
            vi.k.a(qVar, function12, sVar, (i18 & 112) | i16);
            if (((UserAddress) b1VarN.getValue()) == null || !e0Var.j()) {
                z12 = false;
                sVar.a0(-256686361);
                sVar.q(false);
            } else {
                sVar.a0(-256734411);
                z12 = false;
                wi.a.f(sVar, 0);
                sVar.q(false);
            }
            boolean zBooleanValue = ((Boolean) b1VarN4.getValue()).booleanValue();
            PaymentMethods paymentMethods = (PaymentMethods) b1VarN3.getValue();
            vi.c.b(qVar, e0Var, function03, zBooleanValue, b1Var, ((paymentMethods != null ? paymentMethods.getPaymentType() : null) != PaymentType.GOOGLEPAY || z11) ? z12 : true, sVar, i17 | ((i12 >> 12) & 896) | 24576);
            sVar.q(true);
        } else {
            function12 = function1;
            priceSpecification2 = priceSpecification;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            final PriceSpecification priceSpecification3 = priceSpecification2;
            final Function1 function13 = function12;
            w1VarS.f29476d = new Function2(qVar, e0Var, function0, function13, function02, function03, function04, function05, z11, b1Var, function06, function2, i11) { // from class: xi.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ cj.q f44356b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ cj.e0 f44357c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ Function0 f44358d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ Function1 f44359e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ Function0 f44360f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ Function0 f44361g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ Function0 f44362h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ Function0 f44363i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ boolean f44364j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final /* synthetic */ b1 f44365k;
                public final /* synthetic */ Function0 l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ Function2 f44366m;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iF = m3.i.F(1);
                    d.c(this.f44355a, this.f44356b, this.f44357c, this.f44358d, this.f44359e, this.f44360f, this.f44361g, this.f44362h, this.f44363i, this.f44364j, this.f44365k, this.l, this.f44366m, (n) obj, iF);
                    return Unit.f26487a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(com.app.tgtg.model.remote.item.response.BasicItem r8, m3.n r9, int r10) {
        /*
            r4 = r9
            m3.s r4 = (m3.s) r4
            r9 = 941736035(0x3821c063, float:3.8564565E-5)
            r4.c0(r9)
            r9 = r10 & 6
            r0 = 2
            if (r9 != 0) goto L19
            boolean r9 = r4.h(r8)
            if (r9 == 0) goto L16
            r9 = 4
            goto L17
        L16:
            r9 = r0
        L17:
            r9 = r9 | r10
            goto L1a
        L19:
            r9 = r10
        L1a:
            r1 = r9 & 3
            r6 = 1
            r7 = 0
            if (r1 == r0) goto L22
            r0 = r6
            goto L23
        L22:
            r0 = r7
        L23:
            r9 = r9 & r6
            boolean r9 = r4.R(r9, r0)
            if (r9 == 0) goto La3
            r9 = 0
            if (r8 == 0) goto L38
            com.app.tgtg.model.remote.item.PickupInterval r0 = mv.d.l(r8)
            if (r0 == 0) goto L38
            java.lang.String r0 = r0.getIntervalStart()
            goto L39
        L38:
            r0 = r9
        L39:
            boolean r0 = mv.p0.B(r0)
            if (r0 != 0) goto L99
            if (r8 == 0) goto L46
            com.app.tgtg.model.remote.item.response.ItemType r0 = r8.getItemType()
            goto L47
        L46:
            r0 = r9
        L47:
            com.app.tgtg.model.remote.item.response.ItemType r1 = com.app.tgtg.model.remote.item.response.ItemType.CATERING
            if (r0 == r1) goto L99
            r0 = 531999563(0x1fb5ab4b, float:7.693986E-20)
            r4.a0(r0)
            if (r8 == 0) goto L5e
            com.app.tgtg.model.remote.item.PickupInterval r0 = mv.d.l(r8)
            if (r0 == 0) goto L5e
            java.lang.String r0 = r0.getIntervalStart()
            goto L5f
        L5e:
            r0 = r9
        L5f:
            java.time.format.DateTimeFormatter r1 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE
            java.time.ZonedDateTime r0 = java.time.ZonedDateTime.parse(r0)
            java.lang.String r0 = r0.format(r1)
            r0.getClass()
            if (r8 == 0) goto L78
            com.app.tgtg.model.remote.item.PickupInterval r1 = mv.d.l(r8)
            if (r1 == 0) goto L78
            java.lang.String r9 = r1.getIntervalStart()
        L78:
            long r1 = mv.p0.h(r9)
            long r1 = mv.p0.a(r1, r7)
            java.lang.String r9 = java.lang.String.valueOf(r1)
            java.lang.Object[] r3 = new java.lang.Object[]{r0, r9}
            r5 = 0
            r0 = 2131231928(0x7f0804b8, float:1.807995E38)
            r1 = 2132018438(0x7f140506, float:1.9675183E38)
            r2 = 2132018437(0x7f140505, float:1.967518E38)
            g(r0, r1, r2, r3, r4, r5)
            r4.q(r7)
            goto La6
        L99:
            r9 = 532510815(0x1fbd785f, float:8.024375E-20)
            r4.a0(r9)
            r4.q(r7)
            goto La6
        La3:
            r4.U()
        La6:
            m3.w1 r9 = r4.s()
            if (r9 == 0) goto Lb3
            fg.n r0 = new fg.n
            r0.<init>(r8, r10, r6)
            r9.f29476d = r0
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xi.d.d(com.app.tgtg.model.remote.item.response.BasicItem, m3.n, int):void");
    }

    public static final void e(String str, n nVar, int i11) {
        s sVar;
        str.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(1066101387);
        int i12 = i11 | (sVar2.f(str) ? 4 : 2);
        if (sVar2.R(i12 & 1, (i12 & 3) != 2)) {
            sVar = sVar2;
            r9.d(str, d2.c.B(q.f5711a, 40, 0.0f, 2), lv.s.C, 0L, null, 0L, null, new x5.k(5), 0L, 0, false, 0, 0, null, v.f28274n, sVar, (i12 & 14) | 432, 12582912, 130040);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new h0(str, i11, 7);
        }
    }

    public static final void f(String str, Function1 function1, n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(378498718);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(function1) ? 32 : 16;
        }
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            sVar.a0(-1334947325);
            m5.e eVar = new m5.e();
            String strU = f0.U(sVar, R.string.orderview_delegate_accept_invitation_description_with_url_placeholder);
            String strT = f0.T(R.string.orderview_delegate_accept_invitation_description_with_url, new Object[]{strU}, sVar);
            int iG = StringsKt.G(strT, strU, 0, false, 6);
            int length = strU.length() + iG;
            eVar.c(strT);
            eVar.b(new l0(lv.s.f28215a, 0L, (q5.r) null, (q5.n) null, (o) null, (q5.i) null, (String) null, 0L, (x5.a) null, (x5.p) null, (t5.c) null, 0L, x5.l.f43854c, (i4.u0) null, 61438), iG, length);
            eVar.a("URL", iG, length, str);
            m5.h hVarJ = eVar.j();
            sVar.q(false);
            t tVarD = m2.d(d2.c.B(q.f5711a, 40, 0.0f, 2), 1.0f);
            m5.u0 u0VarA = m5.u0.a(v.f28274n, lv.s.C, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214);
            boolean zF = sVar.f(hVarJ) | ((i12 & 112) == 32);
            Object objM = sVar.M();
            if (zF || objM == m.f29332a) {
                objM = new os.j(hVarJ, function1, 2);
                sVar.k0(objM);
            }
            m2.g0.c(hVarJ, tVarD, u0VarA, false, 0, 0, null, (Function1) objM, sVar, 48, 120);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new po.a(str, function1, i11, 1);
        }
    }

    public static final void g(int i11, int i12, int i13, Object[] objArr, n nVar, int i14) {
        Object[] objArr2;
        String strT;
        s sVar = (s) nVar;
        sVar.c0(-73219135);
        int i15 = i14 | (sVar.d(i11) ? 4 : 2) | (sVar.d(i12) ? 32 : 16) | (sVar.d(i13) ? 256 : 128);
        sVar.Y(-1644109669, Integer.valueOf(objArr.length));
        int i16 = i15 | (sVar.d(objArr.length) ? 2048 : 0);
        for (Object obj : objArr) {
            i16 |= sVar.h(obj) ? 2048 : 0;
        }
        sVar.q(false);
        if ((i16 & 7168) == 0) {
            i16 |= 1024;
        }
        if (sVar.R(i16 & 1, (i16 & 1171) != 1170)) {
            q qVar = q.f5711a;
            t tVarB = d2.c.B(qVar, 40, 0.0f, 2);
            y yVarA = w.a(i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarB, sVar);
            j.R.getClass();
            h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(yVarA, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            float f11 = 20;
            d2.c.f(m2.m(qVar, f11), sVar);
            int i17 = i16;
            i2 i2VarA = h2.a(i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = b4.a.c(qVar, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            t tVarM = m2.m(qVar, 24);
            n4.b bVarZ = x0.z(i11, sVar, i17 & 14);
            long j9 = lv.s.C;
            v1.n.d(bVarZ, null, tVarM, null, null, 0.0f, new i4.o(j9, 5), sVar, 1573304, 56);
            float f12 = 8;
            r9.d(k.f(f12, i12, qVar, sVar, sVar), null, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28275o, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
            sVar.q(true);
            d2.c.f(m2.m(qVar, f12), sVar);
            objArr2 = objArr;
            if (objArr2.length == 0) {
                strT = b3.i.j(-1079039137, i13, sVar, sVar, false);
            } else {
                sVar.a0(-1079112173);
                strT = f0.T(i13, Arrays.copyOf(objArr2, objArr2.length), sVar);
                sVar.q(false);
            }
            r9.d(strT, null, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28274n, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
            sVar = sVar;
            b3.i.y(qVar, f11, sVar, true);
        } else {
            objArr2 = objArr;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new on.i(i11, i12, i13, objArr2, i14, 1);
        }
    }

    public static final void h(AllergensInfo allergensInfo, BasicItem basicItem, boolean z11, Function1 function1, n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(510693101);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(allergensInfo) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(basicItem) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.g(z11) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(function1) ? NewHope.SENDB_BYTES : 1024;
        }
        if (!sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            sVar.U();
        } else if (allergensInfo != null && allergensInfo.getShownOnCheckout() && allergensInfo.getDescription() != null) {
            sVar.a0(1067733231);
            e(allergensInfo.getDescription(), sVar, 0);
            sVar.q(false);
        } else if (allergensInfo == null || !allergensInfo.getShownOnCheckout() || allergensInfo.getUrl() == null) {
            if ((basicItem != null ? basicItem.getItemType() : null) == ItemType.CATERING) {
                sVar.a0(1067741509);
                e(f0.U(sVar, z11 ? R.string.next_day_delivery_allergens_popup_text : R.string.catering_allergens_popup_text), sVar, 0);
                sVar.q(false);
            } else if (basicItem == null || !mv.d.p(basicItem)) {
                sVar.a0(1067756921);
                e(f0.U(sVar, R.string.allergens_popup_text_v2), sVar, 0);
                sVar.q(false);
            } else {
                sVar.a0(1067752425);
                e(f0.U(sVar, R.string.item_view_dine_in_allergens_description), sVar, 0);
                sVar.q(false);
            }
        } else {
            sVar.a0(-1259885755);
            f(allergensInfo.getUrl(), function1, sVar, (i12 >> 6) & 112);
            sVar.q(false);
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a(allergensInfo, basicItem, z11, function1, i11, 1);
        }
    }

    public static final void i(BasicItem basicItem, n nVar, int i11) {
        int i12;
        BasicItemInformation information;
        s sVar = (s) nVar;
        sVar.c0(-949582662);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(basicItem) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            PackagingOptions packagingOption = (basicItem == null || (information = basicItem.getInformation()) == null) ? null : information.getPackagingOption();
            int i13 = packagingOption == null ? -1 : b.$EnumSwitchMapping$1[packagingOption.ordinal()];
            if (i13 == 1) {
                sVar.a0(1932637123);
                g(R.drawable.ic_recycler, R.string.item_view_directions_packaging_alert_header, R.string.item_view_directions_packaging_alert_description, new Object[0], sVar, 0);
                sVar.q(false);
            } else if (i13 == 2) {
                sVar.a0(1932955276);
                g(R.drawable.ic_packaging_fee_info, R.string.item_view_packaging_additional_charge_alert_title, R.string.item_view_packaging_additional_charge_alert_description, new Object[0], sVar, 0);
                sVar.q(false);
            } else if (i13 != 3) {
                sVar.a0(-2015835682);
                sVar.q(false);
            } else {
                sVar.a0(1933295098);
                g(R.drawable.ic_packaging_fee_info, R.string.item_view_packaging_additional_mandated_charge_alert_title, R.string.item_view_packaging_additional_mandated_charge_alert_description, new Object[0], sVar, 0);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new fg.n(basicItem, i11, 2);
        }
    }
}
