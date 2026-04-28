package h7;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScrollFeedbackProvider f21516a;

    public b0(NestedScrollView nestedScrollView) {
        this.f21516a = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // h7.c0
    public final void onScrollLimit(int i11, int i12, int i13, boolean z11) {
        this.f21516a.onScrollLimit(i11, i12, i13, z11);
    }

    @Override // h7.c0
    public final void onScrollProgress(int i11, int i12, int i13, int i14) {
        this.f21516a.onScrollProgress(i11, i12, i13, i14);
    }
}
