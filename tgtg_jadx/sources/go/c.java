package go;

import androidx.lifecycle.s1;
import com.app.tgtg.feature.orderview.charity.CharityOrderActivity;
import com.braze.h2;
import d40.t1;
import g9.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import o30.e0;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements i80.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f20709b;

    public /* synthetic */ c(f0 f0Var, int i11) {
        this.f20708a = i11;
        this.f20709b = f0Var;
    }

    @Override // i80.o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11 = this.f20708a;
        m3.f fVar = m3.m.f29332a;
        f0 f0Var = this.f20709b;
        switch (i11) {
            case 0:
                m3.n nVar = (m3.n) obj3;
                ((Integer) obj4).getClass();
                int i12 = CharityOrderActivity.f9162o;
                ((s1.l) obj).getClass();
                ((g9.l) obj2).getClass();
                s1 s1VarA = z8.a.a(nVar);
                if (s1VarA == null) {
                    h2.b("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                } else {
                    no.j jVar = (no.j) t1.K(Reflection.getOrCreateKotlinClass(no.j.class), s1VarA, e0.r(s1VarA, nVar), s1VarA instanceof androidx.lifecycle.p ? ((androidx.lifecycle.p) s1VarA).getDefaultViewModelCreationExtras() : y8.a.f45423b, nVar);
                    m3.s sVar = (m3.s) nVar;
                    boolean zH = sVar.h(f0Var);
                    Object objM = sVar.M();
                    if (zH || objM == fVar) {
                        objM = new dq.g(f0Var, 4);
                        sVar.k0(objM);
                    }
                    Function0 function0 = (Function0) objM;
                    boolean zH2 = sVar.h(f0Var);
                    Object objM2 = sVar.M();
                    if (zH2 || objM2 == fVar) {
                        objM2 = new dq.g(f0Var, 5);
                        sVar.k0(objM2);
                    }
                    bx.k.k(jVar, function0, (Function0) objM2, sVar, 0);
                }
                break;
            case 1:
                m3.n nVar2 = (m3.n) obj3;
                ((Integer) obj4).getClass();
                int i13 = CharityOrderActivity.f9162o;
                ((s1.l) obj).getClass();
                ((g9.l) obj2).getClass();
                s1 s1VarA2 = z8.a.a(nVar2);
                if (s1VarA2 == null) {
                    h2.b("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                } else {
                    ji.h hVar = (ji.h) t1.K(Reflection.getOrCreateKotlinClass(ji.h.class), s1VarA2, e0.r(s1VarA2, nVar2), s1VarA2 instanceof androidx.lifecycle.p ? ((androidx.lifecycle.p) s1VarA2).getDefaultViewModelCreationExtras() : y8.a.f45423b, nVar2);
                    m3.s sVar2 = (m3.s) nVar2;
                    boolean zH3 = sVar2.h(f0Var);
                    Object objM3 = sVar2.M();
                    if (zH3 || objM3 == fVar) {
                        objM3 = new dq.g(f0Var, 6);
                        sVar2.k0(objM3);
                    }
                    ji.i.f(hVar, (Function0) objM3, sVar2, 0);
                }
                break;
            case 2:
                m3.n nVar3 = (m3.n) obj3;
                ((Integer) obj4).getClass();
                ((s1.l) obj).getClass();
                ((g9.l) obj2).getClass();
                s1 s1VarA3 = z8.a.a(nVar3);
                if (s1VarA3 == null) {
                    h2.b("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                } else {
                    fi.i iVar = (fi.i) t1.K(Reflection.getOrCreateKotlinClass(fi.i.class), s1VarA3, e0.r(s1VarA3, nVar3), s1VarA3 instanceof androidx.lifecycle.p ? ((androidx.lifecycle.p) s1VarA3).getDefaultViewModelCreationExtras() : y8.a.f45423b, nVar3);
                    m3.s sVar3 = (m3.s) nVar3;
                    boolean zH4 = sVar3.h(f0Var);
                    Object objM4 = sVar3.M();
                    if (zH4 || objM4 == fVar) {
                        objM4 = new e(f0Var, 2);
                        sVar3.k0(objM4);
                    }
                    Function1 function1 = (Function1) objM4;
                    boolean zH5 = sVar3.h(f0Var);
                    Object objM5 = sVar3.M();
                    if (zH5 || objM5 == fVar) {
                        objM5 = new dq.g(f0Var, 10);
                        sVar3.k0(objM5);
                    }
                    fi.e.d(iVar, function1, (Function0) objM5, sVar3, 0);
                }
                break;
            case 3:
                a0.A((Integer) obj4, (s1.l) obj, (g9.l) obj2);
                m3.s sVar4 = (m3.s) ((m3.n) obj3);
                Object objM6 = sVar4.M();
                if (objM6 == fVar) {
                    objM6 = new wt.a(29);
                    sVar4.k0(objM6);
                }
                jf.e.a(true, (Function0) objM6, sVar4, 54, 0);
                boolean zH6 = sVar4.h(f0Var);
                Object objM7 = sVar4.M();
                if (zH6 || objM7 == fVar) {
                    objM7 = new ap.j(f0Var);
                    sVar4.k0(objM7);
                }
                Function2 function2 = (Function2) objM7;
                boolean zH7 = sVar4.h(f0Var);
                Object objM8 = sVar4.M();
                if (zH7 || objM8 == fVar) {
                    objM8 = new dq.g(f0Var, 11);
                    sVar4.k0(objM8);
                }
                gi.a.g(null, null, function2, (Function0) objM8, sVar4, 0);
                break;
            case 4:
                a0.A((Integer) obj4, (s1.l) obj, (g9.l) obj2);
                m3.s sVar5 = (m3.s) ((m3.n) obj3);
                Object objM9 = sVar5.M();
                if (objM9 == fVar) {
                    objM9 = new xh.d(0);
                    sVar5.k0(objM9);
                }
                jf.e.a(true, (Function0) objM9, sVar5, 54, 0);
                boolean zH8 = sVar5.h(f0Var);
                Object objM10 = sVar5.M();
                if (zH8 || objM10 == fVar) {
                    objM10 = new dq.g(f0Var, 13);
                    sVar5.k0(objM10);
                }
                ni.g.a(null, (Function0) objM10, sVar5, 0);
                break;
            case 5:
                m3.n nVar4 = (m3.n) obj3;
                ((Integer) obj4).getClass();
                ((s1.l) obj).getClass();
                ((g9.l) obj2).getClass();
                s1 s1VarA4 = z8.a.a(nVar4);
                if (s1VarA4 == null) {
                    h2.b("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                } else {
                    ti.s sVar6 = (ti.s) t1.K(Reflection.getOrCreateKotlinClass(ti.s.class), s1VarA4, e0.r(s1VarA4, nVar4), s1VarA4 instanceof androidx.lifecycle.p ? ((androidx.lifecycle.p) s1VarA4).getDefaultViewModelCreationExtras() : y8.a.f45423b, nVar4);
                    m3.s sVar7 = (m3.s) nVar4;
                    boolean zH9 = sVar7.h(f0Var);
                    Object objM11 = sVar7.M();
                    if (zH9 || objM11 == fVar) {
                        objM11 = new dq.g(f0Var, 17);
                        sVar7.k0(objM11);
                    }
                    ti.t.b(null, sVar6, (Function0) objM11, sVar7, 0);
                }
                break;
            case 6:
                m3.n nVar5 = (m3.n) obj3;
                ((Integer) obj4).getClass();
                ((s1.l) obj).getClass();
                ((g9.l) obj2).getClass();
                s1 s1VarA5 = z8.a.a(nVar5);
                if (s1VarA5 == null) {
                    h2.b("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                } else {
                    ki.i iVar2 = (ki.i) t1.K(Reflection.getOrCreateKotlinClass(ki.i.class), s1VarA5, e0.r(s1VarA5, nVar5), s1VarA5 instanceof androidx.lifecycle.p ? ((androidx.lifecycle.p) s1VarA5).getDefaultViewModelCreationExtras() : y8.a.f45423b, nVar5);
                    m3.s sVar8 = (m3.s) nVar5;
                    boolean zH10 = sVar8.h(f0Var);
                    Object objM12 = sVar8.M();
                    if (zH10 || objM12 == fVar) {
                        objM12 = new e(f0Var, 3);
                        sVar8.k0(objM12);
                    }
                    Function1 function12 = (Function1) objM12;
                    boolean zH11 = sVar8.h(f0Var);
                    Object objM13 = sVar8.M();
                    if (zH11 || objM13 == fVar) {
                        objM13 = new dq.g(f0Var, 16);
                        sVar8.k0(objM13);
                    }
                    ki.j.j(iVar2, function12, (Function0) objM13, sVar8, 0);
                }
                break;
            case 7:
                m3.n nVar6 = (m3.n) obj3;
                ((Integer) obj4).getClass();
                ((s1.l) obj).getClass();
                ((g9.l) obj2).getClass();
                s1 s1VarA6 = z8.a.a(nVar6);
                if (s1VarA6 == null) {
                    h2.b("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                } else {
                    si.b bVar = (si.b) t1.K(Reflection.getOrCreateKotlinClass(si.b.class), s1VarA6, e0.r(s1VarA6, nVar6), s1VarA6 instanceof androidx.lifecycle.p ? ((androidx.lifecycle.p) s1VarA6).getDefaultViewModelCreationExtras() : y8.a.f45423b, nVar6);
                    m3.s sVar9 = (m3.s) nVar6;
                    boolean zH12 = sVar9.h(f0Var);
                    Object objM14 = sVar9.M();
                    if (zH12 || objM14 == fVar) {
                        objM14 = new dq.g(f0Var, 15);
                        sVar9.k0(objM14);
                    }
                    si.a.c(null, null, bVar, (Function0) objM14, sVar9, 0);
                }
                break;
            case 8:
                m3.n nVar7 = (m3.n) obj3;
                ((Integer) obj4).getClass();
                ((s1.l) obj).getClass();
                ((g9.l) obj2).getClass();
                s1 s1VarA7 = z8.a.a(nVar7);
                if (s1VarA7 == null) {
                    h2.b("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                } else {
                    ji.h hVar2 = (ji.h) t1.K(Reflection.getOrCreateKotlinClass(ji.h.class), s1VarA7, e0.r(s1VarA7, nVar7), s1VarA7 instanceof androidx.lifecycle.p ? ((androidx.lifecycle.p) s1VarA7).getDefaultViewModelCreationExtras() : y8.a.f45423b, nVar7);
                    m3.s sVar10 = (m3.s) nVar7;
                    boolean zH13 = sVar10.h(f0Var);
                    Object objM15 = sVar10.M();
                    if (zH13 || objM15 == fVar) {
                        objM15 = new dq.g(f0Var, 14);
                        sVar10.k0(objM15);
                    }
                    ji.i.f(hVar2, (Function0) objM15, sVar10, 0);
                }
                break;
            case 9:
                a0.A((Integer) obj4, (s1.l) obj, (g9.l) obj2);
                m3.s sVar11 = (m3.s) ((m3.n) obj3);
                Object objM16 = sVar11.M();
                if (objM16 == fVar) {
                    objM16 = new xh.d(1);
                    sVar11.k0(objM16);
                }
                jf.e.a(true, (Function0) objM16, sVar11, 54, 0);
                boolean zH14 = sVar11.h(f0Var);
                Object objM17 = sVar11.M();
                if (zH14 || objM17 == fVar) {
                    objM17 = new dq.g(f0Var, 24);
                    sVar11.k0(objM17);
                }
                qi.a.a(0, null, (Function0) objM17, sVar11);
                break;
            case 10:
                m3.n nVar8 = (m3.n) obj3;
                ((Integer) obj4).getClass();
                ((s1.l) obj).getClass();
                ((g9.l) obj2).getClass();
                s1 s1VarA8 = z8.a.a(nVar8);
                if (s1VarA8 == null) {
                    h2.b("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                } else {
                    li.g gVar = (li.g) t1.K(Reflection.getOrCreateKotlinClass(li.g.class), s1VarA8, e0.r(s1VarA8, nVar8), s1VarA8 instanceof androidx.lifecycle.p ? ((androidx.lifecycle.p) s1VarA8).getDefaultViewModelCreationExtras() : y8.a.f45423b, nVar8);
                    m3.s sVar12 = (m3.s) nVar8;
                    boolean zH15 = sVar12.h(f0Var);
                    Object objM18 = sVar12.M();
                    if (zH15 || objM18 == fVar) {
                        objM18 = new dq.g(f0Var, 19);
                        sVar12.k0(objM18);
                    }
                    li.a.b(null, gVar, (Function0) objM18, sVar12, 0);
                }
                break;
            default:
                m3.n nVar9 = (m3.n) obj3;
                ((Integer) obj4).getClass();
                ((s1.l) obj).getClass();
                ((g9.l) obj2).getClass();
                s1 s1VarA9 = z8.a.a(nVar9);
                if (s1VarA9 == null) {
                    h2.b("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                } else {
                    oi.d dVar = (oi.d) t1.K(Reflection.getOrCreateKotlinClass(oi.d.class), s1VarA9, e0.r(s1VarA9, nVar9), s1VarA9 instanceof androidx.lifecycle.p ? ((androidx.lifecycle.p) s1VarA9).getDefaultViewModelCreationExtras() : y8.a.f45423b, nVar9);
                    m3.s sVar13 = (m3.s) nVar9;
                    boolean zH16 = sVar13.h(f0Var);
                    Object objM19 = sVar13.M();
                    if (zH16 || objM19 == fVar) {
                        objM19 = new dq.g(f0Var, 18);
                        sVar13.k0(objM19);
                    }
                    oi.a.d(dVar, (Function0) objM19, sVar13, 0);
                }
                break;
        }
        return null;
    }
}
