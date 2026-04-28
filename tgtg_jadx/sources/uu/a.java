package uu;

import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.remote.user.requests.UserAddress;
import com.app.tgtg.model.remote.user.response.GetAddressesResponse;
import com.app.tgtg.model.remote.user.response.ListOrders;
import com.app.tgtg.model.remote.user.response.MoneySavedResponse;
import com.app.tgtg.model.remote.user.response.SearchAddressResponse;
import com.app.tgtg.model.remote.user.response.StartupResponse;
import com.app.tgtg.model.remote.user.response.UpdateAddressResponse;
import com.braze.enums.DataStoreKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import m3.e0;
import m90.d;
import org.bouncycastle.iana.AEADAlgorithm;
import v1.b1;
import v1.l0;
import v1.m1;
import v1.y1;
import vj.j;
import zendesk.android.internal.proactivemessaging.campaigntriggerservice.model.CampaignPathDto;
import zendesk.android.internal.proactivemessaging.campaigntriggerservice.model.CtsRequestDto;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41565a;

    public /* synthetic */ a(int i11) {
        this.f41565a = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f41565a) {
            case 0:
                return UserAddress._childSerializers$_anonymous_();
            case 1:
                return DataStoreKey.keyMap_delegate$lambda$1();
            case 2:
                e0 e0Var = b1.f41690a;
                return l0.f41778a;
            case 3:
                return new m1();
            case 4:
                return new y1(0);
            case 5:
                return CampaignPathDto._childSerializers$_anonymous_();
            case 6:
                return CtsRequestDto._childSerializers$_anonymous_();
            case 7:
                j[] jVarArrValues = j.values();
                jVarArrValues.getClass();
                return new d(new i90.a("com.app.tgtg.feature.favorites.model.WeekDaysEnum", (Enum[]) jVarArrValues), 0);
            case 8:
                j[] jVarArrValues2 = j.values();
                jVarArrValues2.getClass();
                return new d(new i90.a("com.app.tgtg.feature.favorites.model.WeekDaysEnum", (Enum[]) jVarArrValues2), 0);
            case 9:
                return Unit.f26487a;
            case 10:
                return BasketManager._childSerializers$_anonymous_();
            case 11:
                return BasketManager._childSerializers$_anonymous_$0();
            case 12:
                return BasketManager._childSerializers$_anonymous_$1();
            case 13:
                return GetAddressesResponse._childSerializers$_anonymous_();
            case 14:
                return GetAddressesResponse._childSerializers$_anonymous_$0();
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return ListOrders._childSerializers$_anonymous_();
            case 16:
                return MoneySavedResponse._childSerializers$_anonymous_();
            case 17:
                return SearchAddressResponse._childSerializers$_anonymous_();
            case 18:
                return StartupResponse._childSerializers$_anonymous_();
            case 19:
                return StartupResponse._childSerializers$_anonymous_$0();
            case 20:
                return UpdateAddressResponse._childSerializers$_anonymous_();
            case 21:
                return com.braze.events.a.b();
            case 22:
                return com.braze.events.a.n();
            case 23:
                return com.braze.events.a.a();
            case 24:
                return com.braze.events.a.d0();
            case 25:
                return com.braze.events.a.M();
            case 26:
                return com.braze.events.a.N();
            case 27:
                return com.braze.events.a.u();
            case 28:
                return com.braze.events.a.m();
            default:
                return com.braze.events.a.b0();
        }
    }
}
