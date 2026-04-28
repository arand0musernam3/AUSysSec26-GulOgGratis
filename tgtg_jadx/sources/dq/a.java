package dq;

import com.app.tgtg.feature.survey.bringmagic.BringBackMagicActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BringBackMagicActivity f15142b;

    public /* synthetic */ a(BringBackMagicActivity bringBackMagicActivity, int i11) {
        this.f15141a = i11;
        this.f15142b = bringBackMagicActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15141a) {
            case 0:
                return this.f15142b.getDefaultViewModelProviderFactory();
            case 1:
                return this.f15142b.getViewModelStore();
            default:
                return this.f15142b.getDefaultViewModelCreationExtras();
        }
    }
}
