package atd.ak;

import atd.ac.getSDKAppID;
import atd.am.getSDKEphemeralPublicKey;
import atd.am.getSDKTransactionID;
import atd.bc.ChallengeResultCancelled;
import atd.bc.getSDKReferenceNumber;
import atd.w.getSDKTransactionID;
import atd.y.getSDKAppID;
import atd.y.timedout;
import com.adyen.threeds2.exception.InvalidInputException;
import com.adyen.threeds2.exception.SDKRuntimeException;
import com.adyen.threeds2.parameters.ConfigParameters;
import com.adyen.threeds2.util.AdyenConfigParameters;
import e40.a;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0000\u001a\u0012\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001*\u00020\u0003H\u0002\u001a\u0018\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0001*\u00020\u0003H\u0002\"\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"retrieveDirectoryServerKeys", "Lcom/adyen/threeds2/internal/result/Result;", "Lcom/adyen/threeds2/internal/result/DirectoryServerKeysResult;", "Lcom/adyen/threeds2/parameters/ConfigParameters;", "retrievePublicKey", "Lcom/adyen/threeds2/internal/jose/jwk/JsonWebKey;", "retrieveRootCertificates", "", "Ljava/security/cert/X509Certificate;", "KEY_KID", "", "KEY_CERTIFICATES", "threeds2_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getDeviceData {
    private static int AuthenticationRequestParameters = 0;
    public static int getDeviceData = 0;
    private static int getSDKAppID = 1;
    public static int getSDKTransactionID;

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
        getSDKEphemeralPublicKey getsdkephemeralpublickey;
        Object getdevicedata;
        ConfigParameters configParameters = (ConfigParameters) objArr[0];
        getSDKAppID = (AuthenticationRequestParameters + 103) % 128;
        String paramValue = AdyenConfigParameters.getParamValue(configParameters, AdyenConfigParameters.DIRECTORY_SERVER_ID);
        try {
            JSONObject jSONObjectAuthenticationRequestParameters = getSDKReferenceNumber.getSDKTransactionID().AuthenticationRequestParameters(AdyenConfigParameters.getParamValue(configParameters, AdyenConfigParameters.DIRECTORY_SERVER_PUBLIC_KEY));
            if (!jSONObjectAuthenticationRequestParameters.has("kid")) {
                int i11 = getSDKAppID;
                int i12 = (i11 | 85) << 1;
                int i13 = -(i11 ^ 85);
                int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                AuthenticationRequestParameters = i14 % 128;
                if (i14 % 2 != 0) {
                    jSONObjectAuthenticationRequestParameters.put("kid", paramValue);
                    int i15 = 75 / 0;
                } else {
                    jSONObjectAuthenticationRequestParameters.put("kid", paramValue);
                }
                int i16 = getSDKAppID;
                int i17 = i16 & 13;
                AuthenticationRequestParameters = (i17 + ((i16 ^ 13) | i17)) % 128;
            }
            getdevicedata = new getSDKTransactionID.getDeviceData(atd.af.getSDKReferenceNumber.AuthenticationRequestParameters(jSONObjectAuthenticationRequestParameters));
            int deviceData = getDeviceData();
            int deviceData2 = getDeviceData();
            atd.bc.getDeviceData.getSDKTransactionID(getDeviceData(), deviceData2, getDeviceData(), deviceData, -1676234569, new Object[]{jSONObjectAuthenticationRequestParameters}, 1676234570);
            getSDKAppID = ((-2) - ((AuthenticationRequestParameters + 40) ^ (-1))) % 128;
        } catch (Throwable th2) {
            if (th2 instanceof IllegalArgumentException) {
                getsdkephemeralpublickey = getSDKEphemeralPublicKey.PUBLIC_KEY_BASE64_DECODING_FAILURE;
                int i18 = getSDKAppID;
                int i19 = i18 & 19;
                AuthenticationRequestParameters = ((((i18 ^ 19) | i19) << 1) - ((i18 | 19) & (~i19))) % 128;
            } else if (th2 instanceof JSONException) {
                int i21 = AuthenticationRequestParameters;
                int i22 = i21 & 17;
                int i23 = -(-((i21 ^ 17) | i22));
                int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                getSDKAppID = i24 % 128;
                if (i24 % 2 == 0) {
                    getSDKEphemeralPublicKey getsdkephemeralpublickey2 = getSDKEphemeralPublicKey.USER_CANCEL;
                    throw null;
                }
                getsdkephemeralpublickey = getSDKEphemeralPublicKey.PUBLIC_KEY_JSON_DESERIALIZATION_FAILURE;
            } else {
                getsdkephemeralpublickey = getSDKEphemeralPublicKey.PUBLIC_KEY_HANDLING_GENERAL_FAILURE;
                int i25 = getSDKAppID;
                int i26 = i25 & 75;
                AuthenticationRequestParameters = a0.d(i26, ~(-(-((i25 ^ 75) | i26))), 1, 128);
            }
            getSDKEphemeralPublicKey getsdkephemeralpublickey3 = getsdkephemeralpublickey;
            InvalidInputException sDKTransactionID = atd.aa.getDeviceData.CONFIG_PARAMETERS.getSDKTransactionID();
            sDKTransactionID.getClass();
            getSDKTransactionID.getSDKAppID getsdkappid = new getSDKTransactionID.getSDKAppID(getsdkephemeralpublickey3, sDKTransactionID, null, null, 12);
            int i27 = AuthenticationRequestParameters;
            int i28 = i27 & 107;
            getSDKAppID = a0.d((i27 | 107) & (~i28), ~(-(-(i28 << 1))), 1, 128);
            getdevicedata = getsdkappid;
        }
        int i29 = AuthenticationRequestParameters;
        int i31 = ((((i29 ^ 93) | (i29 & 93)) << 1) - (~(-(((~i29) & 93) | (i29 & (-94)))))) - 1;
        getSDKAppID = i31 % 128;
        if (i31 % 2 != 0) {
            return getdevicedata;
        }
        throw null;
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) throws Throwable {
        getSDKEphemeralPublicKey getsdkephemeralpublickey;
        JSONArray jSONArray;
        X509Certificate sDKTransactionID;
        ConfigParameters configParameters = (ConfigParameters) objArr[0];
        getSDKAppID = (AuthenticationRequestParameters + 121) % 128;
        try {
            atd.al.getSDKReferenceNumber getsdkreferencenumberAuthenticationRequestParameters = atd.al.getSDKReferenceNumber.AuthenticationRequestParameters(AdyenConfigParameters.getParamValue(configParameters, AdyenConfigParameters.DIRECTORY_SERVER_ROOT_CERTIFICATES), atd.ai.AuthenticationRequestParameters.getSDKReferenceNumber);
            int i11 = AuthenticationRequestParameters;
            int i12 = (i11 ^ 119) + ((i11 & 119) << 1);
            getSDKAppID = i12 % 128;
            try {
                if (i12 % 2 == 0) {
                    getsdkreferencenumberAuthenticationRequestParameters.getSDKAppID(atd.aj.getSDKEphemeralPublicKey.getSDKTransactionID(ChallengeResultCancelled.getSDKAppID("VnlkU0FYQW9JUTFTQUNRYmJuRVlZVzBjWjM1NlF3d3BIM01GSW10S1JVNTBlRjhfWlhSUmZnd3hXaW9NY1I4bGNpOHJOVTFqYjBwa0ZoTjVMSGtwYmxZQUFVRTdSQU5TSUFZZFB4UXFBMEpxT2pjLUNCSmlMVDhCUERWOWZDRkdQdzlmWXdCbGVBNFViUlIzV21aUU55UVJIaEkzTWlkOEx4SWtGWDR3YTBZa1BpRTZhQVV5SUVKNFkxeHNheEJtVkVZdWFTcEFLWElwQ0JNQmZEWTRkd0ZrY21sSEZXTWhTMUlOSlZaUlJHdG5YeUZ0UEFGeERqNFJEU29xV0hZQ1B6Y1RlaGh2Q3pjSEYyb0tkeElNWlZJTEkxc1JLaXN3QWtFcWFXVkNabElvSVFNaUNDOHFVbHhVWEdSdWNSRkhUakk5TUEwb0VEUkZFMFpLQlYwZE1UeGVBaUJXYmhwR0l3UmVHM2tqVEFFSE5XWTFMV1prZVZRTlhVd2FYd1Y2TFFCSUd4Vk1Pd2cyWkNzWkNRQjhlUTEzSVRNWGZuQThBVDFrWkhKTFRVb1BhRkIwUG0wZkxna01DMHcxWjNFNGRsVVVEakFuYnlRMUpnZ2taaVo2RGlScFV4aGZGSGhDQlJnUWUxTUZCVnNhWmlRTGRUUlFVVzlVVVNOOFhGSWRkU1FlYkQ1b2NtRVZlMTFNY3o1LVZFMWJWRElMUWtaRVFERVRGd3RIVXhzaEZGQXlLanR4YWpVdkwza2RTbWR1S0NNVFVGWVphMEl6T2tKSk55UUJQbXBuTEJKQmNIa2NSQmtqRkZaaEdoOWNSVlZnRWtNU0xGQUNLQnRDWG5GQk5SOUxhRU14ZFhGMUdsaGtEMEJzTHk1SEVpd29EQlUzYVdabUExSWJOVDVYYVYwTkxGb2hHekFHQ3hRUlhXZFVKaXNER0VzRUVINThJaWNaSXlRUGFBVmxRUzl0VXljRVR6OWhkQklhTlR0Z0dFUmhjQjUzQUhWSlQwQmRMam8xVkVobkoySVNSUVpIZkY5TVlSNHNFRnNyS2d3dVdnaDVOeEEtVEZ4ekd3SUxUVEU3R3dNREFCWS1KeFpZTHpKME0zUmxPbDFqQUFaYlBnTU9ZMU1JWTFGLUN5SjZNQlktZGxrblBBc2tMRG81Q2pKN2RuZGZRZ2RkS3lSbkIxOWZBVWdoTVZRV1MxWVJHaFFMSFVCQkRGdzVUQlFpTVFFYUloWllGQnRmWm0xVUZoMGpIMlJ4S1dsMWF3STFQZ3hoTlM5S0ttVVdQeDh3ZVJvWFVsVVJjVFI5S1E4QlJYUkNVQmNOTEJrcWNRZ3ZJd1FKWDNaSlZ3QXRhVnhqWm1vOVh5QlJNek03SjNkdE1CUTNHSFk0WUM5QVV4NFRmbFUxVHlBMlVRMERJMHM4ZTNrWklGMUtMa0pxUWlKN01FSmtPZ0pPV2hjMFZSWjZUUVplVlVsdlZrTlliaWtSVXlRQkVWQTJiUmdVSzBvRVJ5RVlMenQ1TndWUEZRQUNMUXhkZGhFLWR3dDFMVVIzSGtWeWRRRlNQMUJzQlcxdGJtZGlEeGd1TDNaRE4yeHVZV1I5WFQ0akVSOUpPV29PUnlOSlQxQjNhVlVxVENCcURWNFVUak1BWHlCNE5Fa0FSVnN5SHg1YlhHeGRHenBFRVRGRmJSMXJBWHdZUWdGREFEaE5SeGgxY2pjTFJsRlpYVWNJVkE4WUgxNXRYaTVKQ1RBRVEyczZQaDVkQUR3ZGRWSnFBRVVoSlN0NE9FUklNVFpqZHdjY056aHBGa0k5ZlFCWlpGdEVCUjRaQ1hjQVhuc09ER3dwSFU5VVdnVmxkMHhYTzNOY2V4c3pOVmRoTUQ1akUzTkxmZ1Z1SUJGa2ZGOTZiMVVwSndCVEtYQTFLbTFsRHdaVUJ4eGxJVXh1RXlNQ1doRWxQZ0BHbTRiUlQxQ1lrNFRjR3Q4THdaUkl5eDdMaXM0QlZaRmZFdHdaaTBvYWkwN0xoTU5IeU0zTzNsNGJteGJGSHhTTVVoeWZBWU1OUU1lZkNNOGJRNWdHVEZaVkRsNFBrSVlZbUZUYVZacldoWXJVUUp6UlVNUldueFFaWEVyTFhBUGUwNFZMRk1oUFYxWkwxVXdHMWNGY21abWFWaG1aUllHUzFWeWJDUjNMVEpwYkd4TkxWUnJaQlFwTWhjb0ttQWtEZzVDQlVncGF6MWxaRXAwTVdSTEFFWTFLeTBSUkRKdER4Qkhad3daS0FjRk5tTThYa1kzUG1SOE5GTklDelJUYkFkNEFsRVZTbDlGY0NSY05WTkJLQlZnWlRCMGZYMUZTd2RvR2p3YU5EOUtFa2xXUVdwOEZnMHRIamNNUXloM0IzZHpja0JyVVd3QlJ3OHpTQmxNUm5JMFF4UWJPa014YlRVeFFqMVpCWFpKWVM5Q1lCd3RUQmxKT2pSVU5VUkplbW9MV1gwWWZrUjdKVUJlU0RFcFBFOGZiSEJERlFkRVFrY2xMakFzQXh4TktUYzVmd1lxWjBSZVFqdHdKaWg4SUFSRlJuUm1BMlpYZmtZVVBINHdaWDAtWTJBYWJqa1FSMzllTFJGRWFoWlpEV0pnRUdNR0pDWVJaVllxTldabE1sNWZObndQUERkWE9pNEJObFU0UHlnTUFrZENCQVEzR1dsQmVtbDBHVzlvVWhKLWVXODBBSGhzYWo1Y2V6SXJhVlJrTVFkT09YZHBiWFl1WW1ONVZnNGdkbVFpSFVsN0ZreHRVQjhuVUdrLWRnUUhRM05YV3pkWVcyd0hIeWdKZm5BUklUbGJSVEkwU3dFaVJIUXBhbThFWDJoUFZVeDJLeWNqUUJ3cEFWSXhNUlJsVGdOTVlsaC1hbHRtR3dGbVhud3hRQnBSYWhZdWNoVjZaM001V1RVZ2Jrd25PMTFlSzBVd0VIZFhCbUVoWEJBYkUxVWtjRDFtTEE4TWRBbHdiUWxTZmdwMU5VRXhMRGNyT1hWSVVtMTZiMWthRW0wUlVHSnFkVGtqYnpWb2ZsNW9iMmhpYUVKRWZTOFBZVkVsQWt3M2NUVlJhSFpwZVhKZVZTVk9DamhIYUV3T1lWNUdBQ3gyVG1COVhWRkJPRjVMT2pFdUpIQTRBSEltY1JvVWJDdE1DQVpWQUdaUWUxdEpjQlFDVGpCVERYQmdWazlNYWtkc1VWMDROemdZUlV4UGFGSVFSUUVYUG5oU2IyY29CMGtwVHlweFNFdFpDRTlnR2lKSU5XSXZHV1ZEQnhNMUZuaE1lVlY1SUdSWUZXVmxOeFFjTFdkOEFoVlJBQWxZRUVjbVoxcEtjZ0FwUjAxelRpUUlORzRSR3pGUlB3QkNEbGR6RXlKNVlnUi1IRGRQYUF4eWJBTU1lbWM1Y1E4bmUxc1hMVnBEREZJc0h6WTRGd29ZSVFneUwwWi1FRVZtV3hsdkJIbGNlWHBuRDJ3dVkwSkFYMThIZVd4Z1JEazNGQ01PQVZKR1p6YzdMUThFRnpJRFNnbGZUeDRoQUNVT2JVeHZaRFFrVUIwR0NnNHlEVzl5VlY0dWRpaGtCbUktS0FrUUtnUk5DVUpCT1IxdUtIWkRHMGs5QWlaR0NXTjFTMXBwRWowMVRYVVVZUU1jSFNvaWVEUk1jMjRnWkFFbUNGZE1RRjFjTUNrZUVqWnBCamRLZEc4b0hXWi1PWEV5SkNZVlVDNG5iSGN1TzJBdWVRNVJiMkVYV1hNSFZud2dOazR6Y0dBdmNoZE9PVU55RDJrQk1YMXdSejl0YXlsX09RUjdjd2NTRjJ3SlRoZ1JWMFU1UTM4RVpnMG9XMHM1YVFZRlJtTUNTVDR3S3dnd0RneFBFVThyV2dwZmZ3OG9lVGNYZlZkU1FBNGpkbUpuS0V0MlJB")));
                    throw null;
                }
                getsdkreferencenumberAuthenticationRequestParameters.getSDKAppID(atd.aj.getSDKEphemeralPublicKey.getSDKTransactionID(ChallengeResultCancelled.getSDKAppID("VnlkU0FYQW9JUTFTQUNRYmJuRVlZVzBjWjM1NlF3d3BIM01GSW10S1JVNTBlRjhfWlhSUmZnd3hXaW9NY1I4bGNpOHJOVTFqYjBwa0ZoTjVMSGtwYmxZQUFVRTdSQU5TSUFZZFB4UXFBMEpxT2pjLUNCSmlMVDhCUERWOWZDRkdQdzlmWXdCbGVBNFViUlIzV21aUU55UVJIaEkzTWlkOEx4SWtGWDR3YTBZa1BpRTZhQVV5SUVKNFkxeHNheEJtVkVZdWFTcEFLWElwQ0JNQmZEWTRkd0ZrY21sSEZXTWhTMUlOSlZaUlJHdG5YeUZ0UEFGeERqNFJEU29xV0hZQ1B6Y1RlaGh2Q3pjSEYyb0tkeElNWlZJTEkxc1JLaXN3QWtFcWFXVkNabElvSVFNaUNDOHFVbHhVWEdSdWNSRkhUakk5TUEwb0VEUkZFMFpLQlYwZE1UeGVBaUJXYmhwR0l3UmVHM2tqVEFFSE5XWTFMV1prZVZRTlhVd2FYd1Y2TFFCSUd4Vk1Pd2cyWkNzWkNRQjhlUTEzSVRNWGZuQThBVDFrWkhKTFRVb1BhRkIwUG0wZkxna01DMHcxWjNFNGRsVVVEakFuYnlRMUpnZ2taaVo2RGlScFV4aGZGSGhDQlJnUWUxTUZCVnNhWmlRTGRUUlFVVzlVVVNOOFhGSWRkU1FlYkQ1b2NtRVZlMTFNY3o1LVZFMWJWRElMUWtaRVFERVRGd3RIVXhzaEZGQXlLanR4YWpVdkwza2RTbWR1S0NNVFVGWVphMEl6T2tKSk55UUJQbXBuTEJKQmNIa2NSQmtqRkZaaEdoOWNSVlZnRWtNU0xGQUNLQnRDWG5GQk5SOUxhRU14ZFhGMUdsaGtEMEJzTHk1SEVpd29EQlUzYVdabUExSWJOVDVYYVYwTkxGb2hHekFHQ3hRUlhXZFVKaXNER0VzRUVINThJaWNaSXlRUGFBVmxRUzl0VXljRVR6OWhkQklhTlR0Z0dFUmhjQjUzQUhWSlQwQmRMam8xVkVobkoySVNSUVpIZkY5TVlSNHNFRnNyS2d3dVdnaDVOeEEtVEZ4ekd3SUxUVEU3R3dNREFCWS1KeFpZTHpKME0zUmxPbDFqQUFaYlBnTU9ZMU1JWTFGLUN5SjZNQlktZGxrblBBc2tMRG81Q2pKN2RuZGZRZ2RkS3lSbkIxOWZBVWdoTVZRV1MxWVJHaFFMSFVCQkRGdzVUQlFpTVFFYUloWllGQnRmWm0xVUZoMGpIMlJ4S1dsMWF3STFQZ3hoTlM5S0ttVVdQeDh3ZVJvWFVsVVJjVFI5S1E4QlJYUkNVQmNOTEJrcWNRZ3ZJd1FKWDNaSlZ3QXRhVnhqWm1vOVh5QlJNek03SjNkdE1CUTNHSFk0WUM5QVV4NFRmbFUxVHlBMlVRMERJMHM4ZTNrWklGMUtMa0pxUWlKN01FSmtPZ0pPV2hjMFZSWjZUUVplVlVsdlZrTlliaWtSVXlRQkVWQTJiUmdVSzBvRVJ5RVlMenQ1TndWUEZRQUNMUXhkZGhFLWR3dDFMVVIzSGtWeWRRRlNQMUJzQlcxdGJtZGlEeGd1TDNaRE4yeHVZV1I5WFQ0akVSOUpPV29PUnlOSlQxQjNhVlVxVENCcURWNFVUak1BWHlCNE5Fa0FSVnN5SHg1YlhHeGRHenBFRVRGRmJSMXJBWHdZUWdGREFEaE5SeGgxY2pjTFJsRlpYVWNJVkE4WUgxNXRYaTVKQ1RBRVEyczZQaDVkQUR3ZGRWSnFBRVVoSlN0NE9FUklNVFpqZHdjY056aHBGa0k5ZlFCWlpGdEVCUjRaQ1hjQVhuc09ER3dwSFU5VVdnVmxkMHhYTzNOY2V4c3pOVmRoTUQ1akUzTkxmZ1Z1SUJGa2ZGOTZiMVVwSndCVEtYQTFLbTFsRHdaVUJ4eGxJVXh1RXlNQ1doRWxQZ0BHbTRiUlQxQ1lrNFRjR3Q4THdaUkl5eDdMaXM0QlZaRmZFdHdaaTBvYWkwN0xoTU5IeU0zTzNsNGJteGJGSHhTTVVoeWZBWU1OUU1lZkNNOGJRNWdHVEZaVkRsNFBrSVlZbUZUYVZacldoWXJVUUp6UlVNUldueFFaWEVyTFhBUGUwNFZMRk1oUFYxWkwxVXdHMWNGY21abWFWaG1aUllHUzFWeWJDUjNMVEpwYkd4TkxWUnJaQlFwTWhjb0ttQWtEZzVDQlVncGF6MWxaRXAwTVdSTEFFWTFLeTBSUkRKdER4Qkhad3daS0FjRk5tTThYa1kzUG1SOE5GTklDelJUYkFkNEFsRVZTbDlGY0NSY05WTkJLQlZnWlRCMGZYMUZTd2RvR2p3YU5EOUtFa2xXUVdwOEZnMHRIamNNUXloM0IzZHpja0JyVVd3QlJ3OHpTQmxNUm5JMFF4UWJPa014YlRVeFFqMVpCWFpKWVM5Q1lCd3RUQmxKT2pSVU5VUkplbW9MV1gwWWZrUjdKVUJlU0RFcFBFOGZiSEJERlFkRVFrY2xMakFzQXh4TktUYzVmd1lxWjBSZVFqdHdKaWg4SUFSRlJuUm1BMlpYZmtZVVBINHdaWDAtWTJBYWJqa1FSMzllTFJGRWFoWlpEV0pnRUdNR0pDWVJaVllxTldabE1sNWZObndQUERkWE9pNEJObFU0UHlnTUFrZENCQVEzR1dsQmVtbDBHVzlvVWhKLWVXODBBSGhzYWo1Y2V6SXJhVlJrTVFkT09YZHBiWFl1WW1ONVZnNGdkbVFpSFVsN0ZreHRVQjhuVUdrLWRnUUhRM05YV3pkWVcyd0hIeWdKZm5BUklUbGJSVEkwU3dFaVJIUXBhbThFWDJoUFZVeDJLeWNqUUJ3cEFWSXhNUlJsVGdOTVlsaC1hbHRtR3dGbVhud3hRQnBSYWhZdWNoVjZaM001V1RVZ2Jrd25PMTFlSzBVd0VIZFhCbUVoWEJBYkUxVWtjRDFtTEE4TWRBbHdiUWxTZmdwMU5VRXhMRGNyT1hWSVVtMTZiMWthRW0wUlVHSnFkVGtqYnpWb2ZsNW9iMmhpYUVKRWZTOFBZVkVsQWt3M2NUVlJhSFpwZVhKZVZTVk9DamhIYUV3T1lWNUdBQ3gyVG1COVhWRkJPRjVMT2pFdUpIQTRBSEltY1JvVWJDdE1DQVpWQUdaUWUxdEpjQlFDVGpCVERYQmdWazlNYWtkc1VWMDROemdZUlV4UGFGSVFSUUVYUG5oU2IyY29CMGtwVHlweFNFdFpDRTlnR2lKSU5XSXZHV1ZEQnhNMUZuaE1lVlY1SUdSWUZXVmxOeFFjTFdkOEFoVlJBQWxZRUVjbVoxcEtjZ0FwUjAxelRpUUlORzRSR3pGUlB3QkNEbGR6RXlKNVlnUi1IRGRQYUF4eWJBTU1lbWM1Y1E4bmUxc1hMVnBEREZJc0h6WTRGd29ZSVFneUwwWi1FRVZtV3hsdkJIbGNlWHBuRDJ3dVkwSkFYMThIZVd4Z1JEazNGQ01PQVZKR1p6YzdMUThFRnpJRFNnbGZUeDRoQUNVT2JVeHZaRFFrVUIwR0NnNHlEVzl5VlY0dWRpaGtCbUktS0FrUUtnUk5DVUpCT1IxdUtIWkRHMGs5QWlaR0NXTjFTMXBwRWowMVRYVVVZUU1jSFNvaWVEUk1jMjRnWkFFbUNGZE1RRjFjTUNrZUVqWnBCamRLZEc4b0hXWi1PWEV5SkNZVlVDNG5iSGN1TzJBdWVRNVJiMkVYV1hNSFZud2dOazR6Y0dBdmNoZE9PVU55RDJrQk1YMXdSejl0YXlsX09RUjdjd2NTRjJ3SlRoZ1JWMFU1UTM4RVpnMG9XMHM1YVFZRlJtTUNTVDR3S3dnd0RneFBFVThyV2dwZmZ3OG9lVGNYZlZkU1FBNGpkbUpuS0V0MlJB")));
                int i13 = AuthenticationRequestParameters;
                int i14 = (i13 & (-122)) | ((~i13) & 121);
                int i15 = -(-((i13 & 121) << 1));
                int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
                getSDKAppID = i16 % 128;
                try {
                    if (i16 % 2 == 0) {
                        jSONArray = getsdkreferencenumberAuthenticationRequestParameters.getSDKAppID().getMessageVersion().getJSONArray("certificates");
                        int i17 = 71 / 0;
                    } else {
                        jSONArray = getsdkreferencenumberAuthenticationRequestParameters.getSDKAppID().getMessageVersion().getJSONArray("certificates");
                    }
                    int i18 = getSDKAppID;
                    int i19 = i18 & 125;
                    int i21 = (i18 ^ 125) | i19;
                    AuthenticationRequestParameters = (((i19 | i21) << 1) - (i21 ^ i19)) % 128;
                    ArrayList arrayList = new ArrayList();
                    int length = jSONArray.length();
                    int i22 = AuthenticationRequestParameters;
                    int i23 = i22 & 33;
                    int i24 = -(-((i22 ^ 33) | i23));
                    getSDKAppID = ((i23 ^ i24) + ((i24 & i23) << 1)) % 128;
                    int i25 = 0;
                    while (i25 < length) {
                        int i26 = AuthenticationRequestParameters;
                        int i27 = ((i26 & 78) + (i26 | 78)) - 1;
                        getSDKAppID = i27 % 128;
                        if (i27 % 2 == 0) {
                            try {
                                sDKTransactionID = atd.aj.getSDKEphemeralPublicKey.getSDKTransactionID(jSONArray.getString(i25));
                                int i28 = 23 / 0;
                            } catch (CertificateException unused) {
                                getSDKEphemeralPublicKey getsdkephemeralpublickey2 = getSDKEphemeralPublicKey.ROOT_CERTIFICATES_GENERATION_FAILURE;
                                InvalidInputException sDKTransactionID2 = atd.aa.getDeviceData.CONFIG_PARAMETERS.getSDKTransactionID();
                                sDKTransactionID2.getClass();
                                return new getSDKTransactionID.getSDKAppID(getsdkephemeralpublickey2, sDKTransactionID2, null, null, 12);
                            }
                        } else {
                            sDKTransactionID = atd.aj.getSDKEphemeralPublicKey.getSDKTransactionID(jSONArray.getString(i25));
                        }
                        int i29 = AuthenticationRequestParameters;
                        int i31 = i29 & 61;
                        int i32 = -(-((i29 ^ 61) | i31));
                        int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
                        getSDKAppID = i33 % 128;
                        if (i33 % 2 == 0) {
                            arrayList.add(sDKTransactionID);
                            int i34 = i25 & 121;
                            i25 = ((((i25 ^ 121) | i34) << 1) - ((i25 | 121) & (~i34))) - 7;
                        } else {
                            arrayList.add(sDKTransactionID);
                            int i35 = (i25 & 62) | ((~i25) & (-63));
                            int i36 = -(-((i25 & (-63)) << 1));
                            int i37 = (i35 & i36) + (i36 | i35);
                            i25 = ((((i37 ^ 64) | (i37 & 64)) << 1) - (~(-((i37 & (-65)) | ((~i37) & 64))))) - 1;
                        }
                        int i38 = AuthenticationRequestParameters;
                        int i39 = (i38 & 36) + (i38 | 36);
                        getSDKAppID = ((i39 ^ (-1)) + (i39 << 1)) % 128;
                    }
                    getSDKTransactionID.getDeviceData getdevicedata = new getSDKTransactionID.getDeviceData(arrayList);
                    int i41 = getSDKAppID + 86;
                    int i42 = (i41 ^ (-1)) + (i41 << 1);
                    AuthenticationRequestParameters = i42 % 128;
                    if (i42 % 2 != 0) {
                        int i43 = 80 / 0;
                    }
                    return getdevicedata;
                } catch (JSONException unused2) {
                    getSDKEphemeralPublicKey getsdkephemeralpublickey3 = getSDKEphemeralPublicKey.ROOT_CERTIFICATES_JWS_PAYLOAD_DESERIALIZATION_FAILURE;
                    InvalidInputException sDKTransactionID3 = atd.aa.getDeviceData.CONFIG_PARAMETERS.getSDKTransactionID();
                    sDKTransactionID3.getClass();
                    return new getSDKTransactionID.getSDKAppID(getsdkephemeralpublickey3, sDKTransactionID3, null, null, 12);
                }
            } catch (SDKRuntimeException unused3) {
                getSDKEphemeralPublicKey getsdkephemeralpublickey4 = getSDKEphemeralPublicKey.ROOT_CERTIFICATES_JWS_VERIFICATION_FAILURE;
                InvalidInputException sDKTransactionID4 = atd.aa.getDeviceData.CONFIG_PARAMETERS.getSDKTransactionID();
                sDKTransactionID4.getClass();
                return new getSDKTransactionID.getSDKAppID(getsdkephemeralpublickey4, sDKTransactionID4, null, null, 12);
            }
        } catch (Throwable th2) {
            if (th2 instanceof getSDKAppID) {
                int iAuthenticationRequestParameters = getSDKAppID.getSDKTransactionID.AuthenticationRequestParameters();
                getsdkephemeralpublickey = (getSDKEphemeralPublicKey) atd.ac.getSDKAppID.AuthenticationRequestParameters(getSDKAppID.getSDKTransactionID.AuthenticationRequestParameters(), new Object[]{th2}, -1410018444, getSDKAppID.getSDKTransactionID.AuthenticationRequestParameters(), iAuthenticationRequestParameters, 1410018446, getSDKAppID.getSDKTransactionID.AuthenticationRequestParameters());
                AuthenticationRequestParameters = (getSDKAppID + 43) % 128;
            } else {
                getsdkephemeralpublickey = getSDKEphemeralPublicKey.ROOT_CERTIFICATES_HANDLING_GENERAL_FAILURE;
                int i44 = getSDKAppID;
                int i45 = i44 & 33;
                int i46 = (i44 | 33) & (~i45);
                int i47 = -(-(i45 << 1));
                AuthenticationRequestParameters = (((i46 | i47) << 1) - (i46 ^ i47)) % 128;
            }
            getSDKEphemeralPublicKey getsdkephemeralpublickey5 = getsdkephemeralpublickey;
            InvalidInputException sDKTransactionID5 = atd.aa.getDeviceData.CONFIG_PARAMETERS.getSDKTransactionID();
            sDKTransactionID5.getClass();
            getSDKTransactionID.getSDKAppID getsdkappid = new getSDKTransactionID.getSDKAppID(getsdkephemeralpublickey5, sDKTransactionID5, null, null, 12);
            int i48 = AuthenticationRequestParameters;
            int i49 = i48 & 5;
            int i51 = (i48 ^ 5) | i49;
            int i52 = (i49 ^ i51) + ((i51 & i49) << 1);
            getSDKAppID = i52 % 128;
            if (i52 % 2 != 0) {
                return getsdkappid;
            }
            throw null;
        }
    }

    private static final getSDKTransactionID<List<X509Certificate>> getSDKAppID(ConfigParameters configParameters) {
        int sDKTransactionID = getSDKTransactionID.C0016getSDKTransactionID.getSDKTransactionID();
        int sDKTransactionID2 = getSDKTransactionID.C0016getSDKTransactionID.getSDKTransactionID();
        int sDKTransactionID3 = getSDKTransactionID.C0016getSDKTransactionID.getSDKTransactionID();
        return (atd.am.getSDKTransactionID) getDeviceData(-647052428, sDKTransactionID2, sDKTransactionID, getSDKTransactionID.C0016getSDKTransactionID.getSDKTransactionID(), 647052429, new Object[]{configParameters}, sDKTransactionID3);
    }

    private static final atd.am.getSDKTransactionID<atd.af.getSDKReferenceNumber> getSDKReferenceNumber(ConfigParameters configParameters) {
        int sDKTransactionID = getSDKTransactionID.C0016getSDKTransactionID.getSDKTransactionID();
        int sDKTransactionID2 = getSDKTransactionID.C0016getSDKTransactionID.getSDKTransactionID();
        int sDKTransactionID3 = getSDKTransactionID.C0016getSDKTransactionID.getSDKTransactionID();
        return (atd.am.getSDKTransactionID) getDeviceData(984927629, sDKTransactionID2, sDKTransactionID, getSDKTransactionID.C0016getSDKTransactionID.getSDKTransactionID(), -984927627, new Object[]{configParameters}, sDKTransactionID3);
    }

    private static Object getSDKTransactionID(Object[] objArr) {
        atd.af.getSDKReferenceNumber getsdkreferencenumber;
        ConfigParameters configParameters = (ConfigParameters) objArr[0];
        getSDKTransactionID.C0016getSDKTransactionID.getSDKTransactionID();
        getSDKTransactionID.C0016getSDKTransactionID.getSDKTransactionID();
        configParameters.getClass();
        int sDKTransactionID = getSDKTransactionID.C0016getSDKTransactionID.getSDKTransactionID();
        atd.am.getSDKTransactionID getsdktransactionid = (atd.am.getSDKTransactionID) getDeviceData(984927629, getSDKTransactionID.C0016getSDKTransactionID.getSDKTransactionID(), sDKTransactionID, getSDKTransactionID.C0016getSDKTransactionID.getSDKTransactionID(), -984927627, new Object[]{configParameters}, getSDKTransactionID.C0016getSDKTransactionID.getSDKTransactionID());
        if (!(getsdktransactionid instanceof getSDKTransactionID.getDeviceData)) {
            if (!(getsdktransactionid instanceof getSDKTransactionID.getSDKAppID)) {
                a.f();
                return null;
            }
            int i11 = AuthenticationRequestParameters;
            int i12 = (((i11 & (-118)) | ((~i11) & 117)) - (~(-(-((i11 & 117) << 1))))) - 1;
            int i13 = i12 % 128;
            getSDKAppID = i13;
            if (i12 % 2 == 0) {
                throw null;
            }
            int i14 = i13 & 23;
            int i15 = -(-((i13 ^ 23) | i14));
            int i16 = (i14 & i15) + (i15 | i14);
            AuthenticationRequestParameters = i16 % 128;
            if (i16 % 2 == 0) {
                return getsdktransactionid;
            }
            throw null;
        }
        int i17 = getSDKAppID;
        int i18 = ((i17 & 40) + (i17 | 40)) - 1;
        AuthenticationRequestParameters = i18 % 128;
        if (i18 % 2 != 0) {
            getsdkreferencenumber = (atd.af.getSDKReferenceNumber) getSDKTransactionID.getDeviceData.getDeviceData(-568881259, 568881263, new Object[]{(getSDKTransactionID.getDeviceData) getsdktransactionid}, timedout.AuthenticationRequestParameters.getSDKAppID(), timedout.AuthenticationRequestParameters.getSDKAppID(), timedout.AuthenticationRequestParameters.getSDKAppID(), timedout.AuthenticationRequestParameters.getSDKAppID());
            int i19 = 85 / 0;
        } else {
            getsdkreferencenumber = (atd.af.getSDKReferenceNumber) getSDKTransactionID.getDeviceData.getDeviceData(-568881259, 568881263, new Object[]{(getSDKTransactionID.getDeviceData) getsdktransactionid}, timedout.AuthenticationRequestParameters.getSDKAppID(), timedout.AuthenticationRequestParameters.getSDKAppID(), timedout.AuthenticationRequestParameters.getSDKAppID(), timedout.AuthenticationRequestParameters.getSDKAppID());
        }
        int i21 = AuthenticationRequestParameters;
        getSDKAppID = (((i21 & 108) + (i21 | 108)) - 1) % 128;
        int sDKTransactionID2 = getSDKTransactionID.C0016getSDKTransactionID.getSDKTransactionID();
        atd.am.getSDKTransactionID getsdktransactionid2 = (atd.am.getSDKTransactionID) getDeviceData(-647052428, getSDKTransactionID.C0016getSDKTransactionID.getSDKTransactionID(), sDKTransactionID2, getSDKTransactionID.C0016getSDKTransactionID.getSDKTransactionID(), 647052429, new Object[]{configParameters}, getSDKTransactionID.C0016getSDKTransactionID.getSDKTransactionID());
        if (!(getsdktransactionid2 instanceof getSDKTransactionID.getDeviceData)) {
            if (!(getsdktransactionid2 instanceof getSDKTransactionID.getSDKAppID)) {
                a.f();
                return null;
            }
            int i22 = AuthenticationRequestParameters;
            int i23 = ((i22 | 51) << 1) - (i22 ^ 51);
            getSDKAppID = i23 % 128;
            if (i23 % 2 != 0) {
                return getsdktransactionid2;
            }
            throw null;
        }
        int i24 = getSDKAppID;
        int i25 = i24 & 125;
        int i26 = (i24 | 125) & (~i25);
        int i27 = i25 << 1;
        AuthenticationRequestParameters = ((i26 & i27) + (i26 | i27)) % 128;
        List list = (List) getSDKTransactionID.getDeviceData.getDeviceData(-568881259, 568881263, new Object[]{(getSDKTransactionID.getDeviceData) getsdktransactionid2}, timedout.AuthenticationRequestParameters.getSDKAppID(), timedout.AuthenticationRequestParameters.getSDKAppID(), timedout.AuthenticationRequestParameters.getSDKAppID(), timedout.AuthenticationRequestParameters.getSDKAppID());
        int i28 = AuthenticationRequestParameters;
        int i29 = i28 & 13;
        getSDKAppID = a0.d((i28 | 13) & (~i29), ~(i29 << 1), 1, 128);
        getSDKTransactionID.getDeviceData getdevicedata = new getSDKTransactionID.getDeviceData(new atd.am.getDeviceData(getsdkreferencenumber, list));
        int i31 = AuthenticationRequestParameters;
        int i32 = i31 & 39;
        int i33 = ((i31 ^ 39) | i32) << 1;
        int i34 = -((i31 | 39) & (~i32));
        getSDKAppID = ((i33 ^ i34) + ((i34 & i33) << 1)) % 128;
        return getdevicedata;
    }

    @NotNull
    public static final atd.am.getSDKTransactionID<atd.am.getDeviceData> getSDKTransactionID(@NotNull ConfigParameters configParameters) {
        int sDKTransactionID = getSDKTransactionID.C0016getSDKTransactionID.getSDKTransactionID();
        int sDKTransactionID2 = getSDKTransactionID.C0016getSDKTransactionID.getSDKTransactionID();
        int sDKTransactionID3 = getSDKTransactionID.C0016getSDKTransactionID.getSDKTransactionID();
        return (atd.am.getSDKTransactionID) getDeviceData(762508683, sDKTransactionID2, sDKTransactionID, getSDKTransactionID.C0016getSDKTransactionID.getSDKTransactionID(), -762508683, new Object[]{configParameters}, sDKTransactionID3);
    }

    public static /* synthetic */ Object getDeviceData(int i11, int i12, int i13, int i14, int i15, Object[] objArr, int i16) {
        int i17 = ~i15;
        int i18 = ~i11;
        int i19 = ~(i17 | i18);
        int i21 = ~(i15 | i11);
        int i22 = i19 | i21 | (~(i15 | i13));
        int i23 = i15 | i18;
        int i24 = (~((~i13) | i15)) | i21;
        int i25 = (1432616960 * i14) + ((-648806400) * i16) + ((-2053373952) * i12) + ((-2101222338) * i24) + ((-92522620) * i23) + (i22 * (-2101222338)) + (47848387 * i11) + (((-1960851331) * i15) - 1583611904);
        int iC = a0.c(i14, 1975835455, (111814883 * i16) + i15 + i11 + i12);
        int i26 = i12 * 961079685;
        int i27 = i16 * 1618335983;
        int i28 = i14 * 193609403;
        int iE = a0.e(iC, 1988296704, i28 + i27 + i26 + (i24 * 566) + (i23 * (-1132)) + (i22 * 566) + (i11 * 961079119) + ((i15 * 961080817) - 60187382), 176226304, (442957824 * iC) + i25);
        return iE != 1 ? iE != 2 ? getSDKTransactionID(objArr) : AuthenticationRequestParameters(objArr) : getDeviceData(objArr);
    }

    public static int getDeviceData() {
        int i11 = getSDKTransactionID;
        int i12 = i11 % 5554653;
        getSDKTransactionID = i11 + 1;
        if (i12 != 0) {
            return getDeviceData;
        }
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        getDeviceData = iMaxMemory;
        return iMaxMemory;
    }
}
