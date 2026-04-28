package kt;

import com.app.tgtg.model.remote.JwtTokenResponse;
import com.app.tgtg.model.remote.MyStoreSignupUrlResponse;
import com.app.tgtg.model.remote.UserData;
import com.app.tgtg.model.remote.privacy.DeleteUserRequest;
import com.app.tgtg.model.remote.privacy.ExportUserRequest;
import com.app.tgtg.model.remote.profile.request.ProfileDismissCardNotificationRequest;
import com.app.tgtg.model.remote.profile.request.ProfileStateTransitionRequest;
import com.app.tgtg.model.remote.profile.response.ProfileFeature;
import com.app.tgtg.model.remote.profile.response.ProfileScreenResponse;
import com.app.tgtg.model.remote.user.requests.DeviceIdRequest;
import com.app.tgtg.model.remote.user.requests.EmailChangeRequest;
import com.app.tgtg.model.remote.user.requests.GetAddressesRequest;
import com.app.tgtg.model.remote.user.requests.GetDeliveryInfoRequest;
import com.app.tgtg.model.remote.user.requests.GetValidUserAddressRequest;
import com.app.tgtg.model.remote.user.requests.LinkC2CReferralCodeRequest;
import com.app.tgtg.model.remote.user.requests.OnboardingSurveyRequest;
import com.app.tgtg.model.remote.user.requests.SearchAddressRequest;
import com.app.tgtg.model.remote.user.requests.UpdateAddressRequest;
import com.app.tgtg.model.remote.user.requests.ValidatePostalCodeRequest;
import com.app.tgtg.model.remote.user.response.C2CReferralResponse;
import com.app.tgtg.model.remote.user.response.Co2eSavedResponse;
import com.app.tgtg.model.remote.user.response.EmailStatusResponse;
import com.app.tgtg.model.remote.user.response.GetAddressesResponse;
import com.app.tgtg.model.remote.user.response.GetDeliveryInfoResponse;
import com.app.tgtg.model.remote.user.response.MoneySavedResponse;
import com.app.tgtg.model.remote.user.response.SearchAddressResponse;
import com.app.tgtg.model.remote.user.response.UpdateAddressResponse;
import com.app.tgtg.model.remote.user.response.ValidatePostalCodeResponse;
import com.braze.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q90.r0;
import ra0.s;
import u70.q;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0003H§@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0002H§@¢\u0006\u0004\b\u000e\u0010\u0005J \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0002H§@¢\u0006\u0004\b\u0014\u0010\u0005J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0002H§@¢\u0006\u0004\b\u0016\u0010\u0005J \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u0017H§@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002H§@¢\u0006\u0004\b\u001c\u0010\u0005J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002H§@¢\u0006\u0004\b\u001d\u0010\u0005J \u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\b\b\u0001\u0010\u001f\u001a\u00020\u001eH§@¢\u0006\u0004\b \u0010!J*\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\b\b\u0001\u0010#\u001a\u00020\"2\b\b\u0001\u0010\u0006\u001a\u00020$H§@¢\u0006\u0004\b%\u0010&J*\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\b\b\u0001\u0010#\u001a\u00020\"2\b\b\u0001\u0010\u0006\u001a\u00020'H§@¢\u0006\u0004\b(\u0010)J \u0010,\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\b\b\u0001\u0010+\u001a\u00020*H§@¢\u0006\u0004\b,\u0010-J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u0002H§@¢\u0006\u0004\b/\u0010\u0005J\u0016\u00101\u001a\b\u0012\u0004\u0012\u0002000\u0002H§@¢\u0006\u0004\b1\u0010\u0005J \u00103\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\b\b\u0001\u0010\u0006\u001a\u000202H§@¢\u0006\u0004\b3\u00104J\u0016\u00106\u001a\b\u0012\u0004\u0012\u0002050\u0002H§@¢\u0006\u0004\b6\u0010\u0005J\u0016\u00108\u001a\b\u0012\u0004\u0012\u0002070\u0002H§@¢\u0006\u0004\b8\u0010\u0005J \u0010;\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\b\b\u0001\u0010:\u001a\u000209H§@¢\u0006\u0004\b;\u0010<J \u0010?\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\b\b\u0001\u0010>\u001a\u00020=H§@¢\u0006\u0004\b?\u0010@J \u0010C\u001a\b\u0012\u0004\u0012\u00020B0\u00022\b\b\u0001\u0010A\u001a\u00020\tH§@¢\u0006\u0004\bC\u0010\rJ\"\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010F0\u00022\b\b\u0001\u0010E\u001a\u00020DH§@¢\u0006\u0004\bG\u0010HJ\"\u0010K\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010F0\u00022\b\b\u0001\u0010J\u001a\u00020IH§@¢\u0006\u0004\bK\u0010LJ \u0010P\u001a\b\u0012\u0004\u0012\u00020O0\u00022\b\b\u0001\u0010N\u001a\u00020MH§@¢\u0006\u0004\bP\u0010QJ \u0010U\u001a\b\u0012\u0004\u0012\u00020T0\u00022\b\b\u0001\u0010S\u001a\u00020RH§@¢\u0006\u0004\bU\u0010VJ\"\u0010X\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\n\b\u0001\u0010W\u001a\u0004\u0018\u00010\tH§@¢\u0006\u0004\bX\u0010\rJ \u0010\\\u001a\b\u0012\u0004\u0012\u00020[0\u00022\b\b\u0001\u0010Z\u001a\u00020YH§@¢\u0006\u0004\b\\\u0010]J \u0010a\u001a\b\u0012\u0004\u0012\u00020`0\u00022\b\b\u0001\u0010_\u001a\u00020^H§@¢\u0006\u0004\ba\u0010b¨\u0006cÀ\u0006\u0003"}, d2 = {"Lkt/o;", "", "Lu70/q;", "Lcom/app/tgtg/model/remote/UserData;", "o", "(Lx70/c;)Ljava/lang/Object;", Bayeux.KEY_DATA, "B", "(Lcom/app/tgtg/model/remote/UserData;Lx70/c;)Ljava/lang/Object;", "", "token", "Lq90/r0;", "A", "(Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "x", "Lcom/app/tgtg/model/remote/user/requests/EmailChangeRequest;", "newEmail", Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID, "(Lcom/app/tgtg/model/remote/user/requests/EmailChangeRequest;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/user/response/EmailStatusResponse;", "l", "Lcom/app/tgtg/model/remote/profile/response/ProfileScreenResponse;", "w", "Lcom/app/tgtg/model/remote/profile/request/ProfileStateTransitionRequest;", "stateTransition", "Lcom/app/tgtg/model/remote/profile/response/ProfileFeature;", "b", "(Lcom/app/tgtg/model/remote/profile/request/ProfileStateTransitionRequest;Lx70/c;)Ljava/lang/Object;", "f", "e", "Lcom/app/tgtg/model/remote/profile/request/ProfileDismissCardNotificationRequest;", "type", "z", "(Lcom/app/tgtg/model/remote/profile/request/ProfileDismissCardNotificationRequest;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/UserId;", "userId", "Lcom/app/tgtg/model/remote/privacy/ExportUserRequest;", "k", "(Ljava/lang/String;Lcom/app/tgtg/model/remote/privacy/ExportUserRequest;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/privacy/DeleteUserRequest;", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "(Ljava/lang/String;Lcom/app/tgtg/model/remote/privacy/DeleteUserRequest;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/user/requests/DeviceIdRequest;", "deviceId", "h", "(Lcom/app/tgtg/model/remote/user/requests/DeviceIdRequest;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/user/response/MoneySavedResponse;", "r", "Lcom/app/tgtg/model/remote/user/response/Co2eSavedResponse;", "j", "Lcom/app/tgtg/model/remote/user/requests/LinkC2CReferralCodeRequest;", "c", "(Lcom/app/tgtg/model/remote/user/requests/LinkC2CReferralCodeRequest;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/user/response/C2CReferralResponse;", "v", "Lcom/app/tgtg/model/remote/JwtTokenResponse;", Constants.BRAZE_PUSH_TITLE_KEY, "Lcom/app/tgtg/model/remote/user/requests/OnboardingSurveyRequest;", "onboardingSurvey", "i", "(Lcom/app/tgtg/model/remote/user/requests/OnboardingSurveyRequest;Lx70/c;)Ljava/lang/Object;", "Lzk/f;", "userPointOfInterestRequest", "C", "(Lzk/f;Lx70/c;)Ljava/lang/Object;", "locale", "Lcom/app/tgtg/model/remote/MyStoreSignupUrlResponse;", "g", "Lcom/app/tgtg/model/remote/user/requests/GetDeliveryInfoRequest;", "itemId", "Lcom/app/tgtg/model/remote/user/response/GetDeliveryInfoResponse;", "u", "(Lcom/app/tgtg/model/remote/user/requests/GetDeliveryInfoRequest;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/user/requests/GetValidUserAddressRequest;", "request", "q", "(Lcom/app/tgtg/model/remote/user/requests/GetValidUserAddressRequest;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/user/requests/GetAddressesRequest;", "countryId", "Lcom/app/tgtg/model/remote/user/response/GetAddressesResponse;", Constants.BRAZE_PUSH_PRIORITY_KEY, "(Lcom/app/tgtg/model/remote/user/requests/GetAddressesRequest;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/user/requests/UpdateAddressRequest;", "updateAddressRequest", "Lcom/app/tgtg/model/remote/user/response/UpdateAddressResponse;", Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, "(Lcom/app/tgtg/model/remote/user/requests/UpdateAddressRequest;Lx70/c;)Ljava/lang/Object;", "userAddressId", "y", "Lcom/app/tgtg/model/remote/user/requests/ValidatePostalCodeRequest;", "validatePostalCodeRequest", "Lcom/app/tgtg/model/remote/user/response/ValidatePostalCodeResponse;", "m", "(Lcom/app/tgtg/model/remote/user/requests/ValidatePostalCodeRequest;Lx70/c;)Ljava/lang/Object;", "Lcom/app/tgtg/model/remote/user/requests/SearchAddressRequest;", "searchAddressRequest", "Lcom/app/tgtg/model/remote/user/response/SearchAddressResponse;", Constants.BRAZE_PUSH_CONTENT_KEY, "(Lcom/app/tgtg/model/remote/user/requests/SearchAddressRequest;Lx70/c;)Ljava/lang/Object;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface o {
    @ra0.o("api/user/v2/confirmEmail/{token}")
    @Nullable
    Object A(@s(encoded = true, value = "token") @NotNull String str, @NotNull x70.c<? super q<? extends r0>> cVar);

    @ra0.o("api/user/v2/update")
    @Nullable
    Object B(@NotNull @ra0.a UserData userData, @NotNull x70.c<? super q<UserData>> cVar);

    @ra0.o("/api/userpointsofinterest/v1/save")
    @Nullable
    Object C(@NotNull @ra0.a zk.f fVar, @NotNull x70.c<? super q<? extends r0>> cVar);

    @ra0.o("api/location/v2/search/address")
    @Nullable
    Object a(@NotNull @ra0.a SearchAddressRequest searchAddressRequest, @NotNull x70.c<? super q<SearchAddressResponse>> cVar);

    @ra0.o("api/user/v2/profileFeature/transition")
    @Nullable
    Object b(@NotNull @ra0.a ProfileStateTransitionRequest profileStateTransitionRequest, @NotNull x70.c<? super q<ProfileFeature>> cVar);

    @ra0.o("api/user/c2c-referral/v1/link")
    @Nullable
    Object c(@NotNull @ra0.a LinkC2CReferralCodeRequest linkC2CReferralCodeRequest, @NotNull x70.c<? super q<? extends r0>> cVar);

    @ra0.o("api/gdpr/v1/{userId}/deleteUser")
    @Nullable
    Object d(@s(encoded = true, value = "userId") @NotNull String str, @NotNull @ra0.a DeleteUserRequest deleteUserRequest, @NotNull x70.c<? super q<? extends r0>> cVar);

    @ra0.o("api/user/v2/dismissProfilePageNotification")
    @Nullable
    Object e(@NotNull x70.c<? super q<? extends r0>> cVar);

    @ra0.o("api/user/v2/dismissProfilePageNewVoucherTooltip")
    @Nullable
    Object f(@NotNull x70.c<? super q<? extends r0>> cVar);

    @ra0.k({"withoutAuthorization: true"})
    @ra0.o("api/app/v2/{locale}/myStoreOnboardingUrl")
    @Nullable
    Object g(@s(encoded = true, value = "locale") @NotNull String str, @NotNull x70.c<? super q<MyStoreSignupUrlResponse>> cVar);

    @ra0.o("api/user/device/v1/setUserDevice")
    @Nullable
    Object h(@NotNull @ra0.a DeviceIdRequest deviceIdRequest, @NotNull x70.c<? super q<? extends r0>> cVar);

    @ra0.o("api/useronboarding/v1/save")
    @Nullable
    Object i(@NotNull @ra0.a OnboardingSurveyRequest onboardingSurveyRequest, @NotNull x70.c<? super q<? extends r0>> cVar);

    @ra0.o("api/user/impact/v2/co2eSaved")
    @Nullable
    Object j(@NotNull x70.c<? super q<Co2eSavedResponse>> cVar);

    @ra0.o("api/gdpr/v1/{userId}/exportUserData")
    @Nullable
    Object k(@s(encoded = true, value = "userId") @NotNull String str, @NotNull @ra0.a ExportUserRequest exportUserRequest, @NotNull x70.c<? super q<? extends r0>> cVar);

    @ra0.o("api/user/v2/getEmailStatus")
    @Nullable
    Object l(@NotNull x70.c<? super q<EmailStatusResponse>> cVar);

    @ra0.o("api/user/v2/catering/validatePostalCode")
    @Nullable
    Object m(@NotNull @ra0.a ValidatePostalCodeRequest validatePostalCodeRequest, @NotNull x70.c<? super q<ValidatePostalCodeResponse>> cVar);

    @ra0.o("api/user/v2/emailChangeRequest")
    @Nullable
    Object n(@NotNull @ra0.a EmailChangeRequest emailChangeRequest, @NotNull x70.c<? super q<? extends r0>> cVar);

    @ra0.o("api/user/v2")
    @Nullable
    Object o(@NotNull x70.c<? super q<UserData>> cVar);

    @ra0.o("api/user/v2/getAddresses")
    @Nullable
    Object p(@NotNull @ra0.a GetAddressesRequest getAddressesRequest, @NotNull x70.c<? super q<GetAddressesResponse>> cVar);

    @ra0.o("api/user/v2/getValidUserAddress")
    @Nullable
    Object q(@NotNull @ra0.a GetValidUserAddressRequest getValidUserAddressRequest, @NotNull x70.c<? super q<GetDeliveryInfoResponse>> cVar);

    @ra0.o("api/user/impact/v2/moneySaved")
    @Nullable
    Object r(@NotNull x70.c<? super q<MoneySavedResponse>> cVar);

    @ra0.o("api/user/v2/updateAddress")
    @Nullable
    Object s(@NotNull @ra0.a UpdateAddressRequest updateAddressRequest, @NotNull x70.c<? super q<UpdateAddressResponse>> cVar);

    @ra0.o("/api/zendesk/auth")
    @Nullable
    Object t(@NotNull x70.c<? super q<JwtTokenResponse>> cVar);

    @ra0.o("api/user/v2/getDeliveryInfo")
    @Nullable
    Object u(@NotNull @ra0.a GetDeliveryInfoRequest getDeliveryInfoRequest, @NotNull x70.c<? super q<GetDeliveryInfoResponse>> cVar);

    @ra0.o("api/user/c2c-referral/v1/details")
    @Nullable
    Object v(@NotNull x70.c<? super q<C2CReferralResponse>> cVar);

    @ra0.o("api/user/v2/profileDetails")
    @Nullable
    Object w(@NotNull x70.c<? super q<ProfileScreenResponse>> cVar);

    @ra0.o("api/user/v2/resendWelcomeEmail")
    @Nullable
    Object x(@NotNull x70.c<? super q<? extends r0>> cVar);

    @ra0.o("api/user/v2/deleteAddress/{userAddressId}")
    @Nullable
    Object y(@s(encoded = true, value = "userAddressId") @Nullable String str, @NotNull x70.c<? super q<? extends r0>> cVar);

    @ra0.o("api/user/v2/profileFeature/dismissNotification")
    @Nullable
    Object z(@NotNull @ra0.a ProfileDismissCardNotificationRequest profileDismissCardNotificationRequest, @NotNull x70.c<? super q<? extends r0>> cVar);
}
