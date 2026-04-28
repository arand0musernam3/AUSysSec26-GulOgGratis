package p;

import android.database.DataSetObserver;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s1 extends DataSetObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f34005b;

    public /* synthetic */ s1(Object obj, int i11) {
        this.f34004a = i11;
        this.f34005b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f34004a) {
            case 0:
                v1 v1Var = (v1) this.f34005b;
                if (v1Var.f34064z.isShowing()) {
                    v1Var.show();
                }
                break;
            default:
                s2 s2Var = (s2) this.f34005b;
                s2Var.f43270a = true;
                s2Var.notifyDataSetChanged();
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f34004a) {
            case 0:
                ((v1) this.f34005b).dismiss();
                break;
            default:
                s2 s2Var = (s2) this.f34005b;
                s2Var.f43270a = false;
                s2Var.notifyDataSetInvalidated();
                break;
        }
    }
}
