package yj;

import b4.t;
import bn.z;
import c5.x1;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.b2;
import d2.h2;
import d2.i0;
import d2.i2;
import d2.m2;
import d2.n1;
import d2.w;
import d2.w0;
import d2.y;
import g3.ga;
import g3.h0;
import g3.n5;
import g3.q5;
import g3.r9;
import g3.s0;
import g3.v3;
import g3.w6;
import j5.r;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import lv.v;
import m3.b1;
import m3.d3;
import m3.s;
import m3.w1;
import o00.x0;
import o30.e0;
import o30.f0;
import oo.a0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import s1.r0;
import u70.u;
import y80.h1;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u3.d f46041a = new u3.d(new u60.a(24), false, 192630888);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u3.d f46042b = new u3.d(new u60.a(25), false, 1447916694);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u3.d f46043c = new u3.d(new tp.a(14), false, 755317589);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u3.d f46044d = new u3.d(new u60.a(26), false, 495697575);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u3.d f46045e = new u3.d(new u60.a(27), false, -537955129);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final u3.d f46046f = new u3.d(new tp.a(15), false, -1496392874);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final u3.d f46047g = new u3.d(new tp.a(16), false, -230808425);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final u3.d f46048h = new u3.d(new u60.a(28), false, 655226876);

    public static final void a(int i11, int i12, int i13, boolean z11, Function0 function0, m3.n nVar, int i14) {
        int i15;
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(1680234434);
        if ((i14 & 6) == 0) {
            i15 = (sVar.d(i11) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= sVar.d(i12) ? 32 : 16;
        }
        if ((i14 & MLKEMEngine.KyberPolyBytes) == 0) {
            i15 |= sVar.d(i13) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= sVar.g(z11) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= sVar.h(function0) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if (sVar.R(i15 & 1, (i15 & 9363) != 9362)) {
            String strU = f0.U(sVar, i13);
            b4.q qVar = b4.q.f5711a;
            t tVarT = m2.t(m2.d(qVar, 1.0f), 3);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarT, sVar);
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
            g3.i2.a(x0.z(i11, sVar, i15 & 14), null, null, z11 ? lv.s.f28217b : lv.s.D, sVar, 56, 4);
            boolean zF = sVar.f(strU);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (zF || objM == fVar) {
                objM = new xq.c(strU, 2);
                sVar.k0(objM);
            }
            t tVarB = d2.c.B(r.c(qVar, false, (Function1) objM), lv.t.f28252f, 0.0f, 2);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            r9.d(f0.U(sVar, i12), b3.i.e(1.0f, tVarB, true), lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.l, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
            t tVarM = m2.m(qVar, 24);
            long j9 = lv.s.f28217b;
            n5 n5VarR = s0.r(j9, j9, sVar);
            boolean z12 = (57344 & i15) == 16384;
            Object objM2 = sVar.M();
            if (z12 || objM2 == fVar) {
                objM2 = new vm.r(18, function0);
                sVar.k0(objM2);
            }
            sVar = sVar;
            q5.a(z11, (Function0) objM2, tVarM, false, n5VarR, sVar, ((i15 >> 9) & 14) | MLKEMEngine.KyberPolyBytes);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a0(i11, i12, i13, z11, function0, i14);
        }
    }

    public static final void b(final int i11, final int i12, final boolean z11, final boolean z12, final Function0 function0, m3.n nVar, final int i13) {
        int i14;
        s sVar;
        function0.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(430526420);
        if ((i13 & 6) == 0) {
            i14 = (sVar2.d(i11) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= sVar2.d(i12) ? 32 : 16;
        }
        if ((i13 & MLKEMEngine.KyberPolyBytes) == 0) {
            i14 |= sVar2.g(z11) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= sVar2.g(z12) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i13 & 24576) == 0) {
            i14 |= sVar2.h(function0) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if (sVar2.R(i14 & 1, (i14 & 9363) != 9362)) {
            String strU = f0.U(sVar2, i12);
            float f11 = 39;
            t tVarN = m2.n(b4.q.f5711a, f11, f11);
            float f12 = 1;
            long j9 = z11 ? z12 ? lv.s.f28223e : lv.s.f28217b : z12 ? lv.s.E : lv.s.G;
            float f13 = lv.t.f28258m;
            t tVarJ = v1.n.j(v1.n.k(tVarN, f12, j9, l2.g.b(f13)), z11 ? z12 ? lv.s.f28223e : lv.s.J : z12 ? lv.s.E : lv.s.I, l2.g.b(f13));
            boolean zF = sVar2.f(strU);
            Object objM = sVar2.M();
            if (zF || objM == m3.m.f29332a) {
                objM = new xq.c(strU, 1);
                sVar2.k0(objM);
            }
            t tVarC = androidx.compose.foundation.b.c(r.c(tVarJ, false, (Function1) objM), z11, null, null, function0, 14);
            u0 u0VarD = d2.p.d(b4.d.f5687e, false);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            t tVarC2 = b4.a.c(tVarC, sVar2);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            m3.i.C(u0VarD, b5.i.f5843f, sVar2);
            m3.i.C(iVarL, b5.i.f5842e, sVar2);
            m3.i.v(sVar2, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar2, b5.i.f5845h);
            m3.i.C(tVarC2, b5.i.f5841d, sVar2);
            r9.d(f0.U(sVar2, i11), null, z11 ? z12 ? lv.s.J : lv.s.f28217b : z12 ? lv.s.J : lv.s.E, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28276p, sVar2, 0, 12582912, 131066);
            sVar = sVar2;
            sVar.q(true);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2() { // from class: yj.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    a.b(i11, i12, z11, z12, function0, (m3.n) obj, m3.i.F(i13 | 1));
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final void c(boolean z11, Function0 function0, u3.d dVar, m3.n nVar, int i11) {
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(1985118609);
        int i12 = (sVar.g(z11) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            float f11 = 12;
            t tVarA = b4.a.a(d2.c.z(v1.n.j(v1.n.k(d2.c.B(m2.t(m2.d(b4.q.f5711a, 1.0f), 3), lv.t.f28253g, 0.0f, 2), 1, z11 ? lv.s.f28217b : lv.s.H, l2.g.b(f11)), lv.s.J, l2.g.b(f11)), lv.t.f28254h), c5.m2.f7291a, new on.l(24, function0));
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarA, sVar);
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
            r8.k.w(6, dVar, sVar, true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.d(i11, 18, function0, dVar, z11);
        }
    }

    public static final void d(boolean z11, List list, Function1 function1, Function0 function0, m3.n nVar, int i11) {
        function1.getClass();
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(-306865287);
        int i12 = i11 | (sVar.g(z11) ? 4 : 2) | (sVar.h(list) ? 32 : 16);
        boolean z12 = true;
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            List listH = d0.h(new u(vj.j.MONDAY, Integer.valueOf(R.string.custom_favorite_reminder_sheet_recurring_reminder_monday), Integer.valueOf(R.string.custom_favorite_reminder_sheet_recurring_reminder_monday_voice_over)), new u(vj.j.TUESDAY, Integer.valueOf(R.string.custom_favorite_reminder_sheet_recurring_reminder_tuesday), Integer.valueOf(R.string.custom_favorite_reminder_sheet_recurring_reminder_tuesday_voice_over)), new u(vj.j.WEDNESDAY, Integer.valueOf(R.string.custom_favorite_reminder_sheet_recurring_reminder_wednesday), Integer.valueOf(R.string.custom_favorite_reminder_sheet_recurring_reminder_wednesday_voice_over)), new u(vj.j.THURSDAY, Integer.valueOf(R.string.custom_favorite_reminder_sheet_recurring_reminder_thursday), Integer.valueOf(R.string.custom_favorite_reminder_sheet_recurring_reminder_thursday_voice_over)), new u(vj.j.FRIDAY, Integer.valueOf(R.string.custom_favorite_reminder_sheet_recurring_reminder_friday), Integer.valueOf(R.string.custom_favorite_reminder_sheet_recurring_reminder_friday_voice_over)), new u(vj.j.SATURDAY, Integer.valueOf(R.string.custom_favorite_reminder_sheet_recurring_reminder_saturday), Integer.valueOf(R.string.custom_favorite_reminder_sheet_recurring_reminder_saturday_voice_over)), new u(vj.j.SUNDAY, Integer.valueOf(R.string.custom_favorite_reminder_sheet_recurring_reminder_sunday), Integer.valueOf(R.string.custom_favorite_reminder_sheet_recurring_reminder_sunday_voice_over)));
            b4.q qVar = b4.q.f5711a;
            t tVarD = m2.d(qVar, 1.0f);
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
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
            a(R.drawable.custom_recurring_reminder_notification_icon, R.string.custom_favorite_reminder_sheet_recurring_reminder_header, R.string.custom_favorite_reminder_sheet_recurring_reminder_header_voice_over, z11, function0, sVar, ((i12 << 9) & 7168) | 24576);
            int i13 = 3;
            t tVarB = d2.c.B(m2.t(m2.d(qVar, 1.0f), 3), 0.0f, lv.t.f28253g, 1);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = b4.a.c(tVarB, sVar);
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
            sVar.a0(-1700705141);
            Iterator it = listH.iterator();
            int i14 = 0;
            while (true) {
                boolean zHasNext = it.hasNext();
                m3.f fVar = m3.m.f29332a;
                if (zHasNext) {
                    Object next = it.next();
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        d0.n();
                        throw null;
                    }
                    u uVar = (u) next;
                    vj.j jVar = (vj.j) uVar.f40859a;
                    int iIntValue = ((Number) uVar.f40860b).intValue();
                    int iIntValue2 = ((Number) uVar.f40861c).intValue();
                    boolean z13 = (list == null || list.contains(jVar) != z12) ? false : z12;
                    boolean zD = sVar.d(jVar.ordinal());
                    boolean z14 = z12;
                    Object objM = sVar.M();
                    if (zD || objM == fVar) {
                        objM = new us.j(28, function1, jVar);
                        sVar.k0(objM);
                    }
                    b(iIntValue, iIntValue2, z11, z13, (Function0) objM, sVar, (i12 << 6) & 896);
                    if (i14 != listH.size() - 1) {
                        sVar.a0(29817928);
                        if (1.0f <= 0.0d) {
                            e2.a.a("invalid weight; must be greater than zero");
                        }
                        d2.c.f(new n1(1.0f, z14), sVar);
                        sVar.q(false);
                    } else {
                        sVar.a0(29892886);
                        sVar.q(false);
                    }
                    i13 = 3;
                    i14 = i15;
                    z12 = true;
                } else {
                    int i16 = i13;
                    sVar.q(false);
                    sVar.q(true);
                    String strU = f0.U(sVar, R.string.custom_favorite_reminder_sheet_recurring_reminder_description_voice_over);
                    boolean zF = sVar.f(strU);
                    Object objM2 = sVar.M();
                    if (zF || objM2 == fVar) {
                        objM2 = new xq.c(strU, i16);
                        sVar.k0(objM2);
                    }
                    r9.d(f0.U(sVar, R.string.custom_favorite_reminder_sheet_recurring_reminder_description), r.c(qVar, false, (Function1) objM2), lv.s.D, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28276p, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
                    sVar = sVar;
                    sVar.q(true);
                }
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cg.c(z11, list, function1, function0, i11);
        }
    }

    public static final void e(w6 w6Var, boolean z11, vj.c cVar, Function0 function0, Function2 function2, Function0 function02, m3.n nVar, int i11) {
        s sVar;
        w6Var.getClass();
        function0.getClass();
        function2.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(681561907);
        int i12 = (sVar2.h(function02) ? 131072 : 65536) | i11 | (sVar2.f(w6Var) ? 4 : 2) | (sVar2.g(z11) ? 32 : 16) | (sVar2.h(cVar) ? 256 : 128) | (sVar2.h(function0) ? 2048 : 1024) | (sVar2.h(function2) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192);
        if (sVar2.R(i12 & 1, (74899 & i12) != 74898)) {
            t tVarD = d2.c.D(b4.q.f5711a, 0.0f, lv.t.f28257k, 0.0f, 0.0f, 13);
            l2.f fVarB = l2.g.b(12);
            long jB = i4.v.b(0.5f, lv.s.C);
            long j9 = lv.s.J;
            boolean z12 = (i12 & 7168) == 2048;
            Object objM = sVar2.M();
            if (z12 || objM == m3.m.f29332a) {
                objM = new vm.r(20, function0);
                sVar2.k0(objM);
            }
            sVar = sVar2;
            v3.a((Function0) objM, tVarD, w6Var, 0.0f, false, fVarB, j9, 0L, 0.0f, jB, f46041a, null, null, u3.e.e(-2025646571, sVar2, new lp.n(z11, cVar, function0, function2, function02, 3)), sVar, ((i12 << 6) & 896) | 806879280, 3078, 6552);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cn.w(w6Var, z11, cVar, function0, function2, function02, i11, 12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0300  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(boolean r41, vj.c r42, kotlin.jvm.functions.Function0 r43, kotlin.jvm.functions.Function2 r44, kotlin.jvm.functions.Function0 r45, m3.n r46, int r47) {
        /*
            Method dump skipped, instruction units count: 1043
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yj.a.f(boolean, vj.c, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, m3.n, int):void");
    }

    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [t1.u1, t1.x, x70.c] */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final void g(t tVar, BasicItem basicItem, xj.k kVar, boolean z11, Function1 function1, Function1 function12, Function0 function0, Function1 function13, m3.n nVar, int i11) {
        s sVar;
        Boolean bool;
        b1 b1Var;
        ?? r92;
        basicItem.getClass();
        function1.getClass();
        function12.getClass();
        function0.getClass();
        function13.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(-648937030);
        int i12 = i11 | (sVar2.f(tVar) ? 4 : 2) | (sVar2.h(basicItem) ? 32 : 16) | (sVar2.h(kVar) ? 256 : 128) | (sVar2.g(z11) ? NewHope.SENDB_BYTES : 1024) | (sVar2.h(function1) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar2.h(function12) ? 131072 : 65536) | (sVar2.h(function0) ? 1048576 : 524288) | (sVar2.h(function13) ? 8388608 : 4194304);
        if (sVar2.R(i12 & 1, (4793491 & i12) != 4793490)) {
            w6 w6VarF = v3.f(6, 2, null, sVar2);
            h1 h1Var = kVar.A;
            gs.a aVar = kVar.f44409d;
            b1 b1VarN = m3.i.n(h1Var, sVar2, 0);
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = e0.f.w(aVar.a() ? basicItem.getSubscribedForNotification() : false, sVar2);
            }
            b1 b1Var2 = (b1) objM;
            String str = kVar.I;
            boolean zA = aVar.a();
            ItemId itemIdM197boximpl = str != null ? ItemId.m197boximpl(str) : null;
            Boolean boolValueOf = Boolean.valueOf(zA);
            boolean zF = sVar2.f(str != null ? ItemId.m197boximpl(str) : null) | sVar2.g(zA) | sVar2.h(kVar) | sVar2.h(basicItem) | ((i12 & 29360128) == 8388608);
            Object objM2 = sVar2.M();
            if (zF || objM2 == fVar) {
                bool = boolValueOf;
                b1Var = b1Var2;
                r92 = 0;
                e eVar = new e(str, zA, kVar, basicItem, function13, b1Var, null);
                sVar2.k0(eVar);
                objM2 = eVar;
            } else {
                bool = boolValueOf;
                b1Var = b1Var2;
                r92 = 0;
            }
            m3.i.g(itemIdM197boximpl, bool, (Function2) objM2, sVar2);
            Object objM3 = sVar2.M();
            if (objM3 == fVar) {
                objM3 = e0.f.w(!z11, sVar2);
            }
            b1 b1Var3 = (b1) objM3;
            Unit unit = Unit.f26487a;
            Object objM4 = sVar2.M();
            if (objM4 == fVar) {
                objM4 = new co.j(b1Var3, r92, 6);
                sVar2.k0(objM4);
            }
            m3.i.h(unit, (Function2) objM4, sVar2);
            sVar = sVar2;
            s1.y.d(((Boolean) b1Var3.getValue()).booleanValue(), tVar, r0.d(r92, 3).a(r0.c(r92, 13)), r0.e(r92, 3).a(r0.j(r92, 13)), null, u3.e.e(-1380824606, sVar2, new nn.e(basicItem, function1, function12, kVar, function0, function13, b1Var, b1VarN, w6VarF)), sVar, ((i12 << 3) & 112) | 200064, 16);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new h0(tVar, basicItem, kVar, z11, function1, function12, function0, function13, i11);
        }
    }

    public static final void h(boolean z11, Function0 function0, m3.n nVar, int i11) {
        Function0 function02;
        int i12;
        b4.q qVar;
        float f11;
        float f12;
        boolean z12;
        b4.i iVar = b4.d.f5695n;
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(-1908556734);
        int i13 = i11 | (sVar.g(z11) ? 4 : 2) | (sVar.h(function0) ? 32 : 16);
        if (sVar.R(i13 & 1, (i13 & 19) != 18)) {
            le.p pVarD = e0.D(new le.q("favourite_heart_card.json"), sVar, 6);
            b4.q qVar2 = b4.q.f5711a;
            t tVarT = m2.t(m2.d(qVar2, 1.0f), 3);
            float f13 = lv.t.f28254h;
            t tVarA = d2.c.A(tVarT, f13, lv.t.f28256j);
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarA, sVar);
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
            if (z11) {
                qVar = qVar2;
                f11 = f13;
                f12 = 1.0f;
                z12 = false;
                sVar.a0(-1238094186);
                sVar.q(false);
            } else {
                sVar.a0(-1238366459);
                f11 = f13;
                qVar = qVar2;
                f12 = 1.0f;
                z12 = false;
                x0.f((he.k) pVarD.getValue(), new w0(iVar), false, 0.0f, Integer.MAX_VALUE, false, b4.d.f5687e, sVar, 1572864, 196608, 4161468);
                sVar = sVar;
                sVar.q(false);
            }
            s sVar2 = sVar;
            boolean z13 = z12;
            r9.d(f0.U(sVar, R.string.favorites_error_no_favorites), m2.d(qVar, f12), lv.s.C, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, v.f28270i, sVar2, 432, 12582912, 130040);
            r9.d(f0.U(sVar2, R.string.favorites_no_favorites_description), d2.c.D(m2.d(qVar, f12), 0.0f, lv.t.f28251e, 0.0f, 0.0f, 13), lv.s.D, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, v.f28274n, sVar2, 432, 12582912, 130040);
            sVar = sVar2;
            t tVarF = b3.i.f(iVar, d2.c.z(m2.d(qVar, f12), f11));
            String strU = f0.U(sVar, R.string.favorites_no_favorites_button);
            lv.q qVar3 = lv.q.REGULAR;
            lv.e eVar = lv.e.MEDIUM;
            boolean z14 = (i13 & 112) == 32 ? true : z13;
            Object objM = sVar.M();
            if (z14 || objM == m3.m.f29332a) {
                function02 = function0;
                objM = new vm.r(21, function02);
                sVar.k0(objM);
            } else {
                function02 = function0;
            }
            v0.n.l(tVarF, strU, null, qVar3, eVar, false, false, null, null, (Function0) objM, sVar, 27648, 484);
            i12 = 1;
            sVar.q(true);
        } else {
            function02 = function0;
            i12 = 1;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new lp.f(z11, function02, i11, i12);
        }
    }

    public static final void i(Function0 function0, m3.n nVar, int i11) {
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(-2112391338);
        int i12 = (sVar.h(function0) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            d3 d3Var = x1.f7416h;
            m3.i.a(b3.i.t(((z5.c) sVar.j(d3Var)).a(), 1.0f, d3Var), u3.e.e(-841209194, sVar, new vq.a(1, function0)), sVar, 56);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new vq.a(i11, 2, function0);
        }
    }

    public static final void j(Function0 function0, m3.n nVar, int i11) {
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(-396212586);
        int i12 = (sVar.h(function0) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            d3 d3Var = x1.f7416h;
            m3.i.a(b3.i.t(((z5.c) sVar.j(d3Var)).a(), 1.0f, d3Var), u3.e.e(1901062614, sVar, new vq.a(3, function0)), sVar, 56);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new vq.a(i11, 4, function0);
        }
    }

    public static final void k(w6 w6Var, boolean z11, Function0 function0, m3.n nVar, int i11) {
        s sVar;
        w6Var.getClass();
        function0.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(1488951420);
        int i12 = i11 | (sVar2.f(w6Var) ? 4 : 2) | (sVar2.g(z11) ? 32 : 16);
        if (sVar2.R(i12 & 1, (i12 & 147) != 146)) {
            t tVarD = d2.c.D(b4.q.f5711a, 0.0f, lv.t.f28257k, 0.0f, 0.0f, 13);
            l2.f fVarB = l2.g.b(12);
            long jB = i4.v.b(0.5f, lv.s.C);
            long j9 = lv.s.J;
            Object objM = sVar2.M();
            if (objM == m3.m.f29332a) {
                objM = new vm.r(23, function0);
                sVar2.k0(objM);
            }
            sVar = sVar2;
            v3.a((Function0) objM, tVarD, w6Var, 0.0f, false, fVarB, j9, 0L, 0.0f, jB, f46044d, null, null, u3.e.e(459497818, sVar2, new a3.h(z11, function0)), sVar, ((i12 << 6) & 896) | 806879280, 3078, 6552);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.d(w6Var, z11, function0, i11, 19);
        }
    }

    public static final void l(m3.n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(233680704);
        if (sVar.R(i11 & 1, i11 != 0)) {
            i0 i0VarG = d2.c.g(0.0f, 0, 13);
            b2 b2Var = ga.f18696a;
            g3.i.c(f46048h, null, null, null, 0.0f, i0VarG, ga.d(lv.s.J, 0L, lv.s.C, 0L, sVar, 54), null, sVar, 6, 414);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new u60.a(i11, 29);
        }
    }

    public static final void m(List list, Function1 function1, Function1 function12, Function1 function13, m3.n nVar, int i11) {
        list.getClass();
        function13.getClass();
        s sVar = (s) nVar;
        sVar.c0(-2053506208);
        int i12 = i11 | (sVar.h(list) ? 4 : 2) | (sVar.h(function1) ? 32 : 16) | (sVar.h(function12) ? 256 : 128) | (sVar.h(function13) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            PantryThemeKt.PantryTheme(false, null, u3.e.e(-541975006, sVar, new z(f0.U(sVar, R.string.screen_reader_favorites_recent_orders), f0.U(sVar, R.string.screen_reader_favorites_recent_orders_description), list, function13, function1, function12)), sVar, 390, 2);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new lp.v(list, function1, i11, function12, function13, 22);
        }
    }
}
