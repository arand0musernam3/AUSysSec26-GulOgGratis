package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class t extends PopupWindow {
    public t(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        a(context, attributeSet, i11);
    }

    public final void a(Context context, AttributeSet attributeSet, int i11) {
        j30.g gVarT = j30.g.t(context, attributeSet, j.a.f24271t, i11);
        TypedArray typedArray = (TypedArray) gVarT.f24503c;
        if (typedArray.hasValue(2)) {
            setOverlapAnchor(typedArray.getBoolean(2, false));
        }
        setBackgroundDrawable(gVarT.k(0));
        gVarT.v();
    }
}
