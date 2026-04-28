package p;

import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends r0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppCompatTextView f34003d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(AppCompatTextView appCompatTextView) {
        super(appCompatTextView);
        this.f34003d = appCompatTextView;
    }

    @Override // ky.o, p.q0
    public final void r(int i11, float f11) {
        super/*android.widget.TextView*/.setLineHeight(i11, f11);
    }
}
