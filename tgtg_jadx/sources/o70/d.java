package o70;

import a3.j;
import ag.k;
import android.content.Context;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.c1;
import androidx.lifecycle.f1;
import androidx.lifecycle.l1;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.braze.h2;
import j4.s;
import java.io.Closeable;
import java.util.Arrays;
import k30.c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import ky.p;
import o00.x0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements ViewModelProvider$Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f32043b;

    public /* synthetic */ d(Object obj, int i11) {
        this.f32042a = i11;
        this.f32043b = obj;
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public final l1 create(Class cls, CreationExtras creationExtras) {
        l1 l1Var;
        y8.e eVar;
        Function1 function1;
        int i11 = this.f32042a;
        int i12 = 0;
        Object obj = this.f32043b;
        switch (i11) {
            case 0:
                final i iVar = new i();
                a8.h hVar = (a8.h) obj;
                hVar.f975d = f1.a(creationExtras);
                k kVar = new k((ag.i) hVar.f973b, (ag.c) hVar.f974c, new r40.d(), new qb.e(), new l50.a(17), new r40.d(), new l50.a(22), new l20.c(14), new p(25), new l50.a(19), new n20.f(10), new n20.f(15), new qb.e(), new l20.c(23), new n20.f(13), new r40.d(), new qb.e(), new l50.a(14), new qb.e(), new qb.e(), new l20.c(27), new l20.c(22), new r40.d(), (c1) hVar.f975d);
                k kVar2 = (k) ((f) x0.q(f.class, kVar));
                kVar2.getClass();
                ex.i.m(94, "expectedSize");
                j jVar = new j(94);
                jVar.q("ir.h", kVar2.f1437y);
                jVar.q("to.f", kVar2.f1440z);
                jVar.q("vo.e", kVar2.A);
                jVar.q("uo.h", kVar2.C);
                jVar.q("tg.i", kVar2.D);
                jVar.q("ah.k", kVar2.G);
                jVar.q("tr.g", kVar2.H);
                jVar.q("ih.i", kVar2.J);
                jVar.q("dq.i", kVar2.L);
                jVar.q("tm.e", kVar2.O);
                jVar.q("oh.c", kVar2.S);
                jVar.q("uh.g", kVar2.V);
                jVar.q("hi.e", kVar2.W);
                jVar.q("ji.h", kVar2.X);
                jVar.q("ki.i", kVar2.Z);
                jVar.q("go.v", kVar2.f1366b0);
                jVar.q("pi.m", kVar2.f1370c0);
                jVar.q("ni.e", kVar2.f1374d0);
                jVar.q("cj.q", kVar2.f1378e0);
                jVar.q("cj.e0", kVar2.f1382f0);
                jVar.q("uq.e", kVar2.f1386g0);
                jVar.q("ti.s", kVar2.f1389h0);
                jVar.q("ej.c", kVar2.f1395j0);
                jVar.q("ei.a", kVar2.f1398k0);
                jVar.q("com.app.tgtg.feature.tabprofile.manageaccount.contactus.ContactUsViewModel", kVar2.f1403m0);
                jVar.q("oj.a", kVar2.f1412p0);
                jVar.q("qj.i", kVar2.f1421s0);
                jVar.q("ym.w", kVar2.t0);
                jVar.q("fn.c", kVar2.f1426u0);
                jVar.q("mr.r", kVar2.f1429v0);
                jVar.q("xj.k", kVar2.f1435x0);
                jVar.q("zj.j", kVar2.f1438y0);
                jVar.q("dk.f", kVar2.A0);
                jVar.q("hn.c", kVar2.B0);
                jVar.q("ek.q", kVar2.D0);
                jVar.q("bs.o", kVar2.E0);
                jVar.q("ii.j0", kVar2.F0);
                jVar.q("rq.d", kVar2.I0);
                jVar.q("qk.l", kVar2.L0);
                jVar.q("cr.e", kVar2.N0);
                jVar.q("uk.r", kVar2.O0);
                jVar.q("em.j", kVar2.P0);
                jVar.q("yl.i", kVar2.Q0);
                jVar.q("xl.m", kVar2.R0);
                jVar.q("zl.g", kVar2.S0);
                jVar.q("bm.p", kVar2.T0);
                jVar.q("wl.c", kVar2.V0);
                jVar.q("cm.d", kVar2.W0);
                jVar.q("al.p", kVar2.Y0);
                jVar.q("hm.v", kVar2.Z0);
                jVar.q("ci.c", kVar2.f1363a1);
                jVar.q("hr.i", kVar2.f1371c1);
                jVar.q("jg.f", kVar2.f1375d1);
                jVar.q("en.o", kVar2.f1383f1);
                jVar.q("lo.m", kVar2.f1387g1);
                jVar.q("zq.g", kVar2.f1390h1);
                jVar.q("eo.h", kVar2.f1393i1);
                jVar.q("yk.h", kVar2.f1399k1);
                jVar.q("hq.s", kVar2.f1401l1);
                jVar.q("hs.h", kVar2.f1410o1);
                jVar.q("li.g", kVar2.f1413p1);
                jVar.q("gl.q", kVar2.f1416q1);
                jVar.q("ll.g", kVar2.f1419r1);
                jVar.q("br.o", kVar2.f1422s1);
                jVar.q("um.t", kVar2.f1424t1);
                jVar.q("oi.d", kVar2.f1427u1);
                jVar.q("ks.h", kVar2.f1430v1);
                jVar.q("cj.s0", kVar2.f1433w1);
                jVar.q("qo.h", kVar2.f1436x1);
                jVar.q("fr.i", kVar2.f1439y1);
                jVar.q("mn.l", kVar2.A1);
                jVar.q("fi.i", kVar2.B1);
                jVar.q("yo.d", kVar2.C1);
                jVar.q("ap.n", kVar2.D1);
                jVar.q("ep.d0", kVar2.F1);
                jVar.q("zs.d", kVar2.G1);
                jVar.q("si.b", kVar2.H1);
                jVar.q("gq.b", kVar2.I1);
                jVar.q("gq.d", kVar2.J1);
                jVar.q("gi.c", kVar2.K1);
                jVar.q("ng.g", kVar2.L1);
                jVar.q("hr.n", kVar2.N1);
                jVar.q("no.j", kVar2.O1);
                jVar.q("ns.g", kVar2.P1);
                jVar.q("al.c0", kVar2.Q1);
                jVar.q("np.b", kVar2.R1);
                jVar.q("zs.f", kVar2.S1);
                jVar.q("zs.o", kVar2.T1);
                jVar.q("zp.g", kVar2.V1);
                jVar.q("no.m0", kVar2.W1);
                jVar.q("gr.k", kVar2.X1);
                jVar.q("qs.h", kVar2.f1364a2);
                jVar.q("qs.i", kVar2.f1376d2);
                jVar.q("dt.c", kVar2.f1384f2);
                c0 c0VarF = jVar.f(true);
                if (cls != null) {
                    t70.a aVar = (t70.a) c0VarF.get(cls.getName());
                    Function1 function12 = (Function1) creationExtras.a(g.f32044d);
                    ((f) x0.q(f.class, kVar)).getClass();
                    Object obj2 = c0.f25879g.get(cls);
                    if (obj2 == null) {
                        if (function12 != null) {
                            h2.b(s.h(cls, new StringBuilder("Found creation callback but class "), " does not have an assisted factory specified in @HiltViewModel."));
                        } else {
                            if (aVar != null) {
                                l1Var = (l1) aVar.get();
                                l1 l1Var2 = l1Var;
                                l1Var2.addCloseable(new Closeable() { // from class: o70.c
                                    @Override // java.io.Closeable, java.lang.AutoCloseable
                                    public final void close() {
                                        iVar.a();
                                    }
                                });
                                return l1Var2;
                            }
                            h2.b(s.h(cls, new StringBuilder("Expected the @HiltViewModel-annotated class "), " to be available in the multi-binding of @HiltViewModelMap but none was found."));
                        }
                    } else if (aVar != null) {
                        i4.a.d(s.h(cls, new StringBuilder("Found the @HiltViewModel-annotated class "), " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap."));
                    } else {
                        if (function12 != null) {
                            l1Var = (l1) function12.invoke(obj2);
                            l1 l1Var22 = l1Var;
                            l1Var22.addCloseable(new Closeable() { // from class: o70.c
                                @Override // java.io.Closeable, java.lang.AutoCloseable
                                public final void close() {
                                    iVar.a();
                                }
                            });
                            return l1Var22;
                        }
                        h2.b(s.h(cls, new StringBuilder("Found @HiltViewModel-annotated class "), " using @AssistedInject but no creation callback was provided in CreationExtras."));
                    }
                } else {
                    i4.a.f("Key must be a class");
                }
                return null;
            case 1:
                c40.i iVar2 = new c40.i();
                iVar2.f7069a = creationExtras != null;
                iVar2.f7070b = creationExtras;
                Context context = (Context) obj;
                context.getClass();
                return new p70.d(new ag.c(((ag.i) ((p70.c) x0.q(p70.c.class, u00.d.t(context.getApplicationContext())))).f1322g), iVar2);
            default:
                cls.getClass();
                creationExtras.getClass();
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(cls);
                y8.e[] eVarArr = (y8.e[]) obj;
                y8.e[] eVarArr2 = (y8.e[]) Arrays.copyOf(eVarArr, eVarArr.length);
                orCreateKotlinClass.getClass();
                int length = eVarArr2.length;
                while (true) {
                    if (i12 < length) {
                        eVar = eVarArr2[i12];
                        if (!Intrinsics.areEqual(eVar.f45425a, orCreateKotlinClass)) {
                            i12++;
                        }
                    } else {
                        eVar = null;
                    }
                }
                l1 l1Var3 = (eVar == null || (function1 = eVar.f45426b) == null) ? null : (l1) function1.invoke(creationExtras);
                if (l1Var3 != null) {
                    return l1Var3;
                }
                i4.a.j(orCreateKotlinClass.getQualifiedName(), "No initializer set for given class ");
                return null;
        }
    }
}
