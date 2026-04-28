package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.app.tgtg.R;
import com.braze.h2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends ContextWrapper {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Configuration f1841f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Resources.Theme f1843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LayoutInflater f1844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Configuration f1845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Resources f1846e;

    public c(Context context, int i11) {
        super(context);
        this.f1842a = i11;
    }

    public final void a(Configuration configuration) {
        if (this.f1846e != null) {
            h2.b("getResources() or getAssets() has already been called");
        } else if (this.f1845d == null) {
            this.f1845d = new Configuration(configuration);
        } else {
            h2.b("Override configuration has already been set");
        }
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f1843b == null) {
            this.f1843b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f1843b.setTo(theme);
            }
        }
        this.f1843b.applyStyle(this.f1842a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.f1846e
            if (r0 != 0) goto L32
            android.content.res.Configuration r0 = r3.f1845d
            if (r0 == 0) goto L2c
            android.content.res.Configuration r1 = androidx.appcompat.view.c.f1841f
            if (r1 != 0) goto L16
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            androidx.appcompat.view.c.f1841f = r1
        L16:
            android.content.res.Configuration r1 = androidx.appcompat.view.c.f1841f
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1f
            goto L2c
        L1f:
            android.content.res.Configuration r0 = r3.f1845d
            android.content.Context r0 = r3.createConfigurationContext(r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.f1846e = r0
            goto L32
        L2c:
            android.content.res.Resources r0 = super.getResources()
            r3.f1846e = r0
        L32:
            android.content.res.Resources r0 = r3.f1846e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.c.getResources():android.content.res.Resources");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f1844c == null) {
            this.f1844c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f1844c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f1843b;
        if (theme != null) {
            return theme;
        }
        if (this.f1842a == 0) {
            this.f1842a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f1843b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i11) {
        if (this.f1842a != i11) {
            this.f1842a = i11;
            b();
        }
    }
}
