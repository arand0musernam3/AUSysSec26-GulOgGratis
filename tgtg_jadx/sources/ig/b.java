package ig;

import com.app.tgtg.R;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.payment.VoucherPaymentInformation;
import com.app.tgtg.model.remote.voucher.BasicVoucher;
import com.app.tgtg.model.remote.voucher.DiscountVoucher;
import com.tgtg.componentlibrary.component.badgelabel.variant.AttentionPantryBadgeLabelKt;
import com.tgtg.componentlibrary.component.badgelabel.variant.BasePantryBadgeLabelKt;
import com.tgtg.componentlibrary.component.badgelabel.variant.NegativePantryBadgeLabelKt;
import com.tgtg.componentlibrary.component.badgelabel.variant.PositivePantryBadgeLabelKt;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import e0.f;
import g3.r9;
import gn.i;
import i9.q;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m3.n;
import m3.s;
import m3.w1;
import m5.e;
import m5.u0;
import mv.p0;
import o30.f0;
import x60.h;
import x60.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u3.d f23827a = new u3.d(new q(3), false, -1015101641);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u3.d f23828b = new u3.d(new q(4), false, 1783638247);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u3.d f23829c = new u3.d(new q(5), false, -770119708);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u3.d f23830d = new u3.d(new q(6), false, -1082840755);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u3.d f23831e = new u3.d(new q(7), false, 2135292552);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final u3.d f23832f = new u3.d(new q(8), false, -349453007);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final u3.d f23833g = new u3.d(new q(9), false, 195465065);

    public static final void a(BasicVoucher basicVoucher, n nVar, int i11) {
        w1 w1VarS;
        hg.a aVar;
        basicVoucher.getClass();
        s sVar = (s) nVar;
        sVar.c0(190144677);
        int i12 = (sVar.f(basicVoucher) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            int i13 = a.$EnumSwitchMapping$0[basicVoucher.getState().ordinal()];
            if (i13 == 1) {
                sVar.a0(-461675998);
                int i14 = p0.i(basicVoucher.getValidToUtc());
                if (i14 > 7) {
                    sVar.q(false);
                    w1VarS = sVar.s();
                    if (w1VarS != null) {
                        aVar = new hg.a(basicVoucher, i11, 5);
                        w1VarS.f29476d = aVar;
                    }
                    return;
                }
                String strT = f0.T(R.string.voucher_badge_active_days_left, new Object[]{Integer.valueOf(i14)}, sVar);
                AttentionPantryBadgeLabelKt.SmallAttentionPantryBadgeLabel(strT, null, strT, f23827a, null, sVar, 3072, 18);
                sVar.q(false);
            } else if (i13 == 2) {
                sVar.a0(-461079403);
                NegativePantryBadgeLabelKt.SmallNegativePantryBadgeLabel(f0.U(sVar, R.string.voucher_badge_expired), null, f0.U(sVar, R.string.voucher_badge_expired), f23828b, null, sVar, 3072, 18);
                sVar.q(false);
            } else if (i13 == 3) {
                sVar.a0(-460596764);
                PositivePantryBadgeLabelKt.SmallPositivePantryBadgeLabel(f0.U(sVar, R.string.voucher_badge_used), null, f0.U(sVar, R.string.voucher_badge_used), f23829c, null, sVar, 3072, 18);
                sVar.q(false);
            } else if (i13 == 4) {
                sVar.a0(-460125223);
                BasePantryBadgeLabelKt.SmallBasePantryBadgeLabel(f0.U(sVar, R.string.voucher_badge_pending), null, f0.U(sVar, R.string.voucher_badge_pending), f23830d, null, sVar, 3072, 18);
                sVar.q(false);
            } else {
                if (i13 != 5) {
                    throw f.v(sVar, -1954555588, false);
                }
                sVar.a0(-459656441);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1VarS = sVar.s();
        if (w1VarS != null) {
            aVar = new hg.a(basicVoucher, i11, 6);
            w1VarS.f29476d = aVar;
        }
    }

    public static final void b(Price price, d dVar, n nVar, int i11) {
        s sVar;
        price.getClass();
        dVar.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(730614361);
        int i12 = (sVar2.f(price) ? 4 : 2) | i11;
        if (sVar2.R(i12 & 1, (i12 & 19) != 18)) {
            j jVar = (j) sVar2.j(PantryThemeKt.getLocalPantryTypography());
            h hVar = (h) sVar2.j(PantryThemeKt.getLocalPantryColor());
            String strI = mv.d.i(price, 1);
            String strValueOf = String.valueOf((int) price.getValue());
            e eVar = new e();
            int iG = StringsKt.G(strI, strValueOf, 0, false, 6);
            int length = strValueOf.length() + iG;
            d dVar2 = d.SMALL;
            u0 u0Var = dVar == dVar2 ? jVar.f43959h : jVar.f43957f;
            u0 u0Var2 = dVar == dVar2 ? jVar.f43953b : jVar.f43952a;
            if (iG != -1) {
                int i13 = eVar.i(u0Var2.f29655a);
                try {
                    eVar.c(strI.substring(0, iG));
                    eVar.c(strValueOf);
                    eVar.g(i13);
                    i13 = eVar.i(u0Var.f29655a);
                    try {
                        eVar.c(strI.substring(length));
                    } finally {
                    }
                } finally {
                }
            } else {
                eVar.c(strI);
            }
            sVar = sVar2;
            r9.e(eVar.j(), null, hVar.J, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, sVar, 0, 0, 524282);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new i(price, dVar, i11, 13);
        }
    }

    public static final void c(DiscountVoucher discountVoucher, d dVar, n nVar, int i11) {
        s sVar;
        s sVar2 = (s) nVar;
        sVar2.c0(1127725733);
        int i12 = (sVar2.h(discountVoucher) ? 4 : 2) | i11;
        if (sVar2.R(i12 & 1, (i12 & 19) != 18)) {
            j jVar = (j) sVar2.j(PantryThemeKt.getLocalPantryTypography());
            h hVar = (h) sVar2.j(PantryThemeKt.getLocalPantryColor());
            String strValueOf = discountVoucher.getDiscountPercentage() != null ? String.valueOf((int) discountVoucher.getDiscountPercentage().doubleValue()) : "-";
            String strT = f0.T(R.string.voucher_discount_value_off_checkout, new Object[]{strValueOf}, sVar2);
            e eVar = new e();
            int iG = StringsKt.G(strT, strValueOf, 0, false, 6);
            int length = strValueOf.length() + iG;
            if (iG != -1) {
                eVar.c(strT.substring(0, iG));
                d dVar2 = d.SMALL;
                int i13 = eVar.i((dVar == dVar2 ? jVar.f43953b : jVar.f43952a).f29655a);
                try {
                    eVar.c(strValueOf);
                    i13 = eVar.i((dVar == dVar2 ? jVar.f43959h : jVar.f43957f).f29655a);
                    try {
                        eVar.c(strT.substring(length));
                    } finally {
                    }
                } finally {
                }
            } else {
                eVar.c(strT);
            }
            sVar = sVar2;
            r9.e(eVar.j(), null, hVar.J, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, sVar, 0, 0, 524282);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new i(discountVoucher, dVar, i11, 12);
        }
    }

    public static final void d(String str, n nVar, int i11) {
        int i12;
        boolean zAreEqual;
        s sVar = (s) nVar;
        sVar.c0(-691020416);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (!sVar.R(i12 & 1, (i12 & 3) != 2)) {
            sVar.U();
        } else {
            if (str == null) {
                w1 w1VarS = sVar.s();
                if (w1VarS != null) {
                    w1VarS.f29476d = new c(str, i11, 0);
                    return;
                }
                return;
            }
            boolean zY = p0.y(str);
            if (StringsKt.H(str)) {
                zAreEqual = false;
            } else {
                Instant instant = Instant.parse(str);
                ZoneOffset zoneOffset = ZoneOffset.UTC;
                zAreEqual = Intrinsics.areEqual(instant.atZone(zoneOffset).toLocalDate(), ZonedDateTime.now(zoneOffset).toLocalDate());
            }
            if (zAreEqual) {
                sVar.a0(-410708847);
                AttentionPantryBadgeLabelKt.SmallAttentionPantryBadgeLabel(f0.U(sVar, R.string.voucher_expire_today_label), null, null, f23831e, null, sVar, 3072, 22);
                sVar.q(false);
            } else if (zY) {
                sVar.a0(-410346085);
                int i13 = p0.i(str);
                AttentionPantryBadgeLabelKt.SmallAttentionPantryBadgeLabel(f0.G(R.plurals.voucher_expire_in_days_label, i13, new Object[]{Integer.valueOf(i13)}, sVar), null, null, f23832f, null, sVar, 3072, 22);
                sVar.q(false);
            } else {
                sVar.a0(-409861803);
                r9.d(f0.T(R.string.voucher_discount_valid_until, new Object[]{p0.n(str)}, sVar), null, ((h) sVar.j(PantryThemeKt.getLocalPantryColor())).K, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((j) sVar.j(PantryThemeKt.getLocalPantryTypography())).f43962k, sVar, 0, 0, 131066);
                sVar = sVar;
                sVar.q(false);
            }
        }
        w1 w1VarS2 = sVar.s();
        if (w1VarS2 != null) {
            w1VarS2.f29476d = new c(str, i11, 1);
        }
    }

    public static final void e(BasicVoucher basicVoucher, n nVar, int i11) {
        basicVoucher.getClass();
        s sVar = (s) nVar;
        sVar.c0(634199620);
        int i12 = (sVar.f(basicVoucher) ? 4 : 2) | i11;
        if (!sVar.R(i12 & 1, (i12 & 3) != 2)) {
            sVar.U();
        } else if (basicVoucher instanceof DiscountVoucher) {
            sVar.a0(-120148391);
            c((DiscountVoucher) basicVoucher, d.LARGE, sVar, (i12 & 14) | 48);
            sVar.q(false);
        } else {
            sVar.a0(-419515032);
            sVar.q(false);
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new hg.a(basicVoucher, i11, 7);
        }
    }

    public static final void f(BasicVoucher basicVoucher, n nVar, int i11) {
        basicVoucher.getClass();
        s sVar = (s) nVar;
        sVar.c0(-832716350);
        int i12 = (sVar.f(basicVoucher) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            String strJ = j(basicVoucher, sVar);
            if (strJ == null) {
                sVar.a0(278399695);
                sVar.q(false);
            } else {
                sVar.a0(278399696);
                BasePantryBadgeLabelKt.MediumBasePantryBadgeLabel(strJ, null, null, null, null, sVar, 0, 30);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new hg.a(basicVoucher, i11, 9);
        }
    }

    public static final void g(BasicVoucher basicVoucher, n nVar, int i11) {
        basicVoucher.getClass();
        s sVar = (s) nVar;
        sVar.c0(197933072);
        int i12 = (sVar.f(basicVoucher) ? 4 : 2) | i11;
        if (!sVar.R(i12 & 1, (i12 & 3) != 2)) {
            sVar.U();
        } else if (basicVoucher instanceof DiscountVoucher) {
            sVar.a0(-365842163);
            c((DiscountVoucher) basicVoucher, d.SMALL, sVar, (i12 & 14) | 48);
            sVar.q(false);
        } else {
            sVar.a0(1235127348);
            sVar.q(false);
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new hg.a(basicVoucher, i11, 8);
        }
    }

    public static final void h(VoucherPaymentInformation voucherPaymentInformation, n nVar, int i11) {
        voucherPaymentInformation.getClass();
        s sVar = (s) nVar;
        sVar.c0(-2223614);
        int i12 = (sVar.f(voucherPaymentInformation) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            BasePantryBadgeLabelKt.SmallBasePantryBadgeLabel(f0.T(R.string.voucher_stacked_usage_label, new Object[]{Integer.valueOf(voucherPaymentInformation.getNumberOfVouchers())}, sVar), null, null, f23833g, null, sVar, 3072, 22);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new hg.e(voucherPaymentInformation, i11);
        }
    }

    public static final void i(BasicVoucher basicVoucher, n nVar, int i11) {
        basicVoucher.getClass();
        s sVar = (s) nVar;
        sVar.c0(-2131286898);
        int i12 = (sVar.f(basicVoucher) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            String strJ = j(basicVoucher, sVar);
            if (strJ == null) {
                sVar.a0(-666360732);
                sVar.q(false);
            } else {
                sVar.a0(-666360731);
                BasePantryBadgeLabelKt.SmallBasePantryBadgeLabel(strJ, null, null, null, null, sVar, 0, 30);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new hg.a(basicVoucher, i11, 10);
        }
    }

    public static final String j(BasicVoucher basicVoucher, n nVar) {
        if (!(basicVoucher instanceof DiscountVoucher)) {
            s sVar = (s) nVar;
            sVar.a0(995514810);
            sVar.q(false);
            return null;
        }
        s sVar2 = (s) nVar;
        sVar2.a0(995301748);
        DiscountVoucher discountVoucher = (DiscountVoucher) basicVoucher;
        String strT = f0.T(R.string.voucher_discount_redemptions_used, new Object[]{Integer.valueOf(discountVoucher.getNumberOfOrdersUsed()), Integer.valueOf(discountVoucher.getNumberOfInitialOrders())}, sVar2);
        sVar2.q(false);
        return strT;
    }
}
