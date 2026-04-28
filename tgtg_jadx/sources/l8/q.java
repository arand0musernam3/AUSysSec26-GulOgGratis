package l8;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27473b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27474c = -1;

    public q(int i11) {
        this.f27472a = i11;
    }

    @Override // l8.p
    public final boolean h(CharSequence charSequence, int i11, int i12, w wVar) {
        int i13 = this.f27472a;
        if (i11 > i13 || i13 >= i12) {
            return i12 <= i13;
        }
        this.f27473b = i11;
        this.f27474c = i12;
        return false;
    }

    @Override // l8.p
    public final Object g() {
        return this;
    }
}
