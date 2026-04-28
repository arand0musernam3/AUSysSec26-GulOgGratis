package v0;

import a3.u1;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import b4.t;
import c5.x1;
import com.app.tgtg.R;
import com.google.android.gms.internal.measurement.cg;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.b2;
import d2.h2;
import d2.m2;
import d2.u;
import d2.y;
import d2.z1;
import g3.i2;
import g3.o;
import g3.r9;
import g3.s0;
import g3.s5;
import i2.e0;
import i4.g0;
import ib.j0;
import j5.r;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.c0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import l2.f;
import l2.g;
import lv.v;
import m3.b1;
import m3.c3;
import m3.h1;
import m3.i;
import m3.m;
import m3.s;
import m3.w1;
import o00.x0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.json.JSONObject;
import q1.g1;
import q1.t0;
import q1.u0;
import s1.k1;
import s1.r0;
import s1.y0;
import t1.d2;
import v0.n;
import v1.o1;
import v1.p1;
import v80.i0;
import v80.q;
import v80.s1;
import w.a0;
import w2.z;
import y9.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile Handler f41630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f41631b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f41632c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Thread f41633d;

    public static String A(String str, JSONObject jSONObject) {
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    public static final File B(Context context, String str) {
        context.getClass();
        return w.p(context, str.concat(".preferences_pb"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void C(i0 i0Var, q qVar) {
        i0Var.getClass();
        qVar.getClass();
        ((s1) i0Var).J(new ry.b(22, i0Var, qVar));
    }

    public static final String D(Reader reader) throws IOException {
        reader.getClass();
        StringWriter stringWriter = new StringWriter();
        reader.getClass();
        char[] cArr = new char[8192];
        int i11 = reader.read(cArr);
        while (i11 >= 0) {
            stringWriter.write(cArr, 0, i11);
            i11 = reader.read(cArr);
        }
        String string = stringWriter.toString();
        string.getClass();
        return string;
    }

    public static final boolean E(t0 t0Var, Object obj, Object obj2) {
        Object objD = t0Var.d(obj);
        if (objD == null) {
            return false;
        }
        if (!(objD instanceof u0)) {
            if (!Intrinsics.areEqual(objD, obj2)) {
                return false;
            }
            t0Var.k(obj);
            return true;
        }
        u0 u0Var = (u0) objD;
        boolean zL = u0Var.l(obj2);
        if (zL && u0Var.b()) {
            t0Var.k(obj);
        }
        return zL;
    }

    public static final void F(t0 t0Var, Object obj) {
        boolean zB;
        long[] jArr = t0Var.f35752a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j9 = jArr[i11];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j9) < 128) {
                        int i14 = (i11 << 3) + i13;
                        Object obj2 = t0Var.f35753b[i14];
                        Object obj3 = t0Var.f35754c[i14];
                        if (obj3 instanceof u0) {
                            u0 u0Var = (u0) obj3;
                            u0Var.l(obj);
                            zB = u0Var.b();
                        } else {
                            zB = obj3 == obj;
                        }
                        if (zB) {
                            t0Var.l(i14);
                        }
                    }
                    j9 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    public static void G(Window window, boolean z11) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 35) {
            f5.b.n(window, z11);
        } else {
            if (i11 >= 30) {
                f5.b.m(window, z11);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z11 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static r8.j H(int i11, r8.a aVar) {
        aVar.getClass();
        float[] fArr = new float[i11 * 4];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            float f11 = r8.l.f37777b / i11;
            long jC = r8.l.c(1.0f, 2 * f11 * i13);
            fArr[i12] = pd.g.y(jC) + 0.0f;
            fArr[i12 + 1] = pd.g.z(jC) + 0.0f;
            long jC2 = r8.l.c(0.8f, f11 * ((i13 * 2) + 1));
            int i14 = i12 + 3;
            fArr[i12 + 2] = pd.g.y(jC2) + 0.0f;
            i12 += 4;
            fArr[i14] = pd.g.z(jC2) + 0.0f;
        }
        return u00.d.k(fArr, aVar, null, 0.0f, 0.0f);
    }

    public static final void a(int i11, z zVar, m3.n nVar, int i12) {
        s sVar = (s) nVar;
        sVar.c0(-1053412609);
        int i13 = (sVar.d(i11) ? 4 : 2) | i12 | (sVar.f(zVar) ? 32 : 16);
        if (sVar.R(i13 & 1, (i13 & 19) != 18)) {
            i2.a(x0.z(i11, sVar, i13 & 14), null, m2.m(b4.q.f5711a, ((lv.d) zVar.f43083b).f28182e), 0L, sVar, 56, 8);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c60.c(zVar, i11, i12, 2);
        }
    }

    public static final void b(t tVar, m3.n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(-1053802336);
        if (sVar.R(i11 & 1, (i11 & 3) != 2)) {
            t tVarJ = v1.n.j(tVar, lv.s.I, g0.f23254b);
            y yVarA = d2.w.a(d2.i.f13805e, b4.d.f5695n, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarJ, sVar);
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
            float f11 = 112;
            b4.q qVar = b4.q.f5711a;
            v1.n.d(x0.z(R.drawable.charity_product, sVar, 0), "ProductImage", m2.h(m2.l(qVar, f11), f11), null, null, 0.0f, new i4.o(lv.s.G, 5), sVar, 1573304, 56);
            float f12 = 16;
            r9.d(f0.U(sVar, R.string.charity_plan_no_planned_donations), d2.c.D(d2.c.B(m2.t(m2.d(qVar, 1.0f), 3), f12, 0.0f, 2), 0.0f, f12, 0.0f, 0.0f, 13), lv.s.D, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, v.f28274n, sVar, 432, 12582912, 130040);
            sVar = sVar;
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bm.b(tVar, i11, 9);
        }
    }

    public static final void c(final int i11, final int i12, final Function1 function1, final Function1 function12, int i13, t tVar, final Function0 function0, m3.n nVar, final int i14) {
        int i15;
        s sVar;
        final int i16;
        final t tVar2;
        function1.getClass();
        function12.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(836474538);
        if ((i14 & 6) == 0) {
            i15 = (sVar2.d(i11) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= sVar2.d(i12) ? 32 : 16;
        }
        if ((i14 & MLKEMEngine.KyberPolyBytes) == 0) {
            i15 |= sVar2.h(function1) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= sVar2.h(function12) ? NewHope.SENDB_BYTES : 1024;
        }
        int i17 = i15 | 1794048;
        if ((i14 & 12582912) == 0) {
            i17 |= sVar2.h(function0) ? 8388608 : 4194304;
        }
        if (sVar2.R(i17 & 1, (4793491 & i17) != 4793490)) {
            x60.j jVar = (x60.j) sVar2.j(PantryThemeKt.getLocalPantryTypography());
            x60.m mVar = (x60.m) sVar2.j(PantryThemeKt.getLocalPantrySpacing());
            String strU = f0.U(sVar2, R.string.a11y_time_picker_collection_window);
            String strU2 = f0.U(sVar2, R.string.a11y_time_picker_start_time);
            String strU3 = f0.U(sVar2, R.string.a11y_time_picker_end_time);
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = new kj.b();
                sVar2.k0(objM);
            }
            b4.q qVar = b4.q.f5711a;
            t tVarD = m2.d(v4.f.a(qVar, (kj.b) objM, null), 1.0f);
            int i18 = i17;
            d2.i2 i2VarA = h2.a(d2.i.f13805e, b4.d.f5693k, sVar2, 54);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            t tVarC = b4.a.c(tVarD, sVar2);
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
            sVar2.Y(-1857968763, 0);
            int i19 = i18 >> 3;
            int i21 = 234881024 & (i18 << 3);
            w.b.m(i11, function1, null, strU2, 0.0f, 0, 0.0f, function0, sVar2, (i18 & 14) | 12582912 | (i19 & 112) | i21);
            sVar2.q(false);
            String strU4 = f0.U(sVar2, R.string.filters_collection_time_to);
            m5.u0 u0Var = jVar.f43958g;
            t tVarB = d2.c.B(qVar, mVar.f44014j, 0.0f, 2);
            boolean zF = sVar2.f(strU);
            Object objM2 = sVar2.M();
            if (zF || objM2 == fVar) {
                objM2 = new gt.e(strU, 13);
                sVar2.k0(objM2);
            }
            r9.d(strU4, r.c(tVarB, false, (Function1) objM2), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar2, 0, 0, 131068);
            sVar2.Y(-1857948641, 23);
            w.b.m(i12, function12, null, strU3, 0.0f, 0, 0.0f, function0, sVar2, (i19 & 14) | ((i18 >> 6) & 112) | (29360128 & (i18 << 6)) | i21);
            sVar = sVar2;
            sVar.q(false);
            sVar.q(true);
            i16 = 23;
            tVar2 = qVar;
        } else {
            sVar = sVar2;
            sVar.U();
            i16 = i13;
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2() { // from class: kj.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    n.c(i11, i12, function1, function12, i16, tVar2, function0, (m3.n) obj, m3.i.F(i14 | 1));
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final void d(final t tVar, final String str, final String str2, final z zVar, final boolean z11, final boolean z12, final Integer num, final Integer num2, final boolean z13, final Function0 function0, m3.n nVar, final int i11) {
        int i12;
        String str3;
        String str4;
        z zVar2;
        boolean z14;
        boolean z15;
        Integer num3;
        Integer num4;
        boolean z16;
        Function0 function02;
        s sVar = (s) nVar;
        sVar.c0(900410151);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(tVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            str3 = str;
            i12 |= sVar.f(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            str4 = str2;
            i12 |= sVar.f(str4) ? 256 : 128;
        } else {
            str4 = str2;
        }
        if ((i11 & 3072) == 0) {
            zVar2 = zVar;
            i12 |= sVar.f(zVar2) ? NewHope.SENDB_BYTES : 1024;
        } else {
            zVar2 = zVar;
        }
        if ((i11 & 24576) == 0) {
            z14 = z11;
            i12 |= sVar.g(z14) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        } else {
            z14 = z11;
        }
        if ((196608 & i11) == 0) {
            z15 = z12;
            i12 |= sVar.g(z15) ? 131072 : 65536;
        } else {
            z15 = z12;
        }
        if ((1572864 & i11) == 0) {
            num3 = num;
            i12 |= sVar.f(num3) ? 1048576 : 524288;
        } else {
            num3 = num;
        }
        if ((12582912 & i11) == 0) {
            num4 = num2;
            i12 |= sVar.f(num4) ? 8388608 : 4194304;
        } else {
            num4 = num2;
        }
        if ((100663296 & i11) == 0) {
            z16 = z13;
            i12 |= sVar.g(z16) ? 67108864 : 33554432;
        } else {
            z16 = z13;
        }
        if ((805306368 & i11) == 0) {
            function02 = function0;
            i12 |= sVar.h(function02) ? 536870912 : 268435456;
        } else {
            function02 = function0;
        }
        if (sVar.R(i12 & 1, (306783379 & i12) != 306783378)) {
            Object objM = sVar.M();
            if (objM == m3.m.f29332a) {
                objM = a0.g(sVar);
            }
            final b2.l lVar = (b2.l) objM;
            final b1 b1VarQ = b0.z.q(lVar, sVar);
            final String str5 = str3;
            final String str6 = str4;
            final boolean z17 = z14;
            final boolean z18 = z15;
            final Integer num5 = num3;
            final Integer num6 = num4;
            final boolean z19 = z16;
            final Function0 function03 = function02;
            final z zVar3 = zVar2;
            m3.i.a(s5.f19473a.a(null), u3.e.e(-2080874521, sVar, new Function2() { // from class: dg.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    z zVar4;
                    Function0 function04;
                    z zVar5 = zVar3;
                    j0 j0Var = (j0) zVar5.f43084c;
                    lv.d dVar = (lv.d) zVar5.f43083b;
                    m3.n nVar2 = (m3.n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    s sVar2 = (s) nVar2;
                    if (sVar2.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        float f11 = dVar.f28179b;
                        boolean z21 = z19;
                        t tVarA = m2.a(tVar, z21 ? dVar.f28180c : 0, f11);
                        dVar.getClass();
                        float f12 = dVar.f28184g;
                        float f13 = dVar.f28183f;
                        Integer num7 = num5;
                        float f14 = num7 == null ? f13 : f12;
                        Integer num8 = num6;
                        if (num8 == null) {
                            f12 = f13;
                        }
                        b2 b2VarE = d2.c.e(f14, 0.0f, f12, 0.0f, 10);
                        f fVarB = g.b(100);
                        c3 c3Var = b1VarQ;
                        boolean zBooleanValue = ((Boolean) c3Var.getValue()).booleanValue();
                        boolean z22 = z18;
                        o oVarY = n.y(j0Var, zBooleanValue, z21, z22, sVar2);
                        boolean zBooleanValue2 = ((Boolean) c3Var.getValue()).booleanValue();
                        j0Var.getClass();
                        sVar2.a0(902070122);
                        boolean z23 = z17;
                        v1.a0 a0VarB = null;
                        i4.v vVar = !z21 ? null : (zBooleanValue2 || z22) ? ((lv.f) j0Var.f23742b).f28189c : !z23 ? ((lv.f) j0Var.f23743c).f28189c : ((lv.f) j0Var.f23741a).f28189c;
                        if (vVar == null) {
                            sVar2.q(false);
                            zVar4 = zVar5;
                        } else {
                            zVar4 = zVar5;
                            a0VarB = v1.n.b(2, vVar.f23317a);
                            sVar2.q(false);
                        }
                        if (z22) {
                            sVar2.a0(-2069061291);
                            Object objM2 = sVar2.M();
                            if (objM2 == m.f29332a) {
                                objM2 = new db0.c(10);
                                sVar2.k0(objM2);
                            }
                            function04 = (Function0) objM2;
                            sVar2.q(false);
                        } else {
                            sVar2.a0(-2069078000);
                            sVar2.q(false);
                            function04 = function03;
                        }
                        s0.a(function04, tVarA, z23, fVarB, oVarY, null, a0VarB, b2VarE, lVar, u3.e.e(1200860119, sVar2, new cg.b(zVar4, z22, z21, num7, str6, str5, num8, c3Var, 1)), sVar2, 905969664, 32);
                    } else {
                        sVar2.U();
                    }
                    return Unit.f26487a;
                }
            }), sVar, 56);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2() { // from class: dg.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    n.d(tVar, str, str2, zVar, z11, z12, num, num2, z13, function0, (m3.n) obj, i.F(i11 | 1));
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final void e(final t tVar, long j9, float f11, float f12, float f13, m3.n nVar, final int i11) {
        final long j11;
        final float f14;
        final float f15;
        final float f16;
        float f17;
        float f18;
        s sVar = (s) nVar;
        sVar.c0(1647090706);
        int i12 = i11 | 28080;
        if (sVar.R(i12 & 1, (i12 & 9363) != 9362)) {
            long j12 = lv.s.f28223e;
            float f19 = 10;
            float f20 = 10;
            float f21 = 1;
            Object objM = sVar.M();
            if (objM == m3.m.f29332a) {
                objM = new iq.c(j12, f21, f19, f20);
                f17 = f21;
                f19 = f19;
                f18 = f20;
                sVar.k0(objM);
            } else {
                f17 = f21;
                f18 = f20;
            }
            v1.n.c(tVar, (Function1) objM, sVar, 6);
            j11 = j12;
            f14 = f19;
            f15 = f18;
            f16 = f17;
        } else {
            sVar.U();
            j11 = j9;
            f14 = f11;
            f15 = f12;
            f16 = f13;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2(j11, f14, f15, f16, i11) { // from class: iq.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ long f24100b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ float f24101c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ float f24102d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ float f24103e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iF = i.F(7);
                    n.e(this.f24099a, this.f24100b, this.f24101c, this.f24102d, this.f24103e, (m3.n) obj, iF);
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final void f(final e0 e0Var, t tVar, z1 z1Var, i2.i iVar, float f11, b4.j jVar, a2.j jVar2, boolean z11, v4.a aVar, a2.p pVar, o1 o1Var, final u3.d dVar, m3.n nVar, final int i11, final int i12) {
        t tVar2;
        int i13;
        final z1 z1Var2;
        final float f12;
        final b4.j jVar3;
        final a2.j jVar4;
        final boolean z12;
        final v4.a aVar2;
        final a2.p pVar2;
        final o1 o1Var2;
        final t tVar3;
        final i2.i iVar2;
        t tVar4;
        int i14;
        float f13;
        a2.j jVar5;
        o1 o1VarA;
        i2.i iVar3;
        b4.j jVar6;
        a2.p pVar3;
        z1 z1Var3;
        boolean z13;
        s sVar = (s) nVar;
        sVar.c0(1860873769);
        int i15 = i11 | (sVar.f(e0Var) ? 4 : 2);
        int i16 = i12 & 2;
        if (i16 != 0) {
            i13 = i15 | 48;
            tVar2 = tVar;
        } else {
            tVar2 = tVar;
            i13 = i15 | (sVar.f(tVar2) ? 32 : 16);
        }
        int i17 = i13 | 911961472;
        if (sVar.R(i17 & 1, (306783379 & i17) != 306783378)) {
            sVar.W();
            if ((i11 & 1) == 0 || sVar.z()) {
                t tVar5 = i16 != 0 ? b4.q.f5711a : tVar2;
                float f14 = 0;
                b2 b2Var = new b2(f14, f14, f14, f14);
                float f15 = 0;
                b4.j jVar7 = b4.d.f5693k;
                int i18 = (i17 & 14) | 196608;
                i2.y yVar = new i2.y();
                t1.s sVarA = k1.a(sVar);
                IntCompanionObject intCompanionObject = IntCompanionObject.INSTANCE;
                Object obj = d2.f39417a;
                t1.b1 b1VarJ = t1.c.j(0.0f, 400.0f, Float.valueOf(1), 1);
                z5.c cVar = (z5.c) sVar.j(x1.f7416h);
                z5.m mVar = (z5.m) sVar.j(x1.f7421n);
                boolean zF = ((((i18 & 14) ^ 6) > 4 && sVar.f(e0Var)) || (i18 & 6) == 4) | sVar.f(sVarA) | sVar.f(b1VarJ) | sVar.f(yVar) | sVar.f(cVar) | sVar.d(mVar.ordinal());
                Object objM = sVar.M();
                m3.f fVar = m3.m.f29332a;
                if (zF || objM == fVar) {
                    a2.d dVar2 = new a2.d(e0Var, new u1(9, e0Var, mVar), yVar);
                    float f16 = a2.n.f232a;
                    a2.j jVar8 = new a2.j(dVar2, sVarA, b1VarJ);
                    sVar.k0(jVar8);
                    objM = jVar8;
                }
                a2.j jVar9 = (a2.j) objM;
                int i19 = i17 & (-29360129);
                z1.h2 h2Var = z1.h2.Horizontal;
                int i21 = (i17 & 14) | 432;
                boolean z14 = (((i21 & 14) ^ 6) > 4 && sVar.f(e0Var)) || (i21 & 6) == 4;
                Object objM2 = sVar.M();
                if (z14 || objM2 == fVar) {
                    objM2 = new i2.a(e0Var, h2Var);
                    sVar.k0(objM2);
                }
                a2.p pVar4 = a2.p.f234c;
                aVar2 = (i2.a) objM2;
                tVar4 = tVar5;
                i14 = i19;
                f13 = f15;
                jVar5 = jVar9;
                o1VarA = p1.a(sVar);
                iVar3 = i2.i.f22862a;
                jVar6 = jVar7;
                pVar3 = pVar4;
                z1Var3 = b2Var;
                z13 = true;
            } else {
                sVar.U();
                z1Var3 = z1Var;
                iVar3 = iVar;
                f13 = f11;
                jVar6 = jVar;
                z13 = z11;
                aVar2 = aVar;
                pVar3 = pVar;
                o1VarA = o1Var;
                i14 = i17 & (-29360129);
                tVar4 = tVar2;
                jVar5 = jVar2;
            }
            sVar.r();
            int i22 = i14;
            u00.d.i(tVar4, e0Var, z1Var3, z1.h2.Horizontal, jVar5, z13, o1VarA, f13, iVar3, aVar2, jVar6, pVar3, dVar, sVar, 907545984 | ((i22 << 3) & 112) | ((i22 >> 3) & 14) | 24576, 1797510);
            float f17 = f13;
            jVar4 = jVar5;
            iVar2 = iVar3;
            z12 = z13;
            f12 = f17;
            a2.p pVar5 = pVar3;
            o1Var2 = o1VarA;
            jVar3 = jVar6;
            pVar2 = pVar5;
            z1Var2 = z1Var3;
            tVar3 = tVar4;
        } else {
            sVar.U();
            z1Var2 = z1Var;
            f12 = f11;
            jVar3 = jVar;
            jVar4 = jVar2;
            z12 = z11;
            aVar2 = aVar;
            pVar2 = pVar;
            o1Var2 = o1Var;
            tVar3 = tVar2;
            iVar2 = iVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2(tVar3, z1Var2, iVar2, f12, jVar3, jVar4, z12, aVar2, pVar2, o1Var2, dVar, i11, i12) { // from class: i2.n

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ b4.t f22871b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ z1 f22872c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ i f22873d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ float f22874e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ b4.j f22875f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ a2.j f22876g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ boolean f22877h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ v4.a f22878i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ a2.p f22879j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final /* synthetic */ o1 f22880k;
                public final /* synthetic */ u3.d l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ int f22881m;

                {
                    this.f22881m = i12;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iF = m3.i.F(1);
                    v0.n.f(this.f22870a, this.f22871b, this.f22872c, this.f22873d, this.f22874e, this.f22875f, this.f22876g, this.f22877h, this.f22878i, this.f22879j, this.f22880k, this.l, (m3.n) obj2, iF, this.f22881m);
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final void g(nk.f fVar, m1.a aVar, Function0 function0, m3.n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(1102834756);
        int i12 = i11 | (sVar.f(fVar) ? 4 : 2) | (sVar.f(aVar) ? 32 : 16) | (sVar.h(function0) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            float f11 = lv.t.f28253g;
            b4.q qVar = b4.q.f5711a;
            t tVarZ = d2.c.z(qVar, f11);
            y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5695n, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarZ, sVar);
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
            float f12 = 2;
            s0.g(v1.n.j(m2.n(qVar, 40, f12), lv.s.G, l2.g.b(f12)), 0.0f, 0L, sVar, 0, 6);
            float f13 = lv.t.f28254h;
            d2.c.f(m2.e(qVar, f13), sVar);
            if (fVar instanceof nk.b) {
                sVar.a0(-1684381422);
                cg.c((nk.b) fVar, aVar, sVar, i12 & 126);
                sVar.q(false);
            } else if (fVar instanceof nk.e) {
                sVar.a0(-1684378978);
                f0.q((nk.e) fVar, sVar, i12 & 14);
                sVar.q(false);
            } else if (fVar instanceof nk.c) {
                sVar.a0(-1684376928);
                x0.d(sVar, 0);
                sVar.q(false);
            } else {
                if (!(fVar instanceof nk.d)) {
                    throw e0.f.v(sVar, -1684383170, false);
                }
                sVar.a0(-1684374779);
                o30.e0.h((nk.d) fVar, sVar, i12 & 14);
                sVar.q(false);
            }
            d2.c.f(m2.e(qVar, f13), sVar);
            s0.g(v1.n.j(m2.e(m2.d(qVar, 1.0f), 1), lv.s.H, g0.f23254b), 0.0f, 0L, sVar, 6, 6);
            d2.c.f(m2.e(qVar, f11), sVar);
            t tVarD = m2.d(qVar, 1.0f);
            String strU = f0.U(sVar, R.string.profile_loyalty_card_panel_active_cta);
            boolean z11 = (i12 & 896) == 256;
            Object objM = sVar.M();
            if (z11 || objM == m3.m.f29332a) {
                objM = new rr.a(9, function0);
                sVar.k0(objM);
            }
            l(tVarD, strU, null, null, null, false, false, null, null, (Function0) objM, sVar, 6, 508);
            sVar = sVar;
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new rs.b(fVar, aVar, function0, i11, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(t tVar, final xl.m mVar, Function0 function0, Function2 function2, Function0 function02, m3.n nVar, int i11) {
        t tVar2;
        s sVar;
        b1 b1Var;
        b1 b1Var2;
        Object obj;
        boolean z11;
        final int i12;
        Object obj2;
        g9.f0 f0Var;
        boolean z12;
        d2.g0 g0Var;
        int i13;
        Object obj3;
        mVar.getClass();
        function2.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(1779038067);
        int i14 = i11 | 6 | (sVar2.h(mVar) ? 32 : 16) | (sVar2.h(function0) ? 256 : 128) | (sVar2.h(function2) ? 2048 : 1024) | (sVar2.h(function02) ? 16384 : 8192);
        if (sVar2.R(i14 & 1, (i14 & 9363) != 9362)) {
            final xl.j jVar = (xl.j) m3.i.n(mVar.f44464d, sVar2, 0).getValue();
            g9.f0 f0VarI = a.a.I(new g9.t0[0], sVar2);
            Object objM = sVar2.M();
            Object obj4 = m3.m.f29332a;
            Object obj5 = objM;
            if (objM == obj4) {
                Object objW = m3.i.w(Boolean.FALSE);
                sVar2.k0(objW);
                obj5 = objW;
            }
            b1 b1Var3 = (b1) obj5;
            Object objM2 = sVar2.M();
            Object obj6 = objM2;
            if (objM2 == obj4) {
                Object objW2 = m3.i.w(new Pair("", ""));
                sVar2.k0(objW2);
                obj6 = objW2;
            }
            b1 b1Var4 = (b1) obj6;
            Unit unit = Unit.f26487a;
            boolean zH = ((i14 & 896) == 256) | sVar2.h(mVar) | ((i14 & 57344) == 16384);
            Object objM3 = sVar2.M();
            if (zH || objM3 == obj4) {
                b1Var = b1Var3;
                b1Var2 = b1Var4;
                obj = obj4;
                Object bVar = new af.b(mVar, function02, function0, b1Var2, b1Var, (x70.c) null, 20);
                sVar2.k0(bVar);
                objM3 = bVar;
            } else {
                b1Var = b1Var3;
                obj = obj4;
                b1Var2 = b1Var4;
            }
            m3.i.h(unit, (Function2) objM3, sVar2);
            boolean zF = sVar2.f(jVar) | sVar2.h(f0VarI);
            Object objM4 = sVar2.M();
            Object obj7 = objM4;
            if (zF || objM4 == obj) {
                Object cVar = new rf.c(jVar, f0VarI, null, 22);
                sVar2.k0(cVar);
                obj7 = cVar;
            }
            m3.i.h(jVar, (Function2) obj7, sVar2);
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar2.a0(-571525151);
                Object objM5 = sVar2.M();
                Object obj8 = objM5;
                if (objM5 == obj) {
                    Object bVar2 = new pi.b(b1Var, 29);
                    sVar2.k0(bVar2);
                    obj8 = bVar2;
                }
                Function0 function03 = (Function0) obj8;
                boolean z13 = (i14 & 7168) == 2048;
                Object objM6 = sVar2.M();
                if (z13 || objM6 == obj) {
                    z11 = false;
                    Object eVar = new xl.e(function2, b1Var, b1Var2, false ? 1 : 0);
                    sVar2.k0(eVar);
                    obj3 = eVar;
                } else {
                    z11 = false;
                    obj3 = objM6;
                }
                wd.a.f(function03, (Function0) obj3, sVar2, 6);
                sVar2.q(z11);
            } else {
                z11 = false;
                sVar2.a0(-571327185);
                sVar2.q(false);
            }
            d2.g0 g0Var2 = m2.f13850c;
            z4.u0 u0VarD = d2.p.d(b4.d.f5683a, z11);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            t tVarC = b4.a.c(g0Var2, sVar2);
            b5.j.R.getClass();
            Function0 function04 = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(function04);
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
            m3.i.C(tVarC, gVar4, sVar2);
            long j9 = lv.s.I;
            t tVarR = d2.c.r(d2.c.F(v1.n.j(g0Var2, j9, g0.f23254b)));
            y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar2, 0);
            int iHashCode2 = Long.hashCode(sVar2.T);
            u3.i iVarL2 = sVar2.l();
            t tVarC2 = b4.a.c(tVarR, sVar2);
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(function04);
            } else {
                sVar2.n0();
            }
            m3.i.C(yVarA, gVar, sVar2);
            m3.i.C(iVarL2, gVar2, sVar2);
            a0.y(iHashCode2, sVar2, gVar3, sVar2, dVar);
            m3.i.C(tVarC2, gVar4, sVar2);
            boolean zH2 = sVar2.h(mVar) | sVar2.f(jVar);
            Object objM7 = sVar2.M();
            Object obj9 = objM7;
            if (zH2 || objM7 == obj) {
                final int i15 = 0;
                Object obj10 = new Function0() { // from class: xl.f
                    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
                    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
                    @Override // kotlin.jvm.functions.Function0
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke() {
                        /*
                            Method dump skipped, instruction units count: 222
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: xl.f.invoke():java.lang.Object");
                    }
                };
                sVar2.k0(obj10);
                obj9 = obj10;
            }
            Function0 function05 = (Function0) obj9;
            Integer numValueOf2 = Integer.valueOf(R.string.login_charity_accessibility_close);
            boolean zH3 = sVar2.h(mVar) | sVar2.f(jVar);
            Object objM8 = sVar2.M();
            if (zH3 || objM8 == obj) {
                i12 = 1;
                Object obj11 = new Function0() { // from class: xl.f
                    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
                    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
                    @Override // kotlin.jvm.functions.Function0
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke() {
                        /*
                            Method dump skipped, instruction units count: 222
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: xl.f.invoke():java.lang.Object");
                    }
                };
                sVar2.k0(obj11);
                obj2 = obj11;
            } else {
                i12 = 1;
                obj2 = objM8;
            }
            List listC = c0.c(new cg.a(R.drawable.system_icon_close_neutral_80, numValueOf2, (Function0) obj2));
            Object obj12 = obj;
            cg.j.s("", null, 0L, j9, function05, null, listC, null, sVar2, 3078, 166);
            s sVar3 = sVar2;
            boolean zH4 = sVar3.h(mVar);
            Object objM9 = sVar3.M();
            if (zH4 || objM9 == obj12) {
                f0Var = f0VarI;
                z12 = i12;
                g0Var = g0Var2;
                i13 = 6;
                Object dVar2 = new al.d(1, mVar, xl.m.class, "nextPage", "nextPage(Lcom/app/tgtg/feature/logincharity/ui/model/AuthEmailState;)V", 0, 27);
                sVar3.k0(dVar2);
                objM9 = dVar2;
            } else {
                f0Var = f0VarI;
                z12 = i12;
                g0Var = g0Var2;
                i13 = 6;
            }
            jf.e.i(g0Var, f0Var, (Function1) ((KFunction) objM9), sVar3, i13);
            sVar3.q(z12);
            sVar3.q(z12);
            tVar2 = b4.q.f5711a;
            sVar = sVar3;
        } else {
            sVar2.U();
            tVar2 = tVar;
            sVar = sVar2;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ap.b(tVar2, mVar, function0, function2, function02, i11, 25);
        }
    }

    public static final void i(t tVar, final int i11, final int i12, final boolean z11, final float f11, m3.n nVar, final int i13) {
        final t tVar2;
        b4.q qVar;
        boolean z12;
        boolean z13;
        boolean z14;
        b4.q qVar2;
        b4.k kVar = b4.d.f5687e;
        s sVar = (s) nVar;
        sVar.c0(2079896474);
        int i14 = i13 | 6 | (sVar.d(i11) ? 32 : 16) | (sVar.d(i12) ? 256 : 128) | (sVar.g(z11) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i14 & 1, (i14 & 9363) != 9362)) {
            u uVar = u.f13938a;
            b4.q qVar3 = b4.q.f5711a;
            if (i12 == i11) {
                sVar.a0(-1297107440);
                if (z11) {
                    sVar.a0(-1297097985);
                    t tVarE = m2.e(m2.q(qVar3, f11), 57);
                    z4.u0 u0VarD = d2.p.d(kVar, false);
                    int iHashCode = Long.hashCode(sVar.T);
                    u3.i iVarL = sVar.l();
                    t tVarC = b4.a.c(tVarE, sVar);
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
                    t tVarA = uVar.a(qVar3, kVar);
                    z14 = false;
                    v1.n.d(x0.z(R.drawable.gfx_loyalty_stamp_max_on, sVar, 0), null, tVarA, null, null, 0.0f, null, sVar, 56, 120);
                    sVar.q(true);
                    sVar.q(false);
                    qVar2 = qVar3;
                } else {
                    sVar.a0(-1296638658);
                    t tVarE2 = m2.e(m2.q(qVar3, f11), 61);
                    z4.u0 u0VarD2 = d2.p.d(kVar, false);
                    int iHashCode2 = Long.hashCode(sVar.T);
                    u3.i iVarL2 = sVar.l();
                    t tVarC2 = b4.a.c(tVarE2, sVar);
                    b5.j.R.getClass();
                    b5.h hVar2 = b5.i.f5839b;
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(hVar2);
                    } else {
                        sVar.n0();
                    }
                    m3.i.C(u0VarD2, b5.i.f5843f, sVar);
                    m3.i.C(iVarL2, b5.i.f5842e, sVar);
                    m3.i.v(sVar, Integer.valueOf(iHashCode2), b5.i.f5844g);
                    m3.i.z(sVar, b5.i.f5845h);
                    m3.i.C(tVarC2, b5.i.f5841d, sVar);
                    t tVarA2 = uVar.a(qVar3, kVar);
                    z14 = false;
                    qVar2 = qVar3;
                    v1.n.d(x0.z(R.drawable.gfx_loyalty_stamp_max_off, sVar, 0), null, tVarA2, null, null, 0.0f, null, sVar, 56, 120);
                    sVar.q(true);
                    sVar.q(false);
                }
                sVar.q(z14);
                qVar = qVar2;
            } else {
                sVar.a0(-1296153663);
                t tVarM = m2.m(qVar3, f11);
                z4.u0 u0VarD3 = d2.p.d(kVar, false);
                int iHashCode3 = Long.hashCode(sVar.T);
                u3.i iVarL3 = sVar.l();
                t tVarC3 = b4.a.c(tVarM, sVar);
                b5.j.R.getClass();
                b5.h hVar3 = b5.i.f5839b;
                sVar.e0();
                if (sVar.S) {
                    sVar.k(hVar3);
                } else {
                    sVar.n0();
                }
                m3.i.C(u0VarD3, b5.i.f5843f, sVar);
                m3.i.C(iVarL3, b5.i.f5842e, sVar);
                m3.i.v(sVar, Integer.valueOf(iHashCode3), b5.i.f5844g);
                m3.i.z(sVar, b5.i.f5845h);
                m3.i.C(tVarC3, b5.i.f5841d, sVar);
                if (z11) {
                    sVar.a0(-1308813628);
                    t tVarA3 = uVar.a(qVar3, kVar);
                    z12 = false;
                    v1.n.d(x0.z(R.drawable.gfx_loyalty_stamp_x_on, sVar, 0), null, tVarA3, null, null, 0.0f, null, sVar, 56, 120);
                    sVar.q(false);
                    z13 = true;
                    qVar = qVar3;
                } else {
                    sVar.a0(-1308564977);
                    qVar = qVar3;
                    v1.n.d(x0.z(R.drawable.gfx_loyalty_stamp_x_off, sVar, 0), null, uVar.a(qVar3, kVar), null, null, 0.0f, null, sVar, 56, 120);
                    t tVarA4 = uVar.a(qVar, kVar);
                    Object objM = sVar.M();
                    if (objM == m3.m.f29332a) {
                        objM = new t1.w1(6);
                        sVar.k0(objM);
                    }
                    r9.d(String.valueOf(i12), r.b(tVarA4, (Function1) objM), lv.s.E, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, v.f28274n, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
                    sVar = sVar;
                    z12 = false;
                    sVar.q(false);
                    z13 = true;
                }
                sVar.q(z13);
                sVar.q(z12);
            }
            tVar2 = qVar;
        } else {
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2(i11, i12, z11, f11, i13) { // from class: tn.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f40354b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f40355c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f40356d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ float f40357e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iF = i.F(24577);
                    n.i(this.f40353a, this.f40354b, this.f40355c, this.f40356d, this.f40357e, (m3.n) obj, iF);
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final void j(int i11, co.q qVar, co.c cVar, boolean z11, Function0 function0, m3.n nVar, int i12) {
        int i13;
        b4.q qVar2;
        t tVarC;
        float f11;
        qVar.getClass();
        cVar.getClass();
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(-798536329);
        if ((i12 & 6) == 0) {
            i13 = (sVar.d(i11) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= sVar.d(qVar.ordinal()) ? 32 : 16;
        }
        if ((i12 & MLKEMEngine.KyberPolyBytes) == 0) {
            i13 |= sVar.d(cVar.ordinal()) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= sVar.g(z11) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i12 & 24576) == 0) {
            i13 |= sVar.h(function0) ? 16384 : 8192;
        }
        if (sVar.R(i13 & 1, (i13 & 9363) != 9362)) {
            co.q qVar3 = co.q.MINIMISED;
            c3 c3VarA = t1.d.a(qVar == qVar3 ? 56 : 72, t1.c.k(200, 0, null, 6), "size", sVar, 432, 8);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = a0.s(0, sVar);
            }
            h1 h1Var = (h1) objM;
            b4.q qVar4 = b4.q.f5711a;
            if (qVar != qVar3) {
                sVar.a0(628545019);
                boolean z12 = (i13 & 57344) == 16384;
                Object objM2 = sVar.M();
                if (z12 || objM2 == fVar) {
                    objM2 = new ar.d(13, function0);
                    sVar.k0(objM2);
                }
                tVarC = androidx.compose.foundation.b.c(qVar4, false, null, null, (Function0) objM2, 15);
                qVar2 = qVar4;
                sVar.q(false);
            } else {
                qVar2 = qVar4;
                sVar.a0(628628595);
                sVar.q(false);
                tVarC = qVar2;
            }
            String strValueOf = String.valueOf(i11);
            m5.u0 u0VarA = m5.u0.a(v.f28270i, lv.s.J, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214);
            float f12 = 1;
            long j9 = lv.s.H;
            l2.f fVar2 = l2.g.f26790a;
            r9.d(strValueOf, m2.t(v1.n.j(m2.m(d2.c.z(f4.g.b(v1.n.k(tVarC, f12, j9, fVar2), fVar2), f12), ((z5.f) c3VarA.getValue()).f47277a), lv.s.C, g0.f23254b), 2), 0L, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, u0VarA, sVar, 0, 0, 130044);
            if (cVar == co.c.START) {
                sVar.a0(629260871);
                sVar.q(false);
                f11 = lv.t.f28258m;
            } else {
                sVar.a0(629303465);
                f11 = (-d70.a.e(sVar, h1Var.h())) - lv.t.f28251e;
                sVar.q(false);
            }
            boolean z13 = !z11 && qVar == co.q.MAXIMISED;
            s1.x0 x0VarD = r0.d(t1.c.k(300, 0, null, 6), 2);
            y0 y0VarE = r0.e(t1.c.k(300, 0, null, 6), 2);
            t tVarW = d2.c.w(qVar2, f11, 0.0f, 2);
            Object objM3 = sVar.M();
            if (objM3 == fVar) {
                objM3 = new co.t(h1Var, 0);
                sVar.k0(objM3);
            }
            s1.y.d(z13, z4.c0.q(tVarW, (Function1) objM3), x0VarD, y0VarE, null, u3.e.e(1737087391, sVar, new cg.t(i11, 1)), sVar, 200064, 16);
            sVar = sVar;
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new co.u(i11, qVar, cVar, z11, function0, i12, 0);
        }
    }

    public static final void k(int i11, m3.n nVar, int i12) {
        s sVar;
        s sVar2 = (s) nVar;
        sVar2.c0(1810496312);
        int i13 = (sVar2.d(i11) ? 4 : 2) | i12;
        if (sVar2.R(i13 & 1, (i13 & 3) != 2)) {
            b4.q qVar = b4.q.f5711a;
            long j9 = lv.s.f28217b;
            t tVarJ = v1.n.j(v1.n.k(m2.u(qVar, null, 3), 1, j9, l2.g.b(32)), lv.s.J, g0.f23254b);
            y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar2, 0);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            t tVarC = b4.a.c(tVarJ, sVar2);
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
            r9.d(f0.U(sVar2, i11), d2.c.A(qVar, lv.t.f28251e, lv.t.f28249c), j9, 0L, null, 0L, null, new x5.k(5), 0L, 0, false, 1, 0, null, v.f28273m, sVar2, MLKEMEngine.KyberPolyBytes, 12607488, 113656);
            sVar = sVar2;
            sVar.q(true);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new on.j(i11, i12, 15);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(b4.t r25, java.lang.String r26, java.lang.String r27, lv.q r28, lv.e r29, boolean r30, boolean r31, java.lang.Integer r32, java.lang.Integer r33, kotlin.jvm.functions.Function0 r34, m3.n r35, int r36, int r37) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.n.l(b4.t, java.lang.String, java.lang.String, lv.q, lv.e, boolean, boolean, java.lang.Integer, java.lang.Integer, kotlin.jvm.functions.Function0, m3.n, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0256  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(b4.t r25, com.app.tgtg.model.remote.order.Order r26, kotlin.jvm.functions.Function1 r27, m3.n r28, int r29) {
        /*
            Method dump skipped, instruction units count: 1166
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.n.m(b4.t, com.app.tgtg.model.remote.order.Order, kotlin.jvm.functions.Function1, m3.n, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(b4.t r25, java.lang.String r26, java.lang.String r27, lv.q r28, lv.e r29, boolean r30, boolean r31, java.lang.Integer r32, java.lang.Integer r33, kotlin.jvm.functions.Function0 r34, m3.n r35, int r36, int r37) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.n.n(b4.t, java.lang.String, java.lang.String, lv.q, lv.e, boolean, boolean, java.lang.Integer, java.lang.Integer, kotlin.jvm.functions.Function0, m3.n, int, int):void");
    }

    public static final void o(final t tVar, final String str, String str2, lv.q qVar, lv.e eVar, boolean z11, final Function0 function0, m3.n nVar, final int i11, final int i12, final int i13) {
        int i14;
        String str3;
        int i15;
        boolean z12;
        int i16;
        int i17;
        s sVar;
        final lv.q qVar2;
        final boolean z13;
        final String str4;
        final lv.e eVar2;
        int i18;
        String str5;
        tVar.getClass();
        str.getClass();
        function0.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(927706248);
        if ((i11 & 6) == 0) {
            i14 = (sVar2.f(tVar) ? 4 : 2) | i11;
        } else {
            i14 = i11;
        }
        if ((i11 & 48) == 0) {
            i14 |= sVar2.f(str) ? 32 : 16;
        }
        int i19 = i13 & 4;
        if (i19 != 0) {
            i15 = i14 | MLKEMEngine.KyberPolyBytes;
            str3 = str2;
        } else {
            str3 = str2;
            i15 = i14 | (sVar2.f(str3) ? 256 : 128);
        }
        int i21 = i13 & 8;
        if (i21 != 0) {
            i15 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i15 |= sVar2.d(qVar == null ? -1 : qVar.ordinal()) ? NewHope.SENDB_BYTES : 1024;
        }
        int i22 = i15 | 24576;
        int i23 = i13 & 32;
        if (i23 != 0) {
            i16 = i15 | 221184;
            z12 = z11;
        } else {
            z12 = z11;
            i16 = i22 | (sVar2.g(z12) ? 131072 : 65536);
        }
        int i24 = i16 | 920125440;
        if ((i12 & 6) == 0) {
            i17 = i12 | (sVar2.h(function0) ? 4 : 2);
        } else {
            i17 = i12;
        }
        if (sVar2.R(i24 & 1, ((306783379 & i24) == 306783378 && (i17 & 3) == 2) ? false : true)) {
            if (i19 != 0) {
                str5 = null;
                i18 = i23;
            } else {
                i18 = i23;
                str5 = str3;
            }
            qVar2 = i21 != 0 ? lv.q.REGULAR : qVar;
            eVar2 = lv.e.MEDIUM;
            boolean z14 = i18 != 0 ? true : z12;
            sVar = sVar2;
            d(tVar, str, str5, new z(lv.r.TERTIARY, qVar2, eVar2), z14, false, null, null, true, function0, sVar, (i24 & 1022) | (57344 & (i24 >> 3)) | 14352384 | ((i17 << 27) & 1879048192));
            str4 = str5;
            z13 = z14;
        } else {
            sVar = sVar2;
            sVar.U();
            qVar2 = qVar;
            z13 = z12;
            str4 = str3;
            eVar2 = eVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2() { // from class: dg.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    n.o(tVar, str, str4, qVar2, eVar2, z13, function0, (m3.n) obj, i.F(i11 | 1), i.F(i12), i13);
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final void p(t0 t0Var, Object obj, Object obj2) {
        int i11 = t0Var.i(obj);
        boolean z11 = i11 < 0;
        Object obj3 = z11 ? null : t0Var.f35754c[i11];
        if (obj3 != null) {
            if (obj3 instanceof u0) {
                ((u0) obj3).d(obj2);
            } else if (obj3 != obj2) {
                u0 u0Var = new u0();
                u0Var.d(obj3);
                u0Var.d(obj2);
                obj2 = u0Var;
            }
            obj2 = obj3;
        }
        if (!z11) {
            t0Var.f35754c[i11] = obj2;
            return;
        }
        int i12 = ~i11;
        t0Var.f35753b[i12] = obj;
        t0Var.f35754c[i12] = obj2;
    }

    public static void q(String str, StringBuilder sb2) {
        str.getClass();
        sb2.append('\"');
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == '\n') {
                sb2.append("%0A");
            } else if (cCharAt == '\r') {
                sb2.append("%0D");
            } else if (cCharAt != '\"') {
                sb2.append(cCharAt);
            } else {
                sb2.append("%22");
            }
        }
        sb2.append('\"');
    }

    public static final e6.l r(String str, q qVar) {
        e6.i iVar = new e6.i();
        iVar.f15778c = new e6.n();
        e6.l lVar = new e6.l(iVar);
        iVar.f15777b = lVar;
        iVar.f15776a = a0.class;
        try {
            qVar.J(new ry.b(23, iVar, qVar));
            iVar.f15776a = str;
            return lVar;
        } catch (Exception e5) {
            lVar.b(e5);
            return lVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(v80.i0 r5, long r6, z70.c r8) {
        /*
            boolean r0 = r8 instanceof w.b0
            if (r0 == 0) goto L13
            r0 = r8
            w.b0 r0 = (w.b0) r0
            int r1 = r0.f42648k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f42648k = r1
            goto L18
        L13:
            w.b0 r0 = new w.b0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f42647j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f42648k
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r8)
            goto L42
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L2e:
            ba0.g.M(r8)
            sf.a r8 = new sf.a
            r2 = 0
            r4 = 12
            r8.<init>(r5, r2, r4)
            r0.f42648k = r3
            java.lang.Object r8 = v80.j2.c(r6, r8, r0)
            if (r8 != r1) goto L42
            return r1
        L42:
            if (r8 == 0) goto L45
            goto L46
        L45:
            r3 = 0
        L46:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.n.s(v80.i0, long, z70.c):java.lang.Object");
    }

    public static r8.j t(int i11) {
        int i12 = (i11 & 1) != 0 ? 8 : 10;
        float f11 = i12;
        float fCos = 1.0f / ((float) Math.cos(r8.l.f37777b / f11));
        r8.a aVar = new r8.a(1.0f, 2);
        float[] fArr = new float[i12 * 2];
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            long jF = pd.g.F(r8.l.c(fCos, (r8.l.f37777b / f11) * 2 * i14), q1.h.a(0.0f, 0.0f));
            int i15 = i13 + 1;
            fArr[i13] = pd.g.y(jF);
            i13 += 2;
            fArr[i15] = pd.g.z(jF);
        }
        return u00.d.k(fArr, aVar, null, 0.0f, 0.0f);
    }

    public static t0 u() {
        long[] jArr = g1.f35760a;
        return new t0();
    }

    public static f30.d v(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new f30.d(new f30.g(context));
    }

    public static final a80.b w(Enum[] enumArr) {
        enumArr.getClass();
        return new a80.b(enumArr);
    }

    public static final long x(float f11, int i11, long j9, boolean z11) {
        int i12 = ((z11 || i11 == 2 || i11 == 4 || i11 == 5) && z5.a.e(j9)) ? z5.a.i(j9) : Integer.MAX_VALUE;
        if (z5.a.k(j9) != i12) {
            i12 = n80.p.c(m2.g0.r(f11), z5.a.k(j9), i12);
        }
        return w.r(0, i12, 0, z5.a.h(j9));
    }

    public static final g3.o y(j0 j0Var, boolean z11, boolean z12, boolean z13, s sVar) {
        j0Var.getClass();
        lv.f fVar = (lv.f) j0Var.f23743c;
        lv.f fVar2 = (lv.f) j0Var.f23742b;
        lv.f fVar3 = (lv.f) j0Var.f23741a;
        b2 b2Var = g3.p.f19253a;
        return g3.p.a(!z12 ? lv.s.K : (z11 || z13) ? fVar2.f28188b : fVar3.f28188b, (z11 || z13) ? fVar2.f28187a : fVar3.f28187a, !z12 ? lv.s.K : fVar.f28188b, fVar.f28187a, sVar, 0);
    }

    public static String z(int i11) {
        ArrayList arrayList = new ArrayList();
        if ((i11 & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i11 & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i11 & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        return String.join("|", arrayList);
    }
}
