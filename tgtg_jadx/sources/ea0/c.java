package ea0;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements HostnameVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f15902a = new c();

    public static List a(X509Certificate x509Certificate, int i11) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return n0.f26529a;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && Intrinsics.areEqual(list.get(0), Integer.valueOf(i11)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return n0.f26529a;
        }
    }

    public static boolean b(String str) {
        int i11;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            i4.a.i(k.h(length2, "endIndex < beginIndex: ", " < 0"));
            return false;
        }
        if (length2 > str.length()) {
            i4.a.c(str.length(), org.bouncycastle.jcajce.provider.asymmetric.a.k(length2, "endIndex > string.length: ", " > "));
            return false;
        }
        long j9 = 0;
        int i12 = 0;
        while (i12 < length2) {
            char cCharAt = str.charAt(i12);
            if (cCharAt < 128) {
                j9++;
            } else {
                if (cCharAt < 2048) {
                    i11 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i11 = 3;
                } else {
                    int i13 = i12 + 1;
                    char cCharAt2 = i13 < length2 ? str.charAt(i13) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j9++;
                        i12 = i13;
                    } else {
                        j9 += (long) 4;
                        i12 += 2;
                    }
                }
                j9 += (long) i11;
            }
            i12++;
        }
        return length == ((int) j9);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(java.security.cert.X509Certificate r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ea0.c.c(java.security.cert.X509Certificate, java.lang.String):boolean");
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        str.getClass();
        sSLSession.getClass();
        if (b(str)) {
            try {
                Certificate certificate = sSLSession.getPeerCertificates()[0];
                certificate.getClass();
                return c((X509Certificate) certificate, str);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
