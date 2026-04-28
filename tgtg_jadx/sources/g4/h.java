package g4;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import com.app.tgtg.model.local.AppConstants;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f19944a = new int[2];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Rect f19945b = new Rect();

    public static final h4.c a(View view, View view2) {
        int[] iArr = f19944a;
        view.getLocationInWindow(iArr);
        int i11 = iArr[0];
        int i12 = iArr[1];
        view2.getLocationInWindow(iArr);
        int i13 = iArr[0];
        float f11 = i12 - iArr[1];
        view.getFocusedRect(f19945b);
        float f12 = (i11 - i13) + r1.left;
        return new h4.c(f12, r1.top + f11, r1.width() + f12, f11 + r1.top + r1.height());
    }

    public static final boolean b(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view instanceof c5.y) {
            return ((c5.y) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    public static final Integer c(int i11) {
        if (i11 == 5) {
            return 33;
        }
        if (i11 == 6) {
            return Integer.valueOf(AppConstants.RESULT_CODE_ORDER_COLLECTED);
        }
        if (i11 == 3) {
            return 17;
        }
        if (i11 == 4) {
            return 66;
        }
        if (i11 == 1) {
            return 2;
        }
        return i11 == 2 ? 1 : null;
    }

    public static final f d(int i11) {
        if (i11 == 1) {
            return new f(2);
        }
        if (i11 == 2) {
            return new f(1);
        }
        if (i11 == 17) {
            return new f(3);
        }
        if (i11 == 33) {
            return new f(5);
        }
        if (i11 == 66) {
            return new f(4);
        }
        if (i11 != 130) {
            return null;
        }
        return new f(6);
    }
}
