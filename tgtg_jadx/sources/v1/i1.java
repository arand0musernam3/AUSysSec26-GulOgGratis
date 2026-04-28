package v1;

import android.os.Build;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j5.a0 f41764a = new j5.a0("MagnifierPositionInRoot");

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static b4.t b(Function1 function1, Function1 function12, r1 r1Var) {
        return a() ? new f1(function1, function12, r1Var) : b4.q.f5711a;
    }
}
