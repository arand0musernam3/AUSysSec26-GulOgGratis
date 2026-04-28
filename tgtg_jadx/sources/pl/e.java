package pl;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f35478b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i11) {
        super(0);
        this.f35477a = i11;
        this.f35478b = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f35477a) {
            case 0:
                return this.f35478b.requireActivity().getViewModelStore();
            case 1:
                return this.f35478b.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return this.f35478b.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
