package androidx.recyclerview.widget;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3676a;

    public /* synthetic */ c(Object obj) {
        this.f3676a = obj;
    }

    @Override // androidx.recyclerview.widget.c1
    public void a(int i11, int i12) {
        ((l1) this.f3676a).notifyItemMoved(i11, i12);
    }

    @Override // androidx.recyclerview.widget.c1
    public void b(int i11, int i12) {
        ((l1) this.f3676a).notifyItemRangeInserted(i11, i12);
    }

    @Override // androidx.recyclerview.widget.c1
    public void c(int i11, int i12) {
        ((l1) this.f3676a).notifyItemRangeRemoved(i11, i12);
    }

    @Override // androidx.recyclerview.widget.c1
    public void d(int i11, int i12, Object obj) {
        ((l1) this.f3676a).notifyItemRangeChanged(i11, i12, obj);
    }
}
