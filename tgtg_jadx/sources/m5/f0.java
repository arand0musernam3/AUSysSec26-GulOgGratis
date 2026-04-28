package m5;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f29533a = new f0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        if (Intrinsics.areEqual(obj, Boolean.FALSE)) {
            return new i4.v(i4.v.f23315h);
        }
        obj.getClass();
        return new i4.v(i4.g0.c(((Integer) obj).intValue()));
    }
}
