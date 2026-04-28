package atd.am;

import a80.a;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v0.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b5\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7¨\u00068"}, d2 = {"Lcom/adyen/threeds2/internal/result/MessageField;", "", "identifier", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getIdentifier", "()Ljava/lang/String;", "NONE", "MESSAGE_TYPE", "MESSAGE_VERSION", "ACS_TRANSACTION_ID", "THREEDS_SERVER_TRANSACTION_ID", "SDK_TRANSACTION_ID", "THREEDS_REQUESTOR_APP_URL", "SDK_COUNTER_A_TO_S", "ACS_COUNTER_A_TO_S", "ACS_UI_TYPE", "TRANSACTION_STATUS", "CHALLENGE_COMPLETION_INDICATOR", "ACS_HTML", "ACS_HTML_REFRESH", "CHALLENGE_INFO_HEADER", "CHALLENGE_INFO_TEXT", "CHALLENGE_INFO_LABEL", "CHALLENGE_INFO_TEXT_INDICATOR", "RESEND_INFO_LABEL", "WHY_INFO_LABEL", "WHY_INFO_TEXT", "EXPAND_INFO_LABEL", "EXPAND_INFO_TEXT", "ISSUER_IMAGE", "ISSUER_IMAGE_MEDIUM", "ISSUER_IMAGE_HIGH", "ISSUER_IMAGE_EXTRA_HIGH", "PS_IMAGE", "WHITELISTING_INFO_TEXT", "WHITELISTING_DATA_ENTRY", "SUBMIT_AUTHENTICATION_LABEL", "CHALLENGE_ADD_INFO", "OOB_CONTINUE_LABEL", "OOP_APP_LABEL", "OOB_APP_URL", "CHALLENGE_SELECT_INFO", "MESSAGE_EXTENSION", "MESSAGE_EXTENSION_NAME", "MESSAGE_EXTENSION_ID", "MESSAGE_EXTENSION_CRITICALITY_INDICATOR", "MESSAGE_EXTENSION_DATA", "MESSAGE_EXTENSION_VERSION", "MESSAGE_EXTENSION_CHALLENGE_DATA", "ERROR_CODE", "ERROR_COMPONENT", "ERROR_DESCRIPTION", "ERROR_DETAIL", "ERROR_MESSAGE_TYPE", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKReferenceNumber {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ a $ENTRIES = null;
    private static final /* synthetic */ getSDKReferenceNumber[] $VALUES;
    public static final getSDKReferenceNumber ACS_COUNTER_A_TO_S;
    public static final getSDKReferenceNumber ACS_HTML;
    public static final getSDKReferenceNumber ACS_HTML_REFRESH;
    public static final getSDKReferenceNumber ACS_TRANSACTION_ID;
    public static final getSDKReferenceNumber ACS_UI_TYPE;
    private static int AuthenticationRequestParameters;
    public static final getSDKReferenceNumber CHALLENGE_ADD_INFO;
    public static final getSDKReferenceNumber CHALLENGE_COMPLETION_INDICATOR;
    public static final getSDKReferenceNumber CHALLENGE_INFO_HEADER;
    public static final getSDKReferenceNumber CHALLENGE_INFO_LABEL;
    public static final getSDKReferenceNumber CHALLENGE_INFO_TEXT;
    public static final getSDKReferenceNumber CHALLENGE_INFO_TEXT_INDICATOR;
    public static final getSDKReferenceNumber CHALLENGE_SELECT_INFO;
    private static int ChallengeResult;
    private static int ChallengeResultCancelled;
    public static final getSDKReferenceNumber ERROR_CODE;
    public static final getSDKReferenceNumber ERROR_COMPONENT;
    public static final getSDKReferenceNumber ERROR_DESCRIPTION;
    public static final getSDKReferenceNumber ERROR_DETAIL;
    public static final getSDKReferenceNumber ERROR_MESSAGE_TYPE;
    public static final getSDKReferenceNumber EXPAND_INFO_LABEL;
    public static final getSDKReferenceNumber EXPAND_INFO_TEXT;
    public static final getSDKReferenceNumber ISSUER_IMAGE;
    public static final getSDKReferenceNumber ISSUER_IMAGE_EXTRA_HIGH;
    public static final getSDKReferenceNumber ISSUER_IMAGE_HIGH;
    public static final getSDKReferenceNumber ISSUER_IMAGE_MEDIUM;
    public static final getSDKReferenceNumber MESSAGE_EXTENSION;
    public static final getSDKReferenceNumber MESSAGE_EXTENSION_CHALLENGE_DATA;
    public static final getSDKReferenceNumber MESSAGE_EXTENSION_CRITICALITY_INDICATOR;
    public static final getSDKReferenceNumber MESSAGE_EXTENSION_DATA;
    public static final getSDKReferenceNumber MESSAGE_EXTENSION_ID;
    public static final getSDKReferenceNumber MESSAGE_EXTENSION_NAME;
    public static final getSDKReferenceNumber MESSAGE_EXTENSION_VERSION;
    public static final getSDKReferenceNumber MESSAGE_TYPE;
    public static final getSDKReferenceNumber MESSAGE_VERSION;
    public static final getSDKReferenceNumber NONE;
    public static final getSDKReferenceNumber OOB_APP_URL;
    public static final getSDKReferenceNumber OOB_CONTINUE_LABEL;
    public static final getSDKReferenceNumber OOP_APP_LABEL;
    public static final getSDKReferenceNumber PS_IMAGE;
    public static final getSDKReferenceNumber RESEND_INFO_LABEL;
    public static final getSDKReferenceNumber SDK_COUNTER_A_TO_S;
    public static final getSDKReferenceNumber SDK_TRANSACTION_ID;
    public static final getSDKReferenceNumber SUBMIT_AUTHENTICATION_LABEL;
    public static final getSDKReferenceNumber THREEDS_REQUESTOR_APP_URL;
    public static final getSDKReferenceNumber THREEDS_SERVER_TRANSACTION_ID;
    public static final getSDKReferenceNumber TRANSACTION_STATUS;
    public static final getSDKReferenceNumber WHITELISTING_DATA_ENTRY;
    public static final getSDKReferenceNumber WHITELISTING_INFO_TEXT;
    public static final getSDKReferenceNumber WHY_INFO_LABEL;
    public static final getSDKReferenceNumber WHY_INFO_TEXT;
    private static int getDeviceData;
    private static int getMessageVersion;
    private static int getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static byte[] getSDKReferenceNumber;
    private static short[] getSDKTransactionID;

    @NotNull
    private final String identifier;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r5, byte r6, int r7) {
        /*
            int r5 = r5 * 4
            int r5 = r5 + 101
            int r6 = r6 * 3
            int r6 = 4 - r6
            byte[] r0 = atd.am.getSDKReferenceNumber.$$a
            int r7 = r7 * 2
            int r1 = 1 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L18
            r4 = r7
            r3 = r2
            goto L28
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L24:
            int r3 = r3 + 1
            r4 = r0[r6]
        L28:
            int r6 = r6 + 1
            int r4 = -r4
            int r5 = r5 + r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.am.getSDKReferenceNumber.$$c(byte, byte, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKEphemeralPublicKey = 0;
        ChallengeResult = 1;
        getMessageVersion = 0;
        ChallengeResultCancelled = 1;
        AuthenticationRequestParameters();
        NONE = new getSDKReferenceNumber("NONE", 0, "Non Applicable");
        MESSAGE_TYPE = new getSDKReferenceNumber("MESSAGE_TYPE", 1, "messageType");
        MESSAGE_VERSION = new getSDKReferenceNumber("MESSAGE_VERSION", 2, "messageVersion");
        ACS_TRANSACTION_ID = new getSDKReferenceNumber("ACS_TRANSACTION_ID", 3, "acsTransID");
        THREEDS_SERVER_TRANSACTION_ID = new getSDKReferenceNumber("THREEDS_SERVER_TRANSACTION_ID", 4, "threeDSServerTransID");
        SDK_TRANSACTION_ID = new getSDKReferenceNumber("SDK_TRANSACTION_ID", 5, "sdkTransID");
        THREEDS_REQUESTOR_APP_URL = new getSDKReferenceNumber("THREEDS_REQUESTOR_APP_URL", 6, "threeDSRequestorAppURL");
        SDK_COUNTER_A_TO_S = new getSDKReferenceNumber("SDK_COUNTER_A_TO_S", 7, "sdkCounterStoA");
        ACS_COUNTER_A_TO_S = new getSDKReferenceNumber("ACS_COUNTER_A_TO_S", 8, "acsCounterAtoS");
        ACS_UI_TYPE = new getSDKReferenceNumber("ACS_UI_TYPE", 9, "acsUiType");
        TRANSACTION_STATUS = new getSDKReferenceNumber("TRANSACTION_STATUS", 10, "transStatus");
        CHALLENGE_COMPLETION_INDICATOR = new getSDKReferenceNumber("CHALLENGE_COMPLETION_INDICATOR", 11, "challengeCompletionInd");
        ACS_HTML = new getSDKReferenceNumber("ACS_HTML", 12, "acsHTML");
        ACS_HTML_REFRESH = new getSDKReferenceNumber("ACS_HTML_REFRESH", 13, "acsHTMLRefresh");
        CHALLENGE_INFO_HEADER = new getSDKReferenceNumber("CHALLENGE_INFO_HEADER", 14, "challengeInfoHeader");
        CHALLENGE_INFO_TEXT = new getSDKReferenceNumber("CHALLENGE_INFO_TEXT", 15, "challengeInfoText");
        CHALLENGE_INFO_LABEL = new getSDKReferenceNumber("CHALLENGE_INFO_LABEL", 16, "challengeInfoLabel");
        CHALLENGE_INFO_TEXT_INDICATOR = new getSDKReferenceNumber("CHALLENGE_INFO_TEXT_INDICATOR", 17, "challengeInfoTextIndicator");
        RESEND_INFO_LABEL = new getSDKReferenceNumber("RESEND_INFO_LABEL", 18, "resendInformationLabel");
        WHY_INFO_LABEL = new getSDKReferenceNumber("WHY_INFO_LABEL", 19, "whyInfoLabel");
        WHY_INFO_TEXT = new getSDKReferenceNumber("WHY_INFO_TEXT", 20, "whyInfoText");
        EXPAND_INFO_LABEL = new getSDKReferenceNumber("EXPAND_INFO_LABEL", 21, "expandInfoLabel");
        EXPAND_INFO_TEXT = new getSDKReferenceNumber("EXPAND_INFO_TEXT", 22, "expandInfoText");
        ISSUER_IMAGE = new getSDKReferenceNumber("ISSUER_IMAGE", 23, "issuerImage");
        ISSUER_IMAGE_MEDIUM = new getSDKReferenceNumber("ISSUER_IMAGE_MEDIUM", 24, "medium");
        ISSUER_IMAGE_HIGH = new getSDKReferenceNumber("ISSUER_IMAGE_HIGH", 25, "high");
        ISSUER_IMAGE_EXTRA_HIGH = new getSDKReferenceNumber("ISSUER_IMAGE_EXTRA_HIGH", 26, "extraHigh");
        PS_IMAGE = new getSDKReferenceNumber("PS_IMAGE", 27, "psImage");
        WHITELISTING_INFO_TEXT = new getSDKReferenceNumber("WHITELISTING_INFO_TEXT", 28, "whitelistingInfoText");
        WHITELISTING_DATA_ENTRY = new getSDKReferenceNumber("WHITELISTING_DATA_ENTRY", 29, "whitelistingDataEntry");
        SUBMIT_AUTHENTICATION_LABEL = new getSDKReferenceNumber("SUBMIT_AUTHENTICATION_LABEL", 30, "submitAuthenticationLabel");
        CHALLENGE_ADD_INFO = new getSDKReferenceNumber("CHALLENGE_ADD_INFO", 31, "challengeAddInfo");
        OOB_CONTINUE_LABEL = new getSDKReferenceNumber("OOB_CONTINUE_LABEL", 32, "oobContinueLabel");
        OOP_APP_LABEL = new getSDKReferenceNumber("OOP_APP_LABEL", 33, "oobAppLabel");
        OOB_APP_URL = new getSDKReferenceNumber("OOB_APP_URL", 34, "oobAppURL");
        CHALLENGE_SELECT_INFO = new getSDKReferenceNumber("CHALLENGE_SELECT_INFO", 35, "challengeSelectInfo");
        MESSAGE_EXTENSION = new getSDKReferenceNumber("MESSAGE_EXTENSION", 36, "messageExtension");
        MESSAGE_EXTENSION_NAME = new getSDKReferenceNumber("MESSAGE_EXTENSION_NAME", 37, "name");
        MESSAGE_EXTENSION_ID = new getSDKReferenceNumber("MESSAGE_EXTENSION_ID", 38, "id");
        MESSAGE_EXTENSION_CRITICALITY_INDICATOR = new getSDKReferenceNumber("MESSAGE_EXTENSION_CRITICALITY_INDICATOR", 39, "criticalityIndicator");
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getTapTimeout() >> 16) - 230995673, ExpandableListView.getPackedPositionType(0L) - 22, 508219954 + TextUtils.getCapsMode("", 0, 0), (byte) TextUtils.indexOf("", ""), (short) ((-63) - (ViewConfiguration.getWindowTouchSlop() >> 8)), objArr);
        MESSAGE_EXTENSION_DATA = new getSDKReferenceNumber("MESSAGE_EXTENSION_DATA", 40, ((String) objArr[0]).intern());
        MESSAGE_EXTENSION_VERSION = new getSDKReferenceNumber("MESSAGE_EXTENSION_VERSION", 41, "version");
        MESSAGE_EXTENSION_CHALLENGE_DATA = new getSDKReferenceNumber("MESSAGE_EXTENSION_CHALLENGE_DATA", 42, "challengeData");
        ERROR_CODE = new getSDKReferenceNumber("ERROR_CODE", 43, "errorCode");
        ERROR_COMPONENT = new getSDKReferenceNumber("ERROR_COMPONENT", 44, "errorComponent");
        ERROR_DESCRIPTION = new getSDKReferenceNumber("ERROR_DESCRIPTION", 45, "errorDescription");
        ERROR_DETAIL = new getSDKReferenceNumber("ERROR_DETAIL", 46, "errorDetail");
        ERROR_MESSAGE_TYPE = new getSDKReferenceNumber("ERROR_MESSAGE_TYPE", 47, "errorMessageType");
        getSDKReferenceNumber[] sDKAppID = getSDKAppID();
        $VALUES = sDKAppID;
        n.w(sDKAppID);
        int i11 = getSDKEphemeralPublicKey + 49;
        ChallengeResult = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private getSDKReferenceNumber(String str, int i11, String str2) {
        this.identifier = str2;
    }

    public static void AuthenticationRequestParameters() {
        AuthenticationRequestParameters = -791070227;
        getSDKAppID = 829166646;
        getDeviceData = 1017684766;
        getSDKReferenceNumber = new byte[]{-52, 15, 113, 31};
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r30, int r31, int r32, byte r33, short r34, java.lang.Object[] r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.am.getSDKReferenceNumber.a(int, int, int, byte, short, java.lang.Object[]):void");
    }

    private static final /* synthetic */ getSDKReferenceNumber[] getSDKAppID() {
        int i11 = (ChallengeResultCancelled + 69) % 128;
        getMessageVersion = i11;
        getSDKReferenceNumber[] getsdkreferencenumberArr = {NONE, MESSAGE_TYPE, MESSAGE_VERSION, ACS_TRANSACTION_ID, THREEDS_SERVER_TRANSACTION_ID, SDK_TRANSACTION_ID, THREEDS_REQUESTOR_APP_URL, SDK_COUNTER_A_TO_S, ACS_COUNTER_A_TO_S, ACS_UI_TYPE, TRANSACTION_STATUS, CHALLENGE_COMPLETION_INDICATOR, ACS_HTML, ACS_HTML_REFRESH, CHALLENGE_INFO_HEADER, CHALLENGE_INFO_TEXT, CHALLENGE_INFO_LABEL, CHALLENGE_INFO_TEXT_INDICATOR, RESEND_INFO_LABEL, WHY_INFO_LABEL, WHY_INFO_TEXT, EXPAND_INFO_LABEL, EXPAND_INFO_TEXT, ISSUER_IMAGE, ISSUER_IMAGE_MEDIUM, ISSUER_IMAGE_HIGH, ISSUER_IMAGE_EXTRA_HIGH, PS_IMAGE, WHITELISTING_INFO_TEXT, WHITELISTING_DATA_ENTRY, SUBMIT_AUTHENTICATION_LABEL, CHALLENGE_ADD_INFO, OOB_CONTINUE_LABEL, OOP_APP_LABEL, OOB_APP_URL, CHALLENGE_SELECT_INFO, MESSAGE_EXTENSION, MESSAGE_EXTENSION_NAME, MESSAGE_EXTENSION_ID, MESSAGE_EXTENSION_CRITICALITY_INDICATOR, MESSAGE_EXTENSION_DATA, MESSAGE_EXTENSION_VERSION, MESSAGE_EXTENSION_CHALLENGE_DATA, ERROR_CODE, ERROR_COMPONENT, ERROR_DESCRIPTION, ERROR_DETAIL, ERROR_MESSAGE_TYPE};
        ChallengeResultCancelled = (i11 + 7) % 128;
        return getsdkreferencenumberArr;
    }

    public static void init$0() {
        $$a = new byte[]{5, 96, -35, 91};
        $$b = 196;
    }

    public static getSDKReferenceNumber valueOf(String str) {
        ChallengeResultCancelled = (getMessageVersion + 115) % 128;
        getSDKReferenceNumber getsdkreferencenumber = (getSDKReferenceNumber) Enum.valueOf(getSDKReferenceNumber.class, str);
        getMessageVersion = (ChallengeResultCancelled + 5) % 128;
        return getsdkreferencenumber;
    }

    public static getSDKReferenceNumber[] values() {
        int i11 = ChallengeResultCancelled + 91;
        getMessageVersion = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        getSDKReferenceNumber[] getsdkreferencenumberArr = (getSDKReferenceNumber[]) $VALUES.clone();
        ChallengeResultCancelled = (getMessageVersion + 59) % 128;
        return getsdkreferencenumberArr;
    }

    @NotNull
    public final String getSDKReferenceNumber() {
        int i11 = getMessageVersion;
        String str = this.identifier;
        int i12 = i11 + 101;
        ChallengeResultCancelled = i12 % 128;
        if (i12 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
