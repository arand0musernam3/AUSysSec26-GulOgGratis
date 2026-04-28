package t;

import a3.i3;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o0;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.p0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.app.tgtg.R;
import com.braze.h2;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class m extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v f39300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f39301b = new Handler(Looper.getMainLooper());

    public final void dismiss() {
        p();
        v vVar = this.f39300a;
        vVar.f39323k = false;
        if (!vVar.f39324m && isAdded()) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            parentFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(parentFragmentManager);
            aVar.l(this);
            aVar.i(true, true);
        }
        Context context = getContext();
        if (context != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT == 29 && str != null) {
                for (String str2 : context.getResources().getStringArray(R.array.delay_showing_prompt_models)) {
                    if (str.equals(str2)) {
                        v vVar2 = this.f39300a;
                        vVar2.f39325n = true;
                        this.f39301b.postDelayed(new l(vVar2, 1), 600L);
                        return;
                    }
                }
            }
        }
    }

    public final void o(int i11) {
        if (i11 == 3 || !this.f39300a.f39326o) {
            if (r()) {
                this.f39300a.f39322j = i11;
                if (i11 == 1) {
                    u(10, b0.a0.y(getContext(), 10));
                }
            }
            v vVar = this.f39300a;
            if (vVar.f39318f == null) {
                vVar.f39318f = new oz.m(21, false);
            }
            oz.m mVar = vVar.f39318f;
            CancellationSignal cancellationSignal = (CancellationSignal) mVar.f33836b;
            if (cancellationSignal != null) {
                try {
                    cancellationSignal.cancel();
                } catch (NullPointerException e5) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e5);
                }
                mVar.f33836b = null;
            }
            d7.c cVar = (d7.c) mVar.f33837c;
            if (cVar != null) {
                try {
                    cVar.a();
                } catch (NullPointerException e11) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e11);
                }
                mVar.f33837c = null;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        int i13 = 1;
        if (i11 == 1) {
            v vVar = this.f39300a;
            vVar.f39324m = false;
            if (i12 != -1) {
                t(10, getString(R.string.generic_error_user_canceled));
                return;
            }
            if (vVar.f39327p) {
                vVar.f39327p = false;
                i13 = -1;
            }
            v(new p(null, i13));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [androidx.lifecycle.p, androidx.lifecycle.s1] */
    /* JADX WARN: Type inference failed for: r4v32, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r4v34 */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        v vVar;
        super.onCreate(bundle);
        if (this.f39300a == null) {
            ?? activity = getArguments().getBoolean("host_activity", true) ? getActivity() : 0;
            if (activity == 0) {
                activity = getParentFragment();
            }
            if (activity != 0) {
                ViewModelStore viewModelStore = activity.getViewModelStore();
                ViewModelProvider$Factory defaultViewModelProviderFactory = activity.getDefaultViewModelProviderFactory();
                CreationExtras defaultViewModelCreationExtras = activity.getDefaultViewModelCreationExtras();
                viewModelStore.getClass();
                defaultViewModelProviderFactory.getClass();
                defaultViewModelCreationExtras.getClass();
                com.google.firebase.messaging.a0 a0Var = new com.google.firebase.messaging.a0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(v.class);
                orCreateKotlinClass.getClass();
                String qualifiedName = orCreateKotlinClass.getQualifiedName();
                if (qualifiedName != null) {
                    vVar = (v) a0Var.M("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), orCreateKotlinClass);
                    this.f39300a = vVar;
                } else {
                    i4.a.f("Local and anonymous classes can not be ViewModels");
                }
            } else {
                h2.b("view model not found");
            }
            vVar = null;
            this.f39300a = vVar;
        }
        v vVar2 = this.f39300a;
        o0 activity2 = getActivity();
        vVar2.getClass();
        new WeakReference(activity2);
        v vVar3 = this.f39300a;
        if (vVar3.f39328q == null) {
            vVar3.f39328q = new androidx.lifecycle.o0();
        }
        final int i11 = 0;
        vVar3.f39328q.e(this, new p0(this) { // from class: t.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f39297b;

            {
                this.f39297b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:114:0x019f  */
            /* JADX WARN: Removed duplicated region for block: B:83:0x0138  */
            @Override // androidx.lifecycle.p0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(java.lang.Object r11) {
                /*
                    Method dump skipped, instruction units count: 538
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: t.g.a(java.lang.Object):void");
            }
        });
        v vVar4 = this.f39300a;
        if (vVar4.f39329r == null) {
            vVar4.f39329r = new androidx.lifecycle.o0();
        }
        final int i12 = 1;
        vVar4.f39329r.e(this, new p0(this) { // from class: t.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f39297b;

            {
                this.f39297b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:114:0x019f  */
            /* JADX WARN: Removed duplicated region for block: B:83:0x0138  */
            @Override // androidx.lifecycle.p0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(java.lang.Object r11) {
                /*
                    Method dump skipped, instruction units count: 538
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: t.g.a(java.lang.Object):void");
            }
        });
        v vVar5 = this.f39300a;
        if (vVar5.f39330s == null) {
            vVar5.f39330s = new androidx.lifecycle.o0();
        }
        final int i13 = 2;
        vVar5.f39330s.e(this, new p0(this) { // from class: t.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f39297b;

            {
                this.f39297b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:114:0x019f  */
            /* JADX WARN: Removed duplicated region for block: B:83:0x0138  */
            @Override // androidx.lifecycle.p0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(java.lang.Object r11) {
                /*
                    Method dump skipped, instruction units count: 538
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: t.g.a(java.lang.Object):void");
            }
        });
        v vVar6 = this.f39300a;
        if (vVar6.f39331t == null) {
            vVar6.f39331t = new androidx.lifecycle.o0();
        }
        final int i14 = 3;
        vVar6.f39331t.e(this, new p0(this) { // from class: t.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f39297b;

            {
                this.f39297b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:114:0x019f  */
            /* JADX WARN: Removed duplicated region for block: B:83:0x0138  */
            @Override // androidx.lifecycle.p0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(java.lang.Object r11) {
                /*
                    Method dump skipped, instruction units count: 538
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: t.g.a(java.lang.Object):void");
            }
        });
        v vVar7 = this.f39300a;
        if (vVar7.f39332u == null) {
            vVar7.f39332u = new androidx.lifecycle.o0();
        }
        final int i15 = 4;
        vVar7.f39332u.e(this, new p0(this) { // from class: t.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f39297b;

            {
                this.f39297b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:114:0x019f  */
            /* JADX WARN: Removed duplicated region for block: B:83:0x0138  */
            @Override // androidx.lifecycle.p0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(java.lang.Object r11) {
                /*
                    Method dump skipped, instruction units count: 538
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: t.g.a(java.lang.Object):void");
            }
        });
        v vVar8 = this.f39300a;
        if (vVar8.f39333v == null) {
            vVar8.f39333v = new androidx.lifecycle.o0();
        }
        final int i16 = 5;
        vVar8.f39333v.e(this, new p0(this) { // from class: t.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f39297b;

            {
                this.f39297b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:114:0x019f  */
            /* JADX WARN: Removed duplicated region for block: B:83:0x0138  */
            @Override // androidx.lifecycle.p0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(java.lang.Object r11) {
                /*
                    Method dump skipped, instruction units count: 538
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: t.g.a(java.lang.Object):void");
            }
        });
        v vVar9 = this.f39300a;
        if (vVar9.f39335x == null) {
            vVar9.f39335x = new androidx.lifecycle.o0();
        }
        final int i17 = 6;
        vVar9.f39335x.e(this, new p0(this) { // from class: t.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f39297b;

            {
                this.f39297b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:114:0x019f  */
            /* JADX WARN: Removed duplicated region for block: B:83:0x0138  */
            @Override // androidx.lifecycle.p0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(java.lang.Object r11) {
                /*
                    Method dump skipped, instruction units count: 538
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: t.g.a(java.lang.Object):void");
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (Build.VERSION.SDK_INT == 29 && a.a.D(this.f39300a.a())) {
            v vVar = this.f39300a;
            vVar.f39326o = true;
            this.f39301b.postDelayed(new l(vVar, 2), 250L);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (Build.VERSION.SDK_INT >= 29 || this.f39300a.f39324m) {
            return;
        }
        o0 activity = getActivity();
        if (activity == null || !activity.isChangingConfigurations()) {
            o(0);
        }
    }

    public final void p() {
        this.f39300a.f39323k = false;
        if (isAdded()) {
        }
    }

    public final boolean q() {
        return Build.VERSION.SDK_INT <= 28 && a.a.D(this.f39300a.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r() {
        /*
            r10 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 28
            if (r0 < r2) goto L82
            android.content.Context r3 = r10.getContext()
            r4 = 0
            if (r3 == 0) goto L59
            t.v r5 = r10.f39300a
            t.q r5 = r5.f39316d
            if (r5 == 0) goto L59
            java.lang.String r5 = android.os.Build.MANUFACTURER
            java.lang.String r6 = android.os.Build.MODEL
            if (r0 == r2) goto L1b
            goto L59
        L1b:
            if (r5 != 0) goto L1e
            goto L39
        L1e:
            android.content.res.Resources r6 = r3.getResources()
            r7 = 2130903045(0x7f030005, float:1.7412897E38)
            java.lang.String[] r6 = r6.getStringArray(r7)
            int r7 = r6.length
            r8 = r4
        L2b:
            if (r8 >= r7) goto L39
            r9 = r6[r8]
            boolean r9 = r5.equalsIgnoreCase(r9)
            if (r9 == 0) goto L36
            goto L82
        L36:
            int r8 = r8 + 1
            goto L2b
        L39:
            java.lang.String r5 = android.os.Build.MODEL
            if (r5 != 0) goto L3e
            goto L59
        L3e:
            android.content.res.Resources r3 = r3.getResources()
            r6 = 2130903044(0x7f030004, float:1.7412895E38)
            java.lang.String[] r3 = r3.getStringArray(r6)
            int r6 = r3.length
            r7 = r4
        L4b:
            if (r7 >= r6) goto L59
            r8 = r3[r7]
            boolean r8 = r5.startsWith(r8)
            if (r8 == 0) goto L56
            goto L82
        L56:
            int r7 = r7 + 1
            goto L4b
        L59:
            if (r0 != r2) goto L81
            android.os.Bundle r0 = r10.getArguments()
            android.content.Context r2 = r10.getContext()
            if (r2 == 0) goto L77
            android.content.pm.PackageManager r3 = r2.getPackageManager()
            if (r3 == 0) goto L77
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            boolean r2 = t.d0.a(r2)
            if (r2 == 0) goto L77
            r2 = r1
            goto L78
        L77:
            r2 = r4
        L78:
            java.lang.String r3 = "has_fingerprint"
            boolean r0 = r0.getBoolean(r3, r2)
            if (r0 != 0) goto L81
            goto L82
        L81:
            return r4
        L82:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t.m.r():boolean");
    }

    public final void s() {
        Context context = getContext();
        KeyguardManager keyguardManagerA = context != null ? c0.a(context) : null;
        if (keyguardManagerA == null) {
            t(12, getString(R.string.generic_error_no_keyguard));
            return;
        }
        v vVar = this.f39300a;
        i3 i3Var = vVar.f39315c;
        CharSequence charSequence = i3Var != null ? (CharSequence) i3Var.f395b : null;
        vVar.getClass();
        this.f39300a.getClass();
        Intent intentA = h.a(keyguardManagerA, charSequence, null);
        if (intentA == null) {
            t(14, getString(R.string.generic_error_no_device_credential));
            return;
        }
        this.f39300a.f39324m = true;
        if (r()) {
            p();
        }
        intentA.setFlags(134742016);
        startActivityForResult(intentA, 1);
    }

    public final void t(int i11, CharSequence charSequence) {
        u(i11, charSequence);
        dismiss();
    }

    public final void u(int i11, CharSequence charSequence) {
        v vVar = this.f39300a;
        if (vVar.f39324m) {
            Log.v("BiometricFragment", "Error not sent to client. User is confirming their device credential.");
            return;
        }
        if (!vVar.l) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
            return;
        }
        vVar.l = false;
        Executor eVar = vVar.f39313a;
        if (eVar == null) {
            eVar = new d7.e(6);
        }
        eVar.execute(new f(this, i11, charSequence, 1));
    }

    public final void v(p pVar) {
        v vVar = this.f39300a;
        if (vVar.l) {
            vVar.l = false;
            Executor eVar = vVar.f39313a;
            if (eVar == null) {
                eVar = new d7.e(6);
            }
            eVar.execute(new mr.h(21, this, pVar));
        } else {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        }
        dismiss();
    }

    public final void w(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = getString(R.string.default_error_msg);
        }
        v vVar = this.f39300a;
        if (vVar.f39336y == null) {
            vVar.f39336y = new androidx.lifecycle.o0();
        }
        v.d(vVar.f39336y, 2);
        v vVar2 = this.f39300a;
        if (vVar2.f39337z == null) {
            vVar2.f39337z = new androidx.lifecycle.o0();
        }
        v.d(vVar2.f39337z, charSequence);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x() {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t.m.x():void");
    }
}
