package v4;

import b4.s;
import b5.q2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f41996a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Ref.ObjectRef objectRef) {
        super(1);
        this.f41996a = objectRef;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, b5.q2] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z11;
        ?? r22 = (q2) obj;
        if (((s) r22).getNode().isAttached()) {
            this.f41996a.element = r22;
            z11 = false;
        } else {
            z11 = true;
        }
        return Boolean.valueOf(z11);
    }
}
