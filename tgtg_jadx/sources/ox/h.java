package ox;

import a3.f1;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Path;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import androidx.recyclerview.widget.m0;
import ao.p2;
import b0.a0;
import b4.q;
import b5.h;
import bx.z;
import com.app.tgtg.R;
import com.app.tgtg.model.local.AppConstants;
import com.app.tgtg.model.remote.item.LocalHero;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import com.app.tgtg.model.remote.item.response.TypedItemCardsCarouselMnu;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.h2;
import d2.i;
import d2.i2;
import d2.m2;
import d2.n1;
import d2.p;
import d2.w;
import e6.j;
import e6.l;
import e6.n;
import f2.c0;
import f2.e0;
import g3.a2;
import g3.r9;
import g3.s0;
import h7.o0;
import i4.g0;
import i4.r0;
import ia0.d0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.h1;
import kotlin.collections.p0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntRange;
import kotlin.text.CharsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.y;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m3.s;
import m3.w1;
import m90.i1;
import m90.j1;
import o00.b1;
import o00.t1;
import o00.x0;
import o30.f0;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.math.Primes;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import q90.t;
import q90.v;
import tx.n0;
import w2.l1;
import wy.o;
import x5.k;
import x60.m;
import z4.u0;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f33794a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f33795b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f33796c = 0;

    public static l A(j jVar) {
        e6.i iVar = new e6.i();
        iVar.f15778c = new n();
        l lVar = new l(iVar);
        iVar.f15777b = lVar;
        iVar.f15776a = jVar.getClass();
        try {
            Object objO = jVar.o(iVar);
            if (objO == null) {
                return lVar;
            }
            iVar.f15776a = objO;
            return lVar;
        } catch (Exception e5) {
            lVar.b(e5);
            return lVar;
        }
    }

    public static xe.a B(String str) {
        xe.a aVar;
        str.getClass();
        synchronized (xe.a.f44236c) {
            try {
                LinkedHashMap linkedHashMap = xe.a.f44237d;
                Object aVar2 = linkedHashMap.get(str);
                if (aVar2 == null) {
                    aVar2 = new xe.a();
                    linkedHashMap.put(str, aVar2);
                }
                aVar = (xe.a) aVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    public static float C(String[] strArr, int i11) {
        float f11 = Float.parseFloat(strArr[i11]);
        if (f11 >= 0.0f && f11 <= 1.0f) {
            return f11;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f11);
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0263 A[EDGE_INSN: B:203:0x0263->B:144:0x0263 BREAK  A[LOOP:5: B:154:0x027f->B:206:0x027f], EDGE_INSN: B:204:0x0263->B:144:0x0263 BREAK  A[LOOP:5: B:154:0x027f->B:206:0x027f]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int D(n5.i r19, android.text.Layout r20, androidx.lifecycle.n1 r21, int r22, android.graphics.RectF r23, o5.d r24, lk.a r25, boolean r26) {
        /*
            Method dump skipped, instruction units count: 719
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ox.h.D(n5.i, android.text.Layout, androidx.lifecycle.n1, int, android.graphics.RectF, o5.d, lk.a, boolean):int");
    }

    public static final int E(ha.a aVar) {
        aVar.getClass();
        ha.c cVarV0 = aVar.v0("SELECT changes()");
        try {
            cVarV0.q0();
            int i11 = (int) cVarV0.getLong(0);
            w.b.y(cVarV0, null);
            return i11;
        } finally {
        }
    }

    public static ja.b F(lz.i iVar, SQLiteDatabase sQLiteDatabase) {
        iVar.getClass();
        sQLiteDatabase.getClass();
        ja.b bVar = (ja.b) iVar.f28446b;
        if (bVar != null && Intrinsics.areEqual(bVar.f24770a, sQLiteDatabase)) {
            return bVar;
        }
        ja.b bVar2 = new ja.b(sQLiteDatabase);
        iVar.f28446b = bVar2;
        return bVar2;
    }

    public static boolean G(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static boolean H(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static String I(v vVar) {
        vVar.getClass();
        ia0.j jVar = ia0.j.f23646d;
        return r40.d.p(vVar.f36631i).d("MD5").f();
    }

    public static final vx.d J(File file) {
        file.getClass();
        vx.d dVar = new vx.d();
        String name = file.getName();
        name.getClass();
        dVar.f42528a = name;
        dVar.f42529b = y.p(name, "crash_log_", false) ? vx.b.CrashReport : y.p(name, "shield_log_", false) ? vx.b.CrashShield : y.p(name, "thread_check_log_", false) ? vx.b.ThreadCheck : y.p(name, "analysis_log_", false) ? vx.b.Analysis : y.p(name, "anr_log_", false) ? vx.b.AnrReport : vx.b.Unknown;
        JSONObject jSONObjectC = p30.b.C(name);
        if (jSONObjectC != null) {
            dVar.f42534g = Long.valueOf(jSONObjectC.optLong("timestamp", 0L));
            dVar.f42531d = jSONObjectC.optString("app_version", null);
            dVar.f42532e = jSONObjectC.optString("reason", null);
            dVar.f42533f = jSONObjectC.optString("callstack", null);
            dVar.f42530c = jSONObjectC.optJSONArray("feature_names");
        }
        return dVar;
    }

    public static final a K(a aVar, int i11) {
        a aVar2;
        a aVar3 = null;
        if (yx.a.f46339a.contains(h.class)) {
            return null;
        }
        try {
            aVar.getClass();
            int[] iArr = aVar.f33767a;
            int i12 = 0;
            int i13 = iArr[0];
            int i14 = iArr[1];
            int i15 = iArr[2];
            int i16 = (i14 - i11) + 1;
            a aVar4 = new a(new int[]{i13, i16, i15});
            float[] fArr = aVar.f33769c;
            float[] fArr2 = aVar4.f33769c;
            int i17 = 0;
            while (i17 < i13) {
                int i18 = i12;
                while (i18 < i15) {
                    int i19 = i12;
                    while (i19 < i16) {
                        int i21 = i19 * i15;
                        int i22 = (i17 * i16 * i15) + i21 + i18;
                        int i23 = (i17 * i14 * i15) + i21 + i18;
                        fArr2[i22] = Float.MIN_VALUE;
                        int i24 = i12;
                        while (i24 < i11) {
                            aVar2 = aVar3;
                            try {
                                fArr2[i22] = Math.max(fArr2[i22], fArr[(i24 * i15) + i23]);
                                i24++;
                                aVar3 = aVar2;
                            } catch (Throwable th2) {
                                th = th2;
                                yx.a.a(h.class, th);
                                return aVar2;
                            }
                        }
                        i19++;
                        i12 = 0;
                    }
                    i18++;
                    i12 = 0;
                }
                i17++;
                i12 = 0;
            }
            return aVar4;
        } catch (Throwable th3) {
            th = th3;
            aVar2 = aVar3;
        }
    }

    public static final a L(a aVar, a aVar2) {
        if (yx.a.f46339a.contains(h.class)) {
            return null;
        }
        try {
            aVar.getClass();
            aVar2.getClass();
            int i11 = aVar.f33767a[0];
            int[] iArr = aVar2.f33767a;
            int i12 = iArr[0];
            int i13 = iArr[1];
            a aVar3 = new a(new int[]{i11, i13});
            float[] fArr = aVar.f33769c;
            float[] fArr2 = aVar2.f33769c;
            float[] fArr3 = aVar3.f33769c;
            for (int i14 = 0; i14 < i11; i14++) {
                for (int i15 = 0; i15 < i13; i15++) {
                    int i16 = (i14 * i13) + i15;
                    fArr3[i16] = 0.0f;
                    for (int i17 = 0; i17 < i12; i17++) {
                        fArr3[i16] = (fArr[(i14 * i12) + i17] * fArr2[(i17 * i13) + i15]) + fArr3[i16];
                    }
                }
            }
            return aVar3;
        } catch (Throwable th2) {
            yx.a.a(h.class, th2);
            return null;
        }
    }

    public static int N(d0 d0Var) throws IOException {
        byte bG;
        try {
            ia0.g gVar = d0Var.f23623b;
            d0Var.r0(1L);
            long j9 = 0;
            while (true) {
                long j11 = j9 + 1;
                if (!d0Var.request(j11)) {
                    break;
                }
                bG = gVar.G(j9);
                if ((bG < 48 || bG > 57) && (j9 != 0 || bG != 45)) {
                    break;
                }
                j9 = j11;
            }
            if (j9 == 0) {
                String string = Integer.toString(bG, CharsKt.checkRadix(16));
                string.getClass();
                throw new NumberFormatException("Expected a digit or '-' but was 0x".concat(string));
            }
            long jQ = gVar.Q();
            String strD = d0Var.D(LongCompanionObject.MAX_VALUE);
            if (jQ >= 0 && jQ <= 2147483647L && strD.length() <= 0) {
                return (int) jQ;
            }
            throw new IOException("expected an int but was \"" + jQ + strD + '\"');
        } catch (NumberFormatException e5) {
            i4.a.k(e5.getMessage());
            return 0;
        }
    }

    public static final void O(a aVar) {
        if (yx.a.f46339a.contains(h.class)) {
            return;
        }
        try {
            aVar.getClass();
            float[] fArr = aVar.f33769c;
            int length = fArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                if (fArr[i11] < 0.0f) {
                    fArr[i11] = 0.0f;
                }
            }
        } catch (Throwable th2) {
            yx.a.a(h.class, th2);
        }
    }

    public static int P(Context context, int i11, int i12) {
        TypedValue typedValueF = ex.i.F(context, i11);
        return (typedValueF == null || typedValueF.type != 16) ? i12 : typedValueF.data;
    }

    public static TimeInterpolator Q(Context context, int i11, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i11, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            i4.a.f("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
            return null;
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!H(strValueOf, "cubic-bezier") && !H(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (H(strValueOf, "cubic-bezier")) {
            String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(MessageLogView.COMMA_SEPARATOR);
            if (strArrSplit.length == 4) {
                return new PathInterpolator(C(strArrSplit, 0), C(strArrSplit, 1), C(strArrSplit, 2), C(strArrSplit, 3));
            }
            o.l(strArrSplit.length, "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
            return null;
        }
        if (!H(strValueOf, "path")) {
            i4.a.f("Invalid motion easing type: ".concat(strValueOf));
            return null;
        }
        String strSubstring = strValueOf.substring(5, strValueOf.length() - 1);
        Path path = new Path();
        try {
            x6.e.b(m0.c.Y(strSubstring), path);
            return new PathInterpolator(path);
        } catch (RuntimeException e5) {
            a40.d0.o("Error in parsing ".concat(strSubstring), e5);
            return null;
        }
    }

    public static void R(HashMap map) {
        String[] strArr;
        List listG;
        ConcurrentHashMap concurrentHashMap = z.f6766e;
        z zVar = z.f6762a;
        if (yx.a.f46339a.contains(z.class)) {
            return;
        }
        try {
            if (!z.f6764c.get()) {
                zVar.b();
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                int length = str2.length() - 1;
                int i11 = 0;
                boolean z11 = false;
                while (i11 <= length) {
                    boolean z12 = Intrinsics.compare((int) str2.charAt(!z11 ? i11 : length), 32) <= 0;
                    if (z11) {
                        if (!z12) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z12) {
                        i11++;
                    } else {
                        z11 = true;
                    }
                }
                String strH = n0.H(zVar.c(str, str2.subSequence(i11, length + 1).toString()));
                if (concurrentHashMap.containsKey(str)) {
                    String str3 = (String) concurrentHashMap.get(str);
                    if (str3 == null || (listG = new Regex(MessageLogView.COMMA_SEPARATOR).g(0, str3)) == null || (strArr = (String[]) listG.toArray(new String[0])) == null) {
                        strArr = new String[0];
                    }
                    Set setD = h1.d(Arrays.copyOf(strArr, strArr.length));
                    if (setD.contains(strH)) {
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    if (strArr.length == 0) {
                        sb2.append(strH);
                    } else if (strArr.length < 5) {
                        sb2.append(str3);
                        sb2.append(MessageLogView.COMMA_SEPARATOR);
                        sb2.append(strH);
                    } else {
                        for (int i12 = 1; i12 < 5; i12++) {
                            sb2.append(strArr[i12]);
                            sb2.append(MessageLogView.COMMA_SEPARATOR);
                        }
                        sb2.append(strH);
                        setD.remove(strArr[0]);
                    }
                    concurrentHashMap.put(str, sb2.toString());
                } else {
                    concurrentHashMap.put(str, strH);
                }
            }
            zVar.g("com.facebook.appevents.UserDataStore.internalUserData", n0.B(concurrentHashMap));
        } catch (Throwable th2) {
            yx.a.a(z.class, th2);
        }
    }

    public static final void S(a aVar) {
        if (yx.a.f46339a.contains(h.class)) {
            return;
        }
        try {
            aVar.getClass();
            int[] iArr = aVar.f33767a;
            int i11 = iArr[0];
            int i12 = iArr[1];
            float[] fArr = aVar.f33769c;
            for (int i13 = 0; i13 < i11; i13++) {
                int i14 = i13 * i12;
                int i15 = i14 + i12;
                float f11 = Float.MIN_VALUE;
                for (int i16 = i14; i16 < i15; i16++) {
                    float f12 = fArr[i16];
                    if (f12 > f11) {
                        f11 = f12;
                    }
                }
                float f13 = 0.0f;
                for (int i17 = i14; i17 < i15; i17++) {
                    float fExp = (float) Math.exp(fArr[i17] - f11);
                    fArr[i17] = fExp;
                    f13 += fExp;
                }
                while (i14 < i15) {
                    fArr[i14] = fArr[i14] / f13;
                    i14++;
                }
            }
        } catch (Throwable th2) {
            yx.a.a(h.class, th2);
        }
    }

    public static final a T(a aVar) {
        if (yx.a.f46339a.contains(h.class)) {
            return null;
        }
        try {
            int[] iArr = aVar.f33767a;
            int i11 = iArr[0];
            int i12 = iArr[1];
            a aVar2 = new a(new int[]{i12, i11});
            float[] fArr = aVar.f33769c;
            float[] fArr2 = aVar2.f33769c;
            for (int i13 = 0; i13 < i11; i13++) {
                for (int i14 = 0; i14 < i12; i14++) {
                    fArr2[(i14 * i11) + i13] = fArr[(i13 * i12) + i14];
                }
            }
            return aVar2;
        } catch (Throwable th2) {
            yx.a.a(h.class, th2);
            return null;
        }
    }

    public static final a U(a aVar) {
        if (yx.a.f46339a.contains(h.class)) {
            return null;
        }
        try {
            int[] iArr = aVar.f33767a;
            int i11 = iArr[0];
            int i12 = iArr[1];
            int i13 = iArr[2];
            a aVar2 = new a(new int[]{i13, i12, i11});
            float[] fArr = aVar.f33769c;
            float[] fArr2 = aVar2.f33769c;
            for (int i14 = 0; i14 < i11; i14++) {
                for (int i15 = 0; i15 < i12; i15++) {
                    for (int i16 = 0; i16 < i13; i16++) {
                        fArr2[l1.a(i15, i11, i16 * i11 * i12, i14)] = fArr[l1.a(i15, i13, i14 * i12 * i13, i16)];
                    }
                }
            }
            return aVar2;
        } catch (Throwable th2) {
            yx.a.a(h.class, th2);
            return null;
        }
    }

    public static Set V(t tVar) {
        int size = tVar.size();
        TreeSet treeSet = null;
        for (int i11 = 0; i11 < size; i11++) {
            if ("Vary".equalsIgnoreCase(tVar.d(i11))) {
                String strG = tVar.g(i11);
                if (treeSet == null) {
                    StringCompanionObject.INSTANCE.getClass();
                    Comparator comparator = String.CASE_INSENSITIVE_ORDER;
                    comparator.getClass();
                    treeSet = new TreeSet(comparator);
                }
                Iterator it = StringsKt.S(strG, new char[]{','}, 6).iterator();
                while (it.hasNext()) {
                    treeSet.add(StringsKt.e0((String) it.next()).toString());
                }
            }
        }
        return treeSet == null ? p0.f26531a : treeSet;
    }

    public static final void a(final String str, final int i11, final float f11, final float f12, final long j9, m3.n nVar, final int i12) {
        s sVar = (s) nVar;
        sVar.c0(-1903207696);
        int i13 = i12 | (sVar.f(str) ? 4 : 2) | (sVar.d(i11) ? 32 : 16) | (sVar.c(f11) ? 256 : 128) | (sVar.c(f12) ? NewHope.SENDB_BYTES : 1024) | (sVar.e(j9) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192);
        if (sVar.R(i13 & 1, (i13 & 9363) != 9362)) {
            float f13 = lv.t.f28251e;
            q qVar = q.f5711a;
            b4.t tVarZ = d2.c.z(qVar, f13);
            u0 u0VarD = p.d(b4.d.f5683a, false);
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
            b4.t tVarJ = v1.n.j(m2.t(m2.d(qVar, 1.0f), 3), lv.s.J, g0.f23254b);
            float f14 = 12;
            s0.b(v1.n.k(tVarJ, 1, lv.s.H, l2.g.b(f14)), l2.g.b(f14), null, s0.q(f11, 0.0f, 0.0f, 0.0f, 62), null, u3.e.e(542876408, sVar, new i80.n() { // from class: ph.a
                @Override // i80.n
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    m3.n nVar2 = (m3.n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((d2.z) obj).getClass();
                    s sVar2 = (s) nVar2;
                    if (sVar2.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                        long j11 = lv.s.J;
                        r0 r0Var = g0.f23254b;
                        q qVar2 = q.f5711a;
                        b4.t tVarD = m2.d(v1.n.j(qVar2, j11, r0Var), 1.0f);
                        i2 i2VarA = h2.a(i.f13801a, b4.d.f5693k, sVar2, 48);
                        int iHashCode2 = Long.hashCode(sVar2.T);
                        u3.i iVarL2 = sVar2.l();
                        b4.t tVarC2 = b4.a.c(tVarD, sVar2);
                        b5.j.R.getClass();
                        h hVar2 = b5.i.f5839b;
                        sVar2.e0();
                        if (sVar2.S) {
                            sVar2.k(hVar2);
                        } else {
                            sVar2.n0();
                        }
                        m3.i.C(i2VarA, b5.i.f5843f, sVar2);
                        m3.i.C(iVarL2, b5.i.f5842e, sVar2);
                        m3.i.v(sVar2, Integer.valueOf(iHashCode2), b5.i.f5844g);
                        m3.i.z(sVar2, b5.i.f5845h);
                        m3.i.C(tVarC2, b5.i.f5841d, sVar2);
                        float f15 = lv.t.f28253g;
                        b4.t tVarD2 = d2.c.D(qVar2, f12, 0.0f, f15, 0.0f, 10);
                        n4.b bVarZ = x0.z(i11, sVar2, 0);
                        long j12 = i4.v.f23315h;
                        String str2 = str;
                        g3.i2.a(bVarZ, str2, tVarD2, j12, sVar2, 3080, 0);
                        r9.d(str2, d2.c.z(qVar2, f15), j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar2, 48, 12582912, 131064);
                        sVar2.q(true);
                    } else {
                        sVar2.U();
                    }
                    return Unit.f26487a;
                }
            }), sVar, 196608, 20);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2(str, i11, f11, f12, j9, i12) { // from class: ph.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f35329a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f35330b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ float f35331c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ float f35332d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ long f35333e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iF = m3.i.F(1);
                    ox.h.a(this.f35329a, this.f35330b, this.f35331c, this.f35332d, this.f35333e, (m3.n) obj, iF);
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final void b(final TypedItemCardsCarouselMnu typedItemCardsCarouselMnu, final int i11, final ym.y yVar, final ym.z zVar, final int i12, final boolean z11, m3.n nVar, int i13) {
        s sVar = (s) nVar;
        sVar.c0(1923918944);
        int i14 = i13 | (sVar.h(typedItemCardsCarouselMnu) ? 4 : 2) | (sVar.d(i11) ? 32 : 16) | (sVar.f(yVar) ? 256 : 128) | (sVar.f(zVar) ? NewHope.SENDB_BYTES : 1024) | (sVar.d(i12) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar.g(z11) ? 131072 : 65536);
        if (sVar.R(i14 & 1, (74899 & i14) != 74898)) {
            m mVar = (m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            x60.h hVar = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            long j9 = hVar.G;
            long j11 = hVar.J;
            c0 c0VarA = e0.a(0, 0, 0, 3, sVar);
            d2.y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            q qVar = q.f5711a;
            b4.t tVarC = b4.a.c(qVar, sVar);
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
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            k(typedItemCardsCarouselMnu, j9, j11, sVar, i14 & 14);
            b4.t tVarB = d2.c.B(qVar, mVar.f44008d, 0.0f, 2);
            b4.j jVar = b4.d.f5693k;
            a2.j jVarG = a0.G(c0VarA, sVar, 48, 0);
            boolean zH = sVar.h(typedItemCardsCarouselMnu) | ((i14 & 896) == 256) | ((i14 & 112) == 32) | ((57344 & i14) == 16384) | ((458752 & i14) == 131072) | ((i14 & 7168) == 2048);
            Object objM = sVar.M();
            if (zH || objM == m3.m.f29332a) {
                Function1 function1 = new Function1() { // from class: cn.e0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        f2.l lVar = (f2.l) obj;
                        lVar.getClass();
                        TypedItemCardsCarouselMnu typedItemCardsCarouselMnu2 = typedItemCardsCarouselMnu;
                        List<BaseItemMnuV2> items = typedItemCardsCarouselMnu2.getItems();
                        lVar.r(items.size(), new p2(5, new u(4, (byte) 0), items), new n(items, 3), new u3.d(new h0(items, yVar, i11, typedItemCardsCarouselMnu2, i12, z11, zVar), true, 2039820996));
                        return Unit.f26487a;
                    }
                };
                sVar.k0(function1);
                objM = function1;
            }
            sVar = sVar;
            d(tVarB, c0VarA, null, false, null, jVar, jVarG, false, null, (Function1) objM, sVar, 196608, 412);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new an.h(typedItemCardsCarouselMnu, i11, yVar, zVar, i12, z11, i13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(b4.t r29, f2.c0 r30, d2.z1 r31, d2.h r32, b4.e r33, z1.l1 r34, boolean r35, v1.o1 r36, final kotlin.jvm.functions.Function1 r37, m3.n r38, final int r39, final int r40) {
        /*
            Method dump skipped, instruction units count: 603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ox.h.c(b4.t, f2.c0, d2.z1, d2.h, b4.e, z1.l1, boolean, v1.o1, kotlin.jvm.functions.Function1, m3.n, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(b4.t r29, f2.c0 r30, d2.z1 r31, boolean r32, d2.f r33, b4.j r34, z1.l1 r35, boolean r36, v1.o1 r37, kotlin.jvm.functions.Function1 r38, m3.n r39, int r40, int r41) {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ox.h.d(b4.t, f2.c0, d2.z1, boolean, d2.f, b4.j, z1.l1, boolean, v1.o1, kotlin.jvm.functions.Function1, m3.n, int, int):void");
    }

    public static final void e(LocalHero localHero, m3.n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(-2144325879);
        int i12 = i11 | (sVar.f(localHero) ? 4 : 2);
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            q qVar = q.f5711a;
            b4.t tVarJ = v1.n.j(m2.d(qVar, 1.0f), lv.s.J, g0.f23254b);
            d2.y yVarA = w.a(d2.i.f13803c, b4.d.f5695n, sVar, 48);
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
            s0.g(m2.d(qVar, 1.0f), lv.t.f28252f, lv.s.I, sVar, 438, 0);
            n4.b bVarZ = x0.z(R.drawable.local_hero_blob_full, sVar, 0);
            float f11 = lv.t.f28253g;
            v1.n.d(bVarZ, null, d2.c.D(qVar, f11, f11, f11, 0.0f, 8), null, null, 0.0f, null, sVar, 56, 120);
            String title = localHero.getTitle();
            if (title == null) {
                title = "";
            }
            m5.u0 u0Var = lv.v.f28272k;
            long j9 = lv.s.C;
            b4.t tVarD = m2.d(qVar, 1.0f);
            float f12 = lv.t.f28251e;
            r9.d(title, d2.c.D(tVarD, f11, f12, f11, 0.0f, 8), j9, 0L, null, 0L, null, new k(3), 0L, 0, false, 0, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
            String description = localHero.getDescription();
            if (description == null) {
                description = "";
            }
            r9.d(description, d2.c.C(m2.d(qVar, 1.0f), f11, f12, f11, f11), j9, 0L, null, 0L, null, new k(3), 0L, 0, false, 0, 0, null, lv.v.f28276p, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
            sVar = sVar;
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new f1(localHero, i11, 7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(java.lang.String r24, java.lang.String r25, boolean r26, kotlin.jvm.functions.Function0 r27, kotlin.jvm.functions.Function0 r28, java.lang.String r29, java.lang.String r30, java.lang.Integer r31, m3.n r32, int r33, int r34) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ox.h.f(java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, java.lang.String, java.lang.String, java.lang.Integer, m3.n, int, int):void");
    }

    public static final i1 g(String str) {
        k90.d dVar = k90.d.f26221r;
        str.getClass();
        if (StringsKt.H(str)) {
            i4.a.f("Blank serial names are prohibited");
            return null;
        }
        Object it = ((r3.i) j1.f29816a.values()).iterator();
        while (((o0) it).hasNext()) {
            KSerializer kSerializer = (KSerializer) ((v70.g) it).next();
            if (Intrinsics.areEqual(str, kSerializer.getDescriptor().a())) {
                StringBuilder sbS = e0.f.s("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                sbS.append(Reflection.getOrCreateKotlinClass(kSerializer.getClass()).getSimpleName());
                sbS.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                i4.a.f(kotlin.text.s.c(sbS.toString()));
                return null;
            }
        }
        return new i1(str, dVar);
    }

    public static final void h(int i11, int i12, b4.t tVar, m3.n nVar) {
        s sVar = (s) nVar;
        sVar.c0(887438172);
        int i13 = (sVar.d(i11) ? 32 : 16) | i12;
        if (sVar.R(i13 & 1, (i13 & 19) != 18)) {
            b4.t tVarU = m2.u(tVar, null, 3);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5692j, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarU, sVar);
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
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            sVar.a0(35654330);
            int i14 = 1;
            while (i14 < 6) {
                g3.i2.a(x0.z(i11 >= i14 ? R.drawable.order_list_star_selected : R.drawable.order_list_star_deselected, sVar, 0), null, d2.c.D(q.f5711a, 0.0f, 0.0f, o30.e0.s(sVar, R.dimen.spacing_0_25), 0.0f, 11), i4.v.f23315h, sVar, 3128, 0);
                i14++;
            }
            sVar.q(false);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cg.p0(tVar, i11, i12);
        }
    }

    public static final void i(int i11, Function0 function0, m3.n nVar, int i12) {
        s sVar = (s) nVar;
        sVar.c0(-1284524910);
        int i13 = (sVar.d(i11) ? 4 : 2) | i12 | (sVar.h(function0) ? 32 : 16);
        if (sVar.R(i13 & 1, (i13 & 19) != 18)) {
            float f11 = 16;
            float f12 = 14;
            b4.t tVarC = d2.c.C(m2.d(q.f5711a, 1.0f), f11, f12, f11, f12);
            boolean z11 = (i13 & 112) == 32;
            Object objM = sVar.M();
            if (z11 || objM == m3.m.f29332a) {
                objM = new ki.a(10, function0);
                sVar.k0(objM);
            }
            b4.t tVarC2 = androidx.compose.foundation.b.c(tVarC, false, null, null, (Function0) objM, 15);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC3 = b4.a.c(tVarC2, sVar);
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
            m3.i.C(tVarC3, b5.i.f5841d, sVar);
            m5.u0 u0Var = lv.v.f28274n;
            long j9 = lv.s.C;
            String strU = f0.U(sVar, i11);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            r9.d(strU, new n1(1.0f, true), j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
            sVar = sVar;
            v1.n.d(x0.z(R.drawable.system_icon_chevron_right_neutral_80, sVar, 0), null, null, b4.d.f5688f, null, 0.0f, new i4.o(lv.s.E, 5), sVar, 1575992, 52);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a2(i11, function0, i12, 3);
        }
    }

    public static final void j(ek.q qVar, m3.n nVar, int i11) {
        qVar.getClass();
        s sVar = (s) nVar;
        sVar.c0(571570846);
        int i12 = (sVar.h(qVar) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            b4.i iVar = b4.d.f5695n;
            b4.t tVarJ = v1.n.j(m2.c(m2.d(q.f5711a, 1.0f), 1.0f), lv.s.J, g0.f23254b);
            d2.y yVarA = w.a(d2.i.f13803c, iVar, sVar, 48);
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
            boolean zH = sVar.h(qVar);
            Object objM = sVar.M();
            if (zH || objM == m3.m.f29332a) {
                objM = new jd.a(qVar, 16);
                sVar.k0(objM);
            }
            c(null, null, null, null, null, null, false, null, (Function1) objM, sVar, 0, 511);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new jk.c(qVar, i11, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    public static final void k(TypedItemCardsCarouselMnu typedItemCardsCarouselMnu, long j9, long j11, m3.n nVar, int i11) {
        long j12;
        s sVar;
        r0 r0Var;
        boolean z11;
        q qVar;
        boolean z12;
        int i12;
        s sVar2;
        s sVar3;
        float f11;
        s sVar4;
        ?? r32;
        s sVar5 = (s) nVar;
        sVar5.c0(-1501750479);
        int i13 = i11 | (sVar5.h(typedItemCardsCarouselMnu) ? 4 : 2) | (sVar5.e(j9) ? 32 : 16) | (sVar5.e(j11) ? 256 : 128);
        if (sVar5.R(i13 & 1, (i13 & 147) != 146)) {
            x60.j jVar = (x60.j) sVar5.j(PantryThemeKt.getLocalPantryTypography());
            String title = typedItemCardsCarouselMnu.getTitle();
            r0 r0Var2 = g0.f23254b;
            q qVar2 = q.f5711a;
            if (title == null && typedItemCardsCarouselMnu.getSubtitle() == null) {
                sVar5.a0(2027078257);
                sVar5.q(false);
                sVar4 = sVar5;
                r32 = 0;
                r0Var = r0Var2;
                f11 = 1.0f;
                qVar = qVar2;
            } else {
                sVar5.a0(2026053831);
                b4.t tVarJ = v1.n.j(m2.d(qVar2, 1.0f), j9, r0Var2);
                float f12 = lv.t.f28251e;
                float f13 = lv.t.f28253g;
                b4.t tVarD = d2.c.D(tVarJ, f13, f12, f13, 0.0f, 8);
                d2.y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar5, 0);
                int iHashCode = Long.hashCode(sVar5.T);
                u3.i iVarL = sVar5.l();
                b4.t tVarC = b4.a.c(tVarD, sVar5);
                b5.j.R.getClass();
                b5.h hVar = b5.i.f5839b;
                sVar5.e0();
                if (sVar5.S) {
                    sVar5.k(hVar);
                } else {
                    sVar5.n0();
                }
                m3.i.C(yVarA, b5.i.f5843f, sVar5);
                m3.i.C(iVarL, b5.i.f5842e, sVar5);
                m3.i.v(sVar5, Integer.valueOf(iHashCode), b5.i.f5844g);
                m3.i.z(sVar5, b5.i.f5845h);
                m3.i.C(tVarC, b5.i.f5841d, sVar5);
                String title2 = typedItemCardsCarouselMnu.getTitle();
                if (title2 == null) {
                    sVar5.a0(-1985515473);
                    sVar5.q(false);
                    sVar2 = sVar5;
                    i12 = i13;
                    z11 = false;
                    r0Var = r0Var2;
                    qVar = qVar2;
                    z12 = true;
                } else {
                    sVar5.a0(-1985515472);
                    r0Var = r0Var2;
                    z11 = false;
                    qVar = qVar2;
                    z12 = true;
                    i12 = i13;
                    r9.d(title2, null, j11, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, jVar.f43957f, sVar5, i13 & 896, 24960, 110586);
                    s sVar6 = sVar5;
                    d2.c.f(m2.e(qVar, lv.t.f28249c), sVar6);
                    sVar6.q(false);
                    sVar2 = sVar6;
                }
                String subtitle = typedItemCardsCarouselMnu.getSubtitle();
                if (subtitle == null) {
                    sVar2.a0(-1985152308);
                    sVar2.q(z11);
                    sVar3 = sVar2;
                } else {
                    sVar2.a0(-1985152307);
                    s sVar7 = sVar2;
                    r9.d(subtitle, null, j11, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, lv.v.f28285y, sVar7, i12 & 896, 12607872, 110586);
                    s sVar8 = sVar7;
                    d2.c.f(m2.e(qVar, lv.t.f28249c), sVar8);
                    sVar8.q(z11);
                    sVar3 = sVar8;
                }
                sVar3.q(z12);
                sVar3.q(z11);
                f11 = 1.0f;
                r32 = z11;
                sVar4 = sVar3;
            }
            b4.t tVarD2 = m2.d(qVar, f11);
            j12 = j9;
            d2.c.f(m2.e(v1.n.j(tVarD2, j12, r0Var), (float) r32), sVar4);
            sVar = sVar4;
        } else {
            s sVar9 = sVar5;
            j12 = j9;
            sVar9.U();
            sVar = sVar9;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cn.f0(typedItemCardsCarouselMnu, j12, j11, i11, 0);
        }
    }

    public static final void l(a aVar, a aVar2) {
        if (yx.a.f46339a.contains(h.class)) {
            return;
        }
        try {
            aVar.getClass();
            aVar2.getClass();
            int[] iArr = aVar.f33767a;
            int i11 = iArr[0];
            int i12 = iArr[1];
            int i13 = iArr[2];
            float[] fArr = aVar.f33769c;
            float[] fArr2 = aVar2.f33769c;
            for (int i14 = 0; i14 < i11; i14++) {
                for (int i15 = 0; i15 < i12; i15++) {
                    for (int i16 = 0; i16 < i13; i16++) {
                        int iA = l1.a(i15, i13, i14 * i12 * i13, i16);
                        fArr[iA] = fArr[iA] + fArr2[i16];
                    }
                }
            }
        } catch (Throwable th2) {
            yx.a.a(h.class, th2);
        }
    }

    public static final vx.d m(String str, String str2) {
        vx.d dVar = new vx.d();
        dVar.f42529b = vx.b.AnrReport;
        Context contextA = ax.a0.a();
        String str3 = null;
        if (contextA != null) {
            try {
                PackageInfo packageInfo = contextA.getPackageManager().getPackageInfo(contextA.getPackageName(), 0);
                if (packageInfo != null) {
                    str3 = packageInfo.versionName;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        dVar.f42531d = str3;
        dVar.f42532e = str;
        dVar.f42533f = str2;
        Long lValueOf = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        dVar.f42534g = lValueOf;
        StringBuffer stringBuffer = new StringBuffer("anr_log_");
        stringBuffer.append(String.valueOf(lValueOf));
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        string.getClass();
        dVar.f42528a = string;
        return dVar;
    }

    public static final vx.d n(Throwable th2, vx.b bVar) {
        String str;
        bVar.getClass();
        vx.d dVar = new vx.d();
        dVar.f42529b = bVar;
        Context contextA = ax.a0.a();
        String string = null;
        Throwable th3 = null;
        if (contextA == null) {
            str = null;
        } else {
            try {
                PackageInfo packageInfo = contextA.getPackageManager().getPackageInfo(contextA.getPackageName(), 0);
                if (packageInfo != null) {
                    str = packageInfo.versionName;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            str = null;
        }
        dVar.f42531d = str;
        dVar.f42532e = th2 == null ? null : th2.getCause() == null ? th2.toString() : String.valueOf(th2.getCause());
        if (th2 != null) {
            JSONArray jSONArray = new JSONArray();
            while (th2 != null && th2 != th3) {
                StackTraceElement[] stackTrace = th2.getStackTrace();
                stackTrace.getClass();
                for (StackTraceElement stackTraceElement : stackTrace) {
                    jSONArray.put(stackTraceElement.toString());
                }
                th3 = th2;
                th2 = th2.getCause();
            }
            string = jSONArray.toString();
        }
        dVar.f42533f = string;
        Long lValueOf = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        dVar.f42534g = lValueOf;
        StringBuffer stringBuffer = new StringBuffer();
        int i11 = vx.a.$EnumSwitchMapping$0[bVar.ordinal()];
        stringBuffer.append(i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? "Unknown" : "thread_check_log_" : "shield_log_" : "crash_log_" : "anr_log_" : "analysis_log_");
        stringBuffer.append(String.valueOf(lValueOf));
        stringBuffer.append(".json");
        String string2 = stringBuffer.toString();
        string2.getClass();
        dVar.f42528a = string2;
        return dVar;
    }

    public static final k90.e o(String str, p30.b bVar, SerialDescriptor[] serialDescriptorArr, Function1 function1) {
        if (StringsKt.H(str)) {
            i4.a.f("Blank serial names are prohibited");
            return null;
        }
        if (Intrinsics.areEqual(bVar, k90.j.f26240j)) {
            i4.a.f("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        k90.a aVar = new k90.a(str);
        function1.invoke(aVar);
        return new k90.e(str, bVar, aVar.f26204c.size(), kotlin.collections.y.T(serialDescriptorArr), aVar);
    }

    public static k90.e p(String str, p30.b bVar, SerialDescriptor[] serialDescriptorArr) {
        if (StringsKt.H(str)) {
            i4.a.f("Blank serial names are prohibited");
            return null;
        }
        if (Intrinsics.areEqual(bVar, k90.j.f26240j)) {
            i4.a.f("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        k90.a aVar = new k90.a(str);
        return new k90.e(str, bVar, aVar.f26204c.size(), kotlin.collections.y.T(serialDescriptorArr), aVar);
    }

    public static void q(boolean z11, String str, Object... objArr) {
        if (!z11) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static final a r(a[] aVarArr) {
        if (yx.a.f46339a.contains(h.class)) {
            return null;
        }
        try {
            int i11 = aVarArr[0].f33767a[0];
            int i12 = 0;
            for (a aVar : aVarArr) {
                i12 += aVar.f33767a[1];
            }
            a aVar2 = new a(new int[]{i11, i12});
            float[] fArr = aVar2.f33769c;
            for (int i13 = 0; i13 < i11; i13++) {
                int i14 = i13 * i12;
                for (a aVar3 : aVarArr) {
                    float[] fArr2 = aVar3.f33769c;
                    int i15 = aVar3.f33767a[1];
                    System.arraycopy(fArr2, i13 * i15, fArr, i14, i15);
                    i14 += i15;
                }
            }
            return aVar2;
        } catch (Throwable th2) {
            yx.a.a(h.class, th2);
            return null;
        }
    }

    public static final a s(a aVar, a aVar2) {
        a aVar3;
        a aVar4 = null;
        if (yx.a.f46339a.contains(h.class)) {
            return null;
        }
        try {
            aVar.getClass();
            aVar2.getClass();
            int[] iArr = aVar.f33767a;
            int i11 = 0;
            int i12 = iArr[0];
            int i13 = iArr[1];
            int i14 = iArr[2];
            int[] iArr2 = aVar2.f33767a;
            int i15 = iArr2[0];
            int i16 = (i13 - i15) + 1;
            int i17 = iArr2[2];
            a aVar5 = new a(new int[]{i12, i16, i17});
            float[] fArr = aVar.f33769c;
            float[] fArr2 = aVar5.f33769c;
            float[] fArr3 = aVar2.f33769c;
            int i18 = 0;
            while (i18 < i12) {
                int i19 = i11;
                while (i19 < i17) {
                    int i21 = i11;
                    while (i21 < i16) {
                        float f11 = 0.0f;
                        aVar3 = aVar4;
                        int i22 = i11;
                        while (i22 < i15) {
                            while (i11 < i14) {
                                try {
                                    f11 = (fArr[((i22 + i21) * i14) + (i13 * i14 * i18) + i11] * fArr3[(((i22 * i14) + i11) * i17) + i19]) + f11;
                                    i11++;
                                } catch (Throwable th2) {
                                    th = th2;
                                    yx.a.a(h.class, th);
                                    return aVar3;
                                }
                            }
                            i22++;
                            i11 = 0;
                        }
                        fArr2[l1.a(i21, i17, i16 * i17 * i18, i19)] = f11;
                        i21++;
                        aVar4 = aVar3;
                        i11 = 0;
                    }
                    i19++;
                    i11 = 0;
                }
                i18++;
                i11 = 0;
            }
            return aVar5;
        } catch (Throwable th3) {
            th = th3;
            aVar3 = null;
        }
    }

    public static final a t(a aVar, a aVar2, a aVar3) {
        if (yx.a.f46339a.contains(h.class)) {
            return null;
        }
        try {
            aVar.getClass();
            aVar2.getClass();
            aVar3.getClass();
            int i11 = aVar.f33767a[0];
            int i12 = aVar3.f33767a[0];
            a aVarL = L(aVar, aVar2);
            float[] fArr = aVar3.f33769c;
            float[] fArr2 = aVarL.f33769c;
            for (int i13 = 0; i13 < i11; i13++) {
                for (int i14 = 0; i14 < i12; i14++) {
                    int i15 = (i13 * i12) + i14;
                    fArr2[i15] = fArr2[i15] + fArr[i14];
                }
            }
            return aVarL;
        } catch (Throwable th2) {
            yx.a.a(h.class, th2);
            return null;
        }
    }

    public static final a v(String[] strArr, a aVar) {
        if (yx.a.f46339a.contains(h.class)) {
            return null;
        }
        try {
            aVar.getClass();
            int length = strArr.length;
            int i11 = aVar.f33767a[1];
            a aVar2 = new a(new int[]{length, 128, i11});
            float[] fArr = aVar2.f33769c;
            float[] fArr2 = aVar.f33769c;
            for (int i12 = 0; i12 < length; i12++) {
                int[] iArrC = i.f33797a.c(strArr[i12]);
                for (int i13 = 0; i13 < 128; i13++) {
                    System.arraycopy(fArr2, iArrC[i13] * i11, fArr, (i11 * i13) + (i11 * 128 * i12), i11);
                }
            }
            return aVar2;
        } catch (Throwable th2) {
            yx.a.a(h.class, th2);
            return null;
        }
    }

    public static final boolean w(String str, String str2) {
        str.getClass();
        str2.getClass();
        return y.k(str, str2, true);
    }

    public static final void x(a aVar) {
        boolean z11;
        int i11;
        if (yx.a.f46339a.contains(h.class)) {
            return;
        }
        try {
            aVar.getClass();
            int[] iArr = aVar.f33767a;
            int i12 = 1;
            if (1 >= iArr.length) {
                return;
            }
            int length = iArr.length;
            int i13 = 1;
            for (int i14 = 1; i14 < length; i14++) {
                i13 *= aVar.f33767a[i14];
            }
            int i15 = aVar.f33767a[0];
            int[] iArr2 = {i15, i13};
            aVar.f33767a = iArr2;
            IntRange intRange = new IntRange(1, 1, 1);
            int i16 = intRange.f26554b;
            int i17 = intRange.f26555c;
            if (i17 > 0) {
                z11 = 1 <= i16;
            } else if (1 >= i16) {
            }
            if (!z11) {
                i12 = i16;
            }
            while (z11) {
                if (i12 != i16) {
                    i11 = i12 + i17;
                } else {
                    if (!z11) {
                        throw new NoSuchElementException();
                    }
                    i11 = i12;
                    z11 = false;
                }
                i15 *= iArr2[i12];
                i12 = i11;
            }
            float[] fArr = new float[i15];
            System.arraycopy(aVar.f33769c, 0, fArr, 0, Math.min(aVar.f33768b, i15));
            aVar.f33769c = fArr;
            aVar.f33768b = i15;
        } catch (Throwable th2) {
            yx.a.a(h.class, th2);
        }
    }

    public static final float y(int i11, int i12, float[] fArr) {
        return fArr[((i11 - i12) * 2) + 1];
    }

    public static HashMap z() {
        HashMap map = new HashMap(286);
        ArrayList arrayList = new ArrayList(25);
        arrayList.add("US");
        arrayList.add("AG");
        arrayList.add("AI");
        arrayList.add("AS");
        arrayList.add("BB");
        arrayList.add("BM");
        arrayList.add("BS");
        arrayList.add("CA");
        arrayList.add("DM");
        arrayList.add("DO");
        arrayList.add("GD");
        arrayList.add("GU");
        arrayList.add("JM");
        arrayList.add("KN");
        arrayList.add("KY");
        arrayList.add("LC");
        arrayList.add("MP");
        arrayList.add("MS");
        arrayList.add("PR");
        arrayList.add("SX");
        arrayList.add("TC");
        arrayList.add("TT");
        arrayList.add("VC");
        arrayList.add("VG");
        arrayList.add("VI");
        map.put(1, arrayList);
        ArrayList arrayList2 = new ArrayList(2);
        arrayList2.add("RU");
        arrayList2.add("KZ");
        ArrayList arrayListU = e0.f.u(36, map, e0.f.u(34, map, e0.f.u(33, map, e0.f.u(32, map, e0.f.u(31, map, e0.f.u(30, map, e0.f.u(27, map, e0.f.u(20, map, e0.f.u(7, map, arrayList2, 1, "EG"), 1, "ZA"), 1, "GR"), 1, "NL"), 1, "BE"), 1, "FR"), 1, "ES"), 1, "HU"), 2, "IT");
        arrayListU.add("VA");
        map.put(39, arrayListU);
        ArrayList arrayList3 = new ArrayList(1);
        arrayList3.add("RO");
        ArrayList arrayListU2 = e0.f.u(43, map, e0.f.u(41, map, e0.f.u(40, map, arrayList3, 1, "CH"), 1, "AT"), 4, "GB");
        arrayListU2.add("GG");
        arrayListU2.add("IM");
        arrayListU2.add("JE");
        map.put(44, arrayListU2);
        ArrayList arrayList4 = new ArrayList(1);
        arrayList4.add("DK");
        ArrayList arrayListU3 = e0.f.u(46, map, e0.f.u(45, map, arrayList4, 1, "SE"), 2, "NO");
        arrayListU3.add("SJ");
        map.put(47, arrayListU3);
        ArrayList arrayList5 = new ArrayList(1);
        arrayList5.add("PL");
        ArrayList arrayListU4 = e0.f.u(60, map, e0.f.u(58, map, e0.f.u(57, map, e0.f.u(56, map, e0.f.u(55, map, e0.f.u(54, map, e0.f.u(53, map, e0.f.u(52, map, e0.f.u(51, map, e0.f.u(49, map, e0.f.u(48, map, arrayList5, 1, "DE"), 1, "PE"), 1, "MX"), 1, "CU"), 1, "AR"), 1, "BR"), 1, "CL"), 1, "CO"), 1, "VE"), 1, "MY"), 3, "AU");
        arrayListU4.add("CC");
        arrayListU4.add("CX");
        map.put(61, arrayListU4);
        ArrayList arrayList6 = new ArrayList(1);
        arrayList6.add("ID");
        ArrayList arrayListU5 = e0.f.u(Primes.SMALL_FACTOR_LIMIT, map, e0.f.u(98, map, e0.f.u(95, map, e0.f.u(94, map, e0.f.u(93, map, e0.f.u(92, map, e0.f.u(91, map, e0.f.u(90, map, e0.f.u(86, map, e0.f.u(84, map, e0.f.u(82, map, e0.f.u(81, map, e0.f.u(66, map, e0.f.u(65, map, e0.f.u(64, map, e0.f.u(63, map, e0.f.u(62, map, arrayList6, 1, "PH"), 1, "NZ"), 1, "SG"), 1, "TH"), 1, "JP"), 1, "KR"), 1, "VN"), 1, "CN"), 1, "TR"), 1, "IN"), 1, "PK"), 1, "AF"), 1, "LK"), 1, "MM"), 1, "IR"), 1, "SS"), 2, "MA");
        arrayListU5.add("EH");
        map.put(212, arrayListU5);
        ArrayList arrayList7 = new ArrayList(1);
        arrayList7.add("DZ");
        ArrayList arrayListU6 = e0.f.u(261, map, e0.f.u(260, map, e0.f.u(258, map, e0.f.u(257, map, e0.f.u(256, map, e0.f.u(255, map, e0.f.u(254, map, e0.f.u(253, map, e0.f.u(252, map, e0.f.u(251, map, e0.f.u(m0.DEFAULT_SWIPE_ANIMATION_DURATION, map, e0.f.u(249, map, e0.f.u(248, map, e0.f.u(247, map, e0.f.u(246, map, e0.f.u(245, map, e0.f.u(244, map, e0.f.u(243, map, e0.f.u(242, map, e0.f.u(241, map, e0.f.u(240, map, e0.f.u(239, map, e0.f.u(238, map, e0.f.u(237, map, e0.f.u(236, map, e0.f.u(235, map, e0.f.u(234, map, e0.f.u(233, map, e0.f.u(232, map, e0.f.u(231, map, e0.f.u(230, map, e0.f.u(229, map, e0.f.u(228, map, e0.f.u(227, map, e0.f.u(226, map, e0.f.u(225, map, e0.f.u(BERTags.FLAGS, map, e0.f.u(AppConstants.GO_TO_GPS_SETTINGS, map, e0.f.u(AppConstants.GPS_SETTINGS, map, e0.f.u(221, map, e0.f.u(220, map, e0.f.u(218, map, e0.f.u(216, map, e0.f.u(213, map, arrayList7, 1, "TN"), 1, "LY"), 1, "GM"), 1, "SN"), 1, "MR"), 1, "ML"), 1, "GN"), 1, "CI"), 1, "BF"), 1, "NE"), 1, "TG"), 1, "BJ"), 1, "MU"), 1, "LR"), 1, "SL"), 1, "GH"), 1, "NG"), 1, "TD"), 1, "CF"), 1, "CM"), 1, "CV"), 1, "ST"), 1, "GQ"), 1, "GA"), 1, "CG"), 1, "CD"), 1, "AO"), 1, "GW"), 1, "IO"), 1, "AC"), 1, "SC"), 1, "SD"), 1, "RW"), 1, "ET"), 1, "SO"), 1, "DJ"), 1, "KE"), 1, "TZ"), 1, "UG"), 1, "BI"), 1, "MZ"), 1, "ZM"), 1, "MG"), 2, "RE");
        arrayListU6.add("YT");
        map.put(262, arrayListU6);
        ArrayList arrayList8 = new ArrayList(1);
        arrayList8.add("ZW");
        ArrayList arrayListU7 = e0.f.u(269, map, e0.f.u(268, map, e0.f.u(267, map, e0.f.u(266, map, e0.f.u(265, map, e0.f.u(264, map, e0.f.u(263, map, arrayList8, 1, "NA"), 1, "MW"), 1, "LS"), 1, "BW"), 1, "SZ"), 1, "KM"), 2, "SH");
        arrayListU7.add("TA");
        map.put(290, arrayListU7);
        ArrayList arrayList9 = new ArrayList(1);
        arrayList9.add("ER");
        ArrayList arrayListU8 = e0.f.u(357, map, e0.f.u(356, map, e0.f.u(355, map, e0.f.u(354, map, e0.f.u(353, map, e0.f.u(352, map, e0.f.u(351, map, e0.f.u(350, map, e0.f.u(299, map, e0.f.u(298, map, e0.f.u(297, map, e0.f.u(291, map, arrayList9, 1, "AW"), 1, "FO"), 1, "GL"), 1, "GI"), 1, "PT"), 1, "LU"), 1, "IE"), 1, "IS"), 1, "AL"), 1, "MT"), 1, "CY"), 2, "FI");
        arrayListU8.add("AX");
        map.put(358, arrayListU8);
        ArrayList arrayList10 = new ArrayList(1);
        arrayList10.add("BG");
        ArrayList arrayListU9 = e0.f.u(509, map, e0.f.u(508, map, e0.f.u(507, map, e0.f.u(506, map, e0.f.u(505, map, e0.f.u(504, map, e0.f.u(503, map, e0.f.u(502, map, e0.f.u(501, map, e0.f.u(500, map, e0.f.u(423, map, e0.f.u(421, map, e0.f.u(420, map, e0.f.u(389, map, e0.f.u(387, map, e0.f.u(386, map, e0.f.u(385, map, e0.f.u(383, map, e0.f.u(382, map, e0.f.u(381, map, e0.f.u(380, map, e0.f.u(378, map, e0.f.u(377, map, e0.f.u(376, map, e0.f.u(375, map, e0.f.u(374, map, e0.f.u(373, map, e0.f.u(372, map, e0.f.u(371, map, e0.f.u(370, map, e0.f.u(359, map, arrayList10, 1, "LT"), 1, "LV"), 1, "EE"), 1, "MD"), 1, "AM"), 1, "BY"), 1, "AD"), 1, "MC"), 1, "SM"), 1, "UA"), 1, "RS"), 1, "ME"), 1, "XK"), 1, "HR"), 1, "SI"), 1, "BA"), 1, "MK"), 1, "CZ"), 1, "SK"), 1, "LI"), 1, "FK"), 1, "BZ"), 1, "GT"), 1, "SV"), 1, "HN"), 1, "NI"), 1, "CR"), 1, "PA"), 1, "PM"), 1, "HT"), 3, "GP");
        arrayListU9.add("BL");
        arrayListU9.add("MF");
        map.put(590, arrayListU9);
        ArrayList arrayList11 = new ArrayList(1);
        arrayList11.add("BO");
        ArrayList arrayListU10 = e0.f.u(598, map, e0.f.u(597, map, e0.f.u(596, map, e0.f.u(595, map, e0.f.u(594, map, e0.f.u(593, map, e0.f.u(592, map, e0.f.u(591, map, arrayList11, 1, "GY"), 1, "EC"), 1, "GF"), 1, "PY"), 1, "MQ"), 1, "SR"), 1, "UY"), 2, "CW");
        arrayListU10.add("BQ");
        map.put(599, arrayListU10);
        ArrayList arrayList12 = new ArrayList(1);
        arrayList12.add("TL");
        map.put(998, e0.f.u(996, map, e0.f.u(995, map, e0.f.u(994, map, e0.f.u(993, map, e0.f.u(992, map, e0.f.u(979, map, e0.f.u(977, map, e0.f.u(976, map, e0.f.u(975, map, e0.f.u(974, map, e0.f.u(973, map, e0.f.u(972, map, e0.f.u(971, map, e0.f.u(970, map, e0.f.u(968, map, e0.f.u(967, map, e0.f.u(966, map, e0.f.u(965, map, e0.f.u(964, map, e0.f.u(963, map, e0.f.u(962, map, e0.f.u(961, map, e0.f.u(960, map, e0.f.u(888, map, e0.f.u(886, map, e0.f.u(883, map, e0.f.u(882, map, e0.f.u(881, map, e0.f.u(880, map, e0.f.u(878, map, e0.f.u(870, map, e0.f.u(856, map, e0.f.u(855, map, e0.f.u(853, map, e0.f.u(852, map, e0.f.u(850, map, e0.f.u(808, map, e0.f.u(800, map, e0.f.u(692, map, e0.f.u(691, map, e0.f.u(690, map, e0.f.u(689, map, e0.f.u(688, map, e0.f.u(687, map, e0.f.u(686, map, e0.f.u(685, map, e0.f.u(683, map, e0.f.u(682, map, e0.f.u(681, map, e0.f.u(680, map, e0.f.u(679, map, e0.f.u(678, map, e0.f.u(677, map, e0.f.u(676, map, e0.f.u(675, map, e0.f.u(674, map, e0.f.u(673, map, e0.f.u(672, map, e0.f.u(670, map, arrayList12, 1, "NF"), 1, "BN"), 1, "NR"), 1, "PG"), 1, "TO"), 1, "SB"), 1, "VU"), 1, "FJ"), 1, "PW"), 1, "WF"), 1, "CK"), 1, "NU"), 1, "WS"), 1, "KI"), 1, "NC"), 1, "TV"), 1, "PF"), 1, "TK"), 1, "FM"), 1, "MH"), 1, "001"), 1, "001"), 1, "KP"), 1, "HK"), 1, "MO"), 1, "KH"), 1, "LA"), 1, "001"), 1, "001"), 1, "BD"), 1, "001"), 1, "001"), 1, "001"), 1, "TW"), 1, "001"), 1, "MV"), 1, "LB"), 1, "JO"), 1, "SY"), 1, "IQ"), 1, "KW"), 1, "SA"), 1, "YE"), 1, "OM"), 1, "PS"), 1, "AE"), 1, "IL"), 1, "BH"), 1, "QA"), 1, "BT"), 1, "MN"), 1, "NP"), 1, "001"), 1, "TJ"), 1, "TM"), 1, "AZ"), 1, "GE"), 1, "KG"), 1, "UZ"));
        return map;
    }

    public abstract void M(String str);

    public abstract void W(o00.i1 i1Var, Thread thread);

    public abstract void X(o00.i1 i1Var, o00.i1 i1Var2);

    public abstract boolean Y(o00.j1 j1Var, o00.i1 i1Var, o00.i1 i1Var2);

    public abstract o00.i1 Z(t1 t1Var);

    public abstract b1 a0(t1 t1Var);

    public abstract boolean b0(o00.j1 j1Var, Object obj, Object obj2);

    public boolean u(zw.a2 a2Var) {
        return true;
    }
}
