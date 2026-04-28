package oh;

import com.app.tgtg.feature.bucketlist.ui.BucketListActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BucketListActivity f32551b;

    public /* synthetic */ a(BucketListActivity bucketListActivity, int i11) {
        this.f32550a = i11;
        this.f32551b = bucketListActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f32550a) {
            case 0:
                return this.f32551b.getDefaultViewModelProviderFactory();
            case 1:
                return this.f32551b.getViewModelStore();
            default:
                return this.f32551b.getDefaultViewModelCreationExtras();
        }
    }
}
