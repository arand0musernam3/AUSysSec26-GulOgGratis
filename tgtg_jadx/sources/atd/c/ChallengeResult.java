package atd.c;

import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import atd.c.getTransactionStatus;
import com.app.tgtg.model.local.AppConstants;
import java.util.Objects;
import n90.b0;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class ChallengeResult extends getSDKTransactionID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int BuildConfig;
    public static final Parcelable.Creator<ChallengeResult> CREATOR;
    private static int ChallengeResult;
    private static int getDeviceData;
    private static long getSDKTransactionID;
    private String getSDKAppID;
    private String getSDKReferenceNumber;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(byte r6, int r7, int r8) {
        /*
            int r8 = r8 * 2
            int r0 = 1 - r8
            int r7 = r7 * 4
            int r7 = 3 - r7
            int r6 = r6 * 2
            int r6 = r6 + 97
            byte[] r1 = atd.c.ChallengeResult.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L19
            r3 = r1
            r4 = r2
            r1 = r7
            goto L33
        L19:
            r3 = r7
            r7 = r6
            r6 = r3
            r3 = r2
        L1d:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r6 = r6 + 1
            int r4 = r3 + 1
            if (r3 != r8) goto L2c
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L2c:
            r3 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r1
            r1 = r5
        L33:
            int r6 = -r6
            int r6 = r6 + r1
            r1 = r7
            r7 = r6
            r6 = r1
            r1 = r3
            r3 = r4
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.c.ChallengeResult.$$d(byte, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeResult = 0;
        BuildConfig = 1;
        AuthenticationRequestParameters = 0;
        getDeviceData = 1;
        ChallengeResult();
        CREATOR = new Parcelable.Creator<ChallengeResult>() { // from class: atd.c.ChallengeResult.4
            private static int getSDKAppID = 1;
            private static int getSDKTransactionID;

            private static ChallengeResult[] AuthenticationRequestParameters(int i11) {
                Object[] objArr = {Integer.valueOf(i11)};
                int sDKTransactionID = getTransactionStatus.AnonymousClass1.getSDKTransactionID();
                return (ChallengeResult[]) getSDKTransactionID(getTransactionStatus.AnonymousClass1.getSDKTransactionID(), getTransactionStatus.AnonymousClass1.getSDKTransactionID(), -513477684, objArr, getTransactionStatus.AnonymousClass1.getSDKTransactionID(), sDKTransactionID, 513477687);
            }

            private static /* synthetic */ Object getDeviceData(Object[] objArr) {
                int iIntValue = ((Number) objArr[0]).intValue();
                int i11 = getSDKAppID;
                int i12 = ((i11 | 89) << 1) - (((~i11) & 89) | (i11 & (-90)));
                int i13 = i12 % 128;
                getSDKTransactionID = i13;
                ChallengeResult[] challengeResultArr = new ChallengeResult[iIntValue];
                if (i12 % 2 != 0) {
                    int i14 = 89 / 0;
                }
                int i15 = ((((i13 ^ 83) | (i13 & 83)) << 1) - (~(-(((~i13) & 83) | (i13 & (-84)))))) - 1;
                getSDKAppID = i15 % 128;
                if (i15 % 2 == 0) {
                    int i16 = 2 / 0;
                }
                return challengeResultArr;
            }

            public static /* synthetic */ Object getSDKTransactionID(int i11, int i12, int i13, Object[] objArr, int i14, int i15, int i16) {
                int i17 = ~i15;
                int i18 = ~(i17 | i13);
                int i19 = (~(i16 | i15)) | i18;
                int i21 = (~(i15 | (~i13))) | (~((~i16) | i17)) | i18;
                int i22 = i17 | i16 | i13;
                int i23 = (314572800 * i14) + ((-1303117824) * i11) + (700186624 * i12) + (1856302338 * i22) + (i21 * 1856302338) + ((-1856302338) * i19) + ((-1156115713) * i13) + (i16 * (-1156115713)) + 1671168000;
                int iC = a0.c(i14, 2086215248, (1050315579 * i11) + i16 + i13 + i12);
                int i24 = i21 * 990;
                int i25 = i22 * 990;
                int i26 = i12 * (-961372049);
                int i27 = i11 * 755842709;
                int i28 = i14 * (-1858722640);
                int iE = a0.e(iC, -2040987648, i28 + i27 + i26 + i25 + i24 + (i19 * (-990)) + (i13 * (-961373039)) + ((i16 * (-961373039)) - 1316831794), 1361641472, (431423488 * iC) + i23);
                if (iE != 1) {
                    if (iE == 2) {
                        return getSDKTransactionID(objArr);
                    }
                    if (iE == 3) {
                        return getDeviceData(objArr);
                    }
                    ChallengeResult challengeResult = new ChallengeResult((Parcel) objArr[0]);
                    int i29 = getSDKTransactionID;
                    getSDKAppID = (((i29 & (-22)) | ((~i29) & 21)) + ((i29 & 21) << 1)) % 128;
                    return challengeResult;
                }
                Parcel parcel = (Parcel) objArr[1];
                int i31 = getSDKAppID;
                int i32 = i31 & 125;
                int i33 = (i31 ^ 125) | i32;
                getSDKTransactionID = (((i32 | i33) << 1) - (i33 ^ i32)) % 128;
                int sDKTransactionID = getTransactionStatus.AnonymousClass1.getSDKTransactionID();
                ChallengeResult challengeResult2 = (ChallengeResult) getSDKTransactionID(getTransactionStatus.AnonymousClass1.getSDKTransactionID(), getTransactionStatus.AnonymousClass1.getSDKTransactionID(), 1366595259, new Object[]{parcel}, getTransactionStatus.AnonymousClass1.getSDKTransactionID(), sDKTransactionID, -1366595259);
                int i34 = getSDKTransactionID;
                int i35 = ((i34 ^ 7) | (i34 & 7)) << 1;
                int i36 = -(((~i34) & 7) | (i34 & (-8)));
                getSDKAppID = ((i35 & i36) + (i36 | i35)) % 128;
                return challengeResult2;
            }

            /* JADX WARN: Type inference failed for: r8v1, types: [atd.c.ChallengeResult, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ChallengeResult createFromParcel(Parcel parcel) {
                int sDKTransactionID = getTransactionStatus.AnonymousClass1.getSDKTransactionID();
                int sDKTransactionID2 = getTransactionStatus.AnonymousClass1.getSDKTransactionID();
                return getSDKTransactionID(getTransactionStatus.AnonymousClass1.getSDKTransactionID(), sDKTransactionID2, -1511579114, new Object[]{this, parcel}, getTransactionStatus.AnonymousClass1.getSDKTransactionID(), sDKTransactionID, 1511579115);
            }

            /* JADX WARN: Type inference failed for: r8v3, types: [atd.c.ChallengeResult[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ChallengeResult[] newArray(int i11) {
                Object[] objArr = {this, Integer.valueOf(i11)};
                int sDKTransactionID = getTransactionStatus.AnonymousClass1.getSDKTransactionID();
                return (Object[]) getSDKTransactionID(getTransactionStatus.AnonymousClass1.getSDKTransactionID(), getTransactionStatus.AnonymousClass1.getSDKTransactionID(), 566118964, objArr, getTransactionStatus.AnonymousClass1.getSDKTransactionID(), sDKTransactionID, -566118962);
            }

            private static ChallengeResult AuthenticationRequestParameters(Parcel parcel) {
                int sDKTransactionID = getTransactionStatus.AnonymousClass1.getSDKTransactionID();
                int sDKTransactionID2 = getTransactionStatus.AnonymousClass1.getSDKTransactionID();
                return (ChallengeResult) getSDKTransactionID(getTransactionStatus.AnonymousClass1.getSDKTransactionID(), sDKTransactionID2, 1366595259, new Object[]{parcel}, getTransactionStatus.AnonymousClass1.getSDKTransactionID(), sDKTransactionID, -1366595259);
            }

            private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
                int iIntValue = ((Number) objArr[1]).intValue();
                int i11 = getSDKTransactionID;
                int i12 = (((i11 & (-86)) | ((~i11) & 85)) - (~(-(-((i11 & 85) << 1))))) - 1;
                getSDKAppID = i12 % 128;
                int i13 = i12 % 2;
                Object[] objArr2 = {Integer.valueOf(iIntValue)};
                int sDKTransactionID = getTransactionStatus.AnonymousClass1.getSDKTransactionID();
                int sDKTransactionID2 = getTransactionStatus.AnonymousClass1.getSDKTransactionID();
                if (i13 == 0) {
                    throw null;
                }
                ChallengeResult[] challengeResultArr = (ChallengeResult[]) getSDKTransactionID(getTransactionStatus.AnonymousClass1.getSDKTransactionID(), sDKTransactionID2, -513477684, objArr2, getTransactionStatus.AnonymousClass1.getSDKTransactionID(), sDKTransactionID, 513477687);
                int i14 = getSDKAppID;
                int i15 = ((i14 ^ 79) | (i14 & 79)) << 1;
                int i16 = -(((~i14) & 79) | (i14 & (-80)));
                int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                getSDKTransactionID = i17 % 128;
                if (i17 % 2 == 0) {
                    return challengeResultArr;
                }
                throw null;
            }
        };
        int i11 = BuildConfig + 117;
        ChallengeResult = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 49 / 0;
        }
    }

    public ChallengeResult(b0 b0Var) throws Throwable {
        super(b0Var);
        atd.am.getSDKReferenceNumber getsdkreferencenumber = atd.am.getSDKReferenceNumber.ACS_HTML;
        String sDKAppID = atd.d.getSDKEphemeralPublicKey.getSDKTransactionID(b0Var, getsdkreferencenumber).getSDKAppID();
        this.getSDKReferenceNumber = sDKAppID;
        if (!atd.bc.getSDKReferenceNumber.getSDKReferenceNumber(sDKAppID)) {
            Object[] objArr = new Object[1];
            b("떢네볓롳Ꜥꊉ깷锕郏鱺鬚蛎艦褖\uf4fa\uf06a＇\ufafd\ue668\ued00\ue8a4퐙팔\udeaa\uda50섌첪젙", 1193 - TextUtils.getTrimmedLength(""), objArr);
            throw new atd.ac.getSDKAppID(((String) objArr[0]).intern(), atd.h.getSDKReferenceNumber.DATA_ELEMENT_INVALID_FORMAT, atd.am.getSDKEphemeralPublicKey.MESSAGE_FIELD_NOT_BASE64URL_ENCODED, getsdkreferencenumber);
        }
        atd.am.getSDKReferenceNumber getsdkreferencenumber2 = atd.am.getSDKReferenceNumber.ACS_HTML_REFRESH;
        int sDKAppID2 = atd.a.getSDKReferenceNumber.getSDKAppID();
        int sDKAppID3 = atd.a.getSDKReferenceNumber.getSDKAppID();
        int sDKAppID4 = atd.a.getSDKReferenceNumber.getSDKAppID();
        String str = (String) ((atd.am.getSDKTransactionID) atd.d.getSDKEphemeralPublicKey.getSDKAppID(atd.a.getSDKReferenceNumber.getSDKAppID(), sDKAppID4, new Object[]{b0Var, getsdkreferencenumber2}, sDKAppID3, sDKAppID2, 1505785998, -1505785998)).getSDKAppID();
        this.getSDKAppID = str;
        if (atd.bc.getSDKReferenceNumber.getSDKReferenceNumber(str)) {
            return;
        }
        Object[] objArr2 = new Object[1];
        b("떢네볓롳Ꜥꊉ깷锕郏鱺鬚蛎艦褖\uf4fa\uf06a＇\ufafd\ue668\ued00\ue8a4퐙팔\udeaa\uda50섌첪젙", 1193 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr2);
        throw new atd.ac.getSDKAppID(((String) objArr2[0]).intern(), atd.h.getSDKReferenceNumber.DATA_ELEMENT_INVALID_FORMAT, atd.am.getSDKEphemeralPublicKey.MESSAGE_FIELD_NOT_BASE64URL_ENCODED, getsdkreferencenumber2);
    }

    public static void ChallengeResult() {
        getSDKTransactionID = 1856303288435649548L;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(java.lang.String r25, int r26, java.lang.Object[] r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.c.ChallengeResult.b(java.lang.String, int, java.lang.Object[]):void");
    }

    public static void init$0() {
        $$a = new byte[]{89, 27, 126, -16};
        $$b = AppConstants.RESULT_CODE_ORDER_COLLECTED;
    }

    @Override // atd.c.getSDKTransactionID, android.os.Parcelable
    public final int describeContents() {
        int i11 = getDeviceData + 11;
        AuthenticationRequestParameters = i11 % 128;
        return i11 % 2 != 0 ? 1 : 0;
    }

    @Override // atd.c.getSDKTransactionID
    public final boolean equals(Object obj) {
        if (this == obj) {
            int i11 = getDeviceData + 1;
            AuthenticationRequestParameters = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 62 / 0;
            }
            return true;
        }
        if (obj instanceof ChallengeResult) {
            if (!super.equals(obj)) {
                getDeviceData = (AuthenticationRequestParameters + 93) % 128;
                return false;
            }
            ChallengeResult challengeResult = (ChallengeResult) obj;
            if (Objects.equals(this.getSDKReferenceNumber, challengeResult.getSDKReferenceNumber)) {
                return Objects.equals(this.getSDKAppID, challengeResult.getSDKAppID);
            }
            return false;
        }
        int i13 = (getDeviceData + 109) % 128;
        AuthenticationRequestParameters = i13;
        int i14 = i13 + 83;
        getDeviceData = i14 % 128;
        if (i14 % 2 != 0) {
            return false;
        }
        throw null;
    }

    @Override // atd.c.getSDKTransactionID
    public final void getDeviceData() {
        AuthenticationRequestParameters = (getDeviceData + 3) % 128;
        super.getDeviceData();
        this.getSDKReferenceNumber = null;
        this.getSDKAppID = null;
        int i11 = AuthenticationRequestParameters + 83;
        getDeviceData = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public final String getSDKAppID() {
        int i11 = getDeviceData + 71;
        int i12 = i11 % 128;
        AuthenticationRequestParameters = i12;
        int i13 = i11 % 2;
        String str = this.getSDKReferenceNumber;
        if (i13 != 0) {
            throw null;
        }
        getDeviceData = (i12 + AppConstants.RESULT_CODE_ORDER_CANCELLED) % 128;
        return str;
    }

    public final String getSDKReferenceNumber() {
        int i11 = (getDeviceData + 33) % 128;
        AuthenticationRequestParameters = i11;
        String str = this.getSDKAppID;
        int i12 = i11 + 21;
        getDeviceData = i12 % 128;
        if (i12 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // atd.c.getSDKTransactionID
    public final int hashCode() {
        int iHashCode;
        getDeviceData = (AuthenticationRequestParameters + 99) % 128;
        int iHashCode2 = super.hashCode() * 31;
        String str = this.getSDKReferenceNumber;
        int iHashCode3 = 0;
        if (str != null) {
            int i11 = AuthenticationRequestParameters + 45;
            getDeviceData = i11 % 128;
            if (i11 % 2 == 0) {
                iHashCode = str.hashCode();
                int i12 = 9 / 0;
            } else {
                iHashCode = str.hashCode();
            }
        } else {
            iHashCode = 0;
        }
        int i13 = (iHashCode2 + iHashCode) * 31;
        String str2 = this.getSDKAppID;
        if (str2 != null) {
            AuthenticationRequestParameters = (getDeviceData + 93) % 128;
            iHashCode3 = str2.hashCode();
            AuthenticationRequestParameters = (getDeviceData + 33) % 128;
        }
        return i13 + iHashCode3;
    }

    @Override // atd.c.getSDKTransactionID, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int i12 = getDeviceData + 69;
        AuthenticationRequestParameters = i12 % 128;
        if (i12 % 2 == 0) {
            super.writeToParcel(parcel, i11);
            parcel.writeString(this.getSDKReferenceNumber);
            parcel.writeString(this.getSDKAppID);
        } else {
            super.writeToParcel(parcel, i11);
            parcel.writeString(this.getSDKReferenceNumber);
            parcel.writeString(this.getSDKAppID);
            int i13 = 70 / 0;
        }
    }

    public ChallengeResult(Parcel parcel) {
        super(parcel);
        this.getSDKReferenceNumber = parcel.readString();
        this.getSDKAppID = parcel.readString();
    }
}
