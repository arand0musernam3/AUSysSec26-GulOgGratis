package y20;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.transformation.ExpandableBehavior;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f45387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f45388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b20.a f45389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ExpandableBehavior f45390d;

    public a(ExpandableBehavior expandableBehavior, View view, int i11, b20.a aVar) {
        this.f45390d = expandableBehavior;
        this.f45387a = view;
        this.f45388b = i11;
        this.f45389c = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.f45387a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ExpandableBehavior expandableBehavior = this.f45390d;
        if (expandableBehavior.f12729a == this.f45388b) {
            Object obj = this.f45389c;
            expandableBehavior.w((View) obj, view, ((FloatingActionButton) obj).f12474o.f5568b, false);
        }
        return false;
    }
}
