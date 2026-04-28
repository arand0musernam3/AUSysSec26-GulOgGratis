package v1;

import android.content.Context;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends EdgeEffect {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f41831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f41832b;

    public r0(Context context) {
        super(context);
        this.f41831a = xz.b.d(context).f47274a * 1;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i11) {
        this.f41832b = 0.0f;
        super.onAbsorb(i11);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f11, float f12) {
        this.f41832b = 0.0f;
        super.onPull(f11, f12);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f41832b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f11) {
        this.f41832b = 0.0f;
        super.onPull(f11);
    }
}
