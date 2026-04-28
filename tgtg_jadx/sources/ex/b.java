package ex;

import android.view.View;
import android.widget.AdapterView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fx.c f16505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f16506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f16507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AdapterView.OnItemClickListener f16508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16509e;

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i11, long j9) {
        view.getClass();
        AdapterView.OnItemClickListener onItemClickListener = this.f16508d;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(adapterView, view, i11, j9);
        }
        View view2 = (View) this.f16507c.get();
        AdapterView adapterView2 = (AdapterView) this.f16506b.get();
        if (view2 == null || adapterView2 == null) {
            return;
        }
        c.c(this.f16505a, view2, adapterView2);
    }
}
