package c6;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import z4.k1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f7767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f7768b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Ref.ObjectRef objectRef, a0 a0Var) {
        super(0);
        this.f7767a = objectRef;
        this.f7768b = a0Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f7767a.element = b5.o.e(this.f7768b, k1.f47165a);
        return Unit.f26487a;
    }
}
