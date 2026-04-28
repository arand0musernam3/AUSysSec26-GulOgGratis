package o30;

import a3.u2;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.text.Spanned;
import android.view.DragEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.ExtractedText;
import androidx.activity.ComponentActivity;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialCustomException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialInterruptedException;
import androidx.credentials.exceptions.CreateCredentialNoCreateOptionException;
import androidx.credentials.exceptions.CreateCredentialProviderConfigurationException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.CreateCredentialUnsupportedException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialCustomException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import androidx.credentials.exceptions.NoCredentialException;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialException;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.s1;
import androidx.navigation.fragment.NavHostFragment;
import c5.x1;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.item.Ingredient;
import com.app.tgtg.model.remote.item.ItemTag;
import com.app.tgtg.model.remote.item.ItemTagInfo;
import com.app.tgtg.model.remote.item.Picture;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import com.app.tgtg.model.remote.manufacturer.response.Brand;
import com.app.tgtg.model.remote.manufacturer.response.CateringProperties;
import com.app.tgtg.model.remote.manufacturer.response.ManufacturerItemProperties;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.user.response.Address;
import com.google.android.gms.internal.measurement.cg;
import d2.h2;
import d2.i2;
import d2.k2;
import d2.m2;
import d2.n1;
import d2.w2;
import d2.z1;
import g3.n5;
import g3.o6;
import g3.q5;
import g3.r9;
import g3.s5;
import h2.t1;
import h2.u1;
import j5.b0;
import j5.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty0;
import kotlin.text.StringsKt;
import m3.c3;
import m3.d3;
import m3.v1;
import m3.w1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import v1.o1;
import z1.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f31871a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f31872b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f31873c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f31874d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f31875e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f31876f = 0;

    public static final boolean A(BaseItemMnuV2 baseItemMnuV2) {
        baseItemMnuV2.getClass();
        return baseItemMnuV2.getAvailableStock() > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0118 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object B(android.content.Context r14, le.s r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, z70.c r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o30.e0.B(android.content.Context, le.s, java.lang.String, java.lang.String, java.lang.String, java.lang.String, z70.c):java.lang.Object");
    }

    public static final he.f0 C(Context context, le.s sVar, String str) {
        if (sVar instanceof le.r) {
            int i11 = 0;
            if (!Intrinsics.areEqual(str, "__LottieInternalDefaultCacheKey__")) {
                return he.o.a(str, new he.l(context, ((le.r) sVar).f27750a, str, i11), null);
            }
            String str2 = ((le.r) sVar).f27750a;
            HashMap map = he.o.f21952a;
            String strConcat = "url_".concat(str2);
            return he.o.a(strConcat, new he.l(context, str2, strConcat, i11), null);
        }
        if (!(sVar instanceof le.q)) {
            e40.a.f();
            return null;
        }
        if (Intrinsics.areEqual(str, "__LottieInternalDefaultCacheKey__")) {
            return he.o.b(context, ((le.q) sVar).f27749a);
        }
        String str3 = ((le.q) sVar).f27749a;
        HashMap map2 = he.o.f21952a;
        return he.o.a(str, new he.l(context.getApplicationContext(), str3, str, 1), null);
    }

    public static final le.p D(le.s sVar, m3.n nVar, int i11) {
        m3.s sVar2 = (m3.s) nVar;
        sVar2.b0(-1248473602);
        le.v vVar = new le.v(3, null, 0);
        Context context = (Context) sVar2.j(c5.v0.f7390b);
        sVar2.b0(1388713953);
        int i12 = (i11 & 14) ^ 6;
        boolean z11 = true;
        boolean z12 = (i12 > 4 && sVar2.f(sVar)) || (i11 & 6) == 4;
        Object objM = sVar2.M();
        m3.f fVar = m3.m.f29332a;
        if (z12 || objM == fVar) {
            objM = m3.i.w(new le.p());
            sVar2.k0(objM);
        }
        m3.b1 b1Var = (m3.b1) objM;
        sVar2.q(false);
        sVar2.b0(1388714244);
        if ((i12 <= 4 || !sVar2.f(sVar)) && (i11 & 6) != 4) {
            z11 = false;
        }
        boolean zF = sVar2.f("__LottieInternalDefaultCacheKey__") | z11;
        Object objM2 = sVar2.M();
        if (zF || objM2 == fVar) {
            objM2 = C(context, sVar, "__LottieInternalDefaultCacheKey__");
            sVar2.k0(objM2);
        }
        sVar2.q(false);
        m3.i.g(sVar, "__LottieInternalDefaultCacheKey__", new bn.e(vVar, context, sVar, b1Var, null), sVar2);
        le.p pVar = (le.p) b1Var.getValue();
        sVar2.q(false);
        return pVar;
    }

    public static final double E(double d3) {
        if (Math.abs(d3) > Double.MAX_VALUE) {
            return d3;
        }
        double dPow = Math.pow(10.0d, 1);
        return Math.rint(d3 * dPow) / dPow;
    }

    public static final ExtractedText F(r5.y yVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = yVar.f37714a.f29538b;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j9 = yVar.f37715b;
        extractedText.selectionStart = m5.t0.g(j9);
        extractedText.selectionEnd = m5.t0.f(j9);
        extractedText.flags = !StringsKt.A(yVar.f37714a.f29538b, '\n') ? 1 : 0;
        return extractedText;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final CreateCredentialException G(CharSequence charSequence, String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -2055374133:
                if (str.equals("android.credentials.CreateCredentialException.TYPE_USER_CANCELED")) {
                    return new CreateCredentialCancellationException(charSequence);
                }
                break;
            case -1166690414:
                if (str.equals("androidx.credentials.TYPE_CREATE_CREDENTIAL_UNSUPPORTED_EXCEPTION")) {
                    return new CreateCredentialUnsupportedException(charSequence);
                }
                break;
            case -580283253:
                if (str.equals("androidx.credentials.TYPE_CREATE_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION")) {
                    return new CreateCredentialProviderConfigurationException(charSequence);
                }
                break;
            case 1316905704:
                if (str.equals("android.credentials.CreateCredentialException.TYPE_UNKNOWN")) {
                    return new CreateCredentialUnknownException(charSequence);
                }
                break;
            case 2092588512:
                if (str.equals("android.credentials.CreateCredentialException.TYPE_INTERRUPTED")) {
                    return new CreateCredentialInterruptedException(charSequence);
                }
                break;
            case 2131915191:
                if (str.equals("android.credentials.CreateCredentialException.TYPE_NO_CREATE_OPTIONS")) {
                    return new CreateCredentialNoCreateOptionException(charSequence);
                }
                break;
        }
        if (!kotlin.text.y.p(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
            return new CreateCredentialCustomException(charSequence, str);
        }
        int i11 = CreatePublicKeyCredentialException.f2804b;
        String string = charSequence != null ? charSequence.toString() : null;
        try {
            if (!StringsKt.z(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                throw new FrameworkClassParsingException();
            }
            int i12 = CreatePublicKeyCredentialDomException.f2803c;
            return m0.c.X(str, string);
        } catch (FrameworkClassParsingException unused) {
            return new CreateCredentialCustomException(string, str);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final GetCredentialException H(CharSequence charSequence, String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -781118336:
                if (str.equals("android.credentials.GetCredentialException.TYPE_UNKNOWN")) {
                    return new GetCredentialUnknownException(charSequence);
                }
                break;
            case -408155724:
                if (str.equals("androidx.credentials.TYPE_GET_CREDENTIAL_UNSUPPORTED_EXCEPTION")) {
                    return new GetCredentialUnsupportedException(charSequence);
                }
                break;
            case -45448328:
                if (str.equals("android.credentials.GetCredentialException.TYPE_INTERRUPTED")) {
                    return new GetCredentialInterruptedException(charSequence);
                }
                break;
            case 580557411:
                if (str.equals("android.credentials.GetCredentialException.TYPE_USER_CANCELED")) {
                    return new GetCredentialCancellationException(charSequence);
                }
                break;
            case 627896683:
                if (str.equals("android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL")) {
                    return new NoCredentialException(charSequence);
                }
                break;
            case 1594095913:
                if (str.equals("androidx.credentials.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION")) {
                    return new GetCredentialProviderConfigurationException(charSequence);
                }
                break;
        }
        if (!kotlin.text.y.p(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
            return new GetCredentialCustomException(charSequence, str);
        }
        int i11 = GetPublicKeyCredentialException.f2806b;
        String string = charSequence != null ? charSequence.toString() : null;
        try {
            if (!kotlin.text.y.p(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                throw new FrameworkClassParsingException();
            }
            int i12 = GetPublicKeyCredentialDomException.f2805c;
            return nx.d.o(str, string);
        } catch (FrameworkClassParsingException unused) {
            return new GetCredentialCustomException(string, str);
        }
    }

    public static int I(int i11) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i11) * (-862048943)), 15)) * 461845907);
    }

    public static final void a(final wq.a aVar, m3.n nVar, int i11) {
        final wq.a aVar2;
        aVar.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1152568507);
        int i12 = i11 | (sVar.h(aVar) ? 4 : 2);
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            float f11 = lv.t.f28252f;
            b4.q qVar = b4.q.f5711a;
            b4.t tVarD = d2.c.D(qVar, 0.0f, f11, 0.0f, 0.0f, 13);
            d2.d dVar = d2.i.f13803c;
            b4.i iVar = b4.d.f5694m;
            d2.y yVarA = d2.w.a(dVar, iVar, sVar, 0);
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
            b5.g gVar = b5.i.f5843f;
            m3.i.C(yVarA, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar2 = b5.i.f5845h;
            m3.i.z(sVar, dVar2);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            float f12 = 12;
            b4.t tVarA = d2.c.A(m2.t(m2.d(v1.n.j(v1.n.k(qVar, 1, lv.s.I, l2.g.b(f12)), lv.s.J, l2.g.b(f12)), 1.0f), 3), lv.t.f28253g, lv.t.f28254h);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5692j, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarA, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar2);
            m3.i.C(tVarC2, gVar4, sVar);
            v1.n.d(o00.x0.z(aVar.f43516a, sVar, 0), null, new w2(b4.d.f5693k), null, null, 0.0f, null, sVar, 56, 120);
            b4.t tVarD2 = d2.c.D(qVar, f11, 0.0f, 0.0f, 0.0f, 14);
            d2.y yVarA2 = d2.w.a(dVar, iVar, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            b4.t tVarC3 = b4.a.c(tVarD2, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA2, gVar, sVar);
            m3.i.C(iVarL3, gVar2, sVar);
            w.a0.y(iHashCode3, sVar, gVar3, sVar, dVar2);
            m3.i.C(tVarC3, gVar4, sVar);
            b4.t tVarD3 = d2.c.D(m2.d(qVar, 1.0f), 0.0f, lv.t.f28249c, 0.0f, 0.0f, 13);
            boolean zH = sVar.h(aVar);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (zH || objM == fVar) {
                final int i13 = 0;
                objM = new Function1() { // from class: vq.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        b0 b0Var = (b0) obj;
                        switch (i13) {
                            case 0:
                                b0Var.getClass();
                                wq.a aVar3 = aVar;
                                String str = aVar3.f43518c;
                                if (str == null) {
                                    str = aVar3.f43517b;
                                }
                                z.h(str, b0Var);
                                break;
                            default:
                                b0Var.getClass();
                                wq.a aVar4 = aVar;
                                String str2 = aVar4.f43520e;
                                if (str2 == null) {
                                    str2 = aVar4.f43519d;
                                }
                                z.h(str2, b0Var);
                                break;
                        }
                        return Unit.f26487a;
                    }
                };
                sVar.k0(objM);
            }
            r9.d(aVar.f43517b, j5.r.c(tVarD3, false, (Function1) objM), lv.s.f28217b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28271j, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
            b4.t tVarD4 = d2.c.D(m2.d(qVar, 1.0f), 0.0f, lv.t.f28251e, 0.0f, 0.0f, 13);
            aVar2 = aVar;
            boolean zH2 = sVar.h(aVar2);
            Object objM2 = sVar.M();
            if (zH2 || objM2 == fVar) {
                final int i14 = 1;
                objM2 = new Function1() { // from class: vq.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        b0 b0Var = (b0) obj;
                        switch (i14) {
                            case 0:
                                b0Var.getClass();
                                wq.a aVar3 = aVar2;
                                String str = aVar3.f43518c;
                                if (str == null) {
                                    str = aVar3.f43517b;
                                }
                                z.h(str, b0Var);
                                break;
                            default:
                                b0Var.getClass();
                                wq.a aVar4 = aVar2;
                                String str2 = aVar4.f43520e;
                                if (str2 == null) {
                                    str2 = aVar4.f43519d;
                                }
                                z.h(str2, b0Var);
                                break;
                        }
                        return Unit.f26487a;
                    }
                };
                sVar.k0(objM2);
            }
            r9.d(aVar2.f43519d, j5.r.c(tVarD4, false, (Function1) objM2), lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
            sVar = sVar;
            e0.f.D(sVar, true, true, true);
        } else {
            aVar2 = aVar;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new pm.m(aVar2, i11, 22);
        }
    }

    public static final void b(BaseItemMnuV2 baseItemMnuV2, String str, String str2, String str3, ym.y yVar, m3.n nVar, int i11) {
        int i12;
        baseItemMnuV2.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(852974901);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(baseItemMnuV2) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(str) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.f(str2) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.f(str3) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= (32768 & i11) == 0 ? sVar.f(yVar) : sVar.h(yVar) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if (sVar.R(i12 & 1, (i12 & 9363) != 9362)) {
            float f11 = lv.t.f28253g;
            b4.t tVarC = d2.c.C(b4.q.f5711a, f11, lv.t.f28249c, f11, lv.t.f28251e);
            z4.u0 u0VarD = d2.p.d(b4.d.f5683a, false);
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
            m3.i.C(u0VarD, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC2, b5.i.f5841d, sVar);
            d3 d3Var = x1.f7416h;
            m3.i.b(new v1[]{b3.i.t(((z5.c) sVar.j(d3Var)).a(), 1.0f, d3Var), s5.f19473a.a(cg.j.t())}, u3.e.e(-943315845, sVar, new ap.b(yVar, baseItemMnuV2, str, str2, str3, 3)), sVar, 56);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cm.a(baseItemMnuV2, str, str2, str3, yVar, i11, 2);
        }
    }

    public static final void c(BaseItemMnuV2 baseItemMnuV2, ym.y yVar, m3.n nVar, int i11) {
        BaseItemMnuV2 baseItemMnuV22;
        ym.y yVar2;
        Price bottleDeposit;
        baseItemMnuV2.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1243260252);
        int i12 = (sVar.h(baseItemMnuV2) ? 4 : 2) | i11 | (sVar.f(yVar) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            Price itemPrice = baseItemMnuV2.getItemPrice();
            String strI = null;
            String strI2 = itemPrice != null ? mv.d.i(itemPrice, 1) : null;
            Price itemValue = baseItemMnuV2.getItemValue();
            String strI3 = itemValue != null ? mv.d.i(itemValue, 1) : null;
            ManufacturerItemProperties manufacturerItemProperties = baseItemMnuV2.getManufacturerItemProperties();
            if (manufacturerItemProperties != null && (bottleDeposit = manufacturerItemProperties.getBottleDeposit()) != null) {
                strI = mv.d.i(bottleDeposit, 1);
            }
            yVar2 = yVar;
            String str = strI3;
            String str2 = strI;
            String str3 = strI2;
            baseItemMnuV22 = baseItemMnuV2;
            b(baseItemMnuV22, str3, str, str2, yVar2, sVar, (i12 & 14) | ((i12 << 9) & 57344));
        } else {
            baseItemMnuV22 = baseItemMnuV2;
            yVar2 = yVar;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new u2(baseItemMnuV22, yVar2, i11, 7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.util.List] */
    public static final void d(BaseItemMnuV2 baseItemMnuV2, m3.n nVar, int i11) {
        Brand brand;
        Picture brandLogo;
        CateringProperties cateringProperties;
        Picture storeLogo;
        ?? arrayList;
        b4.k kVar = b4.d.f5683a;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-2096289916);
        int i12 = (sVar.h(baseItemMnuV2) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            float f11 = lv.t.f28249c;
            b4.q qVar = b4.q.f5711a;
            b4.t tVarZ = d2.c.z(qVar, f11);
            z4.u0 u0VarD = d2.p.d(kVar, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarZ, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            b4.t tVarA = f4.g.a(f4.g.b(m2.d(m2.e(qVar, 160), 1.0f), l2.g.b(8)), A(baseItemMnuV2) ? 1.0f : 0.4f);
            Picture coverPicture = baseItemMnuV2.getCoverPicture();
            String currentUrl = null;
            String currentUrl2 = coverPicture != null ? coverPicture.getCurrentUrl() : null;
            z4.c1 c1Var = z4.l.f47166a;
            gd.o.a(currentUrl2, null, tVarA, c1Var, sVar, 1572912, 0, 1976);
            List<ItemTagInfo> tags = baseItemMnuV2.getTags();
            d2.u uVar = d2.u.f13938a;
            if (tags == null || tags.isEmpty()) {
                sVar.a0(-502054716);
                sVar.q(false);
            } else {
                sVar.a0(-502539060);
                List<ItemTagInfo> tags2 = baseItemMnuV2.getTags();
                if (tags2 == null || !tags2.isEmpty()) {
                    Iterator it = tags2.iterator();
                    while (it.hasNext()) {
                        if (((ItemTagInfo) it.next()).getId() == ItemTag.FREE_DELIVERY) {
                            List<ItemTagInfo> tags3 = baseItemMnuV2.getTags();
                            arrayList = new ArrayList();
                            for (Object obj : tags3) {
                                if (((ItemTagInfo) obj).getId() != ItemTag.FREE_DELIVERY) {
                                    arrayList.add(obj);
                                }
                            }
                            b4.t tVarD = b4.a.d(uVar.a(qVar, kVar), 1.0f);
                            float f12 = lv.t.f28251e;
                            bg.m.d(d2.c.v(tVarD, f12, f12), arrayList, null, sVar, 0, 4);
                            sVar = sVar;
                            sVar.q(false);
                        }
                    }
                    arrayList = baseItemMnuV2.getTags();
                    b4.t tVarD2 = b4.a.d(uVar.a(qVar, kVar), 1.0f);
                    float f122 = lv.t.f28251e;
                    bg.m.d(d2.c.v(tVarD2, f122, f122), arrayList, null, sVar, 0, 4);
                    sVar = sVar;
                    sVar.q(false);
                } else {
                    arrayList = baseItemMnuV2.getTags();
                    b4.t tVarD22 = b4.a.d(uVar.a(qVar, kVar), 1.0f);
                    float f1222 = lv.t.f28251e;
                    bg.m.d(d2.c.v(tVarD22, f1222, f1222), arrayList, null, sVar, 0, 4);
                    sVar = sVar;
                    sVar.q(false);
                }
            }
            int i13 = cn.d0.$EnumSwitchMapping$0[baseItemMnuV2.getItemType().ordinal()];
            if (i13 == 1) {
                ManufacturerItemProperties manufacturerItemProperties = baseItemMnuV2.getManufacturerItemProperties();
                if (manufacturerItemProperties != null && (brand = manufacturerItemProperties.getBrand()) != null && (brandLogo = brand.getBrandLogo()) != null) {
                    currentUrl = brandLogo.getCurrentUrl();
                }
            } else if (i13 == 2 && (cateringProperties = baseItemMnuV2.getCateringProperties()) != null && (storeLogo = cateringProperties.getStoreLogo()) != null) {
                currentUrl = storeLogo.getCurrentUrl();
            }
            String str = currentUrl;
            if (str == null) {
                sVar.a0(-501761116);
                sVar.q(false);
            } else {
                sVar.a0(-501761115);
                b4.t tVarM = m2.m(qVar, 48);
                float f13 = lv.t.f28251e;
                b4.t tVarA2 = uVar.a(d2.c.v(tVarM, f13, -f13), b4.d.f5689g);
                l2.f fVar = l2.g.f26790a;
                gd.o.a(str, null, f4.g.a(v1.n.k(f4.g.b(tVarA2, fVar), 1, lv.s.I, fVar), A(baseItemMnuV2) ? 1.0f : 0.4f), c1Var, sVar, 1572912, 0, 1976);
                sVar.q(false);
            }
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.g(baseItemMnuV2, i11, 9);
        }
    }

    public static final void e(int i11, b4.t tVar, String str, String str2, m3.n nVar) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1863202648);
        int i12 = (sVar.f(tVar) ? 4 : 2) | i11 | (sVar.f(str) ? 32 : 16) | (sVar.f(str2) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            float f11 = 1;
            g3.s0.b(tVar, l2.g.b(lv.t.f28252f), g3.s0.p(lv.s.J, sVar, 6), g3.s0.v(f11), v1.n.b(f11, lv.s.H), u3.e.e(-1190257590, sVar, new ph.c(str, str2, 1)), sVar, (i12 & 14) | 221184, 0);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new lp.p(i11, 2, tVar, str, str2);
        }
    }

    public static final void f(b4.t tVar, String str, m3.n nVar, int i11) {
        b4.t tVar2;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1584494335);
        int i12 = (sVar.f(tVar) ? 4 : 2) | i11 | (sVar.f(str) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            float f11 = 1;
            v1.a0 a0VarB = v1.n.b(f11, lv.s.H);
            g3.v vVarV = g3.s0.v(f11);
            tVar2 = tVar;
            g3.s0.b(tVar2, l2.g.b(lv.t.f28252f), g3.s0.p(lv.s.J, sVar, 6), vVarV, a0VarB, u3.e.e(-937093939, sVar, new o6(str, 6)), sVar, (i12 & 14) | 221184, 0);
        } else {
            tVar2 = tVar;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cp.g(str, tVar2, i11, 6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(com.app.tgtg.model.remote.item.response.BaseItemMnuV2 r32, m3.n r33, int r34) {
        /*
            Method dump skipped, instruction units count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o30.e0.g(com.app.tgtg.model.remote.item.response.BaseItemMnuV2, m3.n, int):void");
    }

    public static final void h(nk.d dVar, m3.n nVar, int i11) {
        boolean z11;
        String strJ;
        boolean z12;
        dVar.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(133106969);
        int i12 = (sVar.f(dVar) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            Ingredient ingredient = dVar.f30980a;
            boolean z13 = dVar.f30982c;
            int i13 = dVar.f30981b;
            r9.d(m5.k0.c(ingredient.getName(), t5.d.f39798a.k().b()), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28271j, sVar, 0, 12582912, 131070);
            float f11 = lv.t.f28253g;
            b4.q qVar = b4.q.f5711a;
            d2.c.f(m2.m(qVar, f11), sVar);
            gd.o.c(ingredient.getImageUrl(), null, m2.m(qVar, 120), null, o00.x0.z(R.drawable.ingredients_fallback, sVar, 0), o00.x0.z(R.drawable.ingredients_fallback, sVar, 0), z4.l.f47167b, 0.0f, null, sVar, 295344, 6, 31688);
            d2.c.f(m2.m(qVar, f11), sVar);
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(qVar, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
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
            b5.d dVar2 = b5.i.f5845h;
            m3.i.z(sVar, dVar2);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5692j, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(qVar, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar2);
            m3.i.C(tVarC2, gVar4, sVar);
            String strG = f0.G(R.plurals.item_view_ingredients_explainer_review, i13, new Object[]{Integer.valueOf(i13)}, sVar);
            k2 k2Var = k2.f13824a;
            e(0, k2Var.a(1.0f, qVar, true), strG, String.valueOf(i13), sVar);
            d2.c.f(m2.m(qVar, lv.t.f28251e), sVar);
            if (z13) {
                sVar.a0(-833410049);
                String strA = d70.a.a(ingredient.getProbabilityPercentage(), sVar);
                z12 = true;
                z11 = false;
                e(0, k2Var.a(1.0f, qVar, true), f0.T(R.string.item_view_ingredients_explainer_probability, new Object[]{strA}, sVar), strA, sVar);
                sVar.q(false);
            } else {
                sVar.a0(-832921148);
                b4.t tVarA = k2Var.a(1.0f, qVar, true);
                int probabilityPercentage = (int) (ingredient.getProbabilityPercentage() * ((double) 100));
                if (20 > probabilityPercentage || probabilityPercentage >= 31) {
                    z11 = false;
                    z11 = false;
                    z11 = false;
                    if (31 <= probabilityPercentage && probabilityPercentage < 71) {
                        strJ = b3.i.j(-1455223685, R.string.item_view_ingredients_label_bracket_medium, sVar, sVar, false);
                    } else if (71 > probabilityPercentage || probabilityPercentage >= 101) {
                        sVar.a0(2132874630);
                        sVar.q(false);
                        strJ = "";
                    } else {
                        strJ = b3.i.j(-1455220807, R.string.item_view_ingredients_label_bracket_high, sVar, sVar, false);
                    }
                } else {
                    z11 = false;
                    strJ = b3.i.j(-1455226440, R.string.item_view_ingredients_label_bracket_low, sVar, sVar, false);
                }
                f(tVarA, strJ, sVar, z11 ? 1 : 0);
                sVar.q(z11);
                z12 = true;
            }
            sVar.q(z12);
            d2.c.f(m2.m(qVar, f11), sVar);
            r9.d(z13 ? b3.i.j(671648510, R.string.item_view_ingredients_explainer_body, sVar, sVar, z11) : b3.i.j(671739123, R.string.item_view_ingredients_explainer_body_when_label, sVar, sVar, z11), null, 0L, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar, 0, 12582912, 130046);
            sVar = sVar;
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new pm.m(dVar, i11, 10);
        }
    }

    public static final void i(b4.t tVar, g2.b0 b0Var, g2.c cVar, z1 z1Var, l1 l1Var, boolean z11, o1 o1Var, d2.h hVar, d2.f fVar, Function1 function1, m3.n nVar, int i11, int i12) {
        int i13;
        int i14;
        g2.b0 b0Var2;
        m3.s sVar;
        int i15;
        Object pVar;
        boolean z12;
        boolean z13;
        g2.b0 b0Var3;
        KProperty0 kProperty0;
        boolean z14;
        b4.t tVarM;
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(708740370);
        if ((i11 & 6) == 0) {
            i13 = (sVar2.f(tVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= sVar2.f(b0Var) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i13 |= (i11 & 512) == 0 ? sVar2.f(cVar) : sVar2.h(cVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= sVar2.f(z1Var) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= sVar2.g(false) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((i11 & 196608) == 0) {
            i13 |= sVar2.g(true) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i13 |= sVar2.f(l1Var) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i13 |= sVar2.g(z11) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= sVar2.f(o1Var) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= sVar2.f(hVar) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i14 = i12 | (sVar2.f(fVar) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= sVar2.h(function1) ? 32 : 16;
        }
        if (sVar2.R(i13 & 1, ((i13 & 306783379) == 306783378 && (i14 & 19) == 18) ? false : true)) {
            sVar2.W();
            if ((i11 & 1) != 0 && !sVar2.z()) {
                sVar2.U();
            }
            sVar2.r();
            int i16 = i13 >> 3;
            int i17 = i16 & 14;
            int i18 = i17 | (i14 & 112);
            m3.b1 b1VarB = m3.i.B(function1, sVar2);
            boolean z15 = (((i18 & 14) ^ 6) > 4 && sVar2.f(b0Var)) || (i18 & 6) == 4;
            Object objM = sVar2.M();
            m3.f fVar2 = m3.m.f29332a;
            if (z15 || objM == fVar2) {
                m3.f fVar3 = m3.f.f29273e;
                i15 = i13;
                objM = new a90.k(0, m3.i.r(new ep.l(9, m3.i.r(new bm.j(b1VarB, 18), fVar3), b0Var), fVar3), c3.class, "value", "getValue()Ljava/lang/Object;", 2);
                sVar2.k0(objM);
            } else {
                i15 = i13;
            }
            KProperty0 kProperty02 = (KProperty0) objM;
            int i19 = i17 | ((i15 >> 9) & 112);
            boolean z16 = ((((i19 & 112) ^ 48) > 32 && sVar2.g(false)) || (i19 & 48) == 32) | ((((i19 & 14) ^ 6) > 4 && sVar2.f(b0Var)) || (i19 & 6) == 4);
            Object objM2 = sVar2.M();
            if (z16 || objM2 == fVar2) {
                objM2 = new g2.d0(b0Var);
                sVar2.k0(objM2);
            }
            g2.d0 d0Var = (g2.d0) objM2;
            Object objM3 = sVar2.M();
            if (objM3 == fVar2) {
                objM3 = m3.i.o(kotlin.coroutines.g.f26549a, sVar2);
                sVar2.k0(objM3);
            }
            v80.b0 b0Var4 = (v80.b0) objM3;
            i4.e0 e0Var = (i4.e0) sVar2.j(x1.f7415g);
            t1 t1Var = !((Boolean) sVar2.j(x1.f7429v)).booleanValue() ? u1.f21238a : null;
            int i21 = (i15 & 524272) | ((i14 << 18) & 3670016) | ((i15 >> 6) & 29360128);
            boolean zF = ((((i21 & 29360128) ^ 12582912) > 8388608 && sVar2.f(hVar)) || (i21 & 12582912) == 8388608) | ((((i21 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 && sVar2.f(cVar)) || (i21 & MLKEMEngine.KyberPolyBytes) == 256) | ((((i21 & 112) ^ 48) > 32 && sVar2.f(b0Var)) || (i21 & 48) == 32) | ((((i21 & 7168) ^ 3072) > 2048 && sVar2.f(z1Var)) || (i21 & 3072) == 2048) | ((((57344 & i21) ^ 24576) > 16384 && sVar2.g(false)) || (i21 & 24576) == 16384) | ((((458752 & i21) ^ 196608) > 131072 && sVar2.g(true)) || (i21 & 196608) == 131072) | ((((i21 & 3670016) ^ 1572864) > 1048576 && sVar2.f(fVar)) || (i21 & 1572864) == 1048576) | sVar2.f(e0Var);
            Object objM4 = sVar2.M();
            if (zF || objM4 == fVar2) {
                z12 = false;
                z13 = true;
                pVar = new g2.p(b0Var, z1Var, kProperty02, cVar, hVar, fVar, b0Var4, e0Var, t1Var);
                b0Var3 = b0Var;
                kProperty0 = kProperty02;
                sVar2.k0(pVar);
            } else {
                b0Var3 = b0Var;
                pVar = objM4;
                kProperty0 = kProperty02;
                z12 = false;
                z13 = true;
            }
            h2.p0 p0Var = (h2.p0) pVar;
            z1.h2 h2Var = z1.h2.Vertical;
            if (z11) {
                sVar2.a0(27281635);
                boolean z17 = (((i17 ^ 6) <= 4 || !sVar2.f(b0Var3)) && (i16 & 6) != 4) ? z12 : z13;
                Object objM5 = sVar2.M();
                if (z17 || objM5 == fVar2) {
                    objM5 = new g2.d(b0Var3);
                    sVar2.k0(objM5);
                }
                z14 = false;
                tVarM = h2.q.m((g2.d) objM5, b0Var3.f18138n, false, h2Var);
                sVar2.q(z12);
            } else {
                z14 = false;
                sVar2.a0(27577840);
                sVar2.q(z12);
                tVarM = b4.q.f5711a;
            }
            KProperty0 kProperty03 = kProperty0;
            g2.b0 b0Var5 = b0Var3;
            b4.t tVarS = v1.n.s(h2.q.n(tVar.then(b0Var3.f18136k).then(b0Var3.l), kProperty0, d0Var, h2Var, z11, z14).then(tVarM).then(b0Var3.f18137m.f21125k), b0Var5, h2Var, o1Var, z11, z14, l1Var, b0Var3.f18131f, null);
            b0Var2 = b0Var5;
            sVar = sVar2;
            h2.q.a(kProperty03, tVarS, b0Var2.f18139o, p0Var, sVar, 0);
        } else {
            b0Var2 = b0Var;
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new g2.m(tVar, b0Var2, cVar, z1Var, l1Var, z11, o1Var, hVar, fVar, function1, i11, i12);
        }
    }

    public static final void j(b4.t tVar, jl.c cVar, boolean z11, Function2 function2, m3.n nVar, int i11) {
        Function2 function22;
        b4.q qVar;
        jl.b bVar;
        x5.l lVar;
        b5.h hVar;
        b5.g gVar;
        b5.g gVar2;
        int i12;
        b4.q qVar2;
        m3.f fVar;
        int i13;
        int i14;
        boolean z12;
        m3.f fVar2;
        int i15;
        String displayName;
        b5.h hVar2;
        boolean z13;
        jl.c cVar2 = cVar;
        cVar2.getClass();
        function2.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-484189241);
        int i16 = (i11 & 6) == 0 ? (sVar.f(tVar) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i16 |= sVar.h(cVar2) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= sVar.g(z11) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i16 |= sVar.h(function2) ? NewHope.SENDB_BYTES : 1024;
        }
        if (sVar.R(i16 & 1, (i16 & 1171) != 1170)) {
            b4.t tVarD = m2.d(tVar, 1.0f);
            d2.d dVar = d2.i.f13803c;
            b4.i iVar = b4.d.f5694m;
            d2.y yVarA = d2.w.a(dVar, iVar, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarD, sVar);
            b5.j.R.getClass();
            b5.h hVar3 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar3);
            } else {
                sVar.n0();
            }
            b5.g gVar3 = b5.i.f5843f;
            m3.i.C(yVarA, gVar3, sVar);
            b5.g gVar4 = b5.i.f5842e;
            m3.i.C(iVarL, gVar4, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar5 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar5);
            b5.d dVar2 = b5.i.f5845h;
            m3.i.z(sVar, dVar2);
            b5.g gVar6 = b5.i.f5841d;
            m3.i.C(tVarC, gVar6, sVar);
            float f11 = lv.t.f28253g;
            b4.q qVar3 = b4.q.f5711a;
            b4.t tVarD2 = m2.d(d2.c.B(qVar3, 0.0f, f11, 1), 1.0f);
            cn.c0 c0Var = new cn.c0(2, function2);
            c5.s sVar2 = c5.m2.f7291a;
            b4.t tVarA = b4.a.a(tVarD2, sVar2, c0Var);
            d2.e eVar = d2.i.f13807g;
            b4.j jVar = b4.d.f5693k;
            i2 i2VarA = h2.a(eVar, jVar, sVar, 54);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarA, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar3);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, gVar3, sVar);
            m3.i.C(iVarL2, gVar4, sVar);
            w.a0.y(iHashCode2, sVar, gVar5, sVar, dVar2);
            m3.i.C(tVarC2, gVar6, sVar);
            int i17 = cVar2.f25300b;
            Address address = cVar2.f25302d;
            List<op.l> list = cVar2.f25307i;
            jl.b bVar2 = cVar2.f25299a;
            int i18 = i16;
            g3.i2.a(o00.x0.z(i17, sVar, 0), null, d2.c.D(qVar3, 0.0f, 0.0f, lv.t.f28252f, 0.0f, 11), i4.v.f23315h, sVar, 3512, 0);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            n1 n1Var = new n1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            float f12 = lv.t.f28249c;
            d2.y yVarA2 = d2.w.a(d2.i.g(f12), iVar, sVar, 6);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            b4.t tVarC3 = b4.a.c(n1Var, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar3);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA2, gVar3, sVar);
            m3.i.C(iVarL3, gVar4, sVar);
            w.a0.y(iHashCode3, sVar, gVar5, sVar, dVar2);
            m3.i.C(tVarC3, gVar6, sVar);
            r9.d(cVar.f25301c, null, lv.s.C, 0L, null, 0L, null, new x5.k(1), 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 130042);
            sVar = sVar;
            x5.l lVar2 = x5.l.f43854c;
            if (address == null || (displayName = address.getDisplayName()) == null || !(!StringsKt.H(displayName))) {
                qVar = qVar3;
                bVar = bVar2;
                lVar = lVar2;
                hVar = hVar3;
                gVar = gVar3;
                gVar2 = gVar6;
                sVar.a0(-67474773);
                sVar.q(false);
            } else {
                sVar.a0(-68948544);
                b4.t tVarD3 = d2.c.D(m2.d(qVar3, 1.0f), 0.0f, 0.0f, lv.t.f28254h, 0.0f, 11);
                i2 i2VarA2 = h2.a(d2.i.f13801a, jVar, sVar, 48);
                int iHashCode4 = Long.hashCode(sVar.T);
                u3.i iVarL4 = sVar.l();
                b4.t tVarC4 = b4.a.c(tVarD3, sVar);
                sVar.e0();
                if (sVar.S) {
                    hVar2 = hVar3;
                    sVar.k(hVar2);
                } else {
                    hVar2 = hVar3;
                    sVar.n0();
                }
                m3.i.C(i2VarA2, gVar3, sVar);
                m3.i.C(iVarL4, gVar4, sVar);
                w.a0.y(iHashCode4, sVar, gVar5, sVar, dVar2);
                m3.i.C(tVarC4, gVar6, sVar);
                if (1.0f <= 0.0d) {
                    e2.a.a("invalid weight; must be greater than zero");
                }
                qVar = qVar3;
                gVar = gVar3;
                hVar = hVar2;
                gVar2 = gVar6;
                r9.d(address.getDisplayName(), d2.c.D(new n1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false), 0.0f, 0.0f, f12, 0.0f, 11), lv.s.E, 0L, null, 0L, null, new x5.k(1), 0L, 2, false, 1, 0, null, lv.v.f28276p, sVar, MLKEMEngine.KyberPolyBytes, 12607872, 109560);
                sVar = sVar;
                if (bVar2 == jl.b.GPS || bVar2 == jl.b.SELECTED) {
                    bVar = bVar2;
                    lVar = lVar2;
                    z13 = false;
                    sVar.a0(1472125740);
                    sVar.q(false);
                } else {
                    sVar.a0(1471626175);
                    bVar = bVar2;
                    lVar = lVar2;
                    r9.d(f0.U(sVar, R.string.onboarding_where_edit_button), null, lv.s.f28217b, 0L, null, 0L, lVar, new x5.k(1), 0L, 2, false, 1, 0, null, lv.v.f28284x, sVar, 805306752, 12607872, 109050);
                    sVar = sVar;
                    z13 = false;
                    sVar.q(false);
                }
                sVar.q(true);
                sVar.q(z13);
            }
            sVar.q(true);
            boolean z14 = cVar.f25303e;
            m3.f fVar3 = m3.m.f29332a;
            if (z14) {
                sVar.a0(-1341176495);
                b4.q qVar4 = qVar;
                b4.t tVarM = m2.m(qVar4, 24);
                boolean z15 = cVar.f25304f;
                long j9 = lv.s.f28217b;
                n5 n5VarR = g3.s0.r(j9, j9, sVar);
                boolean z16 = (i18 & 7168) == 2048;
                Object objM = sVar.M();
                if (z16 || objM == fVar3) {
                    objM = new cn.z(1, function2);
                    sVar.k0(objM);
                }
                i12 = i18;
                q5.a(z15, (Function0) objM, tVarM, false, n5VarR, sVar, MLKEMEngine.KyberPolyBytes);
                sVar.q(false);
                fVar = fVar3;
                qVar2 = qVar4;
            } else {
                i12 = i18;
                b4.q qVar5 = qVar;
                if (z14) {
                    qVar2 = qVar5;
                    fVar = fVar3;
                    sVar.a0(-1339740575);
                    sVar.q(false);
                } else {
                    sVar.a0(-1340579962);
                    if (bVar == jl.b.STATIONS && cg.q(list)) {
                        i13 = -1340425892;
                        i14 = R.string.onboarding_where_edit_button;
                    } else {
                        i13 = -1340319779;
                        i14 = R.string.onboarding_where_add_button;
                    }
                    m3.s sVar3 = sVar;
                    fVar = fVar3;
                    qVar2 = qVar5;
                    r9.d(b3.i.j(i13, i14, sVar, sVar, false), b4.a.a(qVar5, sVar2, new cn.c0(3, function2)), lv.s.f28217b, 0L, null, 0L, lVar, null, 0L, 0, false, 0, 0, null, lv.v.f28283w, sVar3, 805306752, 12582912, 130552);
                    sVar = sVar3;
                    sVar.q(false);
                }
            }
            sVar.q(true);
            if (bVar == jl.b.STATIONS && cg.q(list)) {
                sVar.a0(-811342220);
                b4.t tVarD4 = d2.c.D(m2.d(qVar2, 1.0f), lv.t.f28255i, 0.0f, 0.0f, 0.0f, 14);
                d2.y yVarA3 = d2.w.a(dVar, iVar, sVar, 0);
                int iHashCode5 = Long.hashCode(sVar.T);
                u3.i iVarL5 = sVar.l();
                b4.t tVarC5 = b4.a.c(tVarD4, sVar);
                sVar.e0();
                if (sVar.S) {
                    sVar.k(hVar);
                } else {
                    sVar.n0();
                }
                m3.i.C(yVarA3, gVar, sVar);
                m3.i.C(iVarL5, gVar4, sVar);
                w.a0.y(iHashCode5, sVar, gVar5, sVar, dVar2);
                m3.i.C(tVarC5, gVar2, sVar);
                sVar.a0(-1165613105);
                for (op.l lVar3 : list) {
                    op.l lVar4 = cVar.f25306h;
                    boolean z17 = lVar4 != null && lVar4.f32909b == lVar3.f32909b;
                    int i19 = i12;
                    boolean zF = ((i19 & 7168) == 2048) | sVar.f(lVar3);
                    Object objM2 = sVar.M();
                    if (zF) {
                        fVar2 = fVar;
                    } else {
                        fVar2 = fVar;
                        if (objM2 != fVar2) {
                            i15 = 6;
                        }
                        m3.s sVar4 = sVar;
                        tp.b.b(lVar3, null, z17, true, z11, (Function0) objM2, sVar4, ((i19 << 6) & 57344) | 3072, 2);
                        i12 = i19;
                        fVar = fVar2;
                        sVar = sVar4;
                    }
                    i15 = 6;
                    objM2 = new i2.e(i15, function2, lVar3);
                    sVar.k0(objM2);
                    m3.s sVar42 = sVar;
                    tp.b.b(lVar3, null, z17, true, z11, (Function0) objM2, sVar42, ((i19 << 6) & 57344) | 3072, 2);
                    i12 = i19;
                    fVar = fVar2;
                    sVar = sVar42;
                }
                cVar2 = cVar;
                function22 = function2;
                z12 = true;
                e0.f.D(sVar, false, true, false);
            } else {
                cVar2 = cVar;
                function22 = function2;
                z12 = true;
                sVar.a0(-810587835);
                sVar.q(false);
            }
            sVar.q(z12);
        } else {
            function22 = function2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.m(tVar, cVar2, z11, function22, i11, 5);
        }
    }

    public static final void k(boolean z11, Function2 function2, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1818896922);
        int i12 = (sVar.g(z11) ? 4 : 2) | i11 | (sVar.h(function2) ? 32 : 16);
        if ((i12 & 19) == 18 && sVar.B()) {
            sVar.U();
        } else {
            lx.u.k(z11, function2, sVar, i12 & 126);
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new an.b(z11, function2, i11, 5);
        }
    }

    public static final void l(BaseItemMnuV2 baseItemMnuV2, String str, String str2, String str3, m3.n nVar, int i11) {
        m3.s sVar;
        float f11;
        float f12;
        boolean z11;
        b4.q qVar;
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-1416057310);
        int i12 = i11 | (sVar2.h(baseItemMnuV2) ? 4 : 2) | (sVar2.f(str) ? 32 : 16) | (sVar2.f(str2) ? 256 : 128) | (sVar2.f(str3) ? NewHope.SENDB_BYTES : 1024);
        if (sVar2.R(i12 & 1, (i12 & 1171) != 1170)) {
            float f13 = lv.t.f28251e;
            b4.q qVar2 = b4.q.f5711a;
            b4.t tVarB = d2.c.B(qVar2, f13, 0.0f, 2);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar2, 48);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            b4.t tVarC = b4.a.c(tVarB, sVar2);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            m3.i.C(i2VarA, b5.i.f5843f, sVar2);
            m3.i.C(iVarL, b5.i.f5842e, sVar2);
            m3.i.v(sVar2, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar2, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar2);
            if (str3 != null) {
                sVar2.a0(-1369372298);
                m(baseItemMnuV2, str3, sVar2, ((i12 >> 6) & 112) | (i12 & 14));
                sVar2.q(false);
            } else {
                sVar2.a0(-1369297681);
                n(baseItemMnuV2, sVar2, i12 & 14);
                sVar2.q(false);
            }
            b4.t tVarE = m2.e(qVar2, f13);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            d2.c.f(tVarE.then(new n1(1.0f, true)), sVar2);
            if (str2 == null) {
                sVar2.a0(-1369089114);
                sVar2.q(false);
                sVar = sVar2;
                f11 = 1.0f;
                f12 = f13;
                z11 = false;
                qVar = qVar2;
            } else {
                sVar2.a0(-1369089113);
                f11 = 1.0f;
                f12 = f13;
                z11 = false;
                qVar = qVar2;
                r9.d(str2, f4.g.a(qVar2, A(baseItemMnuV2) ? 1.0f : 0.4f), lv.s.E, 0L, null, 0L, x5.l.f43855d, null, 0L, 0, false, 0, 0, null, lv.v.f28276p, sVar2, 805306752, 12582912, 130552);
                sVar = sVar2;
                sVar.q(false);
            }
            if (str == null) {
                sVar.a0(-1368753291);
                sVar.q(z11);
            } else {
                sVar.a0(-1368753290);
                d2.c.f(m2.q(qVar, f12), sVar);
                m3.s sVar3 = sVar;
                r9.d(str, f4.g.a(qVar, A(baseItemMnuV2) ? f11 : 0.4f), A(baseItemMnuV2) ? lv.s.C : lv.s.E, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.l, sVar3, 0, 12582912, 131064);
                sVar = sVar3;
                sVar.q(z11);
            }
            sVar.q(true);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.p(baseItemMnuV2, str, i11, str2, str3, 5);
        }
    }

    public static final void m(BaseItemMnuV2 baseItemMnuV2, String str, m3.n nVar, int i11) {
        int i12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(409308797);
        int i13 = (sVar.h(baseItemMnuV2) ? 4 : 2) | i11;
        if ((i11 & 48) == 0) {
            i13 |= sVar.f(str) ? 32 : 16;
        }
        if (sVar.R(i13 & 1, (i13 & 19) != 18)) {
            b4.k kVar = b4.d.f5687e;
            l2.f fVarB = l2.g.b(8);
            b4.q qVar = b4.q.f5711a;
            b4.t tVarA = d2.c.A(v1.n.j(f4.g.b(qVar, fVarB), lv.s.I, i4.g0.f23254b), lv.t.f28251e, lv.t.f28249c);
            z4.u0 u0VarD = d2.p.d(kVar, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarA, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            i12 = 1;
            r9.d(f0.T(R.string.mnu_bottle_deposit_excl, new Object[]{str}, sVar), f4.g.a(qVar, A(baseItemMnuV2) ? 1.0f : 0.4f), lv.s.E, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, lv.v.f28276p, sVar, MLKEMEngine.KyberPolyBytes, 12607872, 110584);
            sVar = sVar;
            sVar.q(true);
        } else {
            i12 = 1;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.e0(baseItemMnuV2, str, i11, i12);
        }
    }

    public static final void n(BaseItemMnuV2 baseItemMnuV2, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-315491488);
        int i12 = (sVar.h(baseItemMnuV2) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            ManufacturerItemProperties manufacturerItemProperties = baseItemMnuV2.getManufacturerItemProperties();
            if (manufacturerItemProperties != null ? Intrinsics.areEqual(manufacturerItemProperties.getFreeDelivery(), Boolean.TRUE) : false) {
                sVar.a0(-1418352691);
                r9.d(f0.U(sVar, R.string.mnu_free_delivery), f4.g.a(b4.q.f5711a, A(baseItemMnuV2) ? 1.0f : 0.4f), lv.s.E, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28276p, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
                sVar = sVar;
                sVar.q(false);
            } else {
                sVar.a0(-1418111294);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.g(baseItemMnuV2, i11, 10);
        }
    }

    public static final void o(String str, String str2, m3.n nVar, int i11) {
        m3.s sVar;
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-1087198520);
        int i12 = (sVar2.f(str) ? 4 : 2) | i11 | (sVar2.f(str2) ? 32 : 16);
        if (sVar2.R(i12 & 1, (i12 & 19) != 18)) {
            m5.e eVar = new m5.e();
            int iG = StringsKt.G(str, str2, 0, false, 6);
            if (iG != -1) {
                int length = str2.length() + iG;
                eVar.c(kotlin.text.b0.x(iG, str));
                int i13 = eVar.i(lv.v.f28272k.f29655a);
                try {
                    eVar.c(str2);
                    eVar.g(i13);
                    i13 = eVar.i(m5.u0.a(lv.v.f28274n, lv.s.D, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214).f29655a);
                    try {
                        eVar.c(str.substring(length));
                    } finally {
                    }
                } finally {
                }
            } else {
                eVar.c(str);
            }
            sVar = sVar2;
            r9.e(eVar.j(), m2.d(b4.q.f5711a, 1.0f), 0L, 0L, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, null, null, sVar, 48, 0, 523260);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cg.v0(str, str2, i11, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object p(x80.u r4, kotlin.jvm.functions.Function0 r5, z70.c r6) {
        /*
            boolean r0 = r6 instanceof x80.s
            if (r0 == 0) goto L13
            r0 = r6
            x80.s r0 = (x80.s) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            x80.s r0 = new x80.s
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f44083k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            kotlin.jvm.functions.Function0 r5 = r0.f44082j
            ba0.g.M(r6)     // Catch: java.lang.Throwable -> L29
            goto L64
        L29:
            r4 = move-exception
            goto L6a
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r4)
            r4 = 0
            return r4
        L32:
            ba0.g.M(r6)
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            v80.h1 r2 = v80.h1.f42106a
            kotlin.coroutines.CoroutineContext$Element r6 = r6.get(r2)
            if (r6 != r4) goto L6e
            r0.f44082j = r5     // Catch: java.lang.Throwable -> L29
            r0.l = r3     // Catch: java.lang.Throwable -> L29
            v80.l r6 = new v80.l     // Catch: java.lang.Throwable -> L29
            x70.c r0 = y70.f.b(r0)     // Catch: java.lang.Throwable -> L29
            r6.<init>(r3, r0)     // Catch: java.lang.Throwable -> L29
            r6.t()     // Catch: java.lang.Throwable -> L29
            a3.f2 r0 = new a3.f2     // Catch: java.lang.Throwable -> L29
            r2 = 12
            r0.<init>(r6, r2)     // Catch: java.lang.Throwable -> L29
            x80.t r4 = (x80.t) r4     // Catch: java.lang.Throwable -> L29
            r4.m0(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r6.s()     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L64
            return r1
        L64:
            r5.invoke()
            kotlin.Unit r4 = kotlin.Unit.f26487a
            return r4
        L6a:
            r5.invoke()
            throw r4
        L6e:
            java.lang.String r4 = "awaitClose() can only be invoked from the producer context"
            com.braze.h2.b(r4)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o30.e0.p(x80.u, kotlin.jvm.functions.Function0, z70.c):java.lang.Object");
    }

    public static final pa0.a q(n90.c cVar, q90.z zVar) {
        cVar.getClass();
        cVar.getClass();
        jb.b bVar = new jb.b();
        bVar.f24851a = cVar;
        return new pa0.a(zVar, bVar);
    }

    public static final o70.g r(s1 s1Var, m3.n nVar) {
        if (!(s1Var instanceof androidx.lifecycle.p)) {
            m3.s sVar = (m3.s) nVar;
            sVar.a0(-1968008324);
            sVar.q(false);
            return null;
        }
        m3.s sVar2 = (m3.s) nVar;
        sVar2.a0(-1968186822);
        Context baseContext = (Context) sVar2.j(c5.v0.f7390b);
        ViewModelProvider$Factory defaultViewModelProviderFactory = ((androidx.lifecycle.p) s1Var).getDefaultViewModelProviderFactory();
        baseContext.getClass();
        defaultViewModelProviderFactory.getClass();
        while (baseContext instanceof ContextWrapper) {
            if (baseContext instanceof ComponentActivity) {
                o70.g gVarA = o70.g.a((ComponentActivity) baseContext, defaultViewModelProviderFactory);
                sVar2.q(false);
                return gVarA;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
            baseContext.getClass();
        }
        j4.d.e(baseContext, "Expected an activity context for creating a HiltViewModelFactory but instead found: ");
        return null;
    }

    public static final float s(m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        return ((Resources) sVar.j(c5.v0.f7391c)).getDimension(i11) / ((z5.c) sVar.j(x1.f7416h)).a();
    }

    public static final g9.p t(Fragment fragment) {
        Dialog dialog;
        Window window;
        fragment.getClass();
        for (Fragment parentFragment = fragment; parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof NavHostFragment) {
                return ((NavHostFragment) parentFragment).o();
            }
            Fragment fragment2 = parentFragment.getParentFragmentManager().A;
            if (fragment2 instanceof NavHostFragment) {
                return ((NavHostFragment) fragment2).o();
            }
        }
        View view = fragment.getView();
        if (view != null) {
            return z20.b.n(view);
        }
        View decorView = null;
        androidx.fragment.app.y yVar = fragment instanceof androidx.fragment.app.y ? (androidx.fragment.app.y) fragment : null;
        if (yVar != null && (dialog = yVar.getDialog()) != null && (window = dialog.getWindow()) != null) {
            decorView = window.getDecorView();
        }
        if (decorView != null) {
            return z20.b.n(decorView);
        }
        com.braze.h2.b(w.a0.m("Fragment ", fragment, " does not have a NavController set"));
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0189, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r11, r1) == false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList u(android.view.View r8, java.util.List r9, int r10, int r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o30.e0.u(android.view.View, java.util.List, int, int, java.lang.String):java.util.ArrayList");
    }

    public static ArrayList v(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt.getVisibility() == 0) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    public static final String w(BaseItemMnuV2 baseItemMnuV2) {
        Brand brand;
        String brandName;
        baseItemMnuV2.getClass();
        int i11 = cn.d0.$EnumSwitchMapping$0[baseItemMnuV2.getItemType().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                String itemName = baseItemMnuV2.getItemName();
                return itemName == null ? "" : itemName;
            }
            String storeName = baseItemMnuV2.getStoreName();
            if (storeName != null) {
                return storeName;
            }
            String itemName2 = baseItemMnuV2.getItemName();
            return itemName2 == null ? "" : itemName2;
        }
        ManufacturerItemProperties manufacturerItemProperties = baseItemMnuV2.getManufacturerItemProperties();
        if (manufacturerItemProperties == null || (brand = manufacturerItemProperties.getBrand()) == null || (brandName = brand.getBrandName()) == null) {
            String itemName3 = baseItemMnuV2.getItemName();
            return itemName3 == null ? "" : itemName3;
        }
        if (brandName.length() > 0) {
            return r8.k.m(brandName, " - ", baseItemMnuV2.getItemName());
        }
        String itemName4 = baseItemMnuV2.getItemName();
        return itemName4 == null ? "" : itemName4;
    }

    public static final long x(e4.d dVar) {
        DragEvent dragEvent = dVar.f15734a;
        float x11 = dragEvent.getX();
        float y5 = dragEvent.getY();
        return (((long) Float.floatToRawIntBits(x11)) << 32) | (((long) Float.floatToRawIntBits(y5)) & 4294967295L);
    }

    public static final String y(BaseItemMnuV2 baseItemMnuV2) {
        baseItemMnuV2.getClass();
        int i11 = cn.d0.$EnumSwitchMapping$0[baseItemMnuV2.getItemType().ordinal()];
        if (i11 == 1) {
            return baseItemMnuV2.getSubtitle();
        }
        if (i11 != 2) {
            return null;
        }
        return baseItemMnuV2.getItemName();
    }

    public static final boolean z(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }
}
