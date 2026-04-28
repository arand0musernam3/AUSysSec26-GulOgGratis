package atd.am;

import java.security.cert.X509Certificate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/adyen/threeds2/internal/result/DirectoryServerKeysResult;", "", "publicKey", "Lcom/adyen/threeds2/internal/jose/jwk/JsonWebKey;", "rootCertificates", "", "Ljava/security/cert/X509Certificate;", "<init>", "(Lcom/adyen/threeds2/internal/jose/jwk/JsonWebKey;Ljava/util/List;)V", "getPublicKey", "()Lcom/adyen/threeds2/internal/jose/jwk/JsonWebKey;", "getRootCertificates", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class getDeviceData {
    private static int getSDKAppID = 0;
    private static int getSDKReferenceNumber = 1;

    @NotNull
    private final atd.af.getSDKReferenceNumber getDeviceData;

    @NotNull
    private final List<X509Certificate> getSDKTransactionID;

    /* JADX WARN: Multi-variable type inference failed */
    public getDeviceData(@NotNull atd.af.getSDKReferenceNumber getsdkreferencenumber, @NotNull List<? extends X509Certificate> list) {
        getsdkreferencenumber.getClass();
        list.getClass();
        this.getDeviceData = getsdkreferencenumber;
        this.getSDKTransactionID = list;
    }

    public static /* synthetic */ Object getDeviceData(int i11, int i12, Object[] objArr, int i13, int i14, int i15, int i16) {
        int i17 = ~i16;
        int i18 = ~(i17 | i14);
        int i19 = ~(i17 | i15);
        int i21 = i18 | i19;
        int i22 = ~i14;
        int i23 = (~((~i15) | i17 | i14)) | (~(i17 | i22 | i15));
        int i24 = (~(i22 | i16)) | i19;
        int i25 = 716963840 * i13;
        int i26 = (227278848 * i12) + (39845888 * i11) + i25 + ((-504768533) * i24) + (i23 * (-504768533)) + (1009537066 * i21) + (1221732374 * i14) + ((212195308 * i16) - 2121662464);
        int iC = a0.c(i12, 2108813197, ((-1696018712) * i11) + i16 + i14 + i13);
        int i27 = i23 * 199;
        int i28 = i24 * 199;
        int i29 = i13 * 362004373;
        int i31 = i11 * (-1290304248);
        int i32 = i12 * 155295761;
        int iE = a0.e(iC, -60686336, i32 + i31 + i29 + i28 + i27 + (i21 * (-398)) + (i14 * 362004174) + ((i16 * 362004572) - 1408384217), -1680474112, ((-1705377792) * iC) + i26);
        if (iE == 1) {
            getDeviceData getdevicedata = (getDeviceData) objArr[0];
            int i33 = getSDKAppID;
            int i34 = i33 & 51;
            int i35 = (i33 | 51) & (~i34);
            int i36 = -(-(i34 << 1));
            int i37 = ((i35 & i36) + (i35 | i36)) % 128;
            getSDKReferenceNumber = i37;
            List<X509Certificate> list = getdevicedata.getSDKTransactionID;
            getSDKAppID = ((i37 ^ 33) + ((i37 & 33) << 1)) % 128;
            return list;
        }
        if (iE == 2) {
            getDeviceData getdevicedata2 = (getDeviceData) objArr[0];
            int i38 = getSDKAppID;
            int i39 = (i38 | 35) << 1;
            int i41 = -(((~i38) & 35) | (i38 & (-36)));
            getSDKReferenceNumber = ((i39 & i41) + (i41 | i39)) % 128;
            int iHashCode = getdevicedata2.getSDKTransactionID.hashCode() + (getdevicedata2.getDeviceData.hashCode() * 31);
            getSDKReferenceNumber = (getSDKAppID + 1) % 128;
            return Integer.valueOf(iHashCode);
        }
        if (iE == 3) {
            getDeviceData getdevicedata3 = (getDeviceData) objArr[0];
            StringBuilder sb2 = new StringBuilder("DirectoryServerKeysResult(publicKey=");
            sb2.append(getdevicedata3.getDeviceData);
            sb2.append(", rootCertificates=");
            sb2.append(getdevicedata3.getSDKTransactionID);
            sb2.append(')');
            String string = sb2.toString();
            int i42 = getSDKReferenceNumber;
            getSDKAppID = ((i42 ^ 95) + ((i42 & 95) << 1)) % 128;
            return string;
        }
        if (iE == 4) {
            return getDeviceData(objArr);
        }
        getDeviceData getdevicedata4 = (getDeviceData) objArr[0];
        int i43 = getSDKAppID;
        int i44 = (((i43 & (-94)) | ((~i43) & 93)) + ((i43 & 93) << 1)) % 128;
        getSDKReferenceNumber = i44;
        atd.af.getSDKReferenceNumber getsdkreferencenumber = getdevicedata4.getDeviceData;
        int i45 = i44 & 71;
        getSDKAppID = a0.d((i44 | 71) & (~i45), ~(-(-(i45 << 1))), 1, 128);
        return getsdkreferencenumber;
    }

    @NotNull
    public final atd.af.getSDKReferenceNumber AuthenticationRequestParameters() {
        int sDKAppID = atd.bc.getDeviceData.getSDKAppID();
        int sDKAppID2 = atd.bc.getDeviceData.getSDKAppID();
        return (atd.af.getSDKReferenceNumber) getDeviceData(atd.bc.getDeviceData.getSDKAppID(), atd.bc.getDeviceData.getSDKAppID(), new Object[]{this}, sDKAppID2, -2036884057, sDKAppID, 2036884057);
    }

    public final boolean equals(@Nullable Object other) {
        int sDKAppID = atd.bc.getDeviceData.getSDKAppID();
        int sDKAppID2 = atd.bc.getDeviceData.getSDKAppID();
        return ((Boolean) getDeviceData(atd.bc.getDeviceData.getSDKAppID(), atd.bc.getDeviceData.getSDKAppID(), new Object[]{this, other}, sDKAppID2, 687380418, sDKAppID, -687380414)).booleanValue();
    }

    @NotNull
    public final List<X509Certificate> getSDKReferenceNumber() {
        int sDKAppID = atd.bc.getDeviceData.getSDKAppID();
        int sDKAppID2 = atd.bc.getDeviceData.getSDKAppID();
        return (List) getDeviceData(atd.bc.getDeviceData.getSDKAppID(), atd.bc.getDeviceData.getSDKAppID(), new Object[]{this}, sDKAppID2, 855143278, sDKAppID, -855143277);
    }

    public final int hashCode() {
        int sDKAppID = atd.bc.getDeviceData.getSDKAppID();
        int sDKAppID2 = atd.bc.getDeviceData.getSDKAppID();
        return ((Integer) getDeviceData(atd.bc.getDeviceData.getSDKAppID(), atd.bc.getDeviceData.getSDKAppID(), new Object[]{this}, sDKAppID2, -203830788, sDKAppID, 203830790)).intValue();
    }

    @NotNull
    public final String toString() {
        int sDKAppID = atd.bc.getDeviceData.getSDKAppID();
        int sDKAppID2 = atd.bc.getDeviceData.getSDKAppID();
        return (String) getDeviceData(atd.bc.getDeviceData.getSDKAppID(), atd.bc.getDeviceData.getSDKAppID(), new Object[]{this}, sDKAppID2, 1667066777, sDKAppID, -1667066774);
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) {
        getDeviceData getdevicedata = (getDeviceData) objArr[0];
        Object obj = objArr[1];
        int i11 = getSDKAppID;
        int i12 = ((i11 ^ 3) | (i11 & 3)) << 1;
        int i13 = -(((~i11) & 3) | (i11 & (-4)));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        int i15 = i14 % 128;
        getSDKReferenceNumber = i15;
        if (i14 % 2 == 0) {
            throw null;
        }
        if (getdevicedata == obj) {
            int i16 = (i15 + 11) % 128;
            getSDKAppID = i16;
            int i17 = i16 & 75;
            int i18 = (((i16 ^ 75) | i17) << 1) - ((~i17) & (i16 | 75));
            getSDKReferenceNumber = i18 % 128;
            if (i18 % 2 != 0) {
                return Boolean.TRUE;
            }
            int i19 = 68 / 0;
            return Boolean.TRUE;
        }
        if (!(obj instanceof getDeviceData)) {
            int i21 = i15 ^ 121;
            int i22 = ((i15 & 121) | i21) << 1;
            int i23 = -i21;
            int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
            getSDKAppID = i24 % 128;
            return Boolean.valueOf(i24 % 2 != 0);
        }
        getDeviceData getdevicedata2 = (getDeviceData) obj;
        if (!Intrinsics.areEqual(getdevicedata.getDeviceData, getdevicedata2.getDeviceData)) {
            int i25 = getSDKReferenceNumber;
            int i26 = ((-2) - (((i25 ^ 108) + ((i25 & 108) << 1)) ^ (-1))) % 128;
            getSDKAppID = i26;
            getSDKReferenceNumber = ((i26 & 63) + (i26 | 63)) % 128;
            return Boolean.FALSE;
        }
        if (Intrinsics.areEqual(getdevicedata.getSDKTransactionID, getdevicedata2.getSDKTransactionID)) {
            int i27 = getSDKReferenceNumber;
            int i28 = (i27 & 115) + (i27 | 115);
            getSDKAppID = i28 % 128;
            if (i28 % 2 == 0) {
                return Boolean.TRUE;
            }
            throw null;
        }
        int i29 = getSDKAppID;
        int i31 = i29 + 31;
        getSDKReferenceNumber = i31 % 128;
        boolean z11 = i31 % 2 == 0;
        int i32 = (i29 & 35) + (i29 | 35);
        getSDKReferenceNumber = i32 % 128;
        if (i32 % 2 != 0) {
            return Boolean.valueOf(z11);
        }
        throw null;
    }
}
