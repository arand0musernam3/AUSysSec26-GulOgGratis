package nm;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c2;
import androidx.recyclerview.widget.y1;
import m0.l;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayoutManager f31092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m1.a f31093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f31094d;

    public c(e eVar, int i11, y1 y1Var, m1.a aVar) {
        this.f31094d = eVar;
        y1Var.getClass();
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) y1Var;
        linearLayoutManager.getClass();
        this.f31091a = i11;
        this.f31092b = linearLayoutManager;
        this.f31093c = aVar;
    }

    @Override // androidx.recyclerview.widget.c2
    public final void onScrolled(RecyclerView recyclerView, int i11, int i12) {
        LinearLayoutManager linearLayoutManager = this.f31092b;
        int childCount = linearLayoutManager.getChildCount();
        int itemCount = linearLayoutManager.getItemCount();
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        if (i12 < -10 || i12 > 10) {
            ((e) this.f31093c.f28697a).s();
        }
        e eVar = this.f31094d;
        if (eVar.t().S || eVar.t().Q || childCount + iFindFirstVisibleItemPosition < itemCount || iFindFirstVisibleItemPosition < 0 || itemCount < this.f31091a || eVar.t().S) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new l(eVar, 2));
    }
}
