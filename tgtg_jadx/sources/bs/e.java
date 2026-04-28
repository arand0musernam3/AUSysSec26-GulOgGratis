package bs;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l1;
import androidx.recyclerview.widget.n2;
import androidx.recyclerview.widget.r2;
import androidx.recyclerview.widget.t1;
import x10.r;
import x10.t;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6676a;

    public e(x10.i iVar) {
        this.f6676a = 2;
        r.c(null);
        r.c(null);
    }

    @Override // androidx.recyclerview.widget.t1
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, n2 n2Var) {
        switch (this.f6676a) {
            case 0:
                rect.getClass();
                view.getClass();
                n2Var.getClass();
                rect.bottom = 20;
                break;
            case 1:
                rect.getClass();
                view.getClass();
                n2Var.getClass();
                l1 adapter = recyclerView.getAdapter();
                if (adapter != null && adapter.getItemCount() > 1) {
                    r2 r2VarO = RecyclerView.O(view);
                    if ((r2VarO != null ? r2VarO.getAbsoluteAdapterPosition() : -1) == adapter.getItemCount() - 1) {
                        rect.bottom = d70.b.a(65);
                    }
                    break;
                }
                break;
            default:
                super.getItemOffsets(rect, view, recyclerView, n2Var);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.t1
    public void onDraw(Canvas canvas, RecyclerView recyclerView, n2 n2Var) {
        switch (this.f6676a) {
            case 2:
                if ((recyclerView.getAdapter() instanceof t) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                    throw null;
                }
                return;
            default:
                super.onDraw(canvas, recyclerView, n2Var);
                return;
        }
    }

    public /* synthetic */ e(int i11) {
        this.f6676a = i11;
    }
}
