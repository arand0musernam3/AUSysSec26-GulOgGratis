package atd.h;

import atd.am.getSDKEphemeralPublicKey;
import atd.c.ChallengeResultCancelled;
import atd.n.getSDKReferenceNumber;
import atd.z.getSDKAppID;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.adyen.threeds2.ProtocolErrorEvent;
import com.adyen.threeds2.RuntimeErrorEvent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000\u001a:\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0000\u001a.\u0010\u0010\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0000¨\u0006\u0012"}, d2 = {"toErrorMessageRequest", "Lcom/adyen/threeds2/internal/api/challenge/model/ErrorMessageRequest;", "Lcom/adyen/threeds2/internal/api/challenge/model/type/ErrorType;", "messageRequest", "Lcom/adyen/threeds2/internal/api/challenge/model/MessageRequest;", "errorDetail", "", "toProtocolErrorEvent", "Lcom/adyen/threeds2/ProtocolErrorEvent;", "transactionIdentifiers", "Lcom/adyen/threeds2/internal/result/models/TransactionIdentifiers;", StatusResponse.RESULT_CODE, "Lcom/adyen/threeds2/internal/result/ResultCode;", "field", "Lcom/adyen/threeds2/internal/result/MessageField;", "messageVersion", "toRuntimeErrorEvent", "Lcom/adyen/threeds2/RuntimeErrorEvent;", "threeds2_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AuthenticationRequestParameters {
    private static int getSDKAppID = 1;
    private static int getSDKReferenceNumber;

    @NotNull
    public static final atd.c.getSDKReferenceNumber AuthenticationRequestParameters(@NotNull getSDKReferenceNumber getsdkreferencenumber, @NotNull ChallengeResultCancelled challengeResultCancelled, @Nullable String str) {
        int sDKAppID = atd.bc.getDeviceData.getSDKAppID();
        int sDKAppID2 = atd.bc.getDeviceData.getSDKAppID();
        return (atd.c.getSDKReferenceNumber) getDeviceData(atd.bc.getDeviceData.getSDKAppID(), sDKAppID2, -752075480, sDKAppID, 752075482, atd.bc.getDeviceData.getSDKAppID(), new Object[]{getsdkreferencenumber, challengeResultCancelled, str});
    }

    public static /* synthetic */ Object getDeviceData(int i11, int i12, int i13, int i14, int i15, int i16, Object[] objArr) {
        int i17 = ~((~i14) | i13);
        int i18 = (~((~i13) | (~i15))) | i17;
        int i19 = i13 | i15;
        int i21 = ((-319553536) * i16) + ((-1529085952) * i11) + ((-754188288) * i12) + (1126725195 * i19) + (i18 * 1126725195) + ((-1126725195) * i17) + ((-1880913482) * i15) + (i13 * (-1880913482)) + 198443008;
        int iC = a0.c(i16, -2104995841, ((-39394691) * i11) + i13 + i15 + i12);
        int i22 = i19 * 613;
        int iE = a0.e(iC, -1450508288, (1996616689 * i16) + (1055723859 * i11) + (1773845519 * i12) + i22 + (i18 * 613) + (i17 * (-613)) + (i15 * 1773844906) + ((i13 * 1773844906) - 1404835566), -778371072, ((-289079296) * iC) + i21);
        String str = null;
        if (iE == 1) {
            getSDKReferenceNumber getsdkreferencenumber = (getSDKReferenceNumber) objArr[0];
            atd.ao.getSDKReferenceNumber getsdkreferencenumber2 = (atd.ao.getSDKReferenceNumber) objArr[1];
            String str2 = (String) objArr[2];
            getSDKEphemeralPublicKey getsdkephemeralpublickey = (getSDKEphemeralPublicKey) objArr[3];
            atd.am.getSDKReferenceNumber getsdkreferencenumber3 = (atd.am.getSDKReferenceNumber) objArr[4];
            String str3 = (String) objArr[5];
            getsdkreferencenumber.getClass();
            getsdkreferencenumber2.getClass();
            getsdkephemeralpublickey.getClass();
            getsdkreferencenumber3.getClass();
            String str4 = (String) atd.ao.getSDKReferenceNumber.getSDKAppID(getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), 2021838210, getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), -2021838209, getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), new Object[]{getsdkreferencenumber2});
            return new atd.ab.getSDKAppID(str4, new atd.ab.getSDKTransactionID(str4, getsdkreferencenumber.getSDKTransactionID(), getsdkreferencenumber.getSDKAppID(), str2), atd.am.getSDKAppID.getSDKTransactionID(getsdkephemeralpublickey, getsdkreferencenumber3 != atd.am.getSDKReferenceNumber.NONE ? getsdkreferencenumber3 : null, getsdkreferencenumber2, str3));
        }
        if (iE != 2) {
            getSDKReferenceNumber getsdkreferencenumber4 = (getSDKReferenceNumber) objArr[0];
            atd.ao.getSDKReferenceNumber getsdkreferencenumber5 = (atd.ao.getSDKReferenceNumber) objArr[1];
            String str5 = (String) objArr[2];
            getSDKEphemeralPublicKey getsdkephemeralpublickey2 = (getSDKEphemeralPublicKey) objArr[3];
            String str6 = (String) objArr[4];
            getsdkreferencenumber4.getClass();
            getsdkreferencenumber5.getClass();
            str5.getClass();
            getsdkephemeralpublickey2.getClass();
            atd.ab.getSDKReferenceNumber getsdkreferencenumber6 = new atd.ab.getSDKReferenceNumber(getsdkreferencenumber4.getSDKTransactionID(), getsdkreferencenumber4.getSDKAppID(), atd.am.getSDKAppID.getDeviceData(getsdkephemeralpublickey2, getsdkreferencenumber5, str6));
            int i23 = getSDKAppID;
            int i24 = i23 & 1;
            int i25 = -(-((i23 ^ 1) | i24));
            getSDKReferenceNumber = ((i24 & i25) + (i25 | i24)) % 128;
            return getsdkreferencenumber6;
        }
        getSDKReferenceNumber getsdkreferencenumber7 = (getSDKReferenceNumber) objArr[0];
        ChallengeResultCancelled challengeResultCancelled = (ChallengeResultCancelled) objArr[1];
        String str7 = (String) objArr[2];
        getsdkreferencenumber7.getClass();
        challengeResultCancelled.getClass();
        atd.ao.getSDKReferenceNumber getsdkreferencenumber8 = (atd.ao.getSDKReferenceNumber) atd.ao.getSDKReferenceNumber.getSDKAppID(getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), -1663327888, getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), 1663327893, getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), new Object[]{challengeResultCancelled.ChallengeResultCancelled()});
        if (str7 == null) {
            str7 = "";
        }
        atd.bc.AuthenticationRequestParameters authenticationRequestParameters = new atd.bc.AuthenticationRequestParameters(str7);
        String str8 = (String) atd.bc.AuthenticationRequestParameters.getDeviceData(getSDKAppID.getSDKTransactionID.getSDKAppID(), -600043858, 600043858, getSDKAppID.getSDKTransactionID.getSDKAppID(), new Object[]{challengeResultCancelled.getMessageVersion()}, getSDKAppID.getSDKTransactionID.getSDKAppID(), getSDKAppID.getSDKTransactionID.getSDKAppID());
        atd.bc.AuthenticationRequestParameters sDKEphemeralPublicKey = challengeResultCancelled.getSDKEphemeralPublicKey();
        if (sDKEphemeralPublicKey != null) {
            str = (String) atd.bc.AuthenticationRequestParameters.getDeviceData(getSDKAppID.getSDKTransactionID.getSDKAppID(), -600043858, 600043858, getSDKAppID.getSDKTransactionID.getSDKAppID(), new Object[]{sDKEphemeralPublicKey}, getSDKAppID.getSDKTransactionID.getSDKAppID(), getSDKAppID.getSDKTransactionID.getSDKAppID());
        }
        return new atd.c.getSDKReferenceNumber(getsdkreferencenumber7, getsdkreferencenumber8, authenticationRequestParameters, str8, str);
    }

    @NotNull
    public static final RuntimeErrorEvent getSDKTransactionID(@NotNull getSDKReferenceNumber getsdkreferencenumber, @NotNull atd.ao.getSDKReferenceNumber getsdkreferencenumber2, @NotNull String str, @NotNull getSDKEphemeralPublicKey getsdkephemeralpublickey, @Nullable String str2) {
        int sDKAppID = atd.bc.getDeviceData.getSDKAppID();
        int sDKAppID2 = atd.bc.getDeviceData.getSDKAppID();
        return (RuntimeErrorEvent) getDeviceData(atd.bc.getDeviceData.getSDKAppID(), sDKAppID2, -500890710, sDKAppID, 500890710, atd.bc.getDeviceData.getSDKAppID(), new Object[]{getsdkreferencenumber, getsdkreferencenumber2, str, getsdkephemeralpublickey, str2});
    }

    @NotNull
    public static final ProtocolErrorEvent getSDKTransactionID(@NotNull getSDKReferenceNumber getsdkreferencenumber, @NotNull atd.ao.getSDKReferenceNumber getsdkreferencenumber2, @Nullable String str, @NotNull getSDKEphemeralPublicKey getsdkephemeralpublickey, @NotNull atd.am.getSDKReferenceNumber getsdkreferencenumber3, @Nullable String str2) {
        int sDKAppID = atd.bc.getDeviceData.getSDKAppID();
        int sDKAppID2 = atd.bc.getDeviceData.getSDKAppID();
        return (ProtocolErrorEvent) getDeviceData(atd.bc.getDeviceData.getSDKAppID(), sDKAppID2, 1168736133, sDKAppID, -1168736132, atd.bc.getDeviceData.getSDKAppID(), new Object[]{getsdkreferencenumber, getsdkreferencenumber2, str, getsdkephemeralpublickey, getsdkreferencenumber3, str2});
    }
}
