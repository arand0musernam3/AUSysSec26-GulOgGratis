package dq;

import a3.z1;
import g9.c0;
import g9.f0;
import kotlin.Unit;
import kotlin.collections.n0;
import kotlin.collections.o0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import xh.d0;
import xh.i0;
import xh.l0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15146a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f15147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f15148c;

    public /* synthetic */ e(f0 f0Var, Function0 function0) {
        this.f15148c = f0Var;
        this.f15147b = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15146a) {
            case 0:
                c0 c0Var = (c0) obj;
                c0Var.getClass();
                f0 f0Var = this.f15148c;
                Function0 function0 = this.f15147b;
                zz.f.m(c0Var, "Question", new u3.d(new f(f0Var, function0, 0), true, 1084260805));
                zz.f.m(c0Var, "Thanks", new u3.d(new z1(function0, 1), true, 784270318));
                break;
            default:
                c0 c0Var2 = (c0) obj;
                c0Var2.getClass();
                Function0 function02 = this.f15147b;
                f0 f0Var2 = this.f15148c;
                u3.d dVar = new u3.d(new f(function02, f0Var2), true, 994890649);
                o0 o0Var = o0.f26530a;
                o0Var.getClass();
                n0 n0Var = n0.f26529a;
                zz.f.l(c0Var2, Reflection.getOrCreateKotlinClass(xh.f0.class), o0Var, n0Var, null, null, null, null, dVar);
                zz.f.l(c0Var2, Reflection.getOrCreateKotlinClass(i0.class), o0Var, n0Var, null, null, null, null, new u3.d(new go.c(f0Var2, 2), true, 2050051792));
                zz.f.l(c0Var2, Reflection.getOrCreateKotlinClass(l0.class), o0Var, n0Var, null, null, null, null, new u3.d(new go.c(f0Var2, 3), true, 1482079569));
                zz.f.l(c0Var2, Reflection.getOrCreateKotlinClass(d0.class), o0Var, n0Var, null, null, null, null, new u3.d(new go.c(f0Var2, 4), true, 914107346));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ e(Function0 function0, f0 f0Var) {
        this.f15147b = function0;
        this.f15148c = f0Var;
    }
}
