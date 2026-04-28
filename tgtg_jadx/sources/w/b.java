package w;

import a3.u1;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.InputFilter;
import android.text.format.DateFormat;
import android.text.method.TransformationMethod;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.lifecycle.l1;
import b4.q;
import c5.d2;
import c5.f1;
import c5.v0;
import c5.x1;
import com.app.tgtg.R;
import com.app.tgtg.feature.logincharity.ui.model.Country;
import com.app.tgtg.model.remote.discover.response.DiscoverBucket;
import com.app.tgtg.model.remote.item.PickupInterval;
import com.app.tgtg.model.remote.item.response.CharityItem;
import com.app.tgtg.model.remote.order.AdditionalOrderInformation;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.order.OrderType;
import com.braze.g2;
import com.facebook.FacebookException;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.m2;
import f2.c0;
import f2.l;
import f2.m;
import f2.t;
import g3.ga;
import g3.i2;
import g3.r9;
import g3.t3;
import g3.x5;
import i80.o;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.net.HttpURLConnection;
import java.text.SimpleDateFormat;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import m3.b1;
import m3.c3;
import m3.h1;
import m3.n;
import m3.s;
import m3.w1;
import n80.p;
import o00.x0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import s1.c1;
import s1.d1;
import s1.j1;
import s1.y0;
import s1.z0;
import x60.j;
import z1.h2;
import z4.u0;
import zendesk.messaging.android.internal.conversationscreen.TimeConstants;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements e6.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f42645a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f42646b = 0;

    public static final boolean A(Bundle bundle, String str) {
        str.getClass();
        return bundle.containsKey(str);
    }

    public static q90.a0 B(String str, String str2, q90.n0 n0Var) {
        StringBuilder sbO = b3.i.o("form-data; name=");
        q90.z zVar = q90.b0.f36414e;
        v0.n.q(str, sbO);
        if (str2 != null) {
            sbO.append("; filename=");
            v0.n.q(str2, sbO);
        }
        String string = sbO.toString();
        ax.g0 g0Var = new ax.g0(3);
        g0Var.e("Content-Disposition", string);
        q90.t tVarG = g0Var.g();
        if (tVarG.b("Content-Type") != null) {
            i4.a.f("Unexpected header: Content-Type");
            return null;
        }
        if (tVarG.b("Content-Length") == null) {
            return new q90.a0(tVarG, n0Var);
        }
        i4.a.f("Unexpected header: Content-Length");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0199  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ax.k0 C(ax.h0 r22, java.net.HttpURLConnection r23, java.lang.Object r24, java.lang.Object r25) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w.b.C(ax.h0, java.net.HttpURLConnection, java.lang.Object, java.lang.Object):ax.k0");
    }

    public static ArrayList D(InputStream inputStream, HttpURLConnection httpURLConnection, ax.j0 j0Var) throws JSONException, IOException {
        Object obj;
        j0Var.getClass();
        String strF = tx.n0.F(inputStream);
        l50.a aVar = tx.f0.f40508d;
        l50.a.A(ax.m0.INCLUDE_RAW_RESPONSES, "Response", "Response (raw)\n  Size: %d\n  Response:\n%s\n", Integer.valueOf(strF.length()), strF);
        Object objNextValue = new JSONTokener(strF).nextValue();
        objNextValue.getClass();
        int size = j0Var.f4938c.size();
        ArrayList arrayList = new ArrayList(size);
        if (size == 1) {
            ax.h0 h0Var = (ax.h0) j0Var.get(0);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("body", objNextValue);
                jSONObject.put("code", httpURLConnection.getResponseCode());
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(jSONObject);
                obj = jSONArray;
            } catch (IOException e5) {
                arrayList.add(new ax.k0(h0Var, httpURLConnection, new ax.w(e5)));
                obj = objNextValue;
            } catch (JSONException e11) {
                arrayList.add(new ax.k0(h0Var, httpURLConnection, new ax.w(e11)));
                obj = objNextValue;
            }
        } else {
            obj = objNextValue;
        }
        if (obj instanceof JSONArray) {
            JSONArray jSONArray2 = (JSONArray) obj;
            if (jSONArray2.length() == size) {
                int length = jSONArray2.length();
                for (int i11 = 0; i11 < length; i11++) {
                    ax.h0 h0Var2 = (ax.h0) j0Var.get(i11);
                    try {
                        Object obj2 = ((JSONArray) obj).get(i11);
                        obj2.getClass();
                        arrayList.add(C(h0Var2, httpURLConnection, obj2, objNextValue));
                    } catch (FacebookException e12) {
                        arrayList.add(new ax.k0(h0Var2, httpURLConnection, new ax.w(e12)));
                    } catch (JSONException e13) {
                        arrayList.add(new ax.k0(h0Var2, httpURLConnection, new ax.w(e13)));
                    }
                }
                l50.a aVar2 = tx.f0.f40508d;
                l50.a.A(ax.m0.REQUESTS, "Response", "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", j0Var.f4937b, Integer.valueOf(strF.length()), arrayList);
                return arrayList;
            }
        }
        throw new FacebookException("Unexpected number of results");
    }

    public static l1 E(Class cls) throws InvocationTargetException {
        cls.getClass();
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                a40.d0.k(a0.k(cls, "Cannot create an instance of "));
                return null;
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                objNewInstance.getClass();
                return (l1) objNewInstance;
            } catch (IllegalAccessException e5) {
                a40.d0.o(a0.k(cls, "Cannot create an instance of "), e5);
                return null;
            } catch (InstantiationException e11) {
                a40.d0.o(a0.k(cls, "Cannot create an instance of "), e11);
                return null;
            }
        } catch (NoSuchMethodException e12) {
            a40.d0.o(a0.k(cls, "Cannot create an instance of "), e12);
            return null;
        }
    }

    public static w0.a F() {
        if (w0.a.f42800b != null) {
            return w0.a.f42800b;
        }
        synchronized (w0.a.class) {
            try {
                if (w0.a.f42800b == null) {
                    w0.a.f42800b = new w0.a(0);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return w0.a.f42800b;
    }

    public static z2.b G(z2.b bVar, z5.m mVar, m5.u0 u0Var, z5.c cVar, q5.h hVar) {
        if (bVar != null && mVar == bVar.f46798a && Intrinsics.areEqual(m5.k0.k(u0Var, mVar), bVar.f46799b) && cVar.a() == bVar.f46800c.f47272a && hVar == bVar.f46801d) {
            return bVar;
        }
        z2.b bVar2 = z2.b.f46797h;
        if (bVar2 != null && mVar == bVar2.f46798a && Intrinsics.areEqual(m5.k0.k(u0Var, mVar), bVar2.f46799b) && cVar.a() == bVar2.f46800c.f47272a && hVar == bVar2.f46801d) {
            return bVar2;
        }
        z2.b bVar3 = new z2.b(mVar, m5.k0.k(u0Var, mVar), new z5.d(cVar.a(), cVar.X()), hVar);
        z2.b.f46797h = bVar3;
        return bVar3;
    }

    public static final int K(Bundle bundle, String str) {
        str.getClass();
        int i11 = bundle.getInt(str, Integer.MIN_VALUE);
        if (i11 != Integer.MIN_VALUE || bundle.getInt(str, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i11;
        }
        w0.e.D(str);
        throw null;
    }

    public static final int L(i2.v vVar) {
        return (int) (vVar.f22910e == h2.Vertical ? vVar.f() & 4294967295L : vVar.f() >> 32);
    }

    public static final Bundle M(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        w0.e.D(str);
        throw null;
    }

    public static final String N(Bundle bundle, String str) {
        str.getClass();
        String string = bundle.getString(str);
        if (string != null) {
            return string;
        }
        w0.e.D(str);
        throw null;
    }

    public static final String[] O(Bundle bundle, String str) {
        str.getClass();
        String[] stringArray = bundle.getStringArray(str);
        if (stringArray != null) {
            return stringArray;
        }
        w0.e.D(str);
        throw null;
    }

    public static w0.d Q() {
        if (w0.d.f42809c != null) {
            return w0.d.f42809c;
        }
        synchronized (w0.d.class) {
            try {
                if (w0.d.f42809c == null) {
                    w0.d.f42809c = new w0.d(0);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return w0.d.f42809c;
    }

    public static final boolean T(Bundle bundle, String str) {
        str.getClass();
        return A(bundle, str) && bundle.get(str) == null;
    }

    public static w0.c U() {
        if (w0.e.f42812a != null) {
            return w0.e.f42812a;
        }
        synchronized (w0.e.class) {
            try {
                if (w0.e.f42812a == null) {
                    w0.e.f42812a = new w0.c(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return w0.e.f42812a;
    }

    public static final void a(Order order, m3.n nVar, int i11) {
        String expectedDeliveryUtc;
        order.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(57043158);
        int i12 = (sVar.h(order) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            Context context = (Context) sVar.j(v0.f7390b);
            AdditionalOrderInformation additionalOrderInformation = order.getAdditionalOrderInformation();
            String strO = (additionalOrderInformation == null || (expectedDeliveryUtc = additionalOrderInformation.getExpectedDeliveryUtc()) == null) ? null : android.support.v4.media.session.a.o(context, expectedDeliveryUtc);
            if (strO == null) {
                sVar.a0(-1434061428);
                sVar.q(false);
            } else {
                sVar.a0(-1434061427);
                pd.g.e(strO, false, sVar, 0, 2);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new co.v(order, i11, 0);
        }
    }

    public static final void b(b4.t tVar, CharityItem charityItem, Function0 function0, Function0 function02, Function0 function03, m3.n nVar, int i11) {
        m3.s sVar;
        b4.t tVar2;
        Function0 function04 = function0;
        charityItem.getClass();
        function04.getClass();
        function02.getClass();
        function03.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(1033319886);
        int i12 = i11 | 6 | (sVar2.h(charityItem) ? 32 : 16) | (sVar2.h(function04) ? 256 : 128) | (sVar2.h(function02) ? NewHope.SENDB_BYTES : 1024) | (sVar2.h(function03) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192);
        if (sVar2.R(i12 & 1, (i12 & 9363) != 9362)) {
            float f11 = 40;
            b4.q qVar = b4.q.f5711a;
            b4.t tVarD = d2.c.D(qVar, 0.0f, 0.0f, 0.0f, f11, 7);
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5695n, sVar2, 48);
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
            b5.g gVar = b5.i.f5843f;
            m3.i.C(yVarA, gVar, sVar2);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar2, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar2, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar2);
            b4.t tVarD2 = m2.d(qVar, 1.0f);
            z4.u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode2 = Long.hashCode(sVar2.T);
            u3.i iVarL2 = sVar2.l();
            b4.t tVarC2 = b4.a.c(tVarD2, sVar2);
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            m3.i.C(u0VarD, gVar, sVar2);
            m3.i.C(iVarL2, gVar2, sVar2);
            a0.y(iHashCode2, sVar2, gVar3, sVar2, dVar);
            m3.i.C(tVarC2, gVar4, sVar2);
            float f12 = 16;
            b4.t tVarA = d2.u.f13938a.a(d2.c.D(qVar, 0.0f, f12, f12, 0.0f, 9), b4.d.f5688f);
            bm.f fVar = new bm.f(8, function03);
            c5.s sVar3 = c5.m2.f7291a;
            v1.n.d(x0.z(R.drawable.ic_close24, sVar2, 0), "CloseButton", b4.a.a(tVarA, sVar3, fVar), null, null, 0.0f, null, sVar2, 56, 120);
            sVar2.q(true);
            l2.f fVar2 = l2.g.f26790a;
            gd.o.c(mv.d.k(charityItem).getCurrentUrl(), "LogoPicture", m2.m(v1.n.k(f4.g.b(qVar, fVar2), 1, lv.s.H, fVar2), 65), null, x0.z(R.drawable.gfx_tgtg_logo_green_small, sVar2, 0), null, z4.l.f47166a, 0.0f, null, sVar2, 32816, 6, 31720);
            b4.t tVarD3 = d2.c.D(qVar, 0.0f, 8, 0.0f, 0.0f, 13);
            String strG = o30.f0.G(R.plurals.charity_donation_from, 1, new Object[]{1}, sVar2);
            m5.u0 u0Var = lv.v.f28276p;
            long j9 = lv.s.D;
            r9.d(strG, tVarD3, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar2, 432, 12582912, 131064);
            b4.t tVarB = d2.c.B(m2.u(qVar, null, 3), f11, 0.0f, 2);
            String storeNameAndBranch = mv.d.m(charityItem).getStoreNameAndBranch();
            if (storeNameAndBranch == null) {
                storeNameAndBranch = "";
            }
            m5.u0 u0Var2 = lv.v.f28272k;
            long j11 = lv.s.C;
            r9.d(storeNameAndBranch, tVarB, j11, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, u0Var2, sVar2, 432, 12582912, 130040);
            b4.t tVarJ = d2.j(d2.c.A(v1.n.j(d2.c.D(m2.u(qVar, null, 3), 0.0f, f12, 0.0f, 0.0f, 13), lv.s.I, l2.g.b(108)), f12, 4), "PickupTime");
            String strR = ii.l.r(charityItem, sVar2);
            m5.u0 u0Var3 = lv.v.f28274n;
            r9.d(strR, tVarJ, j11, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var3, sVar2, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
            float f13 = 32;
            g3.s0.g(d2.j(m2.d(d2.c.C(qVar, f12, f13, f12, f13), 1.0f), "HorizontalDivider"), 0.0f, 0L, sVar2, 0, 6);
            b4.t tVarJ2 = d2.j(b4.a.a(d2.c.B(m2.u(qVar, null, 3), f11, 0.0f, 2), sVar3, new bm.f(7, function02)), "TermsConditions");
            sVar2.a0(353811139);
            m5.e eVar = new m5.e();
            String strU = o30.f0.U(sVar2, R.string.charity_terms_text);
            String strU2 = o30.f0.U(sVar2, R.string.charity_terms_highlight);
            int iG = StringsKt.G(strU, strU2, 0, false, 6);
            int length = strU2.length() + iG;
            int i13 = eVar.i(new m5.l0(j9, 0L, (q5.r) null, (q5.n) null, (q5.o) null, (q5.i) null, (String) null, 0L, (x5.a) null, (x5.p) null, (t5.c) null, 0L, (x5.l) null, (i4.u0) null, 65534));
            try {
                eVar.c(strU);
                eVar.g(i13);
                eVar.b(new m5.l0(lv.s.f28217b, 0L, q5.r.f36044i, (q5.n) null, (q5.o) null, (q5.i) null, (String) null, 0L, (x5.a) null, (x5.p) null, (t5.c) null, 0L, (x5.l) null, (i4.u0) null, 65530), iG, length);
                m5.h hVarJ = eVar.j();
                sVar2.q(false);
                r9.e(hVarJ, tVarJ2, j11, 0L, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, null, u0Var3, sVar2, MLKEMEngine.KyberPolyBytes, 100663296, 261112);
                b4.t tVarD4 = d2.c.D(m2.d(qVar, 1.0f), f12, 24, f12, 0.0f, 8);
                String strU3 = o30.f0.U(sVar2, R.string.charity_confirm_reservation);
                boolean z11 = (i12 & 896) == 256;
                Object objM = sVar2.M();
                if (z11 || objM == m3.m.f29332a) {
                    function04 = function0;
                    objM = new ar.d(19, function04);
                    sVar2.k0(objM);
                } else {
                    function04 = function0;
                }
                v0.n.l(tVarD4, strU3, null, null, null, false, false, null, null, (Function0) objM, sVar2, 0, 508);
                sVar = sVar2;
                sVar.q(true);
                tVar2 = qVar;
            } catch (Throwable th2) {
                eVar.g(i13);
                throw th2;
            }
        } else {
            sVar = sVar2;
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ap.b(tVar2, charityItem, function04, function02, function03, i11, 5);
        }
    }

    public static final void c(b4.t tVar, Date date, boolean z11, boolean z12, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1345268112);
        int i12 = i11 | (sVar.f(tVar) ? 4 : 2) | (sVar.h(date) ? 32 : 16) | (sVar.g(z11) ? 256 : 128) | (sVar.g(z12) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E", Locale.getDefault());
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd", Locale.getDefault());
            c3 c3VarA = d1.a(z12 ? lv.s.f28217b : lv.s.K, t1.c.k(350, 0, null, 6), "BackgroundColor", sVar, 432, 8);
            c3 c3VarA2 = d1.a(z12 ? lv.s.J : lv.s.C, t1.c.k(350, 0, null, 6), "TextColor", sVar, 432, 8);
            b4.t tVarJ = v1.n.j(d2.c.k(tVar, 1.0f), ((i4.v) c3VarA.getValue()).f23317a, l2.g.b(4));
            d2.y yVarA = d2.w.a(d2.i.f13805e, b4.d.f5694m, sVar, 6);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarJ, sVar);
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
            b4.q qVar = b4.q.f5711a;
            b4.t tVarJ2 = d2.j(m2.t(m2.d(qVar, 1.0f), 3), "PlanDayText");
            String str = simpleDateFormat.format(date);
            str.getClass();
            r9.d(str, tVarJ2, ((i4.v) c3VarA2.getValue()).f23317a, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, z11 ? lv.v.f28277q : lv.v.f28276p, sVar, 48, 0, 130040);
            b4.t tVarJ3 = d2.j(m2.t(d2.c.D(m2.d(qVar, 1.0f), 0.0f, lv.t.f28249c, 0.0f, 0.0f, 13), 3), "PlanDateText");
            String str2 = simpleDateFormat2.format(date);
            str2.getClass();
            r9.d(str2, tVarJ3, ((i4.v) c3VarA2.getValue()).f23317a, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, z11 ? lv.v.f28275o : lv.v.f28274n, sVar, 48, 0, 130040);
            sVar = sVar;
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new hg.g(tVar, date, z11, z12, i11);
        }
    }

    public static final void d(DiscoverBucket discoverBucket, Function0 function0, b4.t tVar, m3.n nVar, int i11) {
        b4.t tVar2;
        boolean z11;
        function0.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1718903756);
        int i12 = i11 | (sVar.h(discoverBucket) ? 4 : 2) | (sVar.h(function0) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            b4.q qVar = b4.q.f5711a;
            b4.t tVarD = m2.d(qVar, 1.0f);
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5695n, sVar, 48);
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
            b4.t tVarD2 = m2.d(qVar, 1.0f);
            float f11 = lv.t.f28253g;
            g3.s0.b(d2.c.A(tVarD2, f11, f11), l2.g.b(15), g3.s0.p(lv.s.f28217b, sVar, 6), null, null, u3.e.e(921213364, sVar, new u1(discoverBucket, function0, false, 13)), sVar, 196614, 24);
            String spacer = discoverBucket != null ? discoverBucket.getSpacer() : null;
            if (spacer == null) {
                sVar.a0(1363427170);
                sVar.q(false);
                z11 = true;
            } else {
                sVar.a0(1363427171);
                b4.t tVarD3 = m2.d(qVar, 1.0f);
                float f12 = lv.t.f28255i;
                float f13 = lv.t.f28248b;
                b4.t tVarA = d2.c.A(tVarD3, f12 + f13, f11);
                z4.u0 u0VarD = d2.p.d(b4.d.f5687e, false);
                int iHashCode2 = Long.hashCode(sVar.T);
                u3.i iVarL2 = sVar.l();
                b4.t tVarC2 = b4.a.c(tVarA, sVar);
                sVar.e0();
                if (sVar.S) {
                    sVar.k(hVar);
                } else {
                    sVar.n0();
                }
                m3.i.C(u0VarD, gVar, sVar);
                m3.i.C(iVarL2, gVar2, sVar);
                a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
                m3.i.C(tVarC2, gVar4, sVar);
                v0.n.e(m2.e(m2.d(qVar, 1.0f), 6), 0L, 0.0f, 0.0f, 0.0f, sVar, 6);
                z11 = true;
                r9.d(spacer, d2.c.A(v1.n.j(qVar, lv.s.J, i4.g0.f23254b), lv.t.f28251e, f13), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28272k, sVar, 48, 12582912, 131068);
                sVar = sVar;
                sVar.q(true);
                sVar.q(false);
            }
            sVar.q(z11);
            tVar2 = qVar;
        } else {
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new an.d(discoverBucket, function0, tVar2, i11, 23);
        }
    }

    public static final void e(Order order, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1010815917);
        int i12 = (sVar.h(order) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            g(order, true, sVar, (i12 & 14) | 48, 0);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new co.v(order, i11, 2);
        }
    }

    public static final void f(Order order, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-923918329);
        int i12 = (sVar.h(order) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            int i13 = co.z.$EnumSwitchMapping$0[order.getOrderType().ordinal()];
            if (i13 == 1) {
                sVar.a0(1172719359);
                e(order, sVar, i12 & 14);
                sVar.q(false);
            } else if (i13 == 2) {
                sVar.a0(1172721244);
                i(order, sVar, i12 & 14);
                sVar.q(false);
            } else if (i13 == 3) {
                sVar.a0(1172722880);
                l(order, sVar, i12 & 14);
                sVar.q(false);
            } else if (i13 == 4) {
                sVar.a0(1172724672);
                l(order, sVar, i12 & 14);
                sVar.q(false);
            } else if (i13 != 5) {
                sVar.a0(1172727691);
                sVar.q(false);
            } else {
                sVar.a0(1172726461);
                a(order, sVar, i12 & 14);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new co.v(order, i11, 1);
        }
    }

    public static final void g(Order order, boolean z11, m3.n nVar, int i11, int i12) {
        boolean z12;
        String strT;
        String intervalEnd;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(60259463);
        int i13 = i11 | (sVar.h(order) ? 4 : 2);
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= sVar.g(z11) ? 32 : 16;
        }
        if (sVar.R(i13 & 1, (i13 & 19) != 18)) {
            boolean z13 = i14 != 0 ? false : z11;
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w("");
                sVar.k0(objM);
            }
            b1 b1Var = (b1) objM;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = m3.i.w(Boolean.FALSE);
                sVar.k0(objM2);
            }
            b1 b1Var2 = (b1) objM2;
            PickupInterval pickupInterval = order.getPickupInterval();
            long jH = (pickupInterval == null || (intervalEnd = pickupInterval.getIntervalEnd()) == null) ? 0L : mv.p0.h(intervalEnd) - System.currentTimeMillis();
            Unit unit = Unit.f26487a;
            boolean zE = sVar.e(jH);
            Object objM3 = sVar.M();
            if (zE || objM3 == fVar) {
                objM3 = new co.m(jH, b1Var2, b1Var, (x70.c) null);
                sVar.k0(objM3);
            }
            m3.i.h(unit, (Function2) objM3, sVar);
            if (((Boolean) b1Var2.getValue()).booleanValue()) {
                strT = b3.i.j(-106108656, R.string.blob_info_row_surprise_collect_now, sVar, sVar, false);
            } else {
                sVar.a0(-106027591);
                strT = o30.f0.T(R.string.blob_info_row_surprise_15_mins_until_pickup_ends, new Object[]{(String) b1Var.getValue()}, sVar);
                sVar.q(false);
            }
            pd.g.e(strT, z13, sVar, i13 & 112, 0);
            z12 = z13;
        } else {
            sVar.U();
            z12 = z11;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new co.w(order, z12, i11, i12, 0);
        }
    }

    public static final void h(jd.f fVar, m3.n nVar, int i11) {
        fVar.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(740678790);
        int i12 = (sVar.f(fVar) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            x5.a(v4.f.a(m2.f13850c, ga.c(sVar).f18456c, null), u3.e.e(1776659522, sVar, new tq.a(fVar, 0, (byte) 0)), null, null, null, 0, 0L, 0L, null, u3.e.e(-1576699945, sVar, new a3.m2(fVar, 29)), sVar, 805306416, 508);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new tq.a(fVar, i11);
        }
    }

    public static final void i(Order order, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(599723845);
        int i12 = (sVar.h(order) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            AdditionalOrderInformation additionalOrderInformation = order.getAdditionalOrderInformation();
            String strT = null;
            String expectedDeliveryUtc = additionalOrderInformation != null ? additionalOrderInformation.getExpectedDeliveryUtc() : null;
            if (expectedDeliveryUtc == null) {
                sVar.a0(-690774356);
                sVar.q(false);
            } else {
                sVar.a0(-690774355);
                String strP = mv.p0.p(expectedDeliveryUtc);
                if (strP != null) {
                    expectedDeliveryUtc = strP;
                }
                strT = o30.f0.T(R.string.blob_info_row_parcels_estimated_date, new Object[]{expectedDeliveryUtc}, sVar);
                sVar.q(false);
            }
            if (strT == null) {
                strT = b3.i.j(809007595, R.string.blob_info_row_parcels_estimated_date_fallback, sVar, sVar, false);
            } else {
                sVar.a0(808999318);
                sVar.q(false);
            }
            pd.g.e(strT, false, sVar, 0, 2);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new co.v(order, i11, 3);
        }
    }

    public static final void j(Order order, co.q qVar, co.c cVar, boolean z11, Function1 function1, m3.n nVar, int i11) {
        b4.q qVar2;
        b4.t tVarC;
        float f11;
        order.getClass();
        qVar.getClass();
        cVar.getClass();
        function1.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-2087604580);
        int i12 = i11 | (sVar.h(order) ? 4 : 2) | (sVar.d(qVar.ordinal()) ? 32 : 16) | (sVar.d(cVar.ordinal()) ? 256 : 128) | (sVar.g(z11) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i12 & 1, (i12 & 9363) != 9362)) {
            PickupInterval pickupInterval = order.getPickupInterval();
            String intervalEnd = pickupInterval != null ? pickupInterval.getIntervalEnd() : null;
            intervalEnd.getClass();
            long jH = (mv.p0.h(intervalEnd) - mv.p0.o()) / TimeConstants.ONE_MINUTE_DIFFERENCE;
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = a0.s(0, sVar);
            }
            h1 h1Var = (h1) objM;
            Activity activity = (Activity) sVar.j(e.k.f15295a);
            Activity activityE = activity != null ? mv.r0.e(activity) : null;
            co.q qVar3 = co.q.MINIMISED;
            b4.q qVar4 = b4.q.f5711a;
            if (qVar != qVar3) {
                sVar.a0(-701064490);
                boolean zH = sVar.h(activityE) | sVar.h(order);
                Object objM2 = sVar.M();
                if (zH || objM2 == fVar) {
                    objM2 = new bs.b(9, activityE, order);
                    sVar.k0(objM2);
                }
                tVarC = androidx.compose.foundation.b.c(qVar4, false, null, null, (Function0) objM2, 15);
                qVar2 = qVar4;
                sVar.q(false);
            } else {
                qVar2 = qVar4;
                sVar.a0(-700857906);
                sVar.q(false);
                tVarC = qVar2;
            }
            u00.d.g(order, qVar, tVarC, sVar, i12 & 126);
            if ((qVar != qVar3 || jH > 15) && order.getOrderType() != OrderType.FLASH_SALES) {
                sVar.a0(-700482589);
                sVar.q(false);
                function1.invoke(Boolean.FALSE);
            } else {
                sVar.a0(-700675099);
                function1.invoke(Boolean.TRUE);
                n(order, order.getOrderType() == OrderType.FLASH_SALES, cVar, sVar, i12 & 910);
                sVar.q(false);
            }
            boolean z12 = !z11 && qVar == co.q.MAXIMISED;
            s1.x0 x0VarD = s1.r0.d(t1.c.k(300, 0, null, 6), 2);
            y0 y0VarE = s1.r0.e(t1.c.k(300, 0, null, 6), 2);
            if (cVar == co.c.START) {
                sVar.a0(-700175286);
                sVar.q(false);
                f11 = lv.t.f28258m;
            } else {
                sVar.a0(-700108884);
                f11 = (-d70.a.e(sVar, h1Var.h())) - lv.t.f28251e;
                sVar.q(false);
            }
            b4.t tVarW = d2.c.w(qVar2, f11, 0.0f, 2);
            Object objM3 = sVar.M();
            if (objM3 == fVar) {
                objM3 = new co.t(h1Var, 2);
                sVar.k0(objM3);
            }
            s1.y.d(z12, z4.c0.q(tVarW, (Function1) objM3), x0VarD, y0VarE, null, u3.e.e(-792680588, sVar, new a3.m2(order, 4)), sVar, 200064, 16);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bg.d(order, qVar, cVar, z11, function1, i11, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    public static final void k(b4.t tVar, String str, i4.v vVar, Integer num, boolean z11, Boolean bool, m3.n nVar, int i11) {
        m3.s sVar;
        b4.q qVar;
        ?? r12;
        m3.s sVar2;
        m3.s sVar3;
        m3.s sVar4;
        tVar.getClass();
        m3.s sVar5 = (m3.s) nVar;
        sVar5.c0(821207246);
        int i12 = i11 | (sVar5.f(tVar) ? 4 : 2) | (sVar5.f(str) ? 32 : 16) | (sVar5.f(vVar) ? 256 : 128) | (sVar5.f(num) ? NewHope.SENDB_BYTES : 1024) | (sVar5.g(z11) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar5.f(bool) ? 131072 : 65536);
        if (sVar5.R(i12 & 1, (74899 & i12) != 74898)) {
            z4.u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar5.T);
            u3.i iVarL = sVar5.l();
            b4.t tVarC = b4.a.c(tVar, sVar5);
            b5.j.R.getClass();
            Function0 function0 = b5.i.f5839b;
            sVar5.e0();
            if (sVar5.S) {
                sVar5.k(function0);
            } else {
                sVar5.n0();
            }
            m3.i.C(u0VarD, b5.i.f5843f, sVar5);
            m3.i.C(iVarL, b5.i.f5842e, sVar5);
            m3.i.v(sVar5, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar5, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar5);
            b4.q qVar2 = b4.q.f5711a;
            if (z11) {
                sVar5.a0(1622869883);
                float f11 = 45;
                b4.t tVarL = m2.l(m2.h(qVar2, f11), f11);
                Object objM = sVar5.M();
                Object obj = m3.m.f29332a;
                if (objM == obj) {
                    objM = un.e.f41462a;
                    sVar5.k0(objM);
                }
                i80.n nVar2 = (i80.n) ((KFunction) objM);
                boolean z12 = (i12 & 112) == 32;
                Object objM2 = sVar5.M();
                if (z12 || objM2 == obj) {
                    objM2 = new qb.s(str, 22);
                    sVar5.k0(objM2);
                }
                c6.l.b(nVar2, tVarL, (Function1) objM2, sVar5, 54, 0);
                sVar5.q(false);
                sVar4 = sVar5;
            } else {
                sVar5.a0(1623209085);
                if (vVar == null) {
                    sVar5.a0(1623204496);
                    sVar5.q(false);
                } else {
                    sVar5.a0(1623204497);
                    long j9 = vVar.f23317a;
                    l2.f fVar = l2.g.f26790a;
                    d2.p.a(f4.g.b(v1.n.k(m2.m(qVar2, 50), 1, j9, fVar), fVar), sVar5, 0);
                    sVar5.q(false);
                }
                if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                    sVar5.a0(1623496269);
                    i2.a(x0.z(2131232043, sVar5, 0), null, m2.m(f4.g.b(d2.c.z(qVar2, 1), l2.g.f26790a), 48), i4.v.f23315h, sVar5, 3128, 0);
                    m3.s sVar6 = sVar5;
                    sVar6.q(false);
                    qVar = qVar2;
                    r12 = 0;
                    sVar2 = sVar6;
                } else {
                    sVar5.a0(1623897750);
                    qVar = qVar2;
                    r12 = 0;
                    gd.o.c(str, null, m2.m(f4.g.b(d2.c.z(qVar2, 1), l2.g.f26790a), 48), null, x0.z(R.drawable.gfx_tgtg_logo_green, sVar5, 0), null, z4.l.f47172g, 0.0f, null, sVar5, ((i12 >> 3) & 14) | 32816, 6, 31720);
                    m3.s sVar7 = sVar5;
                    sVar7.q(false);
                    sVar2 = sVar7;
                }
                if (num == null) {
                    sVar2.a0(1624353325);
                    sVar2.q(r12);
                    sVar3 = sVar2;
                } else {
                    sVar2.a0(1624353326);
                    m3.s sVar8 = sVar2;
                    i2.a(x0.z(num.intValue(), sVar2, r12), null, d2.u.f13938a.a(m2.m(qVar, 16), b4.d.f5691i), i4.v.f23315h, sVar8, 3128, 0);
                    m3.s sVar9 = sVar8;
                    sVar9.q(r12);
                    sVar3 = sVar9;
                }
                sVar3.q(r12);
                sVar4 = sVar3;
            }
            sVar4.q(true);
            sVar = sVar4;
        } else {
            sVar5.U();
            sVar = sVar5;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cn.w(tVar, str, vVar, num, z11, bool, i11);
        }
    }

    public static final void l(Order order, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(242371354);
        int i12 = 4;
        int i13 = (sVar.h(order) ? 4 : 2) | i11;
        if (sVar.R(i13 & 1, (i13 & 3) != 2)) {
            PickupInterval pickupInterval = order.getPickupInterval();
            long jH = mv.p0.h(pickupInterval != null ? pickupInterval.getIntervalStart() : null);
            PickupInterval pickupInterval2 = order.getPickupInterval();
            long jH2 = mv.p0.h(pickupInterval2 != null ? pickupInterval2.getIntervalEnd() : null);
            long jO = mv.p0.o();
            long j9 = (jH - jO) / TimeConstants.ONE_MINUTE_DIFFERENCE;
            long j11 = (jH2 - jO) / TimeConstants.ONE_MINUTE_DIFFERENCE;
            Context context = (Context) sVar.j(v0.f7390b);
            PickupInterval pickupInterval3 = order.getPickupInterval();
            String strG = mv.p0.G(context, pickupInterval3 != null ? pickupInterval3.getIntervalEnd() : null);
            PickupInterval pickupInterval4 = order.getPickupInterval();
            String strG2 = mv.p0.G(context, pickupInterval4 != null ? pickupInterval4.getIntervalStart() : null);
            boolean z11 = jO <= jH2 + TimeConstants.FIFTEEN_MINUTES_DIFFERENCE;
            PickupInterval pickupInterval5 = order.getPickupInterval();
            if (mv.p0.C(pickupInterval5 != null ? pickupInterval5.getIntervalStart() : null)) {
                sVar.a0(645831096);
                pd.g.e(o30.f0.U(sVar, R.string.blob_info_row_surprise_collection_starts_tomorrow), false, sVar, 0, 2);
                sVar.q(false);
            } else if (j9 > 0) {
                sVar.a0(646093201);
                pd.g.e(o30.f0.T(R.string.blob_info_row_surprise_collection_starts_at, new Object[]{strG2}, sVar), false, sVar, 0, 2);
                sVar.q(false);
            } else if (j11 <= 15 && j11 > 0) {
                sVar.a0(646366001);
                g(order, false, sVar, i13 & 14, 2);
                sVar.q(false);
            } else if (jO >= jH && jO <= jH2) {
                sVar.a0(646544437);
                pd.g.e(o30.f0.T(R.string.blob_info_row_surprise_open_pickup_window, new Object[]{strG}, sVar), false, sVar, 0, 2);
                sVar.q(false);
            } else if (jO <= jH2 || !z11) {
                sVar.a0(990702366);
                sVar.q(false);
            } else {
                sVar.a0(646814695);
                pd.g.e(o30.f0.U(sVar, R.string.blob_info_row_surprise_collect_now), false, sVar, 0, 2);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new co.v(order, i11, i12);
        }
    }

    public static final void m(final int i11, final Function1 function1, b4.t tVar, final String str, float f11, int i12, float f12, final Function0 function0, m3.n nVar, final int i13) {
        int i14;
        b4.t tVar2;
        final float f13;
        final int i15;
        final float f14;
        m3.s sVar;
        Object jVar;
        int i16;
        h1 h1Var;
        x60.k kVar;
        f2.c0 c0Var;
        float f15;
        c3 c3Var;
        int i17;
        List list;
        m3.f fVar;
        Object iVar;
        List list2;
        float f16;
        m3.f fVar2;
        x60.k kVar2;
        c3 c3Var2;
        x60.h hVar;
        x60.j jVar2;
        int i18;
        final float f17;
        f2.c0 c0Var2;
        int i19;
        m3.f fVar3;
        boolean z11;
        b4.t tVarC;
        float f18;
        Object obj;
        function1.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-1104263561);
        if ((i13 & 6) == 0) {
            i14 = (sVar2.d(i11) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= sVar2.h(function1) ? 32 : 16;
        }
        int i21 = i14 | MLKEMEngine.KyberPolyBytes;
        if ((i13 & 3072) == 0) {
            i21 |= sVar2.f(str) ? NewHope.SENDB_BYTES : 1024;
        }
        int i22 = i21 | 1794048;
        if ((12582912 & i13) == 0) {
            i22 |= sVar2.d(23) ? 8388608 : 4194304;
        }
        if ((100663296 & i13) == 0) {
            i22 |= sVar2.h(function0) ? 67108864 : 33554432;
        }
        if (sVar2.R(i22 & 1, (38347923 & i22) != 38347922)) {
            float f19 = lv.t.f28257k;
            float f20 = 120;
            Context context = (Context) sVar2.j(v0.f7390b);
            x60.h hVar2 = (x60.h) sVar2.j(PantryThemeKt.getLocalPantryColor());
            x60.j jVar3 = (x60.j) sVar2.j(PantryThemeKt.getLocalPantryTypography());
            x60.k kVar3 = (x60.k) sVar2.j(PantryThemeKt.getLocalPantryRadius());
            boolean zIs24HourFormat = DateFormat.is24HourFormat(context);
            int i23 = i22 & 29360128;
            boolean zG = (i23 == 8388608) | sVar2.g(zIs24HourFormat);
            Object objM = sVar2.M();
            m3.f fVar4 = m3.m.f29332a;
            Object obj2 = objM;
            if (zG || objM == fVar4) {
                SimpleDateFormat simpleDateFormat = zIs24HourFormat ? new SimpleDateFormat("HH:mm", Locale.ROOT) : new SimpleDateFormat("hh a", Locale.getDefault());
                IntRange intRange = new IntRange(0, 23, 1);
                ArrayList arrayList = new ArrayList(kotlin.collections.e0.o(intRange, 10));
                Iterator it = intRange.iterator();
                while (((n80.h) it).f30715c) {
                    int iNextInt = ((kotlin.collections.s0) it).nextInt();
                    Calendar calendar = Calendar.getInstance();
                    calendar.set(11, iNextInt);
                    calendar.set(12, 0);
                    calendar.set(13, 0);
                    arrayList.add(simpleDateFormat.format(calendar.getTime()));
                }
                sVar2.k0(arrayList);
                obj2 = arrayList;
            }
            List list3 = (List) obj2;
            Object objM2 = sVar2.M();
            Object obj3 = objM2;
            if (objM2 == fVar4) {
                int iC = n80.p.c(i11, 0, 23) + 11998;
                if (iC < 0) {
                    iC = 0;
                }
                Integer numValueOf = Integer.valueOf(iC);
                sVar2.k0(numValueOf);
                obj3 = numValueOf;
            }
            int iIntValue = ((Number) obj3).intValue();
            f2.c0 c0VarA = f2.e0.a(iIntValue, 0, 6, 2, sVar2);
            a2.j jVarG = b0.a0.G(c0VarA, sVar2, 0, 2);
            Object objM3 = sVar2.M();
            int i24 = 2;
            Object obj4 = objM3;
            if (objM3 == fVar4) {
                m3.i0 i0VarQ = m3.i.q(new g2(c0VarA, iIntValue, i24, 1));
                sVar2.k0(i0VarQ);
                obj4 = i0VarQ;
            }
            c3 c3Var3 = (c3) obj4;
            Object objM4 = sVar2.M();
            Object objS = objM4;
            if (objM4 == fVar4) {
                objS = a0.s(i11, sVar2);
            }
            h1 h1Var2 = (h1) objS;
            Unit unit = Unit.f26487a;
            boolean zF = sVar2.f(c0VarA) | sVar2.d(24) | ((i22 & 112) == 32);
            Object objM5 = sVar2.M();
            if (zF || objM5 == fVar4) {
                i16 = 8388608;
                h1Var = h1Var2;
                kVar = kVar3;
                c0Var = c0VarA;
                f15 = f20;
                c3Var = c3Var3;
                i17 = i23;
                list = list3;
                fVar = fVar4;
                jVar = new defpackage.j(c0Var, 24, h1Var, function1, c3Var, (x70.c) null);
                sVar2.k0(jVar);
            } else {
                h1Var = h1Var2;
                kVar = kVar3;
                f15 = f20;
                c3Var = c3Var3;
                c0Var = c0VarA;
                i17 = i23;
                list = list3;
                jVar = objM5;
                fVar = fVar4;
                i16 = 8388608;
            }
            m3.i.h(unit, (Function2) jVar, sVar2);
            Integer numValueOf2 = Integer.valueOf(i11);
            boolean zF2 = (i17 == i16) | ((i22 & 14) == 4) | sVar2.f(c0Var) | sVar2.d(24) | sVar2.d(2) | sVar2.d(24000);
            Object objM6 = sVar2.M();
            if (zF2 || objM6 == fVar) {
                list2 = list;
                f16 = f15;
                fVar2 = fVar;
                kVar2 = kVar;
                c3Var2 = c3Var;
                hVar = hVar2;
                jVar2 = jVar3;
                i18 = i22;
                f17 = f19;
                c0Var2 = c0Var;
                i19 = NewHope.SENDB_BYTES;
                iVar = new kj.i(i11, h1Var, 24, 2, 24000, c0Var2, c3Var2, null);
                sVar2.k0(iVar);
            } else {
                list2 = list;
                f16 = f15;
                fVar2 = fVar;
                kVar2 = kVar;
                c3Var2 = c3Var;
                hVar = hVar2;
                jVar2 = jVar3;
                i18 = i22;
                iVar = objM6;
                f17 = f19;
                c0Var2 = c0Var;
                i19 = NewHope.SENDB_BYTES;
            }
            m3.i.h(numValueOf2, (Function2) iVar, sVar2);
            tVar2 = b4.q.f5711a;
            b4.t tVarE = m2.e(m2.q(tVar2, f16), 5 * f17);
            if (str == null || StringsKt.H(str)) {
                fVar3 = fVar2;
                z11 = false;
                sVar2.a0(-1957943653);
                sVar2.q(false);
                tVarC = tVar2;
            } else {
                sVar2.a0(-1958057764);
                boolean z12 = (i18 & 7168) == i19;
                Object objM7 = sVar2.M();
                if (z12) {
                    fVar3 = fVar2;
                } else {
                    fVar3 = fVar2;
                    obj = objM7;
                    if (objM7 == fVar3) {
                    }
                    z11 = false;
                    tVarC = j5.r.c(tVar2, false, (Function1) obj);
                    sVar2.q(false);
                }
                gt.e eVar = new gt.e(str, 14);
                sVar2.k0(eVar);
                obj = eVar;
                z11 = false;
                tVarC = j5.r.c(tVar2, false, (Function1) obj);
                sVar2.q(false);
            }
            b4.t tVarThen = tVarE.then(tVarC);
            boolean z13 = (234881024 & i18) == 67108864 ? true : z11 ? 1 : 0;
            Object objM8 = sVar2.M();
            Object obj5 = objM8;
            if (z13 || objM8 == fVar3) {
                t3 t3Var = new t3(1, function0);
                sVar2.k0(t3Var);
                obj5 = t3Var;
            }
            b4.t tVarA = w4.h0.a(tVarThen, function0, (PointerInputEventHandler) obj5);
            z4.u0 u0VarD = d2.p.d(b4.d.f5683a, z11);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            b4.t tVarC2 = b4.a.c(tVarA, sVar2);
            b5.j.R.getClass();
            b5.h hVar3 = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar3);
            } else {
                sVar2.n0();
            }
            m3.i.C(u0VarD, b5.i.f5843f, sVar2);
            m3.i.C(iVarL, b5.i.f5842e, sVar2);
            m3.i.v(sVar2, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar2, b5.i.f5845h);
            m3.i.C(tVarC2, b5.i.f5841d, sVar2);
            final x60.h hVar4 = hVar;
            d2.p.a(v1.n.j(f4.g.b(m2.d(m2.e(d2.u.f13938a.a(tVar2, b4.d.f5687e), f17), 1.0f), l2.g.b(kVar2.f43979c)), hVar4.B, i4.g0.f23254b), sVar2, z11 ? 1 : 0);
            b4.i iVar2 = b4.d.f5695n;
            final int i25 = 24000;
            boolean z14 = (sVar2.d(24000) ? 1 : 0) | (sVar2.f(c0Var2) ? 1 : 0);
            if ((57344 & i18) == 16384) {
                z11 = true;
            }
            boolean z15 = z14 | z11;
            final List list4 = list2;
            final int i26 = 24;
            final x60.j jVar4 = jVar2;
            boolean z16 = z15 | (sVar2.h(list4) ? 1 : 0) | (sVar2.d(24) ? 1 : 0) | (sVar2.f(hVar4) ? 1 : 0) | (sVar2.f(jVar4) ? 1 : 0);
            Object objM9 = sVar2.M();
            if (z16 != 0 || objM9 == fVar3) {
                final f2.c0 c0Var3 = c0Var2;
                final c3 c3Var4 = c3Var2;
                Function1 function12 = new Function1() { // from class: kj.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        l lVar = (l) obj6;
                        lVar.getClass();
                        final c0 c0Var4 = c0Var3;
                        final float f21 = f17;
                        final c3 c3Var5 = c3Var4;
                        final List list5 = list4;
                        final int i27 = i26;
                        final x60.h hVar5 = hVar4;
                        final j jVar5 = jVar4;
                        l.s(lVar, i25, null, new u3.d(new o() { // from class: kj.e
                            @Override // i80.o
                            public final Object invoke(Object obj7, Object obj8, Object obj9, Object obj10) {
                                Object next;
                                int iIntValue2 = ((Integer) obj8).intValue();
                                n nVar2 = (n) obj9;
                                int iIntValue3 = ((Integer) obj10).intValue();
                                ((f2.d) obj7).getClass();
                                if ((iIntValue3 & 48) == 0) {
                                    iIntValue3 |= ((s) nVar2).d(iIntValue2) ? 32 : 16;
                                }
                                s sVar3 = (s) nVar2;
                                if (sVar3.R(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                                    boolean z17 = iIntValue2 == ((Number) c3Var5.getValue()).intValue();
                                    f2.s sVarJ = c0Var4.j();
                                    int i28 = sVarJ.l;
                                    int i29 = sVarJ.f17193m;
                                    float f22 = (i28 + i29) / 2.0f;
                                    Iterator it2 = sVarJ.f17192k.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it2.next();
                                        if (((t) ((m) next)).f17199a == iIntValue2) {
                                            break;
                                        }
                                    }
                                    m mVar = (m) next;
                                    float fB = 0.25f;
                                    if (mVar != null) {
                                        t tVar3 = (t) mVar;
                                        fB = p.b(1.0f - (Math.min(1.0f, Math.abs(((tVar3.f17214q / 2.0f) + tVar3.f17213p) - f22) / Math.max(1.0f, (i29 - sVarJ.l) / 2.0f)) * 0.75f), 0.25f, 1.0f);
                                    }
                                    q qVar = q.f5711a;
                                    b4.t tVarD = m2.d(m2.e(qVar, f21), 1.0f);
                                    u0 u0VarD2 = d2.p.d(b4.d.f5687e, false);
                                    int iHashCode2 = Long.hashCode(sVar3.T);
                                    u3.i iVarL2 = sVar3.l();
                                    b4.t tVarC3 = b4.a.c(tVarD, sVar3);
                                    b5.j.R.getClass();
                                    b5.h hVar6 = b5.i.f5839b;
                                    sVar3.e0();
                                    if (sVar3.S) {
                                        sVar3.k(hVar6);
                                    } else {
                                        sVar3.n0();
                                    }
                                    m3.i.C(u0VarD2, b5.i.f5843f, sVar3);
                                    m3.i.C(iVarL2, b5.i.f5842e, sVar3);
                                    m3.i.v(sVar3, Integer.valueOf(iHashCode2), b5.i.f5844g);
                                    m3.i.z(sVar3, b5.i.f5845h);
                                    m3.i.C(tVarC3, b5.i.f5841d, sVar3);
                                    Object obj11 = list5.get(iIntValue2 % i27);
                                    obj11.getClass();
                                    String str2 = (String) obj11;
                                    x60.h hVar7 = hVar5;
                                    r9.d(str2, f4.g.a(qVar, fB), z17 ? hVar7.J : hVar7.V, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar5.f43965o, sVar3, 0, 0, 131064);
                                    sVar3.q(true);
                                } else {
                                    sVar3.U();
                                }
                                return Unit.f26487a;
                            }
                        }, true, -887618533), 6);
                        return Unit.f26487a;
                    }
                };
                f18 = f17;
                sVar2.k0(function12);
                objM9 = function12;
            } else {
                f18 = f17;
            }
            ox.h.c(null, c0Var2, null, null, iVar2, jVarG, false, null, (Function1) objM9, sVar2, 196608, 413);
            m3.s sVar3 = sVar2;
            sVar3.q(true);
            f13 = f18;
            f14 = f16;
            i15 = 5;
            sVar = sVar3;
        } else {
            m3.s sVar4 = sVar2;
            sVar4.U();
            tVar2 = tVar;
            f13 = f11;
            i15 = i12;
            f14 = f12;
            sVar = sVar4;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            final b4.t tVar3 = tVar2;
            w1VarS.f29476d = new Function2() { // from class: kj.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj6, Object obj7) {
                    ((Integer) obj7).getClass();
                    w.b.m(i11, function1, tVar3, str, f13, i15, f14, function0, (n) obj6, m3.i.F(i13 | 1));
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final void n(Order order, boolean z11, co.c cVar, m3.n nVar, int i11) {
        co.c cVar2;
        float fE;
        String intervalEnd;
        order.getClass();
        cVar.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1930745907);
        int i12 = i11 | (sVar.h(order) ? 4 : 2) | (sVar.g(z11) ? 32 : 16) | (sVar.d(cVar.ordinal()) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = a0.s(0, sVar);
            }
            h1 h1Var = (h1) objM;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = m3.i.w("");
                sVar.k0(objM2);
            }
            b1 b1Var = (b1) objM2;
            Object objM3 = sVar.M();
            if (objM3 == fVar) {
                objM3 = m3.i.w(Boolean.FALSE);
                sVar.k0(objM3);
            }
            b1 b1Var2 = (b1) objM3;
            PickupInterval pickupInterval = order.getPickupInterval();
            long jH = (pickupInterval == null || (intervalEnd = pickupInterval.getIntervalEnd()) == null) ? 0L : mv.p0.h(intervalEnd) - System.currentTimeMillis();
            Unit unit = Unit.f26487a;
            boolean zE = sVar.e(jH);
            Object objM4 = sVar.M();
            if (zE || objM4 == fVar) {
                objM4 = new a3.w(jH, b1Var2, b1Var, null);
                sVar.k0(objM4);
            }
            m3.i.h(unit, (Function2) objM4, sVar);
            cVar2 = cVar;
            if (cVar2 == co.c.START) {
                sVar.a0(649984690);
                fE = d70.a.e(sVar, h1Var.h()) - lv.t.f28254h;
                sVar.q(false);
            } else {
                sVar.a0(650051185);
                fE = (-d70.a.e(sVar, h1Var.h())) + lv.t.f28253g;
                sVar.q(false);
            }
            boolean zBooleanValue = ((Boolean) b1Var2.getValue()).booleanValue();
            s1.x0 x0VarD = s1.r0.d(new t1.u1(300, 300, null, 4), 2);
            t1.u1 u1Var = new t1.u1(300, 300, null, 4);
            Object objM5 = sVar.M();
            if (objM5 == fVar) {
                objM5 = new k9.f(1);
                sVar.k0(objM5);
            }
            s1.x0 x0VarA = x0VarD.a(s1.r0.k((Function1) objM5, u1Var));
            y0 y0VarE = s1.r0.e(new t1.u1(200, 0, null, 6), 2);
            t1.u1 u1Var2 = new t1.u1(200, 0, null, 6);
            Object objM6 = sVar.M();
            if (objM6 == fVar) {
                objM6 = new k9.f(1);
                sVar.k0(objM6);
            }
            s1.y.d(zBooleanValue, d2.c.w(b4.q.f5711a, fE, 0.0f, 2), x0VarA, y0VarE.a(new y0(new s1.l1((z0) null, new j1(new s1.q0((Function1) objM6, 6), u1Var2), (s1.c0) null, (c1) null, (LinkedHashMap) null, 125))), null, u3.e.e(562223371, sVar, new co.x(h1Var, z11, b1Var, 0)), sVar, 200064, 16);
        } else {
            cVar2 = cVar;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.d(order, z11, cVar2, i11, 2);
        }
    }

    public static final r80.a p(boolean z11) {
        r80.a aVar = new r80.a();
        aVar.f37779a = z11 ? 1 : 0;
        return aVar;
    }

    public static final r80.b q(int i11) {
        r80.b bVar = new r80.b();
        bVar.f37781a = i11;
        return bVar;
    }

    public static final r80.d r(Object obj) {
        r80.d dVar = new r80.d();
        dVar.f37785a = obj;
        return dVar;
    }

    public static final void s(f6.t tVar, List list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            z4.t0 t0Var = (z4.t0) list.get(i11);
            Object objJ = z4.c0.j(t0Var);
            if (objJ == null) {
                t0Var.G();
                objJ = new qb.e();
            }
            k6.b bVarB = tVar.b(objJ.toString());
            if (bVarB != null) {
                bVarB.f26006g0 = t0Var;
                n6.g gVar = bVarB.f26008h0;
                if (gVar != null) {
                    gVar.f30591i0 = t0Var;
                }
            }
            t0Var.G();
        }
    }

    public static final m5.h t(Country country, Function1 function1, m3.n nVar, int i11, int i12) {
        Function1 function12;
        int i13 = i12 & 2;
        m3.f fVar = m3.m.f29332a;
        if (i13 != 0) {
            m3.s sVar = (m3.s) nVar;
            Object objM = sVar.M();
            if (objM == fVar) {
                objM = new rk.z(9);
                sVar.k0(objM);
            }
            function12 = (Function1) objM;
        } else {
            function12 = function1;
        }
        m3.s sVar2 = (m3.s) nVar;
        sVar2.a0(1144749672);
        m5.e eVar = new m5.e();
        f1 f1Var = (f1) sVar2.j(x1.f7425r);
        String strU = o30.f0.U(sVar2, R.string.login_charity_terms_text);
        String strU2 = o30.f0.U(sVar2, R.string.login_charity_terms_highlight1);
        String strU3 = o30.f0.U(sVar2, R.string.login_charity_terms_highlight2);
        int i14 = 0;
        int iG = StringsKt.G(strU, strU2, 0, false, 6);
        int length = strU2.length() + iG;
        int iG2 = StringsKt.G(strU, strU3, 0, false, 6);
        int length2 = strU3.length() + iG2;
        int i15 = eVar.i(new m5.l0(lv.s.C, 0L, (q5.r) null, (q5.n) null, (q5.o) null, (q5.i) null, (String) null, 0L, (x5.a) null, (x5.p) null, (t5.c) null, 0L, (x5.l) null, (i4.u0) null, 65534));
        try {
            eVar.c(strU);
            eVar.g(i15);
            String charityTermsUrl = country != null ? country.getCharityTermsUrl() : null;
            if (charityTermsUrl == null) {
                charityTermsUrl = "";
            }
            q5.r rVar = q5.r.f36044i;
            long jC = b0.a0.C(16);
            x5.l lVar = x5.l.f43854c;
            m5.r0 r0Var = new m5.r0(new m5.l0(0L, jC, rVar, (q5.n) null, (q5.o) null, (q5.i) null, (String) null, 0L, (x5.a) null, (x5.p) null, (t5.c) null, 0L, lVar, (i4.u0) null, 61433), null, null, null);
            int i16 = (i11 & 112) ^ 48;
            boolean zH = ((i16 > 32 && sVar2.f(function12)) || (i11 & 48) == 32) | sVar2.h(f1Var);
            Object objM2 = sVar2.M();
            if (zH || objM2 == fVar) {
                objM2 = new sl.a(i14, f1Var, function12);
                sVar2.k0(objM2);
            }
            m5.n nVar2 = new m5.n(charityTermsUrl, r0Var, (m5.p) objM2);
            int i17 = 8;
            m5.d dVar = new m5.d(nVar2, iG, length, i17);
            ArrayList arrayList = eVar.f29527c;
            arrayList.add(dVar);
            String privacyUrl = country != null ? country.getPrivacyUrl() : null;
            String str = privacyUrl != null ? privacyUrl : "";
            int i18 = 1;
            m5.r0 r0Var2 = new m5.r0(new m5.l0(0L, b0.a0.C(16), rVar, (q5.n) null, (q5.o) null, (q5.i) null, (String) null, 0L, (x5.a) null, (x5.p) null, (t5.c) null, 0L, lVar, (i4.u0) null, 61433), null, null, null);
            boolean zH2 = sVar2.h(f1Var) | ((i16 > 32 && sVar2.f(function12)) || (i11 & 48) == 32);
            Object objM3 = sVar2.M();
            if (zH2 || objM3 == fVar) {
                objM3 = new sl.a(i18, f1Var, function12);
                sVar2.k0(objM3);
            }
            arrayList.add(new m5.d(new m5.n(str, r0Var2, (m5.p) objM3), iG2, length2, i17));
            m5.h hVarJ = eVar.j();
            sVar2.q(false);
            return hVarJ;
        } catch (Throwable th2) {
            eVar.g(i15);
            throw th2;
        }
    }

    public static final int u(Context context) {
        context.getClass();
        Integer numValueOf = Integer.valueOf(d70.b.a(311));
        Integer numValueOf2 = Integer.valueOf((int) (((double) d70.b.c().width()) * 0.85d));
        int iIntValue = numValueOf.intValue();
        int iIntValue2 = numValueOf2.intValue();
        return (iIntValue2 > iIntValue || mv.r0.r(context)) ? iIntValue : iIntValue2;
    }

    public static final void y(AutoCloseable autoCloseable, Throwable th2) {
        boolean zIsTerminated;
        if (autoCloseable != null) {
            if (th2 != null) {
                try {
                    a0.z(autoCloseable);
                    return;
                } catch (Throwable th3) {
                    u70.e.a(th2, th3);
                    return;
                }
            }
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
                return;
            }
            if (!(autoCloseable instanceof ExecutorService)) {
                if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                    return;
                }
                if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                    return;
                } else if (autoCloseable instanceof MediaDrm) {
                    ((MediaDrm) autoCloseable).release();
                    return;
                } else {
                    i4.a.h();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) autoCloseable;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z11 = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z11) {
                        executorService.shutdownNow();
                        z11 = true;
                    }
                }
            }
            if (z11) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static ArrayList z(AbstractList abstractList, HttpURLConnection httpURLConnection, FacebookException facebookException) {
        abstractList.getClass();
        ArrayList arrayList = new ArrayList(kotlin.collections.e0.o(abstractList, 10));
        Iterator it = abstractList.iterator();
        while (it.hasNext()) {
            arrayList.add(new ax.k0((ax.h0) it.next(), httpURLConnection, new ax.w(facebookException)));
        }
        return arrayList;
    }

    public abstract o30.g H(o30.j jVar);

    public abstract o30.r I(o30.j jVar);

    public abstract InputFilter[] J(InputFilter[] inputFilterArr);

    public abstract void P(int i11);

    public abstract boolean R();

    public abstract boolean S();

    public abstract void X(o30.r rVar, o30.r rVar2);

    public abstract void Y(o30.r rVar, Thread thread);

    public abstract void Z(boolean z11);

    public abstract void a0(boolean z11);

    public abstract void b0(boolean z11);

    public abstract void c0(boolean z11);

    public abstract void d0(int i11);

    public abstract TransformationMethod e0(TransformationMethod transformationMethod);

    public abstract boolean v(o30.j jVar, o30.g gVar, o30.g gVar2);

    public abstract boolean w(o30.s sVar, Object obj, Object obj2);

    public abstract boolean x(o30.s sVar, o30.r rVar, o30.r rVar2);

    public void W() {
    }

    public void V(FloatingActionButton floatingActionButton) {
    }
}
