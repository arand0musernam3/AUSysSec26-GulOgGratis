package p;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f33884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f33885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f33886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f33887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f33888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f33889f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f33890g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f33891h;

    public final void a(int i11, int i12) {
        this.f33886c = i11;
        this.f33887d = i12;
        this.f33891h = true;
        if (this.f33890g) {
            if (i12 != Integer.MIN_VALUE) {
                this.f33884a = i12;
            }
            if (i11 != Integer.MIN_VALUE) {
                this.f33885b = i11;
                return;
            }
            return;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f33884a = i11;
        }
        if (i12 != Integer.MIN_VALUE) {
            this.f33885b = i12;
        }
    }
}
