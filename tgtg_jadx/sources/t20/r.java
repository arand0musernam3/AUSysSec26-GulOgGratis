package t20;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r extends m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f39758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EditText f39759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ax.s f39760g;

    public r(l lVar, int i11) {
        super(lVar);
        this.f39758e = R.drawable.design_password_eye;
        this.f39760g = new ax.s(this, 23);
        if (i11 != 0) {
            this.f39758e = i11;
        }
    }

    @Override // t20.m
    public final void b() {
        p();
    }

    @Override // t20.m
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // t20.m
    public final int d() {
        return this.f39758e;
    }

    @Override // t20.m
    public final View.OnClickListener f() {
        return this.f39760g;
    }

    @Override // t20.m
    public final boolean j() {
        return true;
    }

    @Override // t20.m
    public final boolean k() {
        EditText editText = this.f39759f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // t20.m
    public final void l(EditText editText) {
        this.f39759f = editText;
        p();
    }

    @Override // t20.m
    public final void q() {
        EditText editText = this.f39759f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f39759f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // t20.m
    public final void r() {
        EditText editText = this.f39759f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
