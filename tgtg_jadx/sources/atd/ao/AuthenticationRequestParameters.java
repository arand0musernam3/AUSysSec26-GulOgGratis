package atd.ao;

import atd.bc.getSDKTransactionID;
import atd.y.ChallengeResultCompleted;
import atd.z.getSDKAppID;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import r8.k;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0002\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\b\f\u0010\r*\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0004\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\b\u0010\u0010\r*\u0004\b\u000f\u0010\u000bR\u000e\u0010\u0011\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\b\u0013\u0010\r*\u0004\b\u0012\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/adyen/threeds2/internal/result/models/DeviceIdentifiers;", "", "platform", "", "platformVersion", "model", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "_platform", "Lcom/adyen/threeds2/internal/util/DestroyableString;", "getPlatform$delegate", "(Lcom/adyen/threeds2/internal/result/models/DeviceIdentifiers;)Ljava/lang/Object;", "getPlatform", "()Ljava/lang/String;", "_platformVersion", "getPlatformVersion$delegate", "getPlatformVersion", "_model", "getModel$delegate", "getModel", "destroy", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AuthenticationRequestParameters {
    private static int ChallengeResultCancelled = 1;
    private static /* synthetic */ KProperty<Object>[] getDeviceData = {Reflection.property1(new PropertyReference1Impl(AuthenticationRequestParameters.class, "platform", "getPlatform()Ljava/lang/String;", 0)), Reflection.property1(new PropertyReference1Impl(AuthenticationRequestParameters.class, "platformVersion", "getPlatformVersion()Ljava/lang/String;", 0)), Reflection.property1(new PropertyReference1Impl(AuthenticationRequestParameters.class, "model", "getModel()Ljava/lang/String;", 0))};
    private static int getMessageVersion = 1;
    private static int getSDKEphemeralPublicKey;
    private static int getSDKTransactionID;

    @NotNull
    private final atd.bc.AuthenticationRequestParameters AuthenticationRequestParameters;

    @NotNull
    private final atd.bc.AuthenticationRequestParameters getSDKAppID;

    @NotNull
    private final atd.bc.AuthenticationRequestParameters getSDKReferenceNumber;

    static {
        int i11 = getMessageVersion;
        getSDKEphemeralPublicKey = a0.d((i11 | 36) << 1, i11 ^ 36, 1, 128);
    }

    public AuthenticationRequestParameters(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        a0.C(str, str2, str3);
        this.getSDKReferenceNumber = new atd.bc.AuthenticationRequestParameters(str);
        this.getSDKAppID = new atd.bc.AuthenticationRequestParameters(str2);
        this.AuthenticationRequestParameters = new atd.bc.AuthenticationRequestParameters(str3);
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) {
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
        int i11 = getSDKTransactionID;
        int i12 = i11 & 111;
        ChallengeResultCancelled = (i12 + ((i11 ^ 111) | i12)) % 128;
        String str = (String) atd.bc.AuthenticationRequestParameters.getDeviceData(getSDKAppID.getSDKTransactionID.getSDKAppID(), 889709166, -889709163, getSDKAppID.getSDKTransactionID.getSDKAppID(), new Object[]{authenticationRequestParameters.AuthenticationRequestParameters, getDeviceData[2]}, getSDKAppID.getSDKTransactionID.getSDKAppID(), getSDKAppID.getSDKTransactionID.getSDKAppID());
        int i13 = getSDKTransactionID;
        int i14 = ((i13 & 59) - (~(i13 | 59))) - 1;
        ChallengeResultCancelled = i14 % 128;
        if (i14 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static /* synthetic */ Object getSDKAppID(int i11, int i12, int i13, Object[] objArr, int i14, int i15, int i16) {
        int i17 = ~i14;
        int i18 = (~(i17 | i11)) | i13;
        int i19 = i11 | i13 | i17;
        int i21 = (2111832064 * i12) + (1488977920 * i15) + ((-18874368) * i16) + (953110385 * i17) + ((-953110385) * i19) + (i18 * (-953110385)) + (934236018 * i14) + ((i13 * 934236018) - 2089811968);
        int iC = a0.c(i12, -617157175, (1159740906 * i15) + i13 + i14 + i16);
        int i22 = i19 * (-923);
        int i23 = i17 * 923;
        int i24 = i16 * (-824977973);
        int i25 = i15 * (-135083378);
        int i26 = i12 * 1125239651;
        int iE = a0.e(iC, 298844160, i26 + i25 + i24 + i23 + i22 + (i18 * (-923)) + (i14 * (-824977050)) + (i13 * (-824977050)) + 1921657099, 2098200576, (2070937600 * iC) + i21);
        if (iE != 1) {
            if (iE == 2) {
                return getDeviceData(objArr);
            }
            if (iE != 3) {
                return getSDKAppID(objArr);
            }
            AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
            int i27 = ChallengeResultCancelled;
            getSDKTransactionID = (((i27 | 87) << 1) - (i27 ^ 87)) % 128;
            String str = (String) atd.bc.AuthenticationRequestParameters.getDeviceData(getSDKAppID.getSDKTransactionID.getSDKAppID(), 889709166, -889709163, getSDKAppID.getSDKTransactionID.getSDKAppID(), new Object[]{authenticationRequestParameters.getSDKAppID, getDeviceData[1]}, getSDKAppID.getSDKTransactionID.getSDKAppID(), getSDKAppID.getSDKTransactionID.getSDKAppID());
            int i28 = getSDKTransactionID;
            int i29 = i28 & 9;
            ChallengeResultCancelled = (((i28 | 9) & (~i29)) + (i29 << 1)) % 128;
            return str;
        }
        AuthenticationRequestParameters authenticationRequestParameters2 = (AuthenticationRequestParameters) objArr[0];
        int i31 = getSDKTransactionID;
        int i32 = i31 ^ 119;
        int i33 = -(-((i31 & 119) << 1));
        int i34 = (i32 & i33) + (i33 | i32);
        ChallengeResultCancelled = i34 % 128;
        int i35 = i34 % 2;
        atd.bc.AuthenticationRequestParameters authenticationRequestParameters3 = authenticationRequestParameters2.getSDKReferenceNumber;
        KProperty<Object>[] kPropertyArr = getDeviceData;
        if (i35 == 0) {
            return (String) atd.bc.AuthenticationRequestParameters.getDeviceData(getSDKAppID.getSDKTransactionID.getSDKAppID(), 889709166, -889709163, getSDKAppID.getSDKTransactionID.getSDKAppID(), new Object[]{authenticationRequestParameters3, kPropertyArr[1]}, getSDKAppID.getSDKTransactionID.getSDKAppID(), getSDKAppID.getSDKTransactionID.getSDKAppID());
        }
        return (String) atd.bc.AuthenticationRequestParameters.getDeviceData(getSDKAppID.getSDKTransactionID.getSDKAppID(), 889709166, -889709163, getSDKAppID.getSDKTransactionID.getSDKAppID(), new Object[]{authenticationRequestParameters3, kPropertyArr[0]}, getSDKAppID.getSDKTransactionID.getSDKAppID(), getSDKAppID.getSDKTransactionID.getSDKAppID());
    }

    @NotNull
    public final String AuthenticationRequestParameters() {
        int sDKReferenceNumber = ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber2 = ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber3 = ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber();
        return (String) getSDKAppID(sDKReferenceNumber, ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber(), -1292630607, new Object[]{this}, 1292630608, sDKReferenceNumber3, sDKReferenceNumber2);
    }

    @NotNull
    public final String getSDKTransactionID() {
        int sDKReferenceNumber = ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber2 = ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber3 = ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber();
        return (String) getSDKAppID(sDKReferenceNumber, ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber(), 571649277, new Object[]{this}, -571649275, sDKReferenceNumber3, sDKReferenceNumber2);
    }

    public final void getDeviceData() {
        int sDKReferenceNumber = ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber2 = ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber3 = ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber();
        getSDKAppID(sDKReferenceNumber, ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber(), 2128887261, new Object[]{this}, -2128887261, sDKReferenceNumber3, sDKReferenceNumber2);
    }

    private static /* synthetic */ Object getSDKAppID(Object[] objArr) throws getSDKTransactionID {
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
        int i11 = getSDKTransactionID;
        ChallengeResultCancelled = k.c(i11 ^ 2, (i11 & 2) << 1, 1, 128);
        Object[] objArr2 = {authenticationRequestParameters.getSDKReferenceNumber};
        atd.bc.AuthenticationRequestParameters.getDeviceData(getSDKAppID.getSDKTransactionID.getSDKAppID(), 762869508, -762869506, getSDKAppID.getSDKTransactionID.getSDKAppID(), objArr2, getSDKAppID.getSDKTransactionID.getSDKAppID(), getSDKAppID.getSDKTransactionID.getSDKAppID());
        Object[] objArr3 = {authenticationRequestParameters.getSDKAppID};
        atd.bc.AuthenticationRequestParameters.getDeviceData(getSDKAppID.getSDKTransactionID.getSDKAppID(), 762869508, -762869506, getSDKAppID.getSDKTransactionID.getSDKAppID(), objArr3, getSDKAppID.getSDKTransactionID.getSDKAppID(), getSDKAppID.getSDKTransactionID.getSDKAppID());
        Object[] objArr4 = {authenticationRequestParameters.AuthenticationRequestParameters};
        atd.bc.AuthenticationRequestParameters.getDeviceData(getSDKAppID.getSDKTransactionID.getSDKAppID(), 762869508, -762869506, getSDKAppID.getSDKTransactionID.getSDKAppID(), objArr4, getSDKAppID.getSDKTransactionID.getSDKAppID(), getSDKAppID.getSDKTransactionID.getSDKAppID());
        int i12 = getSDKTransactionID;
        int i13 = (i12 & (-4)) | ((~i12) & 3);
        int i14 = -(-((i12 & 3) << 1));
        int i15 = (i13 & i14) + (i14 | i13);
        ChallengeResultCancelled = i15 % 128;
        if (i15 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @NotNull
    public final String getSDKAppID() {
        int sDKReferenceNumber = ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber2 = ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber3 = ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber();
        return (String) getSDKAppID(sDKReferenceNumber, ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber(), 1952063035, new Object[]{this}, -1952063032, sDKReferenceNumber3, sDKReferenceNumber2);
    }
}
