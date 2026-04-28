package nn;

import android.os.Bundle;
import at.c0;
import com.app.tgtg.R;
import com.app.tgtg.feature.tabprofile.manageaccount.ManageAccountActivity;
import com.app.tgtg.feature.tabprofile.storelogin.ui.StoreLoginActivity;
import com.app.tgtg.model.local.AppConstants;
import com.app.tgtg.model.remote.profile.response.ProfileFeatureState;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mn.l f31146b;

    public /* synthetic */ h(mn.l lVar, int i11) {
        this.f31145a = i11;
        this.f31146b = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i11 = this.f31145a;
        mn.l lVar = this.f31146b;
        switch (i11) {
            case 0:
                f70.g gVar = lVar.f30027i.f25317a;
                Bundle bundleX = jb.u.x(new Pair("ORIGIN", f70.i.PROFILE));
                bundleX.putBoolean("GO_TO_STORE_SIGNUP_WEB", true);
                gVar.a(new f70.b(StoreLoginActivity.class, bundleX, false, false, false, Integer.valueOf(AppConstants.REQUEST_CODE_STORE_SIGNUP), null, null, null, false, 988));
                break;
            case 1:
                lVar.f30027i.f25317a.a(jm.a.f25315a);
                break;
            case 2:
                ProfileFeatureState profileFeatureState = lVar.F;
                if (profileFeatureState != null) {
                    cv.i iVar = cv.i.SCREEN_MENU_SPECIAL_REWARDS_CARD;
                    dv.a aVar = dv.a.TYPE;
                    dv.d dVar = profileFeatureState == ProfileFeatureState.MULTIPLE_CLAIMED_REWARDS ? dv.d.MULTIPLE : dv.d.SINGLE;
                    lVar.d(iVar, aVar, dVar != null ? dVar.a() : null);
                }
                break;
            case 3:
                lVar.c(null);
                break;
            case 4:
                String loyaltyCardTermsUrl = lVar.f30019a.n().getLoyaltyCardTermsUrl();
                ct.a aVar2 = ct.a.TERMS_AND_CONDITIONS;
                Integer numValueOf = Integer.valueOf(R.string.loyalty_card_info_see_full_terms);
                aVar2.getClass();
                c0.c(lVar.f30028j, loyaltyCardTermsUrl, aVar2, numValueOf, true, 16);
                break;
            case 5:
                cv.i iVar2 = cv.i.TEMP_FACE_SWAP;
                iVar2.getClass();
                lVar.f30024f.b(iVar2);
                break;
            default:
                cv.i iVar3 = cv.i.ACTION_GOTO_MANAGE_ACCOUNT;
                iVar3.getClass();
                lVar.f30024f.b(iVar3);
                lVar.f30027i.f25317a.a(new f70.b(ManageAccountActivity.class, null, false, false, false, Integer.valueOf(AppConstants.REQUEST_CODE_STORE_SIGNUP), null, null, null, false, 990));
                break;
        }
        return Unit.f26487a;
    }
}
