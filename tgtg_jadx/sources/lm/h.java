package lm;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f27917b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, int i11) {
        super(0);
        this.f27916a = i11;
        this.f27917b = iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f27916a) {
            case 0:
                return this.f27917b.requireActivity().getViewModelStore();
            case 1:
                return this.f27917b.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return this.f27917b.requireActivity().getDefaultViewModelProviderFactory();
            case 3:
                return this.f27917b.requireActivity().getViewModelStore();
            case 4:
                return this.f27917b.requireActivity().getDefaultViewModelCreationExtras();
            case 5:
                return this.f27917b.requireActivity().getDefaultViewModelProviderFactory();
            case 6:
                return this.f27917b.requireActivity().getViewModelStore();
            case 7:
                return this.f27917b.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return this.f27917b.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
