package t10;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import java.util.HashMap;
import java.util.HashSet;
import lz.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements ViewGroup.OnHierarchyChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f39655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f39656b;

    public g(d dVar) {
        this.f39656b = dVar;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        d dVar = this.f39656b;
        if (view == dVar && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                view2.setId(View.generateViewId());
            }
            e20.a aVar = dVar.f39652h;
            Chip chip = (Chip) view2;
            ((HashMap) aVar.f15579c).put(Integer.valueOf(chip.getId()), chip);
            if (chip.isChecked()) {
                aVar.b(chip);
            }
            chip.setInternalOnCheckedChangeListener(new i(aVar, 11));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f39655a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        d dVar = this.f39656b;
        if (view == dVar && (view2 instanceof Chip)) {
            e20.a aVar = dVar.f39652h;
            Chip chip = (Chip) view2;
            aVar.getClass();
            chip.setInternalOnCheckedChangeListener(null);
            ((HashMap) aVar.f15579c).remove(Integer.valueOf(chip.getId()));
            ((HashSet) aVar.f15580d).remove(Integer.valueOf(chip.getId()));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f39655a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
