package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.NonNull;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.widget.Toolbar;
import androidx.core.os.LocaleListCompat;
import java.lang.ref.WeakReference;
import k.c0;
import k.d0;
import k.i;
import k.l;
import p.d3;
import q1.f;
import rb.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AppCompatDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f1768a = new k(new w0.a(2));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f1769b = -100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static LocaleListCompat f1770c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static LocaleListCompat f1771d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Boolean f1772e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f1773f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f f1774g = new f(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f1775h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f1776i = new Object();

    public static void A(a aVar) {
        synchronized (f1775h) {
            try {
                f fVar = f1774g;
                fVar.getClass();
                q1.a aVar2 = new q1.a(fVar);
                while (aVar2.hasNext()) {
                    AppCompatDelegate appCompatDelegate = (AppCompatDelegate) ((WeakReference) aVar2.next()).get();
                    if (appCompatDelegate == aVar || appCompatDelegate == null) {
                        aVar2.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void C(boolean z11) {
        int i11 = d3.f33877a;
    }

    @NonNull
    public static AppCompatDelegate d(@NonNull Activity activity, i iVar) {
        return new a(activity, null, iVar, activity);
    }

    @NonNull
    public static AppCompatDelegate e(@NonNull Dialog dialog, i iVar) {
        return new a(dialog.getContext(), dialog.getWindow(), iVar, dialog);
    }

    @NonNull
    public static LocaleListCompat g() {
        Object systemService;
        Context contextH;
        if (Build.VERSION.SDK_INT >= 33) {
            f fVar = f1774g;
            fVar.getClass();
            q1.a aVar = new q1.a(fVar);
            while (true) {
                if (!aVar.hasNext()) {
                    systemService = null;
                    break;
                }
                AppCompatDelegate appCompatDelegate = (AppCompatDelegate) ((WeakReference) aVar.next()).get();
                if (appCompatDelegate != null && (contextH = appCompatDelegate.h()) != null) {
                    systemService = contextH.getSystemService("locale");
                    break;
                }
            }
            if (systemService != null) {
                return LocaleListCompat.i(l.a(systemService));
            }
        } else {
            LocaleListCompat localeListCompat = f1770c;
            if (localeListCompat != null) {
                return localeListCompat;
            }
        }
        return LocaleListCompat.d();
    }

    public static int i() {
        return f1769b;
    }

    public static boolean r(Context context) {
        if (f1772e == null) {
            try {
                int i11 = d0.f25532a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) d0.class), c0.a() | 128).metaData;
                if (bundle != null) {
                    f1772e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f1772e = Boolean.FALSE;
            }
        }
        return f1772e.booleanValue();
    }

    public abstract boolean B(int i11);

    public abstract void D(int i11);

    public abstract void E(View view);

    public abstract void F(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void H(Toolbar toolbar);

    public abstract void J(CharSequence charSequence);

    public abstract ActionMode K(@NonNull ActionMode.Callback callback);

    public abstract void a(View view, ViewGroup.LayoutParams layoutParams);

    @NonNull
    public Context c(@NonNull Context context) {
        b(context);
        return context;
    }

    public abstract <T extends View> T f(int i11);

    public Context h() {
        return null;
    }

    public abstract k.a k();

    public int l() {
        return -100;
    }

    public abstract MenuInflater m();

    public abstract ActionBar n();

    public abstract void o();

    public abstract void p();

    public abstract void s(Configuration configuration);

    public abstract void t(Bundle bundle);

    public abstract void u();

    public abstract void v(Bundle bundle);

    public abstract void w();

    public abstract void x(Bundle bundle);

    public abstract void y();

    public abstract void z();

    public void G(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public void I(int i11) {
    }

    @Deprecated
    public void b(Context context) {
    }
}
