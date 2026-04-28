package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3949f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3950g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3951h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3952i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3953j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f3954k;
    public boolean l;

    public final void a(View view) {
        int layoutPosition;
        int size = this.f3954k.size();
        View view2 = null;
        int i11 = Integer.MAX_VALUE;
        for (int i12 = 0; i12 < size; i12++) {
            View view3 = ((r2) this.f3954k.get(i12)).itemView;
            RecyclerView.a aVar = (RecyclerView.a) view3.getLayoutParams();
            if (view3 != view && !aVar.f3624a.isRemoved() && (layoutPosition = (aVar.f3624a.getLayoutPosition() - this.f3947d) * this.f3948e) >= 0 && layoutPosition < i11) {
                view2 = view3;
                if (layoutPosition == 0) {
                    break;
                } else {
                    i11 = layoutPosition;
                }
            }
        }
        if (view2 == null) {
            this.f3947d = -1;
        } else {
            this.f3947d = ((RecyclerView.a) view2.getLayoutParams()).f3624a.getLayoutPosition();
        }
    }

    public final View b(f2 f2Var) {
        List list = this.f3954k;
        if (list == null) {
            View viewD = f2Var.d(this.f3947d);
            this.f3947d += this.f3948e;
            return viewD;
        }
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = ((r2) this.f3954k.get(i11)).itemView;
            RecyclerView.a aVar = (RecyclerView.a) view.getLayoutParams();
            if (!aVar.f3624a.isRemoved() && this.f3947d == aVar.f3624a.getLayoutPosition()) {
                a(view);
                return view;
            }
        }
        return null;
    }
}
