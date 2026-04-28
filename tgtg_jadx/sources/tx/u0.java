package tx;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.autofill.AutofillManager;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.app.tgtg.R;
import com.braze.h2;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class u0 extends Dialog {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static volatile int f40557m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f40558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f40559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p0 f40560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t0 f40561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ProgressDialog f40562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f40563f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public FrameLayout f40564g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r0 f40565h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f40566i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f40567j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f40568k;
    public WindowManager.LayoutParams l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(androidx.fragment.app.o0 o0Var, String str, Bundle bundle, cy.f0 f0Var, p0 p0Var) {
        Uri uriA;
        super(o0Var, f40557m);
        j.n();
        this.f40559b = "fbconnect://success";
        bundle = bundle == null ? new Bundle() : bundle;
        String str2 = n0.u(o0Var) ? "fbconnect://chrome_os_success" : "fbconnect://success";
        this.f40559b = str2;
        bundle.putString("redirect_uri", str2);
        bundle.putString("display", "touch");
        bundle.putString("client_id", ax.a0.b());
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        bundle.putString("sdk", String.format(Locale.ROOT, "android-%s", Arrays.copyOf(new Object[]{"18.2.3"}, 1)));
        this.f40560c = p0Var;
        if (Intrinsics.areEqual(str, "share") && bundle.containsKey("media")) {
            this.f40565h = new r0(this, str, bundle);
            return;
        }
        if (s0.$EnumSwitchMapping$0[f0Var.ordinal()] == 1) {
            uriA = n0.a(j.e(), "oauth/authorize", bundle);
        } else {
            uriA = n0.a(j.d(), ax.a0.d() + "/dialog/" + str, bundle);
        }
        this.f40558a = uriA.toString();
    }

    public static int a(float f11, int i11, int i12, int i13) {
        int i14 = (int) (i11 / f11);
        return (int) (((double) i11) * (i14 <= i12 ? 1.0d : i14 >= i13 ? 0.5d : ((((double) (i13 - i14)) / ((double) (i13 - i12))) * 0.5d) + 0.5d));
    }

    public static final void b(androidx.fragment.app.o0 o0Var) {
        if (o0Var == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = o0Var.getPackageManager().getApplicationInfo(o0Var.getPackageName(), 128);
            if ((applicationInfo != null ? applicationInfo.metaData : null) != null && f40557m == 0) {
                int i11 = applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme");
                if (i11 == 0) {
                    i11 = R.style.com_facebook_activity_theme;
                }
                f40557m = i11;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public Bundle c(String str) {
        Uri uri = Uri.parse(str);
        Bundle bundleC = n0.C(uri.getQuery());
        bundleC.putAll(n0.C(uri.getFragment()));
        return bundleC;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.f40560c == null || this.f40566i) {
            return;
        }
        e(new FacebookOperationCanceledException());
    }

    public final void d() {
        Object systemService = getContext().getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i11 = displayMetrics.widthPixels;
        int i12 = displayMetrics.heightPixels;
        int i13 = i11 < i12 ? i11 : i12;
        if (i11 < i12) {
            i11 = i12;
        }
        int iMin = Math.min(a(displayMetrics.density, i13, 480, 800), displayMetrics.widthPixels);
        int iMin2 = Math.min(a(displayMetrics.density, i11, 800, 1280), displayMetrics.heightPixels);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(iMin, iMin2);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ProgressDialog progressDialog;
        t0 t0Var = this.f40561d;
        if (t0Var != null) {
            t0Var.stopLoading();
        }
        if (!this.f40567j && (progressDialog = this.f40562e) != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        super.dismiss();
    }

    public final void e(Exception exc) {
        if (this.f40560c == null || this.f40566i) {
            return;
        }
        this.f40566i = true;
        FacebookException facebookException = exc instanceof FacebookException ? (FacebookException) exc : new FacebookException(exc);
        p0 p0Var = this.f40560c;
        if (p0Var != null) {
            p0Var.a(null, facebookException);
        }
        dismiss();
    }

    public final void f(int i11) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        t0 t0Var = new t0(getContext());
        this.f40561d = t0Var;
        t0Var.setVerticalScrollBarEnabled(false);
        t0 t0Var2 = this.f40561d;
        if (t0Var2 != null) {
            t0Var2.setHorizontalScrollBarEnabled(false);
        }
        t0 t0Var3 = this.f40561d;
        if (t0Var3 != null) {
            t0Var3.setWebViewClient(new co.datadome.sdk.e(this, 2));
        }
        t0 t0Var4 = this.f40561d;
        WebSettings settings = t0Var4 != null ? t0Var4.getSettings() : null;
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
        }
        t0 t0Var5 = this.f40561d;
        if (t0Var5 != null) {
            String str = this.f40558a;
            if (str == null) {
                h2.b("Required value was null.");
                return;
            }
            t0Var5.loadUrl(str);
        }
        t0 t0Var6 = this.f40561d;
        if (t0Var6 != null) {
            t0Var6.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        t0 t0Var7 = this.f40561d;
        if (t0Var7 != null) {
            t0Var7.setVisibility(4);
        }
        t0 t0Var8 = this.f40561d;
        WebSettings settings2 = t0Var8 != null ? t0Var8.getSettings() : null;
        if (settings2 != null) {
            settings2.setSavePassword(false);
        }
        t0 t0Var9 = this.f40561d;
        WebSettings settings3 = t0Var9 != null ? t0Var9.getSettings() : null;
        if (settings3 != null) {
            settings3.setSaveFormData(false);
        }
        t0 t0Var10 = this.f40561d;
        if (t0Var10 != null) {
            t0Var10.setFocusable(true);
        }
        t0 t0Var11 = this.f40561d;
        if (t0Var11 != null) {
            t0Var11.setFocusableInTouchMode(true);
        }
        t0 t0Var12 = this.f40561d;
        if (t0Var12 != null) {
            t0Var12.setOnTouchListener(new l20.h(2));
        }
        linearLayout.setPadding(i11, i11, i11, i11);
        linearLayout.addView(this.f40561d);
        linearLayout.setBackgroundColor(-872415232);
        FrameLayout frameLayout = this.f40564g;
        if (frameLayout != null) {
            frameLayout.addView(linearLayout);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        Window window;
        WindowManager.LayoutParams attributes;
        this.f40567j = false;
        Context context = getContext();
        context.getClass();
        context.getClass();
        AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager != null && autofillManager.isAutofillSupported() && autofillManager.isEnabled() && (layoutParams = this.l) != null) {
            if ((layoutParams != null ? layoutParams.token : null) == null) {
                if (layoutParams != null) {
                    Activity ownerActivity = getOwnerActivity();
                    layoutParams.token = (ownerActivity == null || (window = ownerActivity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                }
                WindowManager.LayoutParams layoutParams2 = this.l;
                Objects.toString(layoutParams2 != null ? layoutParams2.token : null);
                ax.a0 a0Var = ax.a0.f4849a;
            }
        }
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.f40562e = progressDialog;
        progressDialog.requestWindowFeature(1);
        ProgressDialog progressDialog2 = this.f40562e;
        if (progressDialog2 != null) {
            progressDialog2.setMessage(getContext().getString(R.string.com_facebook_loading));
        }
        ProgressDialog progressDialog3 = this.f40562e;
        if (progressDialog3 != null) {
            progressDialog3.setCanceledOnTouchOutside(false);
        }
        ProgressDialog progressDialog4 = this.f40562e;
        if (progressDialog4 != null) {
            progressDialog4.setOnCancelListener(new o0(this, 0));
        }
        requestWindowFeature(1);
        this.f40564g = new FrameLayout(getContext());
        d();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        ImageView imageView = new ImageView(getContext());
        this.f40563f = imageView;
        imageView.setOnClickListener(new ax.s(this, 24));
        Drawable drawable = getContext().getResources().getDrawable(2131231048);
        ImageView imageView2 = this.f40563f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
        ImageView imageView3 = this.f40563f;
        if (imageView3 != null) {
            imageView3.setVisibility(4);
        }
        if (this.f40558a != null) {
            ImageView imageView4 = this.f40563f;
            if (imageView4 == null) {
                h2.b("Required value was null.");
                return;
            }
            f((imageView4.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        FrameLayout frameLayout = this.f40564g;
        if (frameLayout != null) {
            frameLayout.addView(this.f40563f, new ViewGroup.LayoutParams(-2, -2));
        }
        FrameLayout frameLayout2 = this.f40564g;
        if (frameLayout2 != null) {
            setContentView(frameLayout2);
        } else {
            h2.b("Required value was null.");
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f40567j = true;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i11, KeyEvent keyEvent) {
        keyEvent.getClass();
        if (i11 == 4) {
            t0 t0Var = this.f40561d;
            if (t0Var != null && t0Var.canGoBack()) {
                t0 t0Var2 = this.f40561d;
                if (t0Var2 != null) {
                    t0Var2.goBack();
                }
                return true;
            }
            cancel();
        }
        return super.onKeyDown(i11, keyEvent);
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        r0 r0Var = this.f40565h;
        if (r0Var != null) {
            if ((r0Var != null ? r0Var.getStatus() : null) == AsyncTask.Status.PENDING) {
                if (r0Var != null) {
                    r0Var.execute(new Void[0]);
                }
                ProgressDialog progressDialog = this.f40562e;
                if (progressDialog != null) {
                    progressDialog.show();
                    return;
                }
                return;
            }
        }
        d();
    }

    @Override // android.app.Dialog
    public final void onStop() {
        r0 r0Var = this.f40565h;
        if (r0Var != null) {
            r0Var.cancel(true);
            ProgressDialog progressDialog = this.f40562e;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        layoutParams.getClass();
        if (layoutParams.token == null) {
            this.l = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public u0(Context context, String str) {
        context.getClass();
        str.getClass();
        j.n();
        int i11 = f40557m;
        if (i11 == 0) {
            j.n();
            i11 = f40557m;
        }
        super(context, i11);
        this.f40559b = "fbconnect://success";
        this.f40558a = str;
    }
}
