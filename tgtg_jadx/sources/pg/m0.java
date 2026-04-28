package pg;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m0 extends a8.k {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f34982x = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextView f34983s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ImageView f34984t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TextView f34985u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final RecyclerView f34986v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextView f34987w;

    public m0(a8.b bVar, View view, TextView textView, ImageView imageView, TextView textView2, RecyclerView recyclerView, TextView textView3) {
        super(0, view, bVar);
        this.f34983s = textView;
        this.f34984t = imageView;
        this.f34985u = textView2;
        this.f34986v = recyclerView;
        this.f34987w = textView3;
    }
}
