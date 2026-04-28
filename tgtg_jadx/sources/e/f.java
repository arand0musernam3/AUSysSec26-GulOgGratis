package e;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.m1;
import y9.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f15285a = new ViewGroup.LayoutParams(-2, -2);

    public static void a(ComponentActivity componentActivity, u3.d dVar) {
        View childAt = ((ViewGroup) componentActivity.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(null);
            composeView.setContent(dVar);
            return;
        }
        ComposeView composeView2 = new ComposeView(componentActivity, null, 0, 6, null);
        composeView2.setParentCompositionContext(null);
        composeView2.setContent(dVar);
        View decorView = componentActivity.getWindow().getDecorView();
        if (m1.a(decorView) == null) {
            decorView.setTag(com.app.tgtg.R.id.view_tree_lifecycle_owner, componentActivity);
        }
        if (m1.b(decorView) == null) {
            decorView.setTag(com.app.tgtg.R.id.view_tree_view_model_store_owner, componentActivity);
        }
        if (w.s(decorView) == null) {
            decorView.setTag(com.app.tgtg.R.id.view_tree_saved_state_registry_owner, componentActivity);
        }
        componentActivity.setContentView(composeView2, f15285a);
    }
}
