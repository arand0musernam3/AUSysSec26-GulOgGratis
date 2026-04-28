package o30;

import a3.a3;
import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.core.view.ViewCompat;
import c5.q2;
import c5.x1;
import c5.x3;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsPlatformParams;
import com.app.tgtg.model.remote.item.ItemTag;
import com.app.tgtg.model.remote.item.ItemTagInfo;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.order.OrderType;
import com.braze.models.inappmessage.InAppMessageBase;
import d2.h2;
import d2.i2;
import d2.m2;
import d2.n1;
import g3.r9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m3.w1;
import m90.l1;
import m90.r1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.json.JSONArray;
import v1.y1;
import y80.h1;
import zendesk.messaging.android.internal.conversationscreen.TimeConstants;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f31879a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f31880b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f31881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f31882d = 0;

    public static final KClass A(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (serialDescriptor instanceof k90.b) {
            return ((k90.b) serialDescriptor).f26210b;
        }
        if (serialDescriptor instanceof l1) {
            return A(((l1) serialDescriptor).f29823a);
        }
        return null;
    }

    public static final KSerializer B(KSerializer kSerializer) {
        kSerializer.getClass();
        return kSerializer.getDescriptor().c() ? kSerializer : new m90.y0(kSerializer);
    }

    public static final m5.h C(r5.y yVar) {
        m5.h hVar = yVar.f37714a;
        long j9 = yVar.f37715b;
        hVar.getClass();
        return hVar.subSequence(m5.t0.g(j9), m5.t0.f(j9));
    }

    public static final m5.h D(r5.y yVar, int i11) {
        m5.h hVar = yVar.f37714a;
        m5.h hVar2 = yVar.f37714a;
        long j9 = yVar.f37715b;
        int iF = m5.t0.f(j9);
        int iF2 = m5.t0.f(j9);
        int length = iF2 + i11;
        if (((i11 ^ length) & (iF2 ^ length)) < 0) {
            length = hVar2.f29538b.length();
        }
        return hVar.subSequence(iF, Math.min(length, hVar2.f29538b.length()));
    }

    public static final m5.h E(r5.y yVar, int i11) {
        m5.h hVar = yVar.f37714a;
        long j9 = yVar.f37715b;
        int iG = m5.t0.g(j9);
        int i12 = iG - i11;
        if (((iG ^ i12) & (i11 ^ iG)) < 0) {
            i12 = 0;
        }
        return hVar.subSequence(Math.max(0, i12), m5.t0.g(j9));
    }

    public static boolean F(String str) {
        ya.b bVar = ya.k.f45793a;
        Set<ya.c> setUnmodifiableSet = Collections.unmodifiableSet(ya.c.f45782c);
        HashSet<ya.c> hashSet = new HashSet();
        for (ya.c cVar : setUnmodifiableSet) {
            if (cVar.f45783a.equals(str)) {
                hashSet.add(cVar);
            }
        }
        if (hashSet.isEmpty()) {
            a40.d0.k("Unknown feature ".concat(str));
            return false;
        }
        for (ya.c cVar2 : hashSet) {
            if (cVar2.a() || cVar2.b()) {
                return true;
            }
        }
        return false;
    }

    public static final String G(int i11, int i12, Object[] objArr, m3.n nVar) {
        return ((Resources) ((m3.s) nVar).j(c5.v0.f7391c)).getQuantityString(i11, i12, Arrays.copyOf(objArr, objArr.length));
    }

    public static final String H(int i11, m3.n nVar, int i12) {
        return ((Resources) ((m3.s) nVar).j(c5.v0.f7391c)).getQuantityString(i11, i12);
    }

    public static pd.r K(ia0.d0 d0Var) {
        int i11 = Integer.parseInt(d0Var.D(LongCompanionObject.MAX_VALUE));
        long j9 = Long.parseLong(d0Var.D(LongCompanionObject.MAX_VALUE));
        long j11 = Long.parseLong(d0Var.D(LongCompanionObject.MAX_VALUE));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i12 = Integer.parseInt(d0Var.D(LongCompanionObject.MAX_VALUE));
        for (int i13 = 0; i13 < i12; i13++) {
            String strD = d0Var.D(LongCompanionObject.MAX_VALUE);
            int iF = StringsKt.F(strD, ':', 0, false, 6);
            if (iF == -1) {
                i4.a.i("Unexpected header: ".concat(strD));
                return null;
            }
            String string = StringsKt.e0(strD.substring(0, iF)).toString();
            String strSubstring = strD.substring(iF + 1);
            String lowerCase = string.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Object arrayList = linkedHashMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lowerCase, arrayList);
            }
            ((List) arrayList).add(strSubstring);
        }
        return new pd.r(i11, j9, j11, new pd.p(kotlin.collections.x0.k(linkedHashMap)), null, null);
    }

    public static final void L(q1.e eVar, Function1 function1) {
        eVar.getClass();
        q1.e eVar2 = new q1.e(InAppMessageBase.INAPP_MESSAGE_DURATION_MIN_MILLIS);
        int i11 = eVar.f35782c;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            eVar2.put(eVar.g(i12), eVar.j(i12));
            i12++;
            i13++;
            if (i13 == 999) {
                function1.invoke(eVar2);
                eVar2.clear();
                i13 = 0;
            }
        }
        if (i13 > 0) {
            function1.invoke(eVar2);
        }
    }

    public static final void M(BooleanCompanionObject booleanCompanionObject) {
        booleanCompanionObject.getClass();
        m90.g gVar = m90.g.f29797a;
    }

    public static final void N(DoubleCompanionObject doubleCompanionObject) {
        doubleCompanionObject.getClass();
        m90.v vVar = m90.v.f29868a;
    }

    public static final void O(FloatCompanionObject floatCompanionObject) {
        floatCompanionObject.getClass();
        m90.c0 c0Var = m90.c0.f29762a;
    }

    public static final void P(IntCompanionObject intCompanionObject) {
        intCompanionObject.getClass();
        m90.l0 l0Var = m90.l0.f29821a;
    }

    public static final void Q(LongCompanionObject longCompanionObject) {
        longCompanionObject.getClass();
        m90.q0 q0Var = m90.q0.f29842a;
    }

    public static final void R(StringCompanionObject stringCompanionObject) {
        stringCompanionObject.getClass();
        r1 r1Var = r1.f29848a;
    }

    public static final void S(ComponentActivity componentActivity, boolean z11) {
        componentActivity.getClass();
        androidx.activity.r.a(componentActivity);
        if (z11) {
            View viewFindViewById = componentActivity.findViewById(R.id.content);
            viewFindViewById.getClass();
            ViewCompat.k0(viewFindViewById, new a40.d0());
        }
    }

    public static final String T(int i11, Object[] objArr, m3.n nVar) {
        return ((Resources) ((m3.s) nVar).j(c5.v0.f7391c)).getString(i11, Arrays.copyOf(objArr, objArr.length));
    }

    public static final String U(m3.n nVar, int i11) {
        return ((Resources) ((m3.s) nVar).j(c5.v0.f7391c)).getString(i11);
    }

    public static final s80.b V(Iterable iterable) {
        iterable.getClass();
        s80.b bVar = iterable instanceof s80.b ? (s80.b) iterable : null;
        if (bVar == null) {
            bVar = iterable instanceof t80.a ? (t80.a) iterable : null;
            if (bVar == null) {
                t80.d dVar = iterable instanceof t80.d ? (t80.d) iterable : null;
                t80.a aVarE = dVar != null ? dVar.e() : null;
                if (aVarE != null) {
                    return aVarE;
                }
                t80.g gVar = t80.g.f39858c;
                gVar.getClass();
                if (!(iterable instanceof Collection)) {
                    t80.d dVarD = gVar.d();
                    kotlin.collections.i0.s(iterable, dVarD);
                    return dVarD.e();
                }
                Collection collection = (Collection) iterable;
                Object[] objArr = gVar.f39859b;
                if (collection.isEmpty()) {
                    return gVar;
                }
                if (collection.size() + objArr.length > 32) {
                    t80.d dVarD2 = gVar.d();
                    dVarD2.addAll(collection);
                    return dVarD2.e();
                }
                Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
                int length = objArr.length;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    objArrCopyOf[length] = it.next();
                    length++;
                }
                return new t80.g(objArrCopyOf);
            }
        }
        return bVar;
    }

    public static final void W(int i11, String str, String str2) {
        throw new IllegalArgumentException("Expected " + str2 + " at index " + i11 + ", but was '" + str.charAt(i11) + '\'');
    }

    public static void X(pd.r rVar, ia0.c0 c0Var) {
        c0Var.s0(rVar.f34711a);
        c0Var.writeByte(10);
        c0Var.s0(rVar.f34712b);
        c0Var.writeByte(10);
        c0Var.s0(rVar.f34713c);
        c0Var.writeByte(10);
        Set<Map.Entry> setEntrySet = rVar.f34714d.f34706a.entrySet();
        Iterator it = setEntrySet.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((List) ((Map.Entry) it.next()).getValue()).size();
        }
        c0Var.s0(size);
        c0Var.writeByte(10);
        for (Map.Entry entry : setEntrySet) {
            for (String str : (List) entry.getValue()) {
                c0Var.M((String) entry.getKey());
                c0Var.M(":");
                c0Var.M(str);
                c0Var.writeByte(10);
            }
        }
    }

    public static final CoroutineContext Y(v80.x xVar) {
        int i11 = o00.q.f31736a;
        return xVar.plus(new o00.p(new o00.h(), false));
    }

    public static final void a(int i11, co.c cVar, boolean z11, yn.g gVar, Function0 function0, m3.n nVar, int i12) {
        int i13;
        l2.d dVar;
        float fD;
        float f11;
        float fD2;
        cVar.getClass();
        gVar.getClass();
        function0.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1337541254);
        int i14 = i12 | (sVar.d(i11) ? 4 : 2) | (sVar.d(cVar.ordinal()) ? 32 : 16) | (sVar.g(z11) ? 256 : 128) | (sVar.f(gVar) ? NewHope.SENDB_BYTES : 1024) | (sVar.h(function0) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192);
        if (sVar.R(i14 & 1, (i14 & 9363) != 9362)) {
            Object objM = sVar.M();
            if (objM == m3.m.f29332a) {
                objM = m3.i.w(new z5.l(0L));
                sVar.k0(objM);
            }
            m3.b1 b1Var = (m3.b1) objM;
            long jA = ((q2) ((x3) sVar.j(x1.f7427t))).a();
            int[] iArr = yn.c.$EnumSwitchMapping$0;
            int i15 = iArr[cVar.ordinal()];
            if (i15 == 1) {
                i13 = i14;
                sVar.a0(2015434844);
                z5.c cVar2 = (z5.c) sVar.j(x1.f7416h);
                cVar2.getClass();
                final Ref.FloatRef floatRef = new Ref.FloatRef();
                final Ref.FloatRef floatRef2 = new Ref.FloatRef();
                final Ref.FloatRef floatRef3 = new Ref.FloatRef();
                final Ref.FloatRef floatRef4 = new Ref.FloatRef();
                float f12 = 16;
                floatRef.element = cVar2.c0(f12);
                floatRef2.element = cVar2.c0(32);
                floatRef3.element = cVar2.c0(f12);
                floatRef4.element = cVar2.c0(72);
                final int i16 = 1;
                dVar = new l2.d(new i80.n() { // from class: oo.c
                    @Override // i80.n
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        i4.h hVar = (i4.h) obj;
                        h4.e eVar = (h4.e) obj2;
                        z5.m mVar = (z5.m) obj3;
                        switch (i16) {
                            case 0:
                                hVar.getClass();
                                mVar.getClass();
                                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (eVar.f21392a >> 32));
                                long j9 = eVar.f21392a;
                                h4.c cVarR = na0.a.R(jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j9 & 4294967295L)))) & 4294967295L));
                                float f13 = floatRef.element;
                                i4.h.c(hVar, nx.d.l((((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(f13)) & 4294967295L), cVarR));
                                int i17 = (int) (j9 >> 32);
                                float fIntBitsToFloat2 = Float.intBitsToFloat(i17);
                                Ref.FloatRef floatRef5 = floatRef4;
                                hVar.f(fIntBitsToFloat2, floatRef5.element);
                                float fIntBitsToFloat3 = Float.intBitsToFloat(i17) + floatRef3.element;
                                float f14 = floatRef5.element;
                                Ref.FloatRef floatRef6 = floatRef2;
                                hVar.e(fIntBitsToFloat3, (floatRef6.element / 2) + f14);
                                hVar.e(Float.intBitsToFloat(i17), floatRef5.element + floatRef6.element);
                                break;
                            default:
                                hVar.getClass();
                                mVar.getClass();
                                h4.c cVarR2 = na0.a.R((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (eVar.f21392a >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (eVar.f21392a & 4294967295L)))) & 4294967295L));
                                float f15 = floatRef.element;
                                i4.h.c(hVar, nx.d.l((((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L), cVarR2));
                                Ref.FloatRef floatRef7 = floatRef4;
                                hVar.f(0.0f, floatRef7.element);
                                float f16 = -floatRef3.element;
                                float f17 = floatRef7.element;
                                Ref.FloatRef floatRef8 = floatRef2;
                                hVar.e(f16, (floatRef8.element / 2) + f17);
                                hVar.e(0.0f, floatRef7.element + floatRef8.element);
                                break;
                        }
                        return Unit.f26487a;
                    }
                });
                sVar.q(false);
            } else {
                if (i15 != 2) {
                    throw e0.f.v(sVar, -1181913493, false);
                }
                sVar.a0(2015572670);
                z5.c cVar3 = (z5.c) sVar.j(x1.f7416h);
                cVar3.getClass();
                final Ref.FloatRef floatRef5 = new Ref.FloatRef();
                final Ref.FloatRef floatRef6 = new Ref.FloatRef();
                final Ref.FloatRef floatRef7 = new Ref.FloatRef();
                final Ref.FloatRef floatRef8 = new Ref.FloatRef();
                float f13 = 16;
                i13 = i14;
                floatRef5.element = cVar3.c0(f13);
                floatRef6.element = cVar3.c0(32);
                floatRef7.element = cVar3.c0(f13);
                floatRef8.element = cVar3.c0(72);
                final int i17 = 0;
                dVar = new l2.d(new i80.n() { // from class: oo.c
                    @Override // i80.n
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        i4.h hVar = (i4.h) obj;
                        h4.e eVar = (h4.e) obj2;
                        z5.m mVar = (z5.m) obj3;
                        switch (i17) {
                            case 0:
                                hVar.getClass();
                                mVar.getClass();
                                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (eVar.f21392a >> 32));
                                long j9 = eVar.f21392a;
                                h4.c cVarR = na0.a.R(jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j9 & 4294967295L)))) & 4294967295L));
                                float f132 = floatRef5.element;
                                i4.h.c(hVar, nx.d.l((((long) Float.floatToRawIntBits(f132)) << 32) | (((long) Float.floatToRawIntBits(f132)) & 4294967295L), cVarR));
                                int i172 = (int) (j9 >> 32);
                                float fIntBitsToFloat2 = Float.intBitsToFloat(i172);
                                Ref.FloatRef floatRef52 = floatRef8;
                                hVar.f(fIntBitsToFloat2, floatRef52.element);
                                float fIntBitsToFloat3 = Float.intBitsToFloat(i172) + floatRef7.element;
                                float f14 = floatRef52.element;
                                Ref.FloatRef floatRef62 = floatRef6;
                                hVar.e(fIntBitsToFloat3, (floatRef62.element / 2) + f14);
                                hVar.e(Float.intBitsToFloat(i172), floatRef52.element + floatRef62.element);
                                break;
                            default:
                                hVar.getClass();
                                mVar.getClass();
                                h4.c cVarR2 = na0.a.R((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (eVar.f21392a >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (eVar.f21392a & 4294967295L)))) & 4294967295L));
                                float f15 = floatRef5.element;
                                i4.h.c(hVar, nx.d.l((((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L), cVarR2));
                                Ref.FloatRef floatRef72 = floatRef8;
                                hVar.f(0.0f, floatRef72.element);
                                float f16 = -floatRef7.element;
                                float f17 = floatRef72.element;
                                Ref.FloatRef floatRef82 = floatRef6;
                                hVar.e(f16, (floatRef82.element / 2) + f17);
                                hVar.e(0.0f, floatRef72.element + floatRef82.element);
                                break;
                        }
                        return Unit.f26487a;
                    }
                });
                sVar.q(false);
            }
            int i18 = iArr[cVar.ordinal()];
            if (i18 == 1) {
                fD = z11 ? d70.b.d(96) : d70.b.d(64);
            } else {
                if (i18 != 2) {
                    e40.a.f();
                    return;
                }
                if (z11) {
                    f11 = ((int) (jA >> 32)) - ((int) (((z5.l) b1Var.getValue()).f47286a >> 32));
                    fD2 = d70.b.d(96);
                } else {
                    f11 = ((int) (jA >> 32)) - ((int) (((z5.l) b1Var.getValue()).f47286a >> 32));
                    fD2 = d70.b.d(64);
                }
                fD = f11 - fD2;
            }
            d6.r.b(null, (((long) ((int) fD)) << 32) | (((long) ((int) ((i11 - d70.b.d(82)) + d70.b.d(23)))) & 4294967295L), function0, null, u3.e.e(906486877, sVar, new lp.v(dVar, b1Var, function0, gVar)), sVar, ((i13 >> 6) & 896) | 24576, 9);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.m(i11, cVar, z11, gVar, function0, i12);
        }
    }

    public static final void b(boolean z11, m3.n nVar, int i11) {
        int i12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1587442958);
        int i13 = 2;
        if ((i11 & 6) == 0) {
            i12 = (sVar.g(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        byte b8 = 0;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            r(com.app.tgtg.R.drawable.system_icon_popup_truck, z11 ? com.app.tgtg.R.string.blob_tooltip_next_day_delivery_explanation : com.app.tgtg.R.string.blob_tooltip_catering_explanation, sVar, 0);
            r(com.app.tgtg.R.drawable.gfx_whats_next_cancel, com.app.tgtg.R.string.blob_tooltip_catering_explanation_cancellation, sVar, 0);
            r(com.app.tgtg.R.drawable.system_icon_popup_frying_pan, com.app.tgtg.R.string.blob_tooltip_catering_explanation_keeping_it_fresh, sVar, 0);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new hg.d(z11, i11, i13, b8);
        }
    }

    public static final void c(m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1505811439);
        int i12 = 1;
        if (sVar.R(i11 & 1, i11 != 0)) {
            r(com.app.tgtg.R.drawable.system_icon_popup_clock, com.app.tgtg.R.string.banner_pickup_window_explanation_charity, sVar, 0);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new yn.a(i11, i12);
        }
    }

    public static final void d(String str, String str2, boolean z11, m3.n nVar, int i11) {
        m3.s sVar;
        b4.q qVar;
        b4.i iVar;
        boolean z12;
        b4.i iVar2 = b4.d.f5695n;
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(27171354);
        int i12 = i11 | (sVar2.f(str) ? 4 : 2) | (sVar2.f(str2) ? 32 : 16) | (sVar2.g(z11) ? 256 : 128);
        if (sVar2.R(i12 & 1, (i12 & 147) != 146)) {
            float f11 = z11 ? lv.t.f28257k : 96;
            b4.q qVar2 = b4.q.f5711a;
            b4.t tVarA = d2.c.A(m2.d(qVar2, 1.0f), lv.t.f28253g, f11);
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar2, 0);
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
            m3.i.C(yVarA, b5.i.f5843f, sVar2);
            m3.i.C(iVarL, b5.i.f5842e, sVar2);
            m3.i.v(sVar2, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar2, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar2);
            if (str == null) {
                sVar2.a0(605435512);
                sVar2.q(false);
                iVar = iVar2;
                sVar = sVar2;
                qVar = qVar2;
                z12 = false;
            } else {
                sVar2.a0(605435513);
                qVar = qVar2;
                iVar = iVar2;
                r9.d(str, new d2.w0(iVar2), lv.s.C, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28265d, sVar2, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
                sVar = sVar2;
                z12 = false;
                sVar.q(false);
            }
            if (str2 == null) {
                sVar.a0(605742629);
                sVar.q(z12);
            } else {
                sVar.a0(605742630);
                d2.c.f(m2.m(qVar, lv.t.f28252f), sVar);
                m3.s sVar3 = sVar;
                r9.d(str2, new d2.w0(iVar), lv.s.C, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28276p, sVar3, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
                sVar = sVar3;
                sVar.q(false);
            }
            sVar.q(true);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.d(str, str2, z11, i11, 1);
        }
    }

    public static final void e(BasicItem basicItem, m3.n nVar, int i11) {
        basicItem.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-826342587);
        int i12 = i11 | (sVar.h(basicItem) ? 4 : 2);
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            String purchaseEnd = basicItem.getPurchaseEnd();
            String strS = rk.e.S(purchaseEnd != null ? Long.valueOf(mv.p0.h(purchaseEnd)) : null, sVar);
            List listSplit$default = StringsKt__StringsKt.split$default(U(sVar, com.app.tgtg.R.string.item_view_ending_soon_timer_text), new String[]{"%1$s"}, false, 0, 6, null);
            m5.e eVar = new m5.e();
            int i13 = eVar.i(lv.v.f28274n.f29655a);
            try {
                String str = (String) CollectionsKt.Q(0, listSplit$default);
                if (str == null) {
                    str = "";
                }
                eVar.c(str);
                eVar.g(i13);
                i13 = eVar.i(lv.v.f28275o.f29655a);
                try {
                    eVar.c(strS);
                    eVar.g(i13);
                    int size = listSplit$default.size();
                    for (int i14 = 1; i14 < size; i14++) {
                        i13 = eVar.i(lv.v.f28274n.f29655a);
                        try {
                            eVar.c((String) listSplit$default.get(i14));
                            eVar.g(i13);
                        } finally {
                        }
                    }
                    m5.h hVarJ = eVar.j();
                    float f11 = lv.t.f28254h;
                    b4.q qVar = b4.q.f5711a;
                    d2.c.f(m2.e(qVar, f11), sVar);
                    b4.t tVarJ = v1.n.j(m2.d(qVar, 1.0f), lv.s.f28233n, l2.g.b(12));
                    float f12 = lv.t.f28251e;
                    b4.t tVarZ = d2.c.z(tVarJ, f12);
                    i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
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
                    m3.i.C(i2VarA, b5.i.f5843f, sVar);
                    m3.i.C(iVarL, b5.i.f5842e, sVar);
                    m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
                    m3.i.z(sVar, b5.i.f5845h);
                    m3.i.C(tVarC, b5.i.f5841d, sVar);
                    v1.n.d(o00.x0.z(com.app.tgtg.R.drawable.system_icon_clock_outline, sVar, 0), null, null, null, null, 0.0f, new i4.o(lv.s.f28231k, 5), sVar, 1572920, 60);
                    d2.c.f(m2.m(qVar, lv.t.f28249c), sVar);
                    if (1.0f <= 0.0d) {
                        e2.a.a("invalid weight; must be greater than zero");
                    }
                    r9.e(hVarJ, new n1(1.0f, true), lv.s.C, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, null, m5.u0.a(lv.v.f28274n, 0L, 0L, null, null, 0L, null, 0, 0L, null, null, 16777151), sVar, MLKEMEngine.KyberPolyBytes, 0, 262136);
                    sVar = sVar;
                    b3.i.y(qVar, f12, sVar, true);
                } finally {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new rk.r(basicItem, i11, 6);
        }
    }

    public static final void f(OrderType orderType, boolean z11, boolean z12, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-8144549);
        int i12 = (sVar.d(orderType.ordinal()) ? 4 : 2) | i11 | (sVar.g(z11) ? 32 : 16) | (sVar.g(z12) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            int i13 = yn.c.$EnumSwitchMapping$1[orderType.ordinal()];
            if (i13 == 1) {
                sVar.a0(763028071);
                l(sVar, 0);
                sVar.q(false);
            } else if (i13 == 2) {
                sVar.a0(763029416);
                c(sVar, 0);
                sVar.q(false);
            } else if (i13 != 3) {
                sVar.a0(763032433);
                i(z11, sVar, (i12 >> 3) & 14);
                sVar.q(false);
            } else {
                sVar.a0(763030844);
                b(z12, sVar, (i12 >> 6) & 14);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new yn.b(orderType, z11, z12, i11, 0);
        }
    }

    public static final long g(int i11) {
        if (!(i11 > 0)) {
            c2.a.a("The span value should be higher than 0");
        }
        return i11;
    }

    public static final void h(b4.t tVar, ArrayList arrayList, boolean z11, i80.n nVar, long j9, boolean z12, Function0 function0, m3.n nVar2, int i11) {
        boolean z13;
        Function0 function02;
        y1 y1Var;
        m3.b1 b1Var;
        m3.s sVar = (m3.s) nVar2;
        sVar.c0(1147311498);
        int i12 = (i11 & 6) == 0 ? (sVar.f(tVar) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(arrayList) ? 32 : 16;
        }
        boolean z14 = z11;
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.g(z14) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(nVar) ? NewHope.SENDB_BYTES : 1024;
        }
        long j11 = j9;
        if ((i11 & 24576) == 0) {
            i12 |= sVar.e(j11) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i11) == 0) {
            z13 = z12;
            i12 |= sVar.g(z13) ? 131072 : 65536;
        } else {
            z13 = z12;
        }
        if ((1572864 & i11) == 0) {
            function02 = function0;
            i12 |= sVar.h(function02) ? 1048576 : 524288;
        } else {
            function02 = function0;
        }
        if (sVar.R(i12 & 1, (599187 & i12) != 599186)) {
            y1 y1VarQ = v1.n.q(sVar);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.o(kotlin.coroutines.g.f26549a, sVar);
                sVar.k0(objM);
            }
            v80.b0 b0Var = (v80.b0) objM;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = m3.i.w(Float.valueOf(0.0f));
                sVar.k0(objM2);
            }
            m3.b1 b1Var2 = (m3.b1) objM2;
            Boolean boolValueOf = Boolean.valueOf(z13);
            boolean zH = ((i12 & 458752) == 131072) | sVar.h(b0Var) | sVar.f(y1VarQ) | ((3670016 & i12) == 1048576);
            Object objM3 = sVar.M();
            if (zH || objM3 == fVar) {
                il.b bVar = new il.b(z13, b0Var, y1VarQ, function02, b1Var2, (x70.c) null);
                y1Var = y1VarQ;
                b1Var = b1Var2;
                sVar.k0(bVar);
                objM3 = bVar;
            } else {
                y1Var = y1VarQ;
                b1Var = b1Var2;
            }
            m3.i.h(boolValueOf, (Function2) objM3, sVar);
            b4.t tVarR = v1.n.r(tVar, y1Var, true);
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
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
            m3.i.C(yVarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            sVar.a0(553961406);
            int i13 = 0;
            for (Object obj : arrayList) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    kotlin.collections.d0.n();
                    throw null;
                }
                jl.c cVar = (jl.c) obj;
                Object objM4 = sVar.M();
                if (objM4 == fVar) {
                    objM4 = new a3.p0(b1Var, 13);
                    sVar.k0(objM4);
                }
                b4.t tVarO = z4.c0.o(b4.q.f5711a, (Function1) objM4);
                boolean zH2 = ((i12 & 7168) == 2048) | sVar.h(cVar);
                Object objM5 = sVar.M();
                if (zH2 || objM5 == fVar) {
                    objM5 = new gn.i(18, nVar, cVar);
                    sVar.k0(objM5);
                }
                e0.j(tVarO, cVar, z14, (Function2) objM5, sVar, (i12 & 896) | 6);
                if (i13 != arrayList.size() - 1) {
                    sVar.a0(-230270879);
                    g3.s0.g(null, 0.0f, j11, sVar, (i12 >> 6) & 896, 3);
                    sVar.q(false);
                } else {
                    sVar.a0(-230202648);
                    sVar.q(false);
                }
                z14 = z11;
                j11 = j9;
                i13 = i14;
            }
            sVar.q(false);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new fg.h(tVar, arrayList, z11, nVar, j9, z12, function0, i11);
        }
    }

    public static final void i(boolean z11, m3.n nVar, int i11) {
        int i12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1507897614);
        if ((i11 & 6) == 0) {
            i12 = (sVar.g(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        int i13 = 1;
        byte b8 = 0;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            if (z11) {
                sVar.a0(714930510);
                r(com.app.tgtg.R.drawable.system_icon_popup_surprise, com.app.tgtg.R.string.blob_tooltip_surprise_bag_explanation, sVar, 0);
                sVar.q(false);
            } else {
                sVar.a0(715090036);
                sVar.q(false);
            }
            r(com.app.tgtg.R.drawable.system_icon_popup_clock, com.app.tgtg.R.string.blob_tooltip_collection_time_explanation, sVar, 0);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new hg.d(z11, i11, i13, b8);
        }
    }

    public static final m90.f0 j(KSerializer kSerializer, KSerializer kSerializer2) {
        kSerializer.getClass();
        kSerializer2.getClass();
        return new m90.f0(kSerializer, kSerializer2, 1);
    }

    public static final void k(int i11, m3.n nVar, int i12) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(624008207);
        int i13 = i12 | (sVar.d(i11) ? 4 : 2);
        if (sVar.R(i13 & 1, (i13 & 3) != 2)) {
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.q qVar = b4.q.f5711a;
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
            float f11 = lv.t.f28253g;
            d2.c.f(m2.m(qVar, f11), sVar);
            r9.d(H(com.app.tgtg.R.plurals.blob_tooltip_minor_explanation, sVar, i11), null, 0L, 0L, null, 0L, null, new x5.k(5), 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar, 0, 12582912, 130046);
            sVar = sVar;
            sVar.q(true);
            d2.c.f(m2.m(qVar, f11), sVar);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new on.j(i11, i12, 19);
        }
    }

    public static final void l(m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(940031972);
        int i12 = 0;
        if (sVar.R(i11 & 1, i11 != 0)) {
            r(com.app.tgtg.R.drawable.system_icon_popup_surprise, com.app.tgtg.R.string.mnu_post_purchase_body1, sVar, 0);
            r(com.app.tgtg.R.drawable.system_icon_popup_clock, com.app.tgtg.R.string.mnu_post_purchase_body2, sVar, 0);
            r(com.app.tgtg.R.drawable.gfx_whats_next_cancel, com.app.tgtg.R.string.mnu_post_purchase_body3, sVar, 0);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new yn.a(i11, i12);
        }
    }

    public static final void m(OrderType orderType, boolean z11, boolean z12, m3.n nVar, int i11) {
        OrderType orderType2;
        m3.s sVar;
        boolean z13 = z11;
        orderType.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-1324327373);
        int i12 = i11 | (sVar2.d(orderType.ordinal()) ? 4 : 2) | (sVar2.g(z13) ? 32 : 16) | (sVar2.g(z12) ? 256 : 128);
        if (sVar2.R(i12 & 1, (i12 & 147) != 146)) {
            b4.q qVar = b4.q.f5711a;
            b4.t tVarD = m2.d(qVar, 1.0f);
            float f11 = lv.t.f28253g;
            r9.d(U(sVar2, com.app.tgtg.R.string.banner_whats_next), d2.c.w(tVarD, 0.0f, -f11, 1), 0L, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28271j, sVar2, 48, 12582912, 130044);
            sVar = sVar2;
            d2.c.f(m2.m(qVar, f11), sVar);
            int i13 = i12 & 1022;
            orderType2 = orderType;
            z13 = z11;
            f(orderType2, z13, z12, sVar, i13);
        } else {
            orderType2 = orderType;
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new yn.b(orderType2, z13, z12, i11, 1);
        }
    }

    public static final void n(int i11, b4.t tVar, Order order, Function0 function0, m3.n nVar) {
        String strJ;
        tVar.getClass();
        order.getClass();
        function0.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-879831445);
        int i12 = i11 | (sVar.h(order) ? 32 : 16) | (sVar.d(com.app.tgtg.R.string.profile_page_orders_card_item_cta_counter) ? 256 : 128) | (sVar.d(com.app.tgtg.R.string.profile_page_orders_card_item_cta_collect) ? NewHope.SENDB_BYTES : 1024) | (sVar.h(function0) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192);
        if (sVar.R(i12 & 1, (i12 & 9363) != 9362)) {
            androidx.lifecycle.n1 n1Var = new androidx.lifecycle.n1(order);
            m3.b1 b1VarN = m3.i.n((h1) n1Var.f3501c, sVar, 0);
            m3.b1 b1VarN2 = m3.i.n((h1) n1Var.f3503e, sVar, 0);
            if (((Number) b1VarN.getValue()).longValue() > 0) {
                sVar.a0(1127248367);
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                strJ = String.format(U(sVar, com.app.tgtg.R.string.profile_page_orders_card_item_cta_counter), Arrays.copyOf(new Object[]{String.format(Locale.getDefault(), "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(((Number) b1VarN.getValue()).longValue() / 3600000), Long.valueOf((((Number) b1VarN.getValue()).longValue() / TimeConstants.ONE_MINUTE_DIFFERENCE) - TimeUnit.HOURS.toMinutes(((Number) b1VarN.getValue()).longValue() / 3600000)), Long.valueOf((((Number) b1VarN.getValue()).longValue() / 1000) - TimeUnit.MINUTES.toSeconds(((Number) b1VarN.getValue()).longValue() / TimeConstants.ONE_MINUTE_DIFFERENCE))}, 3))}, 1));
                sVar.q(false);
            } else {
                strJ = b3.i.j(1127817093, com.app.tgtg.R.string.profile_page_orders_card_item_cta_collect, sVar, sVar, false);
            }
            boolean zBooleanValue = ((Boolean) b1VarN2.getValue()).booleanValue();
            boolean z11 = (i12 & 57344) == 16384;
            Object objM = sVar.M();
            if (z11 || objM == m3.m.f29332a) {
                objM = new rr.a(22, function0);
                sVar.k0(objM);
            }
            v0.n.l(tVar, strJ, null, null, null, zBooleanValue, false, null, null, (Function0) objM, sVar, 6, 476);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ii.n(tVar, order, function0, i11, 1);
        }
    }

    public static final void o(int i11, m3.n nVar, int i12) {
        int i13;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(658102800);
        int i14 = i12 | (sVar.d(i11) ? 4 : 2);
        if (sVar.R(i14 & 1, (i14 & 3) != 2)) {
            b4.q qVar = b4.q.f5711a;
            b4.t tVarD = m2.d(qVar, 1.0f);
            float f11 = lv.t.f28253g;
            r9.d(H(com.app.tgtg.R.plurals.banner_popup_alt_title, sVar, i11), d2.c.w(tVarD, 0.0f, -f11, 1), 0L, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28271j, sVar, 48, 12582912, 130044);
            sVar = sVar;
            d2.c.f(m2.m(qVar, f11), sVar);
            i13 = i11;
            k(i13, sVar, i14 & 14);
        } else {
            i13 = i11;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new on.j(i13, i12, 18);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p(com.app.tgtg.model.remote.item.response.BasicItem r28, m3.n r29, int r30) {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o30.f0.p(com.app.tgtg.model.remote.item.response.BasicItem, m3.n, int):void");
    }

    public static final void q(nk.e eVar, m3.n nVar, int i11) {
        eVar.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1987586067);
        int i12 = i11 | (sVar.h(eVar) ? 4 : 2);
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            ItemTagInfo itemTagInfo = eVar.f30985a;
            BasicItem basicItem = eVar.f30986b;
            Integer numValueOf = itemTagInfo.getId() == ItemTag.GENERIC ? Integer.valueOf(itemTagInfo.getVariant().getResId()) : itemTagInfo.getId().getDrawable();
            r9.d(itemTagInfo.getShortText(), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28271j, sVar, 0, 12582912, 131070);
            float f11 = lv.t.f28254h;
            b4.q qVar = b4.q.f5711a;
            d2.c.f(m2.e(qVar, f11), sVar);
            if (numValueOf == null) {
                sVar.a0(-1757010502);
                sVar.q(false);
            } else {
                sVar.a0(-1757010501);
                v1.n.d(o00.x0.z(numValueOf.intValue(), sVar, 0), null, null, null, null, 0.0f, null, sVar, 56, 124);
                sVar.q(false);
            }
            d2.c.f(m2.e(qVar, lv.t.f28253g), sVar);
            String description = itemTagInfo.getDescription();
            if (description == null) {
                description = "";
            }
            r9.d(description, null, 0L, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar, 0, 12582912, 130046);
            sVar = sVar;
            if (itemTagInfo.getId() == ItemTag.SOLD_OUT) {
                sVar.a0(-1756659922);
                p(basicItem, sVar, 0);
                sVar.q(false);
            } else if (itemTagInfo.getId() == ItemTag.ENDING_SOON) {
                sVar.a0(-1756571386);
                e(basicItem, sVar, 0);
                sVar.q(false);
            } else {
                sVar.a0(-1756526219);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new pm.m(eVar, i11, 11);
        }
    }

    public static final void r(int i11, int i12, m3.n nVar, int i13) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-2066199429);
        int i14 = i13 | (sVar.d(i11) ? 4 : 2) | (sVar.d(i12) ? 32 : 16);
        if (sVar.R(i14 & 1, (i14 & 19) != 18)) {
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.q qVar = b4.q.f5711a;
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
            v1.n.d(o00.x0.z(i11, sVar, i14 & 14), null, null, null, null, 0.0f, null, sVar, 56, 124);
            float f11 = lv.t.f28253g;
            r9.d(r8.k.f(f11, i12, qVar, sVar, sVar), null, 0L, 0L, null, 0L, null, new x5.k(5), 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar, 0, 12582912, 130046);
            sVar = sVar;
            sVar.q(true);
            d2.c.f(m2.m(qVar, f11), sVar);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new oo.v(i11, i12, i13, 3);
        }
    }

    public static ax.h0 s(String str, ax.b bVar, String str2) {
        String str3;
        if (str == null) {
            return null;
        }
        String str4 = ax.h0.f4915j;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        int i11 = 1;
        ax.h0 h0VarZ = qb.e.z(bVar, String.format(Locale.US, "%s/app_indexing", Arrays.copyOf(new Object[]{str2}, 1)), null, null);
        Bundle bundle = h0VarZ.f4920d;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("tree", str);
        Context contextA = ax.a0.a();
        try {
            str3 = contextA.getPackageManager().getPackageInfo(contextA.getPackageName(), 0).versionName;
            str3.getClass();
        } catch (PackageManager.NameNotFoundException unused) {
            str3 = "";
        }
        bundle.putString("app_version", str3);
        bundle.putString("platform", AnalyticsPlatformParams.channel);
        bundle.putString("request_type", "app_indexing");
        if (Intrinsics.areEqual("app_indexing", "app_indexing")) {
            bundle.putString("device_session_id", ex.d.a());
        }
        h0VarZ.f4920d = bundle;
        h0VarZ.j(new dx.e(i11));
        return h0VarZ;
    }

    public static StaticLayout w(CharSequence charSequence, TextPaint textPaint, int i11, int i12, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i13, TextUtils.TruncateAt truncateAt, int i14, int i15, boolean z11, int i16, int i17, int i18, int i19) {
        if (i12 < 0) {
            s5.a.a("invalid start value");
        }
        int length = charSequence.length();
        if (i12 < 0 || i12 > length) {
            s5.a.a("invalid end value");
        }
        if (i13 < 0) {
            s5.a.a("invalid maxLines value");
        }
        if (i11 < 0) {
            s5.a.a("invalid width value");
        }
        if (i14 < 0) {
            s5.a.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, i12, textPaint, i11);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i13);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i14);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(z11);
        builderObtain.setBreakStrategy(i16);
        builderObtain.setHyphenationFrequency(i19);
        builderObtain.setIndents(null, null);
        builderObtain.setJustificationMode(i15);
        int i21 = Build.VERSION.SDK_INT;
        if (i21 >= 28) {
            a3.G(builderObtain);
        }
        if (i21 >= 33) {
            a70.a.s(builderObtain, i17, i18);
        }
        if (i21 >= 35) {
            j7.a.a(builderObtain);
        }
        return builderObtain.build();
    }

    public static final void x(Throwable th2) {
        HashMap map;
        tx.t tVar;
        if (!f31881c || th2 == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        StackTraceElement[] stackTrace = th2.getStackTrace();
        stackTrace.getClass();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            className.getClass();
            synchronized (tx.w.f40571a) {
                map = tx.w.f40572b;
                if (map.isEmpty()) {
                    map.put(tx.t.AAM, new String[]{"com.facebook.appevents.aam."});
                    map.put(tx.t.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
                    map.put(tx.t.CloudBridge, new String[]{"com.facebook.appevents.cloudbridge."});
                    map.put(tx.t.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
                    map.put(tx.t.AnrReport, new String[]{"com.facebook.internal.instrument.anrreport."});
                    map.put(tx.t.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
                    map.put(tx.t.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
                    map.put(tx.t.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
                    map.put(tx.t.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
                    map.put(tx.t.ProtectedMode, new String[]{"com.facebook.appevents.integrity.ProtectedModeManager"});
                    map.put(tx.t.MACARuleMatching, new String[]{"com.facebook.appevents.integrity.MACARuleMatchingManager"});
                    map.put(tx.t.BlocklistEvents, new String[]{"com.facebook.appevents.integrity.BlocklistEventsManager"});
                    map.put(tx.t.FilterRedactedEvents, new String[]{"com.facebook.appevents.integrity.RedactedEventsManager"});
                    map.put(tx.t.FilterSensitiveParams, new String[]{"com.facebook.appevents.integrity.SensitiveParamsManager"});
                    map.put(tx.t.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
                    map.put(tx.t.OnDeviceEventProcessing, new String[]{"com.facebook.appevents.ondeviceprocessing."});
                    map.put(tx.t.IapLogging, new String[]{"com.facebook.appevents.iap."});
                    map.put(tx.t.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
                    map.put(tx.t.GPSARATriggers, new String[]{"com.facebook.appevents.gps.ara.GpsARAManager"});
                    map.put(tx.t.GPSPACAProcessing, new String[]{"com.facebook.appevents.gps.pa.PACustomAudienceClient"});
                    map.put(tx.t.GPSTopicsObservation, new String[]{"com.facebook.appevents.gps.topics.GpsTopicsManager"});
                }
            }
            Iterator it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    tVar = tx.t.Unknown;
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                tVar = (tx.t) entry.getKey();
                for (String str : (String[]) entry.getValue()) {
                    if (kotlin.text.y.p(className, str, false)) {
                        break;
                    }
                }
            }
            if (tVar != tx.t.Unknown) {
                tVar.getClass();
                ax.a0.a().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString("FBSDKFeature" + tVar, "18.2.3").apply();
                hashSet.add(tVar.toString());
            }
        }
        ax.a0 a0Var = ax.a0.f4849a;
        if (!ax.s0.c() || hashSet.isEmpty()) {
            return;
        }
        JSONArray jSONArray = new JSONArray((Collection) hashSet);
        vx.d dVar = new vx.d();
        dVar.f42529b = vx.b.Analysis;
        Long lValueOf = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        dVar.f42534g = lValueOf;
        dVar.f42530c = jSONArray;
        StringBuffer stringBuffer = new StringBuffer("analysis_log_");
        stringBuffer.append(String.valueOf(lValueOf));
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        string.getClass();
        dVar.f42528a = string;
        dVar.b();
    }

    public static final void y(long j9, byte[] bArr, int i11, int i12, int i13) {
        int i14 = 7 - i12;
        int i15 = 8 - i13;
        if (i15 > i14) {
            return;
        }
        while (true) {
            int i16 = kotlin.text.d.f26597a[(int) ((j9 >> (i14 << 3)) & 255)];
            int i17 = i11 + 1;
            bArr[i11] = (byte) (i16 >> 8);
            i11 += 2;
            bArr[i17] = (byte) i16;
            if (i14 == i15) {
                return;
            } else {
                i14--;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[Catch: all -> 0x0076, TRY_LEAVE, TryCatch #1 {, blocks: (B:6:0x0010, B:8:0x0016, B:15:0x0036, B:17:0x003c, B:24:0x005e, B:23:0x005b, B:14:0x0033, B:11:0x002f, B:20:0x0057), top: B:39:0x0010, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String z(android.content.Context r6) {
        /*
            r6.getClass()
            java.lang.String r0 = "XZ"
            java.lang.String r1 = bx.m.a()
            if (r1 != 0) goto L7c
            java.lang.Object r1 = bx.m.c()
            monitor-enter(r1)
            java.lang.String r2 = bx.m.a()     // Catch: java.lang.Throwable -> L76
            if (r2 != 0) goto L78
            java.lang.String r2 = "com.facebook.sdk.appEventPreferences"
            r3 = 0
            android.content.SharedPreferences r2 = r6.getSharedPreferences(r2, r3)     // Catch: java.lang.Throwable -> L76
            java.lang.String r4 = "anonymousAppDeviceGUID"
            r5 = 0
            java.lang.String r2 = r2.getString(r4, r5)     // Catch: java.lang.Throwable -> L76
            java.lang.Class<bx.m> r4 = bx.m.class
            java.util.Set r5 = yx.a.f46339a     // Catch: java.lang.Throwable -> L76
            boolean r5 = r5.contains(r4)     // Catch: java.lang.Throwable -> L76
            if (r5 == 0) goto L2f
            goto L36
        L2f:
            bx.m.f6738g = r2     // Catch: java.lang.Throwable -> L32
            goto L36
        L32:
            r2 = move-exception
            yx.a.a(r4, r2)     // Catch: java.lang.Throwable -> L76
        L36:
            java.lang.String r2 = bx.m.a()     // Catch: java.lang.Throwable -> L76
            if (r2 != 0) goto L78
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L76
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L76
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L76
            r2.append(r0)     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L76
            java.lang.Class<bx.m> r2 = bx.m.class
            java.util.Set r4 = yx.a.f46339a     // Catch: java.lang.Throwable -> L76
            boolean r4 = r4.contains(r2)     // Catch: java.lang.Throwable -> L76
            if (r4 == 0) goto L57
            goto L5e
        L57:
            bx.m.f6738g = r0     // Catch: java.lang.Throwable -> L5a
            goto L5e
        L5a:
            r0 = move-exception
            yx.a.a(r2, r0)     // Catch: java.lang.Throwable -> L76
        L5e:
            java.lang.String r0 = "com.facebook.sdk.appEventPreferences"
            android.content.SharedPreferences r6 = r6.getSharedPreferences(r0, r3)     // Catch: java.lang.Throwable -> L76
            android.content.SharedPreferences$Editor r6 = r6.edit()     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = "anonymousAppDeviceGUID"
            java.lang.String r2 = bx.m.a()     // Catch: java.lang.Throwable -> L76
            android.content.SharedPreferences$Editor r6 = r6.putString(r0, r2)     // Catch: java.lang.Throwable -> L76
            r6.apply()     // Catch: java.lang.Throwable -> L76
            goto L78
        L76:
            r6 = move-exception
            goto L7a
        L78:
            monitor-exit(r1)
            goto L7c
        L7a:
            monitor-exit(r1)
            throw r6
        L7c:
            java.lang.String r6 = bx.m.a()
            if (r6 == 0) goto L83
            return r6
        L83:
            java.lang.String r6 = "Required value was null."
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o30.f0.z(android.content.Context):java.lang.String");
    }

    public abstract void I(e6.g gVar, e6.g gVar2);

    public abstract void J(e6.g gVar, Thread thread);

    public abstract boolean t(e6.h hVar, e6.d dVar, e6.d dVar2);

    public abstract boolean u(e6.h hVar, Object obj, Object obj2);

    public abstract boolean v(e6.h hVar, e6.g gVar, e6.g gVar2);
}
