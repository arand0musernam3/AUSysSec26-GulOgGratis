package z20;

import a3.p2;
import android.database.SQLException;
import android.graphics.RectF;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Size;
import android.view.View;
import androidx.lifecycle.s1;
import b4.q;
import b4.t;
import c5.d2;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.tgtg.componentlibrary.component.p000switch.PantrySwitchKt;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.h2;
import d2.i2;
import d2.m2;
import d2.p;
import d2.w;
import d2.w0;
import d2.y;
import d40.t1;
import f0.t0;
import g3.o6;
import g3.r9;
import g3.s0;
import g3.v3;
import g3.w6;
import gd.o;
import i4.g0;
import j4.s;
import j5.r;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.c0;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import lv.v;
import m3.n;
import m3.v1;
import m3.w1;
import m5.u0;
import o00.x0;
import o30.e0;
import o30.f0;
import oo.z;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import q90.o0;
import q90.p0;
import q90.r0;
import v80.b0;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static t10.c f46933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f46934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static WeakReference f46935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f46936d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f46937e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f46938f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f46939g = 0;

    public static boolean A() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Samsung")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Samsung")) {
                return false;
            }
        }
        return "ON7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27;
    }

    public static boolean B() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Samsung")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Samsung")) {
                return false;
            }
        }
        String str3 = Build.DEVICE;
        return "q4q".equalsIgnoreCase(str3) || "SCG16".equalsIgnoreCase(str3) || "SC-55C".equalsIgnoreCase(str3);
    }

    public static final p0 C(p0 p0Var) {
        p0Var.getClass();
        o0 o0VarG = p0Var.g();
        r0 r0Var = p0Var.f36588g;
        o0VarG.f36573g = new r90.c(r0Var.g(), r0Var.e());
        return o0VarG.a();
    }

    public static int D(int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (i11 == 1) {
            return 90;
        }
        if (i11 == 2) {
            return 180;
        }
        if (i11 == 3) {
            return 270;
        }
        i4.a.f(s.f(i11, "Unsupported surface rotation: "));
        return 0;
    }

    public static final void E(int i11, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Error code: " + i11);
        sb2.append(", message: ".concat(str));
        throw new SQLException(sb2.toString());
    }

    public static byte F(Boolean bool) {
        if (bool != null) {
            return !bool.booleanValue() ? (byte) 0 : (byte) 1;
        }
        return (byte) -1;
    }

    public static Boolean G(byte b8) {
        if (b8 == 0) {
            return Boolean.FALSE;
        }
        if (b8 != 1) {
            return null;
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0269  */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v6, types: [int] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(tg.i r39, boolean r40, kotlin.jvm.functions.Function0 r41, kotlin.jvm.functions.Function0 r42, kotlin.jvm.functions.Function0 r43, kotlin.jvm.functions.Function0 r44, java.lang.String r45, m3.n r46, int r47, int r48) {
        /*
            Method dump skipped, instruction units count: 1233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z20.b.a(tg.i, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, java.lang.String, m3.n, int, int):void");
    }

    public static final void b(final w6 w6Var, final String str, final String str2, final String str3, final String str4, final String str5, final boolean z11, final Function0 function0, Function0 function02, n nVar, int i11) {
        m3.s sVar;
        Function0 function03;
        w6Var.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        function0.getClass();
        function02.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-1834372276);
        int i12 = i11 | (sVar2.f(w6Var) ? 4 : 2) | (sVar2.f(str) ? 32 : 16) | (sVar2.f(str2) ? 256 : 128) | (sVar2.f(str3) ? NewHope.SENDB_BYTES : 1024) | (sVar2.f(str4) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar2.f(str5) ? 131072 : 65536) | (sVar2.g(z11) ? 1048576 : 524288) | (sVar2.h(function0) ? 8388608 : 4194304);
        if (sVar2.R(i12 & 1, (38347923 & i12) != 38347922)) {
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.o(kotlin.coroutines.g.f26549a, sVar2);
                sVar2.k0(objM);
            }
            final b0 b0Var = (b0) objM;
            long j9 = lv.s.J;
            Object objM2 = sVar2.M();
            if (objM2 == fVar) {
                function03 = function02;
                objM2 = new z(5, function03);
                sVar2.k0(objM2);
            } else {
                function03 = function02;
            }
            Function0 function04 = (Function0) objM2;
            final Function0 function05 = function03;
            sVar = sVar2;
            v3.a(function04, null, w6Var, 0.0f, false, null, j9, 0L, 0.0f, 0L, null, null, null, u3.e.e(-1253931990, sVar2, new i80.n() { // from class: pi.f
                @Override // i80.n
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    m3.n nVar2 = (m3.n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((d2.z) obj).getClass();
                    m3.s sVar3 = (m3.s) nVar2;
                    if (sVar3.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                        b4.q qVar = b4.q.f5711a;
                        t tVarR = v1.n.r(m2.d(qVar, 1.0f), v1.n.q(sVar3), true);
                        y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar3, 0);
                        int iHashCode = Long.hashCode(sVar3.T);
                        u3.i iVarL = sVar3.l();
                        t tVarC = b4.a.c(tVarR, sVar3);
                        b5.j.R.getClass();
                        b5.h hVar = b5.i.f5839b;
                        sVar3.e0();
                        if (sVar3.S) {
                            sVar3.k(hVar);
                        } else {
                            sVar3.n0();
                        }
                        b5.g gVar = b5.i.f5843f;
                        m3.i.C(yVarA, gVar, sVar3);
                        b5.g gVar2 = b5.i.f5842e;
                        m3.i.C(iVarL, gVar2, sVar3);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        b5.g gVar3 = b5.i.f5844g;
                        m3.i.v(sVar3, numValueOf, gVar3);
                        b5.d dVar = b5.i.f5845h;
                        m3.i.z(sVar3, dVar);
                        b5.g gVar4 = b5.i.f5841d;
                        m3.i.C(tVarC, gVar4, sVar3);
                        float f11 = 16;
                        t tVarD = d2.c.D(qVar, 0.0f, f11, f11, 0.0f, 9);
                        fg.f fVar2 = new fg.f(w6Var, function05, b0Var);
                        c5.s sVar4 = c5.m2.f7291a;
                        v1.n.d(x0.z(R.drawable.ic_close24, sVar3, 0), "CloseButton", b3.i.f(b4.d.f5696o, b4.a.a(tVarD, sVar4, fVar2)), null, null, 0.0f, null, sVar3, 56, 120);
                        float f12 = 24;
                        float f13 = 12;
                        float f14 = 1;
                        t tVarZ = d2.c.z(v1.n.k(v1.n.j(d2.c.D(d2.c.B(m2.t(m2.d(qVar, 1.0f), 3), f11, 0.0f, 2), 0.0f, f12, 0.0f, 0.0f, 13), lv.s.f28222d0, l2.g.b(f13)), f14, lv.s.f28224e0, l2.g.b(f13)), f11);
                        String strU = f0.U(sVar3, R.string.charity_plan_tentative_message);
                        u0 u0Var = v.f28274n;
                        long j11 = lv.s.C;
                        r9.d(strU, tVarZ, j11, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar3, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
                        t tVarD2 = d2.c.D(qVar, 0.0f, f12, 0.0f, 0.0f, 13);
                        b4.i iVar = b4.d.f5695n;
                        t tVarF = b3.i.f(iVar, tVarD2);
                        l2.f fVar3 = l2.g.f26790a;
                        long j12 = lv.s.H;
                        gd.o.c(str, "PlanStoreLogo", v1.n.k(v1.n.j(m2.m(f4.g.b(tVarF, fVar3), 65), lv.s.J, g0.f23254b), (float) 0.8d, j12, fVar3), null, x0.z(R.drawable.gfx_tgtg_logo_green_small, sVar3, 0), null, z4.l.f47172g, 0.0f, null, sVar3, 32816, 6, 31720);
                        r9.d(r8.k.m(str2, " - ", str3), d2.j(d2.c.D(d2.c.B(m2.t(m2.d(qVar, 1.0f), 3), f11, 0.0f, 2), 0.0f, f11, 0.0f, 0.0f, 13), "PlanStoreNameBranch"), j11, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, v.f28272k, sVar3, 432, 12582912, 130040);
                        r9.d(str4, d2.j(d2.c.B(m2.t(m2.d(qVar, 1.0f), 3), f11, 0.0f, 2), "PlanStoreAddress"), j11, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, v.f28276p, sVar3, 432, 12582912, 130040);
                        t tVarJ = d2.j(d2.c.D(d2.c.B(m2.t(m2.d(b4.a.a(qVar, sVar4, new on.l(2, function0)), 1.0f), 3), f11, 0.0f, 2), 0.0f, f11, 0.0f, 32, 5), "PlanStoreRow");
                        i2 i2VarA = h2.a(d2.i.f13805e, b4.d.f5693k, sVar3, 54);
                        int iHashCode2 = Long.hashCode(sVar3.T);
                        u3.i iVarL2 = sVar3.l();
                        t tVarC2 = b4.a.c(tVarJ, sVar3);
                        sVar3.e0();
                        if (sVar3.S) {
                            sVar3.k(hVar);
                        } else {
                            sVar3.n0();
                        }
                        m3.i.C(i2VarA, gVar, sVar3);
                        m3.i.C(iVarL2, gVar2, sVar3);
                        a0.y(iHashCode2, sVar3, gVar3, sVar3, dVar);
                        m3.i.C(tVarC2, gVar4, sVar3);
                        v1.n.d(x0.z(R.drawable.ic_location_green, sVar3, 0), "LocationIcon", m2.m(qVar, 20), null, null, 0.0f, null, sVar3, 440, 120);
                        t tVarU = m2.u(qVar, null, 3);
                        float f15 = 8;
                        r9.d(f0.U(sVar3, R.string.charity_plan_find_store), d2.c.D(tVarU, f15, 0.0f, 0.0f, 0.0f, 14), lv.s.f28217b, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, v.f28281u, sVar3, 432, 12582912, 130040);
                        sVar3.q(true);
                        s0.g(d2.j(d2.c.B(m2.d(qVar, 1.0f), f11, 0.0f, 2), "HorizontalDivider1"), f14, j12, sVar3, 438, 0);
                        t tVarD3 = d2.c.D(d2.c.B(m2.t(m2.d(qVar, 1.0f), 3), f11, 0.0f, 2), 0.0f, f12, 0.0f, 0.0f, 13);
                        String strU2 = f0.U(sVar3, R.string.charity_plan_expected_collection_time);
                        u0 u0Var2 = v.f28275o;
                        r9.d(strU2, tVarD3, j11, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, u0Var2, sVar3, 432, 12582912, 130040);
                        r9.d(str5, d2.c.A(v1.n.j(d2.c.D(d2.c.B(m2.u(qVar, null, 3).then(new w0(iVar)), f11, 0.0f, 2), 0.0f, f11, 0.0f, 0.0f, 13), lv.s.I, l2.g.b(f13)), f11, 4), j11, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar3, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
                        s0.g(d2.j(d2.c.B(d2.c.D(m2.d(qVar, 1.0f), 0.0f, f12, 0.0f, 0.0f, 13), f11, 0.0f, 2), "HorizontalDivider2"), f14, j12, sVar3, 438, 0);
                        t tVarD4 = d2.c.D(d2.c.B(m2.t(m2.d(qVar, 1.0f), 3), f11, 0.0f, 2), 0.0f, f12, 0.0f, 0.0f, 13);
                        boolean z12 = z11;
                        r9.d(f0.U(sVar3, z12 ? R.string.charity_plan_primary_collector : R.string.charity_plan_backup_collector), tVarD4, j11, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, u0Var2, sVar3, 432, 12582912, 130040);
                        r9.d(f0.U(sVar3, z12 ? R.string.charity_plan_primary_collector_message : R.string.charity_plan_backup_collector_message), d2.c.B(d2.c.B(m2.t(m2.d(qVar, 1.0f), 3), f11, 0.0f, 2), 0.0f, f15, 1), j11, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, u0Var, sVar3, 432, 12582912, 130040);
                        sVar3.q(true);
                    } else {
                        sVar3.U();
                    }
                    return Unit.f26487a;
                }
            }), sVar, ((i12 << 6) & 896) | 1572864, 3078, 7098);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new pi.g(w6Var, str, str2, str3, str4, str5, z11, function0, function02, i11);
        }
    }

    public static final void c(t tVar, BasicItem basicItem, float f11, n nVar, int i11) {
        int i12;
        BasicItem basicItem2;
        basicItem.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1620418396);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(tVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            basicItem2 = basicItem;
            i12 |= sVar.h(basicItem2) ? 32 : 16;
        } else {
            basicItem2 = basicItem;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.c(f11) ? 256 : 128;
        }
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            gd.i iVarG = o.g(basicItem2.getInformation().getCoverPicture().getCurrentUrl(), x0.z(R.drawable.transparent_vector, sVar, 0), x0.z(R.drawable.transparent_vector, sVar, 0), x0.z(R.drawable.transparent_vector, sVar, 0), sVar);
            t tVarB = f4.g.b(tVar, l2.g.b(8));
            long j9 = lv.s.H;
            t tVarJ = v1.n.j(tVarB, j9, g0.f23254b);
            z4.u0 u0VarD = p.d(b4.d.f5683a, false);
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
            m3.i.C(u0VarD, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            v1.n.d(iVarG, null, m2.f13850c, null, z4.l.f47166a, f11, new i4.o(j9, 16), sVar, ((i12 << 9) & 458752) | 25008, 8);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new fg.c(tVar, basicItem2, f11, i11, 0);
        }
    }

    public static z5.d d() {
        return new z5.d(1.0f, 1.0f);
    }

    public static final void e(String str, String str2, String str3, Function0 function0, n nVar, int i11) {
        function0.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1079504079);
        int i12 = i11 | (sVar.f(str) ? 4 : 2) | (sVar.f(str2) ? 32 : 16) | (sVar.f(str3) ? 256 : 128) | (sVar.h(function0) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            long j9 = lv.s.J;
            i4.r0 r0Var = g0.f23254b;
            q qVar = q.f5711a;
            t tVarJ = v1.n.j(qVar, j9, r0Var);
            float f11 = lv.t.f28253g;
            t tVarD = m2.d(d2.c.z(tVarJ, f11), 1.0f);
            d2.g gVarG = d2.i.g(8);
            b4.i iVar = b4.d.f5695n;
            y yVarA = w.a(gVarG, iVar, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarD, sVar);
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
            v1.n.d(x0.z(R.drawable.sad_face_beige_bg, sVar, 0), null, null, null, null, 0.0f, null, sVar, 56, 124);
            r9.d(str == null ? "" : str, d2.c.D(qVar, 0.0f, f11, 0.0f, 0.0f, 13), 0L, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, v.f28272k, sVar, 48, 12582912, 130044);
            r9.d(str2 == null ? "" : str2, new w0(iVar), 0L, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, v.f28274n, sVar, 0, 12582912, 130044);
            t tVarD2 = d2.c.D(qVar, 0.0f, f11, 0.0f, 0.0f, 13);
            boolean z11 = (i12 & 7168) == 2048;
            Object objM = sVar.M();
            if (z11 || objM == m3.m.f29332a) {
                objM = new ki.a(7, function0);
                sVar.k0(objM);
            }
            t tVarC2 = androidx.compose.foundation.b.c(tVarD2, false, null, null, (Function0) objM, 15);
            r9.d(str3 == null ? "" : str3, tVarC2, lv.s.f28217b, 0L, null, 0L, x5.l.f43854c, new x5.k(3), 0L, 0, false, 0, 0, null, v.f28283w, sVar, 805306752, 12582912, 129528);
            sVar = sVar;
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.p(str, str2, i11, str3, function0, 24);
        }
    }

    public static final void f(g9.l lVar, y3.b bVar, u3.d dVar, n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(233973821);
        if ((((sVar.h(lVar) ? 4 : 2) | i11 | (sVar.h(bVar) ? 32 : 16)) & 147) == 146 && sVar.B()) {
            sVar.U();
        } else {
            m3.i.b(new v1[]{z8.a.f47351a.a(lVar), w8.g.f43289a.a(lVar), fa.a.f17529a.a(lVar)}, u3.e.e(1808964477, sVar, new i9.l(1, bVar, dVar)), sVar, 56);
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new an.d(lVar, bVar, dVar, i11, 19);
        }
    }

    public static final void g(int i11, t tVar, Function0 function0, n nVar) {
        t tVar2;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1984704404);
        int i12 = i11 | 6 | (sVar.h(function0) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            le.p pVarD = e0.D(new le.q("thumbup.json"), sVar, 6);
            t tVarI = v1.n.i(m2.f13850c, qb.e.I(d0.h(new i4.v(lv.s.I), new i4.v(lv.s.f28229i)), 0.0f, 0.0f, 14), 0.0f, 6);
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarI, sVar);
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
            cg.j.s("", null, 0L, lv.s.K, null, null, c0.c(new cg.a(R.drawable.system_icon_close_neutral_80, Integer.valueOf(R.string.login_charity_accessibility_close), function0)), null, sVar, 3078, 182);
            q qVar = q.f5711a;
            t tVarD = m2.d(qVar, 1.0f);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            t tVarE = b3.i.e(1.0f, tVarD, true);
            y yVarA2 = w.a(d2.i.f13805e, b4.d.f5695n, sVar, 54);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = b4.a.c(tVarE, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA2, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            x0.f((he.k) pVarD.getValue(), null, false, 0.0f, 0, false, b4.d.f5687e, sVar, 0, 196608, 4161534);
            t tVarT = m2.t(m2.d(qVar, 1.0f), 3);
            float f11 = lv.t.f28253g;
            t tVarD2 = d2.c.D(d2.c.B(tVarT, f11, 0.0f, 2), 0.0f, lv.t.f28256j, 0.0f, 0.0f, 13);
            tVar2 = qVar;
            r9.d(f0.U(sVar, R.string.login_charity_contact_how_to_reach_thank_you), tVarD2, lv.s.f28215a, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, v.f28262a, sVar, 432, 12582912, 130040);
            r9.d(f0.U(sVar, R.string.login_charity_contact_how_to_reach_thank_you_text), d2.c.D(d2.c.B(m2.t(m2.d(tVar2, 1.0f), 3), f11, 0.0f, 2), 0.0f, lv.t.f28252f, 0.0f, 0.0f, 13), lv.s.C, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, v.f28274n, sVar, 432, 12582912, 130040);
            sVar = sVar;
            sVar.q(true);
            sVar.q(true);
        } else {
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new dm.g(tVar2, function0, i11, 0);
        }
    }

    public static final void h(y3.b bVar, u3.d dVar, n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(832919318);
        int i12 = (sVar.h(bVar) ? 4 : 2) | i11 | (sVar.h(dVar) ? 32 : 16);
        if ((i12 & 19) == 18 && sVar.B()) {
            sVar.U();
        } else {
            Object objM = sVar.M();
            if (objM == m3.m.f29332a) {
                objM = new hb0.q(14);
                sVar.k0(objM);
            }
            Function1 function1 = (Function1) objM;
            s1 s1VarA = z8.a.a(sVar);
            if (s1VarA == null) {
                com.braze.h2.b("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(i9.a.class);
            y8.c cVar = new y8.c(0);
            cVar.a(Reflection.getOrCreateKotlinClass(i9.a.class), function1);
            i9.a aVar = (i9.a) t1.K(orCreateKotlinClass, s1VarA, cVar.b(), s1VarA instanceof androidx.lifecycle.p ? ((androidx.lifecycle.p) s1VarA).getDefaultViewModelCreationExtras() : y8.a.f45423b, sVar);
            aVar.f23502b = new a50.c(bVar);
            bVar.e(aVar.f23501a, dVar, sVar, ((i12 << 6) & 896) | (i12 & 112));
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new gn.i(bVar, dVar, i11, 11);
        }
    }

    public static final void i(int i11, t tVar, String str, Function0 function0, n nVar, boolean z11) {
        String str2;
        str.getClass();
        function0.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-237983688);
        int i12 = i11 | (sVar.f(str) ? 4 : 2) | (sVar.g(z11) ? 32 : 16) | (sVar.h(function0) ? 256 : 128) | (sVar.f(tVar) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            x60.j jVar = (x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            t tVarD = m2.d(tVar, 1.0f);
            i2 i2VarA = h2.a(d2.i.f13807g, b4.d.f5693k, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarD, sVar);
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
            int i13 = i12 & 14;
            r9.d(str, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43959h, sVar, i13, 0, 131070);
            str2 = str;
            sVar = sVar;
            boolean z12 = i13 == 4;
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (z12 || objM == fVar) {
                objM = new gt.e(str2, 9);
                sVar.k0(objM);
            }
            t tVarC2 = r.c(q.f5711a, false, (Function1) objM);
            boolean z13 = (i12 & 896) == 256;
            Object objM2 = sVar.M();
            if (z13 || objM2 == fVar) {
                objM2 = new p2(9, function0);
                sVar.k0(objM2);
            }
            PantrySwitchKt.LargePantrySwitch(z11, tVarC2, (Function1) objM2, false, sVar, (i12 >> 3) & 14, 8);
            sVar.q(true);
        } else {
            str2 = str;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cp.h(str2, z11, function0, tVar, i11, 1);
        }
    }

    public static final void j(String str, Function0 function0, t tVar, n nVar, int i11) {
        t tVar2;
        str.getClass();
        function0.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(360000462);
        int i12 = i11 | (sVar.f(str) ? 4 : 2) | (sVar.h(function0) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            q qVar = q.f5711a;
            s0.c(function0, d2.c.k(d2.c.A(m2.d(qVar, 1.0f), lv.t.f28251e, lv.t.f28253g), 1.7777778f), false, l2.g.b(15), s0.p(lv.s.f28217b, sVar, 6), s0.q(5, 0.0f, 0.0f, 0.0f, 62), u3.e.e(-462997501, sVar, new o6(str, 1)), sVar, ((i12 >> 3) & 14) | 100663296, 196);
            tVar2 = qVar;
        } else {
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new an.d(str, function0, tVar2, i11, 24);
        }
    }

    public static RectF l(l1.c cVar, Size size) {
        float f11 = cVar.f26757c;
        if (Float.isNaN(f11)) {
            f11 = 0.0f;
        }
        float f12 = cVar.f26758d;
        float f13 = Float.isNaN(f12) ? 0.0f : f12;
        float width = cVar.f26759e;
        if (Float.isNaN(width)) {
            width = size.getWidth();
        }
        float height = cVar.f26760f;
        if (Float.isNaN(height)) {
            height = size.getHeight();
        }
        return new RectF(f11, f13, width, height);
    }

    public static final void m(ha.a aVar, String str) {
        aVar.getClass();
        str.getClass();
        ha.c cVarV0 = aVar.v0(str);
        try {
            cVarV0.q0();
            w.b.y(cVarV0, null);
        } finally {
        }
    }

    public static final g9.p n(View view) {
        view.getClass();
        g9.p pVar = (g9.p) o80.r.j(o80.r.n(o80.o.d(view, new g9.r0(0)), new g9.r0(1)));
        if (pVar != null) {
            return pVar;
        }
        a40.d0.q("View ", view, " does not have a NavController set");
        return null;
    }

    public static final kotlin.collections.w o(e0.v vVar) {
        vVar.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES;
        key.getClass();
        Object obj = {0};
        Object objC = ((t0) vVar).c(key);
        if (objC != null) {
            obj = objC;
        }
        return new kotlin.collections.w((int[]) obj);
    }

    public static int p(int i11, int i12, boolean z11) {
        int i13 = z11 ? ((i12 - i11) + 360) % 360 : (i12 + i11) % 360;
        if (wd.a.B(2, "CameraOrientationUtil")) {
            StringBuilder sbR = r8.k.r(i11, i12, "getRelativeImageRotation: destRotationDegrees=", ", sourceRotationDegrees=", ", isOppositeFacing=");
            sbR.append(z11);
            sbR.append(", result=");
            sbR.append(i13);
            wd.a.p("CameraOrientationUtil", sbR.toString());
        }
        return i13;
    }

    public static final int q(e0.v vVar, int i11) {
        vVar.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES;
        key.getClass();
        Object obj = {0};
        t0 t0Var = (t0) vVar;
        Object objC = t0Var.c(key);
        if (objC != null) {
            obj = objC;
        }
        if (new kotlin.collections.w((int[]) obj).contains(Integer.valueOf(i11))) {
            return i11;
        }
        key.getClass();
        Object obj2 = {0};
        Object objC2 = t0Var.c(key);
        if (objC2 != null) {
            obj2 = objC2;
        }
        return new kotlin.collections.w((int[]) obj2).contains(1) ? 1 : 0;
    }

    public static final boolean r(e0.v vVar) {
        vVar.getClass();
        return Build.VERSION.SDK_INT >= 28 && q(vVar, 5) == 5;
    }

    public static boolean s() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Huawei")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Huawei")) {
                return false;
            }
        }
        return "HWANE".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean t() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Nokia")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Nokia")) {
                return false;
            }
        }
        String str3 = Build.DEVICE;
        return "B2N".equalsIgnoreCase(str3) || "B2N_sprout".equalsIgnoreCase(str3);
    }

    public static boolean u() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("OnePlus")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("OnePlus")) {
                return false;
            }
        }
        return "OnePlus6".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean v() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("OnePlus")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("OnePlus")) {
                return false;
            }
        }
        return "OnePlus6T".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean w(int i11) {
        int type = Character.getType(i11);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static boolean x() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Redmi")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Redmi")) {
                return false;
            }
        }
        return "joyeuse".equalsIgnoreCase(Build.DEVICE);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean y() {
        /*
            java.lang.String r0 = android.os.Build.MANUFACTURER
            r0.getClass()
            java.lang.String r1 = "Samsung"
            boolean r0 = r0.equalsIgnoreCase(r1)
            r2 = 0
            if (r0 != 0) goto L19
            java.lang.String r0 = android.os.Build.BRAND
            r0.getClass()
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L3b
        L19:
            java.lang.String r0 = "a05s"
            java.lang.String r1 = android.os.Build.DEVICE
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L3b
            java.lang.String r0 = android.os.Build.MODEL
            r0.getClass()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toUpperCase(r1)
            r0.getClass()
            java.lang.String r1 = "SM-A057"
            boolean r0 = kotlin.text.StringsKt.z(r0, r1, r2)
            if (r0 == 0) goto L3b
            r0 = 1
            return r0
        L3b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: z20.b.y():boolean");
    }

    public static boolean z() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Samsung")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Samsung")) {
                return false;
            }
        }
        return "J7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27;
    }

    public abstract List k(String str, List list);
}
