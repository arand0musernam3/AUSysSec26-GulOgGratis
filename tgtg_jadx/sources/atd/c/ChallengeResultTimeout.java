package atd.c;

import android.os.Parcel;
import android.os.Parcelable;
import atd.y.BuildConfig;
import atd.y.ChallengeResult;
import com.app.tgtg.model.local.AppConstants;
import java.util.ArrayList;
import java.util.List;
import n90.b0;
import n90.e;
import n90.n;
import r8.k;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class ChallengeResultTimeout implements Parcelable {
    private static int AuthenticationRequestParameters = 1;
    private static int ChallengeResult = 0;
    private static int ChallengeResultCancelled = 1;
    private static int getSDKReferenceNumber;
    private String getSDKAppID;
    private String getSDKTransactionID;
    public static final Parcelable.Creator<ChallengeResultTimeout> CREATOR = new Parcelable.Creator<ChallengeResultTimeout>() { // from class: atd.c.ChallengeResultTimeout.5
        private static int AuthenticationRequestParameters = 1;
        private static int getSDKTransactionID;

        private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
            int iIntValue = ((Number) objArr[1]).intValue();
            int i11 = getSDKTransactionID;
            AuthenticationRequestParameters = a0.d(i11 & 75, ~(-(-(i11 | 75))), 1, 128);
            Object[] objArr2 = {Integer.valueOf(iIntValue)};
            int sDKAppID = ChallengeResult.AuthenticationRequestParameters.getSDKAppID();
            ChallengeResultTimeout[] challengeResultTimeoutArr = (ChallengeResultTimeout[]) getDeviceData(ChallengeResult.AuthenticationRequestParameters.getSDKAppID(), objArr2, ChallengeResult.AuthenticationRequestParameters.getSDKAppID(), 1348514984, sDKAppID, -1348514981, ChallengeResult.AuthenticationRequestParameters.getSDKAppID());
            int i12 = AuthenticationRequestParameters;
            int i13 = i12 ^ 71;
            int i14 = (((i12 & 71) | i13) << 1) - i13;
            getSDKTransactionID = i14 % 128;
            if (i14 % 2 == 0) {
                return challengeResultTimeoutArr;
            }
            throw null;
        }

        public static /* synthetic */ Object getDeviceData(int i11, Object[] objArr, int i12, int i13, int i14, int i15, int i16) {
            int i17 = ~i15;
            int i18 = ~(i17 | i14);
            int i19 = (~(i17 | (~i14) | i13)) | (~(i13 | i15 | i14));
            int i21 = ~i13;
            int i22 = (~(i14 | i15)) | (~(i21 | i14)) | (~(i21 | i15));
            int i23 = (1859780608 * i11) + (1553727488 * i16) + ((-1183186944) * i12) + (67104753 * i22) + ((-67104753) * i19) + (i18 * (-67104753)) + ((-1116082190) * i15) + (((-1250291696) * i13) - 490274816);
            int iC = a0.c(i11, 1466394737, (1698977638 * i16) + i13 + i15 + i12);
            int i24 = i19 * (-441);
            int i25 = i22 * 441;
            int i26 = i12 * (-1787955639);
            int i27 = i16 * 552005654;
            int i28 = i11 * (-2013897159);
            int iE = a0.e(iC, -429457408, i28 + i27 + i26 + i25 + i24 + (i18 * (-441)) + (i15 * (-1787955198)) + ((i13 * (-1787956080)) - 1478154965), -402587648, (925827072 * iC) + i23);
            if (iE == 1) {
                return AuthenticationRequestParameters(objArr);
            }
            if (iE == 2) {
                return getSDKReferenceNumber(objArr);
            }
            if (iE == 3) {
                return getSDKTransactionID(objArr);
            }
            ChallengeResultTimeout challengeResultTimeout = new ChallengeResultTimeout((Parcel) objArr[0]);
            AuthenticationRequestParameters = (getSDKTransactionID + 89) % 128;
            return challengeResultTimeout;
        }

        private static ChallengeResultTimeout getSDKAppID(Parcel parcel) {
            int sDKAppID = ChallengeResult.AuthenticationRequestParameters.getSDKAppID();
            int sDKAppID2 = ChallengeResult.AuthenticationRequestParameters.getSDKAppID();
            int sDKAppID3 = ChallengeResult.AuthenticationRequestParameters.getSDKAppID();
            return (ChallengeResultTimeout) getDeviceData(ChallengeResult.AuthenticationRequestParameters.getSDKAppID(), new Object[]{parcel}, sDKAppID2, -2006057513, sDKAppID, 2006057513, sDKAppID3);
        }

        private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
            Parcel parcel = (Parcel) objArr[1];
            int i11 = AuthenticationRequestParameters;
            int i12 = i11 ^ 59;
            int i13 = (((i11 & 59) | i12) << 1) - i12;
            getSDKTransactionID = i13 % 128;
            int i14 = i13 % 2;
            Object[] objArr2 = {parcel};
            int sDKAppID = ChallengeResult.AuthenticationRequestParameters.getSDKAppID();
            int sDKAppID2 = ChallengeResult.AuthenticationRequestParameters.getSDKAppID();
            int sDKAppID3 = ChallengeResult.AuthenticationRequestParameters.getSDKAppID();
            int sDKAppID4 = ChallengeResult.AuthenticationRequestParameters.getSDKAppID();
            if (i14 != 0) {
                throw null;
            }
            ChallengeResultTimeout challengeResultTimeout = (ChallengeResultTimeout) getDeviceData(sDKAppID4, objArr2, sDKAppID2, -2006057513, sDKAppID, 2006057513, sDKAppID3);
            int i15 = getSDKTransactionID;
            int i16 = i15 & 65;
            int i17 = (i15 | 65) & (~i16);
            int i18 = -(-(i16 << 1));
            int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
            AuthenticationRequestParameters = i19 % 128;
            if (i19 % 2 != 0) {
                return challengeResultTimeout;
            }
            throw null;
        }

        private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
            int iIntValue = ((Number) objArr[0]).intValue();
            int i11 = AuthenticationRequestParameters;
            getSDKTransactionID = (((i11 & 12) + (i11 | 12)) - 1) % 128;
            ChallengeResultTimeout[] challengeResultTimeoutArr = new ChallengeResultTimeout[iIntValue];
            int i12 = ((i11 & 126) + (i11 | 126)) - 1;
            getSDKTransactionID = i12 % 128;
            if (i12 % 2 == 0) {
                return challengeResultTimeoutArr;
            }
            throw null;
        }

        /* JADX WARN: Type inference failed for: r8v1, types: [atd.c.ChallengeResultTimeout, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ChallengeResultTimeout createFromParcel(Parcel parcel) {
            int sDKAppID = ChallengeResult.AuthenticationRequestParameters.getSDKAppID();
            int sDKAppID2 = ChallengeResult.AuthenticationRequestParameters.getSDKAppID();
            int sDKAppID3 = ChallengeResult.AuthenticationRequestParameters.getSDKAppID();
            return getDeviceData(ChallengeResult.AuthenticationRequestParameters.getSDKAppID(), new Object[]{this, parcel}, sDKAppID2, -1402354467, sDKAppID, 1402354469, sDKAppID3);
        }

        /* JADX WARN: Type inference failed for: r8v3, types: [atd.c.ChallengeResultTimeout[], java.lang.Object[]] */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ChallengeResultTimeout[] newArray(int i11) {
            Object[] objArr = {this, Integer.valueOf(i11)};
            int sDKAppID = ChallengeResult.AuthenticationRequestParameters.getSDKAppID();
            return (Object[]) getDeviceData(ChallengeResult.AuthenticationRequestParameters.getSDKAppID(), objArr, ChallengeResult.AuthenticationRequestParameters.getSDKAppID(), 540115553, sDKAppID, -540115552, ChallengeResult.AuthenticationRequestParameters.getSDKAppID());
        }

        private static ChallengeResultTimeout[] getSDKTransactionID(int i11) {
            Object[] objArr = {Integer.valueOf(i11)};
            int sDKAppID = ChallengeResult.AuthenticationRequestParameters.getSDKAppID();
            return (ChallengeResultTimeout[]) getDeviceData(ChallengeResult.AuthenticationRequestParameters.getSDKAppID(), objArr, ChallengeResult.AuthenticationRequestParameters.getSDKAppID(), 1348514984, sDKAppID, -1348514981, ChallengeResult.AuthenticationRequestParameters.getSDKAppID());
        }
    };
    private static final atd.am.getSDKReferenceNumber getDeviceData = atd.am.getSDKReferenceNumber.CHALLENGE_SELECT_INFO;

    static {
        int i11 = ChallengeResultCancelled + 14;
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        ChallengeResult = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    private ChallengeResultTimeout(n nVar) throws atd.ac.getSDKAppID {
        b0 sDKAppID = atd.d.getSDKEphemeralPublicKey.getSDKTransactionID(nVar, getDeviceData).getSDKAppID();
        String str = (String) sDKAppID.f30747a.keySet().iterator().next();
        this.getSDKAppID = str;
        int sDKAppID2 = atd.a.getSDKReferenceNumber.getSDKAppID();
        int sDKAppID3 = atd.a.getSDKReferenceNumber.getSDKAppID();
        int sDKAppID4 = atd.a.getSDKReferenceNumber.getSDKAppID();
        this.getSDKTransactionID = (String) ((atd.am.getSDKTransactionID) atd.d.getSDKEphemeralPublicKey.getSDKAppID(atd.a.getSDKReferenceNumber.getSDKAppID(), sDKAppID4, new Object[]{sDKAppID, str}, sDKAppID3, sDKAppID2, -1165482257, 1165482259)).getSDKAppID();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006d, code lost:
    
        if (r1.getClass() != r8.getClass()) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
    
        if (r1.getClass() != r8.getClass()) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
    
        r8 = (atd.c.ChallengeResultTimeout) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        if (java.util.Objects.equals(r1.getSDKAppID, r8.getSDKAppID) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0087, code lost:
    
        r8 = atd.c.ChallengeResultTimeout.AuthenticationRequestParameters + 125;
        atd.c.ChallengeResultTimeout.getSDKReferenceNumber = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
    
        if ((r8 % 2) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0096, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0097, code lost:
    
        r8 = java.util.Objects.equals(r1.getSDKTransactionID, r8.getSDKTransactionID);
        r0 = atd.c.ChallengeResultTimeout.AuthenticationRequestParameters;
        atd.c.ChallengeResultTimeout.getSDKReferenceNumber = w.a0.d((r0 | 39) << 1, ~(-(((~r0) & 39) | (r0 & (-40)))), 1, 128);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b6, code lost:
    
        return java.lang.Boolean.valueOf(r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object AuthenticationRequestParameters(java.lang.Object[] r8) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.c.ChallengeResultTimeout.AuthenticationRequestParameters(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) {
        ChallengeResultTimeout challengeResultTimeout = (ChallengeResultTimeout) objArr[0];
        int i11 = getSDKReferenceNumber;
        int i12 = (i11 & (-114)) | ((~i11) & 113);
        int i13 = -(-((i11 & 113) << 1));
        AuthenticationRequestParameters = (((i12 | i13) << 1) - (i12 ^ i13)) % 128;
        String str = challengeResultTimeout.getSDKAppID;
        int i14 = (i11 & (-42)) | ((~i11) & 41);
        int i15 = -(-((i11 & 41) << 1));
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        AuthenticationRequestParameters = i16 % 128;
        if (i16 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
        int iHashCode;
        int iHashCode2;
        ChallengeResultTimeout challengeResultTimeout = (ChallengeResultTimeout) objArr[0];
        int i11 = AuthenticationRequestParameters;
        int i12 = i11 & 101;
        int i13 = i11 | 101;
        getSDKReferenceNumber = ((i12 ^ i13) + ((i12 & i13) << 1)) % 128;
        String str = challengeResultTimeout.getSDKAppID;
        if (str != null) {
            int i14 = ((i11 | AppConstants.RESULT_CODE_ORDER_CANCELLED) << 1) - (i11 ^ AppConstants.RESULT_CODE_ORDER_CANCELLED);
            getSDKReferenceNumber = i14 % 128;
            if (i14 % 2 != 0) {
                iHashCode = str.hashCode();
                int i15 = 62 / 0;
            } else {
                iHashCode = str.hashCode();
            }
        } else {
            int i16 = i11 & 69;
            getSDKReferenceNumber = a0.d(((i11 ^ 69) | i16) << 1, ~(-((i11 | 69) & (~i16))), 1, 128);
            iHashCode = 0;
        }
        int i17 = iHashCode * 31;
        if (challengeResultTimeout.getSDKTransactionID != null) {
            int sDKReferenceNumber = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
            int i18 = ~sDKReferenceNumber;
            int i19 = (1476382175 & sDKReferenceNumber) | ((-1476382176) & i18);
            int i21 = sDKReferenceNumber & (-1476382176);
            int i22 = (i19 & i21) | (i19 ^ i21);
            int i23 = -(~(-(-(((i22 & 1109754880) | (i22 ^ 1109754880)) * 614))));
            int i24 = (1554213526 ^ i23) + ((i23 & 1554213526) << 1);
            int i25 = (i24 ^ (-1)) + (i24 << 1);
            int i26 = ~sDKReferenceNumber;
            int i27 = 1140835332 & i26;
            int i28 = (~i27) & (1140835332 | i26);
            int i29 = ~((i27 & i28) | (i28 ^ i27));
            int i31 = ((-1476382176) & i29) | (i29 ^ (-1476382176));
            int i32 = i18 & 1445301723;
            int i33 = (i18 | 1445301723) & (~i32);
            int i34 = ~((i33 & i32) | (i33 ^ i32));
            int i35 = ((i34 & i31) | (i31 ^ i34)) * (-1228);
            int i36 = ((~i35) & i25) | ((~i25) & i35);
            int i37 = (i25 & i35) << 1;
            int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
            int i39 = (-335546844) & i26;
            int i41 = ~((((-335546844) | i26) & (~i39)) | i39);
            int i42 = (i26 & 1140835332) | ((~i26) & (-1140835333));
            int i43 = i26 & (-1140835333);
            int i44 = (i43 & i42) | (i42 ^ i43);
            int i45 = ((-1445301724) & i44) | ((~i44) & 1445301723);
            int i46 = i44 & 1445301723;
            int i47 = ~((i46 & i45) | (i45 ^ i46));
            int i48 = i41 ^ i47;
            int i49 = i47 & i41;
            int i51 = ((i49 & i48) | (i48 ^ i49)) * 614;
            int i52 = i38 & i51;
            int i53 = ((i38 ^ i51) | i52) << 1;
            int i54 = -((i51 | i38) & (~i52));
            int i55 = (i53 & i54) + (i54 | i53);
            int iIdentityHashCode = System.identityHashCode(challengeResultTimeout);
            int i56 = ~iIdentityHashCode;
            int i57 = ~iIdentityHashCode;
            int i58 = (iIdentityHashCode | i57) & i56;
            int i59 = ((-869537345) & i58) | ((~i58) & 869537344);
            int i61 = i58 & 869537344;
            int i62 = ~((i61 & i59) | (i59 ^ i61));
            int i63 = (-1342714710) ^ i62;
            int i64 = i62 & (-1342714710);
            int i65 = ((i64 & i63) | (i63 ^ i64)) * 764;
            int i66 = (1102099258 ^ i65) + ((i65 & 1102099258) << 1);
            int i67 = (1342714709 & i57) | ((~i57) & (-1342714710)) | ((-1342714710) & i57);
            int i68 = (i67 | (~i67)) & (~i67);
            int i69 = 268440128 & i68;
            int i71 = (i68 | 268440128) & (~i69);
            int i72 = (i66 - (~(((i71 & i69) | (i71 ^ i69)) * (-1528)))) - 1;
            int i73 = i57 & 869537344;
            int i74 = (~i73) & (i57 | 869537344);
            int i75 = (i73 & i74) | (i74 ^ i73);
            int i76 = (i75 | (~i75)) & (~i75);
            int i77 = (-1675371798) & i76;
            int i78 = (i76 | (-1675371798)) & (~i77);
            int i79 = -(~(((i78 & i77) | (i78 ^ i77)) * 764));
            int i81 = ((i72 | i79) << 1) - (i79 ^ i72);
            int i82 = (i81 ^ (-1)) + (i81 << 1);
            String str2 = challengeResultTimeout.getSDKTransactionID;
            if (i55 <= i82) {
                str2.hashCode();
                throw null;
            }
            iHashCode2 = str2.hashCode();
            int i83 = AuthenticationRequestParameters;
            int i84 = (i83 | 21) << 1;
            int i85 = -(((~i83) & 21) | (i83 & (-22)));
            getSDKReferenceNumber = (((i84 | i85) << 1) - (i85 ^ i84)) % 128;
        } else {
            int i86 = getSDKReferenceNumber;
            int i87 = i86 & 83;
            int i88 = ((i86 ^ 83) | i87) << 1;
            int i89 = -((i86 | 83) & (~i87));
            AuthenticationRequestParameters = ((i88 & i89) + (i89 | i88)) % 128;
            iHashCode2 = 0;
        }
        int i91 = -(-iHashCode2);
        int i92 = i17 & i91;
        int i93 = -(-((i91 ^ i17) | i92));
        int i94 = (i92 & i93) + (i93 | i92);
        int i95 = getSDKReferenceNumber + 111;
        AuthenticationRequestParameters = i95 % 128;
        if (i95 % 2 != 0) {
            return Integer.valueOf(i94);
        }
        int i96 = 56 / 0;
        return Integer.valueOf(i94);
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
        ChallengeResultTimeout challengeResultTimeout = (ChallengeResultTimeout) objArr[0];
        int i11 = AuthenticationRequestParameters;
        int iD = a0.d(i11 ^ 9, ~(-(-((i11 & 9) << 1))), 1, 128);
        getSDKReferenceNumber = iD;
        String str = challengeResultTimeout.getSDKTransactionID;
        int i12 = iD & 63;
        int i13 = ((((iD ^ 63) | i12) << 1) - (~(-((iD | 63) & (~i12))))) - 1;
        AuthenticationRequestParameters = i13 % 128;
        if (i13 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
        ChallengeResultTimeout challengeResultTimeout = (ChallengeResultTimeout) objArr[0];
        int i11 = getSDKReferenceNumber;
        int i12 = (i11 | 41) << 1;
        int i13 = -(((~i11) & 41) | (i11 & (-42)));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        AuthenticationRequestParameters = i14 % 128;
        if (i14 % 2 != 0) {
            challengeResultTimeout.getSDKAppID = null;
            challengeResultTimeout.getSDKTransactionID = null;
            return null;
        }
        challengeResultTimeout.getSDKAppID = null;
        challengeResultTimeout.getSDKTransactionID = null;
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int sDKReferenceNumber = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
        int sDKReferenceNumber2 = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
        int sDKReferenceNumber3 = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
        return ((Integer) getSDKAppID(sDKReferenceNumber2, sDKReferenceNumber, 1339134727, BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber(), new Object[]{this}, -1339134723, sDKReferenceNumber3)).intValue();
    }

    public final boolean equals(Object obj) {
        int sDKReferenceNumber = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
        int sDKReferenceNumber2 = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
        int sDKReferenceNumber3 = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
        return ((Boolean) getSDKAppID(sDKReferenceNumber2, sDKReferenceNumber, 1819197370, BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber(), new Object[]{this, obj}, -1819197363, sDKReferenceNumber3)).booleanValue();
    }

    public final int hashCode() {
        int sDKReferenceNumber = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
        int sDKReferenceNumber2 = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
        int sDKReferenceNumber3 = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
        return ((Integer) getSDKAppID(sDKReferenceNumber2, sDKReferenceNumber, 1494548680, BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber(), new Object[]{this}, -1494548679, sDKReferenceNumber3)).intValue();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        Object[] objArr = {this, parcel, Integer.valueOf(i11)};
        int sDKReferenceNumber = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
        getSDKAppID(BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber(), sDKReferenceNumber, 1127173694, BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber(), objArr, -1127173689, BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber());
    }

    public final String getSDKTransactionID() {
        int sDKReferenceNumber = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
        int sDKReferenceNumber2 = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
        int sDKReferenceNumber3 = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
        return (String) getSDKAppID(sDKReferenceNumber2, sDKReferenceNumber, -731051330, BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber(), new Object[]{this}, 731051330, sDKReferenceNumber3);
    }

    public static List<ChallengeResultTimeout> getSDKTransactionID(b0 b0Var) throws atd.ac.getSDKAppID {
        int sDKReferenceNumber = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
        int sDKReferenceNumber2 = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
        int sDKReferenceNumber3 = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
        return (List) getSDKAppID(sDKReferenceNumber2, sDKReferenceNumber, -596518101, BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber(), new Object[]{b0Var}, 596518107, sDKReferenceNumber3);
    }

    public final void getDeviceData() {
        int sDKReferenceNumber = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
        int sDKReferenceNumber2 = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
        int sDKReferenceNumber3 = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
        getSDKAppID(sDKReferenceNumber2, sDKReferenceNumber, 1767082952, BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber(), new Object[]{this}, -1767082949, sDKReferenceNumber3);
    }

    public ChallengeResultTimeout(Parcel parcel) {
        this.getSDKAppID = parcel.readString();
        this.getSDKTransactionID = parcel.readString();
    }

    public final String AuthenticationRequestParameters() {
        int sDKReferenceNumber = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
        int sDKReferenceNumber2 = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
        int sDKReferenceNumber3 = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
        return (String) getSDKAppID(sDKReferenceNumber2, sDKReferenceNumber, 826877567, BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber(), new Object[]{this}, -826877565, sDKReferenceNumber3);
    }

    public static Object getSDKAppID(int i11, int i12, int i13, int i14, Object[] objArr, int i15, int i16) {
        int i17 = ~i15;
        int i18 = ~i12;
        int i19 = ~(i17 | i18);
        int i21 = ~i13;
        int i22 = i19 | (~(i21 | i12));
        int i23 = ((-448846874) * i22) + (308833806 * i13) + (i15 * 308833806) + 153878528;
        int i24 = (~(i12 | i17)) | (~(i21 | i18));
        int i25 = ~(i15 | i13);
        int i26 = i24 | i25;
        int i27 = i25 | i22;
        int i28 = ((-734003200) * i14) + (1159200768 * i16) + (84410368 * i11) + (224423437 * i27) + ((-224423437) * i26) + i23;
        int iC = a0.c(i14, 640148872, ((-1585779005) * i16) + i15 + i13 + i11);
        int i29 = i22 * (-1802);
        int i31 = i26 * (-901);
        int i32 = i27 * 901;
        int i33 = i11 * (-1291221671);
        int i34 = i16 * (-1079815989);
        int i35 = i14 * 669414472;
        int i36 = i35 + i34 + i33 + i32 + i31 + i29 + (i13 * (-1291220770)) + (i15 * (-1291220770)) + 263398195;
        int i37 = 0;
        switch (a0.e(iC, 145489920, i36, -1699479552, (2089549824 * iC) + i28)) {
            case 1:
                return getSDKAppID(objArr);
            case 2:
                return getSDKReferenceNumber(objArr);
            case 3:
                return getSDKTransactionID(objArr);
            case 4:
                int i38 = AuthenticationRequestParameters;
                getSDKReferenceNumber = ((i38 & 81) + (i38 | 81)) % 128;
                return 0;
            case 5:
                ChallengeResultTimeout challengeResultTimeout = (ChallengeResultTimeout) objArr[0];
                Parcel parcel = (Parcel) objArr[1];
                ((Number) objArr[2]).intValue();
                int i39 = AuthenticationRequestParameters;
                getSDKReferenceNumber = k.c(i39 ^ 34, (i39 & 34) << 1, 1, 128);
                parcel.writeString(challengeResultTimeout.getSDKAppID);
                parcel.writeString(challengeResultTimeout.getSDKTransactionID);
                int i41 = getSDKReferenceNumber;
                int i42 = i41 ^ 81;
                int i43 = (i41 & 81) << 1;
                AuthenticationRequestParameters = ((i42 & i43) + (i43 | i42)) % 128;
                return null;
            case 6:
                e sDKAppID = atd.d.getSDKEphemeralPublicKey.ChallengeResult((b0) objArr[0], getDeviceData).getSDKAppID();
                ArrayList arrayList = new ArrayList();
                int i44 = getSDKReferenceNumber;
                AuthenticationRequestParameters = k.c(i44 ^ 80, (i44 & 80) << 1, 1, 128);
                while (i37 < sDKAppID.f30756a.size()) {
                    arrayList.add(new ChallengeResultTimeout(sDKAppID.get(i37)));
                    i37 = (-2) - (((i37 ^ 2) + ((i37 & 2) << 1)) ^ (-1));
                    int i45 = AuthenticationRequestParameters;
                    int i46 = (i45 & (-122)) | ((~i45) & 121);
                    int i47 = (i45 & 121) << 1;
                    getSDKReferenceNumber = ((i46 & i47) + (i47 | i46)) % 128;
                }
                int i48 = AuthenticationRequestParameters;
                getSDKReferenceNumber = ((i48 ^ 19) + ((i48 & 19) << 1)) % 128;
                return arrayList;
            case 7:
                return AuthenticationRequestParameters(objArr);
            default:
                return getDeviceData(objArr);
        }
    }
}
