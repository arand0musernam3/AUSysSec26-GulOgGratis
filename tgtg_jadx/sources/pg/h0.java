package pg;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h0 extends a8.k {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f34883v = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextView f34884s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final RecyclerView f34885t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TextView f34886u;

    public h0(a8.b bVar, View view, TextView textView, RecyclerView recyclerView, TextView textView2) {
        super(0, view, bVar);
        this.f34884s = textView;
        this.f34885t = recyclerView;
        this.f34886u = textView2;
    }
}
