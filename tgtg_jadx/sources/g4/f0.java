package g4;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f19937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f19938b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Ref.ObjectRef objectRef, g0 g0Var) {
        super(0);
        this.f19937a = objectRef;
        this.f19938b = g0Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, g4.t] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f19937a.element = this.f19938b.N0();
        return Unit.f26487a;
    }
}
