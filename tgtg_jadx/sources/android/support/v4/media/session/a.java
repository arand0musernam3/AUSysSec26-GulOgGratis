package android.support.v4.media.session;

import a3.a3;
import a3.p0;
import a3.x1;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import b0.z;
import b2.l;
import b4.q;
import b4.t;
import b5.h;
import b5.j;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.item.AverageItemRating;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.braze.h2;
import com.google.android.gms.common.internal.i0;
import cy.d;
import d2.g0;
import d2.i2;
import d2.m2;
import d2.n1;
import d2.p;
import d2.u;
import d2.w;
import d2.y;
import d6.j0;
import d6.k0;
import g3.m5;
import g3.r9;
import g3.s0;
import g3.v3;
import g3.w6;
import g4.v;
import i4.o;
import ia0.f;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.n0;
import kotlin.collections.o0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m3.b1;
import m3.c3;
import m3.h1;
import m3.k1;
import m3.n;
import m3.s;
import m3.w1;
import n00.g;
import o00.x0;
import o30.f0;
import oo.r;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import oz.m;
import u.c;
import u3.e;
import u3.i;
import w.a0;
import z4.u0;
import z5.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1691a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f1692b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f1693c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static g f1694d;

    public static boolean A() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Itel")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Itel")) {
                return false;
            }
        }
        return "itel w6004".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean B() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Positivo")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Positivo")) {
                return false;
            }
        }
        return "twist 2 pro".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean C() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Vivo")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Vivo")) {
                return false;
            }
        }
        return "vivo 1805".equalsIgnoreCase(Build.MODEL);
    }

    public static void D(Uri uri) {
        uri.getClass();
        G();
        d.f13494d.lock();
        t5.a aVar = d.f13493c;
        if (aVar != null) {
            Bundle bundle = new Bundle();
            try {
                ((b.b) ((b.d) aVar.f39791b)).a((c) aVar.f39792c, uri, bundle);
            } catch (RemoteException unused) {
            }
        }
        d.f13494d.unlock();
    }

    public static void G() {
        m mVar;
        d.f13494d.lock();
        if (d.f13493c == null && (mVar = d.f13492b) != null) {
            b.d dVar = (b.d) mVar.f33836b;
            c cVar = new c();
            cVar.attachInterface(cVar, b.a.f5033a);
            new Handler(Looper.getMainLooper());
            t5.a aVar = !((b.b) dVar).b(cVar) ? null : new t5.a(dVar, cVar, (ComponentName) mVar.f33837c, 2);
            d.f13493c = aVar;
        }
        d.f13494d.unlock();
    }

    public static final k H(h4.c cVar) {
        return new k(Math.round(cVar.f21380a), Math.round(cVar.f21381b), Math.round(cVar.f21382c), Math.round(cVar.f21383d));
    }

    public static void I(TextView textView, int i11) {
        pd.g.l(i11);
        if (Build.VERSION.SDK_INT >= 28) {
            a3.C(textView, i11);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i12 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i11 > Math.abs(i12)) {
            textView.setPadding(textView.getPaddingLeft(), i11 + i12, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void J(TextView textView, int i11) {
        pd.g.l(i11);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i12 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i11 > Math.abs(i12)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i11 - i12);
        }
    }

    public static void K(TextView textView, int i11) {
        pd.g.l(i11);
        if (i11 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i11 - r0, 1.0f);
        }
    }

    public static final List L(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(CollectionsKt.O(list)) : n0.f26529a;
    }

    public static final Map M(Map map) {
        int size = map.size();
        if (size == 0) {
            o0 o0Var = o0.f26530a;
            o0Var.getClass();
            return o0Var;
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) CollectionsKt.N(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static Object N(Object obj) throws JSONException {
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                return obj;
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(N(it.next()));
            }
            return jSONArray;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key instanceof String) {
                jSONObject.put((String) key, N(value));
            }
        }
        return jSONObject;
    }

    public static void O(f fVar, byte[] bArr) {
        long j9;
        fVar.getClass();
        bArr.getClass();
        int length = bArr.length;
        int i11 = 0;
        do {
            byte[] bArr2 = fVar.f23636e;
            int i12 = fVar.f23637f;
            int i13 = fVar.f23638g;
            if (bArr2 != null) {
                while (i12 < i13) {
                    int i14 = i11 % length;
                    bArr2[i12] = (byte) (bArr2[i12] ^ bArr[i14]);
                    i12++;
                    i11 = i14 + 1;
                }
            }
            long j11 = fVar.f23635d;
            ia0.g gVar = fVar.f23632a;
            gVar.getClass();
            if (j11 == gVar.f23643b) {
                h2.b("no more bytes");
                return;
            }
            j9 = fVar.f23635d;
        } while (fVar.e(j9 == -1 ? 0L : j9 + ((long) (fVar.f23638g - fVar.f23637f))) != -1);
    }

    public static ActionMode.Callback P(ActionMode.Callback callback) {
        return callback instanceof m7.g ? ((m7.g) callback).f29722a : callback;
    }

    public static ActionMode.Callback Q(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof m7.g) || callback == null) ? callback : new m7.g(callback, textView);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final int r36, i4.v r37, java.lang.Integer r38, java.lang.String r39, boolean r40, final kotlin.jvm.functions.Function0 r41, m3.n r42, final int r43, final int r44) {
        /*
            Method dump skipped, instruction units count: 777
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.a.a(int, i4.v, java.lang.Integer, java.lang.String, boolean, kotlin.jvm.functions.Function0, m3.n, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0545 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x055d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(b4.t r63, final hi.e r64, kotlin.jvm.functions.Function0 r65, m3.n r66, int r67) {
        /*
            Method dump skipped, instruction units count: 1434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.a.b(b4.t, hi.e, kotlin.jvm.functions.Function0, m3.n, int):void");
    }

    public static final void c(final BasicItem basicItem, final String str, final boolean z11, final long j9, final float f11, n nVar, final int i11) {
        basicItem.getClass();
        s sVar = (s) nVar;
        sVar.c0(1221613283);
        int i12 = i11 | (sVar.h(basicItem) ? 4 : 2) | (sVar.f(str) ? 32 : 16) | (sVar.g(z11) ? 256 : 128) | (sVar.e(j9) ? NewHope.SENDB_BYTES : 1024) | (sVar.c(f11) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192);
        if (sVar.R(i12 & 1, (i12 & 9363) != 9362)) {
            b4.k kVar = b4.d.f5683a;
            u0 u0VarD = p.d(kVar, false);
            int iHashCode = Long.hashCode(sVar.T);
            i iVarL = sVar.l();
            q qVar = q.f5711a;
            t tVarC = b4.a.c(qVar, sVar);
            j.R.getClass();
            h hVar = b5.i.f5839b;
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
            t tVarE = m2.e(m2.d(qVar, 1.0f), 160);
            float f12 = lv.t.f28249c;
            int i13 = ((i12 << 3) & 112) | ((i12 >> 6) & 896);
            z20.b.c(f4.g.b(d2.c.D(tVarE, f12, f12, f12, 0.0f, 8), l2.g.b(8)), basicItem, f11, sVar, i13);
            u uVar = u.f13938a;
            float f13 = 12;
            z.a(d2.c.v(b4.a.d(uVar.a(qVar, kVar), 1.0f), f13, f13), str, z11, sVar, i12 & 1008);
            AverageItemRating averageItemRating = basicItem.getInformation().getAverageItemRating();
            String displayValue = averageItemRating != null ? averageItemRating.getDisplayValue() : null;
            if (displayValue == null) {
                displayValue = "";
            }
            dx.f.d(d2.c.v(b4.a.d(uVar.a(qVar, b4.d.f5685c), 1.0f), -12, f13), displayValue, j9, f11, sVar, (i12 >> 3) & 8064);
            h0.g.m(d2.c.D(uVar.a(qVar, b4.d.f5689g), lv.t.f28252f, 0.0f, 0.0f, lv.t.f28251e, 6), basicItem, f11, sVar, i13);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2(str, z11, j9, f11, i11) { // from class: fg.g

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f17693b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f17694c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f17695d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ float f17696e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iF = m3.i.F(1);
                    android.support.v4.media.session.a.c(this.f17692a, this.f17693b, this.f17694c, this.f17695d, this.f17696e, (m3.n) obj, iF);
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final k d(long j9, long j11) {
        int i11 = (int) (j9 >> 32);
        int i12 = (int) (j9 & 4294967295L);
        return new k(i11, i12, ((int) (j11 >> 32)) + i11, ((int) (j11 & 4294967295L)) + i12);
    }

    public static final void e(Function0 function0, Function0 function02, Function0 function03, n nVar, int i11) {
        s sVar;
        function0.getClass();
        function02.getClass();
        function03.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(1116981521);
        int i12 = i11 | (sVar2.h(function0) ? 4 : 2) | (sVar2.h(function02) ? 32 : 16);
        if (sVar2.R(i12 & 1, (i12 & 147) != 146)) {
            w6 w6VarF = v3.f(6, 2, null, sVar2);
            l2.f fVarB = l2.g.b(lv.t.f28253g);
            Object objM = sVar2.M();
            if (objM == m3.m.f29332a) {
                objM = new oo.z(17, function03);
                sVar2.k0(objM);
            }
            sVar = sVar2;
            v3.a((Function0) objM, null, w6VarF, 0.0f, false, fVarB, 0L, 0L, 0.0f, 0L, null, null, null, e.e(-498261517, sVar2, new ap.e(function0, function02, function03, 17)), sVar, 0, 3078, 7130);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new r(function0, function02, function03, i11, 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    public static final void f(ap.n nVar, n nVar2, int i11) {
        ?? r02;
        s sVar;
        int i12;
        Object obj;
        boolean z11;
        int i13;
        int i14;
        b1 b1Var;
        Object obj2;
        boolean z12;
        int i15;
        int i16;
        s sVar2 = (s) nVar2;
        sVar2.c0(1344946565);
        int i17 = i11 | (sVar2.h(nVar) ? 4 : 2);
        if (sVar2.R(i17 & 1, (i17 & 3) != 2)) {
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            Object obj3 = objM;
            if (objM == fVar) {
                k1 k1VarW = m3.i.w(nVar.R);
                sVar2.k0(k1VarW);
                obj3 = k1VarW;
            }
            b1 b1Var2 = (b1) obj3;
            int iIntValue = ((Number) m3.i.n(nVar.f4571n, sVar2, 0).getValue()).intValue();
            Object objM2 = sVar2.M();
            Object obj4 = objM2;
            if (objM2 == fVar) {
                v vVar = new v();
                sVar2.k0(vVar);
                obj4 = vVar;
            }
            v vVar2 = (v) obj4;
            b1 b1VarN = m3.i.n(nVar.f4569k, sVar2, 0);
            Object objM3 = sVar2.M();
            Object obj5 = objM3;
            if (objM3 == fVar) {
                Boolean boolValueOf = Boolean.valueOf(nVar.d());
                sVar2.k0(boolValueOf);
                obj5 = boolValueOf;
            }
            bp.a aVar = ((Boolean) obj5).booleanValue() ? bp.a.f6552c : bp.a.f6551b;
            Object value = b1VarN.getValue();
            boolean zF = sVar2.f(b1VarN) | sVar2.h(nVar) | sVar2.d(iIntValue);
            Object objM4 = sVar2.M();
            if (zF || objM4 == fVar) {
                x1 x1Var = new x1(b1VarN, nVar, iIntValue, b1Var2, (x70.c) null);
                sVar2.k0(x1Var);
                objM4 = x1Var;
            }
            m3.i.h(value, (Function2) objM4, sVar2);
            String strU = f0.U(sVar2, R.string.rating_accessibility_overall_screen);
            g0 g0Var = m2.f13850c;
            boolean zF2 = sVar2.f(strU);
            Object objM5 = sVar2.M();
            Object obj6 = objM5;
            if (zF2 || objM5 == fVar) {
                c60.e eVar = new c60.e(strU, 18);
                sVar2.k0(eVar);
                obj6 = eVar;
            }
            t tVarC = j5.r.c(g0Var, false, (Function1) obj6);
            u0 u0VarD = p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar2.T);
            i iVarL = sVar2.l();
            t tVarC2 = b4.a.c(tVarC, sVar2);
            j.R.getClass();
            h hVar = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(u0VarD, gVar, sVar2);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar2, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar2, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC2, gVar4, sVar2);
            b4.k kVar = b4.d.f5687e;
            u uVar = u.f13938a;
            q qVar = q.f5711a;
            t tVarR = v1.n.r(uVar.a(qVar, kVar), v1.n.q(sVar2), true);
            d2.e eVar2 = d2.i.f13805e;
            b4.i iVar = b4.d.f5695n;
            y yVarA = w.a(eVar2, iVar, sVar2, 54);
            int iHashCode2 = Long.hashCode(sVar2.T);
            i iVarL2 = sVar2.l();
            t tVarC3 = b4.a.c(tVarR, sVar2);
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            m3.i.C(yVarA, gVar, sVar2);
            m3.i.C(iVarL2, gVar2, sVar2);
            a0.y(iHashCode2, sVar2, gVar3, sVar2, dVar);
            m3.i.C(tVarC3, gVar4, sVar2);
            r9.d(f0.U(sVar2, R.string.rating_category_title_overall), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28272k, sVar2, 0, 12582912, 131070);
            d2.c.f(m2.m(qVar, lv.t.f28251e), sVar2);
            boolean zH = sVar2.h(nVar);
            Object objM6 = sVar2.M();
            Object obj7 = objM6;
            if (zH || objM6 == fVar) {
                dp.q qVar2 = new dp.q(nVar, 0);
                sVar2.k0(qVar2);
                obj7 = qVar2;
            }
            cp.a.i(iIntValue, true, null, 0L, 0L, (Function1) obj7, sVar2, 48, 188);
            c3 c3VarC = t1.d.c(cp.a.r(sVar2, iIntValue), null, "textAnimation", sVar2, 10);
            boolean zF3 = sVar2.f(c3VarC);
            Object objM7 = sVar2.M();
            if (zF3 || objM7 == fVar) {
                i12 = 0;
                dp.r rVar = new dp.r(c3VarC, i12);
                sVar2.k0(rVar);
                obj = rVar;
            } else {
                i12 = 0;
                obj = objM7;
            }
            cp.a.d(d2.c.u(qVar, (Function1) obj), aVar.a(sVar2, iIntValue), sVar2, i12);
            t tVarJ = v1.n.j(d2.c.z(m2.d(qVar, 1.0f), lv.t.f28254h), lv.s.I, l2.g.b(12));
            y yVarA2 = w.a(d2.i.f13803c, iVar, sVar2, 48);
            int iHashCode3 = Long.hashCode(sVar2.T);
            i iVarL3 = sVar2.l();
            t tVarC4 = b4.a.c(tVarJ, sVar2);
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            m3.i.C(yVarA2, gVar, sVar2);
            m3.i.C(iVarL3, gVar2, sVar2);
            a0.y(iHashCode3, sVar2, gVar3, sVar2, dVar);
            m3.i.C(tVarC4, gVar4, sVar2);
            String strJ = "";
            int i18 = 5;
            switch (aVar.f6553a) {
                case 0:
                    z11 = true;
                    sVar2.a0(1305880091);
                    if (iIntValue == 1) {
                        i13 = 820320253;
                        i14 = R.string.rating_category_subtitle_overall_horrible;
                    } else if (iIntValue == 2) {
                        i13 = 820322936;
                        i14 = R.string.rating_category_subtitle_overall_bad;
                    } else if (iIntValue == 3) {
                        i13 = 820325464;
                        i14 = R.string.rating_category_subtitle_overall_meh;
                    } else if (iIntValue == 4) {
                        i13 = 820327993;
                        i14 = R.string.rating_category_subtitle_overall_good;
                    } else if (iIntValue != 5) {
                        sVar2.a0(-339473181);
                        sVar2.q(false);
                        sVar2.q(false);
                    } else {
                        i13 = 820330556;
                        i14 = R.string.rating_category_subtitle_overall_awesome;
                    }
                    strJ = b3.i.j(i13, i14, sVar2, sVar2, false);
                    sVar2.q(false);
                    break;
                default:
                    sVar2.a0(-1605927519);
                    z11 = true;
                    if (iIntValue == 1) {
                        z12 = false;
                        i15 = -1403083260;
                        i16 = R.string.rating_category_subtitle_overall_japan_bad;
                    } else if (iIntValue == 2) {
                        z12 = false;
                        i15 = -1403080539;
                        i16 = R.string.rating_category_subtitle_overall_japan_okay;
                    } else if (iIntValue == 3) {
                        z12 = false;
                        i15 = -1403077787;
                        i16 = R.string.rating_category_subtitle_overall_japan_good;
                    } else if (iIntValue == 4) {
                        z12 = false;
                        i15 = -1403075034;
                        i16 = R.string.rating_category_subtitle_overall_japan_great;
                    } else if (iIntValue != 5) {
                        sVar2.a0(-545477603);
                        z12 = false;
                        sVar2.q(false);
                        sVar2.q(z12);
                    } else {
                        z12 = false;
                        i15 = -1403072248;
                        i16 = R.string.rating_category_subtitle_overall_japan_amazing;
                    }
                    strJ = b3.i.j(i15, i16, sVar2, sVar2, z12);
                    sVar2.q(z12);
                    break;
            }
            String str = strJ;
            m5.u0 u0Var = lv.v.f28275o;
            float f11 = lv.t.f28253g;
            r9.d(str, d2.c.D(qVar, f11, f11, f11, 0.0f, 8), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar2, 0, 12582912, 131068);
            String str2 = (String) b1Var2.getValue();
            Object objM8 = sVar2.M();
            if (objM8 == fVar) {
                b1Var = b1Var2;
                p0 p0Var = new p0(b1Var, i18);
                sVar2.k0(p0Var);
                obj2 = p0Var;
            } else {
                b1Var = b1Var2;
                obj2 = objM8;
            }
            b1 b1Var3 = b1Var;
            cp.a.p(null, 0L, str2, vVar2, (Function1) obj2, sVar2, 27648, 3);
            sVar2.q(z11);
            sVar2.q(z11);
            t tVarD = d2.c.D(uVar.a(qVar, b4.d.f5690h), 0.0f, 0.0f, 0.0f, f11, 7);
            String strU2 = f0.U(sVar2, R.string.rating_cta_continue);
            boolean zH2 = sVar2.h(nVar);
            Object objM9 = sVar2.M();
            Object obj8 = objM9;
            if (zH2 || objM9 == fVar) {
                ap.g gVar5 = new ap.g(nVar, b1Var3, z11 ? 1 : 0);
                sVar2.k0(gVar5);
                obj8 = gVar5;
            }
            v0.n.l(tVarD, strU2, null, null, null, false, false, null, null, (Function0) obj8, sVar2, 0, 508);
            s sVar3 = sVar2;
            sVar3.q(z11);
            r02 = z11;
            sVar = sVar3;
        } else {
            r02 = 1;
            sVar2.U();
            sVar = sVar2;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new dp.m(nVar, i11, r02);
        }
    }

    public static final void g(kn.d dVar, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(-730593934);
        int i12 = (sVar.h(dVar) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(Boolean.FALSE);
                sVar.k0(objM);
            }
            b1 b1Var = (b1) objM;
            boolean zH = sVar.h(dVar);
            Object objM2 = sVar.M();
            if (zH || objM2 == fVar) {
                objM2 = new nn.r(dVar, 0);
                sVar.k0(objM2);
            }
            d6.r.b(null, 0L, (Function0) objM2, new j0(false, true, true, k0.Inherit, true), e.e(-785510679, sVar, new ki.h(dVar, b1Var, dVar, 10)), sVar, 27648, 3);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new nn.s(dVar, i11, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(int i11, int i12, Function1 function1, Function0 function0, n nVar, int i13) {
        t1.b bVar;
        h1 h1Var;
        s sVar = (s) nVar;
        sVar.c0(1927049369);
        int i14 = i13 | (sVar.d(i11) ? 4 : 2) | (sVar.d(i12) ? 32 : 16);
        int i15 = 0;
        if (sVar.R(i14 & 1, (i14 & 1171) != 1170)) {
            Object objM = sVar.M();
            Object obj = m3.m.f29332a;
            if (objM == obj) {
                objM = a0.s(0, sVar);
            }
            h1 h1Var2 = (h1) objM;
            Object objM2 = sVar.M();
            if (objM2 == obj) {
                objM2 = t1.c.a(0.0f);
                sVar.k0(objM2);
            }
            t1.b bVar2 = (t1.b) objM2;
            Integer numValueOf = Integer.valueOf(h1Var2.h());
            boolean zH = sVar.h(bVar2);
            Object objM3 = sVar.M();
            if (zH || objM3 == obj) {
                objM3 = new defpackage.i(bVar2, function1, function0, h1Var2, null);
                sVar.k0(objM3);
            }
            m3.i.g(numValueOf, 7000, (Function2) objM3, sVar);
            Integer numValueOf2 = Integer.valueOf(i11);
            boolean zH2 = ((i14 & 14) == 4) | sVar.h(bVar2);
            Object objM4 = sVar.M();
            if (zH2 || objM4 == obj) {
                Object jVar = new defpackage.j(i11, function1, bVar2, function0, h1Var2, (x70.c) null);
                sVar.k0(jVar);
                objM4 = jVar;
            }
            m3.i.h(numValueOf2, (Function2) objM4, sVar);
            Integer numValueOf3 = Integer.valueOf(i12);
            boolean zH3 = ((i14 & 112) == 32) | sVar.h(bVar2);
            Object objM5 = sVar.M();
            if (zH3 || objM5 == obj) {
                objM5 = new defpackage.k(i12, function1, bVar2, h1Var2, (x70.c) null);
                bVar = bVar2;
                h1Var = h1Var2;
                sVar.k0(objM5);
            } else {
                bVar = bVar2;
                h1Var = h1Var2;
            }
            m3.i.h(numValueOf3, (Function2) objM5, sVar);
            float f11 = 1.0f;
            t tVarD = m2.d(q.f5711a, 1.0f);
            float f12 = 6;
            i2 i2VarA = d2.h2.a(d2.i.g(f12), b4.d.f5692j, sVar, 6);
            int iHashCode = Long.hashCode(sVar.T);
            i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarD, sVar);
            j.R.getClass();
            Function0 function02 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(function02);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            sVar.a0(323521887);
            int i16 = 0;
            while (i16 < 3) {
                float fFloatValue = i16 < h1Var.h() ? f11 : i16 == h1Var.h() ? ((Number) bVar.d()).floatValue() : 0.0f;
                long j9 = lv.s.f28225f;
                long jB = i4.v.b(0.3f, j9);
                float f13 = i15;
                if (f11 <= 0.0d) {
                    e2.a.a("invalid weight; must be greater than zero");
                }
                t tVarB = f4.g.b(m2.e(new n1(f11, true), f12), l2.g.b(2));
                boolean zC = sVar.c(fFloatValue);
                Object objM6 = sVar.M();
                if (zC || objM6 == obj) {
                    objM6 = new defpackage.f(fFloatValue);
                    sVar.k0(objM6);
                }
                Function0 function03 = (Function0) objM6;
                Object objM7 = sVar.M();
                if (objM7 == obj) {
                    objM7 = new defpackage.g(0);
                    sVar.k0(objM7);
                }
                m5.b(function03, tVarB, j9, jB, 0, f13, (Function1) objM7, sVar, 1772928, 16);
                i16++;
                f12 = f12;
                f11 = f11;
                i15 = 0;
            }
            sVar.q(i15);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new defpackage.h(i11, i12, function1, function0, i13, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(final int r52, int r53, final boolean r54, boolean r55, final boolean r56, final kotlin.jvm.functions.Function1 r57, m3.n r58, final int r59, final int r60) {
        /*
            Method dump skipped, instruction units count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.a.i(int, int, boolean, boolean, boolean, kotlin.jvm.functions.Function1, m3.n, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16 */
    public static final void j(kn.d dVar, n nVar, int i11) {
        ?? r12;
        boolean z11;
        Object obj;
        long j9 = dVar.f26474b;
        s sVar = (s) nVar;
        sVar.c0(-1882416018);
        int i12 = i11 | (sVar.h(dVar) ? 4 : 2);
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            q qVar = q.f5711a;
            t tVarD = d2.c.D(m2.u(qVar, null, 3), lv.t.f28255i, dVar.f26473a ? lv.t.f28251e : lv.t.f28257k, lv.t.f28252f, 0.0f, 8);
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarD, sVar);
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
            float f11 = lv.t.f28251e;
            t tVarU = m2.u(d2.c.B(qVar, f11, 0.0f, 2), null, 3);
            b4.i iVar = b4.d.f5696o;
            v1.n.d(x0.z(R.drawable.triangle_small, sVar, 0), null, b3.i.f(iVar, tVarU), null, null, 0.0f, new o(j9, 5), sVar, 56, 56);
            t tVarF = b3.i.f(iVar, d2.c.D(m2.v(d2.c.w(qVar, 0.0f, -1, 1), 3), lv.t.f28249c, 0.0f, 0.0f, 0.0f, 14));
            g3.u uVarP = s0.p(j9, sVar, 0);
            l2.f fVarB = l2.g.b(f11);
            g3.v vVarQ = s0.q(2, 0.0f, 0.0f, 0.0f, 62);
            boolean zH = sVar.h(dVar);
            Object objM = sVar.M();
            if (zH || objM == m3.m.f29332a) {
                z11 = true;
                nn.r rVar = new nn.r(dVar, true ? 1 : 0);
                sVar.k0(rVar);
                obj = rVar;
            } else {
                z11 = true;
                obj = objM;
            }
            s0.c((Function0) obj, tVarF, false, fVarB, uVarP, vVarQ, e.e(-2144444781, sVar, new nn.t(dVar, z11 ? 1 : 0)), sVar, 100663296, 196);
            sVar.q(z11);
            r12 = z11;
        } else {
            r12 = 1;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new nn.s(dVar, i11, r12);
        }
    }

    public static void k(Object obj, String str) {
        if (obj != null) {
            return;
        }
        c50.w.l(str);
    }

    public static final b1 l(l lVar, n nVar, int i11) {
        s sVar = (s) nVar;
        Object objM = sVar.M();
        m3.f fVar = m3.m.f29332a;
        if (objM == fVar) {
            objM = m3.i.w(Boolean.FALSE);
            sVar.k0(objM);
        }
        b1 b1Var = (b1) objM;
        boolean z11 = (((i11 & 14) ^ 6) > 4 && sVar.f(lVar)) || (i11 & 6) == 4;
        Object objM2 = sVar.M();
        if (z11 || objM2 == fVar) {
            objM2 = new b2.g(lVar, b1Var, null, 1);
            sVar.k0(objM2);
        }
        m3.i.h(lVar, (Function2) objM2, sVar);
        return b1Var;
    }

    public static final g9.f0 m(Context context) {
        context.getClass();
        g9.f0 f0Var = new g9.f0(context);
        l9.f fVar = f0Var.f20186b;
        g9.u0 u0Var = fVar.f27549s;
        u0Var.a(new i9.g(u0Var));
        g9.u0 u0Var2 = fVar.f27549s;
        u0Var2.a(new i9.i());
        u0Var2.a(new i9.p());
        return f0Var;
    }

    public static final void n(ia0.m mVar, ia0.a0 a0Var) throws IOException {
        try {
            IOException iOException = null;
            for (ia0.a0 a0Var2 : mVar.A(a0Var)) {
                try {
                    if (mVar.B(a0Var2).f805c) {
                        n(mVar, a0Var2);
                    }
                    mVar.r(a0Var2);
                } catch (IOException e5) {
                    if (iOException == null) {
                        iOException = e5;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final String o(Context context, String str) {
        context.getClass();
        str.getClass();
        String strH = mv.p0.H(str);
        int i11 = mv.p0.i(str);
        try {
            String string = i11 != 0 ? i11 != 1 ? context.getString(R.string.catering_long_delivery_time_after_tomorrow, mv.p0.p(str), strH) : context.getString(R.string.catering_long_delivery_time_tomorrow, strH) : context.getString(R.string.catering_long_delivery_time_today, strH);
            string.getClass();
            return string;
        } catch (Exception unused) {
            return str;
        }
    }

    public static final String p(Context context, String str) {
        context.getClass();
        String strH = mv.p0.H(str);
        int i11 = mv.p0.i(str);
        try {
            String string = i11 != 0 ? i11 != 1 ? context.getString(R.string.catering_short_delivery_time_after_tomorrow, mv.p0.p(str), strH) : context.getString(R.string.catering_short_delivery_time_tomorrow, strH) : context.getString(R.string.catering_short_delivery_time_today, strH);
            string.getClass();
            return string;
        } catch (Exception unused) {
            return str;
        }
    }

    public static ky.o q(Bitmap bitmap) {
        i0.i(bitmap, "image must not be null");
        try {
            g gVar = f1694d;
            i0.i(gVar, "IBitmapDescriptorFactory is not initialized");
            n00.e eVar = (n00.e) gVar;
            Parcel parcelL = eVar.L();
            n00.d.c(parcelL, bitmap);
            Parcel parcelJ = eVar.J(6, parcelL);
            yz.a aVarU = yz.b.U(parcelJ.readStrongBinder());
            parcelJ.recycle();
            return new ky.o(aVarU);
        } catch (RemoteException e5) {
            qc.y.l(e5);
            return null;
        }
    }

    public static of.n r(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("event_name", "");
        strOptString.getClass();
        v70.i iVarB = null;
        if (!StringsKt.H(strOptString)) {
            double dOptDouble = jSONObject.optDouble("time", Double.NaN);
            if (!Double.isNaN(dOptDouble)) {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("event_properties");
                if (jSONObjectOptJSONObject != null) {
                    v70.i iVar = new v70.i();
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    itKeys.getClass();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        iVar.put(next, s(jSONObjectOptJSONObject.opt(next)));
                    }
                    iVarB = iVar.b();
                }
                return new of.n(strOptString, dOptDouble, iVarB);
            }
        }
        return null;
    }

    public static Object s(Object obj) {
        if (Intrinsics.areEqual(obj, JSONObject.NULL)) {
            return null;
        }
        if (obj instanceof JSONObject) {
            v70.i iVar = new v70.i();
            JSONObject jSONObject = (JSONObject) obj;
            Iterator<String> itKeys = jSONObject.keys();
            itKeys.getClass();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                iVar.put(next, s(jSONObject.get(next)));
            }
            return iVar.b();
        }
        if (!(obj instanceof JSONArray)) {
            return obj;
        }
        v70.e eVarB = c0.b();
        JSONArray jSONArray = (JSONArray) obj;
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            eVarB.add(s(jSONArray.get(i11)));
        }
        return c0.a(eVarB);
    }

    public static f7.c y(AppCompatTextView appCompatTextView) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            return new f7.c(a3.s(appCompatTextView));
        }
        TextPaint textPaint = new TextPaint(appCompatTextView.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = appCompatTextView.getBreakStrategy();
        int hyphenationFrequency = appCompatTextView.getHyphenationFrequency();
        if (appCompatTextView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i11 < 28 || (appCompatTextView.getInputType() & 15) != 3) {
            boolean z11 = appCompatTextView.getLayoutDirection() == 1;
            switch (appCompatTextView.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z11) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(a3.j(DecimalFormatSymbols.getInstance(appCompatTextView.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new f7.c(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static boolean z() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Blu")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Blu")) {
                return false;
            }
        }
        return "studio x10".equalsIgnoreCase(Build.MODEL);
    }

    public abstract boolean t();

    public abstract int u();

    public abstract float v();

    public abstract float w();

    public abstract float x();

    public void F(t.p pVar) {
    }

    public void E(int i11, CharSequence charSequence) {
    }
}
