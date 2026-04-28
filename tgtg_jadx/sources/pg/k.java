package pg;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements sa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f34928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f34929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f34930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f34931e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f34932f;

    public /* synthetic */ k(ViewGroup viewGroup, View view, View view2, View view3, View view4, int i11) {
        this.f34927a = i11;
        this.f34928b = viewGroup;
        this.f34929c = view;
        this.f34930d = view2;
        this.f34931e = view3;
        this.f34932f = view4;
    }

    @Override // sa.a
    public final View getRoot() {
        switch (this.f34927a) {
        }
        return (ConstraintLayout) this.f34928b;
    }
}
