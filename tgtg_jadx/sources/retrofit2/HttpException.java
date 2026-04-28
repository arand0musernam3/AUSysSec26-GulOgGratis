package retrofit2;

import oa0.n0;
import q90.p0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class HttpException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient n0 f37957b;

    public HttpException(n0 n0Var) {
        StringBuilder sb2 = new StringBuilder("HTTP ");
        p0 p0Var = n0Var.f32351a;
        int i11 = p0Var.f36585d;
        sb2.append(i11);
        sb2.append(" ");
        sb2.append(p0Var.f36584c);
        super(sb2.toString());
        this.f37956a = i11;
        this.f37957b = n0Var;
    }
}
