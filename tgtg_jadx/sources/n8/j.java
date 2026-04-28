package n8;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements TransformationMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransformationMethod f30702a;

    public j(TransformationMethod transformationMethod) {
        this.f30702a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f30702a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || l8.j.a().c() != 1) {
            return charSequence;
        }
        l8.j jVarA = l8.j.a();
        jVarA.getClass();
        return jVarA.g(0, charSequence.length(), 0, charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z11, int i11, Rect rect) {
        TransformationMethod transformationMethod = this.f30702a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z11, i11, rect);
        }
    }
}
