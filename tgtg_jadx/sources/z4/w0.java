package z4;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public interface w0 extends u {
    static v0 Y(w0 w0Var, int i11, int i12, Function1 function1, Function1 function12) {
        kotlin.collections.o0 o0Var = kotlin.collections.o0.f26530a;
        o0Var.getClass();
        return w0Var.m0(i11, i12, o0Var, function1, function12);
    }

    static v0 f(w0 w0Var, int i11, int i12, Function1 function1) {
        kotlin.collections.o0 o0Var = kotlin.collections.o0.f26530a;
        o0Var.getClass();
        return w0Var.r(i11, i12, o0Var, function1);
    }

    v0 m0(int i11, int i12, Map map, Function1 function1, Function1 function12);

    default v0 r(int i11, int i12, Map map, Function1 function1) {
        return m0(i11, i12, map, null, function1);
    }
}
