package r10;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n2;
import androidx.recyclerview.widget.t1;
import com.app.tgtg.R;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f37530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f37531b;

    public a() {
        Paint paint = new Paint();
        this.f37530a = paint;
        this.f37531b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // androidx.recyclerview.widget.t1
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, n2 n2Var) {
        Canvas canvas2;
        super.onDrawOver(canvas, recyclerView, n2Var);
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.f37530a;
        paint.setStrokeWidth(dimension);
        Iterator it = this.f37531b.iterator();
        while (it.hasNext()) {
            ((f) it.next()).getClass();
            ThreadLocal threadLocal = x6.c.f43871a;
            float f11 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f11)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f11)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f11)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f11))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).e()) {
                canvas2 = canvas;
                canvas2.drawLine(0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f12411b.e(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f12411b.a(), paint);
            } else {
                canvas2 = canvas;
                canvas2.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).f12411b.b(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f12411b.c(), 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
