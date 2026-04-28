package a3;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import z1.y3;
import z1.z3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f389b;

    public /* synthetic */ i1(Object obj, int i11) {
        this.f388a = i11;
        this.f389b = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(w4.y yVar, x70.c cVar) {
        int i11 = this.f388a;
        int i12 = 3;
        final int i13 = 1;
        int i14 = 23;
        final int i15 = 0;
        x70.c cVar2 = null;
        Object obj = this.f389b;
        switch (i11) {
            case 0:
                Object objL0 = ((w4.m0) yVar).L0(new h1(i15, (Function1) obj, cVar2), cVar);
                if (objL0 != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objE = z3.e(yVar, new g3.x1((bg.b) obj, cVar2, i15), cVar);
                if (objE != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objN = v80.f0.n(new gf.g(yVar, (i2.e0) obj, cVar2, 11), cVar);
                if (objN != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                l3 l3Var = (l3) obj;
                Object objC = j1.c(yVar, l3Var.f472z, l3Var.f471y, cVar);
                if (objC != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objE2 = z3.e(yVar, new h1(i13, new al.d((s2.g) obj, 23), cVar2), cVar);
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                if (objE2 != aVar) {
                    objE2 = Unit.f26487a;
                }
                if (objE2 != aVar) {
                    break;
                }
                break;
            case 5:
                Object objE3 = z3.e(yVar, new b1((u2.c) obj, cVar2, i12), cVar);
                if (objE3 != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object objE4 = z3.e(yVar, new g3.x1((v1.i) obj, cVar2, i12), cVar);
                if (objE4 != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                final v1.h0 h0Var = (v1.h0) obj;
                Object obj2 = null;
                Function1 function1 = (!h0Var.f41726v || h0Var.N == null) ? null : new Function1() { // from class: v1.f0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        switch (i15) {
                            case 0:
                                h0 h0Var2 = h0Var;
                                Function0 function0 = h0Var2.N;
                                if (function0 != null) {
                                    function0.invoke();
                                }
                                if (h0Var2.O) {
                                    ((r4.a) b5.o.e(h0Var2, c5.x1.l)).a(0);
                                }
                                break;
                            default:
                                h0 h0Var3 = h0Var;
                                if (h0Var3.f41726v) {
                                    h0Var3.f41727w.invoke();
                                }
                                break;
                        }
                        return Unit.f26487a;
                    }
                };
                v1.g0 g0Var = new v1.g0(h0Var, null);
                Function1 function12 = new Function1() { // from class: v1.f0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        switch (i13) {
                            case 0:
                                h0 h0Var2 = h0Var;
                                Function0 function0 = h0Var2.N;
                                if (function0 != null) {
                                    function0.invoke();
                                }
                                if (h0Var2.O) {
                                    ((r4.a) b5.o.e(h0Var2, c5.x1.l)).a(0);
                                }
                                break;
                            default:
                                h0 h0Var3 = h0Var;
                                if (h0Var3.f41726v) {
                                    h0Var3.f41727w.invoke();
                                }
                                break;
                        }
                        return Unit.f26487a;
                    }
                };
                le.v vVar = y3.f46778a;
                Object objN2 = v80.f0.n(new al.j(yVar, g0Var, function1, obj2, function12, (x70.c) null, 10), cVar);
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                if (objN2 != aVar2) {
                    objN2 = Unit.f26487a;
                }
                if (objN2 != aVar2) {
                    break;
                }
                break;
            default:
                Object objN3 = v80.f0.n(new ao.e1((w2.e1) obj, yVar, cVar2, i14), cVar);
                if (objN3 != y70.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f26487a;
    }
}
