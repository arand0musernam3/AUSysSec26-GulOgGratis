package org.bouncycastle.jce.provider;

import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.SignatureException;
import java.security.cert.CertPath;
import java.security.spec.InvalidKeySpecException;
import java.util.ConcurrentModificationException;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import qa.w;
import qa.x;
import qa.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements x {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f33331f;

    public static /* synthetic */ void c() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void d(int i11, String str) {
        throw new IllegalStateException((str + i11).toString());
    }

    public static /* synthetic */ void e(int i11, StringBuilder sb2) {
        sb2.append(i11);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    public static /* synthetic */ void f(Object obj) throws SignatureException {
        throw new SignatureException(obj.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void g(Object obj, int i11, String str) {
        throw new IllegalArgumentException((str + obj + ((char) i11)).toString());
    }

    public static /* synthetic */ void h(Object obj, String str) throws InvalidKeySpecException {
        throw new InvalidKeySpecException(str + obj + ((Object) "."));
    }

    public static /* synthetic */ void i(String str) throws InvalidKeyException {
        throw new InvalidKeyException(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void j(String str, Object obj, Object obj2, Object obj3, int i11) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + ((char) i11)).toString());
    }

    public static /* synthetic */ void k(String str, Throwable th2) throws AnnotatedException {
        throw new AnnotatedException(str, th2);
    }

    public static /* synthetic */ void l(String str, Throwable th2, CertPath certPath, int i11) throws ExtCertPathValidatorException {
        throw new ExtCertPathValidatorException(str, th2, certPath, i11);
    }

    public static /* synthetic */ void m(Throwable th2) {
        throw new RuntimeException(th2);
    }

    public static /* synthetic */ void o() {
        throw new ConcurrentModificationException();
    }

    public static /* synthetic */ void p(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void q(String str) throws AnnotatedException {
        throw new AnnotatedException(str);
    }

    public static /* synthetic */ void s(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void t(String str) {
        throw new InvalidParameterException(str);
    }

    public static /* synthetic */ void v(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    @Override // qa.x
    public void a(w wVar, y yVar, boolean z11) {
        switch (this.f33331f) {
            case 25:
                wVar.d(yVar);
                break;
            case 26:
                wVar.e(yVar);
                break;
            case 27:
                wVar.g(yVar);
                break;
            case 28:
                wVar.b();
                break;
            default:
                wVar.f();
                break;
        }
    }
}
