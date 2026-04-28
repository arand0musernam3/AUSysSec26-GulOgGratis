package c5;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f7354a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Ref.ObjectRef objectRef) {
        super(1);
        this.f7354a = objectRef;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, g4.g0] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f7354a.element = (g4.g0) obj;
        return Boolean.TRUE;
    }
}
