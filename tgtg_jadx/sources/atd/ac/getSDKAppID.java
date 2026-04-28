package atd.ac;

import atd.am.getSDKEphemeralPublicKey;
import atd.h.getSDKReferenceNumber;
import atd.y.getSDKAppID;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.braze.models.inappmessage.InAppMessageBase;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0019B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB!\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/adyen/threeds2/internal/exception/ThreeDS2ChallengeException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "protocolErrorMessage", "Lcom/adyen/threeds2/internal/api/challenge/model/type/ErrorType;", "protocolErrorType", "Lcom/adyen/threeds2/internal/result/ResultCode;", StatusResponse.RESULT_CODE, "Lcom/adyen/threeds2/internal/result/MessageField;", "messageField", "<init>", "(Ljava/lang/String;Lcom/adyen/threeds2/internal/api/challenge/model/type/ErrorType;Lcom/adyen/threeds2/internal/result/ResultCode;Lcom/adyen/threeds2/internal/result/MessageField;)V", InAppMessageBase.MESSAGE, "errorType", "(Ljava/lang/String;Lcom/adyen/threeds2/internal/api/challenge/model/type/ErrorType;Lcom/adyen/threeds2/internal/result/ResultCode;)V", "Lcom/adyen/threeds2/internal/api/challenge/model/type/ErrorType;", "getProtocolErrorType", "()Lcom/adyen/threeds2/internal/api/challenge/model/type/ErrorType;", "Lcom/adyen/threeds2/internal/result/ResultCode;", "getResultCode", "()Lcom/adyen/threeds2/internal/result/ResultCode;", "Lcom/adyen/threeds2/internal/result/MessageField;", "getMessageField", "()Lcom/adyen/threeds2/internal/result/MessageField;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKAppID extends Exception {
    private static int AuthenticationRequestParameters = 1;
    private static int getDeviceData = 0;
    private static int getMessageVersion = 1;
    private static int getSDKEphemeralPublicKey;

    @NotNull
    private final getSDKReferenceNumber getSDKAppID;

    @NotNull
    private final getSDKEphemeralPublicKey getSDKReferenceNumber;

    @NotNull
    private final atd.am.getSDKReferenceNumber getSDKTransactionID;

    static {
        new getDeviceData((byte) 0);
        int i11 = getMessageVersion;
        int i12 = i11 & 45;
        int i13 = i12 + ((i11 ^ 45) | i12);
        getSDKEphemeralPublicKey = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getSDKAppID(@NotNull String str, @NotNull getSDKReferenceNumber getsdkreferencenumber, @NotNull getSDKEphemeralPublicKey getsdkephemeralpublickey, @NotNull atd.am.getSDKReferenceNumber getsdkreferencenumber2) {
        super(str);
        str.getClass();
        getsdkreferencenumber.getClass();
        getsdkephemeralpublickey.getClass();
        getsdkreferencenumber2.getClass();
        this.getSDKAppID = getsdkreferencenumber;
        this.getSDKReferenceNumber = getsdkephemeralpublickey;
        this.getSDKTransactionID = getsdkreferencenumber2;
    }

    public static /* synthetic */ Object AuthenticationRequestParameters(int i11, Object[] objArr, int i12, int i13, int i14, int i15, int i16) {
        int i17 = ~i12;
        int i18 = (~(i17 | i14)) | i15;
        int i19 = ((-249289968) * i18) + ((-1745228167) * i12) + (526900465 * i15) + 74317824;
        int i21 = (~(i17 | (~i14))) | (~((~i15) | i17)) | (~(i15 | i12 | i14));
        int i22 = ~(i14 | i15);
        int i23 = ((-366739456) * i16) + (1331953664 * i11) + (277610496 * i13) + ((-2022838664) * i22) + (2022838664 * i21) + i19;
        int iC = a0.c(i16, 135932771, ((-813770285) * i11) + i15 + i12 + i13);
        int i24 = i18 * (-720);
        int i25 = i21 * (-360);
        int i26 = i22 * 360;
        int i27 = i13 * 1149713731;
        int i28 = i11 * 1918847289;
        int i29 = i16 * (-2006650391);
        int iE = a0.e(iC, 460980224, i29 + i28 + i27 + i26 + i25 + i24 + (i12 * 1149714091) + (i15 * 1149714451) + 247108311, -1418592256, ((-1308753920) * iC) + i23);
        if (iE == 1) {
            return getSDKTransactionID(objArr);
        }
        if (iE == 2) {
            return getSDKReferenceNumber(objArr);
        }
        getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
        int i31 = getDeviceData;
        int i32 = i31 & 99;
        int i33 = (i31 ^ 99) | i32;
        AuthenticationRequestParameters = ((i32 & i33) + (i32 | i33)) % 128;
        getSDKReferenceNumber getsdkreferencenumber = getsdkappid.getSDKAppID;
        AuthenticationRequestParameters = (((i31 | 23) << 1) - (i31 ^ 23)) % 128;
        return getsdkreferencenumber;
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
        getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
        int i11 = AuthenticationRequestParameters;
        int i12 = i11 & 45;
        int i13 = (i11 ^ 45) | i12;
        getDeviceData = (((i12 | i13) << 1) - (i12 ^ i13)) % 128;
        getSDKEphemeralPublicKey getsdkephemeralpublickey = getsdkappid.getSDKReferenceNumber;
        int i14 = i11 + 39;
        getDeviceData = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 49 / 0;
        }
        return getsdkephemeralpublickey;
    }

    private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
        getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
        int i11 = AuthenticationRequestParameters;
        int i12 = ((i11 ^ 10) + ((i11 & 10) << 1)) - 1;
        getDeviceData = i12 % 128;
        int i13 = i12 % 2;
        atd.am.getSDKReferenceNumber getsdkreferencenumber = getsdkappid.getSDKTransactionID;
        if (i13 == 0) {
            return getsdkreferencenumber;
        }
        throw null;
    }

    @NotNull
    public final getSDKReferenceNumber getDeviceData() {
        int iAuthenticationRequestParameters = getSDKAppID.getSDKTransactionID.AuthenticationRequestParameters();
        int iAuthenticationRequestParameters2 = getSDKAppID.getSDKTransactionID.AuthenticationRequestParameters();
        return (getSDKReferenceNumber) AuthenticationRequestParameters(getSDKAppID.getSDKTransactionID.AuthenticationRequestParameters(), new Object[]{this}, -1765154184, iAuthenticationRequestParameters2, iAuthenticationRequestParameters, 1765154184, getSDKAppID.getSDKTransactionID.AuthenticationRequestParameters());
    }

    @NotNull
    public final atd.am.getSDKReferenceNumber getSDKAppID() {
        int iAuthenticationRequestParameters = getSDKAppID.getSDKTransactionID.AuthenticationRequestParameters();
        int iAuthenticationRequestParameters2 = getSDKAppID.getSDKTransactionID.AuthenticationRequestParameters();
        return (atd.am.getSDKReferenceNumber) AuthenticationRequestParameters(getSDKAppID.getSDKTransactionID.AuthenticationRequestParameters(), new Object[]{this}, -1231393214, iAuthenticationRequestParameters2, iAuthenticationRequestParameters, 1231393215, getSDKAppID.getSDKTransactionID.AuthenticationRequestParameters());
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/exception/ThreeDS2ChallengeException$Companion;", "", "<init>", "()V", "serialVersionUID", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        private getDeviceData() {
        }

        public /* synthetic */ getDeviceData(byte b8) {
            this();
        }
    }

    public /* synthetic */ getSDKAppID(String str, getSDKReferenceNumber getsdkreferencenumber, getSDKEphemeralPublicKey getsdkephemeralpublickey, byte b8) {
        this(str, getsdkreferencenumber, getsdkephemeralpublickey, atd.am.getSDKReferenceNumber.NONE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public getSDKAppID(@NotNull String str, @NotNull getSDKReferenceNumber getsdkreferencenumber, @NotNull getSDKEphemeralPublicKey getsdkephemeralpublickey) {
        this(str, getsdkreferencenumber, getsdkephemeralpublickey, atd.am.getSDKReferenceNumber.NONE);
        str.getClass();
        getsdkreferencenumber.getClass();
        getsdkephemeralpublickey.getClass();
    }

    @NotNull
    public final getSDKEphemeralPublicKey getSDKReferenceNumber() {
        int iAuthenticationRequestParameters = getSDKAppID.getSDKTransactionID.AuthenticationRequestParameters();
        int iAuthenticationRequestParameters2 = getSDKAppID.getSDKTransactionID.AuthenticationRequestParameters();
        return (getSDKEphemeralPublicKey) AuthenticationRequestParameters(getSDKAppID.getSDKTransactionID.AuthenticationRequestParameters(), new Object[]{this}, -1410018444, iAuthenticationRequestParameters2, iAuthenticationRequestParameters, 1410018446, getSDKAppID.getSDKTransactionID.AuthenticationRequestParameters());
    }
}
