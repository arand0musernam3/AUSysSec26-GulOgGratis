package pg;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l extends a8.k {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f34964w = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final RelativeLayout f34965s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f34966t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TextView f34967u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f34968v;

    public l(a8.b bVar, View view, RelativeLayout relativeLayout, TextView textView, TextView textView2) {
        super(0, view, bVar);
        this.f34965s = relativeLayout;
        this.f34966t = textView;
        this.f34967u = textView2;
    }

    public abstract void f0(String str);
}
