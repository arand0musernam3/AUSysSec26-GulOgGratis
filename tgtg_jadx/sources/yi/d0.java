package yi;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f45969b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(f0 f0Var, int i11) {
        super(0);
        this.f45968a = i11;
        this.f45969b = f0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f45968a) {
            case 0:
                return this.f45969b.requireActivity().getViewModelStore();
            case 1:
                return this.f45969b.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return this.f45969b.requireActivity().getDefaultViewModelProviderFactory();
            default:
                return this.f45969b;
        }
    }
}
