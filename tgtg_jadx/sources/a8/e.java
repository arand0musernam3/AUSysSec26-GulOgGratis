package a8;

import android.view.View;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f968a;

    public /* synthetic */ e(int i11) {
        this.f968a = i11;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f968a) {
            case 0:
                (view != null ? (k) view.getTag(R.id.dataBinding) : null).f983c.run();
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                view.requestApplyInsets();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i11 = this.f968a;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
