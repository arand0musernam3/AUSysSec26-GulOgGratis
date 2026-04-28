package u20;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import com.app.tgtg.R;
import ex.i;
import h0.g;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class a extends AppCompatTextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(v20.a.a(context, attributeSet, i11, 0), attributeSet, i11);
        Context context2 = getContext();
        if (i.G(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = j10.a.I;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i11, 0);
            int[] iArr2 = {1, 2};
            int iR = -1;
            for (int i12 = 0; i12 < 2 && iR < 0; i12++) {
                iR = g.r(context2, typedArrayObtainStyledAttributes, iArr2[i12], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iR != -1) {
                return;
            }
            TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, i11, 0);
            int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
            typedArrayObtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, j10.a.H);
                Context context3 = getContext();
                int[] iArr3 = {2, 4};
                int iR2 = -1;
                for (int i13 = 0; i13 < 2 && iR2 < 0; i13++) {
                    iR2 = g.r(context3, typedArrayObtainStyledAttributes3, iArr3[i13], -1);
                }
                typedArrayObtainStyledAttributes3.recycle();
                if (iR2 >= 0) {
                    setLineHeight(iR2);
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(@NonNull Context context, int i11) {
        super.setTextAppearance(context, i11);
        if (i.G(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i11, j10.a.H);
            Context context2 = getContext();
            int[] iArr = {2, 4};
            int iR = -1;
            for (int i12 = 0; i12 < 2 && iR < 0; i12++) {
                iR = g.r(context2, typedArrayObtainStyledAttributes, iArr[i12], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iR >= 0) {
                setLineHeight(iR);
            }
        }
    }

    public a(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.textViewStyle);
    }

    public a(@NonNull Context context) {
        this(context, null);
    }
}
