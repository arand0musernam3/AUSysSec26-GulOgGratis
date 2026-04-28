package ax;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import com.app.tgtg.R;
import com.facebook.FacebookException;
import com.facebook.login.widget.LoginButton;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class t extends Button {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View.OnClickListener f5009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View.OnClickListener f5010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5012f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5013g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public oz.m f5014h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Context context, AttributeSet attributeSet, int i11, int i12, String str, String str2) {
        super(context, attributeSet, 0);
        context.getClass();
        str.getClass();
        str2.getClass();
        i12 = i12 == 0 ? getDefaultStyleResource() : i12;
        a(context, attributeSet, i11, i12 == 0 ? R.style.com_facebook_button : i12);
        this.f5007a = str;
        this.f5008b = str2;
        setClickable(true);
        setFocusable(true);
    }

    public void a(Context context, AttributeSet attributeSet, int i11, int i12) {
        Set set = yx.a.f46339a;
        if (set.contains(this)) {
            return;
        }
        try {
            context.getClass();
            c(context, attributeSet, i11, i12);
            d(context, attributeSet, i11, i12);
            e(context, attributeSet, i11, i12);
            f(context, attributeSet, i11, i12);
            if (!set.contains(this)) {
                try {
                    super.setOnClickListener(new s((LoginButton) this, 0));
                } catch (Throwable th2) {
                    yx.a.a(this, th2);
                }
            }
        } catch (Throwable th3) {
            yx.a.a(this, th3);
        }
    }

    public final int b(String str) {
        if (yx.a.f46339a.contains(this)) {
            return 0;
        }
        try {
            return (int) Math.ceil(getPaint().measureText(str));
        } catch (Throwable th2) {
            yx.a.a(this, th2);
            return 0;
        }
    }

    public final void c(Context context, AttributeSet attributeSet, int i11, int i12) {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            if (isInEditMode()) {
                return;
            }
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{android.R.attr.background}, i11, i12);
            typedArrayObtainStyledAttributes.getClass();
            try {
                if (typedArrayObtainStyledAttributes.hasValue(0)) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        setBackgroundResource(resourceId);
                    } else {
                        setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
                    }
                } else {
                    setBackgroundColor(context.getColor(R.color.com_facebook_blue));
                }
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } catch (Throwable th3) {
            yx.a.a(this, th3);
        }
    }

    public final void d(Context context, AttributeSet attributeSet, int i11, int i12) {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{android.R.attr.drawableLeft, android.R.attr.drawableTop, android.R.attr.drawableRight, android.R.attr.drawableBottom, android.R.attr.drawablePadding}, i11, i12);
            typedArrayObtainStyledAttributes.getClass();
            try {
                setCompoundDrawablesWithIntrinsicBounds(typedArrayObtainStyledAttributes.getResourceId(0, 0), typedArrayObtainStyledAttributes.getResourceId(1, 0), typedArrayObtainStyledAttributes.getResourceId(2, 0), typedArrayObtainStyledAttributes.getResourceId(3, 0));
                int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
                typedArrayObtainStyledAttributes.recycle();
                setCompoundDrawablePadding(dimensionPixelSize);
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } catch (Throwable th3) {
            yx.a.a(this, th3);
        }
    }

    public final void e(Context context, AttributeSet attributeSet, int i11, int i12) {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{android.R.attr.paddingLeft, android.R.attr.paddingTop, android.R.attr.paddingRight, android.R.attr.paddingBottom}, i11, i12);
            typedArrayObtainStyledAttributes.getClass();
            try {
                setPadding(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0));
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }

    public final void f(Context context, AttributeSet attributeSet, int i11, int i12) {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{android.R.attr.textColor}, i11, i12);
            typedArrayObtainStyledAttributes.getClass();
            try {
                setTextColor(typedArrayObtainStyledAttributes.getColorStateList(0));
                typedArrayObtainStyledAttributes.recycle();
                typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{android.R.attr.gravity}, i11, i12);
                typedArrayObtainStyledAttributes.getClass();
                try {
                    int i13 = typedArrayObtainStyledAttributes.getInt(0, 17);
                    typedArrayObtainStyledAttributes.recycle();
                    setGravity(i13);
                    typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{android.R.attr.textSize, android.R.attr.textStyle, android.R.attr.text}, i11, i12);
                    typedArrayObtainStyledAttributes.getClass();
                    try {
                        setTextSize(0, typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0));
                        setTypeface(Typeface.create(getTypeface(), 1));
                        String string = typedArrayObtainStyledAttributes.getString(2);
                        typedArrayObtainStyledAttributes.recycle();
                        setText(string);
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }

    @NotNull
    public Activity getActivity() {
        if (yx.a.f46339a.contains(this)) {
            return null;
        }
        try {
            Context context = getContext();
            while (!(context instanceof Activity) && (context instanceof ContextWrapper)) {
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (context instanceof Activity) {
                return (Activity) context;
            }
            throw new FacebookException("Unable to get Activity.");
        } catch (Throwable th2) {
            yx.a.a(this, th2);
            return null;
        }
    }

    @NotNull
    public final String getAnalyticsButtonCreatedEventName() {
        if (yx.a.f46339a.contains(this)) {
            return null;
        }
        try {
            return this.f5007a;
        } catch (Throwable th2) {
            yx.a.a(this, th2);
            return null;
        }
    }

    @NotNull
    public final String getAnalyticsButtonTappedEventName() {
        if (yx.a.f46339a.contains(this)) {
            return null;
        }
        try {
            return this.f5008b;
        } catch (Throwable th2) {
            yx.a.a(this, th2);
            return null;
        }
    }

    @Nullable
    public final h.f getAndroidxActivityResultRegistryOwner() {
        if (yx.a.f46339a.contains(this)) {
            return null;
        }
        try {
            ComponentCallbacks2 activity = getActivity();
            if (activity instanceof h.f) {
                return (h.f) activity;
            }
            return null;
        } catch (Throwable th2) {
            yx.a.a(this, th2);
            return null;
        }
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (yx.a.f46339a.contains(this)) {
            return 0;
        }
        try {
            return this.f5011e ? this.f5012f : super.getCompoundPaddingLeft();
        } catch (Throwable th2) {
            yx.a.a(this, th2);
            return 0;
        }
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingRight() {
        if (yx.a.f46339a.contains(this)) {
            return 0;
        }
        try {
            return this.f5011e ? this.f5013g : super.getCompoundPaddingRight();
        } catch (Throwable th2) {
            yx.a.a(this, th2);
            return 0;
        }
    }

    public abstract int getDefaultRequestCode();

    public int getDefaultStyleResource() {
        yx.a.f46339a.contains(this);
        return 0;
    }

    @Nullable
    public final Fragment getFragment() {
        if (yx.a.f46339a.contains(this)) {
            return null;
        }
        try {
            oz.m mVar = this.f5014h;
            if (mVar != null) {
                return (Fragment) mVar.f33836b;
            }
            return null;
        } catch (Throwable th2) {
            yx.a.a(this, th2);
            return null;
        }
    }

    @Nullable
    public final android.app.Fragment getNativeFragment() {
        if (yx.a.f46339a.contains(this)) {
            return null;
        }
        try {
            oz.m mVar = this.f5014h;
            if (mVar != null) {
                return (android.app.Fragment) mVar.f33837c;
            }
            return null;
        } catch (Throwable th2) {
            yx.a.a(this, th2);
            return null;
        }
    }

    public int getRequestCode() {
        if (yx.a.f46339a.contains(this)) {
            return 0;
        }
        try {
            return getDefaultRequestCode();
        } catch (Throwable th2) {
            yx.a.a(this, th2);
            return 0;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        Set set = yx.a.f46339a;
        if (set.contains(this)) {
            return;
        }
        try {
            super.onAttachedToWindow();
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
        if (isInEditMode()) {
            return;
        }
        Context context = getContext();
        if (set.contains(this)) {
            return;
        }
        try {
            bx.m mVar = new bx.m(context, (String) null);
            String str = this.f5007a;
            a0 a0Var = a0.f4849a;
            if (s0.c()) {
                mVar.g(null, str);
                return;
            }
            return;
        } catch (Throwable th3) {
            yx.a.a(this, th3);
            return;
        }
        yx.a.a(this, th2);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            canvas.getClass();
            if ((getGravity() & 1) != 0) {
                int compoundPaddingLeft = getCompoundPaddingLeft();
                int compoundPaddingRight = getCompoundPaddingRight();
                int iMin = Math.min((((getWidth() - (getCompoundDrawablePadding() + compoundPaddingLeft)) - compoundPaddingRight) - b(getText().toString())) / 2, (compoundPaddingLeft - getPaddingLeft()) / 2);
                this.f5012f = compoundPaddingLeft - iMin;
                this.f5013g = compoundPaddingRight + iMin;
                this.f5011e = true;
            }
            super.onDraw(canvas);
            this.f5011e = false;
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }

    public final void setFragment(@NotNull android.app.Fragment fragment) {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            fragment.getClass();
            this.f5014h = new oz.m(fragment);
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }

    public void setInternalOnClickListener(@Nullable View.OnClickListener onClickListener) {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            this.f5010d = onClickListener;
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            this.f5009c = onClickListener;
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }

    public final void setFragment(@NotNull Fragment fragment) {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            fragment.getClass();
            this.f5014h = new oz.m(fragment);
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }
}
