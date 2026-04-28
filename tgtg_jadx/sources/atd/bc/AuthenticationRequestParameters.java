package atd.bc;

import atd.z.getSDKAppID;
import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u0007\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u00012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0086\u0002J\b\u0010\f\u001a\u00020\u0003H\u0002J\u0006\u0010\r\u001a\u00020\u000eR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/adyen/threeds2/internal/util/DestroyableString;", "", "value", "", "<init>", "(Ljava/lang/String;)V", "_value", "getValue", "()Ljava/lang/String;", "thisRef", "property", "Lkotlin/reflect/KProperty;", "get", "destroy", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AuthenticationRequestParameters {
    private static int AuthenticationRequestParameters = 0;
    private static int getDeviceData = 1;

    @Nullable
    private String getSDKTransactionID;

    public AuthenticationRequestParameters(@NotNull String str) {
        str.getClass();
        this.getSDKTransactionID = str;
    }

    private final String AuthenticationRequestParameters() {
        int sDKAppID = getSDKAppID.getSDKTransactionID.getSDKAppID();
        int sDKAppID2 = getSDKAppID.getSDKTransactionID.getSDKAppID();
        return (String) getDeviceData(getSDKAppID.getSDKTransactionID.getSDKAppID(), 11538006, -11538005, sDKAppID, new Object[]{this}, getSDKAppID.getSDKTransactionID.getSDKAppID(), sDKAppID2);
    }

    public static /* synthetic */ Object getDeviceData(int i11, int i12, int i13, int i14, Object[] objArr, int i15, int i16) throws getSDKTransactionID {
        int i17 = ~i14;
        int i18 = (~(i17 | i13)) | i12;
        int i19 = ~i12;
        int i21 = ~(i19 | i13 | i14);
        int i22 = (~(i14 | i19)) | i13 | (~(i17 | i12));
        int i23 = (808452096 * i15) + (1454768128 * i11) + (1303248896 * i16) + ((-14360446) * i22) + (14360446 * i21) + (i18 * 14360446) + (1288888451 * i12) + (1317609343 * i13) + 1063714816;
        int iC = a0.c(i15, -2062754392, ((-381402339) * i11) + i13 + i12 + i16);
        int i24 = i16 * (-1355236397);
        int i25 = i11 * (-1583251481);
        int i26 = i15 * 1682205048;
        int iE = a0.e(iC, -427491328, i26 + i25 + i24 + (i22 * 294) + (i21 * (-294)) + (i18 * (-294)) + (i12 * (-1355236103)) + ((i13 * (-1355236691)) - 921838429), 844169216, ((-1790509056) * iC) + i23);
        if (iE != 1) {
            return iE != 2 ? iE != 3 ? getSDKAppID(objArr) : getSDKTransactionID(objArr) : getSDKReferenceNumber(objArr);
        }
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
        int i27 = getDeviceData;
        int i28 = (((i27 | 47) << 1) - (i27 ^ 47)) % 128;
        AuthenticationRequestParameters = i28;
        String str = authenticationRequestParameters.getSDKTransactionID;
        if (str == null) {
            throw new getSDKTransactionID();
        }
        getDeviceData = (i28 + 67) % 128;
        return str;
    }

    private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
        int i11 = getDeviceData;
        int i12 = i11 ^ 31;
        int i13 = -(-((i11 & 31) << 1));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        AuthenticationRequestParameters = i14 % 128;
        if (i14 % 2 == 0) {
            int sDKAppID = getSDKAppID.getSDKTransactionID.getSDKAppID();
            int sDKAppID2 = getSDKAppID.getSDKTransactionID.getSDKAppID();
            return (String) getDeviceData(getSDKAppID.getSDKTransactionID.getSDKAppID(), 11538006, -11538005, sDKAppID, new Object[]{authenticationRequestParameters}, getSDKAppID.getSDKTransactionID.getSDKAppID(), sDKAppID2);
        }
        int sDKAppID3 = getSDKAppID.getSDKTransactionID.getSDKAppID();
        int sDKAppID4 = getSDKAppID.getSDKTransactionID.getSDKAppID();
        throw null;
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
        int i11 = getDeviceData;
        int i12 = ((i11 | 83) << 1) - (i11 ^ 83);
        int i13 = i12 % 128;
        AuthenticationRequestParameters = i13;
        if (i12 % 2 != 0) {
            authenticationRequestParameters.getSDKTransactionID = null;
            int i14 = 43 / 0;
        } else {
            authenticationRequestParameters.getSDKTransactionID = null;
        }
        int i15 = ((i13 | 5) << 1) - (i13 ^ 5);
        getDeviceData = i15 % 128;
        if (i15 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
        KProperty kProperty = (KProperty) objArr[1];
        int i11 = AuthenticationRequestParameters;
        int i12 = i11 & 43;
        int i13 = (i11 | 43) & (~i12);
        int i14 = -(-(i12 << 1));
        int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
        getDeviceData = i15 % 128;
        if (i15 % 2 != 0) {
            kProperty.getClass();
            int sDKAppID = getSDKAppID.getSDKTransactionID.getSDKAppID();
            int sDKAppID2 = getSDKAppID.getSDKTransactionID.getSDKAppID();
            return (String) getDeviceData(getSDKAppID.getSDKTransactionID.getSDKAppID(), 11538006, -11538005, sDKAppID, new Object[]{authenticationRequestParameters}, getSDKAppID.getSDKTransactionID.getSDKAppID(), sDKAppID2);
        }
        kProperty.getClass();
        int sDKAppID3 = getSDKAppID.getSDKTransactionID.getSDKAppID();
        throw null;
    }

    @NotNull
    public final String getSDKTransactionID(@NotNull KProperty<?> kProperty) {
        int sDKAppID = getSDKAppID.getSDKTransactionID.getSDKAppID();
        int sDKAppID2 = getSDKAppID.getSDKTransactionID.getSDKAppID();
        return (String) getDeviceData(getSDKAppID.getSDKTransactionID.getSDKAppID(), 889709166, -889709163, sDKAppID, new Object[]{this, kProperty}, getSDKAppID.getSDKTransactionID.getSDKAppID(), sDKAppID2);
    }

    @NotNull
    public final String getSDKTransactionID() {
        int sDKAppID = getSDKAppID.getSDKTransactionID.getSDKAppID();
        int sDKAppID2 = getSDKAppID.getSDKTransactionID.getSDKAppID();
        return (String) getDeviceData(getSDKAppID.getSDKTransactionID.getSDKAppID(), -600043858, 600043858, sDKAppID, new Object[]{this}, getSDKAppID.getSDKTransactionID.getSDKAppID(), sDKAppID2);
    }

    public final void getDeviceData() throws getSDKTransactionID {
        int sDKAppID = getSDKAppID.getSDKTransactionID.getSDKAppID();
        int sDKAppID2 = getSDKAppID.getSDKTransactionID.getSDKAppID();
        getDeviceData(getSDKAppID.getSDKTransactionID.getSDKAppID(), 762869508, -762869506, sDKAppID, new Object[]{this}, getSDKAppID.getSDKTransactionID.getSDKAppID(), sDKAppID2);
    }
}
