package m0;

import com.app.tgtg.customview.npsratingview.NpsRatingView;
import java.io.EOFException;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.util.NoSuchElementException;
import org.bouncycastle.asn1.ASN1Exception;
import org.bouncycastle.crypto.CryptoServiceConstraintsException;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i1 implements m3.g, s20.l, tx.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28529a;

    public static /* synthetic */ void c() {
        throw new NoSuchElementException();
    }

    public static /* synthetic */ void d(int i11, int i12) throws EOFException {
        throw new EOFException("DEF length " + i11 + ((Object) " object truncated by ") + i12);
    }

    public static /* synthetic */ void e(Object obj) throws IOException {
        throw new IOException("Error encoding certificate: " + ((Object) obj.toString()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void f(Object obj, int i11, String str) {
        throw new IllegalArgumentException(str + obj + ((char) i11));
    }

    public static /* synthetic */ void g(Object obj, Object obj2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append(obj2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static /* synthetic */ void h(Object obj, String str) throws ASN1Exception {
        throw new ASN1Exception(str + obj);
    }

    public static /* synthetic */ void i(String str) throws InvalidCipherTextException {
        throw new InvalidCipherTextException(str);
    }

    public static /* synthetic */ void j(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void k(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void l(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void m(StringBuilder sb2, Object obj, Object obj2) {
        sb2.append(obj);
        sb2.append(obj2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static /* synthetic */ void n(AlgorithmParameters algorithmParameters) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException("can't handle parameter " + ((Object) algorithmParameters.toString()));
    }

    public static /* synthetic */ void o(int i11, int i12) {
        throw new CryptoServiceConstraintsException("service does not provide " + i11 + ((Object) " bits of security only ") + i12);
    }

    public static /* synthetic */ void p(Object obj) throws InvalidKeySpecException {
        throw new InvalidKeySpecException(obj.toString());
    }

    public static /* synthetic */ void q(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void r(String str) {
        throw new OutputLengthException(str);
    }

    public static /* synthetic */ void s(Object obj) {
        throw new RuntimeException(obj.toString());
    }

    public static /* synthetic */ void t(String str) {
        throw new DataLengthException(str);
    }

    public static /* synthetic */ void u(String str) throws InvalidParameterSpecException {
        throw new InvalidParameterSpecException(str);
    }

    public static /* synthetic */ void v(String str) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException(str);
    }

    @Override // tx.q
    public void a(boolean z11) {
        if (z11) {
            ex.d dVar = ex.d.f16511a;
            if (yx.a.f46339a.contains(ex.d.class)) {
                return;
            }
            try {
                ex.d.f16516f.set(true);
                return;
            } catch (Throwable th2) {
                yx.a.a(ex.d.class, th2);
                return;
            }
        }
        ex.d dVar2 = ex.d.f16511a;
        if (yx.a.f46339a.contains(ex.d.class)) {
            return;
        }
        try {
            ex.d.f16516f.set(false);
        } catch (Throwable th3) {
            yx.a.a(ex.d.class, th3);
        }
    }

    @Override // s20.l
    public void b(s20.g gVar, int i11) {
        int i12 = NpsRatingView.f8945e;
    }

    public /* synthetic */ i1(int i11) {
        this.f28529a = i11;
    }

    @Override // m3.g
    public void cancel() {
    }
}
