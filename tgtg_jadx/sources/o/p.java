package o;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends FrameLayout implements androidx.appcompat.view.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CollapsibleActionView f31597a;

    /* JADX WARN: Multi-variable type inference failed */
    public p(View view) {
        super(view.getContext());
        this.f31597a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // androidx.appcompat.view.b
    public final void onActionViewCollapsed() {
        this.f31597a.onActionViewCollapsed();
    }

    @Override // androidx.appcompat.view.b
    public final void onActionViewExpanded() {
        this.f31597a.onActionViewExpanded();
    }
}
