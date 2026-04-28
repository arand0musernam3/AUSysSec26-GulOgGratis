package nn;

import android.app.Activity;
import com.app.tgtg.feature.badges.ui.BadgesActivity;
import com.app.tgtg.feature.tabprofile.c2creferral.ui.InviteFriendsActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.accountdetails.AccountDetailsActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mn.l f31156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f31157c;

    public /* synthetic */ l(mn.l lVar, Activity activity) {
        this.f31155a = 1;
        this.f31156b = lVar;
        this.f31157c = activity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f31155a) {
            case 0:
                if (this.f31157c != null) {
                    cv.i iVar = cv.i.ACTION_INVITE_FRIENDS;
                    dv.a aVar = dv.a.SOURCE;
                    dv.d dVar = dv.d.PROFILE;
                    String strA = dVar != null ? dVar.a() : null;
                    mn.l lVar = this.f31156b;
                    lVar.d(iVar, aVar, strA);
                    lVar.f30027i.f25317a.a(new f70.b(InviteFriendsActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                }
                break;
            case 1:
                mn.l lVar2 = this.f31156b;
                cv.b bVar = lVar2.f30024f;
                cv.i iVar2 = cv.i.ACTION_TO_BADGES;
                dv.a aVar2 = dv.a.SOURCE;
                dv.d dVar2 = dv.d.MENU;
                bVar.d(iVar2, aVar2, dVar2 != null ? dVar2.a() : null);
                if (this.f31157c != null) {
                    lVar2.f30027i.f25317a.a(new f70.b(BadgesActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                }
                break;
            default:
                if (this.f31157c != null) {
                    this.f31156b.f30027i.f25317a.a(new f70.b(AccountDetailsActivity.class, null, false, false, false, null, null, null, null, false, 1022));
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ l(Activity activity, mn.l lVar, int i11) {
        this.f31155a = i11;
        this.f31157c = activity;
        this.f31156b = lVar;
    }
}
