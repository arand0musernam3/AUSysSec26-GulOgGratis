package atd.ar;

import android.content.Context;
import atd.as.getMessageVersion;
import atd.k.ChallengeResultError;
import com.adyen.threeds2.Warning;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import u70.o;
import u70.p;
import u70.q;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/adyen/threeds2/internal/security/DeviceLockSecurityCheck;", "Lcom/adyen/threeds2/internal/security/SecurityCheck;", "deviceLockChecker", "Lcom/adyen/threeds2/internal/security/checker/DeviceLockChecker;", "<init>", "(Lcom/adyen/threeds2/internal/security/checker/DeviceLockChecker;)V", "warning", "Lcom/adyen/threeds2/Warning;", "getWarning", "()Lcom/adyen/threeds2/Warning;", "shouldWarn", "", "context", "Landroid/content/Context;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKAppID extends AuthenticationRequestParameters {
    private static int getDeviceData = 0;
    private static int getSDKAppID = 1;

    @NotNull
    private final atd.aq.getSDKAppID getSDKTransactionID;

    public getSDKAppID(@NotNull atd.aq.getSDKAppID getsdkappid) {
        getsdkappid.getClass();
        this.getSDKTransactionID = getsdkappid;
    }

    public static /* synthetic */ Object getDeviceData(int i11, int i12, Object[] objArr, int i13, int i14, int i15, int i16) {
        int i17 = ~i16;
        int i18 = i14 | i17 | (~i12);
        int i19 = ~i14;
        int i21 = (~(i12 | i17)) | (~(i17 | i19));
        int i22 = ((-742522880) * i13) + ((-1056047104) * i11) + ((-669908992) * i15) + ((-4778405) * i21) + (i19 * (-4778405)) + (4778405 * i18) + ((-674687396) * i14) + (((-665130586) * i16) - 357761024);
        int iC = a0.c(i13, 1942122663, ((-92689393) * i11) + i16 + i14 + i15);
        return a0.e(iC, 173867008, (i13 * (-1279783457)) + ((i11 * 439444615) + ((i15 * 1048061961) + ((i21 * 307) + ((i19 * 307) + ((i18 * (-307)) + ((i14 * 1048062268) + ((i16 * 1048061654) + 1366922925))))))), -1898250240, ((-592117760) * iC) + i22) != 1 ? AuthenticationRequestParameters(objArr) : getSDKReferenceNumber(objArr);
    }

    private static Object getSDKReferenceNumber(Object[] objArr) {
        Object pVar;
        boolean z11 = false;
        getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
        Context context = (Context) objArr[1];
        int i11 = getDeviceData;
        int i12 = i11 & 35;
        int i13 = ((i11 ^ 35) | i12) << 1;
        int i14 = -((i11 | 35) & (~i12));
        getSDKAppID = (((i13 | i14) << 1) - (i14 ^ i13)) % 128;
        context.getClass();
        try {
            o oVar = q.f40850b;
            if (getsdkappid.getSDKTransactionID.getSDKTransactionID(context)) {
                getSDKAppID = (getDeviceData + 59) % 128;
            } else {
                int iIdentityHashCode = System.identityHashCode(getsdkappid);
                int i15 = ~iIdentityHashCode;
                int i16 = 116911081 ^ i15;
                int i17 = 116911081 & i15;
                int i18 = (i17 & i16) | (i16 ^ i17);
                int i19 = (i18 | (~i18)) & (~i18);
                int i21 = i19 ^ 1224741892;
                int i22 = i19 & 1224741892;
                int i23 = (i22 & i21) | (i21 ^ i22);
                int i24 = (-34023881) & iIdentityHashCode;
                int i25 = ~(i24 | ((~i24) & ((-34023881) | iIdentityHashCode)));
                int i26 = i23 & i25;
                int i27 = (i23 | i25) & (~i26);
                int i28 = ((i27 & i26) | (i27 ^ i26)) * (-713);
                int i29 = 1448845068 & i28;
                int i31 = ((~((iIdentityHashCode & (-34023881)) | ((-34023881) & i15) | (34023880 & iIdentityHashCode))) * 1426) + ((i29 - (~((i28 ^ 1448845068) | i29))) - 1);
                int i32 = 1307629093 ^ i15;
                int i33 = i15 & 1307629093;
                int i34 = (i33 & i32) | (i32 ^ i33);
                int i35 = -(~(((i34 | (~i34)) & (~i34)) * 713));
                int i36 = ((i31 ^ i35) + ((i31 & i35) << 1)) - 1;
                int sDKReferenceNumber = ChallengeResultError.getDeviceData.getSDKReferenceNumber();
                int i37 = ~sDKReferenceNumber;
                int i38 = (1331244857 & i37) | ((~i37) & (-1331244858));
                int i39 = i37 & (-1331244858);
                int i41 = ~((i38 & i39) | (i38 ^ i39));
                int i42 = (-1225811093) & i41;
                int i43 = (i41 | (-1225811093)) & (~i42);
                int i44 = -(~(-(-(((i43 & i42) | (i43 ^ i42)) * (-1042)))));
                int i45 = (((834328062 | i44) << 1) - (i44 ^ 834328062)) - 1;
                int i46 = (-1331244858) & sDKReferenceNumber;
                int i47 = (~i46) & ((-1331244858) | sDKReferenceNumber);
                int i48 = ~sDKReferenceNumber;
                int i49 = -(-(((i46 & i47) | (i47 ^ i46)) * 521));
                int i51 = (i45 ^ i49) + ((i49 & i45) << 1);
                int i52 = (1225811092 & i48) | (sDKReferenceNumber & (-1225811093));
                int i53 = 1225811092 & sDKReferenceNumber;
                int i54 = ~((i53 & i52) | (i52 ^ i53));
                int i55 = (-1331261374) & i54;
                int i56 = (i54 | (-1331261374)) & (~i55);
                int i57 = (i56 & i55) | (i56 ^ i55);
                int i58 = (sDKReferenceNumber | i48) & i37;
                int i59 = (i58 & (-1225811093)) | (i58 ^ (-1225811093));
                int i61 = i59 & (-1331244858);
                int i62 = (i59 | (-1331244858)) & (~i61);
                int i63 = ~((i62 & i61) | (i62 ^ i61));
                int i64 = ((~i63) & i57) | ((~i57) & i63);
                int i65 = i63 & i57;
                int i66 = -(-(((i65 & i64) | (i64 ^ i65)) * 521));
                int i67 = i51 & i66;
                int i68 = (i66 | i51) & (~i67);
                int i69 = -(-(i67 << 1));
                if (i36 <= (i68 & i69) + (i68 | i69)) {
                    z11 = true;
                }
            }
            pVar = Boolean.valueOf(z11);
            int i71 = getDeviceData;
            int i72 = i71 & 71;
            getSDKAppID = (((i71 | 71) & (~i72)) + (i72 << 1)) % 128;
        } catch (Throwable th2) {
            o oVar2 = q.f40850b;
            pVar = new p(th2);
        }
        Object obj = Boolean.TRUE;
        if (pVar instanceof p) {
            int i73 = getDeviceData;
            int i74 = i73 & 93;
            int i75 = -(-(i73 | 93));
            int i76 = (i74 & i75) + (i74 | i75);
            getSDKAppID = i76 % 128;
            if (i76 % 2 == 0) {
                throw null;
            }
            int i77 = (i73 & (-22)) | ((~i73) & 21);
            int i78 = -(-((i73 & 21) << 1));
            getSDKAppID = ((i77 ^ i78) + ((i78 & i77) << 1)) % 128;
            pVar = obj;
        } else {
            int i79 = getDeviceData;
            int i81 = i79 & 87;
            int i82 = (i79 | 87) & (~i81);
            int i83 = i81 << 1;
            getSDKAppID = ((i82 & i83) + (i82 | i83)) % 128;
        }
        Boolean bool = (Boolean) pVar;
        int i84 = getDeviceData;
        int i85 = i84 ^ 73;
        int i86 = -(-((i84 & 73) << 1));
        getSDKAppID = ((i85 ^ i86) + ((i86 & i85) << 1)) % 128;
        return bool;
    }

    @Override // atd.ar.AuthenticationRequestParameters
    public final boolean AuthenticationRequestParameters(@NotNull Context context) {
        int sDKReferenceNumber = ChallengeResultError.getDeviceData.getSDKReferenceNumber();
        int sDKReferenceNumber2 = ChallengeResultError.getDeviceData.getSDKReferenceNumber();
        return ((Boolean) getDeviceData(ChallengeResultError.getDeviceData.getSDKReferenceNumber(), sDKReferenceNumber, new Object[]{this, context}, ChallengeResultError.getDeviceData.getSDKReferenceNumber(), 117339568, sDKReferenceNumber2, -117339567)).booleanValue();
    }

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
        int i11 = getDeviceData;
        int i12 = i11 & 57;
        int i13 = ((((i11 ^ 57) | i12) << 1) - (~(-((i11 | 57) & (~i12))))) - 1;
        getSDKAppID = i13 % 128;
        int i14 = i13 % 2;
        getMessageVersion getmessageversion = getMessageVersion.getDeviceData;
        if (i14 != 0) {
            return getmessageversion;
        }
        throw null;
    }

    @Override // atd.ar.AuthenticationRequestParameters
    @NotNull
    public final Warning AuthenticationRequestParameters() {
        int sDKReferenceNumber = ChallengeResultError.getDeviceData.getSDKReferenceNumber();
        int sDKReferenceNumber2 = ChallengeResultError.getDeviceData.getSDKReferenceNumber();
        return (Warning) getDeviceData(ChallengeResultError.getDeviceData.getSDKReferenceNumber(), sDKReferenceNumber, new Object[]{this}, ChallengeResultError.getDeviceData.getSDKReferenceNumber(), -238718523, sDKReferenceNumber2, 238718523);
    }
}
