package v90;

import ia0.d0;
import ia0.i;
import kotlin.text.Regex;
import q90.r0;
import q90.y;
import q90.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f42196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d0 f42197d;

    public h(String str, long j9, d0 d0Var) {
        this.f42195b = str;
        this.f42196c = j9;
        this.f42197d = d0Var;
    }

    @Override // q90.r0
    public final long e() {
        return this.f42196c;
    }

    @Override // q90.r0
    public final z g() {
        String str = this.f42195b;
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
    public final i p0() {
        return this.f42197d;
    }
}
