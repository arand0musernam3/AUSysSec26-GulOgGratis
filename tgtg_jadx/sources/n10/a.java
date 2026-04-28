package n10;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f30276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s6.b f30277c;

    public /* synthetic */ a(s6.b bVar, View view, int i11) {
        this.f30275a = i11;
        this.f30277c = bVar;
        this.f30276b = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z11) {
        switch (this.f30275a) {
            case 0:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.f30277c;
                if (z11 && hideBottomViewOnScrollBehavior.f12262j == 1) {
                    hideBottomViewOnScrollBehavior.w(this.f30276b);
                    break;
                }
                break;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.f30277c;
                if (z11 && hideViewOnScrollBehavior.f12273j == 1) {
                    hideViewOnScrollBehavior.x(this.f30276b);
                    break;
                }
                break;
        }
    }
}
