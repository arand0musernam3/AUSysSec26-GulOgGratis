package pz;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f35690d = new q(true, null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f35691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f35692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f35693c;

    public q(boolean z11, String str, Exception exc) {
        this.f35691a = z11;
        this.f35692b = str;
        this.f35693c = exc;
    }

    public static q b(String str) {
        return new q(false, str, null);
    }

    public static q c(String str, Exception exc) {
        return new q(false, str, exc);
    }

    public String a() {
        return this.f35692b;
    }
}
