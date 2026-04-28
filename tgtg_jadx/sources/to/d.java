package to;

import com.app.tgtg.feature.postpurchase.email.AddEmailFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddEmailFragment f40366b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(AddEmailFragment addEmailFragment, int i11) {
        super(0);
        this.f40365a = i11;
        this.f40366b = addEmailFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f40365a) {
            case 0:
                return this.f40366b.requireActivity().getViewModelStore();
            case 1:
                return this.f40366b.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return this.f40366b.requireActivity().getDefaultViewModelProviderFactory();
            default:
                return this.f40366b;
        }
    }
}
