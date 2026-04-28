package bg;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.tgtg.customview.SearchAndFilterView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z extends ConstraintLayout implements r70.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p70.g f6258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6259b;

    public z(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        if (isInEditMode() || this.f6259b) {
            return;
        }
        this.f6259b = true;
        SearchAndFilterView searchAndFilterView = (SearchAndFilterView) this;
        ag.i iVar = ((ag.j) ((p0) a())).f1360a;
        searchAndFilterView.f8914c = (cv.b) iVar.E.get();
        searchAndFilterView.f8915d = (mv.u) iVar.G.get();
    }

    @Override // r70.b
    public final Object a() {
        if (this.f6258a == null) {
            this.f6258a = new p70.g(this);
        }
        return this.f6258a.a();
    }
}
