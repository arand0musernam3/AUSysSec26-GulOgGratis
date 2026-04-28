package j5;

import b5.l2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends b4.s implements l2 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Lambda f24692o;

    /* JADX WARN: Multi-variable type inference failed */
    public s(Function1 function1) {
        this.f24692o = (Lambda) function1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // b5.l2
    public final void h0(b0 b0Var) {
        this.f24692o.invoke(b0Var);
    }
}
