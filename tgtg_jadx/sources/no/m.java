package no;

import android.app.ActivityOptions;
import android.content.Intent;
import android.webkit.URLUtil;
import androidx.lifecycle.m1;
import b0.a1;
import com.app.tgtg.R;
import com.app.tgtg.feature.orderview.surprisebag.SurpriseBagOrderActivity;
import com.app.tgtg.feature.rating.RatingActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.specialrewards.SpecialRewardsActivity;
import com.app.tgtg.model.remote.RewardId;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.specialrewards.SpecialReward;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SurpriseBagOrderActivity f31244b;

    public /* synthetic */ m(SurpriseBagOrderActivity surpriseBagOrderActivity, int i11) {
        this.f31243a = i11;
        this.f31244b = surpriseBagOrderActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i11 = this.f31243a;
        boolean z11 = false;
        Object[] objArr = 0;
        int i12 = 5;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        SurpriseBagOrderActivity surpriseBagOrderActivity = this.f31244b;
        switch (i11) {
            case 0:
                String str = (String) obj;
                int i13 = SurpriseBagOrderActivity.f9178y;
                str.getClass();
                m0 m0VarC = surpriseBagOrderActivity.C();
                m0VarC.getClass();
                v80.f0.B(m1.d(m0VarC), null, null, new k0(m0VarC, str, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0), 3);
                break;
            case 1:
                ((Boolean) obj).getClass();
                int i14 = SurpriseBagOrderActivity.f9178y;
                surpriseBagOrderActivity.A();
                break;
            case 2:
                int i15 = SurpriseBagOrderActivity.f9178y;
                m0 m0VarC2 = surpriseBagOrderActivity.C();
                m0VarC2.getClass();
                v80.f0.B(m1.d(m0VarC2), null, null, new z(m0VarC2, (x70.c) (objArr3 == true ? 1 : 0), i12), 3);
                break;
            case 3:
                SpecialReward specialReward = (SpecialReward) obj;
                int i16 = SurpriseBagOrderActivity.f9178y;
                specialReward.getClass();
                m0 m0VarC3 = surpriseBagOrderActivity.C();
                String strM496getRewardIdr7kTZ_U = specialReward.m496getRewardIdr7kTZ_U();
                m0VarC3.I.f26484a.a(new f70.b(SpecialRewardsActivity.class, jb.u.x(new Pair("REMOTE_SELECTED_REWARD", strM496getRewardIdr7kTZ_U != null ? RewardId.m257boximpl(strM496getRewardIdr7kTZ_U) : null)), true, false, false, null, null, null, null, false, 1016));
                break;
            case 4:
                BasicItem basicItem = (BasicItem) obj;
                int i17 = SurpriseBagOrderActivity.f9178y;
                basicItem.getClass();
                surpriseBagOrderActivity.C().u(basicItem.getInformation().mo340getItemIdFvU5WIY());
                surpriseBagOrderActivity.O(basicItem);
                break;
            case 5:
                f70.h hVar = (f70.h) obj;
                int i18 = SurpriseBagOrderActivity.f9178y;
                hVar.getClass();
                if (hVar instanceof ko.a) {
                    Intent intent = new Intent(surpriseBagOrderActivity, (Class<?>) RatingActivity.class);
                    ko.a aVar = (ko.a) hVar;
                    intent.putExtra("ORDER", aVar.f26481a);
                    intent.putExtra("RATING", aVar.f26482b);
                    intent.putExtra("SOURCE", aVar.f26483c);
                    surpriseBagOrderActivity.f9192x.a(intent, new se.b(ActivityOptions.makeCustomAnimation(surpriseBagOrderActivity, R.anim.slide_in_from_bottom_to_top, R.anim.stay), 5));
                    z11 = true;
                }
                break;
            case 6:
                int iIntValue = ((Integer) obj).intValue();
                int i19 = SurpriseBagOrderActivity.f9178y;
                v80.f0.B(m1.c(surpriseBagOrderActivity), null, null, new a1(surpriseBagOrderActivity, iIntValue, null, 8), 3);
                break;
            case 7:
                BasicItem basicItem2 = (BasicItem) obj;
                int i21 = SurpriseBagOrderActivity.f9178y;
                basicItem2.getClass();
                surpriseBagOrderActivity.C().u(basicItem2.getInformation().mo340getItemIdFvU5WIY());
                surpriseBagOrderActivity.O(basicItem2);
                break;
            default:
                String str2 = (String) obj;
                int i22 = SurpriseBagOrderActivity.f9178y;
                str2.getClass();
                if (URLUtil.isValidUrl(str2)) {
                    m0 m0VarC4 = surpriseBagOrderActivity.C();
                    ct.a aVar2 = ct.a.ALLERGENS;
                    Integer numValueOf = Integer.valueOf(R.string.webview_ingredients_and_allergens_title);
                    m0VarC4.getClass();
                    aVar2.getClass();
                    at.c0.c(m0VarC4.J, str2, aVar2, numValueOf, true, 16);
                }
                break;
        }
        return Unit.f26487a;
    }
}
