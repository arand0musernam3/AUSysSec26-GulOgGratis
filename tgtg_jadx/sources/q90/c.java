package q90;

import kotlin.text.Regex;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s90.e f36423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f36424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f36425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ia0.d0 f36426e;

    public c(s90.e eVar, String str, String str2) {
        this.f36423b = eVar;
        this.f36424c = str;
        this.f36425d = str2;
        this.f36426e = new ia0.d0(new oa0.t((ia0.j0) eVar.f38928c.get(1), this));
    }

    @Override // q90.r0
    public final long e() {
        String str = this.f36425d;
        if (str == null) {
            return -1L;
        }
        byte[] bArr = r90.e.f37811a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @Override // q90.r0
    public final z g() {
        String str = this.f36424c;
        if (str == null) {
            return null;
        }
        Regex regex = z.f36633e;
        try {
            return y.a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // q90.r0
    public final ia0.i p0() {
        return this.f36426e;
    }
}
