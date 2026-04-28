package pg;

import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s3 extends a8.k {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f35157u = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final LinearLayout f35158s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ComposeView f35159t;

    public s3(a8.b bVar, View view, LinearLayout linearLayout, ComposeView composeView) {
        super(0, view, bVar);
        this.f35158s = linearLayout;
        this.f35159t = composeView;
    }
}
