package w4;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f43115a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Ref.ObjectRef objectRef) {
        super(1);
        this.f43115a = objectRef;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [T, java.lang.Object, w4.g] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ?? r42 = (g) obj;
        Ref.ObjectRef objectRef = this.f43115a;
        T t9 = objectRef.element;
        if (t9 == 0 && r42.f43121q) {
            objectRef.element = r42;
        } else if (t9 != 0) {
            r42.getClass();
        }
        return Boolean.TRUE;
    }
}
