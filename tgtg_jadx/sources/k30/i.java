package k30;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f25902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f25903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f25904c;

    public i(Object obj, Object obj2, Object obj3) {
        this.f25902a = obj;
        this.f25903b = obj2;
        this.f25904c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f25902a;
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f25903b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.f25904c);
        return new IllegalArgumentException(sb2.toString());
    }
}
