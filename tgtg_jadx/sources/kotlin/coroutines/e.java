package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e {
    public static CoroutineContext.Element a(CoroutineContext.Element element, f fVar) {
        fVar.getClass();
        if (Intrinsics.areEqual(element.getKey(), fVar)) {
            return element;
        }
        return null;
    }

    public static CoroutineContext b(CoroutineContext.Element element, f fVar) {
        fVar.getClass();
        return Intrinsics.areEqual(element.getKey(), fVar) ? g.f26549a : element;
    }

    public static CoroutineContext c(CoroutineContext.Element element, CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        return coroutineContext == g.f26549a ? element : (CoroutineContext) coroutineContext.fold(element, new u60.a(19));
    }
}
