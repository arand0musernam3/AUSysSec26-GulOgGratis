package atd.am;

import a80.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import r8.k;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\bF\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bH¨\u0006I"}, d2 = {"Lcom/adyen/threeds2/internal/result/ResultCode;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "USER_CANCEL", "TIMEOUT", "MESSAGE_EXTENSION_IS_CRITICAL", "INVALID_MESSAGE_TYPE", "PARSE_MESSAGE_CONTENT_NOT_ENCRYPTED", "POST_ERROR_ESTABLISHING_CONNECTION", "POST_MESSAGE_RESPONSE_TIMEOUT", "MISMATCHING_SDK_TRANSACTION_ID", "MISMATCHING_THREEDS_SERVER_TRANSACTION_ID", "MISMATCHING_ACS_TRANSACTION_ID", "MISMATCHING_MESSAGE_VERSION", "MISMATCHING_COUNTERS", "MESSAGE_FIELD_MISSING_REQUIRED", "MESSAGE_FIELD_EMPTY", "INVALID_ACS_SIGNED_CONTENT", "MESSAGE_FIELD_INVALID_FORMAT", "MESSAGE_FIELD_NOT_BASE64URL_ENCODED", "MESSAGE_ISSUER_IMAGE_NO_DENSITY_PRESENT", "MESSAGE_FIELD_TOO_LONG", "EMPTY_MESSAGE", "INVALID_TRANSACTION_STATUS", "TOO_MANY_MESSAGE_EXTENSIONS", "INVALID_CHALLENGE_TYPE", "PARSE_MESSAGE_DECRYPTION_FAILURE", "PARSE_MESSAGE_INVALID_JSON", "PARSE_MESSAGE_CONTENT_TYPE_MISSING", "JWE_AUTHENTICATION_TAG_NOT_BASE64URL_ENCODED", "JWE_KEY_NOT_BASE64URL_ENCODED", "JWE_PAYLOAD_NOT_BASE64URL_ENCODED", "JWE_HEADER_NOT_BASE64URL_ENCODED", "JWE_INITIALIZATION_VECTOR_NOT_BASE64URL_ENCODED", "JWS_HEADER_NOT_BASE64URL_ENCODED", "JWS_PAYLOAD_NOT_BASE64URL_ENCODED", "JWS_SIGNATURE_NOT_BASE64URL_ENCODED", "PUBLIC_KEY_BASE64_DECODING_FAILURE", "PUBLIC_KEY_JSON_DESERIALIZATION_FAILURE", "PUBLIC_KEY_HANDLING_GENERAL_FAILURE", "ROOT_CERTIFICATES_JWS_VERIFICATION_FAILURE", "ROOT_CERTIFICATES_JWS_PAYLOAD_DESERIALIZATION_FAILURE", "ROOT_CERTIFICATES_GENERATION_FAILURE", "ROOT_CERTIFICATES_HANDLING_GENERAL_FAILURE", "INVALID_MESSAGE_VERSION", "DEVICE_INFORMATION_ENCRYPTION_FAILURE", "SDK_IDENTIFIER_FAILURE", "AUTHENTICATION_REQUEST_PARAMETERS_GENERIC_FAILURE", "CREATE_TRANSACTION_GENERIC_FAILURE", "GENERIC_CRYPTOGRAPHIC_FAILURE", "INITIALIZE_RUNTIME_EXCEPTION", "INITIALIZE_GENERIC_EXCEPTION", "ERROR_MESSAGE_FROM_ACS_OTHER", "ERROR_FROM_ACS_MESSAGE_RECEIVED_INVALID", "ERROR_FROM_ACS_MESSAGE_VERSION_NOT_SUPPORTED", "ERROR_FROM_ACS_DATA_ELEMENT_MISSING", "ERROR_FROM_ACS_MESSAGE_EXTENSION_MISSING", "ERROR_FROM_ACS_DATA_ELEMENT_INVALID_FORMAT", "ERROR_FROM_ACS_DUPLICATE_DATA_ELEMENT", "ERROR_FROM_ACS_TRANSACTION_ID_NOT_RECOGNIZED", "ERROR_FROM_ACS_DATA_DECRYPTION_FAILURE", "ERROR_FROM_ACS_ACCESS_DENIED", "ERROR_FROM_ACS_ISO_CODE_INVALID", "ERROR_FROM_ACS_TRANSACTION_DATA_INVALID", "ERROR_FROM_ACS_TRANSACTION_TIMED_OUT", "ERROR_FROM_ACS_TRANSIENT_SYSTEM_FAILURE", "ERROR_FROM_ACS_PERMANENT_SYSTEM_FAILURE", "ERROR_FROM_ACS_SYSTEM_CONNECTION_FAILURE", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKEphemeralPublicKey {
    private static final /* synthetic */ a $ENTRIES = null;
    private static final /* synthetic */ getSDKEphemeralPublicKey[] $VALUES;
    private static int AuthenticationRequestParameters = 0;
    private static int getSDKAppID = 0;
    private static int getSDKReferenceNumber = 1;
    private static int getSDKTransactionID = 1;

    @NotNull
    private final String code;
    public static final getSDKEphemeralPublicKey USER_CANCEL = new getSDKEphemeralPublicKey("USER_CANCEL", 0, "1001");
    public static final getSDKEphemeralPublicKey TIMEOUT = new getSDKEphemeralPublicKey("TIMEOUT", 1, "1002");
    public static final getSDKEphemeralPublicKey MESSAGE_EXTENSION_IS_CRITICAL = new getSDKEphemeralPublicKey("MESSAGE_EXTENSION_IS_CRITICAL", 2, "1003");
    public static final getSDKEphemeralPublicKey INVALID_MESSAGE_TYPE = new getSDKEphemeralPublicKey("INVALID_MESSAGE_TYPE", 3, "1004");
    public static final getSDKEphemeralPublicKey PARSE_MESSAGE_CONTENT_NOT_ENCRYPTED = new getSDKEphemeralPublicKey("PARSE_MESSAGE_CONTENT_NOT_ENCRYPTED", 4, "1005");
    public static final getSDKEphemeralPublicKey POST_ERROR_ESTABLISHING_CONNECTION = new getSDKEphemeralPublicKey("POST_ERROR_ESTABLISHING_CONNECTION", 5, "1006");
    public static final getSDKEphemeralPublicKey POST_MESSAGE_RESPONSE_TIMEOUT = new getSDKEphemeralPublicKey("POST_MESSAGE_RESPONSE_TIMEOUT", 6, "1007");
    public static final getSDKEphemeralPublicKey MISMATCHING_SDK_TRANSACTION_ID = new getSDKEphemeralPublicKey("MISMATCHING_SDK_TRANSACTION_ID", 7, "1008");
    public static final getSDKEphemeralPublicKey MISMATCHING_THREEDS_SERVER_TRANSACTION_ID = new getSDKEphemeralPublicKey("MISMATCHING_THREEDS_SERVER_TRANSACTION_ID", 8, "1009");
    public static final getSDKEphemeralPublicKey MISMATCHING_ACS_TRANSACTION_ID = new getSDKEphemeralPublicKey("MISMATCHING_ACS_TRANSACTION_ID", 9, "1010");
    public static final getSDKEphemeralPublicKey MISMATCHING_MESSAGE_VERSION = new getSDKEphemeralPublicKey("MISMATCHING_MESSAGE_VERSION", 10, "1011");
    public static final getSDKEphemeralPublicKey MISMATCHING_COUNTERS = new getSDKEphemeralPublicKey("MISMATCHING_COUNTERS", 11, "1012");
    public static final getSDKEphemeralPublicKey MESSAGE_FIELD_MISSING_REQUIRED = new getSDKEphemeralPublicKey("MESSAGE_FIELD_MISSING_REQUIRED", 12, "1013");
    public static final getSDKEphemeralPublicKey MESSAGE_FIELD_EMPTY = new getSDKEphemeralPublicKey("MESSAGE_FIELD_EMPTY", 13, "1014");
    public static final getSDKEphemeralPublicKey INVALID_ACS_SIGNED_CONTENT = new getSDKEphemeralPublicKey("INVALID_ACS_SIGNED_CONTENT", 14, "1016");
    public static final getSDKEphemeralPublicKey MESSAGE_FIELD_INVALID_FORMAT = new getSDKEphemeralPublicKey("MESSAGE_FIELD_INVALID_FORMAT", 15, "2101");
    public static final getSDKEphemeralPublicKey MESSAGE_FIELD_NOT_BASE64URL_ENCODED = new getSDKEphemeralPublicKey("MESSAGE_FIELD_NOT_BASE64URL_ENCODED", 16, "2102");
    public static final getSDKEphemeralPublicKey MESSAGE_ISSUER_IMAGE_NO_DENSITY_PRESENT = new getSDKEphemeralPublicKey("MESSAGE_ISSUER_IMAGE_NO_DENSITY_PRESENT", 17, "2103");
    public static final getSDKEphemeralPublicKey MESSAGE_FIELD_TOO_LONG = new getSDKEphemeralPublicKey("MESSAGE_FIELD_TOO_LONG", 18, "2104");
    public static final getSDKEphemeralPublicKey EMPTY_MESSAGE = new getSDKEphemeralPublicKey("EMPTY_MESSAGE", 19, "2105");
    public static final getSDKEphemeralPublicKey INVALID_TRANSACTION_STATUS = new getSDKEphemeralPublicKey("INVALID_TRANSACTION_STATUS", 20, "2106");
    public static final getSDKEphemeralPublicKey TOO_MANY_MESSAGE_EXTENSIONS = new getSDKEphemeralPublicKey("TOO_MANY_MESSAGE_EXTENSIONS", 21, "2107");
    public static final getSDKEphemeralPublicKey INVALID_CHALLENGE_TYPE = new getSDKEphemeralPublicKey("INVALID_CHALLENGE_TYPE", 22, "2108");
    public static final getSDKEphemeralPublicKey PARSE_MESSAGE_DECRYPTION_FAILURE = new getSDKEphemeralPublicKey("PARSE_MESSAGE_DECRYPTION_FAILURE", 23, "2201");
    public static final getSDKEphemeralPublicKey PARSE_MESSAGE_INVALID_JSON = new getSDKEphemeralPublicKey("PARSE_MESSAGE_INVALID_JSON", 24, "2202");
    public static final getSDKEphemeralPublicKey PARSE_MESSAGE_CONTENT_TYPE_MISSING = new getSDKEphemeralPublicKey("PARSE_MESSAGE_CONTENT_TYPE_MISSING", 25, "2203");
    public static final getSDKEphemeralPublicKey JWE_AUTHENTICATION_TAG_NOT_BASE64URL_ENCODED = new getSDKEphemeralPublicKey("JWE_AUTHENTICATION_TAG_NOT_BASE64URL_ENCODED", 26, "2301");
    public static final getSDKEphemeralPublicKey JWE_KEY_NOT_BASE64URL_ENCODED = new getSDKEphemeralPublicKey("JWE_KEY_NOT_BASE64URL_ENCODED", 27, "2302");
    public static final getSDKEphemeralPublicKey JWE_PAYLOAD_NOT_BASE64URL_ENCODED = new getSDKEphemeralPublicKey("JWE_PAYLOAD_NOT_BASE64URL_ENCODED", 28, "2303");
    public static final getSDKEphemeralPublicKey JWE_HEADER_NOT_BASE64URL_ENCODED = new getSDKEphemeralPublicKey("JWE_HEADER_NOT_BASE64URL_ENCODED", 29, "2304");
    public static final getSDKEphemeralPublicKey JWE_INITIALIZATION_VECTOR_NOT_BASE64URL_ENCODED = new getSDKEphemeralPublicKey("JWE_INITIALIZATION_VECTOR_NOT_BASE64URL_ENCODED", 30, "2305");
    public static final getSDKEphemeralPublicKey JWS_HEADER_NOT_BASE64URL_ENCODED = new getSDKEphemeralPublicKey("JWS_HEADER_NOT_BASE64URL_ENCODED", 31, "2306");
    public static final getSDKEphemeralPublicKey JWS_PAYLOAD_NOT_BASE64URL_ENCODED = new getSDKEphemeralPublicKey("JWS_PAYLOAD_NOT_BASE64URL_ENCODED", 32, "2307");
    public static final getSDKEphemeralPublicKey JWS_SIGNATURE_NOT_BASE64URL_ENCODED = new getSDKEphemeralPublicKey("JWS_SIGNATURE_NOT_BASE64URL_ENCODED", 33, "2308");
    public static final getSDKEphemeralPublicKey PUBLIC_KEY_BASE64_DECODING_FAILURE = new getSDKEphemeralPublicKey("PUBLIC_KEY_BASE64_DECODING_FAILURE", 34, "2401");
    public static final getSDKEphemeralPublicKey PUBLIC_KEY_JSON_DESERIALIZATION_FAILURE = new getSDKEphemeralPublicKey("PUBLIC_KEY_JSON_DESERIALIZATION_FAILURE", 35, "2402");
    public static final getSDKEphemeralPublicKey PUBLIC_KEY_HANDLING_GENERAL_FAILURE = new getSDKEphemeralPublicKey("PUBLIC_KEY_HANDLING_GENERAL_FAILURE", 36, "2403");
    public static final getSDKEphemeralPublicKey ROOT_CERTIFICATES_JWS_VERIFICATION_FAILURE = new getSDKEphemeralPublicKey("ROOT_CERTIFICATES_JWS_VERIFICATION_FAILURE", 37, "2404");
    public static final getSDKEphemeralPublicKey ROOT_CERTIFICATES_JWS_PAYLOAD_DESERIALIZATION_FAILURE = new getSDKEphemeralPublicKey("ROOT_CERTIFICATES_JWS_PAYLOAD_DESERIALIZATION_FAILURE", 38, "2405");
    public static final getSDKEphemeralPublicKey ROOT_CERTIFICATES_GENERATION_FAILURE = new getSDKEphemeralPublicKey("ROOT_CERTIFICATES_GENERATION_FAILURE", 39, "2406");
    public static final getSDKEphemeralPublicKey ROOT_CERTIFICATES_HANDLING_GENERAL_FAILURE = new getSDKEphemeralPublicKey("ROOT_CERTIFICATES_HANDLING_GENERAL_FAILURE", 40, "2407");
    public static final getSDKEphemeralPublicKey INVALID_MESSAGE_VERSION = new getSDKEphemeralPublicKey("INVALID_MESSAGE_VERSION", 41, "2408");
    public static final getSDKEphemeralPublicKey DEVICE_INFORMATION_ENCRYPTION_FAILURE = new getSDKEphemeralPublicKey("DEVICE_INFORMATION_ENCRYPTION_FAILURE", 42, "2409");
    public static final getSDKEphemeralPublicKey SDK_IDENTIFIER_FAILURE = new getSDKEphemeralPublicKey("SDK_IDENTIFIER_FAILURE", 43, "2410");
    public static final getSDKEphemeralPublicKey AUTHENTICATION_REQUEST_PARAMETERS_GENERIC_FAILURE = new getSDKEphemeralPublicKey("AUTHENTICATION_REQUEST_PARAMETERS_GENERIC_FAILURE", 44, "2411");
    public static final getSDKEphemeralPublicKey CREATE_TRANSACTION_GENERIC_FAILURE = new getSDKEphemeralPublicKey("CREATE_TRANSACTION_GENERIC_FAILURE", 45, "2412");
    public static final getSDKEphemeralPublicKey GENERIC_CRYPTOGRAPHIC_FAILURE = new getSDKEphemeralPublicKey("GENERIC_CRYPTOGRAPHIC_FAILURE", 46, "2413");
    public static final getSDKEphemeralPublicKey INITIALIZE_RUNTIME_EXCEPTION = new getSDKEphemeralPublicKey("INITIALIZE_RUNTIME_EXCEPTION", 47, "2501");
    public static final getSDKEphemeralPublicKey INITIALIZE_GENERIC_EXCEPTION = new getSDKEphemeralPublicKey("INITIALIZE_GENERIC_EXCEPTION", 48, "2502");
    public static final getSDKEphemeralPublicKey ERROR_MESSAGE_FROM_ACS_OTHER = new getSDKEphemeralPublicKey("ERROR_MESSAGE_FROM_ACS_OTHER", 49, "4001");
    public static final getSDKEphemeralPublicKey ERROR_FROM_ACS_MESSAGE_RECEIVED_INVALID = new getSDKEphemeralPublicKey("ERROR_FROM_ACS_MESSAGE_RECEIVED_INVALID", 50, "4101");
    public static final getSDKEphemeralPublicKey ERROR_FROM_ACS_MESSAGE_VERSION_NOT_SUPPORTED = new getSDKEphemeralPublicKey("ERROR_FROM_ACS_MESSAGE_VERSION_NOT_SUPPORTED", 51, "4102");
    public static final getSDKEphemeralPublicKey ERROR_FROM_ACS_DATA_ELEMENT_MISSING = new getSDKEphemeralPublicKey("ERROR_FROM_ACS_DATA_ELEMENT_MISSING", 52, "4201");
    public static final getSDKEphemeralPublicKey ERROR_FROM_ACS_MESSAGE_EXTENSION_MISSING = new getSDKEphemeralPublicKey("ERROR_FROM_ACS_MESSAGE_EXTENSION_MISSING", 53, "4202");
    public static final getSDKEphemeralPublicKey ERROR_FROM_ACS_DATA_ELEMENT_INVALID_FORMAT = new getSDKEphemeralPublicKey("ERROR_FROM_ACS_DATA_ELEMENT_INVALID_FORMAT", 54, "4203");
    public static final getSDKEphemeralPublicKey ERROR_FROM_ACS_DUPLICATE_DATA_ELEMENT = new getSDKEphemeralPublicKey("ERROR_FROM_ACS_DUPLICATE_DATA_ELEMENT", 55, "4204");
    public static final getSDKEphemeralPublicKey ERROR_FROM_ACS_TRANSACTION_ID_NOT_RECOGNIZED = new getSDKEphemeralPublicKey("ERROR_FROM_ACS_TRANSACTION_ID_NOT_RECOGNIZED", 56, "4301");
    public static final getSDKEphemeralPublicKey ERROR_FROM_ACS_DATA_DECRYPTION_FAILURE = new getSDKEphemeralPublicKey("ERROR_FROM_ACS_DATA_DECRYPTION_FAILURE", 57, "4302");
    public static final getSDKEphemeralPublicKey ERROR_FROM_ACS_ACCESS_DENIED = new getSDKEphemeralPublicKey("ERROR_FROM_ACS_ACCESS_DENIED", 58, "4303");
    public static final getSDKEphemeralPublicKey ERROR_FROM_ACS_ISO_CODE_INVALID = new getSDKEphemeralPublicKey("ERROR_FROM_ACS_ISO_CODE_INVALID", 59, "4304");
    public static final getSDKEphemeralPublicKey ERROR_FROM_ACS_TRANSACTION_DATA_INVALID = new getSDKEphemeralPublicKey("ERROR_FROM_ACS_TRANSACTION_DATA_INVALID", 60, "4305");
    public static final getSDKEphemeralPublicKey ERROR_FROM_ACS_TRANSACTION_TIMED_OUT = new getSDKEphemeralPublicKey("ERROR_FROM_ACS_TRANSACTION_TIMED_OUT", 61, "4402");
    public static final getSDKEphemeralPublicKey ERROR_FROM_ACS_TRANSIENT_SYSTEM_FAILURE = new getSDKEphemeralPublicKey("ERROR_FROM_ACS_TRANSIENT_SYSTEM_FAILURE", 62, "4403");
    public static final getSDKEphemeralPublicKey ERROR_FROM_ACS_PERMANENT_SYSTEM_FAILURE = new getSDKEphemeralPublicKey("ERROR_FROM_ACS_PERMANENT_SYSTEM_FAILURE", 63, "4404");
    public static final getSDKEphemeralPublicKey ERROR_FROM_ACS_SYSTEM_CONNECTION_FAILURE = new getSDKEphemeralPublicKey("ERROR_FROM_ACS_SYSTEM_CONNECTION_FAILURE", 64, "4405");

    static {
        getSDKEphemeralPublicKey[] sDKReferenceNumber = getSDKReferenceNumber();
        $VALUES = sDKReferenceNumber;
        n.w(sDKReferenceNumber);
        int i11 = getSDKAppID;
        getSDKReferenceNumber = ((-2) - (((i11 ^ 70) + ((i11 & 70) << 1)) ^ (-1))) % 128;
    }

    private getSDKEphemeralPublicKey(String str, int i11, String str2) {
        this.code = str2;
    }

    private static final /* synthetic */ getSDKEphemeralPublicKey[] getSDKReferenceNumber() {
        int i11 = AuthenticationRequestParameters;
        int i12 = i11 & 13;
        int i13 = (i12 + ((i11 ^ 13) | i12)) % 128;
        getSDKTransactionID = i13;
        getSDKEphemeralPublicKey[] getsdkephemeralpublickeyArr = {USER_CANCEL, TIMEOUT, MESSAGE_EXTENSION_IS_CRITICAL, INVALID_MESSAGE_TYPE, PARSE_MESSAGE_CONTENT_NOT_ENCRYPTED, POST_ERROR_ESTABLISHING_CONNECTION, POST_MESSAGE_RESPONSE_TIMEOUT, MISMATCHING_SDK_TRANSACTION_ID, MISMATCHING_THREEDS_SERVER_TRANSACTION_ID, MISMATCHING_ACS_TRANSACTION_ID, MISMATCHING_MESSAGE_VERSION, MISMATCHING_COUNTERS, MESSAGE_FIELD_MISSING_REQUIRED, MESSAGE_FIELD_EMPTY, INVALID_ACS_SIGNED_CONTENT, MESSAGE_FIELD_INVALID_FORMAT, MESSAGE_FIELD_NOT_BASE64URL_ENCODED, MESSAGE_ISSUER_IMAGE_NO_DENSITY_PRESENT, MESSAGE_FIELD_TOO_LONG, EMPTY_MESSAGE, INVALID_TRANSACTION_STATUS, TOO_MANY_MESSAGE_EXTENSIONS, INVALID_CHALLENGE_TYPE, PARSE_MESSAGE_DECRYPTION_FAILURE, PARSE_MESSAGE_INVALID_JSON, PARSE_MESSAGE_CONTENT_TYPE_MISSING, JWE_AUTHENTICATION_TAG_NOT_BASE64URL_ENCODED, JWE_KEY_NOT_BASE64URL_ENCODED, JWE_PAYLOAD_NOT_BASE64URL_ENCODED, JWE_HEADER_NOT_BASE64URL_ENCODED, JWE_INITIALIZATION_VECTOR_NOT_BASE64URL_ENCODED, JWS_HEADER_NOT_BASE64URL_ENCODED, JWS_PAYLOAD_NOT_BASE64URL_ENCODED, JWS_SIGNATURE_NOT_BASE64URL_ENCODED, PUBLIC_KEY_BASE64_DECODING_FAILURE, PUBLIC_KEY_JSON_DESERIALIZATION_FAILURE, PUBLIC_KEY_HANDLING_GENERAL_FAILURE, ROOT_CERTIFICATES_JWS_VERIFICATION_FAILURE, ROOT_CERTIFICATES_JWS_PAYLOAD_DESERIALIZATION_FAILURE, ROOT_CERTIFICATES_GENERATION_FAILURE, ROOT_CERTIFICATES_HANDLING_GENERAL_FAILURE, INVALID_MESSAGE_VERSION, DEVICE_INFORMATION_ENCRYPTION_FAILURE, SDK_IDENTIFIER_FAILURE, AUTHENTICATION_REQUEST_PARAMETERS_GENERIC_FAILURE, CREATE_TRANSACTION_GENERIC_FAILURE, GENERIC_CRYPTOGRAPHIC_FAILURE, INITIALIZE_RUNTIME_EXCEPTION, INITIALIZE_GENERIC_EXCEPTION, ERROR_MESSAGE_FROM_ACS_OTHER, ERROR_FROM_ACS_MESSAGE_RECEIVED_INVALID, ERROR_FROM_ACS_MESSAGE_VERSION_NOT_SUPPORTED, ERROR_FROM_ACS_DATA_ELEMENT_MISSING, ERROR_FROM_ACS_MESSAGE_EXTENSION_MISSING, ERROR_FROM_ACS_DATA_ELEMENT_INVALID_FORMAT, ERROR_FROM_ACS_DUPLICATE_DATA_ELEMENT, ERROR_FROM_ACS_TRANSACTION_ID_NOT_RECOGNIZED, ERROR_FROM_ACS_DATA_DECRYPTION_FAILURE, ERROR_FROM_ACS_ACCESS_DENIED, ERROR_FROM_ACS_ISO_CODE_INVALID, ERROR_FROM_ACS_TRANSACTION_DATA_INVALID, ERROR_FROM_ACS_TRANSACTION_TIMED_OUT, ERROR_FROM_ACS_TRANSIENT_SYSTEM_FAILURE, ERROR_FROM_ACS_PERMANENT_SYSTEM_FAILURE, ERROR_FROM_ACS_SYSTEM_CONNECTION_FAILURE};
        int i14 = i13 | 111;
        int i15 = i14 << 1;
        int i16 = -((~(i13 & 111)) & i14);
        AuthenticationRequestParameters = (((i15 | i16) << 1) - (i16 ^ i15)) % 128;
        return getsdkephemeralpublickeyArr;
    }

    public static getSDKEphemeralPublicKey valueOf(String str) {
        getSDKTransactionID = (AuthenticationRequestParameters + 1) % 128;
        getSDKEphemeralPublicKey getsdkephemeralpublickey = (getSDKEphemeralPublicKey) Enum.valueOf(getSDKEphemeralPublicKey.class, str);
        int i11 = AuthenticationRequestParameters;
        int i12 = i11 & 121;
        int i13 = i12 + ((i11 ^ 121) | i12);
        getSDKTransactionID = i13 % 128;
        if (i13 % 2 != 0) {
            return getsdkephemeralpublickey;
        }
        throw null;
    }

    public static getSDKEphemeralPublicKey[] values() {
        AuthenticationRequestParameters = ((-2) - ((getSDKTransactionID + 98) ^ (-1))) % 128;
        getSDKEphemeralPublicKey[] getsdkephemeralpublickeyArr = (getSDKEphemeralPublicKey[]) $VALUES.clone();
        int i11 = getSDKTransactionID;
        AuthenticationRequestParameters = k.c(i11 & 114, i11 | 114, 1, 128);
        return getsdkephemeralpublickeyArr;
    }

    @NotNull
    public final String getSDKAppID() {
        int i11 = AuthenticationRequestParameters;
        int i12 = i11 & 27;
        int i13 = (i12 + ((i11 ^ 27) | i12)) % 128;
        getSDKTransactionID = i13;
        String str = this.code;
        int i14 = ((i13 ^ 90) + ((i13 & 90) << 1)) - 1;
        AuthenticationRequestParameters = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 2 / 0;
        }
        return str;
    }
}
