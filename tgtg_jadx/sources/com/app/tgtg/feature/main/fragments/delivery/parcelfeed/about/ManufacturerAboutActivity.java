package com.app.tgtg.feature.main.fragments.delivery.parcelfeed.about;

import a8.k;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.databinding.DataBinderMapperImpl;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.viewpager2.widget.ViewPager2;
import com.app.tgtg.R;
import com.app.tgtg.feature.main.fragments.delivery.parcelfeed.about.ManufacturerAboutActivity;
import com.google.android.material.tabs.TabLayout;
import gl.i;
import java.util.ArrayList;
import k.g;
import k.h;
import kotlin.jvm.internal.Intrinsics;
import mr.e;
import o30.f0;
import p70.b;
import pg.f2;
import r70.c;
import wy.o;
import zm.a;
import zm.d;
import zz.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class ManufacturerAboutActivity extends h implements c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f9117i = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile b f9118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f9119c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9120d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f2 f9121e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i f9122f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9123g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean[] f9124h;

    public ManufacturerAboutActivity() {
        addOnContextAvailableListener(new g(this, 23));
        this.f9123g = true;
        Boolean bool = Boolean.FALSE;
        this.f9124h = new Boolean[]{bool, bool, bool, bool, bool};
    }

    public final void A(Bundle bundle) {
        super.onCreate(bundle);
        z().d();
    }

    public final void B() {
        super.onDestroy();
        z().b();
    }

    @Override // r70.b
    public final Object a() {
        return z().a();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.p
    public final ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        return f.q(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        A(bundle);
        LayoutInflater layoutInflater = getLayoutInflater();
        int i11 = f2.f34861y;
        DataBinderMapperImpl dataBinderMapperImpl = a8.c.f965a;
        i iVar = null;
        final int i12 = 0;
        f2 f2Var = (f2) k.Z(layoutInflater, R.layout.mnu_about_fragment, null, false, null);
        this.f9121e = f2Var;
        f2Var.getClass();
        setContentView(f2Var.f986f);
        final int i13 = 1;
        f0.S(this, true);
        zm.g gVar = new zm.g(this);
        a aVar = new a();
        ArrayList arrayList = gVar.f47997j;
        arrayList.add(aVar);
        arrayList.add(new zm.c());
        arrayList.add(new d());
        f2 f2Var2 = this.f9121e;
        f2Var2.getClass();
        f2Var2.f34863t.setAdapter(gVar);
        f2 f2Var3 = this.f9121e;
        f2Var3.getClass();
        f2Var3.f34863t.setCurrentItem(0);
        f2 f2Var4 = this.f9121e;
        f2Var4.getClass();
        TabLayout tabLayout = f2Var4.f34862s;
        f2 f2Var5 = this.f9121e;
        f2Var5.getClass();
        new ae.c(tabLayout, f2Var5.f34863t, new o(23)).b();
        f2 f2Var6 = this.f9121e;
        f2Var6.getClass();
        f2Var6.f34866w.setOnClickListener(new View.OnClickListener(this) { // from class: zm.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManufacturerAboutActivity f47996b;

            {
                this.f47996b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i12;
                ManufacturerAboutActivity manufacturerAboutActivity = this.f47996b;
                switch (i14) {
                    case 0:
                        f2 f2Var7 = manufacturerAboutActivity.f9121e;
                        f2Var7.getClass();
                        ViewPager2 viewPager2 = f2Var7.f34863t;
                        viewPager2.getClass();
                        pd.g.E(viewPager2);
                        break;
                    case 1:
                        f2 f2Var8 = manufacturerAboutActivity.f9121e;
                        f2Var8.getClass();
                        ViewPager2 viewPager22 = f2Var8.f34863t;
                        viewPager22.getClass();
                        pd.g.G(viewPager22);
                        break;
                    case 2:
                        int i15 = ManufacturerAboutActivity.f9117i;
                        manufacturerAboutActivity.finish();
                        break;
                    default:
                        int i16 = ManufacturerAboutActivity.f9117i;
                        manufacturerAboutActivity.finish();
                        break;
                }
            }
        });
        f2 f2Var7 = this.f9121e;
        f2Var7.getClass();
        f2Var7.f34864u.setOnClickListener(new View.OnClickListener(this) { // from class: zm.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManufacturerAboutActivity f47996b;

            {
                this.f47996b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i13;
                ManufacturerAboutActivity manufacturerAboutActivity = this.f47996b;
                switch (i14) {
                    case 0:
                        f2 f2Var72 = manufacturerAboutActivity.f9121e;
                        f2Var72.getClass();
                        ViewPager2 viewPager2 = f2Var72.f34863t;
                        viewPager2.getClass();
                        pd.g.E(viewPager2);
                        break;
                    case 1:
                        f2 f2Var8 = manufacturerAboutActivity.f9121e;
                        f2Var8.getClass();
                        ViewPager2 viewPager22 = f2Var8.f34863t;
                        viewPager22.getClass();
                        pd.g.G(viewPager22);
                        break;
                    case 2:
                        int i15 = ManufacturerAboutActivity.f9117i;
                        manufacturerAboutActivity.finish();
                        break;
                    default:
                        int i16 = ManufacturerAboutActivity.f9117i;
                        manufacturerAboutActivity.finish();
                        break;
                }
            }
        });
        f2 f2Var8 = this.f9121e;
        f2Var8.getClass();
        final int i14 = 2;
        f2Var8.f34867x.setOnClickListener(new View.OnClickListener(this) { // from class: zm.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManufacturerAboutActivity f47996b;

            {
                this.f47996b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142 = i14;
                ManufacturerAboutActivity manufacturerAboutActivity = this.f47996b;
                switch (i142) {
                    case 0:
                        f2 f2Var72 = manufacturerAboutActivity.f9121e;
                        f2Var72.getClass();
                        ViewPager2 viewPager2 = f2Var72.f34863t;
                        viewPager2.getClass();
                        pd.g.E(viewPager2);
                        break;
                    case 1:
                        f2 f2Var82 = manufacturerAboutActivity.f9121e;
                        f2Var82.getClass();
                        ViewPager2 viewPager22 = f2Var82.f34863t;
                        viewPager22.getClass();
                        pd.g.G(viewPager22);
                        break;
                    case 2:
                        int i15 = ManufacturerAboutActivity.f9117i;
                        manufacturerAboutActivity.finish();
                        break;
                    default:
                        int i16 = ManufacturerAboutActivity.f9117i;
                        manufacturerAboutActivity.finish();
                        break;
                }
            }
        });
        f2 f2Var9 = this.f9121e;
        f2Var9.getClass();
        final int i15 = 3;
        f2Var9.f34865v.setOnClickListener(new View.OnClickListener(this) { // from class: zm.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManufacturerAboutActivity f47996b;

            {
                this.f47996b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142 = i15;
                ManufacturerAboutActivity manufacturerAboutActivity = this.f47996b;
                switch (i142) {
                    case 0:
                        f2 f2Var72 = manufacturerAboutActivity.f9121e;
                        f2Var72.getClass();
                        ViewPager2 viewPager2 = f2Var72.f34863t;
                        viewPager2.getClass();
                        pd.g.E(viewPager2);
                        break;
                    case 1:
                        f2 f2Var82 = manufacturerAboutActivity.f9121e;
                        f2Var82.getClass();
                        ViewPager2 viewPager22 = f2Var82.f34863t;
                        viewPager22.getClass();
                        pd.g.G(viewPager22);
                        break;
                    case 2:
                        int i152 = ManufacturerAboutActivity.f9117i;
                        manufacturerAboutActivity.finish();
                        break;
                    default:
                        int i16 = ManufacturerAboutActivity.f9117i;
                        manufacturerAboutActivity.finish();
                        break;
                }
            }
        });
        this.f9122f = new i(this, 5);
        f2 f2Var10 = this.f9121e;
        f2Var10.getClass();
        ViewPager2 viewPager2 = f2Var10.f34863t;
        i iVar2 = this.f9122f;
        if (iVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onPageChangeCallback");
        } else {
            iVar = iVar2;
        }
        viewPager2.b(iVar);
        getOnBackPressedDispatcher().b(new e(this, 14), this);
        Window window = getWindow();
        window.getClass();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(getColor(R.color.beige_10));
    }

    @Override // k.h, androidx.fragment.app.o0, android.app.Activity
    public final void onDestroy() {
        B();
        f2 f2Var = this.f9121e;
        f2Var.getClass();
        ViewPager2 viewPager2 = f2Var.f34863t;
        i iVar = this.f9122f;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onPageChangeCallback");
            iVar = null;
        }
        ((ArrayList) viewPager2.f4116c.f20543b).remove(iVar);
        this.f9121e = null;
    }

    public final b z() {
        if (this.f9118b == null) {
            synchronized (this.f9119c) {
                try {
                    if (this.f9118b == null) {
                        this.f9118b = new b(this);
                    }
                } finally {
                }
            }
        }
        return this.f9118b;
    }
}
