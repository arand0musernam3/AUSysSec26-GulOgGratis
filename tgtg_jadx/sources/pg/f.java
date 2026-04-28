package pg;

import android.view.View;
import android.widget.TextView;
import com.app.tgtg.customview.NoChangingBackgroundTextInputLayout;
import com.google.android.material.textfield.TextInputEditText;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f extends a8.k {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f34848w = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextView f34849s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextInputEditText f34850t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final NoChangingBackgroundTextInputLayout f34851u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TextView f34852v;

    public f(a8.b bVar, View view, TextView textView, TextInputEditText textInputEditText, NoChangingBackgroundTextInputLayout noChangingBackgroundTextInputLayout, TextView textView2) {
        super(0, view, bVar);
        this.f34849s = textView;
        this.f34850t = textInputEditText;
        this.f34851u = noChangingBackgroundTextInputLayout;
        this.f34852v = textView2;
    }
}
