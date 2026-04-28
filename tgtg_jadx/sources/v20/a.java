package v20;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.view.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f41943a = {R.attr.theme, com.app.tgtg.R.attr.theme};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f41944b = {com.app.tgtg.R.attr.materialThemeOverlay};

    public static Context a(Context context, AttributeSet attributeSet, int i11, int i12) {
        return b(context, attributeSet, i11, i12, new int[0]);
    }

    public static Context b(Context context, AttributeSet attributeSet, int i11, int i12, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f41944b, i11, i12);
        int[] iArr2 = {typedArrayObtainStyledAttributes.getResourceId(0, 0)};
        typedArrayObtainStyledAttributes.recycle();
        int i13 = iArr2[0];
        boolean z11 = (context instanceof c) && ((c) context).f1842a == i13;
        if (i13 == 0 || z11) {
            return context;
        }
        c cVar = new c(context, i13);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        if (iArr.length > 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i11, i12);
            for (int i14 = 0; i14 < iArr.length; i14++) {
                iArr3[i14] = typedArrayObtainStyledAttributes2.getResourceId(i14, 0);
            }
            typedArrayObtainStyledAttributes2.recycle();
        }
        for (int i15 = 0; i15 < length; i15++) {
            int i16 = iArr3[i15];
            if (i16 != 0) {
                cVar.getTheme().applyStyle(i16, true);
            }
        }
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f41943a);
        int resourceId = typedArrayObtainStyledAttributes3.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(1, 0);
        typedArrayObtainStyledAttributes3.recycle();
        if (resourceId == 0) {
            resourceId = resourceId2;
        }
        if (resourceId != 0) {
            cVar.getTheme().applyStyle(resourceId, true);
        }
        return cVar;
    }
}
