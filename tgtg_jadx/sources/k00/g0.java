package k00;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g0 extends a implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MessageDigest f25641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f25642f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f25643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f25644h;

    public g0() {
        boolean z11;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.f25641e = messageDigest;
            this.f25642f = messageDigest.getDigestLength();
            this.f25644h = "Hashing.sha256()";
            try {
                messageDigest.clone();
                z11 = true;
            } catch (CloneNotSupportedException unused) {
                z11 = false;
            }
            this.f25643g = z11;
        } catch (NoSuchAlgorithmException e5) {
            i4.a.d(e5);
            throw null;
        }
    }

    public final String toString() {
        return this.f25644h;
    }
}
