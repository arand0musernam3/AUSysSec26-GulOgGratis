package androidx.recyclerview.widget;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3831f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3832g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3833h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3834i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f3835j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3836k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f3837m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f3838n;

    public final void a(int i11) {
        if ((this.f3829d & i11) != 0) {
            return;
        }
        a40.d0.t("Layout state should be one of ", Integer.toBinaryString(i11), " but it is ", Integer.toBinaryString(this.f3829d));
    }

    public final int b() {
        return this.f3832g ? this.f3827b - this.f3828c : this.f3830e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("State{mTargetPosition=");
        sb2.append(this.f3826a);
        sb2.append(", mData=null, mItemCount=");
        sb2.append(this.f3830e);
        sb2.append(", mIsMeasuring=");
        sb2.append(this.f3834i);
        sb2.append(", mPreviousLayoutItemCount=");
        sb2.append(this.f3827b);
        sb2.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        sb2.append(this.f3828c);
        sb2.append(", mStructureChanged=");
        sb2.append(this.f3831f);
        sb2.append(", mInPreLayout=");
        sb2.append(this.f3832g);
        sb2.append(", mRunSimpleAnimations=");
        sb2.append(this.f3835j);
        sb2.append(", mRunPredictiveAnimations=");
        return r8.k.q(sb2, this.f3836k, '}');
    }
}
