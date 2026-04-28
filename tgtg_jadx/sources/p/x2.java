package p;

import androidx.appcompat.widget.Toolbar;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar f34080b;

    public /* synthetic */ x2(Toolbar toolbar, int i11) {
        this.f34079a = i11;
        this.f34080b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f34079a) {
            case 0:
                androidx.appcompat.widget.g gVar = this.f34080b.M;
                o.n nVar = gVar == null ? null : gVar.f2155b;
                if (nVar != null) {
                    nVar.collapseActionView();
                }
                break;
            default:
                this.f34080b.n();
                break;
        }
    }
}
