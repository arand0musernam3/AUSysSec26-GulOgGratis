package a3;

import android.content.res.ColorStateList;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.google.android.gms.internal.measurement.w5;
import com.google.android.gms.internal.measurement.ye;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements dd.e, td.h, w2.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f400d;

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e3 A[LOOP:1: B:27:0x00c1->B:33:0x00e3, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j(kotlin.ranges.IntRange r13, h2.q r14) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.j.<init>(kotlin.ranges.IntRange, h2.q):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f5, code lost:
    
        if (r11 == 1) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f8, code lost:
    
        if (r11 == 2) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01fa, code lost:
    
        r1 = r0.f7316a;
        r0 = r0.f7317b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0200, code lost:
    
        if (r10 == 1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0202, code lost:
    
        if (r10 == 2) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0204, code lost:
    
        r2 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0215, code lost:
    
        r2 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0218, code lost:
    
        r2 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x021b, code lost:
    
        r11 = new android.graphics.LinearGradient(r21, r22, r26, r27, r1, r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x021f, code lost:
    
        r11 = new android.graphics.SweepGradient(r8, r9, r0.f7316a, r0.f7317b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x022d, code lost:
    
        if (r25 <= 0.0f) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x022f, code lost:
    
        r1 = r0.f7316a;
        r0 = r0.f7317b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0236, code lost:
    
        if (r10 == 1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0239, code lost:
    
        if (r10 == 2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x023b, code lost:
    
        r2 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x024a, code lost:
    
        r2 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x024d, code lost:
    
        r2 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0250, code lost:
    
        r11 = new android.graphics.RadialGradient(r8, r9, r25, r1, r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x025c, code lost:
    
        return new a3.j(r11, (android.content.res.ColorStateList) null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0264, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01da, code lost:
    
        if (r13.size() <= 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01dc, code lost:
    
        r0 = new c5.p1(r13, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01e2, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e3, code lost:
    
        if (r0 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e7, code lost:
    
        if (r20 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e9, code lost:
    
        r0 = new c5.p1(r6, r5, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ef, code lost:
    
        r0 = new c5.p1(r6, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static a3.j g(android.content.res.Resources r30, int r31, android.content.res.Resources.Theme r32) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.j.g(android.content.res.Resources, int, android.content.res.Resources$Theme):a3.j");
    }

    @Override // w2.v
    public int a() {
        return ((w2.s1) this.f399c).d().f41928c.length();
    }

    @Override // w2.v
    public long b(long j9) {
        return ((w2.s1) this.f399c).e(j9);
    }

    @Override // w2.v
    public long c(long j9) {
        return ((w2.s1) this.f399c).f(j9);
    }

    @Override // dd.e
    public void d() {
        bd.a aVar = (bd.a) this.f399c;
        Drawable drawable = aVar.f6105b.getDrawable();
        zc.l lVar = (zc.l) this.f400d;
        boolean z11 = lVar instanceof zc.r;
        sc.a aVar2 = new sc.a(drawable, lVar.a(), lVar.b().f47487y, this.f398b, (z11 && ((zc.r) lVar).f47514g) ? false : true);
        if (z11) {
            aVar.b(aVar2);
        } else if (lVar instanceof zc.f) {
            aVar.b(aVar2);
        } else {
            e40.a.f();
        }
    }

    public void e(int i11, h2.x xVar) {
        if (i11 < 0) {
            c2.a.a("size should be >=0");
        }
        if (i11 == 0) {
            return;
        }
        h2.j jVar = new h2.j(this.f398b, i11, xVar);
        this.f398b += i11;
        ((o3.e) this.f399c).b(jVar);
    }

    public k30.c0 f(boolean z11) {
        k30.i iVar;
        k30.i iVar2;
        if (z11 && (iVar2 = (k30.i) this.f400d) != null) {
            throw iVar2.a();
        }
        k30.c0 c0VarB = k30.c0.b(this.f398b, (Object[]) this.f399c, this);
        if (!z11 || (iVar = (k30.i) this.f400d) == null) {
            return c0VarB;
        }
        throw iVar.a();
    }

    public void h(String str, Object... objArr) {
        if (this.f398b <= 3) {
            String str2 = (String) this.f399c;
            if (objArr.length > 0) {
                str = String.format(Locale.US, str, objArr);
            }
            Log.d(str2, ((String) this.f400d).concat(str));
        }
    }

    public boolean i() {
        o3.e eVar = (o3.e) this.f400d;
        int i11 = this.f398b - 1;
        this.f398b = i11;
        if (i11 == 0 && eVar.f31832c != 0) {
            w2.s1 s1Var = (w2.s1) this.f399c;
            v2.h hVar = s1Var.f43043a;
            y2.c cVar = y2.c.MergeIfPossible;
            hVar.f41936b.a().m();
            v2.a aVar = hVar.f41936b;
            Object[] objArr = eVar.f31830a;
            int i12 = eVar.f31832c;
            for (int i13 = 0; i13 < i12; i13++) {
                ((Function1) objArr[i13]).invoke(aVar);
            }
            s1Var.l(aVar);
            v2.h.a(hVar, false, cVar);
            eVar.g();
        }
        return this.f398b > 0;
    }

    public h2.j j(int i11) {
        if (i11 < 0 || i11 >= this.f398b) {
            StringBuilder sbK = org.bouncycastle.jcajce.provider.asymmetric.a.k(i11, "Index ", ", size ");
            sbK.append(this.f398b);
            c2.a.e(sbK.toString());
        }
        h2.j jVar = (h2.j) this.f400d;
        if (jVar != null) {
            int i12 = jVar.f21139a;
            if (i11 < jVar.f21140b + i12 && i12 <= i11) {
                return jVar;
            }
        }
        o3.e eVar = (o3.e) this.f399c;
        h2.j jVar2 = (h2.j) eVar.f31830a[h2.q.e(i11, eVar)];
        this.f400d = jVar2;
        return jVar2;
    }

    public int k(Object obj) {
        q1.n0 n0Var = (q1.n0) this.f399c;
        int iA = n0Var.a(obj);
        if (iA >= 0) {
            return n0Var.f35870c[iA];
        }
        return -1;
    }

    public Object l(int i11) {
        Object[] objArr = (Object[]) this.f400d;
        int i12 = i11 - this.f398b;
        if (i12 < 0 || i12 >= objArr.length) {
            return null;
        }
        return objArr[i12];
    }

    public String m() {
        StringBuilder sb2 = new StringBuilder("$");
        int i11 = this.f398b + 1;
        for (int i12 = 0; i12 < i11; i12++) {
            Object obj = ((Object[]) this.f399c)[i12];
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                boolean zAreEqual = Intrinsics.areEqual(serialDescriptor.getKind(), k90.j.f26241k);
                int[] iArr = (int[]) this.f400d;
                if (!zAreEqual) {
                    int i13 = iArr[i12];
                    if (i13 >= 0) {
                        sb2.append(".");
                        sb2.append(serialDescriptor.f(i13));
                    }
                } else if (iArr[i12] != -1) {
                    sb2.append("[");
                    sb2.append(((int[]) this.f400d)[i12]);
                    sb2.append("]");
                }
            } else if (obj != o90.l.f32174a) {
                sb2.append("['");
                sb2.append(obj);
                sb2.append("']");
            }
        }
        return sb2.toString();
    }

    public void n(int i11, int i12, int i13, int i14, int i15, int i16, boolean z11, boolean z12, boolean z13, int i17) {
        long[] jArr = (long[]) this.f399c;
        int i18 = this.f398b;
        int i19 = i18 + 3;
        this.f398b = i19;
        int length = jArr.length;
        if (length <= i19) {
            int iMax = Math.max(length * 2, i19);
            this.f399c = Arrays.copyOf(jArr, iMax);
            this.f400d = Arrays.copyOf((long[]) this.f400d, iMax);
        }
        long[] jArr2 = (long[]) this.f399c;
        jArr2[i18] = (((long) i12) << 32) | (((long) i13) & 4294967295L);
        jArr2[i18 + 1] = (((long) i14) << 32) | (((long) i15) & 4294967295L);
        int i21 = i16 & 33554431;
        jArr2[i18 + 2] = ((z13 ? 1L : 0L) << 63) | ((z12 ? 1L : 0L) << 62) | ((z11 ? 1L : 0L) << 61) | (((long) 1) << 60) | (((long) Math.min(0, 1023)) << 50) | (((long) i21) << 25) | ((long) (i11 & 33554431));
        if (i16 < 0) {
            return;
        }
        for (int i22 = i17 != -1 ? i17 : i18 - 3; i22 >= 0; i22 -= 3) {
            int i23 = i22 + 2;
            long j9 = jArr2[i23];
            if ((((int) j9) & 33554431) == i21) {
                jArr2[i23] = (j9 & k5.a.f25955a) | (((long) Math.min((i18 - i22) / 3, 1023)) << 50);
                return;
            }
        }
    }

    @Override // td.h
    public void onError() {
        ImageView imageView = (ImageView) this.f399c;
        Integer numValueOf = Integer.valueOf(this.f398b);
        fd.t tVarA = fd.w.a(imageView.getContext());
        td.e eVar = new td.e(imageView.getContext());
        eVar.f39959c = numValueOf;
        td.k.b(eVar, imageView);
        tVarA.a(eVar.a());
        td.e eVar2 = (td.e) this.f400d;
        yd.b[] bVarArr = {new yd.a()};
        fd.j jVar = td.j.f40016a;
        td.j.a(eVar2, kotlin.collections.y.T(bVarArr));
    }

    public boolean p() {
        ColorStateList colorStateList;
        return ((Shader) this.f399c) == null && (colorStateList = (ColorStateList) this.f400d) != null && colorStateList.isStateful();
    }

    public void q(Object obj, Object obj2) {
        int i11 = (this.f398b + 1) * 2;
        Object[] objArr = (Object[]) this.f399c;
        if (i11 > objArr.length) {
            this.f399c = Arrays.copyOf(objArr, k30.a.d(objArr.length, i11));
        }
        ex.i.l(obj, obj2);
        Object[] objArr2 = (Object[]) this.f399c;
        int i12 = this.f398b;
        int i13 = i12 * 2;
        objArr2[i13] = obj;
        objArr2[i13 + 1] = obj2;
        this.f398b = i12 + 1;
    }

    public void r(k30.c0 c0Var) {
        k30.m mVarEntrySet = c0Var.entrySet();
        int size = (mVarEntrySet.size() + this.f398b) * 2;
        Object[] objArr = (Object[]) this.f399c;
        if (size > objArr.length) {
            this.f399c = Arrays.copyOf(objArr, k30.a.d(objArr.length, size));
        }
        j00.g it = ((k30.z) mVarEntrySet).iterator();
        while (true) {
            k30.d dVar = (k30.d) it;
            if (!dVar.hasNext()) {
                return;
            }
            Map.Entry entry = (Map.Entry) dVar.next();
            q(entry.getKey(), entry.getValue());
        }
    }

    public void s() {
        int i11 = this.f398b * 2;
        this.f399c = Arrays.copyOf((Object[]) this.f399c, i11);
        int[] iArr = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i12] = -1;
        }
        kotlin.collections.x.j(0, (int[]) this.f400d, 0, 14, iArr);
        this.f400d = iArr;
    }

    public void t(int i11, boolean z11) {
        int i12 = i11 & 33554431;
        long[] jArr = (long[]) this.f399c;
        int i13 = this.f398b;
        for (int i14 = 0; i14 < jArr.length - 2 && i14 < i13; i14 += 3) {
            int i15 = i14 + 2;
            long j9 = jArr[i15];
            if ((((int) j9) & 33554431) == i12) {
                long j11 = z11 ? 1L : 0L;
                jArr[i15] = (j11 * Long.MIN_VALUE) | (8070450532247928831L & j9) | (1152921504606846976L * j11);
                return;
            }
        }
    }

    public String toString() {
        switch (this.f397a) {
            case 7:
                return m();
            case 12:
                StringBuilder sb2 = new StringBuilder();
                if (((q90.f0) this.f399c) == q90.f0.HTTP_1_0) {
                    sb2.append("HTTP/1.0");
                } else {
                    sb2.append("HTTP/1.1");
                }
                sb2.append(' ');
                sb2.append(this.f398b);
                sb2.append(' ');
                sb2.append((String) this.f400d);
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public void u(int i11, int i12, long j9) {
        int i13;
        char c3;
        char c7;
        long[] jArr = (long[]) this.f399c;
        long[] jArr2 = (long[]) this.f400d;
        jArr2[0] = j9;
        int i14 = 1;
        while (i14 > 0) {
            i14--;
            long j11 = jArr2[i14];
            int i15 = 33554431;
            int i16 = ((int) j11) & 33554431;
            char c8 = 25;
            int i17 = ((int) (j11 >> 25)) & 33554431;
            char c11 = '2';
            int i18 = ((int) (j11 >> 50)) & 1023;
            int i19 = i18 == 1023 ? this.f398b : (i18 * 3) + i17;
            if (i17 < 0) {
                return;
            }
            while (i17 < jArr.length - 2 && i17 < i19) {
                int i21 = i17 + 2;
                long j12 = jArr[i21];
                if ((((int) (j12 >> c8)) & i15) == i16) {
                    long j13 = jArr[i17];
                    int i22 = i17 + 1;
                    i13 = i15;
                    c3 = c8;
                    long j14 = jArr[i22];
                    c7 = c11;
                    jArr[i17] = (((long) (((int) j13) + i12)) & 4294967295L) | (((long) (((int) (j13 >> 32)) + i11)) << 32);
                    jArr[i22] = (((long) (((int) j14) + i12)) & 4294967295L) | (((long) (((int) (j14 >> 32)) + i11)) << 32);
                    jArr[i21] = (((j12 >> 63) & 1) << 60) | j12;
                    if ((((int) (j12 >> c7)) & 1023) > 0) {
                        jArr2[i14] = (k5.a.f25956b & j12) | (((long) ((i17 + 3) & i13)) << c3);
                        i14++;
                    }
                } else {
                    i13 = i15;
                    c3 = c8;
                    c7 = c11;
                }
                i17 += 3;
                i15 = i13;
                c8 = c3;
                c11 = c7;
            }
        }
    }

    public void v(int i11, i80.o oVar) {
        int i12 = i11 & 33554431;
        long[] jArr = (long[]) this.f399c;
        int i13 = this.f398b;
        for (int i14 = 0; i14 < jArr.length - 2 && i14 < i13; i14 += 3) {
            if ((((int) jArr[i14 + 2]) & 33554431) == i12) {
                long j9 = jArr[i14];
                long j11 = jArr[i14 + 1];
                oVar.invoke(Integer.valueOf((int) (j9 >> 32)), Integer.valueOf((int) j9), Integer.valueOf((int) (j11 >> 32)), Integer.valueOf((int) j11));
                return;
            }
        }
    }

    public void w(String str, qz.i iVar) {
        Map map = (Map) this.f399c;
        if (map.containsKey(str)) {
            i4.a.f(e0.f.n(new StringBuilder(str.length() + 59), "LifecycleCallback with tag ", str, " already added to this fragment."));
            return;
        }
        map.put(str, iVar);
        if (this.f398b > 0) {
            new w5(Looper.getMainLooper(), 3).post(new ye(5, this, iVar, str, false));
        }
    }

    public void x(Bundle bundle) {
        this.f398b = 1;
        this.f400d = bundle;
        for (Map.Entry entry : ((Map) this.f399c).entrySet()) {
            ((qz.i) entry.getValue()).d(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public void y(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : ((Map) this.f399c).entrySet()) {
            Bundle bundle2 = new Bundle();
            ((qz.i) entry.getValue()).f(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    public j(String str, String[] strArr) {
        String string;
        this.f397a = 11;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(MessageLogView.COMMA_SEPARATOR);
                }
                sb2.append(str2);
            }
            sb2.append("] ");
            string = sb2.toString();
        }
        this.f400d = string;
        this.f399c = str;
        com.google.android.gms.common.internal.i0.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        int i11 = 2;
        while (i11 <= 7 && !Log.isLoggable((String) this.f399c, i11)) {
            i11++;
        }
        this.f398b = i11;
    }

    public j(bd.a aVar, zc.l lVar, int i11) {
        this.f397a = 1;
        this.f399c = aVar;
        this.f400d = lVar;
        this.f398b = i11;
        if (i11 > 0) {
            return;
        }
        i4.a.f("durationMillis must be > 0.");
        throw null;
    }

    public j(q90.f0 f0Var, int i11, String str) {
        this.f397a = 12;
        f0Var.getClass();
        this.f399c = f0Var;
        this.f398b = i11;
        this.f400d = str;
    }

    public j(ArrayList arrayList, int i11, MotionEvent motionEvent) {
        this.f397a = 10;
        this.f399c = arrayList;
        this.f398b = i11;
        this.f400d = motionEvent;
        if (arrayList.isEmpty()) {
            i4.a.f("changes cannot be empty");
            throw null;
        }
    }

    public /* synthetic */ j(int i11, char c3) {
        this.f397a = i11;
    }

    public j(Shader shader, ColorStateList colorStateList, int i11) {
        this.f397a = 14;
        this.f399c = shader;
        this.f400d = colorStateList;
        this.f398b = i11;
    }

    public j(w2.s1 s1Var) {
        this.f397a = 13;
        this.f399c = s1Var;
        this.f400d = new o3.e(new Function1[16], 0);
    }

    public j(int i11, byte b8) {
        this.f397a = i11;
        switch (i11) {
            case 9:
                this.f399c = Collections.synchronizedMap(new q1.e(0));
                this.f398b = 0;
                break;
            default:
                this.f399c = new o3.e(new h2.j[16], 0);
                break;
        }
    }

    public j(c5.u3 u3Var) {
        this.f397a = 0;
        this.f399c = u3Var;
    }

    public j(int i11) {
        this.f397a = 4;
        this.f399c = new Object[i11 * 2];
        this.f398b = 0;
    }

    public j(ImageView imageView, int i11, td.e eVar) {
        this.f397a = 6;
        this.f399c = imageView;
        this.f398b = i11;
        this.f400d = eVar;
    }
}
