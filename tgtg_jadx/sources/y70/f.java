package y70;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class f {
    /* JADX WARN: Multi-variable type inference failed */
    public static x70.c a(Function2 function2, x70.c cVar, x70.c cVar2) {
        function2.getClass();
        if (function2 instanceof z70.a) {
            return ((z70.a) function2).create(cVar, cVar2);
        }
        CoroutineContext context = cVar2.getContext();
        return context == kotlin.coroutines.g.f26549a ? new b(function2, cVar2, cVar) : new c(cVar2, context, function2, cVar);
    }

    public static x70.c b(x70.c cVar) {
        x70.c<Object> cVarIntercepted;
        cVar.getClass();
        z70.c cVar2 = cVar instanceof z70.c ? (z70.c) cVar : null;
        return (cVar2 == null || (cVarIntercepted = cVar2.intercepted()) == null) ? cVar : cVarIntercepted;
    }

    public static Object c(Function2 function2, Object obj, x70.c cVar) {
        function2.getClass();
        CoroutineContext context = cVar.getContext();
        return ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(obj, context == kotlin.coroutines.g.f26549a ? new d(cVar) : new e(context, cVar));
    }
}
