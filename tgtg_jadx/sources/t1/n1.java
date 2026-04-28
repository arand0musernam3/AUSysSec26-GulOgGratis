package t1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public interface n1 {
    Object a();

    default boolean b(Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, a()) && Intrinsics.areEqual(obj2, c());
    }

    Object c();
}
