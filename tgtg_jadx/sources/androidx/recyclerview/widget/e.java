package androidx.recyclerview.widget;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.g2 f3691a;

    public e(androidx.fragment.app.g2 g2Var) {
        this.f3691a = g2Var;
    }

    @Override // androidx.recyclerview.widget.t
    public final boolean areContentsTheSame(int i11, int i12) {
        androidx.fragment.app.g2 g2Var = this.f3691a;
        Object obj = ((List) g2Var.f3199c).get(i11);
        Object obj2 = ((List) g2Var.f3200d).get(i12);
        if (obj != null && obj2 != null) {
            return ((w) ((h) g2Var.f3202f).f3749b.f43084c).areContentsTheSame(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    @Override // androidx.recyclerview.widget.t
    public final boolean areItemsTheSame(int i11, int i12) {
        androidx.fragment.app.g2 g2Var = this.f3691a;
        Object obj = ((List) g2Var.f3199c).get(i11);
        Object obj2 = ((List) g2Var.f3200d).get(i12);
        return (obj == null || obj2 == null) ? obj == null && obj2 == null : ((w) ((h) g2Var.f3202f).f3749b.f43084c).areItemsTheSame(obj, obj2);
    }

    @Override // androidx.recyclerview.widget.t
    public final Object getChangePayload(int i11, int i12) {
        androidx.fragment.app.g2 g2Var = this.f3691a;
        Object obj = ((List) g2Var.f3199c).get(i11);
        Object obj2 = ((List) g2Var.f3200d).get(i12);
        if (obj == null || obj2 == null) {
            throw new AssertionError();
        }
        return ((w) ((h) g2Var.f3202f).f3749b.f43084c).getChangePayload(obj, obj2);
    }

    @Override // androidx.recyclerview.widget.t
    public final int getNewListSize() {
        return ((List) this.f3691a.f3200d).size();
    }

    @Override // androidx.recyclerview.widget.t
    public final int getOldListSize() {
        return ((List) this.f3691a.f3199c).size();
    }
}
