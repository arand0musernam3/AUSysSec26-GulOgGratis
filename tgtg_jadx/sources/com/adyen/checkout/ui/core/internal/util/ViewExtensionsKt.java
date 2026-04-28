package com.adyen.checkout.ui.core.internal.util;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.text.style.URLSpan;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.SearchView;
import android.widget.TextView;
import b3.i;
import com.adyen.checkout.components.core.internal.util.StatusResponseUtils;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\tH\u0007\u001a\u0016\u0010\n\u001a\u00020\b*\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tH\u0000\u001a\f\u0010\f\u001a\u00020\r*\u00020\u0003H\u0007\u001a\f\u0010\u000e\u001a\u00020\r*\u00020\u000fH\u0007\u001a\f\u0010\u0010\u001a\u00020\r*\u00020\u000fH\u0007\u001a\f\u0010\u0011\u001a\u00020\r*\u00020\u000fH\u0000\u001a\u0014\u0010\u0012\u001a\u00020\r*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\tH\u0007\u001a\u001e\u0010\u0015\u001a\u00020\r*\u00020\u00032\b\b\u0001\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0007\u001a\u001e\u0010\u001a\u001a\u00020\r*\u00020\u001b2\b\b\u0001\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0007\u001a(\u0010\u001c\u001a\u00020\r*\u00020\u001d2\b\b\u0001\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001e\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u001f\u001a\u00020\r*\u00020\u00032\u0006\u0010 \u001a\u00020\tH\u0007\u001a\f\u0010!\u001a\u00020\r*\u00020\u000fH\u0007\"*\u0010\u0002\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0000\u001a\u00020\u00018Ç\u0002@Ç\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0002\u0010\u0004\"\u0004\b\u0005\u0010\u0006¨\u0006\""}, d2 = {"value", "", "isVisible", "Lcom/google/android/material/textfield/TextInputLayout;", "(Lcom/google/android/material/textfield/TextInputLayout;)Z", "setVisible", "(Lcom/google/android/material/textfield/TextInputLayout;Z)V", "formatFullStringWithHyperLink", "", "", "formatStringWithHyperlink", "replacementToken", "hideError", "", "hideKeyboard", "Landroid/view/View;", "requestFocusOnNextLayout", "resetFocus", "setAccessibilityDelegateWith", "Landroid/widget/EditText;", "contentDescription", "setLocalizedHintFromStyle", "styleResId", "", "localizedContext", "Landroid/content/Context;", "setLocalizedQueryHintFromStyle", "Landroid/widget/SearchView;", "setLocalizedTextFromStyle", "Landroid/widget/TextView;", "formatHyperLink", "showError", StatusResponseUtils.RESULT_ERROR, "showKeyboard", "ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nViewExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewExtensions.kt\ncom/adyen/checkout/ui/core/internal/util/ViewExtensionsKt\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,130:1\n37#2:131\n53#2:132\n*S KotlinDebug\n*F\n+ 1 ViewExtensions.kt\ncom/adyen/checkout/ui/core/internal/util/ViewExtensionsKt\n*L\n116#1:131\n116#1:132\n*E\n"})
public final class ViewExtensionsKt {
    @NotNull
    public static final CharSequence formatFullStringWithHyperLink(@NotNull String str) {
        str.getClass();
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new URLSpan(""), 0, spannableString.length(), 33);
        return spannableString;
    }

    @NotNull
    public static final CharSequence formatStringWithHyperlink(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        if (StringsKt__StringsKt.split$default(str, new String[]{str2}, false, 0, 6, null).size() - 1 != 2) {
            return str;
        }
        int iE = StringsKt.E(0, str, str2, true);
        int I = StringsKt.I(6, str, str2) - str2.length();
        SpannableString spannableString = new SpannableString(y.n(str, str2, "", true));
        spannableString.setSpan(new URLSpan(""), iE, I, 33);
        return spannableString;
    }

    public static /* synthetic */ CharSequence formatStringWithHyperlink$default(String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str2 = "%#";
        }
        return formatStringWithHyperlink(str, str2);
    }

    public static final void hideError(@NotNull TextInputLayout textInputLayout) {
        textInputLayout.getClass();
        textInputLayout.setError(null);
        textInputLayout.setErrorEnabled(false);
    }

    public static final void hideKeyboard(@NotNull View view) {
        view.getClass();
        Object systemService = view.getContext().getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static final boolean isVisible(@NotNull TextInputLayout textInputLayout) {
        textInputLayout.getClass();
        return textInputLayout.getVisibility() == 0;
    }

    public static final void requestFocusOnNextLayout(@NotNull View view) {
        view.getClass();
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.adyen.checkout.ui.core.internal.util.ViewExtensionsKt$requestFocusOnNextLayout$$inlined$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(@NotNull View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                view2.removeOnLayoutChangeListener(this);
                view2.requestFocus();
            }
        });
    }

    public static final void resetFocus(@NotNull View view) {
        view.getClass();
        view.requestFocus();
        view.clearFocus();
    }

    public static final void setAccessibilityDelegateWith(@NotNull EditText editText, @NotNull final String str) {
        editText.getClass();
        str.getClass();
        editText.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: com.adyen.checkout.ui.core.internal.util.ViewExtensionsKt.setAccessibilityDelegateWith.1
            @Override // android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(@NotNull View host, @NotNull AccessibilityNodeInfo info) {
                host.getClass();
                info.getClass();
                super.onInitializeAccessibilityNodeInfo(host, info);
                info.setContentDescription(str);
            }
        });
    }

    public static final void setLocalizedHintFromStyle(@NotNull TextInputLayout textInputLayout, int i11, @NotNull Context context) {
        textInputLayout.getClass();
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i11, new int[]{R.attr.hint});
        typedArrayObtainStyledAttributes.getClass();
        textInputLayout.setHint(typedArrayObtainStyledAttributes.getString(0));
        typedArrayObtainStyledAttributes.recycle();
    }

    public static final void setLocalizedQueryHintFromStyle(@NotNull SearchView searchView, int i11, @NotNull Context context) {
        searchView.getClass();
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i11, new int[]{R.attr.queryHint});
        typedArrayObtainStyledAttributes.getClass();
        searchView.setQueryHint(typedArrayObtainStyledAttributes.getString(0));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.widget.TextView, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    public static final void setLocalizedTextFromStyle(@NotNull TextView textView, int i11, @NotNull Context context, boolean z11) {
        textView.getClass();
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i11, new int[]{R.attr.text});
        typedArrayObtainStyledAttributes.getClass();
        String string = typedArrayObtainStyledAttributes.getString(0);
        ?? stringWithHyperlink$default = string;
        if (string == null) {
            stringWithHyperlink$default = "";
        }
        if (z11) {
            stringWithHyperlink$default = formatStringWithHyperlink$default(stringWithHyperlink$default, null, 1, null);
        }
        textView.setText(stringWithHyperlink$default);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void setLocalizedTextFromStyle$default(TextView textView, int i11, Context context, boolean z11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        setLocalizedTextFromStyle(textView, i11, context, z11);
    }

    public static final void setVisible(@NotNull TextInputLayout textInputLayout, boolean z11) {
        textInputLayout.getClass();
        int i11 = z11 ? 0 : 8;
        textInputLayout.setVisibility(i11);
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            i.x(editText, i11, z11, z11);
        }
    }

    public static final void showError(@NotNull TextInputLayout textInputLayout, @NotNull String str) {
        textInputLayout.getClass();
        str.getClass();
        textInputLayout.setErrorEnabled(true);
        textInputLayout.setError(str);
    }

    public static final void showKeyboard(@NotNull View view) {
        view.getClass();
        Object systemService = view.getContext().getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 1);
        }
    }
}
