package y2;

import m5.t0;
import y00.d0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d0 f45375i = new d0(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f45379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f45380e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f45381f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f45382g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f45383h;

    public d(int i11, String str, String str2, long j9, long j11, long j12, boolean z11, int i12) {
        j12 = (i12 & 32) != 0 ? System.currentTimeMillis() : j12;
        z11 = (i12 & 64) != 0 ? true : z11;
        this.f45376a = i11;
        this.f45377b = str;
        this.f45378c = str2;
        this.f45379d = j9;
        this.f45380e = j11;
        this.f45381f = j12;
        this.f45382g = z11;
        if (str.length() == 0 && str2.length() == 0) {
            i4.a.f("Either pre or post text must not be empty");
            throw null;
        }
        this.f45383h = (str.length() != 0 || str2.length() <= 0) ? (str.length() <= 0 || str2.length() != 0) ? b.Replace : b.Delete : b.Insert;
    }

    public final a a() {
        if (this.f45383h != b.Delete) {
            return a.NotByUser;
        }
        long j9 = this.f45380e;
        if (!t0.d(j9)) {
            return a.NotByUser;
        }
        long j11 = this.f45379d;
        return t0.d(j11) ? ((int) (j11 >> 32)) > ((int) (j9 >> 32)) ? a.Start : a.End : (((int) (j11 >> 32)) == ((int) (j9 >> 32)) && ((int) (j11 >> 32)) == this.f45376a) ? a.Inner : a.NotByUser;
    }
}
