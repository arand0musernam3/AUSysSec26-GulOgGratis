package t20;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f39720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f39721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f39722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f39723d;

    public m(l lVar) {
        this.f39720a = lVar.f39699a;
        this.f39721b = lVar;
        this.f39722c = lVar.getContext();
        this.f39723d = lVar.f39705g;
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public AccessibilityManager.TouchExplorationStateChangeListener h() {
        return null;
    }

    public boolean i(int i11) {
        return true;
    }

    public boolean j() {
        return this instanceof i;
    }

    public boolean k() {
        return false;
    }

    public final void p() {
        this.f39721b.e(false);
    }

    public void a() {
    }

    public void b() {
    }

    public void q() {
    }

    public void r() {
    }

    public void l(EditText editText) {
    }

    public void m(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    public void n(AccessibilityEvent accessibilityEvent) {
    }

    public void o(boolean z11) {
    }
}
