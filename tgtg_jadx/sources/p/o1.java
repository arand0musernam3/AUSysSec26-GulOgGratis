package p;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f33961b;

    public /* synthetic */ o1(Object obj, int i11) {
        this.f33960a = i11;
        this.f33961b = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i11, long j9) {
        k1 k1Var;
        switch (this.f33960a) {
            case 0:
                if (i11 != -1 && (k1Var = ((v1) this.f33961b).f34042c) != null) {
                    k1Var.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) this.f33961b).o(i11);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i11 = this.f33960a;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
