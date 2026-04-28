package pd;

import a3.o2;
import a40.d0;
import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.camera.core.InitializationException;
import androidx.credentials.exceptions.NoCredentialException;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.lifecycle.s1;
import androidx.recyclerview.widget.l1;
import androidx.viewpager2.widget.ViewPager2;
import b4.k;
import b4.q;
import b4.t;
import b5.g;
import b5.h;
import b5.j;
import c5.v0;
import c5.x1;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.discover.response.DiscoverBucket;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.order.OrderState;
import com.app.tgtg.model.remote.profile.response.ProfileFeatureState;
import com.app.tgtg.model.remote.profile.response.ProfileScreenResponse;
import com.braze.h2;
import com.braze.models.Banner;
import com.facebook.FacebookException;
import d2.b2;
import d2.i2;
import d2.m2;
import d2.p;
import d2.u;
import d2.w;
import d2.w0;
import d2.z;
import d40.t1;
import e0.r1;
import e0.v;
import f0.t0;
import g3.ga;
import g3.r9;
import g3.s0;
import g3.x5;
import i4.o;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import m3.b1;
import m3.h1;
import m3.n;
import m3.s;
import m3.w1;
import m5.u0;
import o00.v1;
import o00.x0;
import o30.e0;
import o30.f0;
import on.l;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s0.g0;
import tx.n0;
import u3.i;
import w.a0;
import z4.c0;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;
import zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f34670a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f34671b = 0;

    public static final boolean A(j0.b bVar, String str) throws InitializationException {
        str.getClass();
        bVar.getClass();
        if (Intrinsics.areEqual(Build.FINGERPRINT, "robolectric")) {
            if (!wd.a.B(3, "CXCP")) {
                return true;
            }
            Log.d("CXCP", "isBackwardCompatible method returns true because robolectric build detected.");
            return true;
        }
        try {
            e0.s.a(str);
            v vVarB = j0.b.b(bVar, str);
            CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
            key.getClass();
            int[] iArr = (int[]) ((t0) vVarB).c(key);
            if (iArr != null) {
                return y.t(iArr, 0);
            }
            return false;
        } catch (CameraAccessException e5) {
            if (wd.a.B(6, "CXCP")) {
                Log.e("CXCP", "Error while accessing metadata for cameraID: ".concat(str), e5);
            }
            throw new InitializationException(e5);
        }
    }

    public static boolean B() {
        ax.b bVar = ax.j.f4928f.s().f4932c;
        return (bVar == null || new Date().after(bVar.f4871a)) ? false : true;
    }

    public static boolean C(MotionEvent motionEvent, int i11) {
        return (motionEvent.getSource() & i11) == i11;
    }

    public static final long D(long j9, long j11) {
        return q1.h.a(y(j9) - y(j11), z(j9) - z(j11));
    }

    public static void E(ViewPager2 viewPager2) {
        viewPager2.getClass();
        int currentItem = viewPager2.getCurrentItem() + 1;
        l1 adapter = viewPager2.getAdapter();
        if (currentItem < (adapter != null ? adapter.getItemCount() : 0)) {
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1, true);
        }
    }

    public static final long F(long j9, long j11) {
        return q1.h.a(y(j11) + y(j9), z(j11) + z(j9));
    }

    public static void G(ViewPager2 viewPager2) {
        viewPager2.getClass();
        if (viewPager2.getCurrentItem() - 1 >= 0) {
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() - 1, true);
        }
    }

    public static final byte[] H(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        o(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }

    public static void I(ax.b bVar) {
        ax.j.f4928f.s().c(bVar, true);
    }

    public static final long J(float f11, long j9) {
        return q1.h.a(y(j9) * f11, z(j9) * f11);
    }

    public static final long K(long j9, r8.g gVar) {
        long jA = gVar.a(y(j9), z(j9));
        return q1.h.a(Float.intBitsToFloat((int) (jA >> 32)), Float.intBitsToFloat((int) (jA & 4294967295L)));
    }

    public static Object L(m0.q qVar, KClass kClass) {
        qVar.getClass();
        kClass.getClass();
        if (qVar instanceof r1) {
            return ((r1) qVar).t(kClass);
        }
        if (!(qVar instanceof g0)) {
            return null;
        }
        g0 g0Var = (g0) qVar;
        if (g0Var.h() == qVar) {
            return null;
        }
        g0 g0VarH = g0Var.h();
        g0VarH.getClass();
        return L(g0VarH, kClass);
    }

    public static final int M(f2.s sVar) {
        List list = sVar.f17192k;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += ((f2.t) ((f2.m) list.get(i12))).f17214q;
        }
        return (i11 / list.size()) + sVar.f17198r;
    }

    public static final Bundle N() {
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_SERVER_CLIENT_ID", "291323069543-q6g7hd85136g326lsgh4rc28asrn0k7u.apps.googleusercontent.com");
        bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_NONCE", null);
        bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_HOSTED_DOMAIN_FILTER", null);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_AUTO_SELECT_ENABLED", true);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GOOGLE_ID_TOKEN_SUBTYPE", "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_SIWG_CREDENTIAL");
        return bundle;
    }

    public static ArrayList O(Context context, int i11) {
        String[] strArrSplit = P(context.getApplicationContext(), "third_party_license_metadata", 0L, -1, i11).split("\n");
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str : strArrSplit) {
            int iIndexOf = str.indexOf(32);
            String[] strArrSplit2 = str.substring(0, iIndexOf).split(":");
            if (strArrSplit2.length != 2 || iIndexOf <= 0) {
                h2.b(x0.L("Invalid license meta-data line:\n%s", str));
                return null;
            }
            arrayList.add(new v1(Integer.parseInt(strArrSplit2[1]), Long.parseLong(strArrSplit2[0]), str.substring(iIndexOf + 1)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static String P(Context context, String str, long j9, int i11, int i12) {
        Resources resources = context.getApplicationContext().getResources();
        InputStream inputStreamOpenRawResource = resources.openRawResource(resources.getIdentifier(str, "raw", resources.getResourcePackageName(i12)));
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            inputStreamOpenRawResource.skip(j9);
            if (i11 <= 0) {
                i11 = Integer.MAX_VALUE;
            }
            while (i11 > 0) {
                int i13 = inputStreamOpenRawResource.read(bArr, 0, Math.min(i11, 1024));
                if (i13 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i13);
                i11 -= i13;
            }
            inputStreamOpenRawResource.close();
            try {
                return byteArrayOutputStream.toString(ArticleContentView.UTF_8_ENCODING_TYPE);
            } catch (UnsupportedEncodingException e5) {
                d0.o("Unsupported encoding UTF8. This should always be supported.", e5);
                return null;
            }
        } catch (IOException e11) {
            d0.o("Failed to read license or metadata text.", e11);
            return null;
        }
    }

    public static final void a(DiscoverBucket discoverBucket, boolean z11, b4.t tVar, m3.n nVar, int i11) {
        b4.t tVar2;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(43218972);
        int i12 = i11 | (sVar.h(discoverBucket) ? 4 : 2) | (sVar.g(z11) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            b4.q qVar = b4.q.f5711a;
            b4.t tVarD = m2.d(qVar, 1.0f);
            float f11 = lv.t.f28253g;
            b4.t tVarD2 = d2.c.D(tVarD, 0.0f, f11, 0.0f, lv.t.f28251e, 5);
            d2.y yVarA = w.a(d2.i.f13803c, b4.d.f5695n, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarD2, sVar);
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
            String title = discoverBucket != null ? discoverBucket.getTitle() : null;
            if (title == null) {
                title = "";
            }
            u0 u0Var = lv.v.f28270i;
            b4.t tVarD3 = m2.d(qVar, 1.0f);
            float f12 = lv.t.f28255i;
            r9.d(title, d2.c.B(tVarD3, f12, 0.0f, 2), 0L, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, u0Var, sVar, 48, 12582912, 130044);
            d2.c.f(m2.e(qVar, f11), sVar);
            String subtext = discoverBucket != null ? discoverBucket.getSubtext() : null;
            r9.d(subtext == null ? "" : subtext, d2.c.B(m2.d(qVar, 1.0f), f12, 0.0f, 2), 0L, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar, 48, 12582912, 130044);
            sVar = sVar;
            d2.c.f(m2.e(qVar, lv.t.f28254h), sVar);
            u00.d.d(z11 ? 1.0f : 0.85f, m2.e(d2.c.B(m2.d(qVar, 1.0f), f12, 0.0f, 2), 10), 0L, 0L, sVar, 432);
            d2.c.f(m2.e(qVar, f12), sVar);
            v0.n.e(m2.e(m2.d(qVar, 1.0f), 6), 0L, 0.0f, 0.0f, 0.0f, sVar, 6);
            sVar.q(true);
            tVar2 = qVar;
        } else {
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.d((Object) discoverBucket, z11, tVar2, i11, 7);
        }
    }

    public static final void b(ih.i iVar, gh.l lVar, Function0 function0, Function1 function1, Function1 function12, m3.n nVar, int i11) {
        m3.s sVar;
        iVar.getClass();
        function0.getClass();
        function1.getClass();
        function12.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(333164121);
        int i12 = i11 | (sVar2.h(iVar) ? 4 : 2) | (sVar2.h(lVar) ? 32 : 16) | (sVar2.h(function0) ? 256 : 128) | (sVar2.h(function1) ? NewHope.SENDB_BYTES : 1024) | (sVar2.h(function12) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192);
        if (sVar2.R(i12 & 1, (i12 & 9363) != 9362)) {
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = a0.s(-1, sVar2);
            }
            h1 h1Var = (h1) objM;
            Object objM2 = sVar2.M();
            if (objM2 == fVar) {
                objM2 = m3.i.w(Boolean.FALSE);
                sVar2.k0(objM2);
            }
            b1 b1Var = (b1) objM2;
            Object objM3 = sVar2.M();
            if (objM3 == fVar) {
                objM3 = m3.i.w(Boolean.FALSE);
                sVar2.k0(objM3);
            }
            b1 b1VarN = m3.i.n(iVar.f23865n, sVar2, 0);
            b1 b1VarN2 = m3.i.n(iVar.f23867p, sVar2, 0);
            x5.a(v4.f.a(m2.f13850c, ga.c(sVar2).f18456c, null), u3.e.e(-980040683, sVar2, new an.d(function0, iVar, b1Var, 29)), null, null, null, 0, 0L, 0L, null, u3.e.e(2141181994, sVar2, new kh.a(iVar, lVar, h1Var, (b1) objM3, function1, function12, b1Var)), sVar2, 805306416, 508);
            sVar = sVar2;
            if (((Boolean) b1VarN.getValue()).booleanValue()) {
                j4.s.y(-373357587, 0, sVar, sVar, false);
            } else {
                sVar.a0(-373330679);
                sVar.q(false);
            }
            if (((Boolean) b1VarN2.getValue()).booleanValue()) {
                sVar.a0(-373290100);
                Toast.makeText((Context) sVar.j(v0.f7390b), R.string.generic_error_view_no_location_title, 1).show();
                sVar.q(false);
            } else {
                sVar.a0(-373169975);
                sVar.q(false);
            }
            String str = (String) iVar.f23853a.a("BADGE_ID");
            if (str != null) {
                h1Var.i(Integer.parseInt(str));
            }
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ap.b(iVar, lVar, function0, function1, function12, i11, 13);
        }
    }

    public static final void c(int i11, b4.t tVar, List list, Function1 function1, m3.n nVar) {
        list.getClass();
        function1.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(484286829);
        int i12 = i11 | (sVar.h(list) ? 32 : 16) | (sVar.h(function1) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            float f11 = 16;
            b2 b2VarC = d2.c.c(0.0f, f11, 1);
            d2.g gVarG = d2.i.g(f11);
            boolean zH = sVar.h(list) | ((i12 & 896) == 256);
            Object objM = sVar.M();
            if (zH || objM == m3.m.f29332a) {
                objM = new kq.b(list, function1, 1);
                sVar.k0(objM);
            }
            ox.h.c(tVar, null, b2VarC, gVarG, null, null, false, null, (Function1) objM, sVar, 24966, 490);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bg.x0(tVar, list, function1, i11, 3);
        }
    }

    public static final void d(int i11, String str, String str2, m3.n nVar, int i12) {
        str.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1580794969);
        int i13 = (sVar.d(i11) ? 4 : 2) | i12 | (sVar.f(str) ? 32 : 16) | (sVar.f(str2) ? 256 : 128);
        if (sVar.R(i13 & 1, (i13 & 147) != 146)) {
            sVar.W();
            if ((i12 & 1) != 0 && !sVar.z()) {
                sVar.U();
            }
            sVar.r();
            s0.b(m2.d(b4.q.f5711a, 1.0f), l2.g.b(lv.t.f28247a), s0.p(lv.s.J, sVar, 6), s0.q(2, 0.0f, 0.0f, 0.0f, 62), null, u3.e.e(985728793, sVar, new hg.c(i11, str, str2, 1)), sVar, 196614, 16);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ug.i(str, i11, i12, str2);
        }
    }

    public static final void e(String str, boolean z11, m3.n nVar, int i11, int i12) {
        int i13;
        str.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(375451867);
        if ((i11 & 6) == 0) {
            i13 = (sVar.f(str) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= sVar.g(z11) ? 32 : 16;
        }
        if (sVar.R(i13 & 1, (i13 & 19) != 18)) {
            if (i14 != 0) {
                z11 = false;
            }
            d2.c.a(null, null, u3.e.e(-1832625359, sVar, new co.r(z11, str)), sVar, 3072, 7);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ar.e(i11, i12, str, z11);
        }
    }

    public static final void f(b4.t tVar, mn.l lVar, final ProfileFeatureState profileFeatureState, final int i11, final int i12, final String str, Function1 function1, final Function0 function0, final boolean z11, final boolean z12, m3.n nVar, final int i13) {
        m3.s sVar;
        final b4.t tVar2;
        final mn.l lVar2;
        mn.l lVar3;
        int i14;
        b4.t tVar3;
        mn.l lVar4;
        int i15;
        mn.l lVar5;
        final Function1 function12 = function1;
        profileFeatureState.getClass();
        str.getClass();
        function12.getClass();
        function0.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-1356065409);
        int i16 = i13 | 6;
        if ((i13 & 48) == 0) {
            i16 = i13 | 22;
        }
        if ((i13 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= sVar2.d(profileFeatureState.ordinal()) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i16 |= sVar2.d(i11) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i13 & 24576) == 0) {
            i16 |= sVar2.d(i12) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i13) == 0) {
            i16 |= sVar2.f(str) ? 131072 : 65536;
        }
        if ((1572864 & i13) == 0) {
            i16 |= sVar2.h(function12) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i16 |= sVar2.h(function0) ? 8388608 : 4194304;
        }
        if ((100663296 & i13) == 0) {
            i16 |= sVar2.g(z11) ? 67108864 : 33554432;
        }
        if ((805306368 & i13) == 0) {
            i16 |= sVar2.g(z12) ? 536870912 : 268435456;
        }
        if (sVar2.R(i16 & 1, (306783379 & i16) != 306783378)) {
            sVar2.W();
            int i17 = i13 & 1;
            b4.q qVar = b4.q.f5711a;
            if (i17 == 0 || sVar2.z()) {
                s1 s1VarA = z8.a.a(sVar2);
                if (s1VarA == null) {
                    h2.b("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    lVar3 = (mn.l) t1.K(Reflection.getOrCreateKotlinClass(mn.l.class), s1VarA, e0.r(s1VarA, sVar2), s1VarA instanceof androidx.lifecycle.p ? ((androidx.lifecycle.p) s1VarA).getDefaultViewModelCreationExtras() : y8.a.f45423b, sVar2);
                    i14 = i16 & (-113);
                    tVar3 = qVar;
                }
            } else {
                sVar2.U();
                lVar3 = lVar;
                i14 = i16 & (-113);
                tVar3 = tVar;
            }
            sVar2.r();
            z5.c cVar = (z5.c) sVar2.j(x1.f7416h);
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                lVar4 = lVar3;
                objM = m3.i.w(new z5.f(lv.t.f28252f));
                sVar2.k0(objM);
            } else {
                lVar4 = lVar3;
            }
            b1 b1Var = (b1) objM;
            Object objM2 = sVar2.M();
            if (objM2 == fVar) {
                i15 = i14;
                objM2 = m3.i.w(new z5.f(lv.t.f28252f));
                sVar2.k0(objM2);
            } else {
                i15 = i14;
            }
            b1 b1Var2 = (b1) objM2;
            float f11 = lv.t.f28247a;
            b4.t tVarD = m2.d(qVar, 1.0f);
            d2.y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar2, 0);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            b4.t tVarC = b4.a.c(tVarD, sVar2);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            m3.i.C(yVarA, b5.i.f5843f, sVar2);
            m3.i.C(iVarL, b5.i.f5842e, sVar2);
            m3.i.v(sVar2, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar2, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar2);
            b4.t tVarT = m2.t(m2.d(tVar3, 1.0f), 3);
            boolean zF = sVar2.f(cVar) | ((i15 & 3670016) == 1048576);
            Object objM3 = sVar2.M();
            if (zF || objM3 == fVar) {
                function12 = function1;
                objM3 = new b0.x1(cVar, function12, b1Var, b1Var2);
                sVar2.k0(objM3);
            } else {
                function12 = function1;
            }
            b4.t tVarO = c0.o(tVarT, (Function1) objM3);
            long j9 = lv.s.J;
            final b4.t tVar4 = tVar3;
            float f12 = 2;
            s0.b(tVarO, l2.g.b(e0.s(sVar2, R.dimen.profile_card_corner_radius)), s0.p(j9, sVar2, 6), s0.q(f12, 0.0f, 0.0f, 0.0f, 62), null, u3.e.e(455951511, sVar2, new i80.n() { // from class: tn.a
                @Override // i80.n
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    n nVar2 = (n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((z) obj).getClass();
                    s sVar3 = (s) nVar2;
                    if (sVar3.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                        q qVar2 = q.f5711a;
                        t tVarT2 = m2.t(m2.d(qVar2, 1.0f), 3);
                        k kVar = b4.d.f5683a;
                        z4.u0 u0VarD = p.d(kVar, false);
                        int iHashCode2 = Long.hashCode(sVar3.T);
                        i iVarL2 = sVar3.l();
                        t tVarC2 = b4.a.c(tVarT2, sVar3);
                        j.R.getClass();
                        h hVar2 = b5.i.f5839b;
                        sVar3.e0();
                        if (sVar3.S) {
                            sVar3.k(hVar2);
                        } else {
                            sVar3.n0();
                        }
                        g gVar = b5.i.f5843f;
                        m3.i.C(u0VarD, gVar, sVar3);
                        g gVar2 = b5.i.f5842e;
                        m3.i.C(iVarL2, gVar2, sVar3);
                        Integer numValueOf = Integer.valueOf(iHashCode2);
                        g gVar3 = b5.i.f5844g;
                        m3.i.v(sVar3, numValueOf, gVar3);
                        b5.d dVar = b5.i.f5845h;
                        m3.i.z(sVar3, dVar);
                        g gVar4 = b5.i.f5841d;
                        m3.i.C(tVarC2, gVar4, sVar3);
                        t tVarD2 = m2.d(qVar2, 1.0f);
                        d2.y yVarA2 = w.a(d2.i.f13803c, b4.d.f5694m, sVar3, 0);
                        int iHashCode3 = Long.hashCode(sVar3.T);
                        i iVarL3 = sVar3.l();
                        t tVarC3 = b4.a.c(tVarD2, sVar3);
                        sVar3.e0();
                        if (sVar3.S) {
                            sVar3.k(hVar2);
                        } else {
                            sVar3.n0();
                        }
                        m3.i.C(yVarA2, gVar, sVar3);
                        m3.i.C(iVarL3, gVar2, sVar3);
                        a0.y(iHashCode3, sVar3, gVar3, sVar3, dVar);
                        m3.i.C(tVarC3, gVar4, sVar3);
                        t tVarT3 = m2.t(m2.d(tVar4, 1.0f), 3);
                        float f13 = lv.t.f28253g;
                        t tVarD3 = d2.c.D(tVarT3, f13, f13, f13, 0.0f, 8);
                        z4.u0 u0VarD2 = p.d(kVar, false);
                        int iHashCode4 = Long.hashCode(sVar3.T);
                        i iVarL4 = sVar3.l();
                        t tVarC4 = b4.a.c(tVarD3, sVar3);
                        sVar3.e0();
                        if (sVar3.S) {
                            sVar3.k(hVar2);
                        } else {
                            sVar3.n0();
                        }
                        m3.i.C(u0VarD2, gVar, sVar3);
                        m3.i.C(iVarL4, gVar2, sVar3);
                        a0.y(iHashCode4, sVar3, gVar3, sVar3, dVar);
                        m3.i.C(tVarC4, gVar4, sVar3);
                        if (z12) {
                            sVar3.a0(-627323294);
                            k kVar2 = b4.d.f5685c;
                            v1.n.d(x0.z(R.drawable.ic_loyalty_card_info, sVar3, 0), f0.U(sVar3, R.string.profile_voice_over_loyalty_card_info), b4.a.a(u.f13938a.a(qVar2, kVar2), c5.m2.f7291a, new l(17, function0)), kVar2, null, 0.0f, new o(lv.s.C, 5), sVar3, 1575944, 48);
                            sVar3.q(false);
                        } else {
                            sVar3.a0(-626733395);
                            sVar3.q(false);
                        }
                        r9.d(f0.U(sVar3, R.string.profile_loyalty_card_header), m2.u(qVar2, null, 3), lv.s.C, 0L, null, 0L, null, new x5.k(5), 0L, 0, false, 0, 0, null, lv.v.f28272k, sVar3, 432, 12582912, 130040);
                        sVar3.q(true);
                        u00.d.h(new w0(b4.d.f5695n), profileFeatureState, i11, i12, sVar3, 0);
                        d2.c.f(m2.e(qVar2, f13), sVar3);
                        sVar3.q(true);
                        sVar3.q(true);
                    } else {
                        sVar3.U();
                    }
                    return Unit.f26487a;
                }
            }), sVar2, 196608, 16);
            sVar = sVar2;
            d2.c.f(v1.n.j(m2.e(m2.d(d2.c.B(qVar, lv.t.f28252f, 0.0f, 2), 1.0f), 1), lv.s.H, i4.g0.f23254b), sVar);
            if (z11) {
                lVar5 = lVar4;
                sVar.a0(-729690407);
                sVar.q(false);
            } else {
                sVar.a0(-733357893);
                b4.t tVarT2 = m2.t(m2.d(tVar4, 1.0f), 3);
                boolean zF2 = sVar.f(cVar);
                Object objM4 = sVar.M();
                if (zF2 || objM4 == fVar) {
                    objM4 = new o2(cVar, b1Var2, 8);
                    sVar.k0(objM4);
                }
                final mn.l lVar6 = lVar4;
                lVar5 = lVar6;
                s0.b(c0.o(tVarT2, (Function1) objM4), l2.g.b(e0.s(sVar, R.dimen.profile_card_corner_radius)), s0.p(j9, sVar, 6), s0.q(f12, 0.0f, 0.0f, 0.0f, 62), null, u3.e.e(335440348, sVar, new i80.n() { // from class: tn.b
                    /* JADX WARN: Removed duplicated region for block: B:55:0x0222  */
                    /* JADX WARN: Removed duplicated region for block: B:58:0x0245  */
                    /* JADX WARN: Removed duplicated region for block: B:65:0x027a  */
                    /* JADX WARN: Removed duplicated region for block: B:68:0x028b A[ADDED_TO_REGION] */
                    /* JADX WARN: Removed duplicated region for block: B:74:0x0297  */
                    @Override // i80.n
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r34, java.lang.Object r35, java.lang.Object r36) {
                        /*
                            Method dump skipped, instruction units count: 712
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: tn.b.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }), sVar, 196608, 16);
                sVar = sVar;
                sVar.q(false);
            }
            sVar.q(true);
            tVar2 = tVar4;
            lVar2 = lVar5;
        } else {
            sVar = sVar2;
            sVar.U();
            tVar2 = tVar;
            lVar2 = lVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2() { // from class: tn.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    pd.g.f(tVar2, lVar2, profileFeatureState, i11, i12, str, function12, function0, z11, z12, (n) obj, m3.i.F(i13 | 1));
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final void g(ProfileScreenResponse profileScreenResponse, Function0 function0, Function0 function02, final Function2 function2, m3.n nVar, int i11) {
        final Function2 function22;
        boolean z11;
        Unit unit;
        int i12;
        Unit unit2;
        Function0 function03 = function02;
        function0.getClass();
        function03.getClass();
        function2.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-595950684);
        int i13 = i11 | (sVar.h(profileScreenResponse) ? 4 : 2) | (sVar.h(function0) ? 32 : 16) | (sVar.h(function03) ? 256 : 128) | (sVar.h(function2) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i13 & 1, (i13 & 1171) != 1170)) {
            b4.q qVar = b4.q.f5711a;
            b4.t tVarD = m2.d(qVar, 1.0f);
            d2.y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
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
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            if (profileScreenResponse == null) {
                sVar.a0(-515046909);
                sVar.q(false);
                function22 = function2;
                z11 = false;
                unit2 = null;
            } else {
                sVar.a0(-515046908);
                p30.b.h(function0, sVar, (i13 >> 3) & 14);
                int i14 = ((Configuration) sVar.j(v0.f7389a)).screenWidthDp;
                List<Order> pendingOrders = profileScreenResponse.getPendingOrders();
                m3.f fVar = m3.m.f29332a;
                if (pendingOrders == null) {
                    sVar.a0(1445343188);
                    z11 = false;
                    sVar.q(false);
                    function22 = function2;
                    unit = null;
                } else {
                    sVar.a0(1445343189);
                    List<Order> listL0 = CollectionsKt.l0(CollectionsKt.m0(pendingOrders, 2), new a60.r(28));
                    b4.t tVarR = v1.n.r(m2.t(m2.d(qVar, 1.0f), 3), v1.n.q(sVar), false);
                    i2 i2VarA = d2.h2.a(d2.i.f13801a, b4.d.f5692j, sVar, 0);
                    int iHashCode2 = Long.hashCode(sVar.T);
                    u3.i iVarL2 = sVar.l();
                    b4.t tVarC2 = b4.a.c(tVarR, sVar);
                    sVar.e0();
                    int i15 = i13;
                    if (sVar.S) {
                        sVar.k(hVar);
                    } else {
                        sVar.n0();
                    }
                    m3.i.C(i2VarA, gVar, sVar);
                    m3.i.C(iVarL2, gVar2, sVar);
                    a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
                    m3.i.C(tVarC2, gVar4, sVar);
                    sVar.a0(-334394703);
                    for (final Order order : listL0) {
                        int iIndexOf = listL0.indexOf(order);
                        int size = listL0.size();
                        if (listL0.isEmpty()) {
                            i12 = 108;
                        } else {
                            for (Order order2 : listL0) {
                                if (order2.getState() == OrderState.ACTIVE || order2.getState() == OrderState.COLLECTION_OFFERED || order2.getState() == OrderState.COLLECTION_DELEGATED) {
                                    i12 = 150;
                                    break;
                                }
                            }
                            i12 = 108;
                        }
                        b4.t tVarD2 = d2.c.D(m2.q(m2.e(qVar, i12), i14 - (size > 1 ? lv.t.f28255i : 0)), iIndexOf == 0 ? lv.t.f28253g : lv.t.f28249c, lv.t.f28252f, iIndexOf == size + (-1) ? lv.t.f28253g : lv.t.f28249c, 0.0f, 8);
                        int i16 = i15;
                        boolean zH = ((i16 & 7168) == 2048) | sVar.h(order);
                        Object objM = sVar.M();
                        if (zH || objM == fVar) {
                            final int i17 = 0;
                            objM = new Function1() { // from class: un.b
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Boolean bool = (Boolean) obj;
                                    switch (i17) {
                                        case 0:
                                            bool.booleanValue();
                                            function2.invoke(order, bool);
                                            break;
                                        default:
                                            bool.getClass();
                                            function2.invoke(order, bool);
                                            break;
                                    }
                                    return Unit.f26487a;
                                }
                            };
                            sVar.k0(objM);
                        }
                        v0.n.m(tVarD2, order, (Function1) objM, sVar, 0);
                        i15 = i16;
                    }
                    function22 = function2;
                    i13 = i15;
                    z11 = false;
                    e0.f.D(sVar, false, true, false);
                    unit = Unit.f26487a;
                }
                if (unit == null) {
                    sVar.a0(1446148290);
                    final Order latestCompletedOrder = profileScreenResponse.getLatestCompletedOrder();
                    if (latestCompletedOrder == null) {
                        sVar.a0(729803129);
                        sVar.q(z11);
                        unit2 = null;
                    } else {
                        sVar.a0(729803130);
                        b4.t tVarQ = m2.q(qVar, i14);
                        float f11 = lv.t.f28253g;
                        b4.t tVarD3 = d2.c.D(tVarQ, f11, lv.t.f28252f, f11, 0.0f, 8);
                        boolean zH2 = sVar.h(latestCompletedOrder) | ((i13 & 7168) == 2048);
                        Object objM2 = sVar.M();
                        if (zH2 || objM2 == fVar) {
                            final int i18 = 1;
                            objM2 = new Function1() { // from class: un.b
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Boolean bool = (Boolean) obj;
                                    switch (i18) {
                                        case 0:
                                            bool.booleanValue();
                                            function22.invoke(latestCompletedOrder, bool);
                                            break;
                                        default:
                                            bool.getClass();
                                            function22.invoke(latestCompletedOrder, bool);
                                            break;
                                    }
                                    return Unit.f26487a;
                                }
                            };
                            sVar.k0(objM2);
                        }
                        z11 = false;
                        v0.n.m(tVarD3, latestCompletedOrder, (Function1) objM2, sVar, 0);
                        sVar.q(false);
                        unit2 = Unit.f26487a;
                    }
                    sVar.q(z11);
                } else {
                    sVar.a0(-784659747);
                    sVar.q(z11);
                    unit2 = unit;
                }
                sVar.q(z11);
            }
            if (unit2 == null) {
                sVar.a0(-513400312);
                function03 = function02;
                u00.d.j(function03, sVar, (i13 >> 6) & 14);
                sVar.q(z11);
            } else {
                function03 = function02;
                sVar.a0(-1679182513);
                sVar.q(z11);
            }
            sVar.q(true);
        } else {
            function22 = function2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new lp.v(profileScreenResponse, function0, function03, function22, i11, 17);
        }
    }

    public static final void h(int i11, StringBuilder sb2) {
        for (int i12 = 0; i12 < i11; i12++) {
            sb2.append("?");
            if (i12 < i11 - 1) {
                sb2.append(MessageLogView.COMMA_SEPARATOR);
            }
        }
    }

    public static void i(String str, boolean z11) {
        if (z11) {
            return;
        }
        i4.a.f(str);
    }

    public static void j(boolean z11) {
        if (z11) {
            return;
        }
        i4.a.h();
    }

    public static void k(int i11, int i12, int i13, String str) {
        if (i11 < i12) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i12 + ", " + i13 + "] (too low)");
        }
        if (i11 <= i13) {
            return;
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str + " is out of range of [" + i12 + ", " + i13 + "] (too high)");
    }

    public static void l(int i11) {
        if (i11 >= 0) {
            return;
        }
        i4.a.h();
    }

    public static void m(Object obj, String str) {
        if (obj != null) {
            return;
        }
        c50.w.l(str);
    }

    public static void n(String str, boolean z11) {
        if (z11) {
            return;
        }
        h2.b(str);
    }

    public static final long o(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i11 = inputStream.read(bArr);
        long j9 = 0;
        while (i11 >= 0) {
            outputStream.write(bArr, 0, i11);
            j9 += (long) i11;
            i11 = inputStream.read(bArr);
        }
        return j9;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static c5.b p(Bundle bundle, String str) throws NoCredentialException {
        str.getClass();
        bundle.getClass();
        try {
            switch (str.hashCode()) {
                case -1678407252:
                    if (str.equals("androidx.credentials.TYPE_DIGITAL_CREDENTIAL")) {
                        try {
                            Object obj = bundle.get("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                            obj.getClass();
                            return obj instanceof byte[] ? new n7.r(0, bundle, new String((byte[]) obj, Charsets.UTF_8)) : new n7.r(0, bundle, (String) obj);
                        } catch (Exception unused) {
                            throw new FrameworkClassParsingException();
                        }
                    }
                    throw new FrameworkClassParsingException();
                case -1072734346:
                    if (str.equals("androidx.credentials.TYPE_RESTORE_CREDENTIAL")) {
                        String string = bundle.getString("androidx.credentials.BUNDLE_KEY_GET_RESTORE_CREDENTIAL_RESPONSE");
                        if (string == null) {
                            throw new NoCredentialException("The device does not contain a restore credential.");
                        }
                        n7.r rVar = new n7.r(bundle, "androidx.credentials.TYPE_RESTORE_CREDENTIAL");
                        if (string.length() != 0) {
                            try {
                                new JSONObject(string);
                                return rVar;
                            } catch (Exception unused2) {
                            }
                        }
                        throw new IllegalArgumentException("authenticationResponseJson must not be empty, and must be a valid JSON");
                    }
                    throw new FrameworkClassParsingException();
                case -543568185:
                    if (str.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                        try {
                            String string2 = bundle.getString("androidx.credentials.BUNDLE_KEY_ID");
                            String string3 = bundle.getString("androidx.credentials.BUNDLE_KEY_PASSWORD");
                            string2.getClass();
                            string3.getClass();
                            return new n7.r(1, bundle, string3);
                        } catch (Exception unused3) {
                            throw new FrameworkClassParsingException();
                        }
                    }
                    throw new FrameworkClassParsingException();
                case -95037569:
                    if (str.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                        try {
                            String string4 = bundle.getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON");
                            string4.getClass();
                            return new n7.r(2, bundle, string4);
                        } catch (Exception unused4) {
                            throw new FrameworkClassParsingException();
                        }
                    }
                    throw new FrameworkClassParsingException();
                default:
                    throw new FrameworkClassParsingException();
            }
        } catch (FrameworkClassParsingException unused5) {
            return new n7.q(bundle, str);
        }
    }

    public static ax.b q(JSONObject jSONObject) throws JSONException {
        if (jSONObject.getInt("version") > 1) {
            throw new FacebookException("Unknown AccessToken serialization format.");
        }
        String string = jSONObject.getString("token");
        Date date = new Date(jSONObject.getLong(Banner.EXPIRATION));
        JSONArray jSONArray = jSONObject.getJSONArray("permissions");
        JSONArray jSONArray2 = jSONObject.getJSONArray("declined_permissions");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("expired_permissions");
        Date date2 = new Date(jSONObject.getLong("last_refresh"));
        String string2 = jSONObject.getString("source");
        string2.getClass();
        ax.k kVarValueOf = ax.k.valueOf(string2);
        String string3 = jSONObject.getString("application_id");
        String string4 = jSONObject.getString("user_id");
        Date date3 = new Date(jSONObject.optLong("data_access_expiration_time", 0L));
        String strOptString = jSONObject.optString("graph_domain", null);
        string.getClass();
        string3.getClass();
        string4.getClass();
        jSONArray.getClass();
        ArrayList arrayListZ = n0.z(jSONArray);
        jSONArray2.getClass();
        return new ax.b(string, string3, string4, arrayListZ, n0.z(jSONArray2), jSONArrayOptJSONArray == null ? new ArrayList() : n0.z(jSONArrayOptJSONArray), kVarValueOf, date, date2, date3, strOptString);
    }

    public static final long r(float f11, long j9) {
        return q1.h.a(y(j9) / f11, z(j9) / f11);
    }

    public static final float s(long j9, long j11) {
        return (z(j11) * z(j9)) + (y(j11) * y(j9));
    }

    public static View t(int i11, View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View viewFindViewById = viewGroup.getChildAt(i12).findViewById(i11);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return null;
    }

    public static q90.s u(SSLSession sSLSession) throws IOException {
        List listK;
        sSLSession.getClass();
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            h2.b("cipherSuite == null");
            return null;
        }
        if (Intrinsics.areEqual(cipherSuite, "TLS_NULL_WITH_NULL_NULL") || Intrinsics.areEqual(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
            i4.a.k("cipherSuite == ".concat(cipherSuite));
            return null;
        }
        q90.l lVarF = q90.l.f36523b.f(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            h2.b("tlsVersion == null");
            return null;
        }
        if (Intrinsics.areEqual("NONE", protocol)) {
            i4.a.k("tlsVersion == NONE");
            return null;
        }
        q90.u0.Companion.getClass();
        q90.u0 u0VarA = q90.t0.a(protocol);
        try {
            listK = r90.g.k(sSLSession.getPeerCertificates());
        } catch (SSLPeerUnverifiedException unused) {
            listK = kotlin.collections.n0.f26529a;
        }
        return new q90.s(u0VarA, lVarF, r90.g.k(sSLSession.getLocalCertificates()), new cw.a(listK, 6));
    }

    public static ax.b v() {
        return ax.j.f4928f.s().f4932c;
    }

    public static final long w(long j9) {
        float fSqrt = (float) Math.sqrt((z(j9) * z(j9)) + (y(j9) * y(j9)));
        if (fSqrt > 0.0f) {
            return r(fSqrt, j9);
        }
        i4.a.f("Can't get the direction of a 0-length vector");
        return 0L;
    }

    public static String x(Activity activity) {
        try {
            ActivityInfo activityInfo = activity.getPackageManager().getActivityInfo(activity.getComponentName(), 128);
            activityInfo.getClass();
            CharSequence title = activity.getTitle();
            title.getClass();
            if (!StringsKt.H(title)) {
                return activity.getTitle().toString();
            }
            int i11 = activityInfo.labelRes;
            if (i11 != 0) {
                String string = activity.getString(i11);
                string.getClass();
                return string;
            }
            CharSequence charSequence = activityInfo.nonLocalizedLabel;
            charSequence.getClass();
            if (!StringsKt.H(charSequence)) {
                return activityInfo.nonLocalizedLabel.toString();
            }
            String str = activityInfo.name;
            str.getClass();
            if (StringsKt.H(str)) {
                String localClassName = activity.getLocalClassName();
                localClassName.getClass();
                return localClassName;
            }
            String str2 = activityInfo.name;
            str2.getClass();
            return str2;
        } catch (Exception unused) {
            return activity.getApplicationInfo().loadLabel(activity.getPackageManager()).toString();
        }
    }

    public static final float y(long j9) {
        return Float.intBitsToFloat((int) (j9 >> 32));
    }

    public static final float z(long j9) {
        return Float.intBitsToFloat((int) (j9 & 4294967295L));
    }
}
