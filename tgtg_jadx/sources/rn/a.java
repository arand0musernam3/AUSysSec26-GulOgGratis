package rn;

import android.content.SharedPreferences;
import b0.a0;
import b4.q;
import b4.t;
import cn.w;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.profile.response.C2CReferralDetails;
import com.app.tgtg.model.remote.profile.response.ProfileFeature;
import com.app.tgtg.model.remote.profile.response.ProfileFeatureState;
import com.app.tgtg.model.remote.profile.response.ProfileFeatureType;
import defpackage.h;
import g3.r9;
import i4.u0;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import lv.v;
import m3.b1;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import m5.l0;
import mv.p0;
import nn.u;
import o30.e0;
import o30.f0;
import oo.z;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import q5.i;
import q5.o;
import q5.r;
import s1.r0;
import s1.y;
import x5.k;
import x5.l;
import x5.p;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u3.d f38143a = new u3.d(new qm.a(18), false, 1191440477);

    public static final void a(ProfileFeatureType profileFeatureType, ProfileFeatureState profileFeatureState, int i11, int i12, n nVar, int i13) {
        s sVar;
        s sVar2 = (s) nVar;
        sVar2.c0(200308143);
        int i14 = i13 | (sVar2.d(profileFeatureType.ordinal()) ? 4 : 2) | (sVar2.d(profileFeatureState.ordinal()) ? 32 : 16) | (sVar2.d(i11) ? 256 : 128) | (sVar2.d(i12) ? NewHope.SENDB_BYTES : 1024);
        if (sVar2.R(i14 & 1, (i14 & 1171) != 1170)) {
            ProfileFeatureType profileFeatureType2 = ProfileFeatureType.C2C_REFERRAL;
            q qVar = q.f5711a;
            if (profileFeatureType == profileFeatureType2 && (profileFeatureState == ProfileFeatureState.INITIAL || profileFeatureState == ProfileFeatureState.ACTIVE)) {
                sVar2.a0(1670607572);
                t tVarD = d2.c.D(qVar, 0.0f, e0.s(sVar2, R.dimen.spacing_1), 0.0f, 0.0f, 13);
                String strH = h(profileFeatureType, profileFeatureState, i11, i12, sVar2);
                long j9 = lv.s.C;
                r9.e(d70.a.b(strH, new l0(j9, a0.F(16.0f, 0L), r.f36046k, (q5.n) null, (o) null, (i) null, (String) null, 0L, (x5.a) null, (p) null, (t5.c) null, 0L, (l) null, (u0) null, 65528), null, 4), tVarD, j9, 0L, 0L, null, new k(5), 0L, 0, false, 0, 0, null, null, v.f28274n, sVar2, MLKEMEngine.KyberPolyBytes, 100663296, 261112);
                sVar = sVar2;
                sVar.q(false);
            } else {
                sVar2.a0(1671222550);
                r9.d(h(profileFeatureType, profileFeatureState, i11, i12, sVar2), d2.c.D(qVar, 0.0f, e0.s(sVar2, R.dimen.spacing_1), 0.0f, 0.0f, 13), lv.s.C, 0L, null, 0L, null, new k(5), 0L, 0, false, 0, 0, null, v.f28274n, sVar2, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
                sVar = sVar2;
                sVar.q(false);
            }
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new h(profileFeatureType, profileFeatureState, i11, i12, i13, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(com.app.tgtg.model.remote.profile.response.ProfileFeature r16, d2.z1 r17, kotlin.jvm.functions.Function0 r18, kotlin.jvm.functions.Function0 r19, m3.b1 r20, m3.n r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rn.a.b(com.app.tgtg.model.remote.profile.response.ProfileFeature, d2.z1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, m3.b1, m3.n, int, int):void");
    }

    public static final void c(ProfileFeature profileFeature, boolean z11, Function0 function0, Function1 function1, Function0 function02, n nVar, int i11) {
        s sVar;
        profileFeature.getClass();
        function0.getClass();
        function1.getClass();
        function02.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(822729340);
        int i12 = i11 | (sVar2.h(profileFeature) ? 4 : 2) | (sVar2.g(z11) ? 32 : 16) | (sVar2.h(function0) ? 256 : 128) | (sVar2.h(function1) ? NewHope.SENDB_BYTES : 1024) | (sVar2.h(function02) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192);
        if (sVar2.R(i12 & 1, (i12 & 9363) != 9362)) {
            Object objM = sVar2.M();
            if (objM == m.f29332a) {
                objM = m3.i.w(Boolean.FALSE);
                sVar2.k0(objM);
            }
            b1 b1Var = (b1) objM;
            if (profileFeature.getFeatureType() == ProfileFeatureType.C2C_REFERRAL_ALWAYS_ON_INCENTIVIZED) {
                SharedPreferences sharedPreferences = ft.e.f17922c;
                if (sharedPreferences == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("appDataStorage");
                    sharedPreferences = null;
                }
                String string = sharedPreferences.getString("incentivized_always_on_profile_card_state", null);
                if (string == null) {
                    string = "INITIAL";
                }
                profileFeature.setFeatureState(ProfileFeatureState.valueOf(string));
            }
            sVar = sVar2;
            y.d(!((Boolean) b1Var.getValue()).booleanValue(), null, null, r0.o(3, null).a(r0.j(null, 15)).a(r0.e(null, 3)), null, u3.e.e(-1503341916, sVar2, new ho.o(profileFeature, z11, function0, function1, b1Var, function02)), sVar, 199680, 22);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bg.d((Object) profileFeature, z11, function0, function1, function02, i11, 10);
        }
    }

    public static final void d(ProfileFeature profileFeature, Function0 function0, b1 b1Var, Function0 function02, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(-1504937380);
        int i12 = (sVar.h(profileFeature) ? 4 : 2) | i11 | (sVar.h(function0) ? 32 : 16) | (sVar.h(function02) ? 2048 : 1024);
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            boolean z11 = (i12 & 112) == 32;
            Object objM = sVar.M();
            m3.f fVar = m.f29332a;
            if (z11 || objM == fVar) {
                objM = new z(29, function0);
                sVar.k0(objM);
            }
            Function0 function03 = (Function0) objM;
            boolean zH = sVar.h(profileFeature) | ((i12 & 7168) == 2048);
            Object objM2 = sVar.M();
            if (zH || objM2 == fVar) {
                objM2 = new e(profileFeature, b1Var, function02, 1);
                sVar.k0(objM2);
            }
            Function0 function04 = (Function0) objM2;
            Object objM3 = sVar.M();
            if (objM3 == fVar) {
                objM3 = m3.i.w(Boolean.FALSE);
                sVar.k0(objM3);
            }
            b(profileFeature, null, function03, function04, (b1) objM3, sVar, (i12 & 14) | 24576, 2);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new lp.v(profileFeature, function0, b1Var, function02, i11, 11);
        }
    }

    public static final void e(ProfileFeature profileFeature, Function0 function0, Function1 function1, n nVar, int i11) {
        Integer totalReferrals;
        s sVar = (s) nVar;
        sVar.c0(1240096396);
        int i12 = i11 | (sVar.h(profileFeature) ? 4 : 2) | (sVar.h(function0) ? 32 : 16) | (sVar.h(function1) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            u3.d dVarE = u3.e.e(-1660374696, sVar, new nn.n(profileFeature, function0, 1, (byte) 0));
            u uVar = u.LEFT;
            String strU = f0.U(sVar, R.string.c2c_v3_profile_panel_end_state_earned_header);
            C2CReferralDetails c2cReferralDetails = profileFeature.getC2cReferralDetails();
            int iIntValue = (c2cReferralDetails == null || (totalReferrals = c2cReferralDetails.getTotalReferrals()) == null) ? 0 : totalReferrals.intValue();
            String strG = f0.G(R.plurals.c2c_v3_profile_panel_end_state_earned_body, iIntValue, new Object[]{Integer.valueOf(iIntValue)}, sVar);
            long j9 = lv.s.f28215a;
            long j11 = lv.s.C;
            long j12 = lv.s.J;
            float f11 = 2;
            String strU2 = f0.U(sVar, R.string.c2c_v3_profile_panel_cta);
            lv.q qVar = lv.q.REGULAR;
            nn.b bVar = nn.b.PANEL;
            boolean zH = sVar.h(profileFeature) | ((i12 & 896) == 256);
            Object objM = sVar.M();
            if (zH || objM == m.f29332a) {
                objM = new d(function1, profileFeature, 0);
                sVar.k0(objM);
            }
            a.a.n(dVarE, uVar, new nn.c(strU, strG, null, j9, j11, null, null, j12, null, f11, new nn.a(strU2, null, qVar, (Function0) objM, bVar), null, null, 6500), sVar, 54);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c(profileFeature, function0, function1, i11, 1);
        }
    }

    public static final void f(ProfileFeature profileFeature, Function0 function0, Function1 function1, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(-608049328);
        int i12 = i11 | (sVar.h(profileFeature) ? 4 : 2) | (sVar.h(function0) ? 32 : 16) | (sVar.h(function1) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            u3.d dVarE = u3.e.e(1904677124, sVar, new nn.n(profileFeature, function0, 2, (byte) 0));
            u uVar = u.LEFT;
            String strU = f0.U(sVar, R.string.c2c_v3_profile_panel_end_state_unused_header);
            String strU2 = f0.U(sVar, R.string.c2c_v3_profile_panel_end_state_unused_body);
            long j9 = lv.s.f28215a;
            long j11 = lv.s.C;
            long j12 = lv.s.J;
            float f11 = 2;
            String strU3 = f0.U(sVar, R.string.c2c_v3_profile_panel_cta);
            lv.q qVar = lv.q.REGULAR;
            nn.b bVar = nn.b.PANEL;
            boolean zH = sVar.h(profileFeature) | ((i12 & 896) == 256);
            Object objM = sVar.M();
            if (zH || objM == m.f29332a) {
                objM = new d(function1, profileFeature, 2);
                sVar.k0(objM);
            }
            a.a.n(dVarE, uVar, new nn.c(strU, strU2, null, j9, j11, null, null, j12, null, f11, new nn.a(strU3, null, qVar, (Function0) objM, bVar), null, null, 6500), sVar, 54);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c(profileFeature, function0, function1, i11, 0);
        }
    }

    public static final void g(ProfileFeature profileFeature, boolean z11, Function0 function0, Function1 function1, b1 b1Var, Function0 function02, n nVar, int i11) {
        String strT;
        String strT2;
        s sVar = (s) nVar;
        sVar.c0(1484479115);
        int i12 = i11 | (sVar.h(profileFeature) ? 4 : 2) | (sVar.g(z11) ? 32 : 16) | (sVar.h(function0) ? 256 : 128) | (sVar.h(function1) ? 2048 : 1024) | (sVar.h(function02) ? 131072 : 65536);
        if (sVar.R(i12 & 1, (74899 & i12) != 74898)) {
            Object objM = sVar.M();
            m3.f fVar = m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(Boolean.FALSE);
                sVar.k0(objM);
            }
            u3.d dVarE = u3.e.e(-626062529, sVar, new ap.b(profileFeature, function0, b1Var, function02, (b1) objM));
            u uVar = u.LEFT;
            profileFeature.getClass();
            ProfileFeatureType featureType = profileFeature.getFeatureType();
            ProfileFeatureType profileFeatureType = ProfileFeatureType.C2C_REFERRAL;
            if (featureType == profileFeatureType) {
                sVar.a0(-102288499);
                C2CReferralDetails c2cReferralDetails = profileFeature.getC2cReferralDetails();
                int iA = (int) p0.a(p0.h(c2cReferralDetails != null ? c2cReferralDetails.getExpiryDate() : null), true);
                C2CReferralDetails c2cReferralDetails2 = profileFeature.getC2cReferralDetails();
                int iB = (int) p0.b(p0.h(c2cReferralDetails2 != null ? c2cReferralDetails2.getExpiryDate() : null));
                if (iA >= 1) {
                    sVar.a0(-101989442);
                    strT = f0.G(R.plurals.c2c_v3_profile_panel_active_header_days, iA, new Object[]{Integer.valueOf(iA)}, sVar);
                    sVar.q(false);
                } else {
                    sVar.a0(-101788965);
                    strT = f0.G(R.plurals.c2c_v3_profile_panel_active_header_hours, iB, new Object[]{Integer.valueOf(iB)}, sVar);
                    sVar.q(false);
                }
                sVar.q(false);
            } else {
                sVar.a0(-101580304);
                C2CReferralDetails c2cReferralDetails3 = profileFeature.getC2cReferralDetails();
                strT = f0.T(R.string.c2c_p_a_i_a_o_profile_panel_initial_title, new Object[]{mv.d.i(c2cReferralDetails3 != null ? c2cReferralDetails3.getVoucherValue() : null, 1)}, sVar);
                sVar.q(false);
            }
            String str = strT;
            if (profileFeature.getFeatureType() == profileFeatureType) {
                sVar.a0(1849932634);
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String strU = f0.U(sVar, R.string.c2c_v3_profile_panel_active_body);
                C2CReferralDetails c2cReferralDetails4 = profileFeature.getC2cReferralDetails();
                String strI = mv.d.i(c2cReferralDetails4 != null ? c2cReferralDetails4.getVoucherValue() : null, 1);
                C2CReferralDetails c2cReferralDetails5 = profileFeature.getC2cReferralDetails();
                strT2 = String.format(strU, Arrays.copyOf(new Object[]{strI, p0.n(c2cReferralDetails5 != null ? c2cReferralDetails5.getExpiryDate() : null)}, 2));
                sVar.q(false);
            } else {
                sVar.a0(1850196041);
                int i13 = z11 ? R.string.c2c_p_a_i_a_o_profile_panel_initial_body : R.string.c2c_p_a_i_a_o_profile_panel_initial_without_parcel_body;
                C2CReferralDetails c2cReferralDetails6 = profileFeature.getC2cReferralDetails();
                strT2 = f0.T(i13, new Object[]{mv.d.i(c2cReferralDetails6 != null ? c2cReferralDetails6.getVoucherValue() : null, 1)}, sVar);
                sVar.q(false);
            }
            String str2 = strT2;
            long j9 = lv.s.J;
            long j11 = lv.s.f28217b;
            float f11 = 0;
            String strU2 = f0.U(sVar, R.string.c2c_v3_profile_panel_cta);
            lv.q qVar = lv.q.INVERTED;
            nn.b bVar = nn.b.CARD;
            boolean zH = sVar.h(profileFeature) | ((i12 & 7168) == 2048);
            Object objM2 = sVar.M();
            if (zH || objM2 == fVar) {
                objM2 = new d(profileFeature, function1);
                sVar.k0(objM2);
            }
            a.a.n(dVarE, uVar, new nn.c(str, str2, null, j9, j9, null, null, j11, null, f11, new nn.a(strU2, null, qVar, (Function0) objM2, bVar), null, null, 6500), sVar, 54);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new w(profileFeature, z11, function0, function1, b1Var, function02, i11, 9);
        }
    }

    public static final String h(ProfileFeatureType profileFeatureType, ProfileFeatureState profileFeatureState, int i11, int i12, n nVar) {
        String strG;
        int i13 = b.$EnumSwitchMapping$0[profileFeatureState.ordinal()];
        if (i13 != 1 && i13 != 2) {
            if (i13 == 3 || i13 == 4) {
                s sVar = (s) nVar;
                return b3.i.j(376130747, R.string.c2c_v3_Profile_card_end_state_body, sVar, sVar, false);
            }
            s sVar2 = (s) nVar;
            sVar2.a0(-1224778082);
            sVar2.q(false);
            return "";
        }
        s sVar3 = (s) nVar;
        sVar3.a0(-1225695308);
        if (profileFeatureType == ProfileFeatureType.C2C_REFERRAL_ALWAYS_ON_INCENTIVIZED) {
            strG = b3.i.j(-1225639477, R.string.c2c_p_a_i_a_o_profile_active_card_body, sVar3, sVar3, false);
        } else {
            sVar3.a0(-1225531163);
            if (i11 >= 1) {
                sVar3.a0(-1225505681);
                strG = f0.G(R.plurals.c2c_v3_Profile_card_active_body_days, i11, new Object[]{"%1$s", Integer.valueOf(i11), "%2$s"}, sVar3);
                sVar3.q(false);
            } else {
                sVar3.a0(-1225226836);
                strG = f0.G(R.plurals.c2c_v3_Profile_card_active_body_hours, i12, new Object[]{"%1$s", Integer.valueOf(i12), "%2$s"}, sVar3);
                sVar3.q(false);
            }
            sVar3.q(false);
        }
        sVar3.q(false);
        return strG;
    }
}
