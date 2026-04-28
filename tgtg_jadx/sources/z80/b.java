package z80;

import d40.t1;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;
import v80.c2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x70.c[] f47356a = new x70.c[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a90.v f47357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a90.v f47358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a90.v f47359d;

    static {
        int i11 = 0;
        f47357b = new a90.v("NULL", i11);
        f47358c = new a90.v("UNINITIALIZED", i11);
        f47359d = new a90.v("DONE", i11);
    }

    public static final Object a(i80.n nVar, Function0 function0, x70.c cVar, y80.j jVar, y80.i[] iVarArr) {
        o oVar = new o(nVar, function0, null, jVar, iVarArr);
        c2 c2Var = new c2(cVar.getContext(), cVar, 1);
        Object objJ = t1.J(c2Var, true, c2Var, oVar);
        return objJ == y70.a.COROUTINE_SUSPENDED ? objJ : Unit.f26487a;
    }

    public static /* synthetic */ y80.i b(q qVar, CoroutineContext coroutineContext, int i11, x80.a aVar, int i12) {
        if ((i12 & 1) != 0) {
            coroutineContext = kotlin.coroutines.g.f26549a;
        }
        if ((i12 & 2) != 0) {
            i11 = -3;
        }
        if ((i12 & 4) != 0) {
            aVar = x80.a.SUSPEND;
        }
        return qVar.a(coroutineContext, i11, aVar);
    }

    public static final Object c(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, x70.c cVar) {
        Object objC = a90.x.c(coroutineContext, obj2);
        try {
            x xVar = new x(coroutineContext, cVar);
            Object objC2 = function2 == null ? y70.f.c(function2, obj, xVar) : ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(obj, xVar);
            a90.x.a(coroutineContext, objC);
            if (objC2 == y70.a.COROUTINE_SUSPENDED) {
                cVar.getClass();
            }
            return objC2;
        } catch (Throwable th2) {
            a90.x.a(coroutineContext, objC);
            throw th2;
        }
    }
}
