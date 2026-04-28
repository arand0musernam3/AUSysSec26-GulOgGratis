package c20;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends Property {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6939a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6940b;

    public a() {
        super(Matrix.class, "imageMatrixProperty");
        this.f6940b = new Matrix();
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f6939a) {
            case 0:
                ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) obj;
                return Float.valueOf(k10.a.a(0.0f, 1.0f, (Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton.f12456n.getColorForState(extendedFloatingActionButton.getDrawableState(), ((b) this.f6940b).f6942b.f12456n.getDefaultColor()))));
            default:
                Matrix matrix = (Matrix) this.f6940b;
                matrix.set(((ImageView) obj).getImageMatrix());
                return matrix;
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f6939a) {
            case 0:
                ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) obj;
                Float f11 = (Float) obj2;
                int colorForState = extendedFloatingActionButton.f12456n.getColorForState(extendedFloatingActionButton.getDrawableState(), ((b) this.f6940b).f6942b.f12456n.getDefaultColor());
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(Color.argb((int) (k10.a.a(0.0f, Color.alpha(colorForState) / 255.0f, f11.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
                if (f11.floatValue() != 1.0f) {
                    extendedFloatingActionButton.k(colorStateListValueOf);
                } else {
                    extendedFloatingActionButton.k(extendedFloatingActionButton.f12456n);
                }
                break;
            default:
                ((ImageView) obj).setImageMatrix((Matrix) obj2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(Float.class, "LABEL_OPACITY_PROPERTY");
        this.f6940b = bVar;
    }
}
