package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.view.ActionMode;
import k.p;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ActionBar {
    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public abstract int d();

    public Context e() {
        return null;
    }

    public abstract void f();

    public boolean g() {
        return false;
    }

    public boolean j(int i11, KeyEvent keyEvent) {
        return false;
    }

    public boolean k(KeyEvent keyEvent) {
        return false;
    }

    public boolean l() {
        return false;
    }

    public abstract void n(boolean z11);

    public abstract void o();

    public abstract void p();

    public abstract void r(CharSequence charSequence);

    public ActionMode t(p pVar) {
        return null;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static class a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1765a;

        public a(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1765a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.a.f24254b);
            this.f1765a = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public a(a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.f1765a = 0;
            this.f1765a = aVar.f1765a;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1765a = 0;
        }
    }

    public void h() {
    }

    public void i() {
    }

    public void c(boolean z11) {
    }

    public void m(boolean z11) {
    }

    public void q(boolean z11) {
    }

    public void s(CharSequence charSequence) {
    }
}
