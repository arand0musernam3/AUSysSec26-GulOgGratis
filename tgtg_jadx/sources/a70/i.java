package a70;

import at.o;
import j4.s;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;
import v80.f0;
import y80.q0;
import y80.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i {
    public static final y80.i a(y80.i... iVarArr) {
        o oVar = new o(Arrays.copyOf(iVarArr, iVarArr.length), 6);
        int length = iVarArr.length;
        int i11 = length < 1 ? 1 : length;
        int i12 = q0.f45559a;
        if (i11 > 0) {
            return i11 == 1 ? new o(oVar, 8) : new z80.f(oVar, i11, kotlin.coroutines.g.f26549a, -2, x80.a.SUSPEND);
        }
        i4.a.i(s.f(i11, "Expected positive concurrency level, but had "));
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, v80.j1, v80.s1] */
    public static final o b(y80.i iVar) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? C = f0.c();
        C.R(Unit.f26487a);
        objectRef.element = C;
        return new o(new h(new u(iVar, new c(objectRef, null)), objectRef, null));
    }
}
