package org.bouncycastle.x509;

import i4.a;
import java.security.cert.CertPath;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.i18n.LocalizedException;

/* JADX INFO: loaded from: classes3.dex */
public class CertPathReviewerException extends LocalizedException {
    private CertPath certPath;
    private int index;

    public CertPathReviewerException(ErrorBundle errorBundle, Throwable th2, CertPath certPath, int i11) {
        super(errorBundle, th2);
        this.index = -1;
        this.certPath = null;
        if (certPath == null || i11 == -1) {
            a.h();
            throw null;
        }
        if (i11 < -1 || i11 >= certPath.getCertificates().size()) {
            throw new IndexOutOfBoundsException();
        }
        this.certPath = certPath;
        this.index = i11;
    }

    public CertPath getCertPath() {
        return this.certPath;
    }

    public int getIndex() {
        return this.index;
    }

    public CertPathReviewerException(ErrorBundle errorBundle, Throwable th2) {
        super(errorBundle, th2);
        this.index = -1;
        this.certPath = null;
    }

    public CertPathReviewerException(ErrorBundle errorBundle) {
        super(errorBundle);
        this.index = -1;
        this.certPath = null;
    }

    public CertPathReviewerException(ErrorBundle errorBundle, CertPath certPath, int i11) {
        super(errorBundle);
        this.index = -1;
        this.certPath = null;
        if (certPath == null || i11 == -1) {
            a.h();
            throw null;
        }
        if (i11 < -1 || i11 >= certPath.getCertificates().size()) {
            throw new IndexOutOfBoundsException();
        }
        this.certPath = certPath;
        this.index = i11;
    }
}
