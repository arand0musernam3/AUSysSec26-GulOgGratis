package e20;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import com.app.tgtg.R;
import com.google.android.material.appbar.MaterialToolbar;
import java.util.ArrayList;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f15670a = {R.attr.colorPrimary};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f15671b = {R.attr.colorPrimaryVariant};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a60.r f15672c = new a60.r(6);

    public static void a(float f11, float[] fArr) {
        if (f11 <= 0.5f) {
            fArr[0] = 1.0f - (f11 * 2.0f);
            fArr[1] = 0.0f;
        } else {
            fArr[0] = 0.0f;
            fArr[1] = (f11 * 2.0f) - 1.0f;
        }
    }

    public static Rect b(View view, View view2) {
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int i11 = iArr[0];
        int i12 = iArr[1];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int i13 = i11 - iArr2[0];
        int i14 = i12 - iArr2[1];
        return new Rect(i13, i14, view2.getWidth() + i13, view2.getHeight() + i14);
    }

    public static void c(Context context, AttributeSet attributeSet, int i11, int i12) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j10.a.f24410d0, i11, i12);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z11) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                e(context, f15671b, "Theme.MaterialComponents");
            }
        }
        e(context, f15670a, "Theme.AppCompat");
    }

    public static void d(Context context, AttributeSet attributeSet, int[] iArr, int i11, int i12, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j10.a.f24410d0, i11, i12);
        boolean z11 = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i11, i12);
            for (int i13 : iArr2) {
                if (typedArrayObtainStyledAttributes2.getResourceId(i13, -1) == -1) {
                    typedArrayObtainStyledAttributes2.recycle();
                    break;
                }
            }
            typedArrayObtainStyledAttributes2.recycle();
            z11 = true;
        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {
            z11 = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (z11) {
            return;
        }
        i4.a.f("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
    }

    public static void e(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i11)) {
                typedArrayObtainStyledAttributes.recycle();
                i4.a.f(w.a0.p("The style on this component requires your app theme to be ", str, " (or a descendant)."));
                return;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void f(View view, k0 k0Var) {
        int paddingStart = view.getPaddingStart();
        int paddingTop = view.getPaddingTop();
        int paddingEnd = view.getPaddingEnd();
        int paddingBottom = view.getPaddingBottom();
        l0 l0Var = new l0();
        l0Var.f15680a = paddingStart;
        l0Var.f15681b = paddingTop;
        l0Var.f15682c = paddingEnd;
        l0Var.f15683d = paddingBottom;
        ViewCompat.k0(view, new dn.k(2, k0Var, l0Var));
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new a8.e(1));
        }
    }

    public static float g(Context context, int i11) {
        return TypedValue.applyDimension(1, i11, context.getResources().getDisplayMetrics());
    }

    public static ActionMenuView h(Toolbar toolbar) {
        for (int i11 = 0; i11 < toolbar.getChildCount(); i11++) {
            View childAt = toolbar.getChildAt(i11);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    public static ViewGroup i(p20.e eVar) {
        View rootView = eVar.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(android.R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == eVar || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    public static Rect j(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (Build.VERSION.SDK_INT >= 30) {
            return n0.a(windowManager);
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        Rect rect = new Rect();
        rect.right = point.x;
        rect.bottom = point.y;
        return rect;
    }

    public static ImageButton k(Toolbar toolbar) {
        Drawable navigationIcon = toolbar.getNavigationIcon();
        if (navigationIcon == null) {
            return null;
        }
        for (int i11 = 0; i11 < toolbar.getChildCount(); i11++) {
            View childAt = toolbar.getChildAt(i11);
            if (childAt instanceof ImageButton) {
                ImageButton imageButton = (ImageButton) childAt;
                if (imageButton.getDrawable() == navigationIcon) {
                    return imageButton;
                }
            }
        }
        return null;
    }

    public static ArrayList l(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < materialToolbar.getChildCount(); i11++) {
            View childAt = materialToolbar.getChildAt(i11);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static TypedArray m(Context context, AttributeSet attributeSet, int[] iArr, int i11, int i12, int... iArr2) {
        c(context, attributeSet, i11, i12);
        d(context, attributeSet, iArr, i11, i12, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i11, i12);
    }

    public static j30.g n(Context context, AttributeSet attributeSet, int[] iArr, int i11, int i12, int... iArr2) {
        c(context, attributeSet, i11, i12);
        d(context, attributeSet, iArr, i11, i12, iArr2);
        return new j30.g(context, context.obtainStyledAttributes(attributeSet, iArr, i11, i12));
    }

    public static PorterDuff.Mode o(int i11, PorterDuff.Mode mode) {
        if (i11 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i11 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i11 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i11) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
