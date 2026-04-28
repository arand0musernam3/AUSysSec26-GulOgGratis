package cy;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g1;
import androidx.fragment.app.o0;
import com.app.tgtg.R;
import com.facebook.FacebookException;
import java.util.ArrayList;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcy/v;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class v extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f13591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f13592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u f13593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActivityResultLauncher f13594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f13595e;

    public final u o() {
        u uVar = this.f13593c;
        if (uVar != null) {
            return uVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("loginClient");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        o().i(i11, i12, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle bundleExtra;
        super.onCreate(bundle);
        u uVar = bundle != null ? (u) bundle.getParcelable("loginClient") : null;
        if (uVar == null) {
            uVar = new u();
            uVar.f13581b = -1;
            if (uVar.f13582c != null) {
                throw new FacebookException("Can't set fragment once it is already set.");
            }
            uVar.f13582c = this;
        } else {
            if (uVar.f13582c != null) {
                throw new FacebookException("Can't set fragment once it is already set.");
            }
            uVar.f13582c = this;
        }
        this.f13593c = uVar;
        o().f13583d = new w.z(this, 25);
        o0 activity = getActivity();
        if (activity == null) {
            return;
        }
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity != null) {
            this.f13591a = callingActivity.getPackageName();
        }
        Intent intent = activity.getIntent();
        if (intent != null && (bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request")) != null) {
            this.f13592b = (r) bundleExtra.getParcelable("request");
        }
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new g1(4), new w.z(new b4.x(8, this, activity), 26));
        activityResultLauncherRegisterForActivityResult.getClass();
        this.f13594d = activityResultLauncherRegisterForActivityResult;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.com_facebook_login_fragment, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(R.id.com_facebook_login_fragment_progress_bar);
        viewFindViewById.getClass();
        this.f13595e = viewFindViewById;
        o().f13584e = new se.b(this, 11);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        c0 c0VarF = o().f();
        if (c0VarF != null) {
            c0VarF.b();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        View view = getView();
        View viewFindViewById = view != null ? view.findViewById(R.id.com_facebook_login_fragment_progress_bar) : null;
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f13591a == null) {
            Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
            o0 activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        u uVarO = o();
        r rVar = this.f13592b;
        r rVar2 = uVarO.f13586g;
        if ((rVar2 == null || uVarO.f13581b < 0) && rVar != null) {
            f0 f0Var = rVar.f13565n;
            if (rVar2 != null) {
                throw new FacebookException("Attempted to authorize while a request is pending.");
            }
            Date date = ax.b.l;
            if (!pd.g.B() || uVarO.b()) {
                uVarO.f13586g = rVar;
                ArrayList arrayList = new ArrayList();
                q qVar = rVar.f13553a;
                f0 f0Var2 = f0.INSTAGRAM;
                if (f0Var != f0Var2) {
                    if (qVar.d()) {
                        arrayList.add(new n(uVarO));
                    }
                    if (!ax.a0.f4863p && qVar.f()) {
                        arrayList.add(new p(uVarO));
                    }
                } else if (!ax.a0.f4863p && qVar.e()) {
                    arrayList.add(new o(uVarO));
                }
                if (qVar.a()) {
                    arrayList.add(new c(uVarO));
                }
                if (qVar.g()) {
                    arrayList.add(new l0(uVarO));
                }
                if (f0Var != f0Var2 && qVar.c()) {
                    arrayList.add(new l(uVarO));
                }
                uVarO.f13580a = (c0[]) arrayList.toArray(new c0[0]);
                uVarO.j();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("loginClient", o());
    }
}
