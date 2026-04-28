package dq;

import androidx.lifecycle.p;
import androidx.lifecycle.s1;
import com.braze.h2;
import d40.t1;
import g9.f0;
import i80.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import m3.m;
import m3.n;
import m3.s;
import o30.e0;
import oo.z;
import s1.l;
import vm.r;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f15150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f15151c;

    public /* synthetic */ f(Function0 function0, f0 f0Var) {
        this.f15149a = 2;
        this.f15151c = function0;
        this.f15150b = f0Var;
    }

    @Override // i80.o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11 = this.f15149a;
        n nVar = (n) obj3;
        ((Integer) obj4).getClass();
        ((l) obj).getClass();
        ((g9.l) obj2).getClass();
        switch (i11) {
            case 0:
                s1 s1VarA = z8.a.a(nVar);
                if (s1VarA == null) {
                    h2.b("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                } else {
                    i iVar = (i) t1.K(Reflection.getOrCreateKotlinClass(i.class), s1VarA, e0.r(s1VarA, nVar), s1VarA instanceof p ? ((p) s1VarA).getDefaultViewModelCreationExtras() : y8.a.f45423b, nVar);
                    s sVar = (s) nVar;
                    f0 f0Var = this.f15150b;
                    boolean zH = sVar.h(f0Var);
                    Object objM = sVar.M();
                    if (zH || objM == m.f29332a) {
                        objM = new g(f0Var, 0);
                        sVar.k0(objM);
                    }
                    j.c(iVar, (Function0) objM, this.f15151c, sVar, 0);
                }
                break;
            case 1:
                s1 s1VarA2 = z8.a.a(nVar);
                if (s1VarA2 == null) {
                    h2.b("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                } else {
                    cm.d dVar = (cm.d) t1.K(Reflection.getOrCreateKotlinClass(cm.d.class), s1VarA2, e0.r(s1VarA2, nVar), s1VarA2 instanceof p ? ((p) s1VarA2).getDefaultViewModelCreationExtras() : y8.a.f45423b, nVar);
                    s sVar2 = (s) nVar;
                    f0 f0Var2 = this.f15150b;
                    boolean zH2 = sVar2.h(f0Var2);
                    Object objM2 = sVar2.M();
                    m3.f fVar = m.f29332a;
                    if (zH2 || objM2 == fVar) {
                        objM2 = new g(f0Var2, 8);
                        sVar2.k0(objM2);
                    }
                    Function0 function0 = (Function0) objM2;
                    Function0 function02 = this.f15151c;
                    boolean zF = sVar2.f(function02);
                    Object objM3 = sVar2.M();
                    if (zF || objM3 == fVar) {
                        objM3 = new z(24, function02);
                        sVar2.k0(objM3);
                    }
                    t1.c(null, dVar, function0, (Function0) objM3, sVar2, 0);
                }
                break;
            default:
                s1 s1VarA3 = z8.a.a(nVar);
                if (s1VarA3 == null) {
                    h2.b("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                } else {
                    ei.a aVar = (ei.a) t1.K(Reflection.getOrCreateKotlinClass(ei.a.class), s1VarA3, e0.r(s1VarA3, nVar), s1VarA3 instanceof p ? ((p) s1VarA3).getDefaultViewModelCreationExtras() : y8.a.f45423b, nVar);
                    s sVar3 = (s) nVar;
                    Function0 function03 = this.f15151c;
                    boolean zF2 = sVar3.f(function03);
                    Object objM4 = sVar3.M();
                    m3.f fVar2 = m.f29332a;
                    if (zF2 || objM4 == fVar2) {
                        objM4 = new r(13, function03);
                        sVar3.k0(objM4);
                    }
                    Function0 function04 = (Function0) objM4;
                    f0 f0Var3 = this.f15150b;
                    boolean zH3 = sVar3.h(f0Var3);
                    Object objM5 = sVar3.M();
                    if (zH3 || objM5 == fVar2) {
                        objM5 = new g(f0Var3, 12);
                        sVar3.k0(objM5);
                    }
                    h0.g.i(null, aVar, function04, (Function0) objM5, sVar3, 0);
                }
                break;
        }
        return null;
    }

    public /* synthetic */ f(f0 f0Var, Function0 function0, int i11) {
        this.f15149a = i11;
        this.f15150b = f0Var;
        this.f15151c = function0;
    }
}
