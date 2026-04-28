package b0;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.format.DateFormat;
import android.util.Base64;
import android.util.Log;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.order.Changes;
import com.app.tgtg.model.remote.order.UpdateNotificationType;
import com.facebook.FacebookException;
import g3.r9;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.ranges.IntRange;
import kotlin.reflect.KClass;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Encoder;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.json.JSONException;
import org.json.JSONObject;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 implements e6.j, n50.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5039a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f5040b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f5041c = 0;

    public static Object A(Intent intent, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a70.a.h(intent, str, cls);
        }
        Parcelable parcelableExtra = intent.getParcelableExtra(str);
        if (cls.isInstance(parcelableExtra)) {
            return parcelableExtra;
        }
        return null;
    }

    public static final long B(double d3) {
        return F((float) d3, 4294967296L);
    }

    public static final long C(int i11) {
        return F(i11, 4294967296L);
    }

    public static void D(String str, String str2, m3.s sVar, Object... objArr) throws Exception {
        try {
            Class<?> cls = Class.forName(str);
            Method methodS = s(cls, str2, Arrays.copyOf(objArr, objArr.length));
            if (methodS != null) {
                methodS.setAccessible(true);
                if (Modifier.isStatic(methodS.getModifiers())) {
                    E(methodS, null, sVar, Arrays.copyOf(objArr, objArr.length));
                    return;
                } else {
                    E(methodS, cls.getConstructor(null).newInstance(null), sVar, Arrays.copyOf(objArr, objArr.length));
                    return;
                }
            }
            throw new NoSuchMethodException("Composable " + str + '.' + str2 + " not found");
        } catch (Exception e5) {
            Log.w("PreviewLogger", "Failed to invoke Composable Method '" + str + '.' + str2 + '\'', null);
            throw e5;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void E(java.lang.reflect.Method r10, java.lang.Object r11, m3.n r12, java.lang.Object... r13) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.a0.E(java.lang.reflect.Method, java.lang.Object, m3.n, java.lang.Object[]):void");
    }

    public static final long F(float f11, long j9) {
        long jFloatToRawIntBits = j9 | (((long) Float.floatToRawIntBits(f11)) & 4294967295L);
        z5.p[] pVarArr = z5.o.f47288b;
        return jFloatToRawIntBits;
    }

    public static final a2.j G(f2.c0 c0Var, m3.n nVar, int i11, int i12) {
        a2.p pVar = a2.p.f234c;
        if ((i12 & 2) != 0) {
            pVar = a2.p.f233b;
        }
        boolean zF = ((m3.s) nVar).f(c0Var);
        m3.s sVar = (m3.s) nVar;
        Object objM = sVar.M();
        m3.f fVar = m3.m.f29332a;
        if (zF || objM == fVar) {
            objM = new a2.c(c0Var, pVar);
            sVar.k0(objM);
        }
        a2.o oVar = (a2.o) objM;
        float f11 = a2.n.f232a;
        z5.c cVar = (z5.c) sVar.j(c5.x1.f7416h);
        t1.s sVarA = s1.k1.a(sVar);
        boolean zF2 = sVar.f(cVar) | sVar.f(oVar) | sVar.f(sVarA);
        Object objM2 = sVar.M();
        if (zF2 || objM2 == fVar) {
            objM2 = new a2.j(oVar, sVarA, t1.c.j(0.0f, 400.0f, null, 5));
            sVar.k0(objM2);
        }
        return (a2.j) objM2;
    }

    public static final float H(a.a aVar, ad.g gVar) {
        if (aVar instanceof ad.a) {
            return ((ad.a) aVar).f1221b;
        }
        int i11 = ed.i.$EnumSwitchMapping$0[gVar.ordinal()];
        if (i11 == 1) {
            return Float.MIN_VALUE;
        }
        if (i11 == 2) {
            return Float.MAX_VALUE;
        }
        e40.a.f();
        return 0.0f;
    }

    public static final void a(b4.t tVar, String str, String str2, Function0 function0, Function0 function02, Function0 function03, m3.n nVar, int i11) {
        str.getClass();
        str2.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(58452556);
        int i12 = i11 | (sVar.f(str) ? 32 : 16) | (sVar.f(str2) ? 256 : 128) | (sVar.h(function0) ? NewHope.SENDB_BYTES : 1024) | (sVar.h(function02) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar.h(function03) ? 131072 : 65536);
        if (sVar.R(i12 & 1, (74899 & i12) != 74898)) {
            z4.u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVar, sVar);
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
            float f11 = lv.t.f28251e;
            b4.q qVar = b4.q.f5711a;
            b4.t tVarJ = c5.d2.j(d2.c.D(qVar, f11, 0.0f, 0.0f, 0.0f, 14), "SelectTodayButton");
            lv.e eVar = lv.e.SMALL;
            String strU = o30.f0.U(sVar, R.string.charity_plan_today);
            boolean z11 = (i12 & 7168) == 2048;
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (z11 || objM == fVar) {
                objM = new oo.z(6, function0);
                sVar.k0(objM);
            }
            v0.n.n(tVarJ, strU, null, null, eVar, true, false, null, null, (Function0) objM, sVar, 221190, 460);
            b4.t tVarD = d2.m2.d(qVar, 1.0f);
            b4.k kVar = b4.d.f5687e;
            d2.u uVar = d2.u.f13938a;
            r9.d(r8.k.m(str, " - ", str2), c5.d2.j(uVar.a(tVarD, kVar), "PlanDates"), lv.s.C, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28275o, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
            sVar = sVar;
            b4.t tVarA = uVar.a(qVar, b4.d.f5688f);
            d2.i2 i2VarA = d2.h2.a(d2.i.f13801a, b4.d.f5692j, sVar, 0);
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
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            float f12 = 40;
            b4.t tVarH = d2.m2.h(d2.m2.l(d2.c.D(qVar, 0.0f, 0.0f, lv.t.f28253g, 0.0f, 11), f12), f12);
            boolean z12 = (i12 & 458752) == 131072;
            Object objM2 = sVar.M();
            if (z12 || objM2 == fVar) {
                objM2 = new oo.z(7, function03);
                sVar.k0(objM2);
            }
            b4.t tVarC3 = androidx.compose.foundation.b.c(tVarH, false, null, null, (Function0) objM2, 15);
            n4.b bVarZ = o00.x0.z(R.drawable.system_icon_chevron_left_neutral_80, sVar, 0);
            long j9 = lv.s.f28217b;
            v1.n.d(bVarZ, "ChevronLeft", tVarC3, null, null, 0.0f, new i4.o(j9, 5), sVar, 1572920, 56);
            b4.t tVarH2 = d2.m2.h(d2.m2.l(d2.c.D(qVar, 0.0f, 0.0f, f11, 0.0f, 11), f12), f12);
            boolean z13 = (i12 & 57344) == 16384;
            Object objM3 = sVar.M();
            if (z13 || objM3 == fVar) {
                objM3 = new oo.z(8, function02);
                sVar.k0(objM3);
            }
            v1.n.d(o00.x0.z(R.drawable.system_icon_chevron_right_neutral_80, sVar, 0), "ChevronRight", androidx.compose.foundation.b.c(tVarH2, false, null, null, (Function0) objM3, 15), null, null, 0.0f, new i4.o(j9, 5), sVar, 1572920, 56);
            sVar.q(true);
            sVar.q(true);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.z(tVar, str, str2, function0, function02, function03, i11);
        }
    }

    public static final void b(Changes changes, Function0 function0, Function1 function1, m3.n nVar, int i11) {
        changes.getClass();
        function0.getClass();
        function1.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(965036288);
        int i12 = (sVar.h(changes) ? 4 : 2) | i11 | (sVar.h(function0) ? 32 : 16) | (sVar.h(function1) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            g3.s0.b(v1.n.k(d2.m2.d(b4.q.f5711a, 1.0f), 1, (changes.getType() == UpdateNotificationType.CANCELLED_BY_CHARITY || changes.getType() == UpdateNotificationType.CANCELLED_BY_STORE) ? lv.s.f28231k : lv.s.f28218b0, l2.g.b(12)), null, g3.s0.p(lv.s.f28220c0, sVar, 6), null, null, u3.e.e(571569906, sVar, new ap.e(changes, function0, function1, 14)), sVar, 196608, 26);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ki.h(changes, function0, function1, false, i11, 11);
        }
    }

    public static final void c(b4.t tVar, BasicItem basicItem, boolean z11, boolean z12, long j9, Function0 function0, Function1 function1, m3.n nVar, int i11, int i12) {
        boolean z13;
        int i13;
        boolean z14;
        int i14;
        Function1 function12;
        int i15;
        boolean z15;
        boolean z16;
        b4.t tVar2;
        long j11;
        BasicItem basicItem2 = basicItem;
        Function0 function02 = function0;
        basicItem2.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(728281966);
        int i16 = i11 | 6 | (sVar.h(basicItem2) ? 32 : 16);
        int i17 = i12 & 4;
        if (i17 != 0) {
            i13 = i16 | MLKEMEngine.KyberPolyBytes;
            z13 = z11;
        } else {
            z13 = z11;
            i13 = i16 | (sVar.g(z13) ? 256 : 128);
        }
        int i18 = i12 & 8;
        if (i18 != 0) {
            i14 = i13 | 3072;
            z14 = z12;
        } else {
            z14 = z12;
            i14 = i13 | (sVar.g(z14) ? NewHope.SENDB_BYTES : 1024);
        }
        int i19 = i14 | 24576 | (sVar.h(function02) ? 131072 : 65536);
        int i21 = i12 & 64;
        if (i21 != 0) {
            i15 = i19 | 1572864;
            function12 = function1;
        } else {
            function12 = function1;
            i15 = i19 | (sVar.h(function12) ? 1048576 : 524288);
        }
        int i22 = i15;
        if (sVar.R(i22 & 1, (599187 & i22) != 599186)) {
            z15 = i17 != 0 ? false : z13;
            if (i18 != 0) {
                z14 = false;
            }
            long j12 = lv.s.C;
            Function1 function13 = i21 != 0 ? null : function12;
            b4.q qVar = b4.q.f5711a;
            b4.t tVarD = d2.m2.d(qVar, 1.0f);
            float f11 = lv.t.f28251e;
            b4.t tVarD2 = d2.c.D(tVarD, f11, f11, f11, 0.0f, 8);
            d2.i2 i2VarA = d2.h2.a(d2.i.f13807g, b4.d.f5692j, sVar, 6);
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
            b5.g gVar = b5.i.f5843f;
            m3.i.C(i2VarA, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            d2.n1 n1Var = new d2.n1(1.0f, true);
            d2.y yVarA = d2.w.a(d2.i.g(lv.t.f28249c), b4.d.f5694m, sVar, 6);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(n1Var, sVar);
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
            String storeNameAndBranch = mv.d.m(basicItem).getStoreNameAndBranch();
            if (storeNameAndBranch == null) {
                storeNameAndBranch = "";
            }
            jb.u.t(MLKEMEngine.KyberPolyBytes, j12, null, storeNameAndBranch, sVar);
            int i23 = i22 & 112;
            boolean z17 = z14;
            ba0.g.d(null, basicItem, j12, sVar, i23 | MLKEMEngine.KyberPolyBytes);
            sVar.q(true);
            d2.c.f(d2.m2.q(qVar, f11), sVar);
            d2.i2 i2VarA2 = d2.h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            b4.t tVarC3 = b4.a.c(qVar, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA2, gVar, sVar);
            m3.i.C(iVarL3, gVar2, sVar);
            w.a0.y(iHashCode3, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC3, gVar4, sVar);
            if (z15) {
                sVar.a0(-145321666);
                bx.k.c(z17, function13, sVar, ((i22 >> 9) & 14) | ((i22 >> 15) & 112));
                d2.c.f(d2.m2.q(qVar, f11), sVar);
                sVar.q(false);
            } else {
                sVar.a0(-145062196);
                sVar.q(false);
            }
            basicItem2 = basicItem;
            tVar2 = qVar;
            function02 = function0;
            a.a.i(null, basicItem2, function02, sVar, i23 | ((i22 >> 9) & 896));
            sVar.q(true);
            sVar.q(true);
            sVar = sVar;
            function12 = function13;
            z16 = z17;
            j11 = j12;
        } else {
            sVar.U();
            z15 = z13;
            z16 = z14;
            tVar2 = tVar;
            j11 = j9;
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new fg.h(tVar2, basicItem2, z15, z16, j11, function02, function12, i11, i12);
        }
    }

    public static final void d(List list, Function1 function1, Function1 function12, m3.n nVar, int i11) {
        list.getClass();
        function1.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1673341361);
        int i12 = (sVar.h(list) ? 4 : 2) | i11 | (sVar.h(function1) ? 32 : 16) | (sVar.h(function12) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(Boolean.FALSE);
                sVar.k0(objM);
            }
            m3.b1 b1Var = (m3.b1) objM;
            int i13 = i12 & 112;
            boolean z11 = ((i12 & 896) == 256) | (i13 == 32);
            Object objM2 = sVar.M();
            if (z11 || objM2 == fVar) {
                objM2 = new m2.h0(function1, function12, b1Var, 8);
                sVar.k0(objM2);
            }
            a.a.m(list, (Function1) objM2, sVar, i12 & 14);
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar.a0(1173585623);
                boolean z12 = i13 == 32;
                Object objM3 = sVar.M();
                if (z12 || objM3 == fVar) {
                    objM3 = new bm.k(function1, b1Var, 2);
                    sVar.k0(objM3);
                }
                Function0 function0 = (Function0) objM3;
                boolean z13 = i13 == 32;
                Object objM4 = sVar.M();
                if (z13 || objM4 == fVar) {
                    objM4 = new bm.k(function1, b1Var, 3);
                    sVar.k0(objM4);
                }
                Function0 function02 = (Function0) objM4;
                Object objM5 = sVar.M();
                if (objM5 == fVar) {
                    objM5 = new pi.b(b1Var, 2);
                    sVar.k0(objM5);
                }
                android.support.v4.media.session.a.e(function0, function02, (Function0) objM5, sVar, MLKEMEngine.KyberPolyBytes);
                sVar.q(false);
            } else {
                sVar.a0(1173950803);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new gn.l(list, function1, function12, i11, 2);
        }
    }

    public static final void e(g9.f0 f0Var, Function0 function0, Function2 function2, Function0 function02, m3.n nVar, int i11) {
        f0Var.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1457980496);
        int i12 = (sVar.h(f0Var) ? 4 : 2) | i11 | (sVar.h(function0) ? 32 : 16) | (sVar.h(function2) ? 256 : 128) | (sVar.h(function02) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            lv.w.a(false, u3.e.e(1368105158, sVar, new rl.b(f0Var, function02, function0, function2)), sVar, MLKEMEngine.KyberPolyBytes);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new rl.b(f0Var, function0, function2, function02, i11);
        }
    }

    public static final void f(bp.b bVar, ap.n nVar, m3.n nVar2, int i11) {
        Boolean bool;
        m3.f fVar;
        Function0 function0;
        Function0 function02;
        boolean z11;
        Object bVar2;
        f6.n nVar3;
        m3.b1 b1Var;
        ap.n nVar4 = nVar;
        bVar.getClass();
        nVar4.getClass();
        m3.s sVar = (m3.s) nVar2;
        sVar.c0(-1751407010);
        int i12 = (sVar.h(nVar4) ? 32 : 16) | i11;
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            m3.b1 b1VarN = m3.i.n(nVar4.f4569k, sVar, 0);
            int[] iArr = dp.v.$EnumSwitchMapping$0;
            int i13 = iArr[bVar.ordinal()];
            if (i13 == 1) {
                sVar.a0(525052963);
                bool = (Boolean) m3.i.n(nVar4.f4581x, sVar, 0).getValue();
                sVar.q(false);
            } else if (i13 == 2) {
                sVar.a0(525056227);
                bool = (Boolean) m3.i.n(nVar4.f4583z, sVar, 0).getValue();
                sVar.q(false);
            } else if (i13 == 3) {
                sVar.a0(525058787);
                bool = (Boolean) m3.i.n(nVar4.B, sVar, 0).getValue();
                sVar.q(false);
            } else {
                if (i13 != 4) {
                    throw e0.f.v(sVar, 525050065, false);
                }
                sVar.a0(525061219);
                bool = (Boolean) m3.i.n(nVar4.D, sVar, 0).getValue();
                sVar.q(false);
            }
            Boolean bool2 = bool;
            Object value = b1VarN.getValue();
            boolean zF = sVar.f(b1VarN) | sVar.h(nVar4);
            Object objM = sVar.M();
            m3.f fVar2 = m3.m.f29332a;
            if (zF || objM == fVar2) {
                fVar = fVar2;
                ao.e1 e1Var = new ao.e1(b1VarN, nVar4, bVar, null, 3);
                sVar.k0(e1Var);
                objM = e1Var;
            } else {
                fVar = fVar2;
            }
            m3.i.h(value, (Function2) objM, sVar);
            int i14 = iArr[bVar.ordinal()];
            if (i14 == 1) {
                sVar.a0(-902684891);
                boolean zH = sVar.h(nVar4);
                Object objM2 = sVar.M();
                if (zH || objM2 == fVar) {
                    objM2 = new ap.h(nVar4, 8);
                    sVar.k0(objM2);
                }
                function0 = (Function0) objM2;
                sVar.q(false);
            } else if (i14 == 2) {
                sVar.a0(-902572578);
                boolean zH2 = sVar.h(nVar4);
                Object objM3 = sVar.M();
                if (zH2 || objM3 == fVar) {
                    objM3 = new ap.h(nVar4, 9);
                    sVar.k0(objM3);
                }
                function0 = (Function0) objM3;
                sVar.q(false);
            } else if (i14 == 3) {
                sVar.a0(-902465752);
                boolean zH3 = sVar.h(nVar4);
                Object objM4 = sVar.M();
                if (zH3 || objM4 == fVar) {
                    objM4 = new ap.h(nVar4, 10);
                    sVar.k0(objM4);
                }
                function0 = (Function0) objM4;
                sVar.q(false);
            } else {
                if (i14 != 4) {
                    throw e0.f.v(sVar, 525068888, false);
                }
                sVar.a0(-902370582);
                boolean zH4 = sVar.h(nVar4);
                Object objM5 = sVar.M();
                if (zH4 || objM5 == fVar) {
                    objM5 = new ap.h(nVar4, 11);
                    sVar.k0(objM5);
                }
                function0 = (Function0) objM5;
                sVar.q(false);
            }
            int i15 = iArr[bVar.ordinal()];
            if (i15 == 1) {
                sVar.a0(-902224572);
                boolean zH5 = sVar.h(nVar4);
                Object objM6 = sVar.M();
                if (zH5 || objM6 == fVar) {
                    objM6 = new ap.h(nVar4, 12);
                    sVar.k0(objM6);
                }
                function02 = (Function0) objM6;
                z11 = false;
                sVar.q(false);
            } else if (i15 == 2) {
                sVar.a0(-902111267);
                boolean zH6 = sVar.h(nVar4);
                Object objM7 = sVar.M();
                if (zH6 || objM7 == fVar) {
                    objM7 = new ap.h(nVar4, 13);
                    sVar.k0(objM7);
                }
                function02 = (Function0) objM7;
                z11 = false;
                sVar.q(false);
            } else if (i15 == 3) {
                sVar.a0(-902003449);
                boolean zH7 = sVar.h(nVar4);
                Object objM8 = sVar.M();
                if (zH7 || objM8 == fVar) {
                    objM8 = new ap.h(nVar4, 14);
                    sVar.k0(objM8);
                }
                function02 = (Function0) objM8;
                z11 = false;
                sVar.q(false);
            } else {
                if (i15 != 4) {
                    throw e0.f.v(sVar, 525083740, false);
                }
                sVar.a0(-901907287);
                boolean zH8 = sVar.h(nVar4);
                Object objM9 = sVar.M();
                if (zH8 || objM9 == fVar) {
                    objM9 = new ap.h(nVar4, 15);
                    sVar.k0(objM9);
                }
                function02 = (Function0) objM9;
                z11 = false;
                sVar.q(false);
            }
            Function0 function03 = function02;
            b4.t tVarR = v1.n.r(d2.m2.f13850c, v1.n.q(sVar), true);
            sVar.a0(-1003410150);
            sVar.a0(212064437);
            sVar.q(z11);
            z5.c cVar = (z5.c) sVar.j(c5.x1.f7416h);
            Object objM10 = sVar.M();
            if (objM10 == fVar) {
                objM10 = new f6.s(cVar);
                sVar.k0(objM10);
            }
            f6.s sVar2 = (f6.s) objM10;
            Object objM11 = sVar.M();
            if (objM11 == fVar) {
                objM11 = new f6.l();
                sVar.k0(objM11);
            }
            f6.l lVar = (f6.l) objM11;
            Object objM12 = sVar.M();
            if (objM12 == fVar) {
                objM12 = m3.i.w(Boolean.FALSE);
                sVar.k0(objM12);
            }
            m3.b1 b1Var2 = (m3.b1) objM12;
            Object objM13 = sVar.M();
            if (objM13 == fVar) {
                objM13 = new f6.n(lVar);
                sVar.k0(objM13);
            }
            f6.n nVar5 = (f6.n) objM13;
            Object objM14 = sVar.M();
            if (objM14 == fVar) {
                m3.k1 k1Var = new m3.k1(Unit.f26487a, m3.f.f29272d);
                sVar.k0(k1Var);
                objM14 = k1Var;
            }
            m3.b1 b1Var3 = (m3.b1) objM14;
            boolean zH9 = sVar.h(sVar2) | sVar.d(257);
            Object objM15 = sVar.M();
            if (zH9 || objM15 == fVar) {
                bVar2 = new dp.b(b1Var3, sVar2, nVar5, b1Var2, 3);
                nVar3 = nVar5;
                b1Var = b1Var2;
                sVar.k0(bVar2);
            } else {
                bVar2 = objM15;
                nVar3 = nVar5;
                b1Var = b1Var2;
            }
            z4.u0 u0Var = (z4.u0) bVar2;
            Object objM16 = sVar.M();
            if (objM16 == fVar) {
                objM16 = new dp.c(b1Var, nVar3, 3);
                sVar.k0(objM16);
            }
            Function0 function04 = (Function0) objM16;
            boolean zH10 = sVar.h(sVar2);
            Object objM17 = sVar.M();
            if (zH10 || objM17 == fVar) {
                objM17 = new dp.d(sVar2, 3);
                sVar.k0(objM17);
            }
            nVar4 = nVar;
            z4.c0.a(j5.r.c(tVarR, false, (Function1) objM17), u3.e.e(1200550679, sVar, new dp.u(b1Var3, lVar, function04, nVar, bVar, bool2, function0, function03)), u0Var, sVar, 48);
            sVar.q(false);
            boolean zH11 = sVar.h(nVar4);
            Object objM18 = sVar.M();
            if (zH11 || objM18 == fVar) {
                objM18 = new ap.h(nVar4, 16);
                sVar.k0(objM18);
            }
            jf.e.a(false, (Function0) objM18, sVar, 0, 1);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a3.u2(bVar, nVar4, i11, 11);
        }
    }

    public static final void g(int i11, b4.t tVar, String str, Function1 function1, m3.n nVar) {
        m3.s sVar;
        tVar.getClass();
        function1.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-1820869763);
        int i12 = i11 | (sVar2.f(tVar) ? 4 : 2) | (sVar2.f(str) ? 32 : 16) | (sVar2.h(function1) ? 256 : 128);
        if (sVar2.R(i12 & 1, (i12 & 147) != 146)) {
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w("");
                sVar2.k0(objM);
            }
            m3.b1 b1Var = (m3.b1) objM;
            b4.t tVarD = d2.c.D(d2.m2.d(tVar, 1.0f), 0.0f, o30.e0.s(sVar2, R.dimen.spacing_1), 0.0f, 0.0f, 13);
            d2.i2 i2VarA = d2.h2.a(d2.i.f13801a, b4.d.f5692j, sVar2, 0);
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
            m3.i.C(i2VarA, gVar, sVar2);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar2, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar2, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar2);
            b4.q qVar = b4.q.f5711a;
            b4.t tVarT = d2.m2.t(d2.m2.d(qVar, 1.0f), 3);
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar2, 0);
            int iHashCode2 = Long.hashCode(sVar2.T);
            u3.i iVarL2 = sVar2.l();
            b4.t tVarC2 = b4.a.c(tVarT, sVar2);
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            m3.i.C(yVarA, gVar, sVar2);
            m3.i.C(iVarL2, gVar2, sVar2);
            w.a0.y(iHashCode2, sVar2, gVar3, sVar2, dVar);
            m3.i.C(tVarC2, gVar4, sVar2);
            b4.t tVarD2 = d2.c.D(d2.m2.e(d2.m2.d(qVar, 1.0f), 42), 0.0f, o30.e0.s(sVar2, R.dimen.spacing_0_5), 0.0f, 0.0f, 13);
            String str2 = (String) b1Var.getValue();
            u3.d dVarE = u3.e.e(-1090394560, sVar2, new bn.h0(str, 5));
            boolean z11 = (i12 & 896) == 256;
            Object objM2 = sVar2.M();
            if (z11 || objM2 == fVar) {
                objM2 = new m2.b0(function1, b1Var, 3);
                sVar2.k0(objM2);
            }
            cg.j.m(tVarD2, str2, true, false, 0, dVarE, null, null, null, null, null, (Function1) objM2, sVar2, 196992, 2008);
            sVar = sVar2;
            sVar.q(true);
            sVar.q(true);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ki.h(tVar, str, function1, false, i11, 13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final b4.t r18, i4.v0 r19, final long r20, final long r22, float r24, final kotlin.jvm.functions.Function2 r25, m3.n r26, final int r27, final int r28) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.a0.h(b4.t, i4.v0, long, long, float, kotlin.jvm.functions.Function2, m3.n, int, int):void");
    }

    public static int i(boolean[] zArr, int i11, int[] iArr, boolean z11) {
        int i12 = 0;
        for (int i13 : iArr) {
            int i14 = 0;
            while (i14 < i13) {
                zArr[i11] = z11;
                i14++;
                i11++;
            }
            i12 += i13;
            z11 = !z11;
        }
        return i12;
    }

    public static final void j(long j9) {
        z5.p[] pVarArr = z5.o.f47288b;
        if ((j9 & 1095216660480L) == 0) {
            z5.i.a("Cannot perform operation for Unspecified type.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        if (r3 == 1.0d) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap l(android.graphics.drawable.Drawable r17, android.graphics.Bitmap.Config r18, ud.h r19, ud.g r20, ud.h r21, boolean r22) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            r6 = r20
            r7 = r21
            boolean r3 = r0 instanceof android.graphics.drawable.BitmapDrawable
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r11 = 32
            if (r3 == 0) goto L5a
            r3 = r0
            android.graphics.drawable.BitmapDrawable r3 = (android.graphics.drawable.BitmapDrawable) r3
            android.graphics.Bitmap r12 = r3.getBitmap()
            android.graphics.Bitmap$Config r3 = r12.getConfig()
            if (r1 == 0) goto L29
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.HARDWARE
            if (r1 != r4) goto L27
            goto L29
        L27:
            r4 = r1
            goto L2b
        L29:
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
        L2b:
            if (r3 != r4) goto L5a
            if (r22 == 0) goto L30
            goto L59
        L30:
            int r3 = r12.getWidth()
            int r4 = r12.getHeight()
            long r3 = m0.c.U(r3, r4, r2, r6, r7)
            long r13 = r3 >> r11
            int r5 = (int) r13
            long r3 = r3 & r9
            int r3 = (int) r3
            r6 = r3
            int r3 = r12.getWidth()
            int r4 = r12.getHeight()
            r8 = r7
            r7 = r20
            double r3 = m0.c.V(r3, r4, r5, r6, r7, r8)
            r6 = r7
            r7 = r8
            r13 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 != 0) goto L5a
        L59:
            return r12
        L5a:
            android.graphics.drawable.Drawable r0 = r0.mutate()
            int r3 = ae.q.b(r0)
            r4 = 512(0x200, float:7.17E-43)
            if (r3 <= 0) goto L67
            goto L68
        L67:
            r3 = r4
        L68:
            int r5 = ae.q.a(r0)
            if (r5 <= 0) goto L6f
            r4 = r5
        L6f:
            long r12 = m0.c.U(r3, r4, r2, r6, r7)
            long r14 = r12 >> r11
            int r2 = (int) r14
            long r8 = r12 & r9
            int r5 = (int) r8
            r16 = r4
            r4 = r2
            r2 = r3
            r3 = r16
            double r4 = m0.c.V(r2, r3, r4, r5, r6, r7)
            double r6 = (double) r2
            double r6 = r6 * r4
            int r2 = j80.c.a(r6)
            double r6 = (double) r3
            double r4 = r4 * r6
            int r3 = j80.c.a(r4)
            if (r1 == 0) goto L95
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.HARDWARE
            if (r1 != r4) goto L97
        L95:
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
        L97:
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r2, r3, r1)
            android.graphics.Rect r4 = r0.getBounds()
            int r5 = r4.left
            int r6 = r4.top
            int r7 = r4.right
            int r4 = r4.bottom
            r8 = 0
            r0.setBounds(r8, r8, r2, r3)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r1)
            r0.draw(r2)
            r0.setBounds(r5, r6, r7, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.a0.l(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, ud.h, ud.g, ud.h, boolean):android.graphics.Bitmap");
    }

    public static ax.b m(Bundle bundle, ax.k kVar, String str) {
        String string;
        bundle.getClass();
        str.getClass();
        Date dateM = tx.n0.m(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
        ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
        String string2 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        Date dateM2 = tx.n0.m(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
        if (string2 == null || string2.length() == 0 || (string = bundle.getString("com.facebook.platform.extra.USER_ID")) == null || string.length() == 0) {
            return null;
        }
        return new ax.b(string2, str, string, stringArrayList, null, null, kVar, dateM, new Date(), dateM2, bundle.getString("graph_domain"));
    }

    public static ax.b n(Collection collection, Bundle bundle, ax.k kVar, String str) {
        ArrayList arrayListD;
        ArrayList arrayListD2;
        bundle.getClass();
        str.getClass();
        Date dateM = tx.n0.m(bundle, "expires_in", new Date());
        String string = bundle.getString("access_token");
        if (string != null) {
            Date dateM2 = tx.n0.m(bundle, "data_access_expiration_time", new Date(0L));
            String string2 = bundle.getString("granted_scopes");
            if (string2 != null && string2.length() > 0) {
                String[] strArr = (String[]) StringsKt__StringsKt.split$default(string2, new String[]{MessageLogView.COMMA_SEPARATOR}, false, 0, 6, null).toArray(new String[0]);
                collection = kotlin.collections.d0.d(Arrays.copyOf(strArr, strArr.length));
            }
            Collection collection2 = collection;
            String string3 = bundle.getString("denied_scopes");
            if (string3 == null || string3.length() <= 0) {
                arrayListD = null;
            } else {
                String[] strArr2 = (String[]) StringsKt__StringsKt.split$default(string3, new String[]{MessageLogView.COMMA_SEPARATOR}, false, 0, 6, null).toArray(new String[0]);
                arrayListD = kotlin.collections.d0.d(Arrays.copyOf(strArr2, strArr2.length));
            }
            String string4 = bundle.getString("expired_scopes");
            if (string4 == null || string4.length() <= 0) {
                arrayListD2 = null;
            } else {
                String[] strArr3 = (String[]) StringsKt__StringsKt.split$default(string4, new String[]{MessageLogView.COMMA_SEPARATOR}, false, 0, 6, null).toArray(new String[0]);
                arrayListD2 = kotlin.collections.d0.d(Arrays.copyOf(strArr3, strArr3.length));
            }
            if (!tx.n0.x(string)) {
                String string5 = bundle.getString("graph_domain");
                String string6 = bundle.getString("signed_request");
                if (string6 == null || string6.length() == 0) {
                    throw new FacebookException("Authorization response does not contain the signed_request");
                }
                try {
                    String[] strArr4 = (String[]) StringsKt__StringsKt.split$default(string6, new String[]{"."}, false, 0, 6, null).toArray(new String[0]);
                    if (strArr4.length == 2) {
                        byte[] bArrDecode = Base64.decode(strArr4[1], 0);
                        bArrDecode.getClass();
                        String string7 = new JSONObject(new String(bArrDecode, Charsets.UTF_8)).getString("user_id");
                        string7.getClass();
                        return new ax.b(string, str, string7, collection2, arrayListD, arrayListD2, kVar, dateM, new Date(), dateM2, string5);
                    }
                } catch (UnsupportedEncodingException | JSONException unused) {
                }
                throw new FacebookException("Failed to retrieve user_id from signed_request");
            }
        }
        return null;
    }

    public static ax.l p(Bundle bundle, String str) {
        bundle.getClass();
        String string = bundle.getString("id_token");
        if (string == null || string.length() == 0 || str == null || str.length() == 0) {
            return null;
        }
        try {
            return new ax.l(string, str);
        } catch (Exception e5) {
            throw new FacebookException(e5.getMessage(), e5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    public static Method r(Method[] methodArr, String str, Class... clsArr) throws NoSuchMethodException {
        Method method;
        int length = methodArr.length;
        boolean z11 = false;
        int i11 = 0;
        loop0: while (true) {
            if (i11 >= length) {
                method = null;
                break;
            }
            method = methodArr[i11];
            if (Intrinsics.areEqual(str, method.getName()) || kotlin.text.y.p(method.getName(), str.concat("-"), z11)) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                Class<?>[] clsArr2 = (Class[]) Arrays.copyOf(clsArr, clsArr.length);
                if (parameterTypes.length == clsArr2.length) {
                    ArrayList arrayList = new ArrayList(parameterTypes.length);
                    int length2 = parameterTypes.length;
                    boolean z12 = z11;
                    ?? r12 = z12;
                    for (?? r11 = z12; r11 < length2; r11++) {
                        Class<?> cls = parameterTypes[r11];
                        int i12 = r12 + 1;
                        Class<?> cls2 = clsArr2[r12];
                        arrayList.add(Boolean.valueOf(Intrinsics.areEqual(y9.w.y(cls), y9.w.y(cls2)) || cls.isAssignableFrom(cls2)));
                        r12 = i12;
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (!((Boolean) it.next()).booleanValue()) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                continue;
            }
            i11++;
            z11 = false;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodException(str.concat(" not found"));
    }

    public static Method s(Class cls, String str, Object... objArr) {
        ArrayList arrayList = new ArrayList();
        int length = objArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            Object obj = objArr[i11];
            Class<?> cls2 = obj != null ? obj.getClass() : null;
            if (cls2 != null) {
                arrayList.add(cls2);
            }
            i11++;
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        try {
            try {
                int length2 = clsArr.length;
                int iCeil = length2 == 0 ? 1 : (int) Math.ceil(((double) length2) / 10.0d);
                Class cls3 = Integer.TYPE;
                IntRange intRangeJ = n80.p.j(0, iCeil);
                ArrayList arrayList2 = new ArrayList(kotlin.collections.e0.o(intRangeJ, 10));
                Iterator it = intRangeJ.iterator();
                while (((n80.h) it).f30715c) {
                    ((kotlin.collections.s0) it).nextInt();
                    arrayList2.add(cls3);
                }
                Class[] clsArr2 = (Class[]) arrayList2.toArray(new Class[0]);
                Method[] declaredMethods = cls.getDeclaredMethods();
                SpreadBuilder spreadBuilder = new SpreadBuilder(3);
                spreadBuilder.addSpread(clsArr);
                spreadBuilder.add(m3.n.class);
                spreadBuilder.addSpread(clsArr2);
                return r(declaredMethods, str, (Class[]) spreadBuilder.toArray(new Class[spreadBuilder.size()]));
            } catch (ReflectiveOperationException unused) {
                return null;
            }
        } catch (ReflectiveOperationException unused2) {
            for (Method method : cls.getDeclaredMethods()) {
                if (!Intrinsics.areEqual(method.getName(), str)) {
                    if (!kotlin.text.y.p(method.getName(), str + '-', false)) {
                    }
                }
                return method;
            }
            return null;
        }
    }

    public static final i90.b t(m90.b bVar, l90.a aVar, String str) {
        bVar.getClass();
        i90.b bVarA = bVar.a(aVar, str);
        if (bVarA != null) {
            return bVarA;
        }
        m90.c1.k(str, bVar.c());
        throw null;
    }

    public static final KSerializer u(m90.b bVar, Encoder encoder, Object obj) {
        bVar.getClass();
        encoder.getClass();
        obj.getClass();
        KSerializer kSerializerB = bVar.b(encoder, obj);
        if (kSerializerB != null) {
            return kSerializerB;
        }
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(obj.getClass());
        KClass kClassC = bVar.c();
        orCreateKotlinClass.getClass();
        kClassC.getClass();
        String simpleName = orCreateKotlinClass.getSimpleName();
        if (simpleName == null) {
            simpleName = String.valueOf(orCreateKotlinClass);
        }
        m90.c1.k(simpleName, kClassC);
        throw null;
    }

    public static final String v(Context context, int i11) {
        SimpleDateFormat simpleDateFormat = DateFormat.is24HourFormat(context) ? new SimpleDateFormat("HH:mm", Locale.ROOT) : new SimpleDateFormat("hh a", Locale.getDefault());
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, i11);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        String str = simpleDateFormat.format(calendar.getTime());
        str.getClass();
        return str;
    }

    public static Drawable x(Context context, int i11) {
        return p.c2.c().d(context, i11);
    }

    public static String y(Context context, int i11) {
        if (context == null) {
            return "";
        }
        if (i11 == 1) {
            return context.getString(R.string.fingerprint_error_hw_not_available);
        }
        if (i11 != 7) {
            switch (i11) {
                case 9:
                    break;
                case 10:
                    return context.getString(R.string.fingerprint_error_user_canceled);
                case 11:
                    return context.getString(R.string.fingerprint_error_no_fingerprints);
                case 12:
                    return context.getString(R.string.fingerprint_error_hw_not_present);
                default:
                    Log.e("BiometricUtils", "Unknown error code: " + i11);
                    return context.getString(R.string.default_error_msg);
            }
        }
        return context.getString(R.string.fingerprint_error_lockout);
    }

    @Override // n50.d
    public q50.b k(String str, n50.a aVar, EnumMap enumMap) {
        if (str.isEmpty()) {
            i4.a.f("Found empty contents");
            return null;
        }
        int iW = w();
        n50.b bVar = n50.b.MARGIN;
        if (enumMap.containsKey(bVar)) {
            iW = Integer.parseInt(enumMap.get(bVar).toString());
        }
        boolean[] zArrQ = q(str);
        int length = zArrQ.length;
        int i11 = iW + length;
        int iMax = Math.max(200, i11);
        int iMax2 = Math.max(1, 200);
        int i12 = iMax / i11;
        int i13 = (iMax - (length * i12)) / 2;
        q50.b bVar2 = new q50.b(iMax, iMax2);
        int i14 = 0;
        while (i14 < length) {
            if (zArrQ[i14]) {
                bVar2.c(i13, 0, i12, iMax2);
            }
            i14++;
            i13 += i12;
        }
        return bVar2;
    }

    public abstract boolean[] q(String str);

    public int w() {
        return 10;
    }

    public abstract String z();
}
