package bg;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s0 f6217b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(s0 s0Var, int i11) {
        super(0);
        this.f6216a = i11;
        this.f6217b = s0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f6216a) {
            case 0:
                return this.f6217b.requireActivity().getViewModelStore();
            case 1:
                return this.f6217b.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return this.f6217b.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
