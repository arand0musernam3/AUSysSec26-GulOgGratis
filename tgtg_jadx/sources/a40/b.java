package a40;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d40.b0 f700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f702c;

    public b(d40.b0 b0Var, String str, File file) {
        this.f700a = b0Var;
        if (str == null) {
            c50.w.l("Null sessionId");
            throw null;
        }
        this.f701b = str;
        this.f702c = file;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f700a.equals(bVar.f700a) && this.f701b.equals(bVar.f701b) && this.f702c.equals(bVar.f702c);
    }

    public final int hashCode() {
        return ((((this.f700a.hashCode() ^ 1000003) * 1000003) ^ this.f701b.hashCode()) * 1000003) ^ this.f702c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f700a + ", sessionId=" + this.f701b + ", reportFile=" + this.f702c + "}";
    }
}
