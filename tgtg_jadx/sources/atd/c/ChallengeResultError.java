package atd.c;

import android.os.Parcel;
import android.os.Parcelable;
import atd.q.getSDKTransactionID;
import com.app.tgtg.model.local.AppConstants;
import n90.b0;
import r8.k;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class ChallengeResultError extends getTransactionStatus {
    public static final Parcelable.Creator<ChallengeResultError> CREATOR = new Parcelable.Creator<ChallengeResultError>() { // from class: atd.c.ChallengeResultError.3
        private static int AuthenticationRequestParameters = 0;
        private static int getSDKReferenceNumber = 1;

        private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
            AnonymousClass3 anonymousClass3 = (AnonymousClass3) objArr[0];
            Parcel parcel = (Parcel) objArr[1];
            int i11 = AuthenticationRequestParameters + 24;
            getSDKReferenceNumber = ((i11 ^ (-1)) + (i11 << 1)) % 128;
            ChallengeResultError challengeResultError = (ChallengeResultError) AuthenticationRequestParameters(getSDKTransactionID.C0014getSDKTransactionID.getDeviceData(), getSDKTransactionID.C0014getSDKTransactionID.getDeviceData(), getSDKTransactionID.C0014getSDKTransactionID.getDeviceData(), getSDKTransactionID.C0014getSDKTransactionID.getDeviceData(), new Object[]{parcel}, 1817705784, -1817705783);
            int iIdentityHashCode = System.identityHashCode(anonymousClass3);
            int i12 = (~iIdentityHashCode) & ((~iIdentityHashCode) | iIdentityHashCode);
            int i13 = (-2030829711) ^ i12;
            int i14 = i12 & (-2030829711);
            int i15 = ~((i14 & i13) | (i13 ^ i14));
            int i16 = -(~(-(-(((i15 & (-1563041475)) | ((-1563041475) ^ i15)) * (-235)))));
            int i17 = (((781314595 | i16) << 1) - (i16 ^ 781314595)) - 1;
            int i18 = (-2030829711) & iIdentityHashCode;
            int i19 = i18 | (((-2030829711) | iIdentityHashCode) & (~i18));
            int i21 = (i19 | (~i19)) & (~i19);
            int i22 = -(-(((i21 & (-1563041475)) | ((-1563041475) ^ i21)) * (-470)));
            int i23 = ((i17 ^ i22) | (i17 & i22)) << 1;
            int i24 = -((i22 & (~i17)) | ((~i22) & i17));
            int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
            int i26 = (-1493696643) ^ iIdentityHashCode;
            int i27 = iIdentityHashCode & (-1493696643);
            int i28 = ~((i27 & i26) | (i26 ^ i27));
            int i29 = (-2100174543) ^ i28;
            int i31 = i28 & (-2100174543);
            int i32 = -(~(((i31 & i29) | (i29 ^ i31)) * 235));
            int i33 = (-2) - (((i25 ^ i32) + ((i32 & i25) << 1)) ^ (-1));
            int deviceData = getSDKTransactionID.C0014getSDKTransactionID.getDeviceData();
            int i34 = ~((2028270586 & deviceData) | (2028270586 ^ deviceData));
            int i35 = ((i34 & (-2095511548)) | ((-2095511548) ^ i34)) * (-283);
            int i36 = (-1345815262) & i35;
            int i37 = -(-((i35 ^ (-1345815262)) | i36));
            int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
            int i39 = i38 & (-668680296);
            int i41 = -(-(((-668680296) ^ i38) | i39));
            int i42 = (i39 & i41) + (i41 | i39);
            int i43 = (-67240962) ^ deviceData;
            int i44 = (-67240962) & deviceData;
            int i45 = (i44 & i43) | (i43 ^ i44);
            int i46 = ((i45 | (~i45)) & (~i45)) * 283;
            int i47 = i42 & i46;
            if (i33 <= i47 + ((i46 ^ i42) | i47)) {
                int i48 = 16 / 0;
            }
            return challengeResultError;
        }

        private static ChallengeResultError[] getDeviceData(int i11) {
            return (ChallengeResultError[]) AuthenticationRequestParameters(getSDKTransactionID.C0014getSDKTransactionID.getDeviceData(), getSDKTransactionID.C0014getSDKTransactionID.getDeviceData(), getSDKTransactionID.C0014getSDKTransactionID.getDeviceData(), getSDKTransactionID.C0014getSDKTransactionID.getDeviceData(), new Object[]{Integer.valueOf(i11)}, 1611500638, -1611500636);
        }

        private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
            int iIntValue = ((Number) objArr[0]).intValue();
            int i11 = getSDKReferenceNumber;
            int i12 = (((i11 & (-60)) | ((~i11) & 59)) + ((i11 & 59) << 1)) % 128;
            AuthenticationRequestParameters = i12;
            ChallengeResultError[] challengeResultErrorArr = new ChallengeResultError[iIntValue];
            int i13 = i12 & AppConstants.RESULT_CODE_ORDER_CANCELLED;
            int i14 = -(-((i12 ^ AppConstants.RESULT_CODE_ORDER_CANCELLED) | i13));
            int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
            getSDKReferenceNumber = i15 % 128;
            if (i15 % 2 == 0) {
                int i16 = 74 / 0;
            }
            return challengeResultErrorArr;
        }

        /* JADX WARN: Type inference failed for: r8v1, types: [atd.c.ChallengeResultError, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ChallengeResultError createFromParcel(Parcel parcel) {
            return AuthenticationRequestParameters(getSDKTransactionID.C0014getSDKTransactionID.getDeviceData(), getSDKTransactionID.C0014getSDKTransactionID.getDeviceData(), getSDKTransactionID.C0014getSDKTransactionID.getDeviceData(), getSDKTransactionID.C0014getSDKTransactionID.getDeviceData(), new Object[]{this, parcel}, -853337526, 853337529);
        }

        /* JADX WARN: Type inference failed for: r8v3, types: [atd.c.ChallengeResultError[], java.lang.Object[]] */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ChallengeResultError[] newArray(int i11) {
            return (Object[]) AuthenticationRequestParameters(getSDKTransactionID.C0014getSDKTransactionID.getDeviceData(), getSDKTransactionID.C0014getSDKTransactionID.getDeviceData(), getSDKTransactionID.C0014getSDKTransactionID.getDeviceData(), getSDKTransactionID.C0014getSDKTransactionID.getDeviceData(), new Object[]{this, Integer.valueOf(i11)}, -1346517771, 1346517771);
        }

        private static ChallengeResultError getDeviceData(Parcel parcel) {
            return (ChallengeResultError) AuthenticationRequestParameters(getSDKTransactionID.C0014getSDKTransactionID.getDeviceData(), getSDKTransactionID.C0014getSDKTransactionID.getDeviceData(), getSDKTransactionID.C0014getSDKTransactionID.getDeviceData(), getSDKTransactionID.C0014getSDKTransactionID.getDeviceData(), new Object[]{parcel}, 1817705784, -1817705783);
        }

        public static /* synthetic */ Object AuthenticationRequestParameters(int i11, int i12, int i13, int i14, Object[] objArr, int i15, int i16) {
            int i17 = (~(i15 | i11)) | i16;
            int i18 = i11 | i15 | i16;
            int i19 = ((-1407420559) * i18) + (i17 * (-1407420559)) + ((-629045104) * i16) + (i15 * (-629045104)) + 1817116672;
            int i21 = ~i15;
            int i22 = (888930304 * i14) + ((-2125594624) * i13) + ((-2036465664) * i12) + (1407420559 * i21) + i19;
            int iC = a0.c(i14, -859425246, ((-421447895) * i13) + i15 + i16 + i12);
            int i23 = i17 * (-49);
            int i24 = i18 * (-49);
            int i25 = i21 * 49;
            int i26 = i12 * 1303038783;
            int i27 = i13 * 1583617559;
            int i28 = i14 * (-1102559138);
            int iE = a0.e(iC, 510722048, i28 + i27 + i26 + i25 + i24 + i23 + (i16 * 1303038832) + (i15 * 1303038832) + 2077918271, 607191040, (441384960 * iC) + i22);
            if (iE == 1) {
                ChallengeResultError challengeResultError = new ChallengeResultError((Parcel) objArr[0]);
                int i29 = AuthenticationRequestParameters;
                getSDKReferenceNumber = k.c(i29 & 66, i29 | 66, 1, 128);
                return challengeResultError;
            }
            if (iE == 2) {
                return getSDKTransactionID(objArr);
            }
            if (iE != 3) {
                int iIntValue = ((Number) objArr[1]).intValue();
                int i31 = AuthenticationRequestParameters;
                int i32 = i31 & 103;
                int i33 = ((i31 ^ 103) | i32) << 1;
                int i34 = -((i31 | 103) & (~i32));
                getSDKReferenceNumber = (((i33 | i34) << 1) - (i34 ^ i33)) % 128;
                ChallengeResultError[] challengeResultErrorArr = (ChallengeResultError[]) AuthenticationRequestParameters(getSDKTransactionID.C0014getSDKTransactionID.getDeviceData(), getSDKTransactionID.C0014getSDKTransactionID.getDeviceData(), getSDKTransactionID.C0014getSDKTransactionID.getDeviceData(), getSDKTransactionID.C0014getSDKTransactionID.getDeviceData(), new Object[]{Integer.valueOf(iIntValue)}, 1611500638, -1611500636);
                int i35 = getSDKReferenceNumber;
                AuthenticationRequestParameters = ((i35 & 21) + (i35 | 21)) % 128;
                return challengeResultErrorArr;
            }
            return AuthenticationRequestParameters(objArr);
        }
    };
    private static int getDeviceData = 0;
    private static int getSDKAppID = 1;
    private static int getSDKReferenceNumber = 0;
    private static int getSDKTransactionID = 1;
    private String AuthenticationRequestParameters;

    static {
        int i11 = getSDKTransactionID;
        int i12 = i11 & 55;
        int i13 = (((i11 | 55) & (~i12)) - (~(i12 << 1))) - 1;
        getDeviceData = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 57 / 0;
        }
    }

    public ChallengeResultError(b0 b0Var) throws atd.ac.getSDKAppID {
        super(b0Var);
        this.AuthenticationRequestParameters = atd.d.getSDKEphemeralPublicKey.getSDKTransactionID(b0Var, atd.am.getSDKReferenceNumber.SUBMIT_AUTHENTICATION_LABEL).getSDKAppID();
    }

    public final String ChallengeResultKt() {
        int i11 = getSDKReferenceNumber;
        int i12 = ((i11 ^ 75) | (i11 & 75)) << 1;
        int i13 = -(((~i11) & 75) | (i11 & (-76)));
        int i14 = (((i12 | i13) << 1) - (i13 ^ i12)) % 128;
        getSDKAppID = i14;
        String str = this.AuthenticationRequestParameters;
        int i15 = i14 & 11;
        int i16 = -(-((i14 ^ 11) | i15));
        int i17 = (i15 & i16) + (i15 | i16);
        getSDKReferenceNumber = i17 % 128;
        if (i17 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // atd.c.getTransactionStatus, atd.c.getSDKTransactionID, android.os.Parcelable
    public int describeContents() {
        int i11 = (getSDKAppID + 37) % 128;
        getSDKReferenceNumber = i11;
        int i12 = i11 & 67;
        int i13 = ((i11 ^ 67) | i12) << 1;
        int i14 = -((i11 | 67) & (~i12));
        int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
        getSDKAppID = i15 % 128;
        if (i15 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (r7 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        atd.c.ChallengeResultError.getSDKReferenceNumber = (r0 + 5) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (getClass() == r7.getClass()) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (super.equals(r7) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        r7 = (atd.c.ChallengeResultError.getSDKReferenceNumber + 49) % 128;
        atd.c.ChallengeResultError.getSDKAppID = r7;
        r0 = r7 & 51;
        r0 = r0 + ((r7 ^ 51) | r0);
        atd.c.ChallengeResultError.getSDKReferenceNumber = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        if ((r0 % 2) != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        r7 = java.util.Objects.equals(r6.AuthenticationRequestParameters, ((atd.c.ChallengeResultError) r7).AuthenticationRequestParameters);
        r0 = atd.c.ChallengeResultError.getSDKReferenceNumber;
        r4 = r0 & 11;
        atd.c.ChallengeResultError.getSDKAppID = w.a0.d(((r0 ^ 11) | r4) << 1, ~(-((r0 | 11) & (~r4))), 1, 128);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
    
        r7 = atd.c.ChallengeResultError.getSDKAppID;
        atd.c.ChallengeResultError.getSDKReferenceNumber = ((r7 ^ 115) + ((r7 & 115) << 1)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        r7 = r2 ^ 79;
        r0 = -(-((r2 & 79) << 1));
        r1 = (r7 & r0) + (r7 | r0);
        atd.c.ChallengeResultError.getSDKAppID = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if ((r1 % 2) == 0) goto L11;
     */
    @Override // atd.c.getTransactionStatus, atd.c.getSDKTransactionID
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = atd.c.ChallengeResultError.getSDKAppID
            r1 = r0 ^ 43
            r2 = r0 & 43
            r3 = 1
            int r2 = r2 << r3
            int r1 = r1 + r2
            int r2 = r1 % 128
            atd.c.ChallengeResultError.getSDKReferenceNumber = r2
            int r1 = r1 % 2
            r4 = 0
            r5 = 0
            if (r1 == 0) goto L19
            r1 = 52
            int r1 = r1 / r5
            if (r6 != r7) goto L30
            goto L1b
        L19:
            if (r6 != r7) goto L30
        L1b:
            r7 = r2 ^ 79
            r0 = r2 & 79
            int r0 = r0 << r3
            int r0 = -r0
            int r0 = -r0
            r1 = r7 & r0
            r7 = r7 | r0
            int r1 = r1 + r7
            int r7 = r1 % 128
            atd.c.ChallengeResultError.getSDKAppID = r7
            int r1 = r1 % 2
            if (r1 == 0) goto L2f
            return r3
        L2f:
            throw r4
        L30:
            r1 = 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L80
            int r0 = r0 + 5
            int r0 = r0 % r1
            atd.c.ChallengeResultError.getSDKReferenceNumber = r0
            java.lang.Class r0 = r6.getClass()
            java.lang.Class r2 = r7.getClass()
            if (r0 == r2) goto L44
            goto L80
        L44:
            boolean r0 = super.equals(r7)
            if (r0 != 0) goto L61
            int r7 = atd.c.ChallengeResultError.getSDKReferenceNumber
            int r7 = r7 + 49
            int r7 = r7 % r1
            atd.c.ChallengeResultError.getSDKAppID = r7
            r0 = r7 & 51
            r7 = r7 ^ 51
            r7 = r7 | r0
            int r0 = r0 + r7
            int r7 = r0 % 128
            atd.c.ChallengeResultError.getSDKReferenceNumber = r7
            int r0 = r0 % 2
            if (r0 != 0) goto L60
            return r5
        L60:
            throw r4
        L61:
            atd.c.ChallengeResultError r7 = (atd.c.ChallengeResultError) r7
            java.lang.String r0 = r6.AuthenticationRequestParameters
            java.lang.String r7 = r7.AuthenticationRequestParameters
            boolean r7 = java.util.Objects.equals(r0, r7)
            int r0 = atd.c.ChallengeResultError.getSDKReferenceNumber
            r2 = r0 ^ 11
            r4 = r0 & 11
            r2 = r2 | r4
            int r2 = r2 << r3
            int r4 = ~r4
            r0 = r0 | 11
            r0 = r0 & r4
            int r0 = -r0
            int r0 = ~r0
            int r0 = w.a0.d(r2, r0, r3, r1)
            atd.c.ChallengeResultError.getSDKAppID = r0
            return r7
        L80:
            int r7 = atd.c.ChallengeResultError.getSDKAppID
            r0 = r7 ^ 115(0x73, float:1.61E-43)
            r7 = r7 & 115(0x73, float:1.61E-43)
            int r7 = r7 << r3
            int r0 = r0 + r7
            int r0 = r0 % r1
            atd.c.ChallengeResultError.getSDKReferenceNumber = r0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.c.ChallengeResultError.equals(java.lang.Object):boolean");
    }

    @Override // atd.c.getTransactionStatus, atd.c.getSDKTransactionID
    public void getDeviceData() {
        int i11 = getSDKReferenceNumber;
        getSDKAppID = ((i11 ^ 53) + ((i11 & 53) << 1)) % 128;
        super.getDeviceData();
        this.AuthenticationRequestParameters = null;
        int i12 = getSDKReferenceNumber;
        int i13 = i12 & 75;
        getSDKAppID = a0.d((i12 | 75) & (~i13), ~(i13 << 1), 1, 128);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0041 A[PHI: r3
      0x0041: PHI (r3v9 int) = (r3v3 int), (r3v11 int) binds: [B:8:0x002c, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e A[PHI: r3
      0x002e: PHI (r3v4 int) = (r3v3 int), (r3v11 int) binds: [B:8:0x002c, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // atd.c.getTransactionStatus, atd.c.getSDKTransactionID
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r6 = this;
            int r0 = atd.c.ChallengeResultError.getSDKReferenceNumber
            r1 = r0 & 1
            r2 = 1
            r0 = r0 ^ r2
            r0 = r0 | r1
            r3 = r1 & r0
            r0 = r0 | r1
            int r3 = r3 + r0
            int r0 = r3 % 128
            atd.c.ChallengeResultError.getSDKAppID = r0
            int r3 = r3 % 2
            r0 = 128(0x80, float:1.8E-43)
            if (r3 != 0) goto L24
            int r1 = super.hashCode()
            int r1 = r1 + 53
            r3 = r1 ^ (-1)
            int r1 = r1 << r2
            int r3 = r3 + r1
            java.lang.String r1 = r6.AuthenticationRequestParameters
            if (r1 == 0) goto L41
            goto L2e
        L24:
            int r1 = super.hashCode()
            int r3 = r1 * 31
            java.lang.String r1 = r6.AuthenticationRequestParameters
            if (r1 == 0) goto L41
        L2e:
            java.lang.String r1 = r6.AuthenticationRequestParameters
            int r1 = r1.hashCode()
            int r4 = atd.c.ChallengeResultError.getSDKAppID
            r5 = r4 & 50
            r4 = r4 | 50
            int r4 = r8.k.c(r5, r4, r2, r0)
            atd.c.ChallengeResultError.getSDKReferenceNumber = r4
            goto L4f
        L41:
            int r1 = atd.c.ChallengeResultError.getSDKReferenceNumber
            r4 = r1 & 55
            int r5 = ~r4
            r1 = r1 | 55
            r1 = r1 & r5
            int r4 = r4 << r2
            int r1 = r1 + r4
            int r1 = r1 % r0
            atd.c.ChallengeResultError.getSDKAppID = r1
            r1 = 0
        L4f:
            int r1 = -r1
            int r1 = -r1
            r4 = r3 & r1
            int r5 = ~r4
            r1 = r1 | r3
            r1 = r1 & r5
            int r3 = r4 << 1
            r4 = r1 & r3
            r1 = r1 | r3
            int r4 = r4 + r1
            int r1 = atd.c.ChallengeResultError.getSDKReferenceNumber
            r3 = r1 | 24
            int r3 = r3 << r2
            r1 = r1 ^ 24
            int r0 = w.a0.d(r3, r1, r2, r0)
            atd.c.ChallengeResultError.getSDKAppID = r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.c.ChallengeResultError.hashCode():int");
    }

    @Override // atd.c.getTransactionStatus, atd.c.getSDKTransactionID, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int i12 = getSDKAppID;
        int i13 = i12 & 61;
        int i14 = (i12 | 61) & (~i13);
        int i15 = -(-(i13 << 1));
        getSDKReferenceNumber = ((i14 ^ i15) + ((i14 & i15) << 1)) % 128;
        super.writeToParcel(parcel, i11);
        parcel.writeString(this.AuthenticationRequestParameters);
        int i16 = getSDKAppID;
        int i17 = ((i16 ^ 3) | (i16 & 3)) << 1;
        int i18 = -(((~i16) & 3) | (i16 & (-4)));
        getSDKReferenceNumber = ((i17 & i18) + (i18 | i17)) % 128;
    }

    public ChallengeResultError(Parcel parcel) {
        super(parcel);
        this.AuthenticationRequestParameters = parcel.readString();
    }
}
