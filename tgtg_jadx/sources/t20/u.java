package t20;

import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class u extends h7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f39774a;

    public u(TextInputLayout textInputLayout) {
        this.f39774a = textInputLayout;
    }

    @Override // h7.b
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        TextInputLayout textInputLayout = this.f39774a;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean zIsEmpty2 = TextUtils.isEmpty(hint);
        boolean z11 = textInputLayout.B1;
        boolean zIsEmpty3 = TextUtils.isEmpty(error);
        boolean z12 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String string = !zIsEmpty2 ? hint.toString() : "";
        s sVar = textInputLayout.f12643b;
        View view2 = sVar.f39762b;
        if (view2.getVisibility() == 0) {
            accessibilityNodeInfoCompat.y0(view2);
            accessibilityNodeInfoCompat.S0(view2);
        } else {
            accessibilityNodeInfoCompat.S0(sVar.f39764d);
        }
        if (!zIsEmpty) {
            accessibilityNodeInfoCompat.Q0(text);
        } else if (!TextUtils.isEmpty(string)) {
            accessibilityNodeInfoCompat.Q0(string);
            if (!z11 && placeholderText != null) {
                accessibilityNodeInfoCompat.Q0(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            accessibilityNodeInfoCompat.Q0(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            accessibilityNodeInfoCompat.w0(string);
            accessibilityNodeInfoCompat.N0(zIsEmpty);
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfoCompat.B0(counterMaxLength);
        if (z12) {
            if (zIsEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfoCompat.r0(error);
        }
        View view3 = textInputLayout.f12658k.f39753y;
        if (view3 != null) {
            accessibilityNodeInfoCompat.y0(view3);
        }
        textInputLayout.f12644c.a().m(accessibilityNodeInfoCompat);
    }

    @Override // h7.b
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        this.f39774a.f12644c.a().n(accessibilityEvent);
    }
}
