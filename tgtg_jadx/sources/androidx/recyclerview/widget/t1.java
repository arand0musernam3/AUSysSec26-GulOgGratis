package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t1 {
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, n2 n2Var) {
        getItemOffsets(rect, ((RecyclerView.a) view.getLayoutParams()).f3624a.getLayoutPosition(), recyclerView);
    }

    public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull n2 n2Var) {
        onDraw(canvas, recyclerView);
    }

    public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull n2 n2Var) {
        onDrawOver(canvas, recyclerView);
    }

    @Deprecated
    public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
    }

    @Deprecated
    public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
    }

    @Deprecated
    public void getItemOffsets(@NonNull Rect rect, int i11, @NonNull RecyclerView recyclerView) {
        rect.set(0, 0, 0, 0);
    }
}
