package c5;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p3 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f7320a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(Ref.ObjectRef objectRef) {
        super(0);
        this.f7320a = objectRef;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((Function0) this.f7320a.element).invoke();
        return Unit.f26487a;
    }
}
