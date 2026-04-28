package atd.d;

import atd.d.getAdditionalDetails;
import atd.p.ChallengeResultTimeout;
import atd.y.ChallengeResultCompleted;
import atd.y.getMessageVersion;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class getDeviceData {
    private static int getSDKAppID = 0;
    private static int getSDKReferenceNumber = 1;
    private final getSDKAppID getDeviceData = new ChallengeResult();

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) throws Throwable {
        Throwable th2;
        getDeviceData getdevicedata = (getDeviceData) objArr[0];
        getTransactionStatus gettransactionstatus = (getTransactionStatus) objArr[1];
        getSDKReferenceNumber = (getSDKAppID + 103) % 128;
        HttpURLConnection httpURLConnection = null;
        try {
            int iAuthenticationRequestParameters = getMessageVersion.getSDKReferenceNumber.AuthenticationRequestParameters();
            int iAuthenticationRequestParameters2 = getMessageVersion.getSDKReferenceNumber.AuthenticationRequestParameters();
            int iAuthenticationRequestParameters3 = getMessageVersion.getSDKReferenceNumber.AuthenticationRequestParameters();
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) getSDKReferenceNumber(803956465, iAuthenticationRequestParameters2, getMessageVersion.getSDKReferenceNumber.AuthenticationRequestParameters(), iAuthenticationRequestParameters, new Object[]{getdevicedata, gettransactionstatus}, -803956462, iAuthenticationRequestParameters3);
            try {
                httpURLConnection2.connect();
                int sDKTransactionID = ChallengeResultTimeout.getSDKReferenceNumber.getSDKTransactionID();
                int sDKTransactionID2 = ChallengeResultTimeout.getSDKReferenceNumber.getSDKTransactionID();
                int sDKTransactionID3 = ChallengeResultTimeout.getSDKReferenceNumber.getSDKTransactionID();
                if (((getMessageVersion) getTransactionStatus.AuthenticationRequestParameters(-1508914177, ChallengeResultTimeout.getSDKReferenceNumber.getSDKTransactionID(), sDKTransactionID2, sDKTransactionID3, sDKTransactionID, new Object[]{gettransactionstatus}, 1508914177)).getSDKAppID()) {
                    int i11 = getSDKAppID;
                    int i12 = (i11 ^ 54) + ((i11 & 54) << 1);
                    getSDKReferenceNumber = ((i12 ^ (-1)) + (i12 << 1)) % 128;
                    OutputStream outputStream = httpURLConnection2.getOutputStream();
                    int sDKTransactionID4 = ChallengeResultTimeout.getSDKReferenceNumber.getSDKTransactionID();
                    int sDKTransactionID5 = ChallengeResultTimeout.getSDKReferenceNumber.getSDKTransactionID();
                    int sDKTransactionID6 = ChallengeResultTimeout.getSDKReferenceNumber.getSDKTransactionID();
                    outputStream.write((byte[]) getTransactionStatus.AuthenticationRequestParameters(-1495701711, ChallengeResultTimeout.getSDKReferenceNumber.getSDKTransactionID(), sDKTransactionID5, sDKTransactionID6, sDKTransactionID4, new Object[]{gettransactionstatus}, 1495701714));
                    outputStream.flush();
                    outputStream.close();
                    getSDKReferenceNumber = (getSDKAppID + 109) % 128;
                }
                int iAuthenticationRequestParameters4 = getMessageVersion.getSDKReferenceNumber.AuthenticationRequestParameters();
                int iAuthenticationRequestParameters5 = getMessageVersion.getSDKReferenceNumber.AuthenticationRequestParameters();
                int iAuthenticationRequestParameters6 = getMessageVersion.getSDKReferenceNumber.AuthenticationRequestParameters();
                getAdditionalDetails getadditionaldetails = (getAdditionalDetails) getSDKReferenceNumber(532395976, iAuthenticationRequestParameters5, getMessageVersion.getSDKReferenceNumber.AuthenticationRequestParameters(), iAuthenticationRequestParameters4, new Object[]{httpURLConnection2}, -532395974, iAuthenticationRequestParameters6);
                int i13 = getSDKReferenceNumber;
                int i14 = ((i13 ^ 119) | (i13 & 119)) << 1;
                int i15 = -(((~i13) & 119) | (i13 & (-120)));
                getSDKAppID = ((i14 & i15) + (i15 | i14)) % 128;
                httpURLConnection2.disconnect();
                int i16 = getSDKAppID;
                int i17 = ((i16 & 1) + (i16 | 1)) % 128;
                getSDKReferenceNumber = i17;
                int i18 = i17 & 109;
                int i19 = i18 + ((i17 ^ 109) | i18);
                getSDKAppID = i19 % 128;
                if (i19 % 2 == 0) {
                    return getadditionaldetails;
                }
                throw null;
            } catch (Throwable th3) {
                th2 = th3;
                httpURLConnection = httpURLConnection2;
                if (httpURLConnection == null) {
                    throw th2;
                }
                httpURLConnection.disconnect();
                getSDKAppID = (getSDKReferenceNumber + 13) % 128;
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) throws IOException {
        InputStream inputStream = (InputStream) objArr[0];
        int i11 = getSDKAppID;
        int i12 = i11 + 8;
        int i13 = (i12 ^ (-1)) + (i12 << 1);
        getSDKReferenceNumber = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
        if (inputStream == null) {
            int i14 = ((i11 ^ 1) | (i11 & 1)) << 1;
            int i15 = -((i11 & (-2)) | ((~i11) & 1));
            int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
            getSDKReferenceNumber = i16 % 128;
            if (i16 % 2 != 0) {
                return null;
            }
            throw null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        int i17 = inputStream.read(bArr);
        int i18 = getSDKReferenceNumber;
        getSDKAppID = ((-2) - (((i18 & 28) + (i18 | 28)) ^ (-1))) % 128;
        while (i17 > 0) {
            getSDKAppID = (getSDKReferenceNumber + 55) % 128;
            byteArrayOutputStream.write(bArr, 0, i17);
            i17 = inputStream.read(bArr);
            int i19 = getSDKAppID;
            int i21 = i19 & 5;
            int i22 = (i19 | 5) & (~i21);
            int i23 = -(-(i21 << 1));
            getSDKReferenceNumber = ((i22 & i23) + (i22 | i23)) % 128;
        }
        inputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int i24 = getSDKAppID;
        int i25 = i24 & 97;
        getSDKReferenceNumber = (i25 + ((i24 ^ 97) | i25)) % 128;
        return byteArray;
    }

    private static /* synthetic */ Object getSDKAppID(Object[] objArr) throws IOException {
        String str;
        Iterator it;
        getDeviceData getdevicedata = (getDeviceData) objArr[0];
        getTransactionStatus gettransactionstatus = (getTransactionStatus) objArr[1];
        getSDKReferenceNumber = (getSDKAppID + 105) % 128;
        getSDKAppID getsdkappid = getdevicedata.getDeviceData;
        int sDKTransactionID = ChallengeResultTimeout.getSDKReferenceNumber.getSDKTransactionID();
        HttpURLConnection httpURLConnectionAuthenticationRequestParameters = getsdkappid.AuthenticationRequestParameters((String) getTransactionStatus.AuthenticationRequestParameters(-1137934808, ChallengeResultTimeout.getSDKReferenceNumber.getSDKTransactionID(), ChallengeResultTimeout.getSDKReferenceNumber.getSDKTransactionID(), ChallengeResultTimeout.getSDKReferenceNumber.getSDKTransactionID(), sDKTransactionID, new Object[]{gettransactionstatus}, 1137934809));
        int sDKTransactionID2 = ChallengeResultTimeout.getSDKReferenceNumber.getSDKTransactionID();
        httpURLConnectionAuthenticationRequestParameters.setRequestMethod(((getMessageVersion) getTransactionStatus.AuthenticationRequestParameters(-1508914177, ChallengeResultTimeout.getSDKReferenceNumber.getSDKTransactionID(), ChallengeResultTimeout.getSDKReferenceNumber.getSDKTransactionID(), ChallengeResultTimeout.getSDKReferenceNumber.getSDKTransactionID(), sDKTransactionID2, new Object[]{gettransactionstatus}, 1508914177)).getDeviceData());
        httpURLConnectionAuthenticationRequestParameters.setConnectTimeout(getdevicedata.getSDKAppID());
        httpURLConnectionAuthenticationRequestParameters.setReadTimeout(getdevicedata.getSDKReferenceNumber());
        httpURLConnectionAuthenticationRequestParameters.setUseCaches(false);
        httpURLConnectionAuthenticationRequestParameters.setDoInput(true);
        int sDKTransactionID3 = ChallengeResultTimeout.getSDKReferenceNumber.getSDKTransactionID();
        httpURLConnectionAuthenticationRequestParameters.setDoOutput(((getMessageVersion) getTransactionStatus.AuthenticationRequestParameters(-1508914177, ChallengeResultTimeout.getSDKReferenceNumber.getSDKTransactionID(), ChallengeResultTimeout.getSDKReferenceNumber.getSDKTransactionID(), ChallengeResultTimeout.getSDKReferenceNumber.getSDKTransactionID(), sDKTransactionID3, new Object[]{gettransactionstatus}, 1508914177)).getSDKAppID());
        int sDKTransactionID4 = ChallengeResultTimeout.getSDKReferenceNumber.getSDKTransactionID();
        Map map = (Map) getTransactionStatus.AuthenticationRequestParameters(-60421338, ChallengeResultTimeout.getSDKReferenceNumber.getSDKTransactionID(), ChallengeResultTimeout.getSDKReferenceNumber.getSDKTransactionID(), ChallengeResultTimeout.getSDKReferenceNumber.getSDKTransactionID(), sDKTransactionID4, new Object[]{gettransactionstatus}, 60421340);
        if (map != null) {
            int i11 = getSDKReferenceNumber;
            getSDKAppID = (((i11 & 46) + (i11 | 46)) - 1) % 128;
            Iterator it2 = map.entrySet().iterator();
            getSDKReferenceNumber = (getSDKAppID + 79) % 128;
            while (it2.hasNext()) {
                int i12 = getSDKAppID;
                int i13 = (i12 ^ 68) + ((i12 & 68) << 1);
                int i14 = (i13 ^ (-1)) + (i13 << 1);
                getSDKReferenceNumber = i14 % 128;
                if (i14 % 2 == 0) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    str = (String) entry.getKey();
                    it = ((List) entry.getValue()).iterator();
                    int i15 = 11 / 0;
                } else {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    str = (String) entry2.getKey();
                    it = ((List) entry2.getValue()).iterator();
                }
                while (it.hasNext()) {
                    int i16 = getSDKReferenceNumber + 59;
                    getSDKAppID = i16 % 128;
                    if (i16 % 2 != 0) {
                        httpURLConnectionAuthenticationRequestParameters.addRequestProperty(str, (String) it.next());
                        throw null;
                    }
                    httpURLConnectionAuthenticationRequestParameters.addRequestProperty(str, (String) it.next());
                    int i17 = getSDKAppID;
                    int i18 = (i17 & (-8)) | ((~i17) & 7);
                    int i19 = -(-((i17 & 7) << 1));
                    getSDKReferenceNumber = (((i18 | i19) << 1) - (i19 ^ i18)) % 128;
                }
                int i21 = getSDKReferenceNumber;
                int i22 = i21 ^ 61;
                getSDKAppID = a0.d(((i21 & 61) | i22) << 1, ~(-i22), 1, 128);
            }
        }
        int i23 = getSDKReferenceNumber;
        getSDKAppID = ((i23 ^ 121) + ((i23 & 121) << 1)) % 128;
        return httpURLConnectionAuthenticationRequestParameters;
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) objArr[0];
        getAdditionalDetails.AuthenticationRequestParameters authenticationRequestParameters = (getAdditionalDetails.AuthenticationRequestParameters) getAdditionalDetails.AuthenticationRequestParameters.getDeviceData(ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber(), ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber(), -900930583, 900930584, new Object[]{(getAdditionalDetails.AuthenticationRequestParameters) getAdditionalDetails.AuthenticationRequestParameters.getDeviceData(ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber(), ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber(), -249606708, 249606708, new Object[]{(getAdditionalDetails.AuthenticationRequestParameters) getAdditionalDetails.AuthenticationRequestParameters.getDeviceData(ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber(), ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber(), -58865009, 58865013, new Object[]{new getAdditionalDetails.AuthenticationRequestParameters(), Integer.valueOf(httpURLConnection.getResponseCode())}, ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber(), ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber()), httpURLConnection.getHeaderFields()}, ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber(), ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber()), httpURLConnection.getResponseMessage()}, ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber(), ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber());
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            int i11 = getSDKReferenceNumber;
            int i12 = i11 & 101;
            int i13 = (i11 ^ 101) | i12;
            int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
            getSDKAppID = i14 % 128;
            if (i14 % 2 != 0) {
                httpURLConnection.getInputStream();
                throw null;
            }
            errorStream = httpURLConnection.getInputStream();
            int i15 = getSDKAppID;
            getSDKReferenceNumber = (((i15 | 23) << 1) - (i15 ^ 23)) % 128;
        }
        int iAuthenticationRequestParameters = getMessageVersion.getSDKReferenceNumber.AuthenticationRequestParameters();
        int iAuthenticationRequestParameters2 = getMessageVersion.getSDKReferenceNumber.AuthenticationRequestParameters();
        int iAuthenticationRequestParameters3 = getMessageVersion.getSDKReferenceNumber.AuthenticationRequestParameters();
        int sDKReferenceNumber = ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber2 = ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber();
        getAdditionalDetails getadditionaldetails = (getAdditionalDetails) getAdditionalDetails.AuthenticationRequestParameters.getDeviceData(ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber(), ChallengeResultCompleted.getSDKTransactionID.getSDKReferenceNumber(), 1480433641, -1480433638, new Object[]{authenticationRequestParameters}, sDKReferenceNumber, sDKReferenceNumber2);
        int i16 = getSDKReferenceNumber;
        int i17 = (-2) - (((i16 & 58) + (i16 | 58)) ^ (-1));
        getSDKAppID = i17 % 128;
        if (i17 % 2 == 0) {
            return getadditionaldetails;
        }
        throw null;
    }

    public abstract int getSDKAppID();

    public abstract int getSDKReferenceNumber();

    public final getAdditionalDetails getSDKTransactionID(getTransactionStatus gettransactionstatus) throws IOException {
        int iAuthenticationRequestParameters = getMessageVersion.getSDKReferenceNumber.AuthenticationRequestParameters();
        int iAuthenticationRequestParameters2 = getMessageVersion.getSDKReferenceNumber.AuthenticationRequestParameters();
        int iAuthenticationRequestParameters3 = getMessageVersion.getSDKReferenceNumber.AuthenticationRequestParameters();
        return (getAdditionalDetails) getSDKReferenceNumber(-639838390, iAuthenticationRequestParameters2, getMessageVersion.getSDKReferenceNumber.AuthenticationRequestParameters(), iAuthenticationRequestParameters, new Object[]{this, gettransactionstatus}, 639838390, iAuthenticationRequestParameters3);
    }

    private static getAdditionalDetails AuthenticationRequestParameters(HttpURLConnection httpURLConnection) throws IOException {
        int iAuthenticationRequestParameters = getMessageVersion.getSDKReferenceNumber.AuthenticationRequestParameters();
        int iAuthenticationRequestParameters2 = getMessageVersion.getSDKReferenceNumber.AuthenticationRequestParameters();
        int iAuthenticationRequestParameters3 = getMessageVersion.getSDKReferenceNumber.AuthenticationRequestParameters();
        return (getAdditionalDetails) getSDKReferenceNumber(532395976, iAuthenticationRequestParameters2, getMessageVersion.getSDKReferenceNumber.AuthenticationRequestParameters(), iAuthenticationRequestParameters, new Object[]{httpURLConnection}, -532395974, iAuthenticationRequestParameters3);
    }

    public static /* synthetic */ Object getSDKReferenceNumber(int i11, int i12, int i13, int i14, Object[] objArr, int i15, int i16) {
        int i17 = ~i15;
        int i18 = ~i14;
        int i19 = (~(i17 | i18)) | i11;
        int i21 = i14 | i17;
        int i22 = (~(i14 | i11)) | (~(i17 | (~i11) | i18)) | (~(i11 | i15));
        int i23 = ((-1479278592) * i13) + ((-1475084288) * i16) + (2092695552 * i12) + ((-1228335359) * i22) + (1228335359 * i21) + (1838296578 * i19) + ((-973936384) * i15) + ((i11 * (-973936384)) - 801505280);
        int iC = a0.c(i13, 189947931, (764943627 * i16) + i11 + i15 + i12);
        int i24 = i16 * (-1861700041);
        int i25 = i13 * (-831392377);
        int iE = a0.e(iC, 995229696, i25 + i24 + (i12 * 1860538117) + (i22 * 517) + (i21 * (-517)) + (i19 * 1034) + (i15 * 1860537600) + (i11 * 1860537600) + 224780607, 1053163520, ((-626393088) * iC) + i23);
        return iE != 1 ? iE != 2 ? iE != 3 ? AuthenticationRequestParameters(objArr) : getSDKAppID(objArr) : getSDKReferenceNumber(objArr) : getDeviceData(objArr);
    }

    private static byte[] getSDKReferenceNumber(InputStream inputStream) throws IOException {
        int iAuthenticationRequestParameters = getMessageVersion.getSDKReferenceNumber.AuthenticationRequestParameters();
        int iAuthenticationRequestParameters2 = getMessageVersion.getSDKReferenceNumber.AuthenticationRequestParameters();
        int iAuthenticationRequestParameters3 = getMessageVersion.getSDKReferenceNumber.AuthenticationRequestParameters();
        return (byte[]) getSDKReferenceNumber(-1419717071, iAuthenticationRequestParameters2, getMessageVersion.getSDKReferenceNumber.AuthenticationRequestParameters(), iAuthenticationRequestParameters, new Object[]{inputStream}, 1419717072, iAuthenticationRequestParameters3);
    }

    private HttpURLConnection getSDKReferenceNumber(getTransactionStatus gettransactionstatus) throws IOException {
        int iAuthenticationRequestParameters = getMessageVersion.getSDKReferenceNumber.AuthenticationRequestParameters();
        int iAuthenticationRequestParameters2 = getMessageVersion.getSDKReferenceNumber.AuthenticationRequestParameters();
        int iAuthenticationRequestParameters3 = getMessageVersion.getSDKReferenceNumber.AuthenticationRequestParameters();
        return (HttpURLConnection) getSDKReferenceNumber(803956465, iAuthenticationRequestParameters2, getMessageVersion.getSDKReferenceNumber.AuthenticationRequestParameters(), iAuthenticationRequestParameters, new Object[]{this, gettransactionstatus}, -803956462, iAuthenticationRequestParameters3);
    }
}
