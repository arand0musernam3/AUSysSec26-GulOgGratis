package jg;

import bg.w0;
import com.app.tgtg.customview.manufactureaddressfragment.XmlCheckoutAddressFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ XmlCheckoutAddressFragment f25166b;

    public /* synthetic */ c0(XmlCheckoutAddressFragment xmlCheckoutAddressFragment, int i11) {
        this.f25165a = i11;
        this.f25166b = xmlCheckoutAddressFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f25165a) {
            case 0:
                this.f25166b.x().m(cv.i.ACTION_HEED_INPUT_WARNING);
                return Unit.f26487a;
            default:
                return new w0(this.f25166b.getContext());
        }
    }
}
