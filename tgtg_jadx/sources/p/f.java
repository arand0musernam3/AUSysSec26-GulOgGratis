package p;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f33893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f33894c;

    public /* synthetic */ f(int i11, Object obj, Object obj2) {
        this.f33892a = i11;
        this.f33894c = obj;
        this.f33893b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o.j jVar;
        switch (this.f33892a) {
            case 0:
                d dVar = (d) this.f33893b;
                androidx.appcompat.widget.a aVar = (androidx.appcompat.widget.a) this.f33894c;
                o.l lVar = aVar.f31494c;
                if (lVar != null && (jVar = lVar.f31548e) != null) {
                    jVar.q(lVar);
                }
                View view = (View) aVar.f31499h;
                if (view != null && view.getWindowToken() != null) {
                    if (dVar.b()) {
                        aVar.f2137t = dVar;
                    } else if (dVar.f31610e != null) {
                        dVar.d(0, 0, false, false);
                        aVar.f2137t = dVar;
                    }
                }
                aVar.f2139v = null;
                break;
            default:
                View view2 = (View) this.f33893b;
                int left = view2.getLeft();
                androidx.appcompat.widget.b bVar = (androidx.appcompat.widget.b) this.f33894c;
                bVar.smoothScrollTo(left - ((bVar.getWidth() - view2.getWidth()) / 2), 0);
                bVar.f2143a = null;
                break;
        }
    }
}
