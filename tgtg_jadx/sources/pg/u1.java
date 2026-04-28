package pg;

import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.app.tgtg.customview.MessageBarView;
import com.app.tgtg.feature.main.ui.BottomNavigation;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u1 extends a8.k {
    public static final /* synthetic */ int B = 0;
    public final View A;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ComposeView f35184s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final BottomNavigation f35185t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final CoordinatorLayout f35186u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final DrawerLayout f35187v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final MessageBarView f35188w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final k f35189x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final FrameLayout f35190y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final View f35191z;

    public u1(a8.b bVar, View view, ComposeView composeView, BottomNavigation bottomNavigation, CoordinatorLayout coordinatorLayout, DrawerLayout drawerLayout, MessageBarView messageBarView, k kVar, FrameLayout frameLayout, View view2, View view3) {
        super(0, view, bVar);
        this.f35184s = composeView;
        this.f35185t = bottomNavigation;
        this.f35186u = coordinatorLayout;
        this.f35187v = drawerLayout;
        this.f35188w = messageBarView;
        this.f35189x = kVar;
        this.f35190y = frameLayout;
        this.f35191z = view2;
        this.A = view3;
    }
}
