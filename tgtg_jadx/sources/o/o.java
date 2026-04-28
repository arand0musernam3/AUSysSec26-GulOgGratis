package o;

import android.view.ActionProvider;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements ActionProvider.VisibilityListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m1.a f31595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionProvider f31596b;

    public o(s sVar, ActionProvider actionProvider) {
        this.f31596b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z11) {
        m1.a aVar = this.f31595a;
        if (aVar != null) {
            l lVar = ((n) aVar.f28697a).f31582n;
            lVar.f31551h = true;
            lVar.p(true);
        }
    }
}
