package v80;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class v {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Object] */
    public static final CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, boolean z11) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) coroutineContext.fold(bool, new u60.a(10))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) coroutineContext2.fold(bool, new u60.a(10))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return coroutineContext.plus(coroutineContext2);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = coroutineContext2;
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f26549a;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(gVar, new an.b(objectRef, z11, 11));
        if (zBooleanValue2) {
            objectRef.element = ((CoroutineContext) objectRef.element).fold(gVar, new u60.a(11));
        }
        return coroutineContext3.plus((CoroutineContext) objectRef.element);
    }

    public static final CoroutineContext b(b0 b0Var, CoroutineContext coroutineContext) {
        CoroutineContext coroutineContextA = a(b0Var.getCoroutineContext(), coroutineContext, true);
        c90.f fVar = p0.f42144a;
        return (coroutineContextA == fVar || coroutineContextA.get(kotlin.coroutines.d.f26548k0) != null) ? coroutineContextA : coroutineContextA.plus(fVar);
    }

    public static final l2 c(x70.c cVar, CoroutineContext coroutineContext, Object obj) {
        l2 l2Var = null;
        if ((cVar instanceof z70.d) && coroutineContext.get(m2.f42130a) != null) {
            z70.d callerFrame = (z70.d) cVar;
            while (true) {
                if ((callerFrame instanceof m0) || (callerFrame = callerFrame.getCallerFrame()) == null) {
                    break;
                }
                if (callerFrame instanceof l2) {
                    l2Var = (l2) callerFrame;
                    break;
                }
            }
            if (l2Var != null) {
                l2Var.o0(coroutineContext, obj);
            }
        }
        return l2Var;
    }
}
