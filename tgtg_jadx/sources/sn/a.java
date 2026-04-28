package sn;

import a3.t0;
import b4.q;
import b4.t;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.profile.response.LoyaltyCardDetails;
import com.app.tgtg.model.remote.profile.response.ProfileFeature;
import com.app.tgtg.model.remote.profile.response.ProfileFeatureState;
import g3.v3;
import g3.w6;
import i4.q0;
import i4.v;
import java.util.Arrays;
import k3.k;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.StringCompanionObject;
import m3.b1;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import nn.u;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u3.d f39055a = new u3.d(new s60.c(15, (byte) 0), false, -1967015949);

    public static final void a(w6 w6Var, ProfileFeature profileFeature, boolean z11, f70.i iVar, Function0 function0, Function1 function1, Function1 function12, n nVar, int i11) {
        s sVar;
        w6Var.getClass();
        profileFeature.getClass();
        iVar.getClass();
        function0.getClass();
        function1.getClass();
        function12.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(1974623749);
        int i12 = i11 | (sVar2.f(w6Var) ? 4 : 2) | (sVar2.h(profileFeature) ? 32 : 16) | (sVar2.g(z11) ? 256 : 128) | (sVar2.h(function0) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar2.h(function1) ? 131072 : 65536) | (sVar2.h(function12) ? 1048576 : 524288);
        if (sVar2.R(i12 & 1, (599187 & i12) != 599186)) {
            LoyaltyCardDetails loyaltyCardDetails = profileFeature.getLoyaltyCardDetails();
            if (loyaltyCardDetails == null) {
                sVar2.a0(2144476361);
                sVar2.q(false);
                sVar = sVar2;
            } else {
                sVar2.a0(2144476362);
                t tVarD = d2.c.D(q.f5711a, 0.0f, lv.t.f28257k, 0.0f, 0.0f, 13);
                l2.f fVarB = l2.g.b(12);
                long jB = v.b(0.5f, lv.s.C);
                long j9 = lv.s.J;
                boolean z12 = (458752 & i12) == 131072;
                Object objM = sVar2.M();
                if (z12 || objM == m.f29332a) {
                    objM = new qr.f(function1, 3);
                    sVar2.k0(objM);
                }
                v3.a((Function0) objM, tVarD, w6Var, 0.0f, false, fVarB, j9, 0L, 0.0f, jB, f39055a, null, null, u3.e.e(1559688550, sVar2, new lj.a(profileFeature, loyaltyCardDetails, iVar, function12, function1, z11, function0)), sVar2, ((i12 << 6) & 896) | 806879280, 3078, 6552);
                sVar = sVar2;
                sVar.q(false);
            }
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new k(w6Var, profileFeature, z11, iVar, function0, function1, function12, i11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(b4.t r28, com.app.tgtg.model.remote.profile.response.ProfileFeatureState r29, com.app.tgtg.model.remote.profile.response.LoyaltyCardDetails r30, d2.z1 r31, kotlin.jvm.functions.Function0 r32, kotlin.jvm.functions.Function0 r33, boolean r34, m3.b1 r35, m3.n r36, int r37, int r38) {
        /*
            Method dump skipped, instruction units count: 873
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sn.a.b(b4.t, com.app.tgtg.model.remote.profile.response.ProfileFeatureState, com.app.tgtg.model.remote.profile.response.LoyaltyCardDetails, d2.z1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, m3.b1, m3.n, int, int):void");
    }

    public static final void c(ProfileFeature profileFeature, Function1 function1, Function0 function0, Function0 function02, Function1 function12, n nVar, int i11) {
        profileFeature.getClass();
        function1.getClass();
        s sVar = (s) nVar;
        sVar.c0(-2029256533);
        int i12 = i11 | (sVar.h(profileFeature) ? 4 : 2) | (sVar.h(function1) ? 32 : 16) | (sVar.h(function0) ? 256 : 128) | (sVar.h(function02) ? 2048 : 1024) | (sVar.h(function12) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192);
        if (sVar.R(i12 & 1, (i12 & 9363) != 9362)) {
            LoyaltyCardDetails loyaltyCardDetails = profileFeature.getLoyaltyCardDetails();
            if (loyaltyCardDetails == null) {
                sVar.a0(-1916354120);
                sVar.q(false);
            } else {
                sVar.a0(-1916354119);
                switch (i.$EnumSwitchMapping$0[profileFeature.getFeatureState().ordinal()]) {
                    case 1:
                        sVar.a0(1135981164);
                        f(profileFeature, loyaltyCardDetails, function1, function12, sVar, (i12 & 14) | ((i12 << 3) & 896) | ((i12 >> 3) & 7168));
                        sVar.q(false);
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        sVar.a0(1136430478);
                        boolean z11 = (i12 & 7168) == 2048;
                        Object objM = sVar.M();
                        if (z11 || objM == m.f29332a) {
                            objM = new rr.a(12, function02);
                            sVar.k0(objM);
                        }
                        d(profileFeature, loyaltyCardDetails, (Function0) objM, function12, sVar, (i12 & 14) | ((i12 >> 3) & 7168));
                        sVar.q(false);
                        break;
                    case 6:
                        sVar.a0(1136800463);
                        int i13 = i12 << 3;
                        e(profileFeature, loyaltyCardDetails, function1, function0, function12, sVar, (i12 & 14) | (i13 & 896) | (i13 & 7168) | (i12 & 57344));
                        sVar = sVar;
                        sVar.q(false);
                        break;
                    default:
                        sVar.a0(1137136162);
                        sVar.q(false);
                        break;
                }
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ap.b(profileFeature, function1, function0, function02, function12, i11, 23);
        }
    }

    public static final void d(ProfileFeature profileFeature, LoyaltyCardDetails loyaltyCardDetails, Function0 function0, Function1 function1, n nVar, int i11) {
        int i12;
        LoyaltyCardDetails loyaltyCardDetails2;
        s sVar = (s) nVar;
        sVar.c0(-1671777443);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(profileFeature) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            loyaltyCardDetails2 = loyaltyCardDetails;
            i12 |= sVar.f(loyaltyCardDetails2) ? 32 : 16;
        } else {
            loyaltyCardDetails2 = loyaltyCardDetails;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(function0) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(function1) ? 2048 : 1024;
        }
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            ProfileFeatureState featureState = profileFeature.getFeatureState();
            Object objM = sVar.M();
            m3.f fVar = m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(Boolean.TRUE);
                sVar.k0(objM);
            }
            b1 b1Var = (b1) objM;
            boolean z11 = (i12 & 896) == 256;
            Object objM2 = sVar.M();
            if (z11 || objM2 == fVar) {
                objM2 = new rr.a(14, function0);
                sVar.k0(objM2);
            }
            Function0 function02 = (Function0) objM2;
            boolean z12 = (i12 & 7168) == 2048;
            Object objM3 = sVar.M();
            if (z12 || objM3 == fVar) {
                objM3 = new qr.f(function1, 8);
                sVar.k0(objM3);
            }
            b(null, featureState, loyaltyCardDetails2, null, function02, (Function0) objM3, false, b1Var, sVar, ((i12 << 3) & 896) | 12582912, 73);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new t0(profileFeature, loyaltyCardDetails, function0, function1, i11, 20);
        }
    }

    public static final void e(ProfileFeature profileFeature, LoyaltyCardDetails loyaltyCardDetails, Function1 function1, Function0 function0, Function1 function12, n nVar, int i11) {
        int i12;
        LoyaltyCardDetails loyaltyCardDetails2;
        Function1 function13;
        s sVar = (s) nVar;
        sVar.c0(120123272);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(profileFeature) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            loyaltyCardDetails2 = loyaltyCardDetails;
            i12 |= sVar.f(loyaltyCardDetails2) ? 32 : 16;
        } else {
            loyaltyCardDetails2 = loyaltyCardDetails;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(function1) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(function0) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            function13 = function12;
            i12 |= sVar.h(function13) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        } else {
            function13 = function12;
        }
        int i13 = i12;
        if (sVar.R(i13 & 1, (i13 & 9363) != 9362)) {
            Object objM = sVar.M();
            m3.f fVar = m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(Boolean.FALSE);
                sVar.k0(objM);
            }
            b1 b1Var = (b1) objM;
            u3.d dVarE = u3.e.e(-409396676, sVar, new h(profileFeature, loyaltyCardDetails2, function13, b1Var, 1));
            u uVar = u.LEFT;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(f0.U(sVar, R.string.profile_new_loyalty_card_panel_completed_header), Arrays.copyOf(new Object[]{mv.d.i(loyaltyCardDetails.getVoucherValue(), 1)}, 1));
            String str2 = String.format(f0.U(sVar, R.string.profile_new_loyalty_card_panel_completed_body), Arrays.copyOf(new Object[]{Integer.valueOf(loyaltyCardDetails.getMaxPoints()), mv.d.i(loyaltyCardDetails.getVoucherValue(), 1)}, 2));
            long j9 = lv.s.J;
            long j11 = lv.s.f28217b;
            float f11 = 2;
            String strU = f0.U(sVar, R.string.profile_loyalty_card_panel_completed_cta);
            String strU2 = f0.U(sVar, R.string.profile_loyalty_card_panel_completed_cta_voice_over);
            lv.q qVar = lv.q.INVERTED;
            nn.b bVar = nn.b.NONE;
            boolean z11 = (i13 & 7168) == 2048;
            Object objM2 = sVar.M();
            if (z11 || objM2 == fVar) {
                objM2 = new rr.a(13, function0);
                sVar.k0(objM2);
            }
            nn.a aVar = new nn.a(strU, strU2, qVar, (Function0) objM2, bVar);
            String strU3 = f0.U(sVar, R.string.profile_loyalty_card_panel_active_cta);
            nn.b bVar2 = nn.b.CARD;
            boolean zH = sVar.h(profileFeature) | ((i13 & 896) == 256);
            Object objM3 = sVar.M();
            if (zH || objM3 == fVar) {
                objM3 = new g(function1, profileFeature, b1Var, 0);
                sVar.k0(objM3);
            }
            a.a.n(dVarE, uVar, new nn.c(str, str2, null, j9, j9, null, null, j11, null, f11, aVar, null, new nn.a(strU3, null, qVar, (Function0) objM3, bVar2), 2404), sVar, 54);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cm.a(profileFeature, loyaltyCardDetails, function1, function0, function12, i11);
        }
    }

    public static final void f(ProfileFeature profileFeature, LoyaltyCardDetails loyaltyCardDetails, Function1 function1, Function1 function12, n nVar, int i11) {
        int i12;
        LoyaltyCardDetails loyaltyCardDetails2;
        s sVar = (s) nVar;
        sVar.c0(1203193699);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(profileFeature) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            loyaltyCardDetails2 = loyaltyCardDetails;
            i12 |= sVar.f(loyaltyCardDetails2) ? 32 : 16;
        } else {
            loyaltyCardDetails2 = loyaltyCardDetails;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(function1) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(function12) ? NewHope.SENDB_BYTES : 1024;
        }
        int i13 = i12;
        if (sVar.R(i13 & 1, (i13 & 1171) != 1170)) {
            Object objM = sVar.M();
            m3.f fVar = m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(Boolean.FALSE);
                sVar.k0(objM);
            }
            b1 b1Var = (b1) objM;
            u3.d dVarE = u3.e.e(2091573271, sVar, new h(profileFeature, loyaltyCardDetails2, function12, b1Var, 0));
            u uVar = u.LEFT;
            String strU = f0.U(sVar, R.string.profile_new_loyalty_card_panel_active_header);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(f0.U(sVar, R.string.profile_new_loyalty_card_panel_active_body), Arrays.copyOf(new Object[]{Integer.valueOf(loyaltyCardDetails.getMaxPoints()), mv.d.i(loyaltyCardDetails.getVoucherValue(), 1)}, 2));
            String strU2 = f0.U(sVar, R.string.profile_new_loyalty_card_panel_active_body_voice_over);
            long j9 = lv.s.f28215a;
            long j11 = lv.s.C;
            String strU3 = f0.U(sVar, R.string.discover_loyalty_card_tag);
            String strU4 = f0.U(sVar, R.string.discover_loyalty_card_tag_voice_over);
            long j12 = lv.s.A;
            q0 q0Var = new q0(d0.h(new v(lv.s.Z), new v(lv.s.Y)), 9205357640488583168L, Float.POSITIVE_INFINITY);
            float f11 = 0;
            String strU5 = f0.U(sVar, R.string.profile_new_loyalty_card_panel_learn_more_cta);
            String strU6 = f0.U(sVar, R.string.profile_new_loyalty_card_panel_learn_more_cta_voice_over);
            lv.q qVar = lv.q.REGULAR;
            nn.b bVar = nn.b.NONE;
            boolean z11 = (i13 & 7168) == 2048;
            Object objM2 = sVar.M();
            if (z11 || objM2 == fVar) {
                objM2 = new qr.f(function12, 7);
                sVar.k0(objM2);
            }
            nn.a aVar = new nn.a(strU5, strU6, qVar, (Function0) objM2, bVar);
            String strU7 = f0.U(sVar, R.string.profile_loyalty_card_panel_active_cta);
            nn.b bVar2 = nn.b.CARD;
            boolean zH = sVar.h(profileFeature) | ((i13 & 896) == 256);
            Object objM3 = sVar.M();
            if (zH || objM3 == fVar) {
                objM3 = new g(function1, profileFeature, b1Var, 1);
                sVar.k0(objM3);
            }
            a.a.n(dVarE, uVar, new nn.c(strU, str, strU2, j9, j11, strU3, strU4, j12, q0Var, f11, null, aVar, new nn.a(strU7, null, qVar, (Function0) objM3, bVar2), 1024), sVar, 54);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new t0(profileFeature, loyaltyCardDetails, i11, function1, function12, 19);
        }
    }
}
