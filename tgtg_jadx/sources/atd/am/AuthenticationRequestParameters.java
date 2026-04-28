package atd.am;

import a80.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/adyen/threeds2/internal/result/AdditionalDetailsField;", "", "identifier", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getIdentifier", "()Ljava/lang/String;", "ERROR_CODE", "ERROR_FIELD", "ADDITIONAL_DETAILS", "SDK_TRANSACTION_IDENTIFIER", "SERVER_TRANSACTION_IDENTIFIER", "ACS_TRANSACTION_IDENTIFIER", "ACS_REFERENCE_NUMBER", "MESSAGE_VERSION", "SDK_VERSION", "PLATFORM", "PLATFORM_VERSION", "DEVICE_MODEL", "VERSION", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AuthenticationRequestParameters {
    private static final /* synthetic */ a $ENTRIES = null;
    private static final /* synthetic */ AuthenticationRequestParameters[] $VALUES;
    private static int AuthenticationRequestParameters = 1;
    private static int getSDKAppID = 1;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;

    @NotNull
    private final String identifier;
    public static final AuthenticationRequestParameters ERROR_CODE = new AuthenticationRequestParameters("ERROR_CODE", 0, "errorCode");
    public static final AuthenticationRequestParameters ERROR_FIELD = new AuthenticationRequestParameters("ERROR_FIELD", 1, "errorField");
    public static final AuthenticationRequestParameters ADDITIONAL_DETAILS = new AuthenticationRequestParameters("ADDITIONAL_DETAILS", 2, "additionalDetails");
    public static final AuthenticationRequestParameters SDK_TRANSACTION_IDENTIFIER = new AuthenticationRequestParameters("SDK_TRANSACTION_IDENTIFIER", 3, "sdkTransactionIdentifier");
    public static final AuthenticationRequestParameters SERVER_TRANSACTION_IDENTIFIER = new AuthenticationRequestParameters("SERVER_TRANSACTION_IDENTIFIER", 4, "serverTransactionIdentifier");
    public static final AuthenticationRequestParameters ACS_TRANSACTION_IDENTIFIER = new AuthenticationRequestParameters("ACS_TRANSACTION_IDENTIFIER", 5, "acsTransactionIdentifier");
    public static final AuthenticationRequestParameters ACS_REFERENCE_NUMBER = new AuthenticationRequestParameters("ACS_REFERENCE_NUMBER", 6, "acsReferenceNumber");
    public static final AuthenticationRequestParameters MESSAGE_VERSION = new AuthenticationRequestParameters("MESSAGE_VERSION", 7, "messageVersion");
    public static final AuthenticationRequestParameters SDK_VERSION = new AuthenticationRequestParameters("SDK_VERSION", 8, "sdkVersion");
    public static final AuthenticationRequestParameters PLATFORM = new AuthenticationRequestParameters("PLATFORM", 9, "platform");
    public static final AuthenticationRequestParameters PLATFORM_VERSION = new AuthenticationRequestParameters("PLATFORM_VERSION", 10, "platformVersion");
    public static final AuthenticationRequestParameters DEVICE_MODEL = new AuthenticationRequestParameters("DEVICE_MODEL", 11, "deviceModel");
    public static final AuthenticationRequestParameters VERSION = new AuthenticationRequestParameters("VERSION", 12, "version");

    static {
        AuthenticationRequestParameters[] sDKReferenceNumber = getSDKReferenceNumber();
        $VALUES = sDKReferenceNumber;
        n.w(sDKReferenceNumber);
        int i11 = getSDKReferenceNumber;
        int i12 = i11 & 71;
        int i13 = (((i11 | 71) & (~i12)) - (~(i12 << 1))) - 1;
        getSDKAppID = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 13 / 0;
        }
    }

    private AuthenticationRequestParameters(String str, int i11, String str2) {
        this.identifier = str2;
    }

    private static final /* synthetic */ AuthenticationRequestParameters[] getSDKReferenceNumber() {
        int i11 = AuthenticationRequestParameters;
        int i12 = ((-2) - (((i11 ^ 38) + ((i11 & 38) << 1)) ^ (-1))) % 128;
        getSDKTransactionID = i12;
        AuthenticationRequestParameters[] authenticationRequestParametersArr = {ERROR_CODE, ERROR_FIELD, ADDITIONAL_DETAILS, SDK_TRANSACTION_IDENTIFIER, SERVER_TRANSACTION_IDENTIFIER, ACS_TRANSACTION_IDENTIFIER, ACS_REFERENCE_NUMBER, MESSAGE_VERSION, SDK_VERSION, PLATFORM, PLATFORM_VERSION, DEVICE_MODEL, VERSION};
        int i13 = i12 & 17;
        int i14 = (i12 | 17) & (~i13);
        int i15 = -(-(i13 << 1));
        AuthenticationRequestParameters = ((i14 & i15) + (i14 | i15)) % 128;
        return authenticationRequestParametersArr;
    }

    public static AuthenticationRequestParameters valueOf(String str) {
        int i11 = AuthenticationRequestParameters;
        int i12 = i11 ^ 65;
        int i13 = ((i11 & 65) | i12) << 1;
        int i14 = -i12;
        getSDKTransactionID = ((i13 & i14) + (i13 | i14)) % 128;
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) Enum.valueOf(AuthenticationRequestParameters.class, str);
        int i15 = getSDKTransactionID;
        int i16 = ((i15 ^ 7) | (i15 & 7)) << 1;
        int i17 = -(((~i15) & 7) | (i15 & (-8)));
        AuthenticationRequestParameters = ((i16 ^ i17) + ((i17 & i16) << 1)) % 128;
        return authenticationRequestParameters;
    }

    public static AuthenticationRequestParameters[] values() {
        int i11 = getSDKTransactionID;
        int i12 = i11 & 53;
        int i13 = (i11 ^ 53) | i12;
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        AuthenticationRequestParameters = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
        AuthenticationRequestParameters[] authenticationRequestParametersArr = (AuthenticationRequestParameters[]) $VALUES.clone();
        int i15 = getSDKTransactionID + 69;
        AuthenticationRequestParameters = i15 % 128;
        if (i15 % 2 != 0) {
            return authenticationRequestParametersArr;
        }
        throw null;
    }

    @NotNull
    public final String getDeviceData() {
        int i11 = (AuthenticationRequestParameters + 107) % 128;
        getSDKTransactionID = i11;
        String str = this.identifier;
        int i12 = i11 & 67;
        int i13 = ((i11 ^ 67) | i12) << 1;
        int i14 = -((i11 | 67) & (~i12));
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        AuthenticationRequestParameters = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = 54 / 0;
        }
        return str;
    }
}
