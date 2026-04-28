package b40;

import com.app.tgtg.feature.charity.ui.MainCharityActivity;
import com.app.tgtg.feature.logincharity.ui.LoginCharityActivity;
import com.app.tgtg.feature.survey.bringmagic.BringBackMagicActivity;
import com.app.tgtg.feature.survey.rewards.RewardsSurveyActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import mn.l;
import org.bouncycastle.iana.AEADAlgorithm;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d extends FunctionReferenceImpl implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5740a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Object obj, int i11) {
        super(0, obj, MainCharityActivity.class, "onLogout", "onLogout()V", 0);
        this.f5740a = i11;
        switch (i11) {
            case 5:
                super(0, obj, BringBackMagicActivity.class, "goToBrowse", "goToBrowse()V", 0);
                break;
            case 6:
            case 7:
            case 10:
            case 11:
            case 12:
            case 18:
            default:
                break;
            case 8:
                super(0, obj, RewardsSurveyActivity.class, "goToDiscover", "goToDiscover()V", 0);
                break;
            case 9:
                super(0, obj, RewardsSurveyActivity.class, "goToDiscover", "goToDiscover()V", 0);
                break;
            case 13:
                super(0, obj, l.class, "goToDiscover", "goToDiscover()V", 0);
                break;
            case 14:
                super(0, obj, l.class, "goToOrderList", "goToOrderList()V", 0);
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                super(0, obj, l.class, "markRecipeGeneratorAsOpened", "markRecipeGeneratorAsOpened()V", 0);
                break;
            case 16:
                super(0, obj, t2.d.class, Bayeux.KEY_DATA, "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0);
                break;
            case 17:
                super(0, obj, si.b.class, "getOrderHistory", "getOrderHistory()V", 0);
                break;
            case 19:
                super(0, obj, LoginCharityActivity.class, "onLogin", "onLogin()V", 0);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b5  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke() throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b40.d.invoke():java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i11, Object obj, Class cls, String str, String str2, int i12, int i13) {
        super(i11, obj, cls, str, str2, i12);
        this.f5740a = i13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i11) {
        super(0, f.f5741d, e.class, "isBackgroundThread", "isBackgroundThread()Z", 0);
        this.f5740a = i11;
        switch (i11) {
            case 1:
                super(0, f.f5741d, e.class, "isBlockingThread", "isBlockingThread()Z", 0);
                break;
            case 2:
                super(0, f.f5741d, e.class, "isNotMainThread", "isNotMainThread()Z", 0);
                break;
            default:
                break;
        }
    }
}
