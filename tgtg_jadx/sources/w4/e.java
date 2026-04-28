package w4;

import b5.p2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f43117a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Ref.BooleanRef booleanRef) {
        super(1);
        this.f43117a = booleanRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        if (!((g) obj).f43121q) {
            return p2.ContinueTraversal;
        }
        this.f43117a.element = false;
        return p2.CancelTraversal;
    }
}
