package rs;

import b4.t;
import bn.z;
import cn.w;
import cn.x;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.specialrewards.SpecialReward;
import com.app.tgtg.model.remote.voucher.AddVoucherState;
import com.app.tgtg.model.remote.voucher.BasicVoucher;
import com.app.tgtg.model.remote.voucher.CountryBasedVoucher;
import com.app.tgtg.model.remote.voucher.CurrencyBasedVoucher;
import com.app.tgtg.model.remote.voucher.DiscountVoucher;
import com.app.tgtg.model.remote.voucher.UnknownVoucher;
import com.app.tgtg.model.remote.voucher.VoucherMode;
import com.app.tgtg.model.remote.voucher.VoucherState;
import com.app.tgtg.model.remote.voucher.response.AddNewVoucherResponse;
import com.app.tgtg.model.remote.voucher.response.VoucherType;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.h2;
import d2.i2;
import d2.m2;
import d2.n1;
import d2.y;
import g3.r9;
import g3.s0;
import g3.u;
import g3.v;
import g3.v3;
import g3.w6;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.b1;
import m3.g1;
import m3.s;
import m3.w1;
import m5.u0;
import mv.p0;
import o00.x0;
import o30.e0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import ss.c1;
import ss.j1;
import v80.b0;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u3.d f38204a = new u3.d(new qm.a(21), false, -2133221215);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u3.d f38205b = new u3.d(new qm.a(22), false, 1554424757);

    public static final void a(w6 w6Var, VoucherMode voucherMode, t5.a aVar, Function0 function0, AddNewVoucherResponse addNewVoucherResponse, String str, boolean z11, m3.n nVar, int i11) {
        s sVar;
        int i12;
        int i13;
        int i14;
        Function0 function02;
        w6Var.getClass();
        voucherMode.getClass();
        aVar.getClass();
        function0.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(-1570403441);
        int i15 = i11 | (sVar2.f(w6Var) ? 4 : 2) | (sVar2.d(voucherMode.ordinal()) ? 32 : 16) | (sVar2.f(aVar) ? 256 : 128) | (sVar2.h(addNewVoucherResponse) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar2.f(str) ? 131072 : 65536) | (sVar2.g(z11) ? 1048576 : 524288);
        if (sVar2.R(i15 & 1, (599187 & i15) != 599186)) {
            x60.k kVar = (x60.k) sVar2.j(PantryThemeKt.getLocalPantryRadius());
            x60.h hVar = (x60.h) sVar2.j(PantryThemeKt.getLocalPantryColor());
            x60.m mVar = (x60.m) sVar2.j(PantryThemeKt.getLocalPantrySpacing());
            x60.j jVar = (x60.j) sVar2.j(PantryThemeKt.getLocalPantryTypography());
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w("");
                sVar2.k0(objM);
            }
            b1 b1Var = (b1) objM;
            Object objM2 = sVar2.M();
            if (objM2 == fVar) {
                objM2 = m3.i.o(kotlin.coroutines.g.f26549a, sVar2);
                sVar2.k0(objM2);
            }
            b0 b0Var = (b0) objM2;
            AddVoucherState state = addNewVoucherResponse != null ? addNewVoucherResponse.getState() : null;
            switch (state == null ? -1 : e.$EnumSwitchMapping$0[state.ordinal()]) {
                case 2:
                    i12 = R.string.voucher_add_error_expired_voucher;
                    i13 = i12;
                    break;
                case 3:
                case 4:
                case 5:
                    i12 = R.string.voucher_add_error_no_seats_voucher;
                    i13 = i12;
                    break;
                case 6:
                    i12 = addNewVoucherResponse.getType() == VoucherType.USER_REFERRAL ? R.string.voucher_add_error_user_referral_not_eligible : R.string.voucher_add_error_user_not_eligible;
                    i13 = i12;
                    break;
                case 7:
                    i12 = addNewVoucherResponse.getType() == VoucherType.USER_REFERRAL ? R.string.voucher_add_error_user_referral_already_redeemed : R.string.voucher_add_error_already_used;
                    i13 = i12;
                    break;
                case 8:
                    i14 = R.string.voucher_add_error_invalid_voucher;
                    i13 = i14;
                    break;
                case 9:
                    i14 = R.string.voucher_add_error_user_referral_same_device;
                    i13 = i14;
                    break;
                case 10:
                    i14 = R.string.generic_err_undefined_error;
                    i13 = i14;
                    break;
                default:
                    i13 = 0;
                    break;
            }
            if (str != null) {
                b1Var.setValue(str);
            }
            float f11 = kVar.f43977a;
            l2.f fVarC = l2.g.c(f11, f11, 0.0f, 0.0f, 12);
            long j9 = hVar.f43905a;
            boolean z12 = (i15 & 896) == 256;
            Object objM3 = sVar2.M();
            if (z12 || objM3 == fVar) {
                function02 = function0;
                objM3 = new qw.b(11, aVar, function02);
                sVar2.k0(objM3);
            } else {
                function02 = function0;
            }
            sVar = sVar2;
            v3.a((Function0) objM3, null, w6Var, 0.0f, false, fVarC, j9, 0L, 0.0f, 0L, null, null, null, u3.e.e(611949809, sVar2, new a(mVar, jVar, hVar, z11, kVar, i13, aVar, voucherMode, b0Var, w6Var, function02, b1Var)), sVar, (i15 << 6) & 896, 3078, 7066);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new k3.k(w6Var, voucherMode, aVar, function0, addNewVoucherResponse, str, z11, i11);
        }
    }

    public static final void b(w6 w6Var, t5.a aVar, Function0 function0, AddNewVoucherResponse addNewVoucherResponse, String str, boolean z11, m3.n nVar, int i11) {
        s sVar;
        int i12;
        int i13;
        int i14;
        Function0 function02;
        w6Var.getClass();
        aVar.getClass();
        function0.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(-1061847416);
        int i15 = i11 | (sVar2.f(w6Var) ? 4 : 2) | (sVar2.f(aVar) ? 32 : 16) | (sVar2.h(addNewVoucherResponse) ? NewHope.SENDB_BYTES : 1024) | (sVar2.f(str) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar2.g(z11) ? 131072 : 65536);
        if (sVar2.R(i15 & 1, (i15 & 74899) != 74898)) {
            x60.k kVar = (x60.k) sVar2.j(PantryThemeKt.getLocalPantryRadius());
            x60.h hVar = (x60.h) sVar2.j(PantryThemeKt.getLocalPantryColor());
            x60.m mVar = (x60.m) sVar2.j(PantryThemeKt.getLocalPantrySpacing());
            x60.j jVar = (x60.j) sVar2.j(PantryThemeKt.getLocalPantryTypography());
            x60.l lVar = (x60.l) sVar2.j(PantryThemeKt.getLocalPantrySize());
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w("");
                sVar2.k0(objM);
            }
            b1 b1Var = (b1) objM;
            Object objM2 = sVar2.M();
            if (objM2 == fVar) {
                objM2 = m3.i.o(kotlin.coroutines.g.f26549a, sVar2);
                sVar2.k0(objM2);
            }
            b0 b0Var = (b0) objM2;
            AddVoucherState state = addNewVoucherResponse != null ? addNewVoucherResponse.getState() : null;
            switch (state == null ? -1 : f.$EnumSwitchMapping$0[state.ordinal()]) {
                case 2:
                    i12 = R.string.voucher_add_error_expired_voucher;
                    i13 = i12;
                    break;
                case 3:
                case 4:
                case 5:
                    i12 = R.string.voucher_add_error_no_seats_voucher;
                    i13 = i12;
                    break;
                case 6:
                    i12 = addNewVoucherResponse.getType() == VoucherType.USER_REFERRAL ? R.string.voucher_add_error_user_referral_not_eligible : R.string.voucher_add_error_user_not_eligible;
                    i13 = i12;
                    break;
                case 7:
                    i12 = addNewVoucherResponse.getType() == VoucherType.USER_REFERRAL ? R.string.voucher_add_error_user_referral_already_redeemed : R.string.voucher_add_error_already_used;
                    i13 = i12;
                    break;
                case 8:
                    i14 = R.string.voucher_add_error_invalid_voucher;
                    i13 = i14;
                    break;
                case 9:
                    i14 = R.string.voucher_add_error_user_referral_same_device;
                    i13 = i14;
                    break;
                case 10:
                    i14 = R.string.generic_err_undefined_error;
                    i13 = i14;
                    break;
                default:
                    i13 = 0;
                    break;
            }
            if (str != null) {
                b1Var.setValue(str);
            }
            l2.f fVarB = l2.g.b(kVar.f43983g);
            long j9 = hVar.f43905a;
            t tVarZ = d2.c.z(b4.q.f5711a, mVar.f44015k);
            boolean z12 = (i15 & 112) == 32;
            Object objM3 = sVar2.M();
            if (z12 || objM3 == fVar) {
                function02 = function0;
                objM3 = new qw.b(13, aVar, function02);
                sVar2.k0(objM3);
            } else {
                function02 = function0;
            }
            sVar = sVar2;
            v3.a((Function0) objM3, tVarZ, w6Var, 0.0f, false, fVarB, j9, 0L, 0.0f, 0L, null, new qm.a(19), null, u3.e.e(1904261994, sVar2, new a(mVar, z11, kVar, hVar, i13, lVar, aVar, jVar, b0Var, w6Var, function02, b1Var)), sVar, (i15 << 6) & 896, 3078, 5016);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new w(w6Var, aVar, function0, addNewVoucherResponse, str, z11, i11);
        }
    }

    public static final void c(final j1 j1Var, final Function0 function0, m3.n nVar, final int i11) {
        int i12;
        final j1 j1Var2;
        final Function0 function02;
        String strC;
        j1Var.getClass();
        BasicVoucher basicVoucher = j1Var.f39193a;
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(-2051799360);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(j1Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(function0) ? 32 : 16;
        }
        if (!sVar.R(i12 & 1, (i12 & 19) != 18)) {
            j1Var2 = j1Var;
            function02 = function0;
            sVar.U();
        } else {
            if (basicVoucher instanceof UnknownVoucher) {
                w1 w1VarS = sVar.s();
                if (w1VarS != null) {
                    final int i13 = 0;
                    w1VarS.f29476d = new Function2() { // from class: rs.g
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i14 = i13;
                            m3.n nVar2 = (m3.n) obj;
                            ((Integer) obj2).intValue();
                            switch (i14) {
                                case 0:
                                    k.c(j1Var, function0, nVar2, m3.i.F(i11 | 1));
                                    break;
                                default:
                                    k.c(j1Var, function0, nVar2, m3.i.F(i11 | 1));
                                    break;
                            }
                            return Unit.f26487a;
                        }
                    };
                    return;
                }
                return;
            }
            x60.h hVar = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            x60.j jVar = (x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            String countryId = basicVoucher.getCountryId();
            if (countryId == null) {
                sVar.a0(820162456);
                sVar.q(false);
                strC = null;
            } else {
                sVar.a0(820162457);
                strC = d70.a.c(countryId, sVar);
                sVar.q(false);
            }
            j1Var2 = j1Var;
            function02 = function0;
            ex.i.b(function02, null, u3.e.e(1497882377, sVar, new z(mVar, jVar, hVar, j1Var2, strC, function0)), sVar, ((i12 >> 3) & 14) | MLKEMEngine.KyberPolyBytes, 2);
        }
        w1 w1VarS2 = sVar.s();
        if (w1VarS2 != null) {
            final int i14 = 1;
            w1VarS2.f29476d = new Function2() { // from class: rs.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i142 = i14;
                    m3.n nVar2 = (m3.n) obj;
                    ((Integer) obj2).intValue();
                    switch (i142) {
                        case 0:
                            k.c(j1Var2, function02, nVar2, m3.i.F(i11 | 1));
                            break;
                        default:
                            k.c(j1Var2, function02, nVar2, m3.i.F(i11 | 1));
                            break;
                    }
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final void d(final c1 c1Var, Function0 function0, m3.n nVar, final int i11) {
        s sVar;
        w1 w1VarS;
        Function2 function2;
        final Function0 function02 = function0;
        c1Var.getClass();
        BasicVoucher basicVoucher = c1Var.f39144a;
        function02.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(1305362460);
        int i12 = (sVar2.h(c1Var) ? 4 : 2) | i11;
        if (!sVar2.R(i12 & 1, (i12 & 19) != 18)) {
            sVar = sVar2;
            sVar.U();
        } else {
            if (basicVoucher instanceof UnknownVoucher) {
                w1VarS = sVar2.s();
                if (w1VarS != null) {
                    final int i13 = 0;
                    function2 = new Function2(c1Var, function02, i11, i13) { // from class: rs.i

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f38198a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ c1 f38199b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ Function0 f38200c;

                        {
                            this.f38198a = i13;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i14 = this.f38198a;
                            m3.n nVar2 = (m3.n) obj;
                            ((Integer) obj2).getClass();
                            switch (i14) {
                                case 0:
                                    k.d(this.f38199b, this.f38200c, nVar2, m3.i.F(49));
                                    break;
                                default:
                                    k.d(this.f38199b, this.f38200c, nVar2, m3.i.F(49));
                                    break;
                            }
                            return Unit.f26487a;
                        }
                    };
                    w1VarS.f29476d = function2;
                }
                return;
            }
            x60.h hVar = (x60.h) sVar2.j(PantryThemeKt.getLocalPantryColor());
            x60.m mVar = (x60.m) sVar2.j(PantryThemeKt.getLocalPantrySpacing());
            x60.j jVar = (x60.j) sVar2.j(PantryThemeKt.getLocalPantryTypography());
            x60.k kVar = (x60.k) sVar2.j(PantryThemeKt.getLocalPantryRadius());
            x60.l lVar = (x60.l) sVar2.j(PantryThemeKt.getLocalPantrySize());
            String strC = null;
            w6 w6VarF = v3.f(6, 2, null, sVar2);
            Object objM = sVar2.M();
            if (objM == m3.m.f29332a) {
                objM = m3.i.o(kotlin.coroutines.g.f26549a, sVar2);
                sVar2.k0(objM);
            }
            b0 b0Var = (b0) objM;
            String countryId = basicVoucher.getCountryId();
            if (countryId == null) {
                sVar2.a0(1419717564);
                sVar2.q(false);
            } else {
                sVar2.a0(1419717565);
                strC = d70.a.c(countryId, sVar2);
                sVar2.q(false);
            }
            String str = strC;
            sVar = sVar2;
            function02 = function0;
            v3.a(function02, d2.c.z(b4.q.f5711a, mVar.f44015k), w6VarF, 0.0f, false, l2.g.b(kVar.f43983g), hVar.f43905a, 0L, 0.0f, 0L, null, new qm.a(20), null, u3.e.e(878462974, sVar2, new ni.b(mVar, jVar, hVar, c1Var, str, lVar, kVar, b0Var, w6VarF, function0)), sVar, 6, 3078, 5016);
        }
        w1VarS = sVar.s();
        if (w1VarS != null) {
            final int i14 = 1;
            function2 = new Function2(c1Var, function02, i11, i14) { // from class: rs.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f38198a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c1 f38199b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Function0 f38200c;

                {
                    this.f38198a = i14;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i142 = this.f38198a;
                    m3.n nVar2 = (m3.n) obj;
                    ((Integer) obj2).getClass();
                    switch (i142) {
                        case 0:
                            k.d(this.f38199b, this.f38200c, nVar2, m3.i.F(49));
                            break;
                        default:
                            k.d(this.f38199b, this.f38200c, nVar2, m3.i.F(49));
                            break;
                    }
                    return Unit.f26487a;
                }
            };
            w1VarS.f29476d = function2;
        }
    }

    public static final void e(CountryBasedVoucher countryBasedVoucher, Function1 function1, m3.n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(1246628598);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(countryBasedVoucher) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(function1) ? 32 : 16;
        }
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            x60.j jVar = (x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            x60.h hVar = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            l2.f fVarB = l2.g.b(((x60.k) sVar.j(PantryThemeKt.getLocalPantryRadius())).f43977a);
            u uVarP = s0.p(hVar.f43905a, sVar, 0);
            v vVarQ = s0.q(2, 0.0f, 0.0f, 0.0f, 62);
            t tVarD = m2.d(b4.q.f5711a, 1.0f);
            boolean zH = sVar.h(countryBasedVoucher) | ((i12 & 112) == 32);
            Object objM = sVar.M();
            if (zH || objM == m3.m.f29332a) {
                objM = new qw.b(17, function1, countryBasedVoucher);
                sVar.k0(objM);
            }
            s0.b(androidx.compose.foundation.b.c(tVarD, false, null, null, (Function0) objM, 15), fVarB, uVarP, vVarQ, null, u3.e.e(494561348, sVar, new x(19, mVar, countryBasedVoucher, jVar, hVar)), sVar, 196608, 16);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.x(countryBasedVoucher, function1, i11, 26);
        }
    }

    public static final void f(CurrencyBasedVoucher currencyBasedVoucher, Function1 function1, m3.n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(-387941626);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(currencyBasedVoucher) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(function1) ? 32 : 16;
        }
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            x60.j jVar = (x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            x60.h hVar = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            l2.f fVarB = l2.g.b(((x60.k) sVar.j(PantryThemeKt.getLocalPantryRadius())).f43977a);
            u uVarP = s0.p(hVar.f43905a, sVar, 0);
            v vVarQ = s0.q(2, 0.0f, 0.0f, 0.0f, 62);
            t tVarD = m2.d(b4.q.f5711a, 1.0f);
            boolean zH = sVar.h(currencyBasedVoucher) | ((i12 & 112) == 32);
            Object objM = sVar.M();
            if (zH || objM == m3.m.f29332a) {
                objM = new qw.b(18, function1, currencyBasedVoucher);
                sVar.k0(objM);
            }
            s0.b(androidx.compose.foundation.b.c(tVarD, false, null, null, (Function0) objM, 15), fVarB, uVarP, vVarQ, null, u3.e.e(-1570063148, sVar, new x(20, mVar, currencyBasedVoucher, jVar, hVar)), sVar, 196608, 16);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.x(currencyBasedVoucher, function1, i11, 27);
        }
    }

    public static final void g(t tVar, int i11, int i12, String str, Function2 function2, m3.n nVar, int i13) {
        int i14;
        Function2 function22;
        x60.j jVar;
        u0 u0Var;
        int i15 = i12;
        s sVar = (s) nVar;
        sVar.c0(1520727562);
        if ((i13 & 6) == 0) {
            i14 = (sVar.f(tVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= sVar.d(i11) ? 32 : 16;
        }
        if ((i13 & MLKEMEngine.KyberPolyBytes) == 0) {
            i14 |= sVar.d(i15) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= sVar.f(str) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i13 & 24576) == 0) {
            i14 |= sVar.h(function2) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if (sVar.R(i14 & 1, (i14 & 9363) != 9362)) {
            x60.h hVar = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            x60.j jVar2 = (x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVar, sVar);
            b5.j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(i2VarA, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            float f11 = ((x60.l) sVar.j(PantryThemeKt.getLocalPantrySize())).f43994f;
            b4.q qVar = b4.q.f5711a;
            int i16 = i14;
            v1.n.d(x0.z(i11, sVar, (i16 >> 3) & 14), null, d2.c.z(v1.n.j(m2.m(qVar, f11), hVar.f43913e, l2.g.f26790a), mVar.l), null, null, 0.0f, null, sVar, 56, 120);
            d2.c.f(m2.m(qVar, mVar.f44015k), sVar);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            n1 n1Var = new n1(1.0f, true);
            y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = b4.a.c(n1Var, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            i15 = i12;
            String strU = f0.U(sVar, i15);
            if (str == null) {
                jVar = jVar2;
                u0Var = jVar.f43958g;
            } else {
                jVar = jVar2;
                u0Var = jVar.f43960i;
            }
            r9.d(strU, null, hVar.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, 0, 0, 131066);
            sVar = sVar;
            if (str == null) {
                sVar.a0(-1593445420);
                sVar.q(false);
            } else {
                sVar.a0(-1593445419);
                r9.d(str, null, hVar.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43958g, sVar, 0, 0, 131066);
                sVar = sVar;
                sVar.q(false);
            }
            sVar.q(true);
            if (function2 == null) {
                sVar.a0(-1865629549);
                sVar.q(false);
                function22 = function2;
            } else {
                sVar.a0(355460398);
                function22 = function2;
                a0.w((i16 >> 12) & 14, function22, sVar, false);
            }
            sVar.q(true);
        } else {
            function22 = function2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new q(tVar, i11, i15, str, function22, i13, 0);
        }
    }

    public static final void h(t tVar, int i11, int i12, String str, Function2 function2, m3.n nVar, int i13) {
        int i14;
        Function2 function22;
        x60.j jVar;
        u0 u0Var;
        x60.h hVar;
        long j9;
        boolean z11;
        s sVar = (s) nVar;
        sVar.c0(1022668544);
        if ((i13 & 6) == 0) {
            i14 = (sVar.f(tVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= sVar.d(i11) ? 32 : 16;
        }
        if ((i13 & MLKEMEngine.KyberPolyBytes) == 0) {
            i14 |= sVar.d(i12) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= sVar.f(str) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i13 & 24576) == 0) {
            i14 |= sVar.h(function2) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if (sVar.R(i14 & 1, (i14 & 9363) != 9362)) {
            x60.h hVar2 = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            x60.j jVar2 = (x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            x60.l lVar = (x60.l) sVar.j(PantryThemeKt.getLocalPantrySize());
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVar, sVar);
            b5.j.R.getClass();
            b5.h hVar3 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar3);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(i2VarA, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            float f11 = mVar.l;
            b4.q qVar = b4.q.f5711a;
            int i15 = i14;
            v1.n.d(x0.z(i11, sVar, (i14 >> 3) & 14), null, m2.m(d2.c.z(qVar, f11), lVar.f43995g), null, null, 0.0f, null, sVar, 56, 120);
            d2.c.f(m2.m(qVar, mVar.f44017n), sVar);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            n1 n1Var = new n1(1.0f, true);
            y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = b4.a.c(n1Var, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar3);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            String strU = f0.U(sVar, i12);
            if (str == null) {
                jVar = jVar2;
                u0Var = jVar.f43966p;
            } else {
                jVar = jVar2;
                u0Var = jVar.f43967q;
            }
            u0 u0Var2 = u0Var;
            if (str == null) {
                hVar = hVar2;
                j9 = hVar.J;
            } else {
                hVar = hVar2;
                j9 = hVar.K;
            }
            r9.d(strU, null, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var2, sVar, 0, 0, 131066);
            sVar = sVar;
            if (str == null) {
                sVar.a0(-2143544295);
                sVar.q(false);
                z11 = false;
            } else {
                sVar.a0(-2143544294);
                d2.c.f(m2.m(qVar, mVar.l), sVar);
                u0 u0Var3 = jVar.f43966p;
                z11 = false;
                r9.d(str, null, hVar.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var3, sVar, 0, 0, 131066);
                sVar = sVar;
                sVar.q(false);
            }
            sVar.q(true);
            if (function2 == null) {
                sVar.a0(944364381);
                sVar.q(z11);
                function22 = function2;
            } else {
                sVar.a0(1000294692);
                function22 = function2;
                a0.w((i15 >> 12) & 14, function22, sVar, z11);
            }
            sVar.q(true);
        } else {
            function22 = function2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new q(tVar, i11, i12, str, function22, i13, 1);
        }
    }

    public static final void i(DiscountVoucher discountVoucher, Function1 function1, m3.n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(-59621365);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(discountVoucher) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(function1) ? 32 : 16;
        }
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            x60.j jVar = (x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            x60.h hVar = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            l2.f fVarB = l2.g.b(((x60.k) sVar.j(PantryThemeKt.getLocalPantryRadius())).f43977a);
            u uVarP = s0.p(hVar.f43905a, sVar, 0);
            v vVarQ = s0.q(2, 0.0f, 0.0f, 0.0f, 62);
            t tVarD = m2.d(b4.q.f5711a, 1.0f);
            boolean zH = sVar.h(discountVoucher) | ((i12 & 112) == 32);
            Object objM = sVar.M();
            if (zH || objM == m3.m.f29332a) {
                objM = new qw.b(16, function1, discountVoucher);
                sVar.k0(objM);
            }
            s0.b(androidx.compose.foundation.b.c(tVarD, false, null, null, (Function0) objM, 15), fVarB, uVarP, vVarQ, null, u3.e.e(-1203923587, sVar, new x(18, mVar, discountVoucher, jVar, hVar)), sVar, 196608, 16);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.x(discountVoucher, function1, i11, 25);
        }
    }

    public static final void j(VoucherMode voucherMode, Function0 function0, m3.n nVar, int i11) {
        Function0 function02;
        int i12;
        voucherMode.getClass();
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(434434859);
        int i13 = i11 | (sVar.d(voucherMode.ordinal()) ? 4 : 2);
        if (sVar.R(i13 & 1, (i13 & 19) != 18)) {
            x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            x60.h hVar = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            l2.f fVarB = l2.g.b(((x60.k) sVar.j(PantryThemeKt.getLocalPantryRadius())).f43977a);
            float f11 = mVar.f44015k;
            float f12 = mVar.f44021r;
            b4.q qVar = b4.q.f5711a;
            t tVarK = v1.n.k(v1.n.j(d2.c.D(qVar, 0.0f, f11, 0.0f, 0.0f, 13), hVar.f43907b, fVarB), ((x60.a) sVar.j(PantryThemeKt.getLocalPantryBorder())).f43898e, hVar.f43922i0, fVarB);
            float f13 = mVar.f44014j;
            t tVarC = d2.c.C(tVarK, f12, f13, f12, f13);
            y yVarA = d2.w.a(d2.i.f13805e, b4.d.f5695n, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC2 = b4.a.c(tVarC, sVar);
            b5.j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC2, b5.i.f5841d, sVar);
            r9.d(f0.U(sVar, voucherMode.getActiveEmptyStateDescription()), null, hVar.J, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, ((x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography())).f43957f, sVar, 0, 0, 130042);
            sVar = sVar;
            d2.c.f(m2.m(qVar, mVar.f44015k), sVar);
            v1.n.d(x0.z(R.drawable.voucher_icon, sVar, 0), null, null, null, null, 0.0f, null, sVar, 56, 124);
            d2.c.f(m2.m(qVar, f12), sVar);
            t tVarD = m2.d(qVar, 1.0f);
            String strU = f0.U(sVar, R.string.payment_methods_add_voucher_button);
            Integer numValueOf = Integer.valueOf(R.drawable.icon_add);
            Object objM = sVar.M();
            if (objM == m3.m.f29332a) {
                function02 = function0;
                objM = new rr.a(5, function02);
                sVar.k0(objM);
            } else {
                function02 = function0;
            }
            v0.n.l(tVarD, strU, null, null, null, false, false, numValueOf, null, (Function0) objM, sVar, 6, 380);
            i12 = 1;
            sVar.q(true);
        } else {
            function02 = function0;
            i12 = 1;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new j(voucherMode, function02, i11, i12);
        }
    }

    public static final void k(final SpecialReward specialReward, final boolean z11, final t5.a aVar, m3.n nVar, int i11) {
        s sVar;
        w6 w6Var;
        Object vVar;
        Boolean bool;
        int i12;
        specialReward.getClass();
        aVar.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(-800919992);
        int i13 = i11 | (sVar2.f(specialReward) ? 4 : 2) | (sVar2.g(z11) ? 32 : 16) | (sVar2.f(aVar) ? 256 : 128);
        if (sVar2.R(i13 & 1, (i13 & 147) != 146)) {
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.o(kotlin.coroutines.g.f26549a, sVar2);
                sVar2.k0(objM);
            }
            final b0 b0Var = (b0) objM;
            w6 w6VarF = v3.f(6, 2, null, sVar2);
            Boolean boolValueOf = Boolean.valueOf(z11);
            int i14 = i13 & 896;
            boolean zF = ((i13 & 112) == 32) | sVar2.f(w6VarF) | (i14 == 256);
            Object objM2 = sVar2.M();
            if (zF || objM2 == fVar) {
                w6Var = w6VarF;
                bool = boolValueOf;
                i12 = i14;
                vVar = new b0.v(z11, w6Var, aVar, (x70.c) null, 7);
                sVar2.k0(vVar);
            } else {
                w6Var = w6VarF;
                i12 = i14;
                vVar = objM2;
                bool = boolValueOf;
            }
            m3.i.h(bool, (Function2) vVar, sVar2);
            boolean z12 = (i13 & 14) == 4;
            Object objM3 = sVar2.M();
            if (z12 || objM3 == fVar) {
                objM3 = e0.f.w(ns.e.valueOf(specialReward.getStatus()) == ns.e.CLAIMED, sVar2);
            }
            final b1 b1Var = (b1) objM3;
            Object objM4 = sVar2.M();
            if (objM4 == fVar) {
                objM4 = new g1(100.0f);
                sVar2.k0(objM4);
            }
            final g1 g1Var = (g1) objM4;
            final le.p pVarD = e0.D(new le.q("reward_collection_confirmed.json"), sVar2, 6);
            l2.f fVarC = l2.g.c(e0.s(sVar2, R.dimen.profile_card_corner_radius), e0.s(sVar2, R.dimen.profile_card_corner_radius), 0.0f, 0.0f, 12);
            long j9 = lv.s.J;
            boolean z13 = i12 == 256;
            Object objM5 = sVar2.M();
            if (z13 || objM5 == fVar) {
                objM5 = new l(0, aVar);
                sVar2.k0(objM5);
            }
            final w6 w6Var2 = w6Var;
            sVar = sVar2;
            v3.a((Function0) objM5, null, w6Var2, 0.0f, false, fVarC, j9, 0L, 0.0f, 0L, null, null, null, u3.e.e(-352803802, sVar2, new i80.n() { // from class: rs.m
                /* JADX WARN: Removed duplicated region for block: B:31:0x00f6  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x0122  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x0126  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x016c  */
                /* JADX WARN: Removed duplicated region for block: B:67:0x0398  */
                @Override // i80.n
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r32, java.lang.Object r33, java.lang.Object r34) {
                    /*
                        Method dump skipped, instruction units count: 1027
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: rs.m.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }), sVar, 1572864, 3072, 8090);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.d(specialReward, z11, aVar, i11, 12);
        }
    }

    public static final void l(VoucherMode voucherMode, Function0 function0, m3.n nVar, int i11) {
        Function0 function02;
        voucherMode.getClass();
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(-1180674249);
        int i12 = (sVar.d(voucherMode.ordinal()) ? 4 : 2) | i11 | (sVar.h(function0) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            function02 = function0;
            s0.n(function02, null, false, null, null, null, null, u3.e.e(-1639693542, sVar, new a3.m2(voucherMode, 26)), sVar, ((i12 >> 3) & 14) | 805306368, 510);
        } else {
            function02 = function0;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new j(voucherMode, function02, i11, 0);
        }
    }

    public static final void m(int i11, int i12, String str, Function0 function0, m3.n nVar, int i13, int i14) {
        String str2;
        int i15;
        Function0 function02;
        int i16;
        String str3;
        Function0 function03;
        s sVar = (s) nVar;
        sVar.c0(1084265556);
        int i17 = i13 | (sVar.d(i11) ? 4 : 2) | (sVar.d(i12) ? 32 : 16);
        int i18 = i14 & 4;
        if (i18 != 0) {
            i15 = i17 | MLKEMEngine.KyberPolyBytes;
            str2 = str;
        } else {
            str2 = str;
            i15 = i17 | (sVar.f(str2) ? 256 : 128);
        }
        int i19 = i14 & 8;
        if (i19 != 0) {
            i16 = i15 | 3072;
            function02 = function0;
        } else {
            function02 = function0;
            i16 = i15 | (sVar.h(function02) ? 2048 : 1024);
        }
        if (sVar.R(i16 & 1, (i16 & 1171) != 1170)) {
            String str4 = i18 != 0 ? null : str2;
            Function0 function04 = i19 == 0 ? function02 : null;
            t tVarB = d2.c.B(m2.d(b4.q.f5711a, 1.0f), 0.0f, ((x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing())).l, 1);
            j5.j jVar = new j5.j(0);
            boolean z11 = (i16 & 7168) == 2048;
            Object objM = sVar.M();
            if (z11 || objM == m3.m.f29332a) {
                objM = new rr.a(6, function04);
                sVar.k0(objM);
            }
            int i21 = i16 << 3;
            g(androidx.compose.foundation.b.c(tVarB, false, null, jVar, (Function0) objM, 11), i11, i12, str4, u3.e.e(-445538517, sVar, new cg.z(22, function04)), sVar, (i21 & 7168) | (i21 & 112) | 24576 | (i21 & 896));
            function03 = function04;
            str3 = str4;
        } else {
            sVar.U();
            str3 = str2;
            function03 = function02;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new p(i11, i12, str3, function03, i13, i14, 0);
        }
    }

    public static final void n(int i11, int i12, String str, Function0 function0, m3.n nVar, int i13, int i14) {
        String str2;
        int i15;
        Function0 function02;
        int i16;
        String str3;
        Function0 function03;
        s sVar = (s) nVar;
        sVar.c0(-613145856);
        int i17 = i13 | (sVar.d(i11) ? 4 : 2) | (sVar.d(i12) ? 32 : 16);
        int i18 = i14 & 4;
        if (i18 != 0) {
            i15 = i17 | MLKEMEngine.KyberPolyBytes;
            str2 = str;
        } else {
            str2 = str;
            i15 = i17 | (sVar.f(str2) ? 256 : 128);
        }
        int i19 = i14 & 8;
        if (i19 != 0) {
            i16 = i15 | 3072;
            function02 = function0;
        } else {
            function02 = function0;
            i16 = i15 | (sVar.h(function02) ? 2048 : 1024);
        }
        if (sVar.R(i16 & 1, (i16 & 1171) != 1170)) {
            String str4 = i18 != 0 ? null : str2;
            Function0 function04 = i19 == 0 ? function02 : null;
            t tVarB = d2.c.B(m2.d(b4.q.f5711a, 1.0f), 0.0f, ((x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing())).f44015k, 1);
            j5.j jVar = new j5.j(0);
            boolean z11 = (i16 & 7168) == 2048;
            Object objM = sVar.M();
            if (z11 || objM == m3.m.f29332a) {
                objM = new rr.a(7, function04);
                sVar.k0(objM);
            }
            int i21 = i16 << 3;
            h(androidx.compose.foundation.b.c(tVarB, false, null, jVar, (Function0) objM, 11), i11, i12, str4, u3.e.e(2077383767, sVar, new cg.z(23, function04)), sVar, (i21 & 7168) | (i21 & 112) | 24576 | (i21 & 896));
            function03 = function04;
            str3 = str4;
        } else {
            sVar.U();
            str3 = str2;
            function03 = function02;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new p(i11, i12, str3, function03, i13, i14, 1);
        }
    }

    public static final void o(boolean z11, t tVar, m3.n nVar, int i11) {
        t tVar2;
        s sVar = (s) nVar;
        sVar.c0(498043415);
        int i12 = i11 | 48;
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            x60.h hVar = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            x60.j jVar = (x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            x60.k kVar = (x60.k) sVar.j(PantryThemeKt.getLocalPantryRadius());
            b4.q qVar = b4.q.f5711a;
            t tVarD = m2.d(qVar, 1.0f);
            float f11 = mVar.f44007c;
            t tVarB = d2.c.B(tVarD, 0.0f, f11, 1);
            y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5695n, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarB, sVar);
            b5.j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
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
            t tVarD2 = d2.c.D(d2.c.B(v1.n.j(m2.d(qVar, 1.0f), hVar.H, l2.g.b(kVar.f43983g)), mVar.f44014j, 0.0f, 2), 0.0f, mVar.f44013i, 0.0f, 0.0f, 13);
            z4.u0 u0VarD = d2.p.d(b4.d.f5687e, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = b4.a.c(tVarD2, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            v1.n.d(x0.z(R.drawable.voucher_card_empty_state, sVar, 0), null, null, null, null, 0.0f, null, sVar, 56, 124);
            sVar.q(true);
            d2.c.f(m2.m(qVar, f11), sVar);
            tVar2 = qVar;
            r9.d(f0.U(sVar, z11 ? R.string.voucher_experience_empty_special_rewards_title : R.string.voucher_experience_empty_discounts_title), d2.c.B(qVar, f11, 0.0f, 2), hVar.J, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, jVar.f43954c, sVar, 0, 0, 130040);
            d2.c.f(m2.m(tVar2, mVar.f44016m), sVar);
            r9.d(f0.U(sVar, z11 ? R.string.voucher_experience_empty_special_rewards_body : R.string.voucher_experience_empty_discounts_body), d2.c.B(tVar2, f11, 0.0f, 2), hVar.K, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, jVar.f43958g, sVar, 0, 0, 130040);
            sVar = sVar;
            sVar.q(true);
        } else {
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new an.b(z11, tVar2, i11, 10);
        }
    }

    public static final void p(t tVar, List list, Function2 function2, m3.n nVar, int i11, int i12) {
        int i13;
        list.getClass();
        function2.getClass();
        s sVar = (s) nVar;
        sVar.c0(1866216926);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else {
            i13 = i11 | (sVar.f(tVar) ? 4 : 2);
        }
        int i15 = i13 | (sVar.h(list) ? 32 : 16) | (sVar.h(function2) ? 256 : 128);
        if (sVar.R(i15 & 1, (i15 & 147) != 146)) {
            if (i14 != 0) {
                tVar = b4.q.f5711a;
            }
            x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            d2.b bVar = d2.i.f13801a;
            y yVarA = d2.w.a(d2.i.g(mVar.f44014j), b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVar, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
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
            s0.g(null, mVar.f44019p, i4.v.f23314g, sVar, MLKEMEngine.KyberPolyBytes, 1);
            sVar.a0(-1831374122);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                BasicVoucher basicVoucher = (BasicVoucher) it.next();
                boolean zF = ((i15 & 896) == 256) | sVar.f(basicVoucher);
                Object objM = sVar.M();
                if (zF || objM == m3.m.f29332a) {
                    objM = new qw.b(15, function2, basicVoucher);
                    sVar.k0(objM);
                }
                a.a.l(basicVoucher, (Function0) objM, sVar, 0);
            }
            sVar.q(false);
            s0.g(null, mVar.f44019p, i4.v.f23314g, sVar, MLKEMEngine.KyberPolyBytes, 1);
            sVar.q(true);
        } else {
            sVar.U();
        }
        t tVar2 = tVar;
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a3.a(tVar2, list, function2, i11, i12, 17);
        }
    }

    public static final void q(n1 n1Var, List list, Function1 function1, m3.n nVar, int i11) {
        list.getClass();
        function1.getClass();
        s sVar = (s) nVar;
        sVar.c0(2054324957);
        int i12 = (sVar.f(n1Var) ? 4 : 2) | i11 | (sVar.h(list) ? 32 : 16) | (sVar.h(function1) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            t tVarR = v1.n.r(n1Var, v1.n.q(sVar), true);
            y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarR, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
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
            sVar.a0(-308163863);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                BasicVoucher basicVoucher = (BasicVoucher) it.next();
                float f11 = mVar.f44016m;
                b4.q qVar = b4.q.f5711a;
                d2.c.f(m2.m(qVar, f11), sVar);
                if (basicVoucher instanceof CurrencyBasedVoucher) {
                    sVar.a0(1915268781);
                    f((CurrencyBasedVoucher) basicVoucher, function1, sVar, (i12 >> 3) & 112);
                    sVar.q(false);
                } else if (basicVoucher instanceof CountryBasedVoucher) {
                    sVar.a0(1915474094);
                    e((CountryBasedVoucher) basicVoucher, function1, sVar, (i12 >> 3) & 112);
                    sVar.q(false);
                } else if (basicVoucher instanceof DiscountVoucher) {
                    sVar.a0(1915674509);
                    i((DiscountVoucher) basicVoucher, function1, sVar, (i12 >> 3) & 112);
                    sVar.q(false);
                } else {
                    sVar.a0(1915856634);
                    sVar.q(false);
                }
                d2.c.f(m2.m(qVar, mVar.f44016m), sVar);
            }
            sVar.q(false);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new b(n1Var, list, function1, i11, 1);
        }
    }

    public static final String r(BasicVoucher basicVoucher, s sVar) {
        int i11 = r.$EnumSwitchMapping$0[basicVoucher.getState().ordinal()];
        if (i11 == 1) {
            sVar.a0(1878005711);
            String strT = f0.T(basicVoucher.getState().getStateString(), new Object[]{p0.n(basicVoucher.getValidFromUtc())}, sVar);
            sVar.q(false);
            return strT;
        }
        if (i11 != 2) {
            sVar.a0(1878351298);
            sVar.q(false);
            return null;
        }
        sVar.a0(1878189169);
        String strT2 = f0.T(basicVoucher.getState().getStateString(), new Object[]{p0.n(basicVoucher.getValidToUtc())}, sVar);
        sVar.q(false);
        return strT2;
    }

    public static final long s(BasicVoucher basicVoucher, s sVar) {
        x60.h hVar = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
        return (p0.y(basicVoucher.getValidToUtc()) && basicVoucher.getState() == VoucherState.ACTIVE) ? hVar.L : hVar.J;
    }

    public static final u0 t(BasicVoucher basicVoucher, s sVar) {
        x60.j jVar = (x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography());
        return (p0.y(basicVoucher.getValidToUtc()) && basicVoucher.getState() == VoucherState.ACTIVE) ? jVar.f43961j : jVar.f43960i;
    }
}
