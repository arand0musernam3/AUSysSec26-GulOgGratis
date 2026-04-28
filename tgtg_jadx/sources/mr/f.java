package mr;

import com.app.tgtg.feature.tabprofile.manageaccount.accountdetails.edit.EditDataActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditDataActivity f30084b;

    public /* synthetic */ f(EditDataActivity editDataActivity, int i11) {
        this.f30083a = i11;
        this.f30084b = editDataActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f30083a) {
            case 0:
                return this.f30084b.getDefaultViewModelProviderFactory();
            case 1:
                return this.f30084b.getViewModelStore();
            default:
                return this.f30084b.getDefaultViewModelCreationExtras();
        }
    }
}
