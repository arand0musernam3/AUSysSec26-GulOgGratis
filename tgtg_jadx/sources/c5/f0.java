package c5;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import com.app.tgtg.R;
import com.google.android.gms.internal.measurement.cg;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends h7.b implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public static final q1.f0 L;
    public final q1.e0 A;
    public final String B;
    public final String C;
    public final t5.a D;
    public final q1.g0 E;
    public e3 F;
    public boolean G;
    public final q1.e0 H;
    public final al.u I;
    public final ArrayList J;
    public final e0 K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f7192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7193b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f7194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AccessibilityManager f7195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f7196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f7197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f7198g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a0 f7199h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7200i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f7201j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public AccessibilityNodeInfoCompat f7202k;
    public AccessibilityNodeInfoCompat l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f7203m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final q1.g0 f7204n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final q1.g0 f7205o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q1.l1 f7206p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final q1.l1 f7207q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f7208r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Integer f7209s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q1.f f7210t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final x80.i f7211u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f7212v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public b0 f7213w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public q1.g0 f7214x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final q1.h0 f7215y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final q1.e0 f7216z;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        q1.f0 f0Var = q1.n.f35794a;
        q1.f0 f0Var2 = new q1.f0(32);
        int i11 = f0Var2.f35790b;
        if (i11 < 0) {
            org.bouncycastle.jce.provider.a.v("");
            return;
        }
        int i12 = i11 + 32;
        f0Var2.d(i12);
        int[] iArr2 = f0Var2.f35789a;
        int i13 = f0Var2.f35790b;
        if (i11 != i13) {
            kotlin.collections.x.f(i12, iArr2, i11, i13, iArr2);
        }
        kotlin.collections.x.j(i11, iArr, 0, 12, iArr2);
        f0Var2.f35790b += 32;
        L = f0Var2;
    }

    public f0(y yVar) {
        this.f7192a = yVar;
        int i11 = 0;
        this.f7194c = new e0(this, i11);
        Object systemService = yVar.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.f7195d = (AccessibilityManager) systemService;
        this.f7196e = 100L;
        this.f7198g = new Handler(Looper.getMainLooper());
        this.f7199h = new a0(this, i11);
        this.f7200i = Integer.MIN_VALUE;
        this.f7201j = Integer.MIN_VALUE;
        this.f7204n = new q1.g0();
        this.f7205o = new q1.g0();
        this.f7206p = new q1.l1(0);
        this.f7207q = new q1.l1(0);
        this.f7208r = -1;
        this.f7210t = new q1.f(0);
        this.f7211u = cg.a(1, null, null, 6);
        this.f7212v = true;
        q1.g0 g0Var = q1.p.f35804a;
        g0Var.getClass();
        this.f7214x = g0Var;
        this.f7215y = new q1.h0();
        this.f7216z = new q1.e0();
        this.A = new q1.e0();
        this.B = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.C = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.D = new t5.a(5);
        this.E = new q1.g0();
        this.F = new e3(yVar.getSemanticsOwner().a(), g0Var);
        int i12 = q1.k.f35778a;
        this.H = new q1.e0();
        yVar.addOnAttachStateChangeListener(this);
        this.I = new al.u(this, 19);
        this.J = new ArrayList();
        this.K = new e0(this, 1);
    }

    public static Rect D(i4.g0 g0Var, float f11, float f12) {
        if (!(g0Var instanceof i4.n0) && !(g0Var instanceof i4.o0)) {
            return null;
        }
        h4.c cVarO = g0Var.o();
        return new Rect((int) (cVarO.f21380a + f11), (int) (cVarO.f21381b + f12), (int) (cVarO.f21382c + f11), (int) (cVarO.f21383d + f12));
    }

    public static float[] F(i4.g0 g0Var) {
        if (!(g0Var instanceof i4.o0)) {
            return null;
        }
        h4.d dVar = ((i4.o0) g0Var).f23274f;
        long j9 = dVar.f21391h;
        long j11 = dVar.f21390g;
        long j12 = dVar.f21389f;
        long j13 = dVar.f21388e;
        return new float[]{Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j13 & 4294967295L)), Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L)), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)), Float.intBitsToFloat((int) (j9 >> 32)), Float.intBitsToFloat((int) (j9 & 4294967295L))};
    }

    public static Region G(i4.g0 g0Var, float f11, float f12) {
        if (!(g0Var instanceof i4.m0)) {
            return null;
        }
        i4.m0 m0Var = (i4.m0) g0Var;
        h4.c cVarJ = m0Var.o().j(f11, f12);
        Region region = new Region(new Rect((int) (cVarJ.f21380a + 0.0f), (int) (cVarJ.f21381b + 0.0f), (int) (cVarJ.f21382c + 0.0f), (int) (cVarJ.f21383d + 0.0f)));
        Region region2 = new Region();
        i4.h hVar = m0Var.f23270f;
        if (!(hVar instanceof i4.h)) {
            com.braze.h2.a("Unable to obtain android.graphics.Path");
            return null;
        }
        Path path = hVar.f23258a;
        path.offset(f11, f12);
        region2.setPath(path, region);
        return region2;
    }

    public static CharSequence H(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i11 = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i11 = 99999;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, i11);
                charSequenceSubSequence.getClass();
                return charSequenceSubSequence;
            }
        }
        return charSequence;
    }

    public static String k(j5.t tVar) {
        m5.h hVar;
        if (tVar != null) {
            j5.n nVar = tVar.f24696d;
            q1.t0 t0Var = nVar.f24682a;
            j5.a0 a0Var = j5.x.f24707a;
            if (t0Var.b(a0Var)) {
                return b6.b.a((List) nVar.e(a0Var), MessageLogView.COMMA_SEPARATOR, null, 62);
            }
            j5.a0 a0Var2 = j5.x.F;
            if (t0Var.b(a0Var2)) {
                m5.h hVar2 = (m5.h) j5.w.d(nVar, a0Var2);
                if (hVar2 != null) {
                    return hVar2.f29538b;
                }
            } else {
                List list = (List) j5.w.d(nVar, j5.x.B);
                if (list != null && (hVar = (m5.h) CollectionsKt.firstOrNull(list)) != null) {
                    return hVar.f29538b;
                }
            }
        }
        return null;
    }

    public static final boolean p(j5.k kVar, float f11) {
        Function0 function0 = kVar.f24633a;
        if (f11 >= 0.0f || ((Number) function0.invoke()).floatValue() <= 0.0f) {
            return f11 > 0.0f && ((Number) function0.invoke()).floatValue() < ((Number) kVar.f24634b.invoke()).floatValue();
        }
        return true;
    }

    public static final boolean q(j5.k kVar) {
        Function0 function0 = kVar.f24633a;
        boolean z11 = kVar.f24635c;
        if (((Number) function0.invoke()).floatValue() <= 0.0f || z11) {
            return ((Number) function0.invoke()).floatValue() < ((Number) kVar.f24634b.invoke()).floatValue() && z11;
        }
        return true;
    }

    public static final boolean r(j5.k kVar) {
        Function0 function0 = kVar.f24633a;
        boolean z11 = kVar.f24635c;
        if (((Number) function0.invoke()).floatValue() >= ((Number) kVar.f24634b.invoke()).floatValue() || z11) {
            return ((Number) function0.invoke()).floatValue() > 0.0f && z11;
        }
        return true;
    }

    public static /* synthetic */ void w(f0 f0Var, int i11, int i12, Integer num, int i13) {
        if ((i13 & 4) != 0) {
            num = null;
        }
        f0Var.v(i11, i12, num, null);
    }

    public final void A(b5.m0 m0Var, q1.h0 h0Var) {
        j5.n nVarY;
        b5.m0 m0VarC;
        if (m0Var.I() && !this.f7192a.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(m0Var)) {
            if (!m0Var.G.d(8)) {
                m0Var = h0.c(m0Var, s.f7364e);
            }
            if (m0Var == null || (nVarY = m0Var.y()) == null) {
                return;
            }
            if (!nVarY.f24684c && (m0VarC = h0.c(m0Var, s.f7363d)) != null) {
                m0Var = m0VarC;
            }
            int i11 = m0Var.f5866b;
            if (h0Var.b(i11)) {
                w(this, s(i11), NewHope.SENDB_BYTES, 1, 8);
            }
        }
    }

    public final void B(b5.m0 m0Var) {
        if (m0Var.I() && !this.f7192a.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(m0Var)) {
            int i11 = m0Var.f5866b;
            j5.k kVar = (j5.k) this.f7204n.b(i11);
            j5.k kVar2 = (j5.k) this.f7205o.b(i11);
            if (kVar == null && kVar2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventF = f(i11, 4096);
            if (kVar != null) {
                accessibilityEventF.setScrollX((int) ((Number) kVar.f24633a.invoke()).floatValue());
                accessibilityEventF.setMaxScrollX((int) ((Number) kVar.f24634b.invoke()).floatValue());
            }
            if (kVar2 != null) {
                accessibilityEventF.setScrollY((int) ((Number) kVar2.f24633a.invoke()).floatValue());
                accessibilityEventF.setMaxScrollY((int) ((Number) kVar2.f24634b.invoke()).floatValue());
            }
            u(accessibilityEventF);
        }
    }

    public final boolean C(j5.t tVar, int i11, int i12, boolean z11) {
        String strK;
        j5.n nVar = tVar.f24696d;
        int i13 = tVar.f24699g;
        j5.a0 a0Var = j5.m.f24666j;
        if (nVar.f24682a.b(a0Var) && h0.a(tVar)) {
            i80.n nVar2 = (i80.n) ((j5.a) tVar.f24696d.e(a0Var)).f24610b;
            if (nVar2 != null) {
                return ((Boolean) nVar2.invoke(Integer.valueOf(i11), Integer.valueOf(i12), Boolean.valueOf(z11))).booleanValue();
            }
        } else if ((i11 != i12 || i12 != this.f7208r) && (strK = k(tVar)) != null) {
            if (i11 < 0 || i11 != i12 || i12 > strK.length()) {
                i11 = -1;
            }
            this.f7208r = i11;
            boolean z12 = strK.length() > 0;
            u(g(s(i13), z12 ? Integer.valueOf(this.f7208r) : null, z12 ? Integer.valueOf(this.f7208r) : null, z12 ? Integer.valueOf(strK.length()) : null, strK));
            y(i13);
            return true;
        }
        return false;
    }

    public final Rect E(float f11, float f12, float f13, float f14) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f12)) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32);
        y yVar = this.f7192a;
        long jT = yVar.t(jFloatToRawIntBits);
        long jT2 = yVar.t((((long) Float.floatToRawIntBits(f14)) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32));
        int i11 = (int) (jT >> 32);
        int i12 = (int) (jT2 >> 32);
        int i13 = (int) (jT & 4294967295L);
        int i14 = (int) (jT2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12))), (int) Math.floor(Math.min(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0139, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0143, code lost:
    
        if (((r7 & ((~r7) << 6)) & r20) == 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0145, code lost:
    
        r25 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I() {
        /*
            Method dump skipped, instruction units count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.f0.I():void");
    }

    public final void a(int i11, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str, Bundle bundle) {
        j5.t tVar;
        i4.v0 v0Var;
        int i12;
        y yVar;
        j5.u uVar = (j5.u) j().b(i11);
        if (uVar == null || (tVar = uVar.f24700a) == null) {
            return;
        }
        b5.m0 m0Var = tVar.f24695c;
        j5.n nVar = tVar.f24696d;
        q1.t0 t0Var = nVar.f24682a;
        String strK = k(tVar);
        if (Intrinsics.areEqual(str, this.B)) {
            int iB = this.f7216z.b(i11);
            if (iB != -1) {
                accessibilityNodeInfoCompat.t().putInt(str, iB);
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(str, this.C)) {
            int iB2 = this.A.b(i11);
            if (iB2 != -1) {
                accessibilityNodeInfoCompat.t().putInt(str, iB2);
                return;
            }
            return;
        }
        boolean zB = t0Var.b(j5.m.f24657a);
        y yVar2 = this.f7192a;
        if (zB && bundle != null && Intrinsics.areEqual(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i13 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i14 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i14 > 0 && i13 >= 0) {
                if (i13 < (strK != null ? strK.length() : Integer.MAX_VALUE)) {
                    m5.q0 q0VarD = d2.d(nVar);
                    if (q0VarD == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    int i15 = 0;
                    while (i15 < i14) {
                        int i16 = i13 + i15;
                        RectF rectF = null;
                        if (i16 >= q0VarD.f29617a.f29603a.f29538b.length()) {
                            arrayList.add(null);
                            i12 = i15;
                            yVar = yVar2;
                        } else {
                            h4.c cVarB = q0VarD.b(i16);
                            b5.s1 s1VarD = tVar.d();
                            long jS = 0;
                            if (s1VarD != null) {
                                if (!s1VarD.n()) {
                                    s1VarD = null;
                                }
                                if (s1VarD != null) {
                                    jS = s1VarD.S(0L);
                                }
                            }
                            h4.c cVarK = cVarB.k(jS);
                            h4.c cVarG = tVar.g();
                            h4.c cVarG2 = cVarK.i(cVarG) ? cVarK.g(cVarG) : null;
                            if (cVarG2 != null) {
                                long jT = yVar2.t((((long) Float.floatToRawIntBits(cVarG2.f21381b)) & 4294967295L) | (((long) Float.floatToRawIntBits(cVarG2.f21380a)) << 32));
                                long jT2 = yVar2.t((((long) Float.floatToRawIntBits(cVarG2.f21383d)) & 4294967295L) | (((long) Float.floatToRawIntBits(cVarG2.f21382c)) << 32));
                                int i17 = (int) (jT >> 32);
                                int i18 = i15;
                                int i19 = (int) (jT2 >> 32);
                                y yVar3 = yVar2;
                                int i21 = (int) (jT & 4294967295L);
                                yVar = yVar3;
                                i12 = i18;
                                int i22 = (int) (jT2 & 4294967295L);
                                rectF = new RectF(Math.min(Float.intBitsToFloat(i17), Float.intBitsToFloat(i19)), Math.min(Float.intBitsToFloat(i21), Float.intBitsToFloat(i22)), Math.max(Float.intBitsToFloat(i17), Float.intBitsToFloat(i19)), Math.max(Float.intBitsToFloat(i21), Float.intBitsToFloat(i22)));
                            } else {
                                i12 = i15;
                                yVar = yVar2;
                            }
                            arrayList.add(rectF);
                        }
                        i15 = i12 + 1;
                        yVar2 = yVar;
                    }
                    accessibilityNodeInfoCompat.t().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        j5.a0 a0Var = j5.x.f24731z;
        if (t0Var.b(a0Var) && bundle != null && Intrinsics.areEqual(str, "androidx.compose.ui.semantics.testTag")) {
            String str2 = (String) j5.w.d(nVar, a0Var);
            if (str2 != null) {
                accessibilityNodeInfoCompat.t().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfoCompat.t().putInt(str, tVar.f24699g);
            return;
        }
        if (Intrinsics.areEqual(str, "androidx.compose.ui.semantics.shapeType")) {
            i4.v0 v0Var2 = (i4.v0) j5.w.d(nVar, j5.x.P);
            if (v0Var2 != null) {
                Rect rect = new Rect();
                accessibilityNodeInfoCompat.l(rect);
                h4.c cVarL = l(tVar, rect, v0Var2);
                float f11 = cVarL.f21381b;
                float f12 = cVarL.f21380a;
                i4.g0 g0VarA = v0Var2.a(cVarL.e(), m0Var.A, yVar2.getDensity());
                if (g0VarA instanceof i4.n0) {
                    accessibilityNodeInfoCompat.t().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfoCompat.t().putParcelable("androidx.compose.ui.semantics.shapeRect", D(g0VarA, f12, f11));
                    return;
                } else if (g0VarA instanceof i4.o0) {
                    accessibilityNodeInfoCompat.t().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfoCompat.t().putParcelable("androidx.compose.ui.semantics.shapeRect", D(g0VarA, f12, f11));
                    accessibilityNodeInfoCompat.t().putFloatArray("androidx.compose.ui.semantics.shapeCorners", F(g0VarA));
                    return;
                } else if (!(g0VarA instanceof i4.m0)) {
                    e40.a.f();
                    return;
                } else {
                    accessibilityNodeInfoCompat.t().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfoCompat.t().putParcelable("androidx.compose.ui.semantics.shapeRegion", G(g0VarA, f12, f11));
                    return;
                }
            }
            return;
        }
        if (Intrinsics.areEqual(str, "androidx.compose.ui.semantics.shapeRect")) {
            i4.v0 v0Var3 = (i4.v0) j5.w.d(nVar, j5.x.P);
            if (v0Var3 != null) {
                Rect rect2 = new Rect();
                accessibilityNodeInfoCompat.l(rect2);
                h4.c cVarL2 = l(tVar, rect2, v0Var3);
                Rect rectD = D(v0Var3.a(cVarL2.e(), m0Var.A, yVar2.getDensity()), cVarL2.f21380a, cVarL2.f21381b);
                if (rectD != null) {
                    accessibilityNodeInfoCompat.t().putParcelable("androidx.compose.ui.semantics.shapeRect", rectD);
                    return;
                }
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(str, "androidx.compose.ui.semantics.shapeCorners")) {
            i4.v0 v0Var4 = (i4.v0) j5.w.d(nVar, j5.x.P);
            if (v0Var4 != null) {
                Rect rect3 = new Rect();
                accessibilityNodeInfoCompat.l(rect3);
                float[] fArrF = F(v0Var4.a(l(tVar, rect3, v0Var4).e(), m0Var.A, yVar2.getDensity()));
                if (fArrF != null) {
                    accessibilityNodeInfoCompat.t().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrF);
                    return;
                }
                return;
            }
            return;
        }
        if (!Intrinsics.areEqual(str, "androidx.compose.ui.semantics.shapeRegion") || (v0Var = (i4.v0) j5.w.d(nVar, j5.x.P)) == null) {
            return;
        }
        Rect rect4 = new Rect();
        accessibilityNodeInfoCompat.l(rect4);
        h4.c cVarL3 = l(tVar, rect4, v0Var);
        Region regionG = G(v0Var.a(cVarL3.e(), m0Var.A, yVar2.getDensity()), cVarL3.f21380a, cVarL3.f21381b);
        if (regionG != null) {
            accessibilityNodeInfoCompat.t().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionG);
        }
    }

    public final Rect b(j5.u uVar) {
        z5.k kVar = uVar.f24701b;
        return E(kVar.f47282a, kVar.f47283b, kVar.f47284c, kVar.f47285d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f1, code lost:
    
        if (v80.f0.o(r5, r2) == r3) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:13:0x0030, B:24:0x005c, B:28:0x006e, B:30:0x0076, B:32:0x007f, B:34:0x0084, B:35:0x0093, B:37:0x009c, B:20:0x0046, B:23:0x004d), top: B:57:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00f1 -> B:50:0x00f4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(z70.c r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.f0.c(z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(int r24, long r25, boolean r27) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.f0.d(int, long, boolean):boolean");
    }

    public final void e() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (m()) {
                t(this.f7192a.getSemanticsOwner().a(), this.F);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                z(j());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    I();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final AccessibilityEvent f(int i11, int i12) {
        j5.u uVar;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i12);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        y yVar = this.f7192a;
        accessibilityEventObtain.setPackageName(yVar.getContext().getPackageName());
        accessibilityEventObtain.setSource(yVar, i11);
        if (m() && (uVar = (j5.u) j().b(i11)) != null) {
            j5.t tVar = uVar.f24700a;
            accessibilityEventObtain.setPassword(tVar.f24696d.f24682a.b(j5.x.K));
            boolean zAreEqual = Intrinsics.areEqual(j5.w.d(tVar.f24696d, j5.x.f24719n), Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                h7.i0.u(accessibilityEventObtain, zAreEqual);
            }
        }
        return accessibilityEventObtain;
    }

    public final AccessibilityEvent g(int i11, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventF = f(i11, 8192);
        if (num != null) {
            accessibilityEventF.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventF.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventF.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventF.getText().add(charSequence);
        }
        return accessibilityEventF;
    }

    @Override // h7.b
    public final AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view) {
        return this.f7199h;
    }

    public final int h(j5.t tVar) {
        j5.n nVar = tVar.f24696d;
        if (!nVar.f24682a.b(j5.x.f24707a)) {
            j5.a0 a0Var = j5.x.G;
            if (nVar.f24682a.b(a0Var)) {
                return (int) (((m5.t0) nVar.e(a0Var)).f29650a & 4294967295L);
            }
        }
        return this.f7208r;
    }

    public final int i(j5.t tVar) {
        j5.n nVar = tVar.f24696d;
        if (!nVar.f24682a.b(j5.x.f24707a)) {
            j5.a0 a0Var = j5.x.G;
            if (nVar.f24682a.b(a0Var)) {
                return (int) (((m5.t0) nVar.e(a0Var)).f29650a >> 32);
            }
        }
        return this.f7208r;
    }

    public final q1.o j() {
        if (this.f7212v) {
            this.f7212v = false;
            y yVar = this.f7192a;
            this.f7214x = j5.w.b(yVar.getSemanticsOwner(), s.f7362c);
            if (m()) {
                q1.g0 g0Var = this.f7214x;
                Resources resources = yVar.getContext().getResources();
                q1.e0 e0Var = this.f7216z;
                e0Var.c();
                q1.e0 e0Var2 = this.A;
                e0Var2.c();
                j5.u uVar = (j5.u) g0Var.b(-1);
                j5.t tVar = uVar != null ? uVar.f24700a : null;
                tVar.getClass();
                ArrayList arrayListB = j5.c0.b(tVar, new androidx.fragment.app.r(g0Var, 4), new androidx.fragment.app.r(resources, 5), kotlin.collections.c0.c(tVar));
                int i11 = 1;
                int size = arrayListB.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i12 = ((j5.t) arrayListB.get(i11 - 1)).f24699g;
                        int i13 = ((j5.t) arrayListB.get(i11)).f24699g;
                        e0Var.f(i12, i13);
                        e0Var2.f(i13, i12);
                        if (i11 == size) {
                            break;
                        }
                        i11++;
                    }
                }
            }
        }
        return this.f7214x;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0081 A[LOOP:0: B:5:0x0018->B:37:0x0081, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086 A[EDGE_INSN: B:50:0x0086->B:38:0x0086 BREAK  A[LOOP:0: B:5:0x0018->B:37:0x0081], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final h4.c l(j5.t r10, android.graphics.Rect r11, i4.v0 r12) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.f0.l(j5.t, android.graphics.Rect, i4.v0):h4.c");
    }

    public final boolean m() {
        AccessibilityManager accessibilityManager = this.f7195d;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.f7197f;
        if (enabledAccessibilityServiceList == null) {
            enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.f7197f = enabledAccessibilityServiceList;
        }
        return !enabledAccessibilityServiceList.isEmpty();
    }

    public final boolean n() {
        if (Intrinsics.areEqual((Object) null, Boolean.TRUE)) {
            return true;
        }
        if (Intrinsics.areEqual((Object) null, Boolean.FALSE)) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return h7.i0.s(this.f7195d);
        }
        return true;
    }

    public final void o(b5.m0 m0Var) {
        if (this.f7210t.add(m0Var)) {
            this.f7211u.h(Unit.f26487a);
        }
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z11) {
        this.f7197f = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z11) {
        this.f7197f = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.f7195d;
        if (accessibilityManager.isEnabled()) {
            this.f7197f = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f7198g.removeCallbacks(this.I);
        AccessibilityManager accessibilityManager = this.f7195d;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    public final int s(int i11) {
        if (i11 == this.f7192a.getSemanticsOwner().a().f24699g) {
            return -1;
        }
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(j5.t r20, c5.e3 r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            int[] r3 = q1.r.f35817a
            q1.h0 r3 = new q1.h0
            r3.<init>()
            r4 = 4
            java.util.List r5 = j5.t.j(r4, r1)
            b5.m0 r6 = r1.f24695c
            int r7 = r5.size()
            r8 = 0
            r9 = r8
        L1a:
            if (r9 >= r7) goto L40
            java.lang.Object r10 = r5.get(r9)
            j5.t r10 = (j5.t) r10
            q1.o r11 = r0.j()
            int r10 = r10.f24699g
            boolean r11 = r11.a(r10)
            if (r11 == 0) goto L3d
            q1.h0 r11 = r2.f7185b
            boolean r11 = r11.a(r10)
            if (r11 != 0) goto L3a
            r0.o(r6)
            return
        L3a:
            r3.b(r10)
        L3d:
            int r9 = r9 + 1
            goto L1a
        L40:
            q1.h0 r2 = r2.f7185b
            int[] r5 = r2.f35807b
            long[] r2 = r2.f35806a
            int r7 = r2.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L8b
            r9 = r8
        L4c:
            r10 = r2[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L86
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = r8
        L66:
            if (r14 >= r12) goto L84
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L80
            int r15 = r9 << 3
            int r15 = r15 + r14
            r15 = r5[r15]
            boolean r15 = r3.a(r15)
            if (r15 != 0) goto L80
            r0.o(r6)
            return
        L80:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L66
        L84:
            if (r12 != r13) goto L8b
        L86:
            if (r9 == r7) goto L8b
            int r9 = r9 + 1
            goto L4c
        L8b:
            java.util.List r1 = j5.t.j(r4, r1)
            int r2 = r1.size()
        L93:
            if (r8 >= r2) goto Lb9
            java.lang.Object r3 = r1.get(r8)
            j5.t r3 = (j5.t) r3
            q1.g0 r4 = r0.E
            int r5 = r3.f24699g
            java.lang.Object r4 = r4.b(r5)
            c5.e3 r4 = (c5.e3) r4
            if (r4 == 0) goto Lb6
            q1.o r5 = r0.j()
            int r6 = r3.f24699g
            boolean r5 = r5.a(r6)
            if (r5 == 0) goto Lb6
            r0.t(r3, r4)
        Lb6:
            int r8 = r8 + 1
            goto L93
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.f0.t(j5.t, c5.e3):void");
    }

    public final boolean u(AccessibilityEvent accessibilityEvent) {
        if (!m()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f7203m = true;
        }
        try {
            return ((Boolean) this.f7194c.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.f7203m = false;
        }
    }

    public final boolean v(int i11, int i12, Integer num, List list) {
        if (i11 == Integer.MIN_VALUE || !m()) {
            return false;
        }
        AccessibilityEvent accessibilityEventF = f(i11, i12);
        if (num != null) {
            accessibilityEventF.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventF.setContentDescription(b6.b.a(list, MessageLogView.COMMA_SEPARATOR, null, 62));
        }
        return u(accessibilityEventF);
    }

    public final void x(int i11, int i12, String str) {
        AccessibilityEvent accessibilityEventF = f(s(i11), 32);
        accessibilityEventF.setContentChangeTypes(i12);
        if (str != null) {
            accessibilityEventF.getText().add(str);
        }
        u(accessibilityEventF);
    }

    public final void y(int i11) {
        b0 b0Var = this.f7213w;
        if (b0Var != null) {
            j5.t tVar = b0Var.f7115a;
            if (i11 != tVar.f24699g) {
                return;
            }
            if (SystemClock.uptimeMillis() - b0Var.f7120f <= 1000) {
                AccessibilityEvent accessibilityEventF = f(s(tVar.f24699g), 131072);
                accessibilityEventF.setFromIndex(b0Var.f7118d);
                accessibilityEventF.setToIndex(b0Var.f7119e);
                accessibilityEventF.setAction(b0Var.f7116b);
                accessibilityEventF.setMovementGranularity(b0Var.f7117c);
                accessibilityEventF.getText().add(k(tVar));
                u(accessibilityEventF);
            }
        }
        this.f7213w = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:216:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(q1.o r59) {
        /*
            Method dump skipped, instruction units count: 1685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.f0.z(q1.o):void");
    }
}
