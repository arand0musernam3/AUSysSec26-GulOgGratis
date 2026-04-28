package rq;

import com.app.tgtg.feature.tabprofile.c2creferral.ui.InviteFriendsActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InviteFriendsActivity f38157b;

    public /* synthetic */ a(InviteFriendsActivity inviteFriendsActivity, int i11) {
        this.f38156a = i11;
        this.f38157b = inviteFriendsActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f38156a) {
            case 0:
                return this.f38157b.getDefaultViewModelProviderFactory();
            case 1:
                return this.f38157b.getViewModelStore();
            default:
                return this.f38157b.getDefaultViewModelCreationExtras();
        }
    }
}
