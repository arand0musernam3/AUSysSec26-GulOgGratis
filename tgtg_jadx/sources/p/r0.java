package p;

import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class r0 extends ky.o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppCompatTextView f33991c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(AppCompatTextView appCompatTextView) {
        super(appCompatTextView, 11);
        this.f33991c = appCompatTextView;
    }

    @Override // ky.o, p.q0
    public final void o(int i11) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i11);
    }

    @Override // ky.o, p.q0
    public final void p(int i11) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i11);
    }
}
