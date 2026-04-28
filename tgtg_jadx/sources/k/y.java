package k;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.view.ActionMode;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class y extends androidx.activity.o implements i {
    private AppCompatDelegate mDelegate;
    private final h7.n mKeyDispatcher;

    public y(@NonNull Context context, int i11) {
        int i12;
        if (i11 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i12 = typedValue.resourceId;
        } else {
            i12 = i11;
        }
        super(context, i12);
        this.mKeyDispatcher = new h7.n() { // from class: k.x
            @Override // h7.n
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f25605a.superDispatchKeyEvent(keyEvent);
            }
        };
        AppCompatDelegate delegate = getDelegate();
        if (i11 == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i11 = typedValue2.resourceId;
        }
        delegate.I(i11);
        delegate.t(null);
    }

    @Override // androidx.activity.o, android.app.Dialog
    public void addContentView(@NonNull View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().a(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        getDelegate().u();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return p30.b.r(this.mKeyDispatcher, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i11) {
        return (T) getDelegate().f(i11);
    }

    @NonNull
    public AppCompatDelegate getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = AppCompatDelegate.e(this, this);
        }
        return this.mDelegate;
    }

    public ActionBar getSupportActionBar() {
        return getDelegate().n();
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        getDelegate().p();
    }

    @Override // androidx.activity.o, android.app.Dialog
    public void onCreate(Bundle bundle) {
        getDelegate().o();
        super.onCreate(bundle);
        getDelegate().t(bundle);
    }

    @Override // androidx.activity.o, android.app.Dialog
    public void onStop() {
        super.onStop();
        getDelegate().z();
    }

    @Override // k.i
    public ActionMode onWindowStartingSupportActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // androidx.activity.o, android.app.Dialog
    public void setContentView(int i11) {
        initializeViewTreeOwners();
        getDelegate().D(i11);
    }

    @Override // android.app.Dialog
    public void setTitle(int i11) {
        super.setTitle(i11);
        getDelegate().J(getContext().getString(i11));
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean supportRequestWindowFeature(int i11) {
        return getDelegate().B(i11);
    }

    @Override // androidx.activity.o, android.app.Dialog
    public void setContentView(@NonNull View view) {
        initializeViewTreeOwners();
        getDelegate().E(view);
    }

    @Override // androidx.activity.o, android.app.Dialog
    public void setContentView(@NonNull View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().F(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().J(charSequence);
    }

    @Override // k.i
    public void onSupportActionModeFinished(ActionMode actionMode) {
    }

    @Override // k.i
    public void onSupportActionModeStarted(ActionMode actionMode) {
    }
}
