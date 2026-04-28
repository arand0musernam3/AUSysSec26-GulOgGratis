package pg;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f3 implements sa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f34868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ComposeView f34869b;

    public f3(ConstraintLayout constraintLayout, ComposeView composeView) {
        this.f34868a = constraintLayout;
        this.f34869b = composeView;
    }

    @Override // sa.a
    public final View getRoot() {
        return this.f34868a;
    }
}
