package en;

import android.view.ViewTreeObserver;
import androidx.lifecycle.z;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements ViewTreeObserver.OnScrollChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f16119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f16120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16121d;

    public /* synthetic */ c(Object obj, List list, z zVar, int i11) {
        this.f16118a = i11;
        this.f16121d = obj;
        this.f16119b = list;
        this.f16120c = zVar;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        switch (this.f16118a) {
            case 0:
                e eVar = (e) this.f16121d;
                if (!eVar.f16131f) {
                    eVar.b(this.f16119b, this.f16120c);
                }
                break;
            default:
                vh.d dVar = (vh.d) this.f16121d;
                if (!dVar.f42334f) {
                    dVar.b(this.f16119b, this.f16120c);
                }
                break;
        }
    }
}
