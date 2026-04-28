package atd.b;

import org.json.JSONException;
import org.json.JSONObject;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class getDeviceData<T> implements atd.i.getDeviceData {
    private static int getSDKAppID = 1;
    private static int getSDKTransactionID;
    private String AuthenticationRequestParameters;
    private T getDeviceData;

    public getDeviceData(String str, T t9) {
        this.AuthenticationRequestParameters = str;
        this.getDeviceData = t9;
    }

    public static /* synthetic */ Object getDeviceData(int i11, int i12, int i13, int i14, int i15, int i16, Object[] objArr) {
        int i17 = ~i12;
        int i18 = (~i14) | i17;
        int i19 = ~i18;
        int i21 = (~(i17 | i15)) | i19;
        int i22 = (~(i17 | (~i15) | i14)) | (~(i18 | i15)) | (~(i12 | i15 | i14));
        int i23 = (~(i14 | i12)) | i15 | i19;
        int i24 = ((-1222115328) * i16) + (1616379904 * i13) + (1256718336 * i11) + (168349733 * i23) + ((-168349733) * i22) + (i21 * (-168349733)) + (1088368604 * i15) + ((1425068070 * i12) - 1475346432);
        int iC = a0.c(i16, -1076018391, (5090439 * i13) + i12 + i15 + i11);
        return a0.e(iC, -1125187584, (i16 * 741505039) + ((i13 * 1582232257) + ((i11 * (-1092730761)) + ((i23 * 307) + ((i22 * (-307)) + ((i21 * (-307)) + ((i15 * (-1092731068)) + ((i12 * (-1092730454)) + 799718796))))))), -410583040, (1028194304 * iC) + i24) != 1 ? getDeviceData(objArr) : AuthenticationRequestParameters(objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // atd.i.getDeviceData
    public JSONObject AuthenticationRequestParameters() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        int iAuthenticationRequestParameters = atd.ah.getSDKAppID.AuthenticationRequestParameters();
        if (getSDKReferenceNumber(getDeviceData(atd.ah.getSDKAppID.AuthenticationRequestParameters(), -1632602498, atd.ah.getSDKAppID.AuthenticationRequestParameters(), iAuthenticationRequestParameters, 1632602498, atd.ah.getSDKAppID.AuthenticationRequestParameters(), new Object[]{this}))) {
            int i11 = getSDKTransactionID + 19;
            getSDKAppID = i11 % 128;
            if (i11 % 2 == 0) {
                int iAuthenticationRequestParameters2 = atd.ah.getSDKAppID.AuthenticationRequestParameters();
                String str = (String) getDeviceData(atd.ah.getSDKAppID.AuthenticationRequestParameters(), 754367138, atd.ah.getSDKAppID.AuthenticationRequestParameters(), iAuthenticationRequestParameters2, -754367137, atd.ah.getSDKAppID.AuthenticationRequestParameters(), new Object[]{this});
                int iAuthenticationRequestParameters3 = atd.ah.getSDKAppID.AuthenticationRequestParameters();
                jSONObject.put(str, getDeviceData(atd.ah.getSDKAppID.AuthenticationRequestParameters(), -1632602498, atd.ah.getSDKAppID.AuthenticationRequestParameters(), iAuthenticationRequestParameters3, 1632602498, atd.ah.getSDKAppID.AuthenticationRequestParameters(), new Object[]{this}));
                throw null;
            }
            int iAuthenticationRequestParameters4 = atd.ah.getSDKAppID.AuthenticationRequestParameters();
            String str2 = (String) getDeviceData(atd.ah.getSDKAppID.AuthenticationRequestParameters(), 754367138, atd.ah.getSDKAppID.AuthenticationRequestParameters(), iAuthenticationRequestParameters4, -754367137, atd.ah.getSDKAppID.AuthenticationRequestParameters(), new Object[]{this});
            int iAuthenticationRequestParameters5 = atd.ah.getSDKAppID.AuthenticationRequestParameters();
            jSONObject.put(str2, getDeviceData(atd.ah.getSDKAppID.AuthenticationRequestParameters(), -1632602498, atd.ah.getSDKAppID.AuthenticationRequestParameters(), iAuthenticationRequestParameters5, 1632602498, atd.ah.getSDKAppID.AuthenticationRequestParameters(), new Object[]{this}));
            getSDKTransactionID = (getSDKAppID + 51) % 128;
        }
        int i12 = getSDKTransactionID;
        int i13 = i12 & 33;
        int i14 = -(-((i12 ^ 33) | i13));
        int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
        getSDKAppID = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = 49 / 0;
        }
        return jSONObject;
    }

    public final T getSDKAppID() {
        int iAuthenticationRequestParameters = atd.ah.getSDKAppID.AuthenticationRequestParameters();
        return (T) getDeviceData(atd.ah.getSDKAppID.AuthenticationRequestParameters(), -1632602498, atd.ah.getSDKAppID.AuthenticationRequestParameters(), iAuthenticationRequestParameters, 1632602498, atd.ah.getSDKAppID.AuthenticationRequestParameters(), new Object[]{this});
    }

    public final String getSDKReferenceNumber() {
        int iAuthenticationRequestParameters = atd.ah.getSDKAppID.AuthenticationRequestParameters();
        return (String) getDeviceData(atd.ah.getSDKAppID.AuthenticationRequestParameters(), 754367138, atd.ah.getSDKAppID.AuthenticationRequestParameters(), iAuthenticationRequestParameters, -754367137, atd.ah.getSDKAppID.AuthenticationRequestParameters(), new Object[]{this});
    }

    public abstract boolean getSDKReferenceNumber(T t9);

    public void getSDKTransactionID() {
        int i11 = (getSDKAppID + 47) % 128;
        getSDKTransactionID = i11;
        this.AuthenticationRequestParameters = null;
        this.getDeviceData = null;
        int i12 = ((((i11 ^ 109) | (i11 & 109)) << 1) - (~(-(((~i11) & 109) | (i11 & (-110)))))) - 1;
        getSDKAppID = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) {
        getDeviceData getdevicedata = (getDeviceData) objArr[0];
        int i11 = getSDKTransactionID;
        int i12 = i11 | 45;
        int i13 = ((i12 << 1) - ((~(i11 & 45)) & i12)) % 128;
        getSDKAppID = i13;
        T t9 = getdevicedata.getDeviceData;
        int i14 = i13 & 11;
        int i15 = (((~i14) & (i13 | 11)) - (~(i14 << 1))) - 1;
        getSDKTransactionID = i15 % 128;
        if (i15 % 2 == 0) {
            return t9;
        }
        throw null;
    }

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
        getDeviceData getdevicedata = (getDeviceData) objArr[0];
        int i11 = getSDKAppID;
        int i12 = i11 + 75;
        getSDKTransactionID = i12 % 128;
        int i13 = i12 % 2;
        String str = getdevicedata.AuthenticationRequestParameters;
        if (i13 != 0) {
            throw null;
        }
        int i14 = i11 & 101;
        int i15 = ((i11 ^ 101) | i14) << 1;
        int i16 = -((i11 | 101) & (~i14));
        getSDKTransactionID = ((i15 ^ i16) + ((i16 & i15) << 1)) % 128;
        return str;
    }
}
