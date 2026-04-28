package jg;

import com.app.tgtg.customview.manufactureaddressfragment.XmlCheckoutAddressFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ XmlCheckoutAddressFragment f25205b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(XmlCheckoutAddressFragment xmlCheckoutAddressFragment, int i11) {
        super(0);
        this.f25204a = i11;
        this.f25205b = xmlCheckoutAddressFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f25204a) {
            case 0:
                return this.f25205b.requireActivity().getViewModelStore();
            case 1:
                return this.f25205b.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return this.f25205b.requireActivity().getDefaultViewModelProviderFactory();
            case 3:
                return this.f25205b.requireActivity().getViewModelStore();
            case 4:
                return this.f25205b.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return this.f25205b.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
