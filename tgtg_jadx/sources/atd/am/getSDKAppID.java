package atd.am;

import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.m0;
import atd.bb.ChallengeResultTimeout;
import atd.e.ChallengeResult;
import atd.n.getSDKReferenceNumber;
import atd.y.ChallengeResultCompleted;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.adyen.threeds2.BuildConfig;
import com.braze.Constants;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import n90.b0;
import n90.c0;
import n90.n;
import org.bouncycastle.i18n.LocalizedMessage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wd.a;
import zendesk.messaging.android.internal.analytics.AnalyticsProcessor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a5\u0010\n\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a?\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a'\u0010\u0018\u001a\u0004\u0018\u00010\u0015*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"", "Lcom/adyen/threeds2/internal/result/ResultCode;", "toResultCode", "(Ljava/lang/String;)Lcom/adyen/threeds2/internal/result/ResultCode;", StatusResponse.RESULT_CODE, "Lcom/adyen/threeds2/internal/result/MessageField;", "errorField", "Lcom/adyen/threeds2/internal/result/models/TransactionIdentifiers;", "transactionIdentifiers", "messageVersion", "getBase64EncodedAdditionalDetails", "(Lcom/adyen/threeds2/internal/result/ResultCode;Lcom/adyen/threeds2/internal/result/MessageField;Lcom/adyen/threeds2/internal/result/models/TransactionIdentifiers;Ljava/lang/String;)Ljava/lang/String;", "Lcom/adyen/threeds2/internal/result/models/DeviceIdentifiers;", "deviceIdentifiers", "Ln90/b0;", "createAdditionalDetailsJson", "(Lcom/adyen/threeds2/internal/result/ResultCode;Lcom/adyen/threeds2/internal/result/MessageField;Lcom/adyen/threeds2/internal/result/models/TransactionIdentifiers;Lcom/adyen/threeds2/internal/result/models/DeviceIdentifiers;Ljava/lang/String;)Ln90/b0;", "Ln90/c0;", "Lcom/adyen/threeds2/internal/result/AdditionalDetailsField;", "key", "value", "Ln90/n;", "putIfNotNull", "(Ln90/c0;Lcom/adyen/threeds2/internal/result/AdditionalDetailsField;Ljava/lang/String;)Ln90/n;", "put", "threeds2_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAdditionalDetailsUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdditionalDetailsUtils.kt\ncom/adyen/threeds2/internal/result/AdditionalDetailsUtilsKt\n+ 2 JsonElementBuilders.kt\nkotlinx/serialization/json/JsonElementBuildersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,114:1\n29#2,3:115\n1#3:118\n*S KotlinDebug\n*F\n+ 1 AdditionalDetailsUtils.kt\ncom/adyen/threeds2/internal/result/AdditionalDetailsUtilsKt\n*L\n63#1:115,3\n*E\n"})
public final class getSDKAppID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] AuthenticationRequestParameters;
    private static int getDeviceData;
    private static int getMessageVersion;
    private static boolean getSDKAppID;
    private static boolean getSDKReferenceNumber;
    private static int getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r5, byte r6, short r7) {
        /*
            byte[] r0 = atd.am.getSDKAppID.$$a
            int r7 = r7 * 2
            int r1 = r7 + 1
            int r6 = r6 * 3
            int r6 = r6 + 4
            int r5 = r5 * 4
            int r5 = r5 + 111
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r6
            r5 = r7
            r3 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L23:
            r4 = r0[r6]
            int r3 = r3 + 1
        L27:
            int r6 = r6 + 1
            int r5 = r5 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.am.getSDKAppID.$$c(short, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKTransactionID = 0;
        getMessageVersion = 1;
        AuthenticationRequestParameters = new char[]{21595, 21588, 21594};
        getDeviceData = 1286296586;
        getSDKAppID = true;
        getSDKReferenceNumber = true;
    }

    private static final n AuthenticationRequestParameters(c0 c0Var, AuthenticationRequestParameters authenticationRequestParameters, String str) {
        int i11 = getMessageVersion;
        int i12 = i11 + 69;
        getSDKTransactionID = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 84 / 0;
            if (str == null) {
                return null;
            }
        } else if (str == null) {
            return null;
        }
        getSDKTransactionID = (i11 + 25) % 128;
        return a.D(c0Var, authenticationRequestParameters.getDeviceData(), str);
    }

    private static void a(int i11, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        float f11;
        String str3 = str2;
        $10 = ($11 + 37) % 128;
        Object bytes = str3;
        if (str3 != null) {
            bytes = str3.getBytes(LocalizedMessage.DEFAULT_ENCODING);
        }
        byte[] bArr = (byte[]) bytes;
        char[] charArray = str != null ? str.toCharArray() : str;
        ChallengeResultTimeout challengeResultTimeout = new ChallengeResultTimeout();
        char[] cArr = AuthenticationRequestParameters;
        Class cls = Integer.TYPE;
        float f12 = 0.0f;
        int i12 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i13 = 0;
            while (i13 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i13])};
                    Object sDKTransactionID = ChallengeResult.getSDKTransactionID(887083134);
                    if (sDKTransactionID == null) {
                        int i14 = 2554 - (ExpandableListView.getPackedPositionForChild(i12, i12) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i12, i12) == 0L ? 0 : -1));
                        char cIndexOf = (char) (48597 - TextUtils.indexOf((CharSequence) "", '0'));
                        int i15 = 31 - (TypedValue.complexToFraction(i12, f12, f12) > f12 ? 1 : (TypedValue.complexToFraction(i12, f12, f12) == f12 ? 0 : -1));
                        f11 = f12;
                        byte b8 = (byte) i12;
                        byte b11 = b8;
                        sDKTransactionID = ChallengeResult.getDeviceData(i14, cIndexOf, i15, -390605202, false, $$c(b8, b11, b11), new Class[]{cls});
                    } else {
                        f11 = f12;
                    }
                    cArr2[i13] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    i13++;
                    f12 = f11;
                    i12 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        float f13 = f12;
        Object[] objArr3 = {Integer.valueOf(getDeviceData)};
        Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(-1144184369);
        if (sDKTransactionID2 == null) {
            sDKTransactionID2 = ChallengeResult.getDeviceData((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 147, (char) (1 - (ViewConfiguration.getScrollFriction() > f13 ? 1 : (ViewConfiguration.getScrollFriction() == f13 ? 0 : -1))), 32 - (ViewConfiguration.getWindowTouchSlop() >> 8), 1738876895, false, Constants.BRAZE_PUSH_TITLE_KEY, new Class[]{cls});
        }
        int iIntValue = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
        if (getSDKReferenceNumber) {
            int length2 = bArr.length;
            challengeResultTimeout.AuthenticationRequestParameters = length2;
            char[] cArr3 = new char[length2];
            challengeResultTimeout.getSDKAppID = 0;
            while (true) {
                int i16 = challengeResultTimeout.getSDKAppID;
                int i17 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i16 >= i17) {
                    objArr[0] = new String(cArr3);
                    return;
                }
                $10 = ($11 + 121) % 128;
                cArr3[i16] = (char) (cArr[bArr[(i17 - 1) - i16] + i11] - iIntValue);
                Object[] objArr4 = {challengeResultTimeout, challengeResultTimeout};
                Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(1124287645);
                if (sDKTransactionID3 == null) {
                    byte b12 = (byte) 1;
                    byte b13 = (byte) (b12 - 1);
                    sDKTransactionID3 = ChallengeResult.getDeviceData(1697 - ExpandableListView.getPackedPositionGroup(0L), (char) TextUtils.getTrimmedLength(""), 29 - KeyEvent.keyCodeFromString(""), -1620360563, false, $$c(b12, b13, b13), new Class[]{Object.class, Object.class});
                }
                ((Method) sDKTransactionID3).invoke(null, objArr4);
            }
        } else if (getSDKAppID) {
            int length3 = charArray.length;
            challengeResultTimeout.AuthenticationRequestParameters = length3;
            char[] cArr4 = new char[length3];
            challengeResultTimeout.getSDKAppID = 0;
            $10 = ($11 + 113) % 128;
            while (true) {
                int i18 = challengeResultTimeout.getSDKAppID;
                int i19 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i18 >= i19) {
                    objArr[0] = new String(cArr4);
                    return;
                }
                $11 = ($10 + 101) % 128;
                cArr4[i18] = (char) (cArr[charArray[(i19 - 1) - i18] - i11] - iIntValue);
                Object[] objArr5 = {challengeResultTimeout, challengeResultTimeout};
                Object sDKTransactionID4 = ChallengeResult.getSDKTransactionID(1124287645);
                if (sDKTransactionID4 == null) {
                    byte b14 = (byte) 1;
                    byte b15 = (byte) (b14 - 1);
                    sDKTransactionID4 = ChallengeResult.getDeviceData((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1697, (char) (ViewConfiguration.getTapTimeout() >> 16), 28 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -1620360563, false, $$c(b14, b15, b15), new Class[]{Object.class, Object.class});
                }
                ((Method) sDKTransactionID4).invoke(null, objArr5);
            }
        } else {
            int length4 = iArr.length;
            challengeResultTimeout.AuthenticationRequestParameters = length4;
            char[] cArr5 = new char[length4];
            challengeResultTimeout.getSDKAppID = 0;
            while (true) {
                int i21 = challengeResultTimeout.getSDKAppID;
                int i22 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i21 >= i22) {
                    objArr[0] = new String(cArr5);
                    return;
                } else {
                    cArr5[i21] = (char) (cArr[iArr[(i22 - 1) - i21] - i11] - iIntValue);
                    challengeResultTimeout.getSDKAppID = i21 + 1;
                }
            }
        }
    }

    public static /* synthetic */ String getDeviceData(getSDKEphemeralPublicKey getsdkephemeralpublickey, atd.ao.getSDKReferenceNumber getsdkreferencenumber, String str) throws Throwable {
        int i11 = getSDKTransactionID + 55;
        getMessageVersion = i11 % 128;
        int i12 = i11 % 2;
        String sDKTransactionID = getSDKTransactionID(getsdkephemeralpublickey, (getSDKReferenceNumber) null, getsdkreferencenumber, str);
        if (i12 == 0) {
            int i13 = 19 / 0;
        }
        return sDKTransactionID;
    }

    @NotNull
    public static final getSDKEphemeralPublicKey getSDKAppID(@NotNull String str) {
        getSDKEphemeralPublicKey getsdkephemeralpublickey;
        int i11;
        str.getClass();
        int iHashCode = str.hashCode();
        switch (iHashCode) {
            case 48626:
                if (str.equals("101")) {
                    return getSDKEphemeralPublicKey.ERROR_FROM_ACS_MESSAGE_RECEIVED_INVALID;
                }
                break;
            case 48627:
                if (str.equals("102")) {
                    return getSDKEphemeralPublicKey.ERROR_FROM_ACS_MESSAGE_VERSION_NOT_SUPPORTED;
                }
                break;
            default:
                switch (iHashCode) {
                    case 49587:
                        if (str.equals("201")) {
                            return getSDKEphemeralPublicKey.ERROR_FROM_ACS_DATA_ELEMENT_MISSING;
                        }
                        break;
                    case 49588:
                        if (str.equals("202")) {
                            return getSDKEphemeralPublicKey.ERROR_FROM_ACS_MESSAGE_EXTENSION_MISSING;
                        }
                        break;
                    case 49589:
                        if (str.equals("203")) {
                            return getSDKEphemeralPublicKey.ERROR_FROM_ACS_DATA_ELEMENT_INVALID_FORMAT;
                        }
                        break;
                    case 49590:
                        if (str.equals("204")) {
                            return getSDKEphemeralPublicKey.ERROR_FROM_ACS_DUPLICATE_DATA_ELEMENT;
                        }
                        break;
                    default:
                        switch (iHashCode) {
                            case 50548:
                                if (str.equals("301")) {
                                    getsdkephemeralpublickey = getSDKEphemeralPublicKey.ERROR_FROM_ACS_TRANSACTION_ID_NOT_RECOGNIZED;
                                    int i12 = getMessageVersion + 55;
                                    getSDKTransactionID = i12 % 128;
                                    if (i12 % 2 == 0) {
                                        return getsdkephemeralpublickey;
                                    }
                                    i11 = 85;
                                    int i13 = i11 / 0;
                                    return getsdkephemeralpublickey;
                                }
                                break;
                            case 50549:
                                if (str.equals("302")) {
                                    return getSDKEphemeralPublicKey.ERROR_FROM_ACS_DATA_DECRYPTION_FAILURE;
                                }
                                break;
                            case 50550:
                                if (str.equals("303")) {
                                    return getSDKEphemeralPublicKey.ERROR_FROM_ACS_ACCESS_DENIED;
                                }
                                break;
                            case 50551:
                                if (str.equals("304")) {
                                    return getSDKEphemeralPublicKey.ERROR_FROM_ACS_ISO_CODE_INVALID;
                                }
                                break;
                            case 50552:
                                if (str.equals("305")) {
                                    return getSDKEphemeralPublicKey.ERROR_FROM_ACS_TRANSACTION_DATA_INVALID;
                                }
                                break;
                            default:
                                switch (iHashCode) {
                                    case 51510:
                                        if (str.equals("402")) {
                                            return getSDKEphemeralPublicKey.ERROR_FROM_ACS_TRANSACTION_TIMED_OUT;
                                        }
                                        break;
                                    case 51511:
                                        if (str.equals("403")) {
                                            return getSDKEphemeralPublicKey.ERROR_FROM_ACS_TRANSIENT_SYSTEM_FAILURE;
                                        }
                                        break;
                                    case 51512:
                                        if (str.equals("404")) {
                                            return getSDKEphemeralPublicKey.ERROR_FROM_ACS_PERMANENT_SYSTEM_FAILURE;
                                        }
                                        break;
                                    case 51513:
                                        if (str.equals("405")) {
                                            getsdkephemeralpublickey = getSDKEphemeralPublicKey.ERROR_FROM_ACS_SYSTEM_CONNECTION_FAILURE;
                                            int i14 = getMessageVersion + 117;
                                            getSDKTransactionID = i14 % 128;
                                            if (i14 % 2 != 0) {
                                                i11 = 10;
                                                int i132 = i11 / 0;
                                            }
                                            return getsdkephemeralpublickey;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
        return getSDKEphemeralPublicKey.ERROR_MESSAGE_FROM_ACS_OTHER;
    }

    @NotNull
    private static b0 getSDKReferenceNumber(@NotNull getSDKEphemeralPublicKey getsdkephemeralpublickey, @Nullable getSDKReferenceNumber getsdkreferencenumber, @NotNull atd.ao.getSDKReferenceNumber getsdkreferencenumber2, @NotNull atd.ao.AuthenticationRequestParameters authenticationRequestParameters, @Nullable String str) throws Throwable {
        String sDKReferenceNumber;
        getsdkephemeralpublickey.getClass();
        getsdkreferencenumber2.getClass();
        authenticationRequestParameters.getClass();
        c0 c0Var = new c0();
        getSDKReferenceNumber(c0Var, AuthenticationRequestParameters.ERROR_CODE, getsdkephemeralpublickey.getSDKAppID());
        AuthenticationRequestParameters authenticationRequestParameters2 = AuthenticationRequestParameters.ERROR_FIELD;
        if (getsdkreferencenumber != null) {
            getMessageVersion = (getSDKTransactionID + 45) % 128;
            sDKReferenceNumber = getsdkreferencenumber.getSDKReferenceNumber();
        } else {
            getMessageVersion = (getSDKTransactionID + 83) % 128;
            sDKReferenceNumber = null;
        }
        AuthenticationRequestParameters(c0Var, authenticationRequestParameters2, sDKReferenceNumber);
        String deviceData = AuthenticationRequestParameters.ADDITIONAL_DETAILS.getDeviceData();
        deviceData.getClass();
        c0 c0Var2 = new c0();
        getSDKTransactionID(getsdkreferencenumber2, str, authenticationRequestParameters, c0Var2);
        c0Var.b(deviceData, c0Var2.a());
        AuthenticationRequestParameters authenticationRequestParameters3 = AuthenticationRequestParameters.VERSION;
        Object[] objArr = new Object[1];
        a(127 - (ViewConfiguration.getKeyRepeatDelay() >> 16), null, null, "\u0083\u0082\u0081", objArr);
        getSDKReferenceNumber(c0Var, authenticationRequestParameters3, ((String) objArr[0]).intern());
        return c0Var.a();
    }

    private static final Unit getSDKTransactionID(atd.ao.getSDKReferenceNumber getsdkreferencenumber, String str, atd.ao.AuthenticationRequestParameters authenticationRequestParameters, c0 c0Var) {
        getMessageVersion = (getSDKTransactionID + 71) % 128;
        c0Var.getClass();
        AuthenticationRequestParameters authenticationRequestParameters2 = AuthenticationRequestParameters.SDK_TRANSACTION_IDENTIFIER;
        int sDKReferenceNumber = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber2 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber3 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        AuthenticationRequestParameters(c0Var, authenticationRequestParameters2, (String) atd.ao.getSDKReferenceNumber.getSDKAppID(sDKReferenceNumber, 2021838210, getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), sDKReferenceNumber3, -2021838209, sDKReferenceNumber2, new Object[]{getsdkreferencenumber}));
        AuthenticationRequestParameters authenticationRequestParameters3 = AuthenticationRequestParameters.SERVER_TRANSACTION_IDENTIFIER;
        int sDKReferenceNumber4 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber5 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber6 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        AuthenticationRequestParameters(c0Var, authenticationRequestParameters3, (String) atd.ao.getSDKReferenceNumber.getSDKAppID(sDKReferenceNumber4, -1801278926, getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), sDKReferenceNumber6, 1801278928, sDKReferenceNumber5, new Object[]{getsdkreferencenumber}));
        AuthenticationRequestParameters authenticationRequestParameters4 = AuthenticationRequestParameters.ACS_TRANSACTION_IDENTIFIER;
        int sDKReferenceNumber7 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber8 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber9 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        AuthenticationRequestParameters(c0Var, authenticationRequestParameters4, (String) atd.ao.getSDKReferenceNumber.getSDKAppID(sDKReferenceNumber7, 284769600, getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), sDKReferenceNumber9, -284769596, sDKReferenceNumber8, new Object[]{getsdkreferencenumber}));
        AuthenticationRequestParameters authenticationRequestParameters5 = AuthenticationRequestParameters.ACS_REFERENCE_NUMBER;
        int sDKReferenceNumber10 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber11 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber12 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        AuthenticationRequestParameters(c0Var, authenticationRequestParameters5, (String) atd.ao.getSDKReferenceNumber.getSDKAppID(sDKReferenceNumber10, -559760497, getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), sDKReferenceNumber12, 559760500, sDKReferenceNumber11, new Object[]{getsdkreferencenumber}));
        AuthenticationRequestParameters(c0Var, AuthenticationRequestParameters.MESSAGE_VERSION, str);
        getSDKReferenceNumber(c0Var, AuthenticationRequestParameters.SDK_VERSION, BuildConfig.VERSION_NAME);
        AuthenticationRequestParameters authenticationRequestParameters6 = AuthenticationRequestParameters.PLATFORM;
        int sDKReferenceNumber13 = ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber14 = ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber15 = ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber();
        getSDKReferenceNumber(c0Var, authenticationRequestParameters6, (String) atd.ao.AuthenticationRequestParameters.getSDKAppID(sDKReferenceNumber13, ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber(), -1292630607, new Object[]{authenticationRequestParameters}, 1292630608, sDKReferenceNumber15, sDKReferenceNumber14));
        AuthenticationRequestParameters authenticationRequestParameters7 = AuthenticationRequestParameters.PLATFORM_VERSION;
        int sDKReferenceNumber16 = ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber17 = ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber18 = ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber();
        getSDKReferenceNumber(c0Var, authenticationRequestParameters7, (String) atd.ao.AuthenticationRequestParameters.getSDKAppID(sDKReferenceNumber16, ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber(), 1952063035, new Object[]{authenticationRequestParameters}, -1952063032, sDKReferenceNumber18, sDKReferenceNumber17));
        AuthenticationRequestParameters authenticationRequestParameters8 = AuthenticationRequestParameters.DEVICE_MODEL;
        int sDKReferenceNumber19 = ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber20 = ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber21 = ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber();
        getSDKReferenceNumber(c0Var, authenticationRequestParameters8, (String) atd.ao.AuthenticationRequestParameters.getSDKAppID(sDKReferenceNumber19, ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber(), 571649277, new Object[]{authenticationRequestParameters}, -571649275, sDKReferenceNumber21, sDKReferenceNumber20));
        Unit unit = Unit.f26487a;
        getMessageVersion = (getSDKTransactionID + 67) % 128;
        return unit;
    }

    public static void init$0() {
        $$a = new byte[]{4, -104, 18, -33};
        $$b = m0.DEFAULT_SWIPE_ANIMATION_DURATION;
    }

    private static final n getSDKReferenceNumber(c0 c0Var, AuthenticationRequestParameters authenticationRequestParameters, String str) {
        getMessageVersion = (getSDKTransactionID + 33) % 128;
        if (str == null) {
            return null;
        }
        n nVarD = a.D(c0Var, authenticationRequestParameters.getDeviceData(), str);
        getMessageVersion = (getSDKTransactionID + 11) % 128;
        return nVarD;
    }

    @NotNull
    public static final String getSDKTransactionID(@NotNull getSDKEphemeralPublicKey getsdkephemeralpublickey, @Nullable getSDKReferenceNumber getsdkreferencenumber, @NotNull atd.ao.getSDKReferenceNumber getsdkreferencenumber2, @Nullable String str) throws Throwable {
        getsdkephemeralpublickey.getClass();
        getsdkreferencenumber2.getClass();
        String str2 = Build.VERSION.RELEASE;
        if (str2 == null) {
            str2 = "UNKNOWN";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Build.MANUFACTURER);
        sb2.append(' ');
        sb2.append(Build.MODEL);
        atd.ao.AuthenticationRequestParameters authenticationRequestParameters = new atd.ao.AuthenticationRequestParameters(AnalyticsProcessor.CHANNEL_NAME, str2, sb2.toString());
        b0 sDKReferenceNumber = getSDKReferenceNumber(getsdkephemeralpublickey, getsdkreferencenumber, getsdkreferencenumber2, authenticationRequestParameters, str);
        int sDKReferenceNumber2 = ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber3 = ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber4 = ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber();
        atd.ao.AuthenticationRequestParameters.getSDKAppID(sDKReferenceNumber2, ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber(), 2128887261, new Object[]{authenticationRequestParameters}, -2128887261, sDKReferenceNumber4, sDKReferenceNumber3);
        String sDKTransactionID = atd.bc.getSDKReferenceNumber.getSDKTransactionID().getSDKTransactionID(sDKReferenceNumber.toString());
        sDKTransactionID.getClass();
        return sDKTransactionID;
    }
}
