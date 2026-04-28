package pg;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w2 extends a8.k {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f35251w = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ConstraintLayout f35252s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final RecyclerView f35253t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TextView f35254u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TextView f35255v;

    public w2(a8.b bVar, View view, ConstraintLayout constraintLayout, RecyclerView recyclerView, TextView textView, TextView textView2) {
        super(0, view, bVar);
        this.f35252s = constraintLayout;
        this.f35253t = recyclerView;
        this.f35254u = textView;
        this.f35255v = textView2;
    }
}
