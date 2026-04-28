package com.app.tgtg.feature.main.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import androidx.lifecycle.m1;
import ao.g3;
import bo.a;
import bo.b;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.UserSettings;
import com.google.android.gms.internal.measurement.cg;
import ft.c;
import hm.q;
import hm.v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mv.h;
import mv.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p10.e;
import u70.l;
import u70.t;
import v80.f0;
import w6.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class BottomNavigation extends e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f9155i = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f9156g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f9157h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomNavigation(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        context.getClass();
        this.f9156g = l.b(new a(context, 0));
        this.f9157h = l.b(new aa.e(this, 17));
    }

    private final v getMainViewModel() {
        return (v) this.f9157h.getValue();
    }

    private final Typeface getMenuTypeface() {
        return (Typeface) this.f9156g.getValue();
    }

    public final void b() {
        Drawable drawable;
        MenuItem menuItemFindItem = getMenu().findItem(R.id.item_manufacturer);
        if (menuItemFindItem != null) {
            if (!cg.q(getMainViewModel().f22149b.n().getNewManufacturerItemsForUser()) || getMainViewModel().f22171y) {
                Resources resources = getResources();
                ThreadLocal threadLocal = j.f43256a;
                drawable = resources.getDrawable(R.drawable.ic_delivery, null);
            } else {
                Resources resources2 = getResources();
                ThreadLocal threadLocal2 = j.f43256a;
                drawable = resources2.getDrawable(R.drawable.ic_delivery_dot, null);
            }
            menuItemFindItem.setIcon(drawable);
        }
    }

    public final void c(boolean z11) {
        Drawable drawable;
        MenuItem menuItemFindItem = getMenu().findItem(R.id.item_favourites);
        if (menuItemFindItem != null) {
            if (!z11 || getMainViewModel().f22170x) {
                Resources resources = getResources();
                ThreadLocal threadLocal = j.f43256a;
                drawable = resources.getDrawable(R.drawable.ic_favorites, null);
            } else {
                Resources resources2 = getResources();
                ThreadLocal threadLocal2 = j.f43256a;
                drawable = resources2.getDrawable(R.drawable.ic_favorites_dot, null);
            }
            menuItemFindItem.setIcon(drawable);
        }
    }

    public final void d(z zVar) {
        zVar.getClass();
        int i11 = b.$EnumSwitchMapping$0[zVar.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3 && !getMainViewModel().f22171y) {
                    getMainViewModel().f22171y = true;
                    b();
                }
            } else if (getMainViewModel().f22149b.n().getShowProfilePageNotification()) {
                v mainViewModel = getMainViewModel();
                g3 g3Var = mainViewModel.f22149b;
                g3Var.n().setShowProfilePageNotification(false);
                UserSettings userSettingsN = g3Var.n();
                userSettingsN.setShowProfilePageNotification(false);
                g3Var.z(userSettingsN, false);
                f0.B(m1.d(mainViewModel), null, null, new q(mainViewModel, null, 7), 3);
                e(c.C());
            }
        } else if (!getMainViewModel().f22170x) {
            getMainViewModel().f22170x = true;
            c(false);
        }
        MenuItem menuItemFindItem = getMenu().findItem(zVar.a());
        if (menuItemFindItem != null) {
            menuItemFindItem.setChecked(true);
        }
    }

    public final void e(boolean z11) {
        if (z11) {
            MenuItem menuItemFindItem = getMenu().findItem(R.id.item_my_store_more);
            if (menuItemFindItem != null) {
                int i11 = getMainViewModel().f22149b.n().getHasExpiredPaymentMethods() ? R.drawable.ic_more_dot : R.drawable.ic_more;
                Resources resources = getResources();
                ThreadLocal threadLocal = j.f43256a;
                menuItemFindItem.setIcon(resources.getDrawable(i11, null));
                return;
            }
            return;
        }
        if (z11) {
            e40.a.f();
            return;
        }
        MenuItem menuItemFindItem2 = getMenu().findItem(R.id.item_profile);
        if (menuItemFindItem2 != null) {
            int i12 = (getMainViewModel().f22149b.n().getHasExpiredPaymentMethods() || ((Boolean) ((hv.j) getMainViewModel().f22162p).f22541n.f45488a.getValue()).booleanValue()) ? R.drawable.ic_profile_red_dot : getMainViewModel().f22149b.n().getShowProfilePageNotification() ? R.drawable.ic_profile_green_dot : R.drawable.ic_profile;
            Resources resources2 = getResources();
            ThreadLocal threadLocal2 = j.f43256a;
            menuItemFindItem2.setIcon(resources2.getDrawable(i12, null));
        }
    }

    public final void setListener(@NotNull bo.e eVar) {
        eVar.getClass();
        setOnItemSelectedListener(eVar);
        setOnItemReselectedListener(eVar);
    }

    public final void setMode(boolean z11) {
        int selectedItemId = getSelectedItemId();
        getMenu().clear();
        if (z11) {
            a(R.menu.bottom_navigation_mystore);
        } else {
            a(R.menu.bottom_navigation);
            setItemIconTintList(null);
        }
        Typeface menuTypeface = getMenuTypeface();
        if (menuTypeface != null) {
            h hVar = new h(menuTypeface);
            Menu menu = getMenu();
            menu.getClass();
            int size = menu.size();
            for (int i11 = 0; i11 < size; i11++) {
                MenuItem item = menu.getItem(i11);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append(item.getTitle());
                spannableStringBuilder.setSpan(hVar, length, spannableStringBuilder.length(), 17);
                item.setTitle(new SpannedString(spannableStringBuilder));
            }
        }
        setSelectedItemId(selectedItemId);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BottomNavigation(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BottomNavigation(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ BottomNavigation(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }
}
