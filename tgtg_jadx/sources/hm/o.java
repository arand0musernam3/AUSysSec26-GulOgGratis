package hm;

import com.app.tgtg.feature.main.MainActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f22130b;

    public /* synthetic */ o(MainActivity mainActivity, int i11) {
        this.f22129a = i11;
        this.f22130b = mainActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f22129a) {
            case 0:
                return this.f22130b.getDefaultViewModelProviderFactory();
            case 1:
                return this.f22130b.getViewModelStore();
            default:
                return this.f22130b.getDefaultViewModelCreationExtras();
        }
    }
}
