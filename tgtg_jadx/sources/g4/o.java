package g4;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f19960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19961b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Ref.ObjectRef objectRef, int i11) {
        super(1);
        this.f19960a = objectRef;
        this.f19961b = i11;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [T, java.lang.Boolean, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ?? ValueOf = Boolean.valueOf(((g0) obj).S0(this.f19961b));
        this.f19960a.element = ValueOf;
        return ValueOf;
    }
}
