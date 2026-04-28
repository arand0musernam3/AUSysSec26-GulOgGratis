package atd.ae;

import atd.aj.getMessageVersion;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class ChallengeResult extends getMessageVersion {
    public ChallengeResult(String str) throws atd.ac.getSDKAppID {
        super(str, atd.am.getSDKEphemeralPublicKey.JWE_INITIALIZATION_VECTOR_NOT_BASE64URL_ENCODED);
    }

    public ChallengeResult(byte[] bArr) {
        super(bArr);
    }
}
