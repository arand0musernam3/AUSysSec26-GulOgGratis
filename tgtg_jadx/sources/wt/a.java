package wt;

import com.app.tgtg.model.remote.AppSettings;
import com.app.tgtg.model.remote.EmailCheckResult;
import com.app.tgtg.model.remote.EnvironmentListResult;
import com.app.tgtg.model.remote.StoreLocationListResult;
import com.app.tgtg.model.remote.UserData;
import com.app.tgtg.model.remote.UserSettings;
import com.app.tgtg.model.remote.user.response.charity.CharityBulkCancelOrder;
import com.app.tgtg.model.remote.user.response.charity.CharityDaySchedule;
import com.app.tgtg.model.remote.user.response.charity.CharityGeneralSchedule;
import com.app.tgtg.model.remote.user.response.charity.CharityHomeResponse;
import com.app.tgtg.model.remote.user.response.charity.CharityProductsResponse;
import com.app.tgtg.model.remote.user.response.charity.CharityScheduleResponse;
import com.app.tgtg.model.remote.user.response.charity.CharityUpdateGeneralSchedule;
import com.app.tgtg.model.remote.user.response.charity.CharityUserDetails;
import com.braze.ui.contentcards.managers.BrazeContentCardsManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43533a;

    public /* synthetic */ a(int i11) {
        this.f43533a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f43533a) {
            case 0:
                return AppSettings._childSerializers$_anonymous_();
            case 1:
                return AppSettings._childSerializers$_anonymous_$0();
            case 2:
                return EmailCheckResult._childSerializers$_anonymous_();
            case 3:
                return EnvironmentListResult._childSerializers$_anonymous_();
            case 4:
                return StoreLocationListResult._childSerializers$_anonymous_();
            case 5:
                return UserData._childSerializers$_anonymous_();
            case 6:
                return UserData._childSerializers$_anonymous_$0();
            case 7:
                return UserData._childSerializers$_anonymous_$1();
            case 8:
                return UserSettings._childSerializers$_anonymous_();
            case 9:
                return UserSettings._childSerializers$_anonymous_$0();
            case 10:
                return UserSettings._childSerializers$_anonymous_$1();
            case 11:
                return CharityBulkCancelOrder._childSerializers$_anonymous_();
            case 12:
                return CharityDaySchedule._init_$_anonymous_();
            case 13:
                return CharityDaySchedule.Available._childSerializers$_anonymous_();
            case 14:
                return CharityGeneralSchedule._childSerializers$_anonymous_();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return CharityGeneralSchedule._childSerializers$_anonymous_$0();
            case 16:
                return CharityHomeResponse._childSerializers$_anonymous_();
            case 17:
                return CharityHomeResponse._childSerializers$_anonymous_$0();
            case 18:
                return CharityHomeResponse._childSerializers$_anonymous_$1();
            case 19:
                return CharityHomeResponse._childSerializers$_anonymous_$2();
            case 20:
                return CharityProductsResponse._childSerializers$_anonymous_();
            case 21:
                return CharityProductsResponse._childSerializers$_anonymous_$0();
            case 22:
                return CharityScheduleResponse._childSerializers$_anonymous_();
            case 23:
                return CharityUpdateGeneralSchedule._childSerializers$_anonymous_();
            case 24:
                return CharityUserDetails._childSerializers$_anonymous_();
            case 25:
                return com.braze.events.internal.dispatchmanager.a.a();
            case 26:
                return BrazeContentCardsManager.instance_delegate$lambda$0();
            case 27:
                return null;
            case 28:
                return Long.valueOf(System.currentTimeMillis());
            default:
                return Unit.f26487a;
        }
    }
}
