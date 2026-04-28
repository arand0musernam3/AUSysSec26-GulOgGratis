package b0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.hardware.biometrics.BiometricPrompt;
import android.net.Uri;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import androidx.core.content.FileProvider;
import androidx.lifecycle.LifecycleOwner;
import b0.z;
import com.app.tgtg.R;
import com.app.tgtg.feature.helpdesk.HelpCenterActivity;
import com.app.tgtg.feature.tabprofile.legal.LegalActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.accountdetails.AccountDetailsActivity;
import com.app.tgtg.model.remote.DailyReminder;
import com.app.tgtg.model.remote.PushNotificationsSettings;
import com.app.tgtg.model.remote.Server;
import f70.b;
import g3.ga;
import g3.j5;
import g3.n5;
import g3.q5;
import g3.r9;
import g9.f0;
import g9.p;
import ii.j0;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import jb.u;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m3.i;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.json.JSONException;
import org.json.JSONObject;
import xh.n;
import xh.s;
import xh.w;
import zendesk.messaging.android.internal.AttachmentFileResolver;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z implements e6.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5515a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f5516b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f5517c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f5518d = 0;

    public static BiometricPrompt.CryptoObject A(t.q qVar) {
        PresentationSession presentationSession;
        IdentityCredential identityCredential;
        if (qVar == null) {
            return null;
        }
        Cipher cipher = qVar.f39304b;
        if (cipher != null) {
            return t.x.b(cipher);
        }
        Signature signature = qVar.f39303a;
        if (signature != null) {
            return t.x.a(signature);
        }
        Mac mac = qVar.f39305c;
        if (mac != null) {
            return t.x.c(mac);
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30 && (identityCredential = qVar.f39306d) != null) {
            return t.y.a(identityCredential);
        }
        if (i11 >= 33 && (presentationSession = qVar.f39307e) != null) {
            return t.z.a(presentationSession);
        }
        if (i11 >= 35) {
            long j9 = qVar.f39308f;
            if (j9 != 0) {
                return t.a0.a(j9);
            }
        }
        return null;
    }

    public static final void a(b4.t tVar, String str, boolean z11, m3.n nVar, int i11) {
        int i12;
        m3.s sVar;
        String strJ;
        str.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-1695446566);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.f(tVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.f(str) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar2.g(z11) ? 256 : 128;
        }
        if (sVar2.R(i12 & 1, (i12 & 147) != 146)) {
            b4.k kVar = b4.d.f5687e;
            b4.t tVarA = d2.c.A(v1.n.j(f4.g.b(tVar, l2.g.b(16)), z11 ? lv.s.I : lv.s.f28236q, i4.g0.f23254b), lv.t.f28251e, lv.t.f28249c);
            z4.u0 u0VarD = d2.p.d(kVar, false);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            b4.t tVarC = b4.a.c(tVarA, sVar2);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            m3.i.C(u0VarD, b5.i.f5843f, sVar2);
            m3.i.C(iVarL, b5.i.f5842e, sVar2);
            m3.i.v(sVar2, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar2, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar2);
            if (z11) {
                strJ = b3.i.j(1312112821, R.string.flash_sales_discover_out_of_time, sVar2, sVar2, false);
            } else {
                sVar2.a0(1312207557);
                strJ = o30.f0.U(sVar2, R.string.flash_sales_discover_collect_within) + " " + str;
                sVar2.q(false);
            }
            r9.d(strJ, null, z11 ? lv.s.D : lv.s.C, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, lv.v.f28273m, sVar2, 0, 12607872, 110586);
            sVar = sVar2;
            sVar.q(true);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a3.m3(tVar, str, z11, i11, 4);
        }
    }

    public static final void b(b4.t tVar, int i11, android.support.v4.media.session.a aVar, m3.n nVar, int i12, int i13) {
        int i14;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-281407403);
        int i15 = i13 & 1;
        if (i15 != 0) {
            i14 = i12 | 6;
        } else if ((i12 & 6) == 0) {
            i14 = i12 | (sVar.f(tVar) ? 4 : 2);
        } else {
            i14 = i12;
        }
        int i16 = i14 | (sVar.d(i11) ? 32 : 16);
        if (sVar.R(i16 & 1, (i16 & 147) != 146)) {
            if (i15 != 0) {
                tVar = b4.q.f5711a;
            }
            t1.d0 d0VarC = t1.c.c(t1.c.h(sVar), 0.0f, 6.2831855f, t1.c.g(t1.c.k(aVar.u(), 0, t1.w.f39596d, 2), t1.p0.Restart, 4), sVar, 4152);
            float f11 = aVar.t() ? 1 : -1;
            float fW = aVar.w() * ((float) Math.cos(aVar.v() + (((Number) d0VarC.f39409c.getValue()).floatValue() * f11)));
            float fX = aVar.x() * ((float) Math.sin(aVar.v() + (((Number) d0VarC.f39409c.getValue()).floatValue() * f11)));
            n4.b bVarZ = o00.x0.z(i11, sVar, (i16 >> 3) & 14);
            b4.t tVarU = d2.m2.u(tVar, null, 3);
            boolean zC = sVar.c(fW) | sVar.c(fX);
            Object objM = sVar.M();
            if (zC || objM == m3.m.f29332a) {
                objM = new d2.r1(fW, fX, 3);
                sVar.k0(objM);
            }
            v1.n.d(bVarZ, "Bubble", i4.g0.p(tVarU, (Function1) objM), null, null, 0.0f, null, sVar, 56, 120);
            sVar = sVar;
        } else {
            sVar.U();
        }
        b4.t tVar2 = tVar;
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new rs.p(tVar2, i11, aVar, i12, i13);
        }
    }

    public static final long c(int i11, int i12) {
        return (((long) i12) & 4294967295L) | (((long) i11) << 32);
    }

    public static final void d(String str, Function0 function0, m3.n nVar, int i11) {
        int i12;
        String str2;
        function0.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1415642334);
        int i13 = i11 | (sVar.f(str) ? 4 : 2) | (sVar.h(function0) ? 32 : 16);
        if (sVar.R(i13 & 1, (i13 & 19) != 18)) {
            long j9 = lv.s.C;
            b4.q qVar = b4.q.f5711a;
            b4.t tVarA = d2.c.A(d2.m2.t(d2.m2.d(qVar, 1.0f), 3), lv.t.f28253g, lv.t.f28252f);
            boolean z11 = (i13 & 112) == 32;
            Object objM = sVar.M();
            if (z11 || objM == m3.m.f29332a) {
                objM = new j5(25, function0);
                sVar.k0(objM);
            }
            b4.t tVarC = androidx.compose.foundation.b.c(tVarA, false, null, null, (Function0) objM, 15);
            d2.i2 i2VarA = d2.h2.a(d2.i.f13801a, b4.d.f5692j, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarC, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC2, b5.i.f5841d, sVar);
            b4.j jVar = b4.d.f5693k;
            d2.w2 w2Var = new d2.w2(jVar);
            if (0.7f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            b4.t tVarThen = w2Var.then(new d2.n1(0.7f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.7f, true));
            sVar.a0(-1354060516);
            sVar.q(false);
            r9.d(str, tVarThen, j9, 0L, null, 0L, null, new x5.k(5), 0L, 2, false, 1, 0, null, lv.v.f28274n, sVar, 0, 12607872, 109560);
            str2 = str;
            sVar = sVar;
            i12 = 0;
            g3.i2.a(o00.x0.z(R.drawable.system_icon_chevron_right_neutral_80, sVar, 0), null, d2.c.D(b3.i.g(jVar, d2.m2.u(qVar, null, 3)), o30.e0.s(sVar, R.dimen.spacing_1), 0.0f, 0.0f, 0.0f, 14), 0L, sVar, 56, 8);
            sVar.q(true);
        } else {
            i12 = 0;
            str2 = str;
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new jr.b(str2, function0, i11, i12);
        }
    }

    public static final void e(int i11, b4.t tVar, List list, Function1 function1, m3.n nVar) {
        List<al.h> list2;
        int i12;
        list.getClass();
        function1.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1198363097);
        if ((i11 & 6) == 0) {
            list2 = list;
            i12 = (sVar.h(list2) ? 4 : 2) | i11;
        } else {
            list2 = list;
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(function1) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.f(tVar) ? 256 : 128;
        }
        int i13 = 1;
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            float f11 = lv.t.f28257k;
            float f12 = lv.t.f28254h;
            b4.t tVarD = d2.c.D(tVar, f12, 0.0f, f12, f11, 2);
            d2.b bVar = d2.i.f13801a;
            d2.y yVarA = d2.w.a(d2.i.g(lv.t.f28252f), b4.d.f5694m, sVar, 6);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarD, sVar);
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
            sVar.a0(-863060080);
            for (al.h hVar2 : list2) {
                boolean zD = ((i12 & 112) == 32) | sVar.d(hVar2.ordinal());
                Object objM = sVar.M();
                if (zD || objM == m3.m.f29332a) {
                    objM = new bh.b(function1, hVar2, i13);
                    sVar.k0(objM);
                }
                a.a.k(hVar2, (Function0) objM, null, sVar, 0);
            }
            sVar.q(false);
            sVar.q(true);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a3.a(list2, function1, tVar, i11, 15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(g9.f0 r34, g9.b0 r35, b4.t r36, b4.f r37, final kotlin.jvm.functions.Function1 r38, final kotlin.jvm.functions.Function1 r39, final kotlin.jvm.functions.Function1 r40, final kotlin.jvm.functions.Function1 r41, kotlin.jvm.functions.Function1 r42, m3.n r43, int r44, int r45) {
        /*
            Method dump skipped, instruction units count: 1282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.z.f(g9.f0, g9.b0, b4.t, b4.f, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, m3.n, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(g9.f0 r21, java.lang.Object r22, b4.t r23, b4.f r24, java.util.Map r25, kotlin.jvm.functions.Function1 r26, kotlin.jvm.functions.Function1 r27, kotlin.jvm.functions.Function1 r28, kotlin.jvm.functions.Function1 r29, kotlin.jvm.functions.Function1 r30, m3.n r31, int r32, int r33) {
        /*
            Method dump skipped, instruction units count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.z.g(g9.f0, java.lang.Object, b4.t, b4.f, java.util.Map, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, m3.n, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(g9.f0 r19, java.lang.String r20, b4.t r21, b4.f r22, java.lang.String r23, kotlin.jvm.functions.Function1 r24, kotlin.jvm.functions.Function1 r25, kotlin.jvm.functions.Function1 r26, kotlin.jvm.functions.Function1 r27, kotlin.jvm.functions.Function1 r28, m3.n r29, int r30, int r31) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.z.h(g9.f0, java.lang.String, b4.t, b4.f, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, m3.n, int, int):void");
    }

    public static final void i(b4.t tVar, hr.i iVar, final ub.a aVar, m3.n nVar, int i11) {
        hr.i iVar2;
        final int i12;
        final int i13;
        m3.b1 b1Var;
        m3.b1 b1Var2;
        iVar.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1047673845);
        int i14 = i11 | (sVar.f(tVar) ? 4 : 2) | (sVar.h(iVar) ? 32 : 16) | (sVar.f(aVar) ? 256 : 128);
        if (sVar.R(i14 & 1, (i14 & 147) != 146)) {
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(Boolean.FALSE);
                sVar.k0(objM);
            }
            m3.b1 b1Var3 = (m3.b1) objM;
            b4.t tVarR = d2.c.r(d2.m2.c(d2.m2.d(v1.n.j(tVar, lv.s.J, i4.g0.f23254b), 1.0f), 1.0f));
            z4.u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarR, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(u0VarD, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            float fS = o30.e0.s(sVar, R.dimen.spacing_3);
            b4.q qVar = b4.q.f5711a;
            b4.t tVarR2 = v1.n.r(d2.m2.t(d2.m2.d(d2.c.B(qVar, fS, 0.0f, 2), 1.0f), 3), v1.n.q(sVar), true);
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarR2, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            b4.t tVarD = d2.c.D(qVar, 0.0f, o30.e0.s(sVar, R.dimen.spacing_4), 0.0f, 0.0f, 13);
            String strU = o30.f0.U(sVar, R.string.profile_settings_settings_header);
            m5.u0 u0Var = lv.v.f28279s;
            long j9 = lv.s.D;
            r9.d(strU, tVarD, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, m5.u0.a(u0Var, j9, 0L, null, null, 0L, null, 5, 0L, null, null, 16744446), sVar, 0, 0, 131068);
            int i15 = i14 & 896;
            boolean z11 = i15 == 256;
            Object objM2 = sVar.M();
            if (z11 || objM2 == fVar) {
                final int i16 = 0;
                objM2 = new Function0() { // from class: ri.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i16) {
                            case 0:
                                ((j0) aVar.f40981b).f23922c.f44310a.a(new b(AccountDetailsActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                                break;
                            case 1:
                                ((j0) aVar.f40981b).f23922c.f44310a.a(new b(HelpCenterActivity.class, u.x(new Pair("DESTINATION", ek.b.GO_TO_HOW_TGTG_WORKS), new Pair("OPENED_FROM", "Manage_Account")), false, false, false, null, null, null, null, false, 1020));
                                break;
                            case 2:
                                ((j0) aVar.f40981b).f23922c.f44310a.a(new b(LegalActivity.class, null, false, false, false, 2, null, null, null, false, 990));
                                break;
                            case 3:
                                p.e((f0) aVar.f40982c, new n("Account"));
                                break;
                            case 4:
                                p.e((f0) aVar.f40982c, s.INSTANCE);
                                break;
                            case 5:
                                p.e((f0) aVar.f40982c, w.INSTANCE);
                                break;
                            case 6:
                                p.e((f0) aVar.f40982c, new n("Account"));
                                break;
                            default:
                                p.e((f0) aVar.f40982c, xh.u.INSTANCE);
                                break;
                        }
                        return Unit.f26487a;
                    }
                };
                sVar.k0(objM2);
            }
            d40.t1.d(null, R.string.profile_settings_details_caption, R.drawable.system_icon_account_details, null, (Function0) objM2, sVar, 0, 9);
            boolean z12 = i15 == 256;
            Object objM3 = sVar.M();
            if (z12 || objM3 == fVar) {
                i12 = 3;
                objM3 = new Function0() { // from class: ri.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i12) {
                            case 0:
                                ((j0) aVar.f40981b).f23922c.f44310a.a(new b(AccountDetailsActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                                break;
                            case 1:
                                ((j0) aVar.f40981b).f23922c.f44310a.a(new b(HelpCenterActivity.class, u.x(new Pair("DESTINATION", ek.b.GO_TO_HOW_TGTG_WORKS), new Pair("OPENED_FROM", "Manage_Account")), false, false, false, null, null, null, null, false, 1020));
                                break;
                            case 2:
                                ((j0) aVar.f40981b).f23922c.f44310a.a(new b(LegalActivity.class, null, false, false, false, 2, null, null, null, false, 990));
                                break;
                            case 3:
                                p.e((f0) aVar.f40982c, new n("Account"));
                                break;
                            case 4:
                                p.e((f0) aVar.f40982c, s.INSTANCE);
                                break;
                            case 5:
                                p.e((f0) aVar.f40982c, w.INSTANCE);
                                break;
                            case 6:
                                p.e((f0) aVar.f40982c, new n("Account"));
                                break;
                            default:
                                p.e((f0) aVar.f40982c, xh.u.INSTANCE);
                                break;
                        }
                        return Unit.f26487a;
                    }
                };
                sVar.k0(objM3);
            } else {
                i12 = 3;
            }
            d40.t1.d(null, R.string.profile_settings_collection_days, R.drawable.system_icon_edit_calendar, null, (Function0) objM3, sVar, 0, 9);
            boolean z13 = i15 == 256;
            Object objM4 = sVar.M();
            if (z13 || objM4 == fVar) {
                final int i17 = 4;
                objM4 = new Function0() { // from class: ri.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i17) {
                            case 0:
                                ((j0) aVar.f40981b).f23922c.f44310a.a(new b(AccountDetailsActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                                break;
                            case 1:
                                ((j0) aVar.f40981b).f23922c.f44310a.a(new b(HelpCenterActivity.class, u.x(new Pair("DESTINATION", ek.b.GO_TO_HOW_TGTG_WORKS), new Pair("OPENED_FROM", "Manage_Account")), false, false, false, null, null, null, null, false, 1020));
                                break;
                            case 2:
                                ((j0) aVar.f40981b).f23922c.f44310a.a(new b(LegalActivity.class, null, false, false, false, 2, null, null, null, false, 990));
                                break;
                            case 3:
                                p.e((f0) aVar.f40982c, new n("Account"));
                                break;
                            case 4:
                                p.e((f0) aVar.f40982c, s.INSTANCE);
                                break;
                            case 5:
                                p.e((f0) aVar.f40982c, w.INSTANCE);
                                break;
                            case 6:
                                p.e((f0) aVar.f40982c, new n("Account"));
                                break;
                            default:
                                p.e((f0) aVar.f40982c, xh.u.INSTANCE);
                                break;
                        }
                        return Unit.f26487a;
                    }
                };
                sVar.k0(objM4);
            }
            d40.t1.d(null, R.string.profile_settings_notifications_caption, R.drawable.system_icon_notifications_settings, null, (Function0) objM4, sVar, 0, 9);
            r9.d(o30.f0.U(sVar, R.string.profile_settings_your_organisation_header), d2.c.D(qVar, 0.0f, o30.e0.s(sVar, R.dimen.spacing_4), 0.0f, 0.0f, 13), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, m5.u0.a(u0Var, j9, 0L, null, null, 0L, null, 5, 0L, null, null, 16744446), sVar, 0, 0, 131068);
            boolean z14 = i15 == 256;
            Object objM5 = sVar.M();
            if (z14 || objM5 == fVar) {
                final int i18 = 5;
                objM5 = new Function0() { // from class: ri.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i18) {
                            case 0:
                                ((j0) aVar.f40981b).f23922c.f44310a.a(new b(AccountDetailsActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                                break;
                            case 1:
                                ((j0) aVar.f40981b).f23922c.f44310a.a(new b(HelpCenterActivity.class, u.x(new Pair("DESTINATION", ek.b.GO_TO_HOW_TGTG_WORKS), new Pair("OPENED_FROM", "Manage_Account")), false, false, false, null, null, null, null, false, 1020));
                                break;
                            case 2:
                                ((j0) aVar.f40981b).f23922c.f44310a.a(new b(LegalActivity.class, null, false, false, false, 2, null, null, null, false, 990));
                                break;
                            case 3:
                                p.e((f0) aVar.f40982c, new n("Account"));
                                break;
                            case 4:
                                p.e((f0) aVar.f40982c, s.INSTANCE);
                                break;
                            case 5:
                                p.e((f0) aVar.f40982c, w.INSTANCE);
                                break;
                            case 6:
                                p.e((f0) aVar.f40982c, new n("Account"));
                                break;
                            default:
                                p.e((f0) aVar.f40982c, xh.u.INSTANCE);
                                break;
                        }
                        return Unit.f26487a;
                    }
                };
                sVar.k0(objM5);
            }
            d40.t1.d(null, R.string.charity_home_title_history, R.drawable.system_icon_receipt_settings, null, (Function0) objM5, sVar, 0, 9);
            boolean z15 = i15 == 256;
            Object objM6 = sVar.M();
            if (z15 || objM6 == fVar) {
                final int i19 = 6;
                objM6 = new Function0() { // from class: ri.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i19) {
                            case 0:
                                ((j0) aVar.f40981b).f23922c.f44310a.a(new b(AccountDetailsActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                                break;
                            case 1:
                                ((j0) aVar.f40981b).f23922c.f44310a.a(new b(HelpCenterActivity.class, u.x(new Pair("DESTINATION", ek.b.GO_TO_HOW_TGTG_WORKS), new Pair("OPENED_FROM", "Manage_Account")), false, false, false, null, null, null, null, false, 1020));
                                break;
                            case 2:
                                ((j0) aVar.f40981b).f23922c.f44310a.a(new b(LegalActivity.class, null, false, false, false, 2, null, null, null, false, 990));
                                break;
                            case 3:
                                p.e((f0) aVar.f40982c, new n("Account"));
                                break;
                            case 4:
                                p.e((f0) aVar.f40982c, s.INSTANCE);
                                break;
                            case 5:
                                p.e((f0) aVar.f40982c, w.INSTANCE);
                                break;
                            case 6:
                                p.e((f0) aVar.f40982c, new n("Account"));
                                break;
                            default:
                                p.e((f0) aVar.f40982c, xh.u.INSTANCE);
                                break;
                        }
                        return Unit.f26487a;
                    }
                };
                sVar.k0(objM6);
            }
            d40.t1.d(null, R.string.profile_settings_collection_days, R.drawable.system_icon_edit_calendar, null, (Function0) objM6, sVar, 0, 9);
            boolean z16 = i15 == 256;
            Object objM7 = sVar.M();
            if (z16 || objM7 == fVar) {
                final int i21 = 7;
                objM7 = new Function0() { // from class: ri.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i21) {
                            case 0:
                                ((j0) aVar.f40981b).f23922c.f44310a.a(new b(AccountDetailsActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                                break;
                            case 1:
                                ((j0) aVar.f40981b).f23922c.f44310a.a(new b(HelpCenterActivity.class, u.x(new Pair("DESTINATION", ek.b.GO_TO_HOW_TGTG_WORKS), new Pair("OPENED_FROM", "Manage_Account")), false, false, false, null, null, null, null, false, 1020));
                                break;
                            case 2:
                                ((j0) aVar.f40981b).f23922c.f44310a.a(new b(LegalActivity.class, null, false, false, false, 2, null, null, null, false, 990));
                                break;
                            case 3:
                                p.e((f0) aVar.f40982c, new n("Account"));
                                break;
                            case 4:
                                p.e((f0) aVar.f40982c, s.INSTANCE);
                                break;
                            case 5:
                                p.e((f0) aVar.f40982c, w.INSTANCE);
                                break;
                            case 6:
                                p.e((f0) aVar.f40982c, new n("Account"));
                                break;
                            default:
                                p.e((f0) aVar.f40982c, xh.u.INSTANCE);
                                break;
                        }
                        return Unit.f26487a;
                    }
                };
                sVar.k0(objM7);
            }
            d40.t1.d(null, R.string.profile_partner_stores_caption, R.drawable.ic_charity_storefront, null, (Function0) objM7, sVar, 0, 9);
            r9.d(o30.f0.U(sVar, R.string.profile_settings_support_header), d2.c.D(qVar, 0.0f, o30.e0.s(sVar, R.dimen.spacing_4), 0.0f, 0.0f, 13), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, m5.u0.a(u0Var, j9, 0L, null, null, 0L, null, 5, 0L, null, null, 16744446), sVar, 0, 0, 131068);
            boolean zH = sVar.h(iVar) | (i15 == 256);
            Object objM8 = sVar.M();
            if (zH || objM8 == fVar) {
                objM8 = new qw.b(9, iVar, aVar);
                sVar.k0(objM8);
            }
            d40.t1.d(null, R.string.profile_settings_help_with_order_caption, R.drawable.system_icon_help_with_order, null, (Function0) objM8, sVar, 0, 9);
            boolean z17 = i15 == 256;
            Object objM9 = sVar.M();
            if (z17 || objM9 == fVar) {
                i13 = 1;
                objM9 = new Function0() { // from class: ri.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i13) {
                            case 0:
                                ((j0) aVar.f40981b).f23922c.f44310a.a(new b(AccountDetailsActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                                break;
                            case 1:
                                ((j0) aVar.f40981b).f23922c.f44310a.a(new b(HelpCenterActivity.class, u.x(new Pair("DESTINATION", ek.b.GO_TO_HOW_TGTG_WORKS), new Pair("OPENED_FROM", "Manage_Account")), false, false, false, null, null, null, null, false, 1020));
                                break;
                            case 2:
                                ((j0) aVar.f40981b).f23922c.f44310a.a(new b(LegalActivity.class, null, false, false, false, 2, null, null, null, false, 990));
                                break;
                            case 3:
                                p.e((f0) aVar.f40982c, new n("Account"));
                                break;
                            case 4:
                                p.e((f0) aVar.f40982c, s.INSTANCE);
                                break;
                            case 5:
                                p.e((f0) aVar.f40982c, w.INSTANCE);
                                break;
                            case 6:
                                p.e((f0) aVar.f40982c, new n("Account"));
                                break;
                            default:
                                p.e((f0) aVar.f40982c, xh.u.INSTANCE);
                                break;
                        }
                        return Unit.f26487a;
                    }
                };
                sVar.k0(objM9);
            } else {
                i13 = 1;
            }
            d40.t1.d(null, R.string.helpdesk_charity_menu_item_how_does_it_work, R.drawable.system_icon_help_center, null, (Function0) objM9, sVar, 0, 9);
            iVar2 = iVar;
            r9.d(o30.f0.U(sVar, R.string.profile_settings_other_header), d2.c.D(qVar, 0.0f, o30.e0.s(sVar, R.dimen.spacing_4), 0.0f, 0.0f, 13), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, m5.u0.a(u0Var, j9, 0L, null, null, 0L, null, 5, 0L, null, null, 16744446), sVar, 0, 0, 131068);
            boolean zH2 = sVar.h(iVar2);
            Object objM10 = sVar.M();
            if (zH2 || objM10 == fVar) {
                objM10 = new m2.b2(iVar2, 29);
                sVar.k0(objM10);
            }
            d40.t1.d(null, R.string.profile_settings_blog_caption, R.drawable.system_icon_blog, null, (Function0) objM10, sVar, 0, 9);
            boolean z18 = i15 == 256;
            Object objM11 = sVar.M();
            if (z18 || objM11 == fVar) {
                final int i22 = 2;
                objM11 = new Function0() { // from class: ri.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i22) {
                            case 0:
                                ((j0) aVar.f40981b).f23922c.f44310a.a(new b(AccountDetailsActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                                break;
                            case 1:
                                ((j0) aVar.f40981b).f23922c.f44310a.a(new b(HelpCenterActivity.class, u.x(new Pair("DESTINATION", ek.b.GO_TO_HOW_TGTG_WORKS), new Pair("OPENED_FROM", "Manage_Account")), false, false, false, null, null, null, null, false, 1020));
                                break;
                            case 2:
                                ((j0) aVar.f40981b).f23922c.f44310a.a(new b(LegalActivity.class, null, false, false, false, 2, null, null, null, false, 990));
                                break;
                            case 3:
                                p.e((f0) aVar.f40982c, new n("Account"));
                                break;
                            case 4:
                                p.e((f0) aVar.f40982c, s.INSTANCE);
                                break;
                            case 5:
                                p.e((f0) aVar.f40982c, w.INSTANCE);
                                break;
                            case 6:
                                p.e((f0) aVar.f40982c, new n("Account"));
                                break;
                            default:
                                p.e((f0) aVar.f40982c, xh.u.INSTANCE);
                                break;
                        }
                        return Unit.f26487a;
                    }
                };
                sVar.k0(objM11);
            }
            d40.t1.d(null, R.string.profile_settings_legal_caption, R.drawable.system_icon_legal, null, (Function0) objM11, sVar, 0, 9);
            b4.t tVarD2 = d2.m2.d(d2.c.B(qVar, 0.0f, lv.t.f28254h, 1).then(new d2.w0(b4.d.f5695n)), 1.0f);
            lv.q qVar2 = lv.q.DANGER;
            String strU2 = o30.f0.U(sVar, R.string.profile_settings_logout_cta);
            Object objM12 = sVar.M();
            int i23 = 14;
            if (objM12 == fVar) {
                b1Var = b1Var3;
                objM12 = new pi.b(b1Var, i23);
                sVar.k0(objM12);
            } else {
                b1Var = b1Var3;
            }
            m3.b1 b1Var4 = b1Var;
            v0.n.n(tVarD2, strU2, null, qVar2, null, false, false, null, null, (Function0) objM12, sVar, 805309440, 500);
            r9.d("26.4.1 (21117)", b4.a.a(d2.m2.d(d2.c.z(qVar, lv.t.f28253g), 1.0f), c5.m2.f7291a, new em.d(3)), j9, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28276p, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
            sVar = sVar;
            sVar.q(true);
            sVar.q(true);
            if (((Boolean) b1Var4.getValue()).booleanValue()) {
                sVar.a0(282488639);
                boolean zH3 = sVar.h(iVar2) | (i15 == 256);
                Object objM13 = sVar.M();
                if (zH3 || objM13 == fVar) {
                    b1Var2 = b1Var4;
                    objM13 = new lw.o(iVar2, aVar, b1Var2, 14);
                    sVar.k0(objM13);
                } else {
                    b1Var2 = b1Var4;
                }
                Function0 function0 = (Function0) objM13;
                Object objM14 = sVar.M();
                if (objM14 == fVar) {
                    objM14 = new pi.b(b1Var2, 15);
                    sVar.k0(objM14);
                }
                dx.f.c(null, function0, (Function0) objM14, sVar, MLKEMEngine.KyberPolyBytes);
                sVar.q(false);
            } else {
                sVar.a0(282880727);
                sVar.q(false);
            }
        } else {
            iVar2 = iVar;
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ki.h(tVar, iVar2, aVar, i11, 27);
        }
    }

    public static final void j(String str, kn.c cVar, Function0 function0, Function1 function1, Function0 function02, int i11, Function0 function03, m3.n nVar, int i12) {
        function0.getClass();
        function1.getClass();
        function02.getClass();
        function03.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-425563073);
        int i13 = i12 | (sVar.f(str) ? 4 : 2) | (sVar.h(cVar) ? 32 : 16) | (sVar.h(function0) ? 256 : 128) | (sVar.h(function1) ? NewHope.SENDB_BYTES : 1024) | (sVar.h(function02) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar.d(i11) ? 131072 : 65536) | (sVar.h(function03) ? 1048576 : 524288);
        if (sVar.R(i13 & 1, (599187 & i13) != 599186)) {
            sVar.W();
            if ((i12 & 1) != 0 && !sVar.z()) {
                sVar.U();
            }
            sVar.r();
            le.p pVarD = o30.e0.D(new le.q("profilepage_avatar.json"), sVar, 6);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = w.a0.s(Integer.MAX_VALUE, sVar);
            }
            m3.h1 h1Var = (m3.h1) objM;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = m3.i.w(Boolean.FALSE);
                sVar.k0(objM2);
            }
            m3.b1 b1Var = (m3.b1) objM2;
            Object objM3 = sVar.M();
            if (objM3 == fVar) {
                objM3 = m3.i.w(cVar);
                sVar.k0(objM3);
            }
            m3.b1 b1Var2 = (m3.b1) objM3;
            b4.q qVar = b4.q.f5711a;
            b4.t tVarD = d2.m2.d(qVar, 1.0f);
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarD, sVar);
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
            d2.i0 i0VarG = d2.c.g(0.0f, 0, 13);
            b4.t tVarK = f4.g.k(qVar, o30.e0.s(sVar, R.dimen.spacing_0_5), null, false, 0L, 0L, 30);
            d2.b2 b2Var = ga.f18696a;
            g3.i.c(u3.e.e(77544397, sVar, new jr.b(str, function02)), tVarK, u3.e.e(-1924567345, sVar, new ap.b(b1Var2, function0, b1Var, h1Var, pVarD)), u3.e.e(-2106064904, sVar, new f2.j(function03, i11, 1)), 0.0f, i0VarG, ga.d(lv.s.J, 0L, 0L, 0L, sVar, 62), null, sVar, 3462, 400);
            sVar = sVar;
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar.a0(-1426615665);
                kn.c cVar2 = (kn.c) b1Var2.getValue();
                Object objM4 = sVar.M();
                if (objM4 == fVar) {
                    objM4 = new ms.a(b1Var, 4);
                    sVar.k0(objM4);
                }
                Function0 function04 = (Function0) objM4;
                boolean z11 = (i13 & 7168) == 2048;
                Object objM5 = sVar.M();
                if (z11 || objM5 == fVar) {
                    objM5 = new m2.b0(function1, b1Var2, 2);
                    sVar.k0(objM5);
                }
                on.d.e(null, cVar2, function04, (Function1) objM5, sVar, MLKEMEngine.KyberPolyBytes);
                sVar.q(false);
            } else {
                sVar.a0(-1426329287);
                sVar.q(false);
            }
            sVar.q(true);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.a0(str, cVar, function0, function1, function02, i11, function03, i12);
        }
    }

    public static final void k(final Server server, boolean z11, final Function1 function1, m3.n nVar, int i11) {
        boolean z12;
        server.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-612768504);
        int i12 = (sVar.f(server) ? 4 : 2) | i11;
        if ((i11 & 48) == 0) {
            z12 = z11;
            i12 |= sVar.g(z12) ? 32 : 16;
        } else {
            z12 = z11;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(function1) ? 256 : 128;
        }
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            b4.q qVar = b4.q.f5711a;
            b4.t tVarD = d2.c.D(d2.m2.d(qVar, 1.0f), 16, 10, 0.0f, 0.0f, 12);
            int i13 = i12 & 896;
            int i14 = i12 & 14;
            boolean z13 = (i13 == 256) | (i14 == 4);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (z13 || objM == fVar) {
                final int i15 = 0;
                objM = new Function0() { // from class: og.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                Function1 function12 = function1;
                                if (function12 != null) {
                                    function12.invoke(server);
                                }
                                break;
                            default:
                                Function1 function13 = function1;
                                if (function13 != null) {
                                    function13.invoke(server);
                                }
                                break;
                        }
                        return Unit.f26487a;
                    }
                };
                sVar.k0(objM);
            }
            b4.t tVarC = androidx.compose.foundation.b.c(tVarD, false, null, null, (Function0) objM, 15);
            d2.i2 i2VarA = d2.h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarC, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC2, b5.i.f5841d, sVar);
            b4.t tVarM = d2.m2.m(qVar, 24);
            long j9 = lv.s.f28217b;
            n5 n5VarR = g3.s0.r(j9, j9, sVar);
            boolean z14 = (i13 == 256) | (i14 == 4);
            Object objM2 = sVar.M();
            if (z14 || objM2 == fVar) {
                final int i16 = 1;
                objM2 = new Function0() { // from class: og.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i16) {
                            case 0:
                                Function1 function12 = function1;
                                if (function12 != null) {
                                    function12.invoke(server);
                                }
                                break;
                            default:
                                Function1 function13 = function1;
                                if (function13 != null) {
                                    function13.invoke(server);
                                }
                                break;
                        }
                        return Unit.f26487a;
                    }
                };
                sVar.k0(objM2);
            }
            q5.a(z12, (Function0) objM2, tVarM, false, n5VarR, sVar, ((i12 >> 3) & 14) | MLKEMEngine.KyberPolyBytes);
            r9.d(server.getName(), d2.c.D(qVar, 4, 3, 0.0f, 0.0f, 12), j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28281u, sVar, 432, 12582912, 131064);
            sVar = sVar;
            sVar.q(true);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a3.m3(i11, 10, server, function1, z11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void l(final hs.h hVar, final PushNotificationsSettings pushNotificationsSettings, final boolean z11, boolean z12, final Function0 function0, final Function0 function02, Function0 function03, final Function1 function1, final Function1 function12, m3.n nVar, final int i11) {
        boolean z13;
        final Function0 function04;
        m3.s sVar;
        m3.b1 b1Var;
        m3.b1 b1Var2;
        Object o0Var;
        m3.b1 b1Var3;
        Boolean bool;
        int i12;
        int i13;
        Object obj;
        m3.b1 b1Var4;
        m3.b1 b1Var5;
        m3.b1 b1Var6;
        int i14;
        final m3.b1 b1Var7;
        m3.b1 b1Var8;
        PushNotificationsSettings pushNotificationsSettings2;
        int i15;
        m3.b1 b1Var9;
        m3.b1 b1Var10;
        m3.b1 b1Var11;
        m3.b1 b1Var12;
        final m3.b1 b1Var13;
        final int i16;
        final int i17;
        function0.getClass();
        function02.getClass();
        function03.getClass();
        function1.getClass();
        function12.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-1588120211);
        int i18 = i11 | (sVar2.h(hVar) ? 4 : 2) | (sVar2.h(pushNotificationsSettings) ? 32 : 16) | (sVar2.g(z11) ? 256 : 128) | (sVar2.g(z12) ? NewHope.SENDB_BYTES : 1024) | (sVar2.h(function0) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar2.h(function02) ? 131072 : 65536) | (sVar2.h(function03) ? 1048576 : 524288);
        if (sVar2.R(i18 & 1, (38347923 & i18) != 38347922)) {
            Object objM = sVar2.M();
            Object obj2 = m3.m.f29332a;
            if (objM == obj2) {
                objM = m3.i.w(Boolean.FALSE);
                sVar2.k0(objM);
            }
            m3.b1 b1Var14 = (m3.b1) objM;
            Object objM2 = sVar2.M();
            if (objM2 == obj2) {
                objM2 = m3.i.w(Boolean.FALSE);
                sVar2.k0(objM2);
            }
            m3.b1 b1Var15 = (m3.b1) objM2;
            Object objM3 = sVar2.M();
            if (objM3 == obj2) {
                objM3 = m3.i.w(Boolean.FALSE);
                sVar2.k0(objM3);
            }
            m3.b1 b1Var16 = (m3.b1) objM3;
            Object objM4 = sVar2.M();
            if (objM4 == obj2) {
                objM4 = m3.i.w(Boolean.FALSE);
                sVar2.k0(objM4);
            }
            m3.b1 b1Var17 = (m3.b1) objM4;
            Object objM5 = sVar2.M();
            if (objM5 == obj2) {
                objM5 = m3.i.w(Boolean.FALSE);
                sVar2.k0(objM5);
            }
            m3.b1 b1Var18 = (m3.b1) objM5;
            Object objM6 = sVar2.M();
            if (objM6 == obj2) {
                objM6 = m3.i.w(hVar.f22482k.getDailyReminder());
                sVar2.k0(objM6);
            }
            m3.b1 b1Var19 = (m3.b1) objM6;
            Object objM7 = sVar2.M();
            if (objM7 == obj2) {
                objM7 = m3.i.w(Boolean.FALSE);
                sVar2.k0(objM7);
            }
            m3.b1 b1Var20 = (m3.b1) objM7;
            Boolean bool2 = (Boolean) m3.i.n(hVar.f22480i, sVar2, 0).getValue();
            bool2.getClass();
            boolean zH = sVar2.h(hVar);
            Object objM8 = sVar2.M();
            if (zH || objM8 == obj2) {
                b1Var = b1Var14;
                b1Var2 = b1Var16;
                objM8 = new is.h(hVar, b1Var20, null, 0);
                sVar2.k0(objM8);
            } else {
                b1Var = b1Var14;
                b1Var2 = b1Var16;
            }
            m3.i.h(bool2, (Function2) objM8, sVar2);
            Boolean boolValueOf = Boolean.valueOf(z11);
            int i19 = i18 & 896;
            boolean zH2 = sVar2.h(pushNotificationsSettings) | sVar2.h(hVar) | (i19 == 256);
            Object objM9 = sVar2.M();
            if (zH2 || objM9 == obj2) {
                b1Var3 = b1Var20;
                bool = boolValueOf;
                i12 = i18;
                i13 = i19;
                obj = obj2;
                b1Var4 = b1Var17;
                b1Var5 = b1Var18;
                b1Var6 = b1Var15;
                m3.b1 b1Var21 = b1Var2;
                i14 = 256;
                o0Var = new cj.o0(pushNotificationsSettings, hVar, z11, b1Var, b1Var6, b1Var21, b1Var4, b1Var5, b1Var19, (x70.c) null);
                b1Var7 = b1Var21;
                b1Var8 = b1Var19;
                pushNotificationsSettings2 = pushNotificationsSettings;
                sVar2.k0(o0Var);
            } else {
                i12 = i18;
                b1Var3 = b1Var20;
                bool = boolValueOf;
                i13 = i19;
                o0Var = objM9;
                b1Var4 = b1Var17;
                b1Var5 = b1Var18;
                obj = obj2;
                b1Var6 = b1Var15;
                b1Var7 = b1Var2;
                pushNotificationsSettings2 = pushNotificationsSettings;
                b1Var8 = b1Var19;
                i14 = 256;
            }
            int i21 = i12 >> 3;
            m3.i.g(pushNotificationsSettings2, bool, (Function2) o0Var, sVar2);
            Boolean boolValueOf2 = Boolean.valueOf(z11);
            boolean zH3 = (i13 == i14) | sVar2.h(hVar);
            Object objM10 = sVar2.M();
            Object obj3 = obj;
            if (zH3 || objM10 == obj3) {
                m3.b1 b1Var22 = b1Var6;
                i15 = i21;
                m3.b1 b1Var23 = b1Var3;
                Object wVar = new gn.w(z11, hVar, b1Var22, b1Var23, (x70.c) null, 1);
                b1Var9 = b1Var22;
                b1Var10 = b1Var23;
                sVar2.k0(wVar);
                objM10 = wVar;
            } else {
                m3.b1 b1Var24 = b1Var3;
                b1Var9 = b1Var6;
                b1Var10 = b1Var24;
                i15 = i21;
            }
            m3.i.h(boolValueOf2, (Function2) objM10, sVar2);
            b4.q qVar = b4.q.f5711a;
            b4.t tVarR = v1.n.r(d2.m2.t(d2.m2.d(qVar, 1.0f), 3), v1.n.q(sVar2), true);
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar2, 0);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            b4.t tVarC = b4.a.c(tVarR, sVar2);
            b5.j.R.getClass();
            Function0 function05 = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(function05);
            } else {
                sVar2.n0();
            }
            m3.i.C(yVarA, b5.i.f5843f, sVar2);
            m3.i.C(iVarL, b5.i.f5842e, sVar2);
            m3.i.v(sVar2, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar2, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar2);
            boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
            boolean zH4 = sVar2.h(hVar);
            Object objM11 = sVar2.M();
            if (zH4 || objM11 == obj3) {
                Object x1Var = new x1(10, hVar, function1, b1Var, b1Var10);
                b1Var11 = b1Var10;
                sVar2.k0(x1Var);
                objM11 = x1Var;
            } else {
                b1Var11 = b1Var10;
            }
            Function1 function13 = (Function1) objM11;
            final m3.b1 b1Var25 = b1Var4;
            final m3.b1 b1Var26 = b1Var5;
            android.support.v4.media.session.a.i(R.string.notification_settings_news_letter_title, R.string.notification_settings_news_letter_description, false, false, zBooleanValue, function13, sVar2, MLKEMEngine.KyberPolyBytes, 8);
            float f11 = lv.t.f28254h;
            d2.c.f(d2.m2.e(qVar, f11), sVar2);
            float f12 = 1;
            long j9 = lv.s.H;
            g3.s0.g(null, f12, j9, sVar2, 432, 1);
            float f13 = lv.t.f28253g;
            d2.c.f(d2.m2.e(qVar, f13), sVar2);
            boolean zBooleanValue2 = ((Boolean) b1Var9.getValue()).booleanValue();
            boolean zH5 = sVar2.h(hVar) | ((i12 & 57344) == 16384);
            Object objM12 = sVar2.M();
            if (zH5 || objM12 == obj3) {
                b1Var12 = b1Var11;
                Object x1Var2 = new x1(11, function0, hVar, b1Var9, b1Var12);
                sVar2.k0(x1Var2);
                objM12 = x1Var2;
            } else {
                b1Var12 = b1Var11;
            }
            m3.b1 b1Var27 = b1Var12;
            int i22 = i15;
            android.support.v4.media.session.a.i(R.string.notification_settings_calendar_reminder_title, R.string.notification_settings_calendar_reminder_description, false, false, zBooleanValue2, (Function1) objM12, sVar2, MLKEMEngine.KyberPolyBytes, 8);
            d2.c.f(d2.m2.e(qVar, f11), sVar2);
            g3.s0.g(null, f12, j9, sVar2, 432, 1);
            m3.s sVar3 = sVar2;
            d2.c.f(d2.m2.e(qVar, f13), sVar3);
            boolean z14 = (i12 & 458752) == 131072;
            Object objM13 = sVar3.M();
            if (z14 || objM13 == obj3) {
                objM13 = new hb0.o(13, (Object) function02, function12);
                sVar3.k0(objM13);
            }
            android.support.v4.media.session.a.i(R.string.notification_settings_push_notifications_title, R.string.notification_settings_push_notifications_description, false, false, z12, (Function1) objM13, sVar3, ((i12 << 3) & 57344) | MLKEMEngine.KyberPolyBytes, 8);
            d2.c.f(d2.m2.e(qVar, f11), sVar3);
            boolean z15 = z12 && ((Boolean) b1Var7.getValue()).booleanValue();
            boolean zH6 = sVar3.h(hVar);
            Object objM14 = sVar3.M();
            if (zH6 || objM14 == obj3) {
                b1Var13 = b1Var27;
                i16 = 0;
                objM14 = new Function1() { // from class: is.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        Boolean bool3 = (Boolean) obj4;
                        switch (i16) {
                            case 0:
                                boolean zBooleanValue3 = bool3.booleanValue();
                                b1Var7.setValue(bool3);
                                hs.h hVar2 = hVar;
                                hVar2.f22482k.setTransactional(zBooleanValue3);
                                z.m(b1Var13, hVar2.c());
                                break;
                            case 1:
                                boolean zBooleanValue4 = bool3.booleanValue();
                                b1Var7.setValue(bool3);
                                hs.h hVar3 = hVar;
                                hVar3.f22482k.setAnnouncements(zBooleanValue4);
                                z.m(b1Var13, hVar3.c());
                                break;
                            default:
                                boolean zBooleanValue5 = bool3.booleanValue();
                                b1Var7.setValue(bool3);
                                hs.h hVar4 = hVar;
                                hVar4.f22482k.setSupplyAlerts(zBooleanValue5);
                                z.m(b1Var13, hVar4.c());
                                break;
                        }
                        return Unit.f26487a;
                    }
                };
                sVar3.k0(objM14);
            } else {
                b1Var13 = b1Var27;
                i16 = 0;
            }
            int i23 = (i12 & 7168) | MLKEMEngine.KyberPolyBytes;
            final m3.b1 b1Var28 = b1Var13;
            int i24 = i16;
            android.support.v4.media.session.a.i(R.string.notification_settings_transactional_title, R.string.notification_settings_transactional_description, true, z12, z15, (Function1) objM14, sVar3, i23, 0);
            d2.c.f(d2.m2.e(qVar, f11), sVar3);
            boolean z16 = (z12 && ((Boolean) b1Var25.getValue()).booleanValue()) ? true : i24 == true ? 1 : 0;
            boolean zH7 = sVar3.h(hVar);
            Object objM15 = sVar3.M();
            if (zH7 || objM15 == obj3) {
                i17 = 1;
                objM15 = new Function1() { // from class: is.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        Boolean bool3 = (Boolean) obj4;
                        switch (i17) {
                            case 0:
                                boolean zBooleanValue3 = bool3.booleanValue();
                                b1Var25.setValue(bool3);
                                hs.h hVar2 = hVar;
                                hVar2.f22482k.setTransactional(zBooleanValue3);
                                z.m(b1Var28, hVar2.c());
                                break;
                            case 1:
                                boolean zBooleanValue4 = bool3.booleanValue();
                                b1Var25.setValue(bool3);
                                hs.h hVar3 = hVar;
                                hVar3.f22482k.setAnnouncements(zBooleanValue4);
                                z.m(b1Var28, hVar3.c());
                                break;
                            default:
                                boolean zBooleanValue5 = bool3.booleanValue();
                                b1Var25.setValue(bool3);
                                hs.h hVar4 = hVar;
                                hVar4.f22482k.setSupplyAlerts(zBooleanValue5);
                                z.m(b1Var28, hVar4.c());
                                break;
                        }
                        return Unit.f26487a;
                    }
                };
                sVar3.k0(objM15);
            } else {
                i17 = 1;
            }
            boolean z17 = i17;
            android.support.v4.media.session.a.i(R.string.notification_settings_essentials_title, R.string.notification_settings_essentials_description, true, z12, z16, (Function1) objM15, sVar3, i23, 0);
            d2.c.f(d2.m2.e(qVar, f11), sVar3);
            boolean z18 = (z12 && ((Boolean) b1Var26.getValue()).booleanValue()) ? z17 ? 1 : 0 : i24 == true ? 1 : 0;
            boolean zH8 = sVar3.h(hVar);
            Object objM16 = sVar3.M();
            if (zH8 || objM16 == obj3) {
                final int i25 = 2;
                objM16 = new Function1() { // from class: is.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        Boolean bool3 = (Boolean) obj4;
                        switch (i25) {
                            case 0:
                                boolean zBooleanValue3 = bool3.booleanValue();
                                b1Var26.setValue(bool3);
                                hs.h hVar2 = hVar;
                                hVar2.f22482k.setTransactional(zBooleanValue3);
                                z.m(b1Var28, hVar2.c());
                                break;
                            case 1:
                                boolean zBooleanValue4 = bool3.booleanValue();
                                b1Var26.setValue(bool3);
                                hs.h hVar3 = hVar;
                                hVar3.f22482k.setAnnouncements(zBooleanValue4);
                                z.m(b1Var28, hVar3.c());
                                break;
                            default:
                                boolean zBooleanValue5 = bool3.booleanValue();
                                b1Var26.setValue(bool3);
                                hs.h hVar4 = hVar;
                                hVar4.f22482k.setSupplyAlerts(zBooleanValue5);
                                z.m(b1Var28, hVar4.c());
                                break;
                        }
                        return Unit.f26487a;
                    }
                };
                sVar3.k0(objM16);
            }
            z13 = z12;
            android.support.v4.media.session.a.i(R.string.notification_settings_surprise_bag_alerts_title, R.string.notification_settings_surprise_bag_alerts_description, true, z13, z18, (Function1) objM16, sVar3, i23, 0);
            d2.c.f(d2.m2.e(qVar, f11), sVar3);
            DailyReminder dailyReminder = (DailyReminder) b1Var8.getValue();
            boolean zH9 = sVar3.h(hVar);
            Object objM17 = sVar3.M();
            if (zH9 || objM17 == obj3) {
                objM17 = new hb0.o(14, hVar, b1Var28);
                sVar3.k0(objM17);
            }
            a.a.f(z13, dailyReminder, (Function1) objM17, sVar3, i22 & 896);
            d2.c.f(d2.m2.e(qVar, lv.t.f28247a), sVar3);
            b4.t tVarA = d2.c.A(d2.m2.d(qVar, 1.0f), f13, lv.t.f28255i);
            String strU = o30.f0.U(sVar3, R.string.notification_settings_save_changes);
            lv.q qVar2 = lv.q.REGULAR;
            boolean zBooleanValue3 = ((Boolean) b1Var28.getValue()).booleanValue();
            int i26 = i12;
            lv.e eVar = lv.e.LARGE;
            if ((3670016 & i26) == 1048576) {
                i24 = z17 ? 1 : 0;
            }
            Object objM18 = sVar3.M();
            if (i24 != 0 || objM18 == obj3) {
                function04 = function03;
                objM18 = new j5(15, function04);
                sVar3.k0(objM18);
            } else {
                function04 = function03;
            }
            v0.n.l(tVarA, strU, null, qVar2, eVar, zBooleanValue3, false, null, null, (Function0) objM18, sVar3, 27654, 452);
            sVar3.q(z17);
            sVar = sVar3;
        } else {
            z13 = z12;
            function04 = function03;
            m3.s sVar4 = sVar2;
            sVar4.U();
            sVar = sVar4;
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            final boolean z19 = z13;
            w1VarS.f29476d = new Function2(pushNotificationsSettings, z11, z19, function0, function02, function04, function1, function12, i11) { // from class: is.g

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PushNotificationsSettings f24189b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f24190c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f24191d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ Function0 f24192e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ Function0 f24193f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ Function0 f24194g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ Function1 f24195h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ Function1 f24196i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    int iF = i.F(113246209);
                    z.l(this.f24188a, this.f24189b, this.f24190c, this.f24191d, this.f24192e, this.f24193f, this.f24194g, this.f24195h, this.f24196i, (m3.n) obj4, iF);
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final void m(m3.b1 b1Var, boolean z11) {
        b1Var.setValue(Boolean.valueOf(z11));
    }

    public static final void n(m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(594388046);
        if ((((sVar.f("There were no elements that were annotated with either @ShowkaseComposable, @ShowkaseTypography or @ShowkaseColor. If you think this is a mistake, file an issue at https://github.com/airbnb/Showkase/issues") ? 4 : 2) | i11) & 3) == 2 && sVar.B()) {
            sVar.U();
        } else {
            d2.e eVar = d2.i.f13805e;
            b4.q qVar = b4.q.f5711a;
            b4.t tVarC = d2.m2.c(qVar, 1.0f);
            sVar.b0(-483455358);
            d2.y yVarA = d2.w.a(eVar, b4.d.f5694m, sVar, 6);
            sVar.b0(-1323940314);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            u3.d dVarN = z4.c0.n(tVarC);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            b5.g gVar = b5.i.f5844g;
            if (sVar.S || !Intrinsics.areEqual(sVar.M(), Integer.valueOf(iHashCode))) {
                e0.f.y(iHashCode, sVar, iHashCode, gVar);
            }
            dVarN.invoke(new m3.k2(sVar), sVar, 0);
            sVar.b0(2058660585);
            b3.s.b(d2.c.z(qVar, ge.a.f20402b), null, null, 0L, 0L, 0.0f, u3.e.b(419974943, sVar, new ge.b()), sVar, 12582918, 126);
            sVar.q(false);
            sVar.q(true);
            sVar.q(false);
            sVar.q(false);
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new g60.a(i11, 4);
        }
    }

    public static final void p(ap.n nVar, m3.n nVar2, int i11) throws IOException {
        ap.n nVar3;
        m3.s sVar = (m3.s) nVar2;
        sVar.c0(1232127224);
        int i12 = i11 | (sVar.h(nVar) ? 4 : 2);
        int i13 = 1;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            Context context = (Context) sVar.j(c5.v0.f7390b);
            context.getClass();
            File fileCreateTempFile = File.createTempFile(e0.f.i(System.currentTimeMillis(), "rating_"), AttachmentFileResolver.TEMP_FILE_SUFFIX, context.getCacheDir());
            fileCreateTempFile.getClass();
            Uri uriForFile = FileProvider.getUriForFile(context, "com.app.tgtg", fileCreateTempFile);
            m3.b1 b1VarN = m3.i.n(nVar.f4569k, sVar, 0);
            Object value = b1VarN.getValue();
            boolean zF = sVar.f(b1VarN) | sVar.h(nVar);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (zF || objM == fVar) {
                objM = new dp.o(b1VarN, nVar, null, i13);
                sVar.k0(objM);
            }
            m3.i.h(value, (Function2) objM, sVar);
            Uri uri = (Uri) m3.i.n(nVar.K, sVar, 0).getValue();
            cp.c cVar = (cp.c) m3.i.n(nVar.M, sVar, 0).getValue();
            androidx.fragment.app.g1 g1Var = new androidx.fragment.app.g1(i13);
            boolean zH = sVar.h(nVar);
            Object objM2 = sVar.M();
            if (zH || objM2 == fVar) {
                objM2 = new dp.q(nVar, i13);
                sVar.k0(objM2);
            }
            e.n nVarN = jb.u.N(g1Var, (Function1) objM2, sVar, 0);
            androidx.fragment.app.g1 g1Var2 = new androidx.fragment.app.g1(6);
            boolean zH2 = sVar.h(nVar) | sVar.h(uriForFile);
            Object objM3 = sVar.M();
            if (zH2 || objM3 == fVar) {
                objM3 = new a3.p(27, nVar, uriForFile);
                sVar.k0(objM3);
            }
            e.n nVarN2 = jb.u.N(g1Var2, (Function1) objM3, sVar, 0);
            int i14 = dp.t.$EnumSwitchMapping$0[cVar.ordinal()];
            if (i14 == 1 || i14 == 2) {
                sVar.a0(-1336676461);
                boolean zH3 = sVar.h(nVar);
                Object objM4 = sVar.M();
                if (zH3 || objM4 == fVar) {
                    objM4 = new ap.h(nVar, 5);
                    sVar.k0(objM4);
                }
                cp.a.a(cVar, (Function0) objM4, sVar, 0);
                sVar.q(false);
            } else {
                sVar.a0(1512809187);
                sVar.q(false);
            }
            d2.g0 g0Var = d2.m2.f13850c;
            z4.u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(g0Var, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(u0VarD, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            b4.k kVar = b4.d.f5687e;
            d2.u uVar = d2.u.f13938a;
            b4.q qVar = b4.q.f5711a;
            b4.t tVarA = uVar.a(qVar, kVar);
            d2.y yVarA = d2.w.a(d2.i.f13805e, b4.d.f5695n, sVar, 54);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarA, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            r9.d(o30.f0.U(sVar, R.string.rating_category_title_picture_upload_title), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28272k, sVar, 0, 12582912, 131070);
            sVar = sVar;
            d2.c.f(d2.m2.m(qVar, lv.t.f28254h), sVar);
            nVar3 = nVar;
            s1.i.a(uri, null, null, null, null, null, u3.e.e(-847776043, sVar, new dp.s(nVar3, nVarN2, uriForFile, nVarN)), sVar, 1572864, 62);
            sVar.q(true);
            s1.i.a(uri, d2.c.z(uVar.a(qVar, b4.d.f5690h), lv.t.f28253g), null, null, null, null, u3.e.e(344888843, sVar, new ap.d(nVar3, 12)), sVar, 1572864, 60);
            sVar.q(true);
        } else {
            nVar3 = nVar;
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new dp.m(nVar3, i11, 2);
        }
    }

    public static final m3.b1 q(b2.l lVar, m3.n nVar) {
        m3.s sVar = (m3.s) nVar;
        Object objM = sVar.M();
        m3.f fVar = m3.m.f29332a;
        if (objM == fVar) {
            objM = m3.i.w(Boolean.FALSE);
            sVar.k0(objM);
        }
        m3.b1 b1Var = (m3.b1) objM;
        Object objM2 = sVar.M();
        if (objM2 == fVar) {
            objM2 = new b2.g(lVar, b1Var, null, 2);
            sVar.k0(objM2);
        }
        m3.i.h(lVar, (Function2) objM2, sVar);
        return b1Var;
    }

    public static t.q r() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            KeyGenParameterSpec.Builder builderB = t.w.b("androidxBiometric", 3);
            t.w.d(builderB);
            t.w.e(builderB);
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            t.w.c(keyGenerator, t.w.a(builderB));
            keyGenerator.generateKey();
            SecretKey secretKey = (SecretKey) keyStore.getKey("androidxBiometric", null);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, secretKey);
            return new t.q(cipher);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e5) {
            Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e5);
            return null;
        }
    }

    public static final Drawable s(Context context, int i11) {
        Drawable drawableX = a0.x(context, i11);
        if (drawableX != null) {
            return drawableX;
        }
        e40.a.g(j4.s.f(i11, "Invalid resource ID: "));
        return null;
    }

    public static String t() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
            ax.a0 a0Var = ax.a0.f4849a;
        }
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }

    public static boolean u(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String str2 = Build.MODEL;
            str2.getClass();
            String upperCase = str2.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            if (kotlin.text.y.p(upperCase, str, false)) {
                return true;
            }
        }
        return false;
    }

    public static boolean v(Context context) {
        context.getClass();
        ((ag.i) ((m70.a) o00.x0.q(m70.a.class, u00.d.t(context.getApplicationContext())))).getClass();
        int i11 = k30.m.f25911c;
        k30.d0 d0Var = k30.d0.f25887j;
        ox.h.q(d0Var.f25892h <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (d0Var.isEmpty()) {
            return true;
        }
        return ((Boolean) ((k30.d) d0Var.iterator()).next()).booleanValue();
    }

    public static final m3.b1 w(androidx.lifecycle.k0 k0Var, Object obj, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) sVar.j(w8.g.f43289a);
        Object objM = sVar.M();
        m3.f fVar = m3.m.f29332a;
        if (objM == fVar) {
            if (k0Var.f3473e != androidx.lifecycle.k0.f3468k) {
                obj = k0Var.d();
            }
            objM = m3.i.w(obj);
            sVar.k0(objM);
        }
        m3.b1 b1Var = (m3.b1) objM;
        boolean zH = sVar.h(k0Var) | sVar.h(lifecycleOwner);
        Object objM2 = sVar.M();
        if (zH || objM2 == fVar) {
            objM2 = new m2.h0(k0Var, lifecycleOwner, b1Var, 17);
            sVar.k0(objM2);
        }
        m3.i.c(k0Var, lifecycleOwner, (Function1) objM2, sVar);
        return b1Var;
    }

    public static final int x(g2.j jVar, z1.h2 h2Var) {
        return (int) (h2Var == z1.h2.Vertical ? ((g2.s) jVar).f18244t & 4294967295L : ((g2.s) jVar).f18244t >> 32);
    }

    public static final int y(a.a aVar, ad.g gVar) {
        if (aVar instanceof ad.a) {
            return ((ad.a) aVar).f1221b;
        }
        int i11 = ed.a.$EnumSwitchMapping$1[gVar.ordinal()];
        if (i11 == 1) {
            return Integer.MIN_VALUE;
        }
        if (i11 == 2) {
            return Integer.MAX_VALUE;
        }
        e40.a.f();
        return 0;
    }

    public static final long z(long j9) {
        return (((long) Float.floatToRawIntBits((int) (j9 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j9 >> 32)) << 32);
    }
}
