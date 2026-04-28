package dy;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import ax.o;
import ax.o0;
import ax.s0;
import com.app.tgtg.R;
import com.facebook.login.widget.LoginButton;
import cy.b0;
import cy.f0;
import cy.q;
import cy.r;
import cy.z;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.StringCompanionObject;
import oz.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LoginButton f15223a;

    public b(LoginButton loginButton) {
        this.f15223a = loginButton;
    }

    public final b0 a() {
        f0 f0Var;
        LoginButton loginButton = this.f15223a;
        Set set = yx.a.f46339a;
        if (set.contains(this)) {
            return null;
        }
        try {
            b0 b0VarC = b0.f13473i.c();
            cy.e defaultAudience = loginButton.getDefaultAudience();
            b0VarC.getClass();
            defaultAudience.getClass();
            b0VarC.f13477b = defaultAudience;
            q loginBehavior = loginButton.getLoginBehavior();
            loginBehavior.getClass();
            b0VarC.f13476a = loginBehavior;
            if (set.contains(this)) {
                f0Var = null;
            } else {
                try {
                    f0Var = f0.FACEBOOK;
                } catch (Throwable th2) {
                    yx.a.a(this, th2);
                    f0Var = null;
                }
            }
            f0Var.getClass();
            b0VarC.f13482g = f0Var;
            String authType = loginButton.getAuthType();
            authType.getClass();
            b0VarC.f13479d = authType;
            yx.a.f46339a.contains(this);
            b0VarC.f13483h = loginButton.getShouldSkipAccountDeduplication();
            b0VarC.f13480e = loginButton.getMessengerPageId();
            b0VarC.f13481f = loginButton.getResetMessengerState();
            return b0VarC;
        } catch (Throwable th3) {
            yx.a.a(this, th3);
            return null;
        }
    }

    public final void b() {
        LoginButton loginButton = this.f15223a;
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            b0 b0VarA = a();
            h.e eVar = loginButton.f11003x;
            if (eVar != null) {
                z zVar = (z) eVar.f20948d;
                ax.q callbackManager = loginButton.getCallbackManager();
                if (callbackManager == null) {
                    callbackManager = new tx.i();
                }
                zVar.f13603a = callbackManager;
                eVar.a(loginButton.getProperties().f15217b, null);
                return;
            }
            if (loginButton.getFragment() != null) {
                Fragment fragment = loginButton.getFragment();
                if (fragment != null) {
                    List list = loginButton.getProperties().f15217b;
                    String loggerID = loginButton.getLoggerID();
                    b0VarA.getClass();
                    m mVar = new m(25, false);
                    mVar.f33836b = fragment;
                    r rVarA = b0VarA.a(new a8.h(list));
                    if (loggerID != null) {
                        rVarA.f13559g = loggerID;
                    }
                    b0VarA.g(new w2.z(mVar), rVarA);
                    return;
                }
                return;
            }
            if (loginButton.getNativeFragment() == null) {
                Activity activity = loginButton.getActivity();
                List list2 = loginButton.getProperties().f15217b;
                String loggerID2 = loginButton.getLoggerID();
                b0VarA.getClass();
                activity.getClass();
                r rVarA2 = b0VarA.a(new a8.h(list2));
                if (loggerID2 != null) {
                    rVarA2.f13559g = loggerID2;
                }
                b0VarA.g(new se.d(activity, 10), rVarA2);
                return;
            }
            android.app.Fragment nativeFragment = loginButton.getNativeFragment();
            if (nativeFragment != null) {
                List list3 = loginButton.getProperties().f15217b;
                String loggerID3 = loginButton.getLoggerID();
                b0VarA.getClass();
                m mVar2 = new m(25, false);
                mVar2.f33837c = nativeFragment;
                r rVarA3 = b0VarA.a(new a8.h(list3));
                if (loggerID3 != null) {
                    rVarA3.f13559g = loggerID3;
                }
                b0VarA.g(new w2.z(mVar2), rVarA3);
            }
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }

    public final void c(Context context) {
        String string;
        LoginButton loginButton = this.f15223a;
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            context.getClass();
            b0 b0VarA = a();
            if (!loginButton.f10989i) {
                b0VarA.d();
                return;
            }
            String string2 = loginButton.getResources().getString(R.string.com_facebook_loginview_log_out_action);
            string2.getClass();
            String string3 = loginButton.getResources().getString(R.string.com_facebook_loginview_cancel_action);
            string3.getClass();
            o0 o0Var = (o0) o.f4975f.w().f4979c;
            int i11 = 1;
            if ((o0Var != null ? o0Var.f4984e : null) != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String string4 = loginButton.getResources().getString(R.string.com_facebook_loginview_logged_in_as);
                string4.getClass();
                string = String.format(string4, Arrays.copyOf(new Object[]{o0Var.f4984e}, 1));
            } else {
                string = loginButton.getResources().getString(R.string.com_facebook_loginview_logged_in_using_facebook);
                string.getClass();
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage(string).setCancelable(true).setPositiveButton(string2, new cy.h(b0VarA, i11)).setNegativeButton(string3, (DialogInterface.OnClickListener) null);
            builder.create().show();
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LoginButton loginButton = this.f15223a;
        Set set = yx.a.f46339a;
        if (set.contains(this)) {
            return;
        }
        try {
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
        if (set.contains(this)) {
            return;
        }
        try {
            view.getClass();
            int i11 = LoginButton.f10988y;
            if (!set.contains(loginButton)) {
                try {
                    View.OnClickListener onClickListener = loginButton.f5009c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                } catch (Throwable th3) {
                    yx.a.a(loginButton, th3);
                }
            }
            Date date = ax.b.l;
            ax.b bVarV = pd.g.v();
            boolean zB = pd.g.B();
            if (zB) {
                Context context = loginButton.getContext();
                context.getClass();
                c(context);
            } else {
                b();
            }
            bx.m mVar = new bx.m(loginButton.getContext(), (String) null);
            Bundle bundle = new Bundle();
            bundle.putInt("logging_in", bVarV != null ? 0 : 1);
            bundle.putInt("access_token_expired", zB ? 1 : 0);
            if (s0.c()) {
                mVar.g(bundle, "fb_login_view_usage");
                return;
            }
            return;
        } catch (Throwable th4) {
            yx.a.a(this, th4);
            return;
        }
        yx.a.a(this, th2);
    }
}
