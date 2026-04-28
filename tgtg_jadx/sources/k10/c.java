package k10;

import android.util.Property;
import android.view.ViewGroup;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends Property {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f25736a = new c(Float.class, "childrenAlpha");

    @Override // android.util.Property
    public final Object get(Object obj) {
        Float f11 = (Float) ((ViewGroup) obj).getTag(R.id.mtrl_internal_children_alpha_tag);
        return f11 != null ? f11 : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj;
        Float f11 = (Float) obj2;
        float fFloatValue = f11.floatValue();
        viewGroup.setTag(R.id.mtrl_internal_children_alpha_tag, f11);
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            viewGroup.getChildAt(i11).setAlpha(fFloatValue);
        }
    }
}
