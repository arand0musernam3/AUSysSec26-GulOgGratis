package qa;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends s {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f36718k;

    @Override // qa.s
    public final float c(View view, ViewGroup viewGroup) {
        switch (this.f36718k) {
            case 0:
                return view.getTranslationY() - viewGroup.getHeight();
            default:
                return view.getTranslationY() + viewGroup.getHeight();
        }
    }
}
