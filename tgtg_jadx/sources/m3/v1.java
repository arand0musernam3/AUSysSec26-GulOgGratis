package m3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.core.view.ViewCompat;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f29466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f29467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f29468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f29469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f29470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f29471f;

    public v1(u1 u1Var, Object obj, boolean z11, v2 v2Var, boolean z12) {
        this.f29469d = u1Var;
        this.f29466a = z11;
        this.f29470e = v2Var;
        this.f29467b = z12;
        this.f29471f = obj;
        this.f29468c = true;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f29469d;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f29466a || this.f29467b) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.f29466a) {
                    drawableMutate.setTintList((ColorStateList) this.f29470e);
                }
                if (this.f29467b) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f29471f);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public void b() {
        p.l lVar = (p.l) this.f29469d;
        Drawable checkMarkDrawable = lVar.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f29466a || this.f29467b) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f29466a) {
                    drawableMutate.setTintList((ColorStateList) this.f29470e);
                }
                if (this.f29467b) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f29471f);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(lVar.getDrawableState());
                }
                lVar.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public Object c() {
        if (this.f29466a) {
            return null;
        }
        Object obj = this.f29471f;
        if (obj != null) {
            return obj;
        }
        v.b("Unexpected form of a provided value");
        qc.y.m();
        return null;
    }

    public void d(AttributeSet attributeSet, int i11) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f29469d;
        Context context = compoundButton.getContext();
        int[] iArr = j.a.f24264m;
        j30.g gVarT = j30.g.t(context, attributeSet, iArr, i11);
        TypedArray typedArray = (TypedArray) gVarT.f24503c;
        ViewCompat.a0(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) gVarT.f24503c, i11, 0);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(b0.a0.x(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(b0.a0.x(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(b0.a0.x(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                compoundButton.setButtonTintList(gVarT.j(2));
            }
            if (typedArray.hasValue(3)) {
                compoundButton.setButtonTintMode(p.e1.c(typedArray.getInt(3, -1), null));
            }
            gVarT.v();
        } catch (Throwable th2) {
            gVarT.v();
            throw th2;
        }
    }

    public /* synthetic */ v1(TextView textView) {
        this.f29470e = null;
        this.f29471f = null;
        this.f29466a = false;
        this.f29467b = false;
        this.f29469d = textView;
    }
}
