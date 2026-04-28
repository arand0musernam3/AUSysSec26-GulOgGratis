package tx;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.braze.Constants;
import com.facebook.FacebookException;
import java.util.Arrays;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltx/l;", "Landroidx/fragment/app/y;", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l extends androidx.fragment.app.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Dialog f40527a;

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        if ((this.f40527a instanceof u0) && isResumed()) {
            Dialog dialog = this.f40527a;
            dialog.getClass();
            ((u0) dialog).d();
        }
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        androidx.fragment.app.o0 activity;
        String string;
        u0 u0Var;
        super.onCreate(bundle);
        if (this.f40527a == null && (activity = getActivity()) != null) {
            Intent intent = activity.getIntent();
            intent.getClass();
            Bundle bundleI = h0.i(intent);
            final int i11 = 0;
            if (bundleI != null ? bundleI.getBoolean("is_fallback", false) : false) {
                string = bundleI != null ? bundleI.getString(Constants.BRAZE_WEBVIEW_URL_EXTRA) : null;
                if (n0.x(string)) {
                    ax.a0 a0Var = ax.a0.f4849a;
                    activity.finish();
                    return;
                }
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                final int i12 = 1;
                String str = String.format("fb%s://bridge/", Arrays.copyOf(new Object[]{ax.a0.b()}, 1));
                int i13 = p.f40547o;
                string.getClass();
                u0.b(activity);
                p pVar = new p(activity, string);
                pVar.f40559b = str;
                pVar.f40560c = new p0(this) { // from class: tx.k

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ l f40526b;

                    {
                        this.f40526b = this;
                    }

                    @Override // tx.p0
                    public final void a(Bundle bundle2, FacebookException facebookException) {
                        switch (i12) {
                            case 0:
                                androidx.fragment.app.o0 activity2 = this.f40526b.getActivity();
                                if (activity2 != null) {
                                    Intent intent2 = activity2.getIntent();
                                    intent2.getClass();
                                    activity2.setResult(facebookException == null ? -1 : 0, h0.e(intent2, bundle2, facebookException));
                                    activity2.finish();
                                    break;
                                }
                                break;
                            default:
                                androidx.fragment.app.o0 activity3 = this.f40526b.getActivity();
                                if (activity3 != null) {
                                    Intent intent3 = new Intent();
                                    if (bundle2 == null) {
                                        bundle2 = new Bundle();
                                    }
                                    intent3.putExtras(bundle2);
                                    activity3.setResult(-1, intent3);
                                    activity3.finish();
                                    break;
                                }
                                break;
                        }
                    }
                };
                u0Var = pVar;
            } else {
                String string2 = bundleI != null ? bundleI.getString("action") : null;
                Bundle bundle2 = bundleI != null ? bundleI.getBundle("params") : null;
                if (n0.x(string2)) {
                    ax.a0 a0Var2 = ax.a0.f4849a;
                    activity.finish();
                    return;
                }
                string2.getClass();
                Date date = ax.b.l;
                ax.b bVarV = pd.g.v();
                string = pd.g.B() ? null : ax.a0.b();
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                p0 p0Var = new p0(this) { // from class: tx.k

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ l f40526b;

                    {
                        this.f40526b = this;
                    }

                    @Override // tx.p0
                    public final void a(Bundle bundle22, FacebookException facebookException) {
                        switch (i11) {
                            case 0:
                                androidx.fragment.app.o0 activity2 = this.f40526b.getActivity();
                                if (activity2 != null) {
                                    Intent intent2 = activity2.getIntent();
                                    intent2.getClass();
                                    activity2.setResult(facebookException == null ? -1 : 0, h0.e(intent2, bundle22, facebookException));
                                    activity2.finish();
                                    break;
                                }
                                break;
                            default:
                                androidx.fragment.app.o0 activity3 = this.f40526b.getActivity();
                                if (activity3 != null) {
                                    Intent intent3 = new Intent();
                                    if (bundle22 == null) {
                                        bundle22 = new Bundle();
                                    }
                                    intent3.putExtras(bundle22);
                                    activity3.setResult(-1, intent3);
                                    activity3.finish();
                                    break;
                                }
                                break;
                        }
                    }
                };
                if (bVarV != null) {
                    bundle2.putString("app_id", bVarV.f4878h);
                    bundle2.putString("access_token", bVarV.f4875e);
                } else {
                    bundle2.putString("app_id", string);
                }
                u0.b(activity);
                u0Var = new u0(activity, string2, bundle2, cy.f0.FACEBOOK, p0Var);
            }
            this.f40527a = u0Var;
        }
    }

    @Override // androidx.fragment.app.y
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f40527a;
        if (dialog != null) {
            return dialog;
        }
        androidx.fragment.app.o0 activity = getActivity();
        if (activity != null) {
            Intent intent = activity.getIntent();
            intent.getClass();
            activity.setResult(-1, h0.e(intent, null, null));
            activity.finish();
        }
        setShowsDialog(false);
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.getClass();
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Dialog dialog = getDialog();
        if (dialog != null && getRetainInstance()) {
            dialog.setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Dialog dialog = this.f40527a;
        if (dialog instanceof u0) {
            dialog.getClass();
            ((u0) dialog).d();
        }
    }
}
