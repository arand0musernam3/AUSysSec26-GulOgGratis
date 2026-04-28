package t;

import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Signature f39303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Cipher f39304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Mac f39305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IdentityCredential f39306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PresentationSession f39307e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f39308f;

    public q(Signature signature) {
        this.f39303a = signature;
        this.f39304b = null;
        this.f39305c = null;
        this.f39306d = null;
        this.f39307e = null;
        this.f39308f = 0L;
    }

    public q(Cipher cipher) {
        this.f39303a = null;
        this.f39304b = cipher;
        this.f39305c = null;
        this.f39306d = null;
        this.f39307e = null;
        this.f39308f = 0L;
    }

    public q(Mac mac) {
        this.f39303a = null;
        this.f39304b = null;
        this.f39305c = mac;
        this.f39306d = null;
        this.f39307e = null;
        this.f39308f = 0L;
    }

    public q(IdentityCredential identityCredential) {
        this.f39303a = null;
        this.f39304b = null;
        this.f39305c = null;
        this.f39306d = identityCredential;
        this.f39307e = null;
        this.f39308f = 0L;
    }

    public q(PresentationSession presentationSession) {
        this.f39303a = null;
        this.f39304b = null;
        this.f39305c = null;
        this.f39306d = null;
        this.f39307e = presentationSession;
        this.f39308f = 0L;
    }

    public q(long j9) {
        this.f39303a = null;
        this.f39304b = null;
        this.f39305c = null;
        this.f39306d = null;
        this.f39307e = null;
        this.f39308f = j9;
    }
}
