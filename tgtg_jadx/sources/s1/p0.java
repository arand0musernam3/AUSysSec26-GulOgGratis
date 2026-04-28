package s1;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f38658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f38659b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(boolean z11, Function0 function0) {
        super(1);
        this.f38658a = z11;
        this.f38659b = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((i4.s0) obj).g(!this.f38658a && ((Boolean) this.f38659b.invoke()).booleanValue());
        return Unit.f26487a;
    }
}
