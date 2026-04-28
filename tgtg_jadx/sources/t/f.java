package t;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f39293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f39294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CharSequence f39295d;

    public /* synthetic */ f(m mVar, int i11, CharSequence charSequence, int i12) {
        this.f39292a = i12;
        this.f39293b = mVar;
        this.f39294c = i11;
        this.f39295d = charSequence;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39292a) {
            case 0:
                this.f39293b.t(this.f39294c, this.f39295d);
                break;
            default:
                v vVar = this.f39293b.f39300a;
                if (vVar.f39314b == null) {
                    vVar.f39314b = new s();
                }
                vVar.f39314b.E(this.f39294c, this.f39295d);
                break;
        }
    }
}
