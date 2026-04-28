package com.app.tgtg.model.local;

import com.adyen.checkout.core.Environment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mv.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001dX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001dX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001dX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u001dX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u001dX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u001dX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u001dX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u001dX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u001dX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u001dX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u001dX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u001dX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u001dX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u001dX\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u001dX\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u001dX\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u001dX\u0086T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u001dX\u0086T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u001dX\u0086T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u001dX\u0086T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u001dX\u0086T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u001dX\u0086T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u001dX\u0086T¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u001dX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u001dX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010B\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0011\u0010E\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bF\u0010DR\u0011\u0010G\u001a\u00020H8F¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0011\u0010K\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0011\u0010N\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bO\u0010DR\u0011\u0010P\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bQ\u0010DR\u000e\u0010R\u001a\u00020SX\u0086T¢\u0006\u0002\n\u0000¨\u0006T"}, d2 = {"Lcom/app/tgtg/model/local/AppConstants;", "", "<init>", "()V", "STORE_ONBOARDING_URL", "", "ADYEN3DS2_APP_URL", "RETURN_URL_ITEMVIEW_SATISPAY", "RETURN_URL_PARCELBASKET_SATISPAY", "RETURN_URL_MANUFACTURE_SATISPAY", "RETURN_URL_CATERING_SATISPAY", "RETURN_URL_ITEMVIEW_ADYEN", "RETURN_URL_PARCELBASKET_ADYEN", "RETURN_URL_MANUFACTURE_ADYEN", "RETURN_URL_CATERING_ADYEN", "RETURN_URL_CHARITY", "SHARE_URL", "SHARE_URL_ITEM_VIEW", "SHARE_C2C_REFERRAL_CODE_PREFIX", "DELEGATE_COLLECTION_LINK_FORMAT", "PREFS_CURRENT_LOGIN_NAME_PARAM", "PREFS_USER_DATA_NAME_PARAM", "PREFS_APP_DATA_NAME_PARAM", "STRING_SERIALIZER", "RESULT_PAYMENT_EXPIRED", "RESULT_CARD_NOT_SUPPORTED", "RESULT_TIME_OUT", "RESULT_DECLINED", "GPS_SETTINGS", "", "GPS_SETTINGS_ENABLED", "GO_TO_GPS_SETTINGS", "REQUEST_CODE_ORDER_VIEW", "RESULT_CODE_ORDER_CANCELLED", "RESULT_CODE_ORDER_RATED", "RESULT_CODE_ORDER_COLLECTED", "RESULT_CODE_ORDER_NOT_COLLECTED", "RESULT_CODE_FLASH_SALES_SURVEY", "LOCATION_PICKER_YOUR_LOCATION", "LOCATION_PICKER_SELECTED_LOCATION", "LOCATION_PICKER_NO_SELECTED_LOCATION", "BLOCK_MESSAGE_REQUEST_CODE", "REQUEST_CODE_CONTACT_US", "RESULT_CODE_SUPPORT_MSG_SENT", "RESULT_CODE_AUTO_REFUND", "CONTACT_US_RESULT_UPDATE_EMAIL", "CONTACT_US_REQUEST_FILE", "REQUEST_CODE_TRACKING_CONSENT", "REQUEST_CODE_FILTER", "REQUEST_CODE_ITEM_VIEW", "REQUEST_CODE_STORE_SIGNUP", "REQUEST_CODE_HELP_CENTER", "STATUS_CODE_UNAUTHORIZED", "STATUS_CODE_FORBIDDEN", "STATUS_CODE_BAD_REQUEST", "STATUS_CODE_SUCCESS", "PERMISSIONS_REQUEST_CALL_PHONE", "PERMISSIONS_REQUEST_USE_LOCATION", "REQUEST_CODE_GOOGLE_PLAY_SERVICE", "FACEBOOK_ID", "FACEBOOK_ID_TEST", "FACEBOOK_CLIENT_TOKEN", "FACEBOOK_CLIENT_TOKEN_TEST", "DATADOM_SDK_KEY", "ADYEN_PUBLIC_KEY_TEST", "ADYEN_PUBLIC_KEY_PROD", "datadomSdkkey", "getDatadomSdkkey", "()Ljava/lang/String;", "adyenClientKey", "getAdyenClientKey", "adyenEnvironment", "Lcom/adyen/checkout/core/Environment;", "getAdyenEnvironment", "()Lcom/adyen/checkout/core/Environment;", "googlePayEnvironment", "getGooglePayEnvironment", "()I", "facebookId", "getFacebookId", "facebookClientToken", "getFacebookClientToken", "DELAY_BEFORE_SHOWING_LOADER", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AppConstants {
    public static final int $stable = 0;

    @NotNull
    public static final String ADYEN3DS2_APP_URL = "https://share.toogoodtogo.com/adyen3ds2";

    @NotNull
    private static final String ADYEN_PUBLIC_KEY_PROD = "live_VPX45BIMLFAIVARYVKEDNC7OXIFBRQZ5";

    @NotNull
    private static final String ADYEN_PUBLIC_KEY_TEST = "test_FAS7EAPMKFFXJLZZRFDEWANMDQSIAQ64";
    public static final int BLOCK_MESSAGE_REQUEST_CODE = 911;
    public static final int CONTACT_US_REQUEST_FILE = 148;
    public static final int CONTACT_US_RESULT_UPDATE_EMAIL = 1004;

    @NotNull
    private static final String DATADOM_SDK_KEY = "1D42C2CA6131C526E09F294FE96F94";
    public static final long DELAY_BEFORE_SHOWING_LOADER = 800;

    @NotNull
    public static final String DELEGATE_COLLECTION_LINK_FORMAT = "https://share.toogoodtogo.com/invitation/order/%s";

    @NotNull
    private static final String FACEBOOK_CLIENT_TOKEN = "6aee551064c356226f35160a52309f6a";

    @NotNull
    private static final String FACEBOOK_CLIENT_TOKEN_TEST = "35e970f0a908c32db648de14206bb7bd";

    @NotNull
    private static final String FACEBOOK_ID = "184721518527049";

    @NotNull
    private static final String FACEBOOK_ID_TEST = "458797431119455";
    public static final int GO_TO_GPS_SETTINGS = 223;
    public static final int GPS_SETTINGS = 222;
    public static final int GPS_SETTINGS_ENABLED = -1;

    @NotNull
    public static final AppConstants INSTANCE = new AppConstants();

    @NotNull
    public static final String LOCATION_PICKER_NO_SELECTED_LOCATION = "No selected location";

    @NotNull
    public static final String LOCATION_PICKER_SELECTED_LOCATION = "Selected location";

    @NotNull
    public static final String LOCATION_PICKER_YOUR_LOCATION = "Your location";
    public static final int PERMISSIONS_REQUEST_CALL_PHONE = 202;
    public static final int PERMISSIONS_REQUEST_USE_LOCATION = 201;

    @NotNull
    public static final String PREFS_APP_DATA_NAME_PARAM = "TGTGas.PREF";

    @NotNull
    public static final String PREFS_CURRENT_LOGIN_NAME_PARAM = "TGTG.PREF";

    @NotNull
    public static final String PREFS_USER_DATA_NAME_PARAM = "TGTGp.PREF";
    public static final int REQUEST_CODE_CONTACT_US = 1000;
    public static final int REQUEST_CODE_FILTER = 654;
    public static final int REQUEST_CODE_GOOGLE_PLAY_SERVICE = 400;
    public static final int REQUEST_CODE_HELP_CENTER = 720;
    public static final int REQUEST_CODE_ITEM_VIEW = 701;
    public static final int REQUEST_CODE_ORDER_VIEW = 333;
    public static final int REQUEST_CODE_STORE_SIGNUP = 710;
    public static final int REQUEST_CODE_TRACKING_CONSENT = 1100;

    @NotNull
    public static final String RESULT_CARD_NOT_SUPPORTED = "CARD_NOT_SUPPORTED";
    public static final int RESULT_CODE_AUTO_REFUND = 1002;
    public static final int RESULT_CODE_FLASH_SALES_SURVEY = 132;
    public static final int RESULT_CODE_ORDER_CANCELLED = 123;
    public static final int RESULT_CODE_ORDER_COLLECTED = 130;
    public static final int RESULT_CODE_ORDER_NOT_COLLECTED = 131;
    public static final int RESULT_CODE_ORDER_RATED = 128;
    public static final int RESULT_CODE_SUPPORT_MSG_SENT = 1001;

    @NotNull
    public static final String RESULT_DECLINED = "DECLINED";

    @NotNull
    public static final String RESULT_PAYMENT_EXPIRED = "PAYMENT_METHOD_EXPIRED";

    @NotNull
    public static final String RESULT_TIME_OUT = "TIME_OUT";

    @NotNull
    public static final String RETURN_URL_CATERING_ADYEN = "adyencheckout://com.app.tgtg.catering";

    @NotNull
    public static final String RETURN_URL_CATERING_SATISPAY = "https://share.toogoodtogo.com/payments/catering";

    @NotNull
    public static final String RETURN_URL_CHARITY = "https://charity.toogoodtogo.com/post_purchase";

    @NotNull
    public static final String RETURN_URL_ITEMVIEW_ADYEN = "adyencheckout://com.app.tgtg.itemview";

    @NotNull
    public static final String RETURN_URL_ITEMVIEW_SATISPAY = "https://share.toogoodtogo.com/payments/itemview";

    @NotNull
    public static final String RETURN_URL_MANUFACTURE_ADYEN = "adyencheckout://com.app.tgtg.manufacture";

    @NotNull
    public static final String RETURN_URL_MANUFACTURE_SATISPAY = "https://share.toogoodtogo.com/payments/manufacture";

    @NotNull
    public static final String RETURN_URL_PARCELBASKET_ADYEN = "adyencheckout://com.app.tgtg.parcelbasket";

    @NotNull
    public static final String RETURN_URL_PARCELBASKET_SATISPAY = "https://share.toogoodtogo.com/payments/parcelbasket";

    @NotNull
    public static final String SHARE_C2C_REFERRAL_CODE_PREFIX = "https://share.toogoodtogo.com/c2c/referral-code/";

    @NotNull
    public static final String SHARE_URL = "https://share.toogoodtogo.com/";

    @NotNull
    public static final String SHARE_URL_ITEM_VIEW = "https://share.toogoodtogo.com/item/";
    public static final int STATUS_CODE_BAD_REQUEST = 400;
    public static final int STATUS_CODE_FORBIDDEN = 403;
    public static final int STATUS_CODE_SUCCESS = 1;
    public static final int STATUS_CODE_UNAUTHORIZED = 401;

    @NotNull
    public static final String STORE_ONBOARDING_URL = "https://store.toogoodtogo.com/onboarding/inbound";

    @NotNull
    public static final String STRING_SERIALIZER = "kotlinx.serialization.LongAsStringSerializer";

    private AppConstants() {
    }

    @NotNull
    public final String getAdyenClientKey() {
        b bVar = b.f30149d;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("instance");
            bVar = null;
        }
        return bVar.f30152c.getProduction() ? ADYEN_PUBLIC_KEY_PROD : ADYEN_PUBLIC_KEY_TEST;
    }

    @NotNull
    public final Environment getAdyenEnvironment() {
        b bVar = b.f30149d;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("instance");
            bVar = null;
        }
        return bVar.f30152c.getProduction() ? Environment.EUROPE : Environment.TEST;
    }

    @NotNull
    public final String getDatadomSdkkey() {
        return DATADOM_SDK_KEY;
    }

    @NotNull
    public final String getFacebookClientToken() {
        b bVar = b.f30149d;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("instance");
            bVar = null;
        }
        return bVar.f30152c.getProduction() ? FACEBOOK_CLIENT_TOKEN : FACEBOOK_CLIENT_TOKEN_TEST;
    }

    @NotNull
    public final String getFacebookId() {
        b bVar = b.f30149d;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("instance");
            bVar = null;
        }
        return bVar.f30152c.getProduction() ? FACEBOOK_ID : FACEBOOK_ID_TEST;
    }

    public final int getGooglePayEnvironment() {
        b bVar = b.f30149d;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("instance");
            bVar = null;
        }
        return bVar.f30152c.getProduction() ? 1 : 3;
    }
}
