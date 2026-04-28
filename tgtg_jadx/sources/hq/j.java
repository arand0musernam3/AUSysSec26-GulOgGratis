package hq;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.app.tgtg.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j extends LinearLayout implements r70.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p70.g f22381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f22382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public cv.b f22383c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context) {
        super(context);
        context.getClass();
        if (isInEditMode()) {
            return;
        }
        b();
    }

    @Override // r70.b
    public final Object a() {
        if (this.f22381a == null) {
            this.f22381a = new p70.g(this);
        }
        return this.f22381a.a();
    }

    public void b() {
        if (this.f22382b) {
            return;
        }
        this.f22382b = true;
        this.f22383c = (cv.b) ((ag.j) ((k) a())).f1360a.E.get();
    }

    @NotNull
    public final cv.b getEventTrackingManager() {
        cv.b bVar = this.f22383c;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventTrackingManager");
        return null;
    }

    public final void setCardBackground(@NotNull View view, int i11) {
        view.getClass();
        float dimension = view.getResources().getDimension(R.dimen.discover_card_corner_radius);
        n20.n nVar = new n20.n();
        nVar.b(dimension);
        n20.j jVar = new n20.j(nVar.a());
        jVar.t(androidx.core.app.e.b(view.getContext(), i11));
        view.setBackground(jVar);
    }

    public abstract void setDiscoverRow(@NotNull nq.d dVar);

    public final void setEventTrackingManager(@NotNull cv.b bVar) {
        bVar.getClass();
        this.f22383c = bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        if (isInEditMode()) {
            return;
        }
        b();
    }
}
