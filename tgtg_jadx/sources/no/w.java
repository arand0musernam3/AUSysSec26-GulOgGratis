package no;

import com.app.tgtg.feature.orderview.surprisebag.SurpriseBagOrderActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class w implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SurpriseBagOrderActivity f31307b;

    public /* synthetic */ w(SurpriseBagOrderActivity surpriseBagOrderActivity, int i11) {
        this.f31306a = i11;
        this.f31307b = surpriseBagOrderActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f31306a) {
            case 0:
                return this.f31307b.getDefaultViewModelProviderFactory();
            case 1:
                return this.f31307b.getViewModelStore();
            default:
                return this.f31307b.getDefaultViewModelCreationExtras();
        }
    }
}
