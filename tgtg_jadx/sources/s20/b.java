package s20;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class b extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f38781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Drawable f38782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38783c;

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j30.g gVarS = j30.g.s(context, attributeSet, j10.a.Z);
        TypedArray typedArray = (TypedArray) gVarS.f24503c;
        this.f38781a = typedArray.getText(2);
        this.f38782b = gVarS.k(0);
        this.f38783c = typedArray.getResourceId(1, 0);
        gVarS.v();
    }

    public b(Context context) {
        this(context, null);
    }
}
