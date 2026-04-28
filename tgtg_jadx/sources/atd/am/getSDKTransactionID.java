package atd.am;

import atd.w.getErrorDescription;
import atd.y.timedout;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import e40.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0002\u0005\u0006J\r\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/result/Result;", "T", "", "getOrThrow", "()Ljava/lang/Object;", "Success", "Failure", "Lcom/adyen/threeds2/internal/result/Result$Failure;", "Lcom/adyen/threeds2/internal/result/Result$Success;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface getSDKTransactionID<T> {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKReferenceNumber {
        private static int getSDKReferenceNumber = 0;
        private static int getSDKTransactionID = 1;

        public static <T> T getDeviceData(@NotNull getSDKTransactionID<? extends T> getsdktransactionid) throws Throwable {
            int i11 = getSDKTransactionID;
            int i12 = (i11 ^ 31) + ((i11 & 31) << 1);
            int i13 = i12 % 128;
            getSDKReferenceNumber = i13;
            if (i12 % 2 != 0) {
                throw null;
            }
            if (getsdktransactionid instanceof getDeviceData) {
                int i14 = i11 & 9;
                int i15 = (i11 ^ 9) | i14;
                getSDKReferenceNumber = ((i14 ^ i15) + ((i15 & i14) << 1)) % 128;
                T t9 = (T) getDeviceData.getDeviceData(-568881259, 568881263, new Object[]{(getDeviceData) getsdktransactionid}, timedout.AuthenticationRequestParameters.getSDKAppID(), timedout.AuthenticationRequestParameters.getSDKAppID(), timedout.AuthenticationRequestParameters.getSDKAppID(), timedout.AuthenticationRequestParameters.getSDKAppID());
                int i16 = getSDKReferenceNumber;
                int i17 = ((i16 ^ 11) | (i16 & 11)) << 1;
                int i18 = -(((~i16) & 11) | (i16 & (-12)));
                getSDKTransactionID = ((i17 ^ i18) + ((i18 & i17) << 1)) % 128;
                return t9;
            }
            if (!(getsdktransactionid instanceof getSDKAppID)) {
                a.f();
                return null;
            }
            int i19 = i13 & 3;
            int i21 = (i19 - (~(-(-((i13 ^ 3) | i19))))) - 1;
            getSDKTransactionID = i21 % 128;
            if (i21 % 2 != 0) {
                int sDKTransactionID = getErrorDescription.getSDKReferenceNumber.getSDKTransactionID();
                throw ((Throwable) getSDKAppID.getDeviceData(459137417, getErrorDescription.getSDKReferenceNumber.getSDKTransactionID(), -459137410, getErrorDescription.getSDKReferenceNumber.getSDKTransactionID(), new Object[]{(getSDKAppID) getsdktransactionid}, getErrorDescription.getSDKReferenceNumber.getSDKTransactionID(), sDKTransactionID));
            }
            int sDKTransactionID2 = getErrorDescription.getSDKReferenceNumber.getSDKTransactionID();
            int i22 = 40 / 0;
            throw ((Throwable) getSDKAppID.getDeviceData(459137417, getErrorDescription.getSDKReferenceNumber.getSDKTransactionID(), -459137410, getErrorDescription.getSDKReferenceNumber.getSDKTransactionID(), new Object[]{(getSDKAppID) getsdktransactionid}, getErrorDescription.getSDKReferenceNumber.getSDKTransactionID(), sDKTransactionID2));
        }
    }

    T getSDKAppID();

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/adyen/threeds2/internal/result/Result$Failure;", "Lcom/adyen/threeds2/internal/result/Result;", "", StatusResponse.RESULT_CODE, "Lcom/adyen/threeds2/internal/result/ResultCode;", "cause", "", "messageField", "Lcom/adyen/threeds2/internal/result/MessageField;", "transactionIdentifiers", "Lcom/adyen/threeds2/internal/result/models/TransactionIdentifiers;", "<init>", "(Lcom/adyen/threeds2/internal/result/ResultCode;Ljava/lang/Throwable;Lcom/adyen/threeds2/internal/result/MessageField;Lcom/adyen/threeds2/internal/result/models/TransactionIdentifiers;)V", "getResultCode", "()Lcom/adyen/threeds2/internal/result/ResultCode;", "getCause", "()Ljava/lang/Throwable;", "getMessageField", "()Lcom/adyen/threeds2/internal/result/MessageField;", "getTransactionIdentifiers", "()Lcom/adyen/threeds2/internal/result/models/TransactionIdentifiers;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class getSDKAppID implements getSDKTransactionID {
        private static int getMessageVersion = 1;
        private static int getSDKAppID;

        @NotNull
        private final Throwable AuthenticationRequestParameters;

        @NotNull
        private final atd.ao.getSDKReferenceNumber getDeviceData;

        @NotNull
        private final atd.am.getSDKReferenceNumber getSDKReferenceNumber;

        @NotNull
        private final getSDKEphemeralPublicKey getSDKTransactionID;

        private getSDKAppID(@NotNull getSDKEphemeralPublicKey getsdkephemeralpublickey, @NotNull Throwable th2, @NotNull atd.am.getSDKReferenceNumber getsdkreferencenumber, @NotNull atd.ao.getSDKReferenceNumber getsdkreferencenumber2) {
            getsdkephemeralpublickey.getClass();
            th2.getClass();
            getsdkreferencenumber.getClass();
            getsdkreferencenumber2.getClass();
            this.getSDKTransactionID = getsdkephemeralpublickey;
            this.AuthenticationRequestParameters = th2;
            this.getSDKReferenceNumber = getsdkreferencenumber;
            this.getDeviceData = getsdkreferencenumber2;
        }

        private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
            getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
            int i11 = getMessageVersion;
            int i12 = ((i11 & 25) - (~(i11 | 25))) - 1;
            getSDKAppID = i12 % 128;
            if (i12 % 2 != 0) {
                int sDKTransactionID = getErrorDescription.getSDKReferenceNumber.getSDKTransactionID();
                throw null;
            }
            int sDKTransactionID2 = getErrorDescription.getSDKReferenceNumber.getSDKTransactionID();
            Void r92 = (Void) getDeviceData(-1445309149, getErrorDescription.getSDKReferenceNumber.getSDKTransactionID(), 1445309157, getErrorDescription.getSDKReferenceNumber.getSDKTransactionID(), new Object[]{getsdkappid}, getErrorDescription.getSDKReferenceNumber.getSDKTransactionID(), sDKTransactionID2);
            getMessageVersion = ((-2) - ((getSDKAppID + 28) ^ (-1))) % 128;
            return r92;
        }

        @NotNull
        private Void BuildConfig() {
            int sDKTransactionID = getErrorDescription.getSDKReferenceNumber.getSDKTransactionID();
            int sDKTransactionID2 = getErrorDescription.getSDKReferenceNumber.getSDKTransactionID();
            int sDKTransactionID3 = getErrorDescription.getSDKReferenceNumber.getSDKTransactionID();
            return (Void) getDeviceData(-1445309149, sDKTransactionID2, 1445309157, getErrorDescription.getSDKReferenceNumber.getSDKTransactionID(), new Object[]{this}, sDKTransactionID3, sDKTransactionID);
        }

        private static /* synthetic */ Object ChallengeResultCancelled(Object[] objArr) {
            getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
            StringBuilder sb2 = new StringBuilder("Failure(resultCode=");
            sb2.append(getsdkappid.getSDKTransactionID);
            sb2.append(", cause=");
            sb2.append(getsdkappid.AuthenticationRequestParameters);
            sb2.append(", messageField=");
            sb2.append(getsdkappid.getSDKReferenceNumber);
            sb2.append(", transactionIdentifiers=");
            sb2.append(getsdkappid.getDeviceData);
            sb2.append(')');
            String string = sb2.toString();
            int i11 = getMessageVersion;
            int i12 = i11 & 119;
            int i13 = (i11 | 119) & (~i12);
            int i14 = i12 << 1;
            int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
            getSDKAppID = i15 % 128;
            if (i15 % 2 == 0) {
                return string;
            }
            throw null;
        }

        public static /* synthetic */ Object getDeviceData(int i11, int i12, int i13, int i14, Object[] objArr, int i15, int i16) {
            int i17 = (~((~i16) | i11)) | i13;
            int i18 = ~i13;
            int i19 = (~(i18 | i11)) | (~(i18 | i16)) | (~(i11 | i16));
            int i21 = (~(i16 | (~i11))) | i18;
            int i22 = ((-1807745024) * i14) + ((-1247805440) * i15) + ((-1290797056) * i12) + ((-1717982222) * i21) + (1717982222 * i19) + (i17 * 1717982222) + (427185167 * i11) + (((-431794203) * i13) - 566755328);
            int iC = a0.c(i14, 111092868, ((-2137991558) * i15) + i13 + i11 + i12);
            switch (a0.e(iC, -1529348096, (i14 * (-746069772)) + (i15 * 1951436498) + (i12 * (-1469268067)) + (i21 * 362) + (i19 * (-362)) + (i17 * (-362)) + (i11 * (-1469268429)) + (i13 * (-1469267343)) + 1003592187, 1762131968, ((-591921152) * iC) + i22)) {
                case 1:
                    return getSDKAppID(objArr);
                case 2:
                    return getDeviceData(objArr);
                case 3:
                    return AuthenticationRequestParameters(objArr);
                case 4:
                    return getSDKReferenceNumber(objArr);
                case 5:
                    return ChallengeResultCancelled(objArr);
                case 6:
                    getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
                    int i23 = getSDKAppID;
                    int i24 = ((i23 ^ 43) + ((i23 & 43) << 1)) % 128;
                    getMessageVersion = i24;
                    atd.ao.getSDKReferenceNumber getsdkreferencenumber = getsdkappid.getDeviceData;
                    int i25 = i24 & 59;
                    int i26 = (i24 | 59) & (~i25);
                    int i27 = i25 << 1;
                    getSDKAppID = ((i26 & i27) + (i27 | i26)) % 128;
                    return getsdkreferencenumber;
                case 7:
                    return getMessageVersion(objArr);
                case 8:
                    return getSDKEphemeralPublicKey(objArr);
                default:
                    return getSDKTransactionID(objArr);
            }
        }

        private static /* synthetic */ Object getMessageVersion(Object[] objArr) {
            getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
            int i11 = getMessageVersion;
            int i12 = (i11 ^ 35) + ((i11 & 35) << 1);
            getSDKAppID = i12 % 128;
            int i13 = i12 % 2;
            Throwable th2 = getsdkappid.AuthenticationRequestParameters;
            if (i13 == 0) {
                return th2;
            }
            throw null;
        }

        private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
            getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
            getMessageVersion = (getSDKAppID + 85) % 128;
            int iHashCode = getsdkappid.getSDKTransactionID.hashCode() * 31;
            int i11 = -(-getsdkappid.AuthenticationRequestParameters.hashCode());
            int i12 = ((((iHashCode & i11) + (iHashCode | i11)) * 31) - (~(-(-getsdkappid.getSDKReferenceNumber.hashCode())))) - 1;
            int i13 = i12 * 31;
            int iHashCode2 = getsdkappid.getDeviceData.hashCode();
            int sDKTransactionID = getErrorDescription.getSDKReferenceNumber.getSDKTransactionID();
            int i14 = iHashCode2 * (-167);
            int i15 = -(-(i12 * (-5177)));
            int i16 = i14 ^ i15;
            int i17 = (i15 & i14) << 1;
            int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
            int i19 = ~iHashCode2;
            int i21 = ~i13;
            int i22 = i19 & i21;
            int i23 = ~(((i19 | i21) & (~i22)) | i22);
            int i24 = ~i13;
            int i25 = ~i24;
            int i26 = i24 & sDKTransactionID;
            int i27 = (~i26) & (i24 | sDKTransactionID);
            int i28 = (i26 & i27) | (i27 ^ i26);
            int i29 = (i28 | (~i28)) & (~i28);
            int i31 = -(-(((i23 & i29) | (i23 ^ i29)) * 336));
            int i32 = ((~i31) & i18) | ((~i18) & i31);
            int i33 = -(-((i31 & i18) << 1));
            int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
            int i35 = iHashCode2 ^ i13;
            int i36 = i13 & iHashCode2;
            int i37 = ~((i36 & i35) | (i35 ^ i36));
            int i38 = iHashCode2 & sDKTransactionID;
            int i39 = (~i38) & (iHashCode2 | sDKTransactionID);
            int i41 = (i38 & i39) | (i39 ^ i38);
            int i42 = (i41 | (~i41)) & (~i41);
            int i43 = i37 ^ i42;
            int i44 = i37 & i42;
            int i45 = (((i44 & i43) | (i43 ^ i44)) * (-168)) + i34;
            int i46 = ~sDKTransactionID;
            int i47 = i46 ^ iHashCode2;
            int i48 = iHashCode2 & i46;
            int i49 = ~((i48 & i47) | (i47 ^ i48));
            int i51 = ((~i49) & i24) | (i49 & i25);
            int i52 = i49 & i24;
            int i53 = ((i52 & i51) | (i51 ^ i52)) * 168;
            int i54 = ((i45 | i53) << 1) - (i53 ^ i45);
            int i55 = getMessageVersion;
            int i56 = ((i55 & 113) - (~(-(-(i55 | 113))))) - 1;
            getSDKAppID = i56 % 128;
            if (i56 % 2 == 0) {
                return Integer.valueOf(i54);
            }
            throw null;
        }

        private static /* synthetic */ Object getSDKEphemeralPublicKey(Object[] objArr) {
            getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
            int i11 = getSDKAppID;
            int i12 = i11 & 59;
            int i13 = ((((i11 ^ 59) | i12) << 1) - (~(-((i11 | 59) & (~i12))))) - 1;
            getMessageVersion = i13 % 128;
            int i14 = i13 % 2;
            Void r52 = (Void) getSDKReferenceNumber.getDeviceData(getsdkappid);
            if (i14 == 0) {
                int i15 = 35 / 0;
            }
            int i16 = getSDKAppID;
            int i17 = i16 & 117;
            getMessageVersion = a0.d(i17, ~((i16 ^ 117) | i17), 1, 128);
            return r52;
        }

        private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
            getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
            int i11 = getMessageVersion;
            int i12 = ((i11 ^ 19) | (i11 & 19)) << 1;
            int i13 = -((i11 & (-20)) | ((~i11) & 19));
            int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
            getSDKAppID = i14 % 128;
            int i15 = i14 % 2;
            atd.am.getSDKReferenceNumber getsdkreferencenumber = getsdkappid.getSDKReferenceNumber;
            if (i15 != 0) {
                throw null;
            }
            getSDKAppID = (((i11 | 117) << 1) - (i11 ^ 117)) % 128;
            return getsdkreferencenumber;
        }

        private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
            boolean z11;
            getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
            Object obj = objArr[1];
            int i11 = getSDKAppID;
            int i12 = ((((i11 ^ 71) | (i11 & 71)) << 1) - ((i11 & (-72)) | ((~i11) & 71))) % 128;
            getMessageVersion = i12;
            if (getsdkappid == obj) {
                int i13 = i11 + 25;
                getMessageVersion = i13 % 128;
                z11 = i13 % 2 != 0;
                int i14 = i11 & 23;
                getMessageVersion = (i14 + ((i11 ^ 23) | i14)) % 128;
                return Boolean.valueOf(z11);
            }
            if (!(obj instanceof getSDKAppID)) {
                int i15 = (i12 + 29) % 128;
                getSDKAppID = i15;
                int i16 = (i15 & (-106)) | ((~i15) & 105);
                int i17 = -(-((i15 & 105) << 1));
                int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
                getMessageVersion = i18 % 128;
                if (i18 % 2 != 0) {
                    return Boolean.FALSE;
                }
                throw null;
            }
            getSDKAppID getsdkappid2 = (getSDKAppID) obj;
            if (getsdkappid.getSDKTransactionID != getsdkappid2.getSDKTransactionID) {
                int i19 = i11 & 69;
                int i21 = i19 + ((i11 ^ 69) | i19);
                int i22 = i21 % 128;
                getMessageVersion = i22;
                z11 = i21 % 2 == 0;
                int i23 = ((i22 | 78) << 1) - (i22 ^ 78);
                getSDKAppID = ((i23 ^ (-1)) + (i23 << 1)) % 128;
                return Boolean.valueOf(z11);
            }
            if (!Intrinsics.areEqual(getsdkappid.AuthenticationRequestParameters, getsdkappid2.AuthenticationRequestParameters)) {
                int i24 = getSDKAppID;
                int iC = k.c(i24 ^ 108, (i24 & 108) << 1, 1, 128);
                getMessageVersion = iC;
                int i25 = iC + 17;
                getSDKAppID = i25 % 128;
                if (i25 % 2 == 0) {
                    return Boolean.FALSE;
                }
                throw null;
            }
            if (getsdkappid.getSDKReferenceNumber != getsdkappid2.getSDKReferenceNumber) {
                int i26 = getMessageVersion;
                int i27 = i26 ^ 111;
                int i28 = -(-((i26 & 111) << 1));
                int i29 = ((i27 & i28) + (i28 | i27)) % 128;
                getSDKAppID = i29;
                getMessageVersion = ((i29 & 107) + (i29 | 107)) % 128;
                return Boolean.FALSE;
            }
            if (!Intrinsics.areEqual(getsdkappid.getDeviceData, getsdkappid2.getDeviceData)) {
                int i31 = getMessageVersion;
                int i32 = (i31 | 45) << 1;
                int i33 = -(((~i31) & 45) | (i31 & (-46)));
                int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
                getSDKAppID = i34 % 128;
                return Boolean.valueOf(i34 % 2 != 0);
            }
            int i35 = getSDKAppID;
            int i36 = i35 ^ 1;
            int i37 = (((i35 & 1) | i36) << 1) - i36;
            getMessageVersion = i37 % 128;
            if (i37 % 2 != 0) {
                return Boolean.TRUE;
            }
            int i38 = 91 / 0;
            return Boolean.TRUE;
        }

        public final boolean equals(@Nullable Object other) {
            int sDKTransactionID = getErrorDescription.getSDKReferenceNumber.getSDKTransactionID();
            int sDKTransactionID2 = getErrorDescription.getSDKReferenceNumber.getSDKTransactionID();
            int sDKTransactionID3 = getErrorDescription.getSDKReferenceNumber.getSDKTransactionID();
            return ((Boolean) getDeviceData(969903366, sDKTransactionID2, -969903366, getErrorDescription.getSDKReferenceNumber.getSDKTransactionID(), new Object[]{this, other}, sDKTransactionID3, sDKTransactionID)).booleanValue();
        }

        public final int hashCode() {
            int sDKTransactionID = getErrorDescription.getSDKReferenceNumber.getSDKTransactionID();
            int sDKTransactionID2 = getErrorDescription.getSDKReferenceNumber.getSDKTransactionID();
            int sDKTransactionID3 = getErrorDescription.getSDKReferenceNumber.getSDKTransactionID();
            return ((Integer) getDeviceData(2145784011, sDKTransactionID2, -2145784010, getErrorDescription.getSDKReferenceNumber.getSDKTransactionID(), new Object[]{this}, sDKTransactionID3, sDKTransactionID)).intValue();
        }

        @NotNull
        public final String toString() {
            int sDKTransactionID = getErrorDescription.getSDKReferenceNumber.getSDKTransactionID();
            int sDKTransactionID2 = getErrorDescription.getSDKReferenceNumber.getSDKTransactionID();
            int sDKTransactionID3 = getErrorDescription.getSDKReferenceNumber.getSDKTransactionID();
            return (String) getDeviceData(-923128515, sDKTransactionID2, 923128520, getErrorDescription.getSDKReferenceNumber.getSDKTransactionID(), new Object[]{this}, sDKTransactionID3, sDKTransactionID);
        }

        public /* synthetic */ getSDKAppID(getSDKEphemeralPublicKey getsdkephemeralpublickey, Throwable th2, atd.am.getSDKReferenceNumber getsdkreferencenumber, atd.ao.getSDKReferenceNumber getsdkreferencenumber2, int i11) {
            this(getsdkephemeralpublickey, th2, (i11 & 4) != 0 ? atd.am.getSDKReferenceNumber.NONE : getsdkreferencenumber, (i11 & 8) != 0 ? new atd.ao.getSDKReferenceNumber((byte) 0) : getsdkreferencenumber2);
        }

        @NotNull
        public final getSDKEphemeralPublicKey getSDKReferenceNumber() {
            int sDKTransactionID = getErrorDescription.getSDKReferenceNumber.getSDKTransactionID();
            int sDKTransactionID2 = getErrorDescription.getSDKReferenceNumber.getSDKTransactionID();
            int sDKTransactionID3 = getErrorDescription.getSDKReferenceNumber.getSDKTransactionID();
            return (getSDKEphemeralPublicKey) getDeviceData(-1996195228, sDKTransactionID2, 1996195230, getErrorDescription.getSDKReferenceNumber.getSDKTransactionID(), new Object[]{this}, sDKTransactionID3, sDKTransactionID);
        }

        @NotNull
        public final atd.ao.getSDKReferenceNumber AuthenticationRequestParameters() {
            int sDKTransactionID = getErrorDescription.getSDKReferenceNumber.getSDKTransactionID();
            int sDKTransactionID2 = getErrorDescription.getSDKReferenceNumber.getSDKTransactionID();
            int sDKTransactionID3 = getErrorDescription.getSDKReferenceNumber.getSDKTransactionID();
            return (atd.ao.getSDKReferenceNumber) getDeviceData(-1417671489, sDKTransactionID2, 1417671495, getErrorDescription.getSDKReferenceNumber.getSDKTransactionID(), new Object[]{this}, sDKTransactionID3, sDKTransactionID);
        }

        private static /* synthetic */ Object getDeviceData(Object[] objArr) {
            getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
            int i11 = getMessageVersion;
            int i12 = (((i11 | 101) << 1) - (i11 ^ 101)) % 128;
            getSDKAppID = i12;
            getSDKEphemeralPublicKey getsdkephemeralpublickey = getsdkappid.getSDKTransactionID;
            int i13 = (i12 & 5) + (i12 | 5);
            getMessageVersion = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 55 / 0;
            }
            return getsdkephemeralpublickey;
        }

        @NotNull
        public final Throwable getDeviceData() {
            int sDKTransactionID = getErrorDescription.getSDKReferenceNumber.getSDKTransactionID();
            int sDKTransactionID2 = getErrorDescription.getSDKReferenceNumber.getSDKTransactionID();
            int sDKTransactionID3 = getErrorDescription.getSDKReferenceNumber.getSDKTransactionID();
            return (Throwable) getDeviceData(459137417, sDKTransactionID2, -459137410, getErrorDescription.getSDKReferenceNumber.getSDKTransactionID(), new Object[]{this}, sDKTransactionID3, sDKTransactionID);
        }

        @Override // atd.am.getSDKTransactionID
        public final /* synthetic */ Object getSDKAppID() {
            int sDKTransactionID = getErrorDescription.getSDKReferenceNumber.getSDKTransactionID();
            int sDKTransactionID2 = getErrorDescription.getSDKReferenceNumber.getSDKTransactionID();
            int sDKTransactionID3 = getErrorDescription.getSDKReferenceNumber.getSDKTransactionID();
            return getDeviceData(-804091035, sDKTransactionID2, 804091038, getErrorDescription.getSDKReferenceNumber.getSDKTransactionID(), new Object[]{this}, sDKTransactionID3, sDKTransactionID);
        }

        @NotNull
        public final atd.am.getSDKReferenceNumber getSDKTransactionID() {
            int sDKTransactionID = getErrorDescription.getSDKReferenceNumber.getSDKTransactionID();
            int sDKTransactionID2 = getErrorDescription.getSDKReferenceNumber.getSDKTransactionID();
            int sDKTransactionID3 = getErrorDescription.getSDKReferenceNumber.getSDKTransactionID();
            return (atd.am.getSDKReferenceNumber) getDeviceData(1107655291, sDKTransactionID2, -1107655287, getErrorDescription.getSDKReferenceNumber.getSDKTransactionID(), new Object[]{this}, sDKTransactionID3, sDKTransactionID);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/adyen/threeds2/internal/result/Result$Success;", "T", "Lcom/adyen/threeds2/internal/result/Result;", "value", "<init>", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/adyen/threeds2/internal/result/Result$Success;", "equals", "", "other", "", "hashCode", "", "toString", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class getDeviceData<T> implements getSDKTransactionID<T> {
        private static int AuthenticationRequestParameters = 0;
        private static int getSDKReferenceNumber = 1;
        private final T getDeviceData;

        public getDeviceData(T t9) {
            this.getDeviceData = t9;
        }

        public static /* synthetic */ Object getDeviceData(int i11, int i12, Object[] objArr, int i13, int i14, int i15, int i16) {
            int i17 = (~((~i15) | i12)) | i11;
            int i18 = ~i11;
            int i19 = (~(i18 | i12)) | (~(i18 | i15)) | (~(i12 | i15));
            int i21 = (~(i15 | (~i12))) | i18;
            int i22 = ((-1807745024) * i16) + ((-1247805440) * i14) + ((-1290797056) * i13) + ((-1717982222) * i21) + (1717982222 * i19) + (i17 * 1717982222) + (427185167 * i12) + (((-431794203) * i11) - 566755328);
            int iC = a0.c(i16, 111092868, ((-2137991558) * i14) + i11 + i12 + i13);
            int i23 = i19 * (-362);
            int i24 = i21 * 362;
            int i25 = i13 * (-1469268067);
            int i26 = i14 * 1951436498;
            int i27 = i16 * (-746069772);
            int iE = a0.e(iC, -1529348096, i27 + i26 + i25 + i24 + i23 + (i17 * (-362)) + (i12 * (-1469268429)) + (i11 * (-1469267343)) + 1003592187, 1762131968, ((-591921152) * iC) + i22);
            if (iE == 1) {
                return getSDKTransactionID(objArr);
            }
            if (iE == 2) {
                return getSDKReferenceNumber(objArr);
            }
            if (iE == 3) {
                return getDeviceData(objArr);
            }
            if (iE != 4) {
                return getSDKAppID(objArr);
            }
            getDeviceData getdevicedata = (getDeviceData) objArr[0];
            getSDKReferenceNumber = (AuthenticationRequestParameters + 25) % 128;
            T t9 = getdevicedata.getDeviceData;
            System.identityHashCode(getdevicedata);
            timedout.AuthenticationRequestParameters.getSDKAppID();
            return t9;
        }

        private static /* synthetic */ Object getSDKAppID(Object[] objArr) throws Throwable {
            getDeviceData getdevicedata = (getDeviceData) objArr[0];
            int i11 = AuthenticationRequestParameters;
            getSDKReferenceNumber = a0.d(((i11 ^ 51) | (i11 & 51)) << 1, ~(-(((~i11) & 51) | (i11 & (-52)))), 1, 128);
            Object deviceData = getSDKReferenceNumber.getDeviceData(getdevicedata);
            int i12 = getSDKReferenceNumber;
            int i13 = (((i12 & (-42)) | ((~i12) & 41)) - (~(-(-((i12 & 41) << 1))))) - 1;
            AuthenticationRequestParameters = i13 % 128;
            if (i13 % 2 == 0) {
                return deviceData;
            }
            throw null;
        }

        private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
            getDeviceData getdevicedata = (getDeviceData) objArr[0];
            int i11 = getSDKReferenceNumber;
            int i12 = ((-2) - (((i11 ^ 108) + ((i11 & 108) << 1)) ^ (-1))) % 128;
            AuthenticationRequestParameters = i12;
            T t9 = getdevicedata.getDeviceData;
            if (t9 == null) {
                int i13 = ((i12 & 43) + (i12 | 43)) % 128;
                getSDKReferenceNumber = i13;
                int i14 = i13 & 125;
                AuthenticationRequestParameters = (((i13 | 125) & (~i14)) + (i14 << 1)) % 128;
                return 0;
            }
            int iHashCode = t9.hashCode();
            int i15 = getSDKReferenceNumber + 103;
            AuthenticationRequestParameters = i15 % 128;
            if (i15 % 2 == 0) {
                return Integer.valueOf(iHashCode);
            }
            throw null;
        }

        private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
            getDeviceData getdevicedata = (getDeviceData) objArr[0];
            StringBuilder sb2 = new StringBuilder("Success(value=");
            sb2.append(getdevicedata.getDeviceData);
            sb2.append(')');
            String string = sb2.toString();
            int i11 = AuthenticationRequestParameters;
            int i12 = ((i11 & 48) + (i11 | 48)) - 1;
            getSDKReferenceNumber = i12 % 128;
            if (i12 % 2 != 0) {
                return string;
            }
            throw null;
        }

        public final boolean equals(@Nullable Object other) {
            return ((Boolean) getDeviceData(683443608, -683443605, new Object[]{this, other}, timedout.AuthenticationRequestParameters.getSDKAppID(), timedout.AuthenticationRequestParameters.getSDKAppID(), timedout.AuthenticationRequestParameters.getSDKAppID(), timedout.AuthenticationRequestParameters.getSDKAppID())).booleanValue();
        }

        public final int hashCode() {
            return ((Integer) getDeviceData(-1108981198, 1108981200, new Object[]{this}, timedout.AuthenticationRequestParameters.getSDKAppID(), timedout.AuthenticationRequestParameters.getSDKAppID(), timedout.AuthenticationRequestParameters.getSDKAppID(), timedout.AuthenticationRequestParameters.getSDKAppID())).intValue();
        }

        @NotNull
        public final String toString() {
            return (String) getDeviceData(453354033, -453354032, new Object[]{this}, timedout.AuthenticationRequestParameters.getSDKAppID(), timedout.AuthenticationRequestParameters.getSDKAppID(), timedout.AuthenticationRequestParameters.getSDKAppID(), timedout.AuthenticationRequestParameters.getSDKAppID());
        }

        @Override // atd.am.getSDKTransactionID
        public final T getSDKAppID() {
            return (T) getDeviceData(-498802119, 498802119, new Object[]{this}, timedout.AuthenticationRequestParameters.getSDKAppID(), timedout.AuthenticationRequestParameters.getSDKAppID(), timedout.AuthenticationRequestParameters.getSDKAppID(), timedout.AuthenticationRequestParameters.getSDKAppID());
        }

        private static /* synthetic */ Object getDeviceData(Object[] objArr) {
            getDeviceData getdevicedata = (getDeviceData) objArr[0];
            Object obj = objArr[1];
            int i11 = AuthenticationRequestParameters;
            int i12 = i11 + 99;
            getSDKReferenceNumber = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
            if (getdevicedata == obj) {
                getSDKReferenceNumber = (((i11 | 27) << 1) - (i11 ^ 27)) % 128;
            } else {
                if (!(obj instanceof getDeviceData)) {
                    int i13 = i11 & 31;
                    int i14 = (~i13) & (i11 | 31);
                    int i15 = i13 << 1;
                    int i16 = (i14 & i15) + (i15 | i14);
                    getSDKReferenceNumber = i16 % 128;
                    return Boolean.valueOf(i16 % 2 == 0);
                }
                if (!Intrinsics.areEqual(getdevicedata.getDeviceData, ((getDeviceData) obj).getDeviceData)) {
                    int i17 = (getSDKReferenceNumber + 79) % 128;
                    AuthenticationRequestParameters = i17;
                    int i18 = (i17 & (-108)) | ((~i17) & 107);
                    int i19 = -(-((i17 & 107) << 1));
                    int i21 = (i18 & i19) + (i19 | i18);
                    getSDKReferenceNumber = i21 % 128;
                    if (i21 % 2 != 0) {
                        return Boolean.FALSE;
                    }
                    throw null;
                }
                int i22 = getSDKReferenceNumber;
                AuthenticationRequestParameters = a0.d(i22 & 81, ~(-(-(i22 | 81))), 1, 128);
            }
            return Boolean.TRUE;
        }

        public final T getDeviceData() {
            return (T) getDeviceData(-568881259, 568881263, new Object[]{this}, timedout.AuthenticationRequestParameters.getSDKAppID(), timedout.AuthenticationRequestParameters.getSDKAppID(), timedout.AuthenticationRequestParameters.getSDKAppID(), timedout.AuthenticationRequestParameters.getSDKAppID());
        }
    }
}
