package da;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f14831d;

    public i(String str, int i11, int i12, String str2) {
        str.getClass();
        str2.getClass();
        this.f14828a = i11;
        this.f14829b = i12;
        this.f14830c = str;
        this.f14831d = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        i iVar = (i) obj;
        iVar.getClass();
        int i11 = this.f14828a - iVar.f14828a;
        return i11 == 0 ? this.f14829b - iVar.f14829b : i11;
    }
}
