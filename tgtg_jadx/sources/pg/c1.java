package pg;

import android.view.View;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c1 extends a8.k {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f34811v = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CardView f34812s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ImageView f34813t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final RecyclerView f34814u;

    public c1(a8.b bVar, View view, CardView cardView, ImageView imageView, RecyclerView recyclerView) {
        super(0, view, bVar);
        this.f34812s = cardView;
        this.f34813t = imageView;
        this.f34814u = recyclerView;
    }
}
