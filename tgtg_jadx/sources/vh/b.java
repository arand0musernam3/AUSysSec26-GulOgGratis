package vh;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f42326b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, int i11) {
        super(0);
        this.f42325a = i11;
        this.f42326b = cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f42325a) {
            case 0:
                return this.f42326b.requireActivity().getViewModelStore();
            case 1:
                return this.f42326b.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return this.f42326b.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
