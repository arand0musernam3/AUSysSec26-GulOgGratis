package ti;

import c5.m2;
import com.app.tgtg.R;
import d2.h2;
import d2.i2;
import d2.y;
import g3.r9;
import g3.s0;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import m3.b1;
import m3.w1;
import m5.k0;
import o00.x0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import w.a0;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class w {
    public static final void a(final LocalDate localDate, final boolean z11, final boolean z12, boolean z13, final lw.o oVar, m3.n nVar, final int i11) {
        boolean z14;
        b5.h hVar;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-104121428);
        int i12 = i11 | (sVar.h(localDate) ? 4 : 2) | (sVar.g(z11) ? 32 : 16) | (sVar.g(z12) ? 256 : 128) | (sVar.g(z13) ? NewHope.SENDB_BYTES : 1024) | (sVar.h(oVar) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192);
        if (sVar.R(i12 & 1, (i12 & 9363) != 9362)) {
            float f11 = lv.t.f28249c;
            b4.q qVar = b4.q.f5711a;
            b4.t tVarA = b4.a.a(d2.c.D(qVar, 0.0f, 0.0f, 0.0f, f11, 7), m2.f7291a, new fg.j(z13, oVar, 2));
            b4.i iVar = b4.d.f5695n;
            y yVarA = d2.w.a(d2.i.f13805e, iVar, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarA, sVar);
            b5.j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
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
            s0.g(null, lv.t.f28251e, lv.s.K, sVar, 432, 1);
            b4.t tVarM = d2.m2.m(d2.c.z(qVar, lv.t.f28248b), 35);
            b4.k kVar = b4.d.f5687e;
            u0 u0VarD = d2.p.d(kVar, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarM, sVar);
            sVar.e0();
            if (sVar.S) {
                hVar = hVar2;
                sVar.k(hVar);
            } else {
                hVar = hVar2;
                sVar.n0();
            }
            m3.i.C(u0VarD, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            b4.t tVarJ = v1.n.j(d2.m2.m(qVar, 28), z12 ? lv.s.C : i4.v.f23314g, l2.g.f26790a);
            u0 u0VarD2 = d2.p.d(kVar, false);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            b4.t tVarC3 = b4.a.c(tVarJ, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD2, gVar, sVar);
            m3.i.C(iVarL3, gVar2, sVar);
            a0.y(iHashCode3, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC3, gVar4, sVar);
            r9.d(String.valueOf(localDate.getDayOfMonth()), d2.u.f13938a.a(d2.m2.u(qVar, null, 3), kVar), z12 ? lv.s.J : z13 ? lv.s.E : lv.s.C, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, (z12 || localDate.isEqual(LocalDate.now())) ? lv.v.f28275o : lv.v.f28274n, sVar, 0, 0, 130040);
            sVar = sVar;
            sVar.q(true);
            sVar.q(true);
            if (z11) {
                sVar.a0(-1291514021);
                b4.t tVarF = b3.i.f(iVar, d2.m2.m(qVar, 6));
                boolean z15 = (i12 & 7168) == 2048;
                Object objM = sVar.M();
                if (z15 || objM == m3.m.f29332a) {
                    z14 = z13;
                    objM = new com.tgtg.componentlibrary.component.p000switch.e(z14, 1);
                    sVar.k0(objM);
                } else {
                    z14 = z13;
                }
                v1.n.c(tVarF, (Function1) objM, sVar, 0);
                sVar.q(false);
            } else {
                z14 = z13;
                sVar.a0(-1291109440);
                sVar.q(false);
            }
            sVar.q(true);
        } else {
            z14 = z13;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            final boolean z16 = z14;
            w1VarS.f29476d = new Function2(localDate, z11, z12, z16, oVar, i11) { // from class: ti.v

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ LocalDate f40282a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f40283b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f40284c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f40285d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ lw.o f40286e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iF = m3.i.F(1);
                    w.a(this.f40282a, this.f40283b, this.f40284c, this.f40285d, this.f40286e, (m3.n) obj, iF);
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final void b(YearMonth yearMonth, Function0 function0, Function0 function02, m3.n nVar, int i11) {
        Function0 function03;
        yearMonth.getClass();
        function0.getClass();
        function02.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1504143808);
        int i12 = i11 | (sVar.h(yearMonth) ? 4 : 2);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            b4.q qVar = b4.q.f5711a;
            b4.t tVarD = d2.m2.d(qVar, 1.0f);
            float f11 = lv.t.f28254h;
            b4.t tVarB = d2.c.B(tVarD, 0.0f, f11, 1);
            u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarB, sVar);
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
            String displayName = yearMonth.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault());
            displayName.getClass();
            String str = k0.c(displayName, t5.d.f39798a.k().b()) + " " + yearMonth.getYear();
            m5.u0 u0Var = lv.v.f28275o;
            long j9 = lv.s.C;
            b4.k kVar = b4.d.f5686d;
            d2.u uVar = d2.u.f13938a;
            r9.d(str, d2.c.D(uVar.a(qVar, kVar), lv.t.f28249c, 0.0f, 0.0f, 0.0f, 14), j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
            sVar = sVar;
            b4.t tVarA = uVar.a(qVar, b4.d.f5688f);
            d2.b bVar = d2.i.f13801a;
            i2 i2VarA = h2.a(d2.i.g(lv.t.f28251e), b4.d.f5692j, sVar, 6);
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
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            n4.b bVarZ = x0.z(R.drawable.ic_chevron_right, sVar, 0);
            b4.t tVarI = f4.g.i(d2.m2.m(qVar, f11), 180.0f);
            on.l lVar = new on.l(15, function0);
            c5.s sVar2 = m2.f7291a;
            g3.i2.a(bVarZ, null, b4.a.a(tVarI, sVar2, lVar), 0L, sVar, 56, 8);
            d2.c.f(d2.m2.q(qVar, f11), sVar);
            function03 = function02;
            g3.i2.a(x0.z(R.drawable.ic_chevron_right, sVar, 0), null, b4.a.a(d2.m2.m(qVar, f11), sVar2, new on.l(16, function03)), 0L, sVar, 56, 8);
            sVar.q(true);
            sVar.q(true);
        } else {
            function03 = function02;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new rs.b(yearMonth, function0, function03, i11, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(ArrayList arrayList, Set set, Function1 function1, List list, m3.n nVar, int i11) {
        set.getClass();
        function1.getClass();
        list.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1957558507);
        int i12 = i11 | (sVar.h(arrayList) ? 4 : 2) | (sVar.h(set) ? 32 : 16) | (sVar.h(list) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = list;
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(YearMonth.now());
                sVar.k0(objM);
            }
            b1 b1Var = (b1) objM;
            DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
            TextStyle textStyle = TextStyle.SHORT;
            List listH = d0.h(dayOfWeek.getDisplayName(textStyle, Locale.getDefault()), DayOfWeek.TUESDAY.getDisplayName(textStyle, Locale.getDefault()), DayOfWeek.WEDNESDAY.getDisplayName(textStyle, Locale.getDefault()), DayOfWeek.THURSDAY.getDisplayName(textStyle, Locale.getDefault()), DayOfWeek.FRIDAY.getDisplayName(textStyle, Locale.getDefault()), DayOfWeek.SATURDAY.getDisplayName(textStyle, Locale.getDefault()), DayOfWeek.SUNDAY.getDisplayName(textStyle, Locale.getDefault()));
            y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(b4.q.f5711a, sVar);
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
            YearMonth yearMonth = (YearMonth) b1Var.getValue();
            yearMonth.getClass();
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = new pi.b(b1Var, 18);
                sVar.k0(objM2);
            }
            Function0 function0 = (Function0) objM2;
            Object objM3 = sVar.M();
            if (objM3 == fVar) {
                objM3 = new pi.b(b1Var, 19);
                sVar.k0(objM3);
            }
            b(yearMonth, function0, (Function0) objM3, sVar, 432);
            x0.e(new g2.a(7), null, null, null, null, null, null, false, null, new d2.r(listH, (Object) b1Var, (Object) set, (Object) arrayList, (Object) objectRef, function1, 2), sVar, 0);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new lp.v(arrayList, set, function1, list, i11);
        }
    }
}
