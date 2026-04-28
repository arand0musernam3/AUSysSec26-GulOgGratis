package p;

import androidx.appcompat.widget.SearchView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f33910b;

    public /* synthetic */ h2(SearchView searchView, int i11) {
        this.f33909a = i11;
        this.f33910b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f33909a) {
            case 0:
                this.f33910b.s();
                break;
            default:
                w7.a aVar = this.f33910b.O;
                if (aVar instanceof s2) {
                    aVar.b(null);
                }
                break;
        }
    }
}
