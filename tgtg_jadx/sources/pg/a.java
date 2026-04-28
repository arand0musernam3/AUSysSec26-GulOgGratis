package pg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.app.tgtg.R;
import com.app.tgtg.customview.InputFieldView;
import com.app.tgtg.customview.MenuItemView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements sa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f34760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f34761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f34762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f34763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f34764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f34765g;

    public a(ConstraintLayout constraintLayout, RecyclerView recyclerView, ImageButton imageButton, ImageView imageView, ConstraintLayout constraintLayout2, TextView textView) {
        this.f34759a = 0;
        this.f34760b = constraintLayout;
        this.f34762d = recyclerView;
        this.f34763e = imageButton;
        this.f34764f = imageView;
        this.f34761c = constraintLayout2;
        this.f34765g = textView;
    }

    public static a a(LayoutInflater layoutInflater, InputFieldView inputFieldView) {
        View viewInflate = layoutInflater.inflate(R.layout.input_field_view, (ViewGroup) inputFieldView, false);
        inputFieldView.addView(viewInflate);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i11 = R.id.editField;
        EditText editText = (EditText) pd.g.t(R.id.editField, viewInflate);
        if (editText != null) {
            i11 = R.id.editFieldCountryCode;
            EditText editText2 = (EditText) pd.g.t(R.id.editFieldCountryCode, viewInflate);
            if (editText2 != null) {
                i11 = R.id.tvError;
                TextView textView = (TextView) pd.g.t(R.id.tvError, viewInflate);
                if (textView != null) {
                    i11 = R.id.tvErrorCountryCode;
                    TextView textView2 = (TextView) pd.g.t(R.id.tvErrorCountryCode, viewInflate);
                    if (textView2 != null) {
                        i11 = R.id.tvTitle;
                        TextView textView3 = (TextView) pd.g.t(R.id.tvTitle, viewInflate);
                        if (textView3 != null) {
                            return new a(constraintLayout, (TextView) editText, (TextView) editText2, textView, (View) textView2, (View) textView3, 2);
                        }
                    }
                }
            }
        }
        c50.w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
        return null;
    }

    @Override // sa.a
    public final View getRoot() {
        switch (this.f34759a) {
        }
        return this.f34760b;
    }

    public /* synthetic */ a(ConstraintLayout constraintLayout, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f34759a = i11;
        this.f34760b = constraintLayout;
        this.f34761c = obj;
        this.f34762d = obj2;
        this.f34763e = obj3;
        this.f34764f = obj4;
        this.f34765g = obj5;
    }

    public /* synthetic */ a(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, View view, View view2, int i11) {
        this.f34759a = i11;
        this.f34760b = constraintLayout;
        this.f34761c = textView;
        this.f34762d = textView2;
        this.f34765g = textView3;
        this.f34763e = view;
        this.f34764f = view2;
    }

    public a(ConstraintLayout constraintLayout, MenuItemView menuItemView, MenuItemView menuItemView2, MenuItemView menuItemView3, MenuItemView menuItemView4, ConstraintLayout constraintLayout2) {
        this.f34759a = 1;
        this.f34760b = constraintLayout;
        this.f34762d = menuItemView;
        this.f34763e = menuItemView2;
        this.f34764f = menuItemView3;
        this.f34765g = menuItemView4;
        this.f34761c = constraintLayout2;
    }

    public a(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, ComposeView composeView, ConstraintLayout constraintLayout3, EditText editText, ImageView imageView) {
        this.f34759a = 5;
        this.f34760b = constraintLayout;
        this.f34761c = constraintLayout2;
        this.f34762d = appCompatImageView;
        this.f34763e = constraintLayout3;
        this.f34765g = editText;
        this.f34764f = imageView;
    }
}
