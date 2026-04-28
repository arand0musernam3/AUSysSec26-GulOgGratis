package o00;

import a3.m3;
import a3.u2;
import a3.x1;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import b4.t;
import com.adyen.checkout.components.core.Address;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.OrderId;
import com.app.tgtg.model.remote.item.ItemCategory;
import com.app.tgtg.model.remote.item.response.SortingChoice;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.order.OrderType;
import com.app.tgtg.model.remote.order.request.OrderRatingRequest;
import com.app.tgtg.model.remote.order.request.RatingCategory;
import com.braze.h2;
import com.google.android.gms.internal.measurement.cg;
import d2.b2;
import d2.m2;
import d2.z1;
import g3.i2;
import g3.r9;
import g3.v3;
import g3.w6;
import g3.x5;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import m3.i;
import m3.n;
import m3.w1;
import o00.x0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import v1.o1;
import y80.a2;
import z1.l1;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f31766a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f31767b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f31768c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static long f31769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Method f31770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Method f31771f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Method f31772g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Method f31773h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f31774i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f31775j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f31776k = 0;

    public static final Object A(y9.v vVar, boolean z11, boolean z12, Function1 function1) {
        vVar.getClass();
        vVar.a();
        ThreadLocal threadLocal = vVar.f45764i;
        if (vVar.l() && !vVar.m()) {
            CoroutineContext coroutineContext = (CoroutineContext) threadLocal.get();
            if ((coroutineContext != null ? (y9.c0) coroutineContext.get(y9.c0.f45655b) : null) != null) {
                h2.b("Cannot access database on a different coroutine context inherited from a suspending transaction.");
                return null;
            }
        }
        CoroutineContext coroutineContext2 = (CoroutineContext) threadLocal.get();
        if (coroutineContext2 == null) {
            coroutineContext2 = kotlin.coroutines.g.f26549a;
        }
        return wd.a.F(new da.d(coroutineContext2, vVar, z12, z11, function1, (x70.c) null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object B(y9.v r8, kotlin.jvm.functions.Function1 r9, z70.c r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof da.e
            if (r0 == 0) goto L13
            r0 = r10
            da.e r0 = (da.e) r0
            int r1 = r0.f14814m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14814m = r1
            goto L18
        L13:
            da.e r0 = new da.e
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f14814m
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4b
            if (r2 == r6) goto L47
            if (r2 == r5) goto L43
            if (r2 == r4) goto L38
            if (r2 != r3) goto L31
            ba0.g.M(r10)
            return r10
        L31:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L38:
            z70.i r8 = r0.f14813k
            r9 = r8
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            y9.v r8 = r0.f14812j
            ba0.g.M(r10)
            goto L97
        L43:
            ba0.g.M(r10)
            return r10
        L47:
            ba0.g.M(r10)
            return r10
        L4b:
            ba0.g.M(r10)
            boolean r10 = r8.l()
            if (r10 == 0) goto L64
            b0.r2 r10 = new b0.r2
            r2 = 3
            r10.<init>(r8, r9, r7, r2)
            r0.f14814m = r6
            java.lang.Object r8 = d40.t1.L(r10, r0, r8)
            if (r8 != r1) goto L63
            goto Laa
        L63:
            return r8
        L64:
            boolean r10 = r8.l()
            if (r10 == 0) goto L87
            boolean r10 = r8.o()
            if (r10 == 0) goto L87
            boolean r10 = r8.m()
            if (r10 == 0) goto L87
            da.g r10 = new da.g
            r2 = 1
            r10.<init>(r8, r7, r9, r2)
            r0.f14814m = r5
            r9 = 0
            java.lang.Object r8 = r8.r(r9, r10, r0)
            if (r8 != r1) goto L86
            goto Laa
        L86:
            return r8
        L87:
            r0.f14812j = r8
            r10 = r9
            z70.i r10 = (z70.i) r10
            r0.f14813k = r10
            r0.f14814m = r4
            kotlin.coroutines.CoroutineContext r10 = s(r8, r6, r0)
            if (r10 != r1) goto L97
            goto Laa
        L97:
            kotlin.coroutines.CoroutineContext r10 = (kotlin.coroutines.CoroutineContext) r10
            d8.c r2 = new d8.c
            r2.<init>(r9, r7, r8)
            r0.f14812j = r7
            r0.f14813k = r7
            r0.f14814m = r3
            java.lang.Object r8 = v80.f0.K(r10, r2, r0)
            if (r8 != r1) goto Lab
        Laa:
            return r1
        Lab:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o00.x0.B(y9.v, kotlin.jvm.functions.Function1, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object C(x70.c r14, y9.v r15, boolean r16, boolean r17, kotlin.jvm.functions.Function1 r18) {
        /*
            boolean r0 = r14 instanceof da.h
            if (r0 == 0) goto L14
            r0 = r14
            da.h r0 = (da.h) r0
            int r1 = r0.f14827o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f14827o = r1
        L12:
            r14 = r0
            goto L1a
        L14:
            da.h r0 = new da.h
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r0 = r14.f14826n
            y70.a r7 = y70.a.COROUTINE_SUSPENDED
            int r1 = r14.f14827o
            r2 = 3
            r3 = 2
            r8 = 1
            if (r1 == 0) goto L4a
            if (r1 == r8) goto L46
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2f
            ba0.g.M(r0)
            return r0
        L2f:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r14)
            r14 = 0
            return r14
        L36:
            boolean r1 = r14.f14825m
            boolean r3 = r14.l
            kotlin.jvm.functions.Function1 r4 = r14.f14824k
            y9.v r5 = r14.f14823j
            ba0.g.M(r0)
            r12 = r1
            r11 = r3
            r13 = r4
            r10 = r5
            goto L95
        L46:
            ba0.g.M(r0)
            return r0
        L4a:
            ba0.g.M(r0)
            boolean r0 = r15.l()
            if (r0 == 0) goto L79
            boolean r0 = r15.o()
            if (r0 == 0) goto L79
            boolean r0 = r15.m()
            if (r0 == 0) goto L79
            da.b r0 = new da.b
            r4 = 0
            r6 = 1
            r3 = r15
            r2 = r16
            r1 = r17
            r5 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r1 = r2
            r2 = r0
            r14.f14827o = r8
            java.lang.Object r14 = r15.r(r1, r2, r14)
            if (r14 != r7) goto L78
            goto Laa
        L78:
            return r14
        L79:
            r1 = r16
            r4 = r17
            r14.f14823j = r15
            r5 = r18
            r14.f14824k = r5
            r14.l = r1
            r14.f14825m = r4
            r14.f14827o = r3
            kotlin.coroutines.CoroutineContext r3 = s(r15, r4, r14)
            if (r3 != r7) goto L90
            goto Laa
        L90:
            r10 = r15
            r11 = r1
            r0 = r3
            r12 = r4
            r13 = r5
        L95:
            kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
            da.c r8 = new da.c
            r9 = 0
            r8.<init>(r9, r10, r11, r12, r13)
            r1 = 0
            r14.f14823j = r1
            r14.f14824k = r1
            r14.f14827o = r2
            java.lang.Object r14 = v80.f0.K(r0, r8, r14)
            if (r14 != r7) goto Lab
        Laa:
            return r7
        Lab:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: o00.x0.C(x70.c, y9.v, boolean, boolean, kotlin.jvm.functions.Function1):java.lang.Object");
    }

    public static void D(EditorInfo editorInfo, CharSequence charSequence) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            f5.b.p(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i11 >= 30) {
            f5.b.p(editorInfo, charSequence);
            return;
        }
        int i12 = editorInfo.initialSelStart;
        int i13 = editorInfo.initialSelEnd;
        int i14 = i12 > i13 ? i13 : i12;
        if (i12 <= i13) {
            i12 = i13;
        }
        int length = charSequence.length();
        if (i14 < 0 || i12 > length) {
            F(editorInfo, null, 0, 0);
            return;
        }
        int i15 = editorInfo.inputType & 4095;
        if (i15 == 129 || i15 == 225 || i15 == 18) {
            F(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            F(editorInfo, charSequence, i14, i12);
            return;
        }
        int i16 = i12 - i14;
        int i17 = i16 > 1024 ? 0 : i16;
        int i18 = 2048 - i17;
        int iMin = Math.min(charSequence.length() - i12, i18 - Math.min(i14, (int) (((double) i18) * 0.8d)));
        int iMin2 = Math.min(i14, i18 - iMin);
        int i19 = i14 - iMin2;
        if (Character.isLowSurrogate(charSequence.charAt(i19))) {
            i19++;
            iMin2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i12 + iMin) - 1))) {
            iMin--;
        }
        int i21 = iMin2 + i17;
        F(editorInfo, i17 != i16 ? TextUtils.concat(charSequence.subSequence(i19, i19 + iMin2), charSequence.subSequence(i12, iMin + i12)) : charSequence.subSequence(i19, i21 + iMin + i19), iMin2, i21);
    }

    public static void E(EditorInfo editorInfo, boolean z11) {
        if (Build.VERSION.SDK_INT >= 35) {
            j7.a.d(editorInfo, z11);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z11);
    }

    public static void F(EditorInfo editorInfo, CharSequence charSequence, int i11, int i12) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i11);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i12);
    }

    public static String G(String str) {
        String str2 = str.length() <= 127 ? str : null;
        return str2 == null ? str.substring(0, 127) : str2;
    }

    public static final Object H(x80.x xVar, Object obj) {
        Object objH = xVar.h(obj);
        if (!(objH instanceof x80.o)) {
            return Unit.f26487a;
        }
        return ((x80.p) v80.f0.E(kotlin.coroutines.g.f26549a, new tg.g(xVar, obj, null, 9))).f44078a;
    }

    public static final long I(long j9, long j11) {
        int iE;
        int iG = m5.t0.g(j9);
        int iF = m5.t0.f(j9);
        if ((m5.t0.g(j11) < m5.t0.f(j9)) && (m5.t0.g(j9) < m5.t0.f(j11))) {
            if (m5.t0.a(j11, j9)) {
                iG = m5.t0.g(j11);
                iF = iG;
            } else {
                if (m5.t0.a(j9, j11)) {
                    iE = m5.t0.e(j11);
                } else {
                    int iG2 = m5.t0.g(j11);
                    if (iG >= m5.t0.f(j11) || iG2 > iG) {
                        iF = m5.t0.g(j11);
                    } else {
                        iG = m5.t0.g(j11);
                        iE = m5.t0.e(j11);
                    }
                }
                iF -= iE;
            }
        } else if (iF > m5.t0.g(j11)) {
            iG -= m5.t0.e(j11);
            iE = m5.t0.e(j11);
            iF -= iE;
        }
        return m5.k0.b(iG, iF);
    }

    public static final void J(CaptureRequest.Builder builder, Object obj, Object obj2) {
        builder.getClass();
        if (obj == null || !(obj instanceof CaptureRequest.Key)) {
            return;
        }
        try {
            builder.set((CaptureRequest.Key) obj, obj2);
        } catch (IllegalArgumentException e5) {
            Log.w("CXCP", "Failed to set [" + ((CaptureRequest.Key) obj).getName() + ": " + obj2 + "] on CaptureRequest.Builder", e5);
        }
    }

    public static final void K(CaptureRequest.Builder builder, Map map) {
        map.getClass();
        for (Map.Entry entry : map.entrySet()) {
            J(builder, entry.getKey(), entry.getValue());
        }
    }

    public static String L(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb2 = new StringBuilder(str.length() + (objArr.length * 16));
        int i11 = 0;
        int i12 = 0;
        while (true) {
            length = objArr.length;
            if (i11 >= length || (iIndexOf = str.indexOf("%s", i12)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i12, iIndexOf);
            sb2.append(M(objArr[i11]));
            i12 = iIndexOf + 2;
            i11++;
        }
        sb2.append((CharSequence) str, i12, str.length());
        if (i11 < length) {
            String str2 = " [";
            while (i11 < objArr.length) {
                sb2.append(str2);
                sb2.append(M(objArr[i11]));
                i11++;
                str2 = ", ";
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static String M(Object obj) {
        if (obj == null) {
            return Address.ADDRESS_NULL_PLACEHOLDER;
        }
        try {
            return obj.toString();
        } catch (Exception e5) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String strN = e0.f.n(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strN), (Throwable) e5);
            String name2 = e5.getClass().getName();
            StringBuilder sb2 = new StringBuilder(strN.length() + 8 + name2.length() + 1);
            j4.s.A(sb2, "<", strN, " threw ", name2);
            sb2.append(">");
            return sb2.toString();
        }
    }

    public static final void a(final boolean z11, final b4.t tVar, float f11, m3.n nVar, final int i11) {
        final float f12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1383721290);
        int i12 = (sVar.g(z11) ? 4 : 2) | i11 | (sVar.f(tVar) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            f12 = 24;
            b4.t tVarM = m2.m(tVar, f12);
            l2.f fVar = l2.g.f26790a;
            long j9 = lv.s.f28217b;
            b4.t tVarK = v1.n.k(f4.g.b(tVarM, fVar), 2, j9, fVar);
            if (!z11) {
                j9 = lv.s.J;
            }
            b4.t tVarJ = v1.n.j(tVarK, j9, i4.g0.f23254b);
            Object objM = sVar.M();
            if (objM == m3.m.f29332a) {
                objM = new hb0.q(26);
                sVar.k0(objM);
            }
            b4.t tVarC = j5.r.c(tVarJ, false, (Function1) objM);
            z4.u0 u0VarD = d2.p.d(b4.d.f5687e, false);
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
            if (z11) {
                sVar.a0(279732698);
                p4.f fVarB = bx.k.f6728b;
                if (fVarB == null) {
                    p4.e eVar = new p4.e("Filled.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    kotlin.collections.n0 n0Var = p4.h0.f34349a;
                    i4.x0 x0Var = new i4.x0(i4.v.f23309b);
                    ArrayList arrayList = new ArrayList(32);
                    arrayList.add(new p4.n(9.0f, 16.17f));
                    arrayList.add(new p4.m(4.83f, 12.0f));
                    arrayList.add(new p4.u(-1.42f, 1.41f));
                    arrayList.add(new p4.m(9.0f, 19.0f));
                    arrayList.add(new p4.m(21.0f, 7.0f));
                    arrayList.add(new p4.u(-1.41f, -1.41f));
                    arrayList.add(p4.j.f34357c);
                    p4.e.a(eVar, arrayList, x0Var);
                    fVarB = eVar.b();
                    bx.k.f6728b = fVarB;
                }
                i2.b(fVarB, Address.ADDRESS_NULL_PLACEHOLDER, m2.m(b4.q.f5711a, 16), lv.s.J, sVar, 3504, 0);
                sVar.q(false);
            } else {
                sVar.a0(279938662);
                sVar.q(false);
            }
            sVar.q(true);
        } else {
            sVar.U();
            f12 = f11;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2(z11, tVar, f12, i11) { // from class: il.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ boolean f24052a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ t f24053b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ float f24054c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iF = i.F(1);
                    x0.a(this.f24052a, this.f24053b, this.f24054c, (n) obj, iF);
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final void b(Function0 function0, m3.n nVar, int i11) {
        function0.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-837559862);
        if (sVar.R(i11 & 1, (i11 & 3) != 2)) {
            Object objM = sVar.M();
            if (objM == m3.m.f29332a) {
                objM = new vm.r(4, function0);
                sVar.k0(objM);
            }
            ex.i.b((Function0) objM, new d6.a0(true, true, false), u3.e.e(-674503903, sVar, new cg.z(29, function0)), sVar, 432, 0);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new vq.a(i11, 0, function0);
        }
    }

    public static final void c(List list, String str, w6 w6Var, boolean z11, Function2 function2, m3.n nVar, int i11) {
        m3.s sVar;
        boolean z12;
        list.getClass();
        w6Var.getClass();
        function2.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-880289209);
        int i12 = i11 | (sVar2.h(list) ? 4 : 2) | (sVar2.f(str) ? 32 : 16) | (sVar2.f(w6Var) ? 256 : 128) | (sVar2.g(z11) ? NewHope.SENDB_BYTES : 1024) | (sVar2.h(function2) ? 16384 : 8192);
        if (sVar2.R(i12 & 1, (i12 & 9363) != 9362)) {
            b4.t tVarD = m2.d(b4.q.f5711a, 1.0f);
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
            m3.i.C(yVarA, b5.i.f5843f, sVar2);
            m3.i.C(iVarL, b5.i.f5842e, sVar2);
            m3.i.v(sVar2, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar2, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar2);
            if (z11) {
                sVar2.a0(1814589413);
                long j9 = lv.s.J;
                boolean z13 = (57344 & i12) == 16384;
                Object objM = sVar2.M();
                if (z13 || objM == m3.m.f29332a) {
                    objM = new cn.z(0, function2);
                    sVar2.k0(objM);
                }
                z12 = true;
                v3.a((Function0) objM, null, w6Var, 0.0f, false, null, j9, 0L, 0.0f, 0L, null, null, null, u3.e.e(221063542, sVar2, new ap.e(list, str, function2, 3)), sVar2, (i12 & 896) | 1572864, 3072, 8122);
                sVar = sVar2;
                sVar.q(false);
            } else {
                sVar = sVar2;
                z12 = true;
                sVar.a0(1817705285);
                sVar.q(false);
            }
            sVar.q(z12);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bg.d(list, str, w6Var, z11, function2, i11, 1);
        }
    }

    public static final void d(m3.n nVar, int i11) {
        m3.s sVar;
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(93706033);
        if (sVar2.R(i11 & 1, i11 != 0)) {
            sVar = sVar2;
            r9.d(o30.f0.U(sVar2, R.string.item_view_flash_explainer_title), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28271j, sVar, 0, 12582912, 131070);
            float f11 = lv.t.f28254h;
            b4.q qVar = b4.q.f5711a;
            d2.c.f(m2.e(qVar, f11), sVar);
            v1.n.d(z(R.drawable.explainer_flash_sale, sVar, 0), null, null, null, null, 0.0f, null, sVar, 56, 124);
            d2.c.f(m2.e(qVar, lv.t.f28253g), sVar);
            r9.d(o30.f0.U(sVar, R.string.item_view_flash_explainer_description), null, 0L, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar, 0, 12582912, 130046);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new s60.c(i11);
        }
    }

    public static final void e(final g2.a aVar, b4.t tVar, g2.b0 b0Var, z1 z1Var, d2.h hVar, d2.f fVar, z1.l1 l1Var, boolean z11, v1.o1 o1Var, final Function1 function1, m3.n nVar, final int i11) {
        final b4.t tVar2;
        final g2.b0 b0Var2;
        final z1 z1Var2;
        final d2.h hVar2;
        final d2.f fVar2;
        final z1.l1 l1Var2;
        final boolean z12;
        final v1.o1 o1Var2;
        d2.h hVar3;
        z1.l1 l1Var3;
        z1 z1Var3;
        d2.f fVar3;
        int i12;
        g2.b0 b0Var3;
        boolean z13;
        v1.o1 o1Var3;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-2072102870);
        int i13 = i11 | (sVar.f(aVar) ? 4 : 2) | 374959280;
        int i14 = sVar.h(function1) ? 4 : 2;
        boolean z14 = true;
        if (sVar.R(i13 & 1, ((306783379 & i13) == 306783378 && (i14 & 3) == 2) ? false : true)) {
            sVar.W();
            int i15 = i11 & 1;
            m3.f fVar4 = m3.m.f29332a;
            if (i15 == 0 || sVar.z()) {
                g2.r rVar = g2.c0.f18151a;
                Object[] objArr = new Object[0];
                ub.a aVar2 = g2.b0.f18125w;
                boolean zD = sVar.d(0) | sVar.d(0);
                Object objM = sVar.M();
                if (zD || objM == fVar4) {
                    objM = new fw.b(9);
                    sVar.k0(objM);
                }
                g2.b0 b0Var4 = (g2.b0) y3.j.d(objArr, aVar2, (Function0) objM, sVar, 0);
                float f11 = 0;
                b2 b2Var = new b2(f11, f11, f11, f11);
                hVar3 = d2.i.f13803c;
                d2.b bVar = d2.i.f13801a;
                t1.s sVarA = s1.k1.a(sVar);
                boolean zF = sVar.f(sVarA);
                Object objM2 = sVar.M();
                if (zF || objM2 == fVar4) {
                    objM2 = new z1.e0(sVarA);
                    sVar.k0(objM2);
                }
                v1.o1 o1VarA = v1.p1.a(sVar);
                l1Var3 = (z1.e0) objM2;
                z1Var3 = b2Var;
                fVar3 = bVar;
                i12 = i13 & (-1908867969);
                b0Var3 = b0Var4;
                tVar2 = b4.q.f5711a;
                z13 = false;
                o1Var3 = o1VarA;
            } else {
                sVar.U();
                tVar2 = tVar;
                z1Var3 = z1Var;
                hVar3 = hVar;
                fVar3 = fVar;
                l1Var3 = l1Var;
                i12 = i13 & (-1908867969);
                z13 = false;
                b0Var3 = b0Var;
                z14 = z11;
                o1Var3 = o1Var;
            }
            sVar.r();
            int i16 = (i12 & 14) | 48;
            if ((((i16 & 14) ^ 6) > 4 && sVar.f(aVar)) || (i16 & 6) == 4) {
                z13 = true;
            }
            Object objM3 = sVar.M();
            if (z13 || objM3 == fVar4) {
                objM3 = new g2.c(new u2(16, aVar, fVar3));
                sVar.k0(objM3);
            }
            z1.l1 l1Var4 = l1Var3;
            b0Var2 = b0Var3;
            o30.e0.i(tVar2, b0Var2, (g2.c) objM3, z1Var3, l1Var4, z14, o1Var3, hVar3, fVar3, function1, sVar, 12807174, 6 | ((i14 << 3) & 112));
            z1Var2 = z1Var3;
            hVar2 = hVar3;
            o1Var2 = o1Var3;
            z12 = z14;
            l1Var2 = l1Var4;
            fVar2 = fVar3;
        } else {
            sVar.U();
            tVar2 = tVar;
            b0Var2 = b0Var;
            z1Var2 = z1Var;
            hVar2 = hVar;
            fVar2 = fVar;
            l1Var2 = l1Var;
            z12 = z11;
            o1Var2 = o1Var;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2(tVar2, b0Var2, z1Var2, hVar2, fVar2, l1Var2, z12, o1Var2, function1, i11) { // from class: g2.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ b4.t f18155b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ b0 f18156c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ z1 f18157d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ d2.h f18158e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ d2.f f18159f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ l1 f18160g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ boolean f18161h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ o1 f18162i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ Function1 f18163j;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iF = m3.i.F(1);
                    x0.e(this.f18154a, this.f18155b, this.f18156c, this.f18157d, this.f18158e, this.f18159f, this.f18160g, this.f18161h, this.f18162i, this.f18163j, (m3.n) obj, iF);
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final void f(he.k kVar, b4.t tVar, boolean z11, float f11, int i11, boolean z12, b4.f fVar, m3.n nVar, int i12, int i13, int i14) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1331239405);
        b4.t tVar2 = (i14 & 2) != 0 ? b4.q.f5711a : tVar;
        boolean z13 = (i14 & 4) != 0 ? true : z11;
        float f12 = (i14 & 32) != 0 ? 1.0f : f11;
        int i15 = (i14 & 64) != 0 ? 1 : i11;
        he.j0 j0Var = he.j0.AUTOMATIC;
        boolean z14 = (i14 & 4096) != 0 ? false : z12;
        b4.f fVar2 = (i14 & 32768) != 0 ? b4.d.f5687e : fVar;
        he.a aVar = he.a.AUTOMATIC;
        boolean z15 = z13;
        float f13 = f12;
        int i16 = i15;
        boolean z16 = z14;
        le.h hVarJ = cg.j(kVar, z15, z16, f13, i16, sVar, 896);
        sVar.b0(185157769);
        boolean zF = sVar.f(hVarJ);
        Object objM = sVar.M();
        if (zF || objM == m3.m.f29332a) {
            objM = new ky.i(hVarJ, 3);
            sVar.k0(objM);
        }
        sVar.q(false);
        g(kVar, (Function0) objM, tVar2, false, false, true, false, j0Var, false, fVar2, z4.l.f47167b, true, false, null, aVar, false, sVar, ((i12 << 3) & 896) | 1073741832, ((i13 >> 15) & 14) | 32768, 0);
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new le.k(kVar, tVar2, z15, f13, i16, j0Var, z16, fVar2, aVar, i12, i13, i14);
        }
    }

    public static final void g(he.k kVar, Function0 function0, b4.t tVar, boolean z11, boolean z12, boolean z13, boolean z14, he.j0 j0Var, boolean z15, b4.f fVar, z4.m mVar, boolean z16, boolean z17, Map map, he.a aVar, boolean z18, m3.n nVar, int i11, int i12, int i13) {
        function0.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(382909894);
        boolean z19 = (i13 & 8) != 0 ? false : z11;
        boolean z21 = (i13 & 16) != 0 ? false : z12;
        boolean z22 = (i13 & 32) != 0 ? true : z13;
        boolean z23 = (i13 & 64) != 0 ? false : z14;
        he.j0 j0Var2 = (i13 & 128) != 0 ? he.j0.AUTOMATIC : j0Var;
        boolean z24 = (i13 & 256) != 0 ? false : z15;
        b4.f fVar2 = (i13 & 1024) != 0 ? b4.d.f5687e : fVar;
        z4.m mVar2 = (i13 & NewHope.SENDB_BYTES) != 0 ? z4.l.f47167b : mVar;
        boolean z25 = (i13 & 4096) != 0 ? true : z16;
        boolean z26 = (i13 & 8192) != 0 ? false : z17;
        Map map2 = (i13 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? null : map;
        he.a aVar2 = (i13 & 32768) != 0 ? he.a.AUTOMATIC : aVar;
        boolean z27 = (i13 & 65536) != 0 ? false : z18;
        sVar.b0(185152185);
        Object objM = sVar.M();
        m3.f fVar3 = m3.m.f29332a;
        if (objM == fVar3) {
            objM = new he.z();
            sVar.k0(objM);
        }
        he.z zVar = (he.z) objM;
        sVar.q(false);
        sVar.b0(185152232);
        Object objM2 = sVar.M();
        if (objM2 == fVar3) {
            objM2 = new Matrix();
            sVar.k0(objM2);
        }
        Matrix matrix = (Matrix) objM2;
        sVar.q(false);
        sVar.b0(185152312);
        boolean zF = sVar.f(kVar);
        Object objM3 = sVar.M();
        if (zF || objM3 == fVar3) {
            objM3 = m3.i.w(null);
            sVar.k0(objM3);
        }
        m3.b1 b1Var = (m3.b1) objM3;
        sVar.q(false);
        sVar.b0(185152364);
        if (kVar == null || kVar.b() == 0.0f) {
            Map map3 = map2;
            boolean z28 = z23;
            he.j0 j0Var3 = j0Var2;
            boolean z29 = z21;
            boolean z31 = z24;
            he.a aVar3 = aVar2;
            boolean z32 = z26;
            boolean z33 = z27;
            d2.p.a(tVar, sVar, (i11 >> 6) & 14);
            sVar.q(false);
            w1 w1VarS = sVar.s();
            if (w1VarS != null) {
                w1VarS.f29476d = new le.i(kVar, function0, tVar, z19, z29, z22, z28, j0Var3, z31, fVar2, mVar2, z25, z32, map3, aVar3, z33, i11, i12, i13, 0);
                return;
            }
            return;
        }
        sVar.q(false);
        b4.f fVar4 = fVar2;
        Rect rect = kVar.f21936k;
        Context context = (Context) sVar.j(c5.v0.f7390b);
        int iWidth = rect.width();
        int iHeight = rect.height();
        tVar.getClass();
        b4.t tVarThen = tVar.then(new le.l(iWidth, iHeight));
        z4.m mVar3 = mVar2;
        boolean z34 = z22;
        Map map4 = map2;
        boolean z35 = z23;
        he.j0 j0Var4 = j0Var2;
        he.a aVar4 = aVar2;
        boolean z36 = z27;
        boolean z37 = z25;
        boolean z38 = z19;
        le.j jVar = new le.j(rect, mVar3, fVar4, matrix, zVar, z35, z36, j0Var4, aVar4, kVar, map4, z38, z21, z34, z24, z37, z26, context, function0, b1Var);
        boolean z39 = z24;
        boolean z41 = z21;
        boolean z42 = z26;
        v1.n.c(tVarThen, jVar, sVar, 0);
        w1 w1VarS2 = sVar.s();
        if (w1VarS2 != null) {
            w1VarS2.f29476d = new le.i(kVar, function0, tVar, z38, z41, z34, z35, j0Var4, z39, fVar4, mVar3, z37, z42, map4, aVar4, z36, i11, i12, i13, 1);
        }
    }

    public static final void h(g9.f0 f0Var, m3.n nVar, int i11) {
        m3.s sVar;
        int i12;
        Activity activity;
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-1113107458);
        int i13 = (sVar2.h(f0Var) ? 4 : 2) | i11;
        int i14 = 0;
        if (sVar2.R(i13 & 1, (i13 & 3) != 2)) {
            androidx.lifecycle.s1 s1VarA = z8.a.a(sVar2);
            if (s1VarA == null) {
                h2.b("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            ap.n nVar2 = (ap.n) d40.t1.K(Reflection.getOrCreateKotlinClass(ap.n.class), s1VarA, o30.e0.r(s1VarA, sVar2), s1VarA instanceof androidx.lifecycle.p ? ((androidx.lifecycle.p) s1VarA).getDefaultViewModelCreationExtras() : y8.a.f45423b, sVar2);
            bp.g gVar = bp.g.INSTANCE;
            if (nVar2.c()) {
                gVar = null;
            }
            bp.p pVar = bp.p.INSTANCE;
            if (nVar2.K.f45488a.getValue() != null) {
                pVar = null;
            }
            bp.o oVar = bp.o.INSTANCE;
            if (!cg.q(nVar2.b())) {
                oVar = null;
            }
            ArrayList arrayListW = kotlin.collections.y.w(new bp.r[]{bp.h.INSTANCE, gVar, bp.i.INSTANCE, bp.k.INSTANCE, bp.j.INSTANCE, bp.n.INSTANCE, pVar, oVar});
            bp.r rVar = nVar2.f4567i ? bp.l.INSTANCE : bp.e.INSTANCE;
            bp.f fVar = bp.f.INSTANCE;
            if (nVar2.l || !Intrinsics.areEqual(nVar2.B.getValue(), Boolean.TRUE)) {
                fVar = null;
            }
            ArrayList arrayListW2 = kotlin.collections.y.w(new bp.r[]{rVar, bp.c.INSTANCE, fVar, bp.q.INSTANCE});
            Order orderA = nVar2.a();
            String invitationId = orderA != null ? orderA.getInvitationId() : null;
            if ((invitationId == null || StringsKt.H(invitationId)) && !nVar2.c()) {
                arrayListW = CollectionsKt.d0(arrayListW2, arrayListW);
            }
            ArrayList arrayList = arrayListW;
            m3.b1 b1VarN = m3.i.n(nVar2.I, sVar2, 0);
            Object objM = sVar2.M();
            m3.f fVar2 = m3.m.f29332a;
            if (objM == fVar2) {
                objM = w.a0.s(-1, sVar2);
            }
            m3.h1 h1Var = (m3.h1) objM;
            Object objM2 = sVar2.M();
            if (objM2 == fVar2) {
                objM2 = m3.i.w(Boolean.FALSE);
                sVar2.k0(objM2);
            }
            m3.b1 b1Var = (m3.b1) objM2;
            Activity activityE = mv.r0.e((Context) sVar2.j(c5.v0.f7390b));
            Integer numValueOf = Integer.valueOf(((Number) b1VarN.getValue()).intValue());
            boolean zF = sVar2.f(b1VarN) | sVar2.h(arrayList) | sVar2.h(nVar2) | sVar2.h(activityE) | sVar2.h(f0Var);
            Object objM3 = sVar2.M();
            if (zF || objM3 == fVar2) {
                ap.k kVar = new ap.k(arrayList, h1Var, f0Var, b1VarN, nVar2, activityE, b1Var, (x70.c) null);
                activity = activityE;
                sVar2.k0(kVar);
                objM3 = kVar;
            } else {
                activity = activityE;
            }
            m3.i.h(numValueOf, (Function2) objM3, sVar2);
            sVar = sVar2;
            i12 = 0;
            x5.a(m2.f13850c, u3.e.e(-1477004094, sVar2, new ap.b(h1Var, arrayList, nVar2, activity, b1Var, 0)), null, null, null, 0, 0L, 0L, null, u3.e.e(-1712225139, sVar2, new ap.e(f0Var, nVar2, activity, i14)), sVar, 805306422, 508);
        } else {
            sVar = sVar2;
            i12 = 0;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ap.j(f0Var, i11, i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [dv.b] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v34, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v46, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v54, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v89 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r5v90 */
    /* JADX WARN: Type inference failed for: r5v91 */
    /* JADX WARN: Type inference failed for: r5v92 */
    /* JADX WARN: Type inference failed for: r5v93 */
    /* JADX WARN: Type inference failed for: r5v94 */
    /* JADX WARN: Type inference failed for: r5v95 */
    /* JADX WARN: Type inference failed for: r5v96 */
    /* JADX WARN: Type inference failed for: r5v97 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v30, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v37, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v28, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [cv.b] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void i(ap.n nVar, Activity activity) {
        y80.h1 h1Var;
        Intent intent;
        a2 a2Var;
        a2 a2Var2;
        boolean z11;
        a2 a2Var3;
        y80.h1 h1Var2;
        y80.h1 h1Var3;
        y80.h1 h1Var4;
        String str;
        x70.c cVar;
        Object objValueOf;
        ?? arrayList;
        ?? arrayList2;
        ?? arrayList3;
        ?? arrayList4;
        ItemCategory itemCategory;
        OrderType orderType;
        Boolean bool;
        Order orderA;
        Intent intent2 = new Intent();
        y80.h1 h1Var5 = nVar.f4571n;
        intent2.putExtra("ORDER_RATING", ((Number) h1Var5.f45488a.getValue()).intValue());
        Order orderA2 = nVar.a();
        String strM429getOrderIdreIZeYA = orderA2 != null ? orderA2.m429getOrderIdreIZeYA() : null;
        intent2.putExtra("ORDER_ID", strM429getOrderIdreIZeYA != null ? OrderId.m209boximpl(strM429getOrderIdreIZeYA) : null);
        ?? r92 = nVar.f4560c;
        a2 a2Var4 = nVar.D;
        a2 a2Var5 = nVar.F;
        a2 a2Var6 = nVar.f4583z;
        a2 a2Var7 = nVar.f4581x;
        boolean z12 = nVar.f4567i;
        a2 a2Var8 = nVar.B;
        y80.h1 h1Var6 = nVar.f4579v;
        y80.h1 h1Var7 = nVar.f4577t;
        y80.h1 h1Var8 = nVar.f4575r;
        y80.h1 h1Var9 = nVar.f4573p;
        Order orderA3 = nVar.a();
        if (orderA3 != null) {
            et.z zVar = nVar.f4558b;
            String strM429getOrderIdreIZeYA2 = orderA3.m429getOrderIdreIZeYA();
            String invitationId = orderA3.getInvitationId();
            String invitationId2 = orderA3.getInvitationId();
            Integer numValueOf = Integer.valueOf(((Number) h1Var5.f45488a.getValue()).intValue());
            String str2 = nVar.R;
            RatingCategory ratingCategory = new RatingCategory(numValueOf, (List) null, (str2 == null || str2.length() == 0) ? null : str2, 2, (DefaultConstructorMarker) null);
            Object value = h1Var9.f45488a.getValue();
            if (((Number) value).intValue() <= 0) {
                value = null;
            }
            Integer num = (Integer) value;
            List list = nVar.S;
            ArrayList arrayList5 = new ArrayList();
            for (Object obj : list) {
                a2 a2Var9 = a2Var6;
                a2 a2Var10 = a2Var7;
                boolean z13 = z12;
                if (((bp.s) obj) != bp.s.COLLECTION_OTHER) {
                    arrayList5.add(obj);
                }
                a2Var6 = a2Var9;
                a2Var7 = a2Var10;
                z12 = z13;
            }
            a2Var = a2Var6;
            a2Var2 = a2Var7;
            z11 = z12;
            ArrayList arrayList6 = new ArrayList(kotlin.collections.e0.o(arrayList5, 10));
            Iterator it = arrayList5.iterator();
            while (it.hasNext()) {
                arrayList6.add(((bp.s) it.next()).a());
            }
            RatingCategory ratingCategory2 = new RatingCategory(num, arrayList6, nVar.T);
            Object value2 = h1Var8.f45488a.getValue();
            if (((Number) value2).intValue() <= 0) {
                value2 = null;
            }
            Integer num2 = (Integer) value2;
            List list2 = nVar.U;
            ArrayList arrayList7 = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                y80.h1 h1Var10 = h1Var8;
                Iterator it3 = it2;
                if (((bp.s) next) != bp.s.QUALITY_OTHER) {
                    arrayList7.add(next);
                }
                it2 = it3;
                h1Var8 = h1Var10;
            }
            y80.h1 h1Var11 = h1Var8;
            ArrayList arrayList8 = new ArrayList(kotlin.collections.e0.o(arrayList7, 10));
            Iterator it4 = arrayList7.iterator();
            while (it4.hasNext()) {
                arrayList8.add(((bp.s) it4.next()).a());
            }
            RatingCategory ratingCategory3 = new RatingCategory(num2, arrayList8, nVar.V);
            Object value3 = h1Var7.f45488a.getValue();
            if (((Number) value3).intValue() <= 0) {
                value3 = null;
            }
            Integer num3 = (Integer) value3;
            List list3 = nVar.W;
            ArrayList arrayList9 = new ArrayList();
            Iterator it5 = list3.iterator();
            while (it5.hasNext()) {
                Object next2 = it5.next();
                y80.h1 h1Var12 = h1Var7;
                Iterator it6 = it5;
                if (((bp.s) next2) != bp.s.VARIETY_OTHER) {
                    arrayList9.add(next2);
                }
                it5 = it6;
                h1Var7 = h1Var12;
            }
            y80.h1 h1Var13 = h1Var7;
            ArrayList arrayList10 = new ArrayList(kotlin.collections.e0.o(arrayList9, 10));
            Iterator it7 = arrayList9.iterator();
            while (it7.hasNext()) {
                arrayList10.add(((bp.s) it7.next()).a());
            }
            RatingCategory ratingCategory4 = new RatingCategory(num3, arrayList10, nVar.X);
            Object value4 = h1Var6.f45488a.getValue();
            if (((Number) value4).intValue() <= 0) {
                value4 = null;
            }
            Integer num4 = (Integer) value4;
            List list4 = nVar.Y;
            ArrayList arrayList11 = new ArrayList();
            Iterator it8 = list4.iterator();
            while (it8.hasNext()) {
                Object next3 = it8.next();
                y80.h1 h1Var14 = h1Var6;
                Iterator it9 = it8;
                if (((bp.s) next3) != bp.s.QUANTITY_OTHER) {
                    arrayList11.add(next3);
                }
                it8 = it9;
                h1Var6 = h1Var14;
            }
            y80.h1 h1Var15 = h1Var6;
            ArrayList arrayList12 = new ArrayList(kotlin.collections.e0.o(arrayList11, 10));
            Iterator it10 = arrayList11.iterator();
            while (it10.hasNext()) {
                arrayList12.add(((bp.s) it10.next()).a());
            }
            RatingCategory ratingCategory5 = new RatingCategory(num4, arrayList12, nVar.Z);
            String str3 = nVar.f4557a0;
            List list5 = nVar.f4559b0;
            ArrayList arrayList13 = new ArrayList();
            Iterator it11 = list5.iterator();
            while (it11.hasNext()) {
                Object next4 = it11.next();
                String str4 = str3;
                Iterator it12 = it11;
                if (((bp.s) next4) != bp.s.USP_QUESTION_OTHER) {
                    arrayList13.add(next4);
                }
                it11 = it12;
                str3 = str4;
            }
            String str5 = str3;
            ArrayList arrayList14 = new ArrayList(kotlin.collections.e0.o(arrayList13, 10));
            Iterator it13 = arrayList13.iterator();
            while (it13.hasNext()) {
                arrayList14.add(((bp.s) it13.next()).a());
            }
            RatingCategory ratingCategory6 = new RatingCategory((Integer) null, arrayList14, nVar.f4561c0, 1, (DefaultConstructorMarker) null);
            Boolean bool2 = (Boolean) a2Var8.getValue();
            if (invitationId2 != null) {
                bool = null;
            } else {
                Boolean boolValueOf = Boolean.valueOf(z11);
                if (!z11) {
                    boolValueOf = null;
                }
                if (boolValueOf == null) {
                    boolValueOf = (Boolean) a2Var2.getValue();
                }
                bool = boolValueOf;
            }
            Boolean bool3 = (Boolean) a2Var.getValue();
            String strN = kotlin.text.y.n((String) a2Var5.getValue(), MessageLogView.COMMA_SEPARATOR, ".", false);
            OrderRatingRequest orderRatingRequest = new OrderRatingRequest(ratingCategory, ratingCategory2, ratingCategory3, ratingCategory4, ratingCategory5, ratingCategory6, bool2, bool, bool3, str5, strN.length() == 0 ? null : strN);
            Boolean bool4 = (Boolean) a2Var4.getValue();
            zVar.getClass();
            strM429getOrderIdreIZeYA2.getClass();
            c90.f fVar = v80.p0.f42144a;
            cVar = null;
            v80.f0.B(v80.f0.b(c90.e.f7834b), null, null, new af.b(invitationId, zVar, strM429getOrderIdreIZeYA2, orderRatingRequest, bool4, (x70.c) null, 2), 3);
            Uri uri = (Uri) nVar.K.f45488a.getValue();
            if (uri == null || (orderA = nVar.a()) == null) {
                intent = intent2;
                a2Var3 = a2Var8;
                h1Var = h1Var9;
                h1Var4 = h1Var11;
                h1Var3 = h1Var13;
                h1Var2 = h1Var15;
                str = ".";
            } else {
                fv.b bVar = nVar.f4564f;
                if (bVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("prepareFilesForUploadService");
                    bVar = null;
                }
                bVar.getClass();
                q90.a0 a0VarF = bVar.f(false, uri);
                if (a0VarF == null) {
                    nVar.L.j(cp.c.GENERIC);
                    intent = intent2;
                    a2Var3 = a2Var8;
                    h1Var = h1Var9;
                    h1Var4 = h1Var11;
                    h1Var3 = h1Var13;
                    h1Var2 = h1Var15;
                    str = ".";
                } else {
                    nVar.G = true;
                    a9.a aVarD = androidx.lifecycle.m1.d(nVar);
                    str = ".";
                    intent = intent2;
                    a2Var3 = a2Var8;
                    h1Var = h1Var9;
                    h1Var4 = h1Var11;
                    h1Var3 = h1Var13;
                    h1Var2 = h1Var15;
                    x1 x1Var = new x1(nVar, orderA, a0VarF, cVar, 5);
                    cVar = null;
                    v80.f0.B(aVarD, null, null, x1Var, 3);
                }
            }
        } else {
            h1Var = h1Var9;
            intent = intent2;
            a2Var = a2Var6;
            a2Var2 = a2Var7;
            z11 = z12;
            a2Var3 = a2Var8;
            h1Var2 = h1Var6;
            h1Var3 = h1Var7;
            h1Var4 = h1Var8;
            str = ".";
            cVar = null;
        }
        cv.i iVar = cv.i.BRAZE_CORE_PURCHASE_RATED;
        dv.a aVar = dv.a.ORDER_ID;
        Order orderA4 = nVar.a();
        Pair pair = new Pair(aVar, new dv.c(orderA4 != null ? orderA4.m429getOrderIdreIZeYA() : cVar));
        dv.a aVar2 = dv.a.OVERALL;
        r92.c(iVar, h0.g.E(pair, new Pair(aVar2, new dv.c((Integer) h1Var5.f45488a.getValue()))));
        ?? bVar2 = new dv.b();
        dv.d dVar = dv.d.SKIPPED;
        ?? A = dVar != null ? dVar.a() : cVar;
        Order orderA5 = nVar.a();
        if (orderA5 != null) {
            bVar2.b(aVar, orderA5.m429getOrderIdreIZeYA());
            dv.a aVar3 = dv.a.ITEM_CATEGORY;
            ItemCategory itemCategory2 = orderA5.getItemCategory();
            bVar2.b(aVar3, itemCategory2 != null ? itemCategory2.name() : cVar);
        }
        Order orderA6 = nVar.a();
        if (orderA6 != null && (orderType = orderA6.getOrderType()) != null) {
            bVar2.b(dv.a.ITEM_TYPE, orderType.name());
        }
        Order orderA7 = nVar.a();
        if (orderA7 != null && (itemCategory = orderA7.getItemCategory()) != null) {
            bVar2.b(dv.a.ITEM_CATEGORY, itemCategory.name());
        }
        dv.a aVar4 = dv.a.SOURCE;
        bp.u uVar = (bp.u) nVar.f4556a.a("SOURCE");
        if (uVar == null) {
            uVar = bp.u.ORDER;
        }
        bVar2.b(aVar4, uVar.a());
        bVar2.b(dv.a.PICTURE_UPLOADED, Boolean.valueOf(nVar.G));
        dv.a aVar5 = dv.a.CONTENT_DESCRIBED;
        if (nVar.G) {
            objValueOf = cVar;
        } else {
            String str6 = nVar.f4557a0;
            objValueOf = Boolean.valueOf(!(str6 == null || StringsKt.H(str6)));
        }
        bVar2.b(aVar5, objValueOf);
        bVar2.b(aVar2, (Integer) h1Var5.f45488a.getValue());
        dv.a aVar6 = dv.a.RATING_DESCRIBED;
        String str7 = nVar.R;
        bVar2.b(aVar6, Boolean.valueOf(!(str7 == null || StringsKt.H(str7))));
        if (z11) {
            dv.a aVar7 = dv.a.BOUGHT_ANYTHING_ELSE;
            Boolean bool5 = (Boolean) a2Var3.getValue();
            ?? r52 = bool5;
            if (bool5 == null) {
                r52 = A;
            }
            bVar2.b(aVar7, r52);
        } else {
            dv.a aVar8 = dv.a.SHOPPED_HERE_BEFORE;
            Boolean bool6 = (Boolean) a2Var2.getValue();
            ?? r53 = bool6;
            if (bool6 == null) {
                r53 = A;
            }
            bVar2.b(aVar8, r53);
        }
        if (!nVar.l && Intrinsics.areEqual(a2Var3.getValue(), Boolean.TRUE)) {
            dv.a aVar9 = dv.a.HOW_MUCH_SPENT;
            String strN2 = kotlin.text.y.n((String) a2Var5.getValue(), MessageLogView.COMMA_SEPARATOR, str, false);
            int length = strN2.length();
            ?? r54 = strN2;
            if (length <= 0) {
                r54 = cVar;
            }
            bVar2.b(aVar9, r54 != 0 ? Float.valueOf(Float.parseFloat(r54)) : A);
        }
        dv.a aVar10 = dv.a.WOULD_BUY_AGAIN;
        Boolean bool7 = (Boolean) a2Var4.getValue();
        ?? r55 = bool7;
        if (bool7 == null) {
            r55 = A;
        }
        bVar2.b(aVar10, r55);
        dv.a aVar11 = dv.a.WENT_FOR_SURPRISE_BAG;
        Boolean bool8 = (Boolean) a2Var.getValue();
        ?? r56 = bool8;
        if (bool8 == null) {
            r56 = A;
        }
        bVar2.b(aVar11, r56);
        dv.a aVar12 = dv.a.SERVICE;
        Object value5 = h1Var.f45488a.getValue();
        if (((Number) value5).intValue() <= 0) {
            value5 = cVar;
        }
        Integer num5 = (Integer) value5;
        bVar2.b(aVar12, num5 != null ? Integer.valueOf(num5.intValue()) : A);
        int iIntValue = ((Number) h1Var.f45488a.getValue()).intValue();
        if (1 <= iIntValue && iIntValue < 4) {
            dv.a aVar13 = dv.a.SERVICE_REASON;
            List list6 = nVar.S;
            boolean zIsEmpty = list6.isEmpty();
            ?? r62 = list6;
            if (zIsEmpty) {
                r62 = cVar;
            }
            if (r62 != 0) {
                arrayList4 = new ArrayList(kotlin.collections.e0.o(r62, 10));
                Iterator it14 = r62.iterator();
                while (it14.hasNext()) {
                    arrayList4.add(((bp.s) it14.next()).name());
                }
            } else {
                arrayList4 = A;
            }
            bVar2.b(aVar13, arrayList4);
        }
        dv.a aVar14 = dv.a.FOOD_QUALITY;
        Object value6 = h1Var4.f45488a.getValue();
        if (((Number) value6).intValue() <= 0) {
            value6 = cVar;
        }
        Integer num6 = (Integer) value6;
        bVar2.b(aVar14, num6 != null ? Integer.valueOf(num6.intValue()) : A);
        int iIntValue2 = ((Number) h1Var4.f45488a.getValue()).intValue();
        if (1 <= iIntValue2 && iIntValue2 < 4) {
            dv.a aVar15 = dv.a.QUALITY_REASON;
            List list7 = nVar.U;
            boolean zIsEmpty2 = list7.isEmpty();
            ?? r63 = list7;
            if (zIsEmpty2) {
                r63 = cVar;
            }
            if (r63 != 0) {
                arrayList3 = new ArrayList(kotlin.collections.e0.o(r63, 10));
                Iterator it15 = r63.iterator();
                while (it15.hasNext()) {
                    arrayList3.add(((bp.s) it15.next()).name());
                }
            } else {
                arrayList3 = A;
            }
            bVar2.b(aVar15, arrayList3);
        }
        dv.a aVar16 = dv.a.FOOD_VARIETY;
        Object value7 = h1Var3.f45488a.getValue();
        if (((Number) value7).intValue() <= 0) {
            value7 = cVar;
        }
        Integer num7 = (Integer) value7;
        bVar2.b(aVar16, num7 != null ? Integer.valueOf(num7.intValue()) : A);
        int iIntValue3 = ((Number) h1Var3.f45488a.getValue()).intValue();
        if (1 <= iIntValue3 && iIntValue3 < 4) {
            dv.a aVar17 = dv.a.VARIETY_REASON;
            List list8 = nVar.W;
            boolean zIsEmpty3 = list8.isEmpty();
            ?? r64 = list8;
            if (zIsEmpty3) {
                r64 = cVar;
            }
            if (r64 != 0) {
                arrayList2 = new ArrayList(kotlin.collections.e0.o(r64, 10));
                Iterator it16 = r64.iterator();
                while (it16.hasNext()) {
                    arrayList2.add(((bp.s) it16.next()).name());
                }
            } else {
                arrayList2 = A;
            }
            bVar2.b(aVar17, arrayList2);
        }
        int iIntValue4 = ((Number) h1Var2.f45488a.getValue()).intValue();
        if (1 <= iIntValue4 && iIntValue4 < 4) {
            dv.a aVar18 = dv.a.QUANTITY_REASON;
            List list9 = nVar.Y;
            boolean zIsEmpty4 = list9.isEmpty();
            ?? r57 = list9;
            if (zIsEmpty4) {
                r57 = cVar;
            }
            if (r57 != 0) {
                arrayList = new ArrayList(kotlin.collections.e0.o(r57, 10));
                Iterator it17 = r57.iterator();
                while (it17.hasNext()) {
                    arrayList.add(((bp.s) it17.next()).name());
                }
            } else {
                arrayList = A;
            }
            bVar2.b(aVar18, arrayList);
        }
        dv.a aVar19 = dv.a.FOOD_QUANTITY;
        Object value8 = h1Var2.f45488a.getValue();
        if (((Number) value8).intValue() <= 0) {
            value8 = cVar;
        }
        Integer num8 = (Integer) value8;
        bVar2.b(aVar19, num8 != null ? Integer.valueOf(num8.intValue()) : A);
        if (cg.q(nVar.b())) {
            dv.a aVar20 = dv.a.WHY_THIS_BAG;
            List list10 = nVar.f4559b0;
            boolean zIsEmpty5 = list10.isEmpty();
            ?? r12 = list10;
            if (zIsEmpty5) {
                r12 = cVar;
            }
            if (r12 != 0) {
                A = new ArrayList(kotlin.collections.e0.o(r12, 10));
                Iterator it18 = r12.iterator();
                while (it18.hasNext()) {
                    A.add(((bp.s) it18.next()).name());
                }
            }
            bVar2.b(aVar20, A);
        }
        r92.c(cv.i.CORE_PURCHASE_RATED, bVar2);
        if (activity != null) {
            activity.setResult(128, intent);
        }
    }

    public static final void j(SortingChoice sortingChoice, boolean z11, Function2 function2, m3.n nVar, int i11) {
        int i12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1426962675);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(sortingChoice) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.g(z11) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(function2) ? 256 : 128;
        }
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = w.a0.g(sVar);
            }
            b2.l lVar = (b2.l) objM;
            float f11 = lv.t.f28252f;
            float f12 = lv.t.f28251e;
            b2 b2Var = new b2(f11, f12, f11, f12);
            l2.f fVarB = l2.g.b(8);
            b2 b2Var2 = g3.p.f19253a;
            g3.o oVarA = g3.p.a(z11 ? lv.s.f28217b : lv.s.f28245z, 0L, 0L, 0L, sVar, 14);
            boolean z12 = ((i12 & 896) == 256) | ((i12 & 14) == 4);
            Object objM2 = sVar.M();
            if (z12 || objM2 == fVar) {
                objM2 = new bs.b(8, function2, sortingChoice);
                sVar.k0(objM2);
            }
            g3.s0.a((Function0) objM2, b4.q.f5711a, false, fVarB, oVarA, null, null, b2Var, lVar, u3.e.e(-1597118179, sVar, new cn.a0(sortingChoice, z11, 0)), sVar, 918552624, 100);
            sVar = sVar;
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new m3(i11, 3, sortingChoice, function2, z11);
        }
    }

    public static final void k(SortingChoice sortingChoice, SortingChoice sortingChoice2, String str, Function2 function2, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1039005323);
        int i12 = i11 | (sVar.f(sortingChoice) ? 4 : 2);
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(sortingChoice2) ? 32 : 16;
        }
        int i13 = i12 | (sVar.f(str) ? 256 : 128) | (sVar.h(function2) ? 2048 : 1024);
        if (sVar.R(i13 & 1, (i13 & 1171) != 1170)) {
            float f11 = lv.t.f28253g;
            b4.q qVar = b4.q.f5711a;
            d2.c.f(m2.e(qVar, f11), sVar);
            d2.i2 i2VarA = d2.h2.a(d2.i.f13801a, b4.d.f5692j, sVar, 0);
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
            m3.i.C(i2VarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            boolean zAreEqual = Intrinsics.areEqual(str, sortingChoice.getId());
            int i14 = i13 & 7168;
            boolean z11 = i14 == 2048;
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (z11 || objM == fVar) {
                objM = new b3.n(5, function2);
                sVar.k0(objM);
            }
            j(sortingChoice, zAreEqual, (Function2) objM, sVar, i13 & 14);
            if (sortingChoice2 == null) {
                sVar.a0(1969244686);
                sVar.q(false);
            } else {
                sVar.a0(1969244687);
                d2.c.f(m2.q(qVar, f11), sVar);
                boolean zAreEqual2 = Intrinsics.areEqual(str, sortingChoice2.getId());
                boolean z12 = i14 == 2048;
                Object objM2 = sVar.M();
                if (z12 || objM2 == fVar) {
                    objM2 = new b3.n(6, function2);
                    sVar.k0(objM2);
                }
                j(sortingChoice2, zAreEqual2, (Function2) objM2, sVar, (i13 >> 3) & 14);
                sVar.q(false);
            }
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a3.t0(sortingChoice, sortingChoice2, i11, str, function2, 5);
        }
    }

    public static final void l(androidx.fragment.app.y yVar) {
        Window window;
        Dialog dialog = yVar.getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        DisplayMetrics displayMetrics = yVar.requireContext().getResources().getDisplayMetrics();
        window.setLayout((displayMetrics.widthPixels / 100) * 90, (displayMetrics.heightPixels / 100) * 80);
    }

    public static final void m(x80.w wVar, Throwable th2) {
        CancellationException cancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was consumed, consumer had failed");
            cancellationException.initCause(th2);
        }
        wVar.a(cancellationException);
    }

    public static void n(Class cls, Object obj) {
        if (obj != null) {
            return;
        }
        qc.y.g(cls.getCanonicalName(), " must be set");
    }

    public static void o(Object obj) {
        if (obj != null) {
            return;
        }
        c50.w.l("Cannot return null from a non-@Nullable @Provides method");
    }

    public static final void p(ha.a aVar) {
        aVar.getClass();
        v70.e eVarB = kotlin.collections.c0.b();
        ha.c cVarV0 = aVar.v0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cVarV0.q0()) {
            try {
                eVarB.add(cVarV0.W(0));
            } finally {
            }
        }
        w.b.y(cVarV0, null);
        ListIterator listIterator = kotlin.collections.c0.a(eVarB).listIterator(0);
        while (true) {
            v70.b bVar = (v70.b) listIterator;
            if (!bVar.hasNext()) {
                return;
            }
            String str = (String) bVar.next();
            if (kotlin.text.y.p(str, "room_fts_content_sync_", false)) {
                z20.b.m(aVar, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    public static Object q(Class cls, Object obj) {
        if (obj instanceof r70.a) {
            return cls.cast(obj);
        }
        if (obj instanceof r70.b) {
            return q(cls, ((r70.b) obj).a());
        }
        throw new IllegalStateException("Given component holder " + obj.getClass() + " does not implement " + r70.a.class + " or " + r70.b.class);
    }

    public static final Rect r(TextPaint textPaint, CharSequence charSequence, int i11, int i12) {
        int i13 = i11;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i13 - 1, i12, MetricAffectingSpan.class) != i12) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i13 < i12) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i13, i12, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i13, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        b6.a.o(textPaint2, charSequence, i13, iNextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i13, iNextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i13 = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            b6.a.o(textPaint, charSequence, i13, i12, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i13, i12, rect3);
        return rect3;
    }

    public static final CoroutineContext s(y9.v vVar, boolean z11, z70.c cVar) {
        y9.c0 c0Var = (y9.c0) cVar.getContext().get(y9.c0.f45655b);
        CoroutineContext coroutineContext = c0Var != null ? c0Var.f45656a : null;
        if (!vVar.l()) {
            CoroutineContext coroutineContextI = vVar.i();
            if (coroutineContext == null) {
                coroutineContext = kotlin.coroutines.g.f26549a;
            }
            return coroutineContextI.plus(coroutineContext);
        }
        if (coroutineContext != null) {
            return vVar.i().plus(coroutineContext);
        }
        if (!z11) {
            return vVar.i();
        }
        CoroutineContext coroutineContext2 = vVar.f45757b;
        if (coroutineContext2 != null) {
            return coroutineContext2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("transactionContext");
        return null;
    }

    public static String t() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "()";
    }

    public static String u() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    public static String v(Context context, int i11) {
        if (i11 == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i11);
        } catch (Exception unused) {
            return j4.s.f(i11, "?");
        }
    }

    public static String w(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public static void x(String str, Exception exc) throws Throwable {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = ((InvocationTargetException) exc).getCause();
            if (cause instanceof RuntimeException) {
                throw cause;
            }
            org.bouncycastle.jce.provider.a.m(cause);
            return;
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static final boolean y() throws Throwable {
        if (Build.VERSION.SDK_INT >= 29) {
            return b6.a.q();
        }
        try {
            if (f31770e == null) {
                f31769d = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f31770e = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            Method method = f31770e;
            if (method == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Object objInvoke = method.invoke(null, Long.valueOf(f31769d));
            objInvoke.getClass();
            return ((Boolean) objInvoke).booleanValue();
        } catch (Exception e5) {
            x("isTagEnabled", e5);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014d  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:62:0x0183
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final n4.b z(int r44, m3.n r45, int r46) {
        /*
            Method dump skipped, instruction units count: 1476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o00.x0.z(int, m3.n, int):n4.b");
    }
}
