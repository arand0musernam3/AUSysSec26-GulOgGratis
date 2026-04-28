package com.braze.ui.inappmessage.views;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.material.bottomappbar.BottomAppBar;
import zendesk.core.ui.android.internal.xml.AccessibilityExtKt;
import zendesk.ui.android.internal.ViewKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f10947b;

    public /* synthetic */ c(int i11, View view) {
        this.f10946a = i11;
        this.f10947b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i11 = this.f10946a;
        View view = this.f10947b;
        switch (i11) {
            case 0:
                view.requestFocus();
                break;
            case 1:
                ((InputMethodManager) view.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view, 1);
                break;
            case 2:
                view.setVisibility(4);
                break;
            case 3:
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                break;
            case 4:
                int i12 = BottomAppBar.B1;
                view.requestLayout();
                break;
            case 5:
                view.sendAccessibilityEvent(8);
                break;
            case 6:
                AccessibilityExtKt.postDelayRequestFocusWhenAccessibilityRunning$lambda$0(view);
                break;
            default:
                ViewKt.showKeyboardNow$lambda$1(view);
                break;
        }
    }
}
