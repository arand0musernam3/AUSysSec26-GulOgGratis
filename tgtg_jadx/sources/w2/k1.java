package w2;

import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import m3.c3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 implements c3, z3.d0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m5.s0 f42959c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m3.k1 f42957a = new m3.k1(null, j1.f42947f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m3.k1 f42958b = new m3.k1(null, i1.f42934g);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h1 f42960d = new h1();

    @Override // z3.d0
    public final z3.f0 b() {
        return this.f42960d;
    }

    @Override // z3.d0
    public final void e(z3.f0 f0Var) {
        f0Var.getClass();
        this.f42960d = (h1) f0Var;
    }

    public final m5.q0 f(j1 j1Var, i1 i1Var) {
        t5.b bVarB;
        CharSequence charSequence;
        m5.u0 u0Var;
        v2.b bVarD = j1Var.f42948a.d();
        List listA = bVarD.f41926a;
        List list = bVarD.f41927b;
        if ((listA == null || listA.isEmpty()) && (list == null || list.isEmpty())) {
            listA = null;
        } else if (listA == null || listA.isEmpty()) {
            listA = list;
        } else if (list != null && !list.isEmpty()) {
            v70.e eVarB = kotlin.collections.c0.b();
            eVarB.addAll(listA);
            eVarB.addAll(list);
            listA = kotlin.collections.c0.a(eVarB);
        }
        h1 h1Var = (h1) z3.l.h(this.f42960d);
        m5.q0 q0Var = h1Var.f42933n;
        if (q0Var != null && (charSequence = h1Var.f42923c) != null && kotlin.text.y.i(charSequence, bVarD) && Intrinsics.areEqual(h1Var.f42924d, listA) && Intrinsics.areEqual(h1Var.f42925e, bVarD.f41930e) && h1Var.f42927g == j1Var.f42950c && h1Var.f42928h == j1Var.f42951d && h1Var.f42931k == i1Var.f42936b && h1Var.f42929i == i1Var.f42935a.a() && h1Var.f42930j == i1Var.f42935a.X() && z5.a.c(h1Var.f42932m, i1Var.f42938d) && Intrinsics.areEqual(h1Var.l, i1Var.f42937c) && !q0Var.f29618b.f29623a.a()) {
            m5.u0 u0Var2 = h1Var.f42926f;
            boolean z11 = false;
            boolean zC = u0Var2 != null ? u0Var2.c(j1Var.f42949b) : false;
            m5.u0 u0Var3 = h1Var.f42926f;
            if (u0Var3 != null && (u0Var3 == (u0Var = j1Var.f42949b) || u0Var3.f29655a.b(u0Var.f29655a))) {
                z11 = true;
            }
            if (zC && z11) {
                return q0Var;
            }
            if (zC) {
                m5.p0 p0Var = q0Var.f29617a;
                return new m5.q0(new m5.p0(p0Var.f29603a, j1Var.f42949b, p0Var.f29605c, p0Var.f29606d, p0Var.f29607e, p0Var.f29608f, p0Var.f29609g, p0Var.f29610h, p0Var.f29611i, p0Var.f29612j), q0Var.f29618b, q0Var.f29619c);
            }
        }
        m5.s0 s0Var = this.f42959c;
        if (s0Var == null) {
            s0Var = new m5.s0(i1Var.f42937c, i1Var.f42935a, i1Var.f42936b, 1);
            this.f42959c = s0Var;
        }
        m5.s0 s0Var2 = s0Var;
        boolean z12 = j1Var.f42952e;
        m5.u0 u0VarD = j1Var.f42949b;
        if (z12) {
            t5.c cVar = u0VarD.f29655a.f29585k;
            if (cVar == null || (bVarB = cVar.b()) == null) {
                bVarB = t5.d.f39798a.k().b();
            }
            Locale locale = bVarB.f39794a;
            byte bA = Build.VERSION.SDK_INT >= 28 ? r.a(locale) : Character.getDirectionality(DecimalFormatSymbols.getInstance(locale).getZeroDigit());
            u0VarD = u0VarD.d(new m5.u0(0L, 0L, null, null, 0L, 0, (bA == 1 || bA == 2) ? 2 : 1, 0L, 16711679));
        }
        m5.q0 q0VarB = m5.s0.b(s0Var2, new m5.h(bVarD.f41928c.toString(), listA == null ? kotlin.collections.n0.f26529a : listA), u0VarD, j1Var.f42951d, j1Var.f42950c ? 1 : Integer.MAX_VALUE, i1Var.f42938d, i1Var.f42936b, i1Var.f42935a, i1Var.f42937c, 1060);
        if (!Intrinsics.areEqual(q0VarB, q0Var)) {
            z3.g gVarJ = z3.l.j();
            if (!gVarJ.f()) {
                h1 h1Var2 = this.f42960d;
                synchronized (z3.l.f47038c) {
                    h1 h1Var3 = (h1) z3.l.w(h1Var2, this, gVarJ);
                    h1Var3.f42923c = bVarD;
                    h1Var3.f42924d = listA;
                    h1Var3.f42925e = bVarD.f41930e;
                    h1Var3.f42927g = j1Var.f42950c;
                    h1Var3.f42928h = j1Var.f42951d;
                    h1Var3.f42926f = j1Var.f42949b;
                    h1Var3.f42931k = i1Var.f42936b;
                    h1Var3.f42929i = i1Var.f42939e;
                    h1Var3.f42930j = i1Var.f42940f;
                    h1Var3.f42932m = i1Var.f42938d;
                    h1Var3.l = i1Var.f42937c;
                    h1Var3.f42933n = q0VarB;
                }
                z3.l.n(gVarJ, this);
                return q0VarB;
            }
        }
        return q0VarB;
    }

    public final m5.q0 g() {
        i1 i1Var;
        j1 j1Var = (j1) this.f42957a.getValue();
        if (j1Var == null || (i1Var = (i1) this.f42958b.getValue()) == null) {
            return null;
        }
        return f(j1Var, i1Var);
    }

    @Override // m3.c3
    public final Object getValue() {
        i1 i1Var;
        j1 j1Var = (j1) this.f42957a.getValue();
        if (j1Var == null || (i1Var = (i1) this.f42958b.getValue()) == null) {
            return null;
        }
        return f(j1Var, i1Var);
    }

    @Override // z3.d0
    public final z3.f0 d(z3.f0 f0Var, z3.f0 f0Var2, z3.f0 f0Var3) {
        return f0Var3;
    }
}
