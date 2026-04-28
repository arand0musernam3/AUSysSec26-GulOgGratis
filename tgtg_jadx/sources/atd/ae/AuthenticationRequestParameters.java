package atd.ae;

import atd.aj.getMessageVersion;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class AuthenticationRequestParameters extends getMessageVersion {
    public AuthenticationRequestParameters(String str) throws atd.ac.getSDKAppID {
        super(str == null ? "" : str, atd.am.getSDKEphemeralPublicKey.JWE_KEY_NOT_BASE64URL_ENCODED);
    }

    public AuthenticationRequestParameters(byte[] bArr) {
        super(bArr == null ? new byte[0] : bArr);
    }
}
