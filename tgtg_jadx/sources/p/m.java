package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f33945b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static m f33946c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c2 f33947a;

    public static synchronized m a() {
        try {
            if (f33946c == null) {
                d();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f33946c;
    }

    public static synchronized PorterDuffColorFilter c(int i11, PorterDuff.Mode mode) {
        return c2.f(i11, mode);
    }

    public static synchronized void d() {
        if (f33946c == null) {
            m mVar = new m();
            f33946c = mVar;
            mVar.f33947a = c2.c();
            c2 c2Var = f33946c.f33947a;
            zw.q2 q2Var = new zw.q2();
            q2Var.f48333a = new int[]{2131230864, 2131230862, 2131230788};
            q2Var.f48334b = new int[]{2131230812, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
            q2Var.f48335c = new int[]{2131230861, 2131230863, 2131230805, R.drawable.abc_text_cursor_material, 2131230858, 2131230859, 2131230860};
            q2Var.f48336d = new int[]{2131230837, R.drawable.abc_cab_background_internal_bg, 2131230836};
            q2Var.f48337e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
            q2Var.f48338f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
            synchronized (c2Var) {
                c2Var.f33873e = q2Var;
            }
        }
    }

    public static void e(Drawable drawable, ax.f0 f0Var, int[] iArr) {
        PorterDuff.Mode mode = c2.f33866f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z11 = f0Var.f4905b;
        if (!z11 && !f0Var.f4904a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterF = null;
        ColorStateList colorStateList = z11 ? (ColorStateList) f0Var.f4906c : null;
        PorterDuff.Mode mode2 = f0Var.f4904a ? (PorterDuff.Mode) f0Var.f4907d : c2.f33866f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterF = c2.f(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterF);
    }

    public final synchronized Drawable b(Context context, int i11) {
        return this.f33947a.d(context, i11);
    }
}
