package e20;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class m0 extends ImageButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15686a;

    public m0(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f15686a = getVisibility();
    }

    public final void a(int i11, boolean z11) {
        super.setVisibility(i11);
        if (z11) {
            this.f15686a = i11;
        }
    }

    public final int getUserSetVisibility() {
        return this.f15686a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i11) {
        a(i11, true);
    }

    public m0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public m0(Context context) {
        this(context, null);
    }
}
