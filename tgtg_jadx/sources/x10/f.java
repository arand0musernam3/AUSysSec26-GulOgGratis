package x10;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n2;
import bg.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends LinearLayoutManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f43656b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, Context context, int i11, int i12) {
        super(context, i11, false);
        this.f43656b = iVar;
        this.f43655a = i12;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void calculateExtraLayoutSpace(n2 n2Var, int[] iArr) {
        int i11 = this.f43655a;
        i iVar = this.f43656b;
        if (i11 == 0) {
            iArr[0] = iVar.f43664h.getWidth();
            iArr[1] = iVar.f43664h.getWidth();
        } else {
            iArr[0] = iVar.f43664h.getHeight();
            iArr[1] = iVar.f43664h.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.y1
    public final void smoothScrollToPosition(RecyclerView recyclerView, n2 n2Var, int i11) {
        u0 u0Var = new u0(recyclerView.getContext(), 2);
        u0Var.setTargetPosition(i11);
        startSmoothScroll(u0Var);
    }
}
