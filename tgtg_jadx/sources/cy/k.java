package cy;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.o0;
import com.app.tgtg.R;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONObject;
import tx.n0;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcy/k;", "Landroidx/fragment/app/y;", "<init>", "()V", "cy/a0", "a8/h", "cy/i", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceAuthDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceAuthDialog.kt\ncom/facebook/login/DeviceAuthDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,545:1\n1#2:546\n*E\n"})
public class k extends androidx.fragment.app.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f13517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f13518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f13519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l f13520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f13521e = new AtomicBoolean();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile ax.i0 f13522f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile ScheduledFuture f13523g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile i f13524h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f13525i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f13526j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public r f13527k;

    @Override // androidx.fragment.app.y
    public final Dialog onCreateDialog(Bundle bundle) {
        j jVar = new j(requireActivity(), R.style.com_facebook_auth_dialog);
        jVar.setContentView(q(sx.b.b() && !this.f13526j));
        return jVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i iVar;
        u uVarO;
        layoutInflater.getClass();
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        o0 o0VarRequireActivity = requireActivity();
        o0VarRequireActivity.getClass();
        v vVar = (v) ((FacebookActivity) o0VarRequireActivity).f10982b;
        this.f13520d = (l) ((vVar == null || (uVarO = vVar.o()) == null) ? null : uVarO.f());
        if (bundle != null && (iVar = (i) bundle.getParcelable("request_state")) != null) {
            w(iVar);
        }
        return viewOnCreateView;
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f13525i = true;
        this.f13521e.set(true);
        super.onDestroyView();
        ax.i0 i0Var = this.f13522f;
        if (i0Var != null) {
            i0Var.cancel(true);
        }
        ScheduledFuture scheduledFuture = this.f13523g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    @Override // androidx.fragment.app.y, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        if (this.f13525i) {
            return;
        }
        r();
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        if (this.f13524h != null) {
            bundle.putParcelable("request_state", this.f13524h);
        }
    }

    public final void p(String str, a8.h hVar, String str2, Date date, Date date2) {
        l lVar = this.f13520d;
        if (lVar != null) {
            String strB = ax.a0.b();
            ArrayList arrayList = (ArrayList) hVar.f973b;
            ArrayList arrayList2 = (ArrayList) hVar.f974c;
            ArrayList arrayList3 = (ArrayList) hVar.f975d;
            ax.k kVar = ax.k.DEVICE_AUTH;
            str2.getClass();
            str.getClass();
            lVar.d().d(new t(lVar.d().f13586g, s.SUCCESS, new ax.b(str2, strB, str, arrayList, arrayList2, arrayList3, kVar, date, null, date2, "facebook"), null, null));
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public final View q(boolean z11) {
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(z11 ? R.layout.com_facebook_smart_device_dialog_fragment : R.layout.com_facebook_device_auth_dialog_fragment, (ViewGroup) null);
        viewInflate.getClass();
        View viewFindViewById = viewInflate.findViewById(R.id.progress_bar);
        viewFindViewById.getClass();
        this.f13517a = viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.confirmation_code);
        viewFindViewById2.getClass();
        this.f13518b = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.cancel_button);
        viewFindViewById3.getClass();
        ((Button) viewFindViewById3).setOnClickListener(new ax.s(this, 14));
        View viewFindViewById4 = viewInflate.findViewById(R.id.com_facebook_device_auth_instructions);
        viewFindViewById4.getClass();
        TextView textView = (TextView) viewFindViewById4;
        this.f13519c = textView;
        textView.setText(Html.fromHtml(getString(R.string.com_facebook_device_auth_instructions)));
        return viewInflate;
    }

    public final void r() {
        if (this.f13521e.compareAndSet(false, true)) {
            i iVar = this.f13524h;
            if (iVar != null) {
                sx.b.a(iVar.f13513b);
            }
            l lVar = this.f13520d;
            if (lVar != null) {
                lVar.d().d(new t(lVar.d().f13586g, s.CANCEL, null, "User canceled log in.", null));
            }
            Dialog dialog = getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    public final void s(FacebookException facebookException) {
        if (this.f13521e.compareAndSet(false, true)) {
            i iVar = this.f13524h;
            if (iVar != null) {
                sx.b.a(iVar.f13513b);
            }
            l lVar = this.f13520d;
            if (lVar != null) {
                r rVar = lVar.d().f13586g;
                String message = facebookException.getMessage();
                ArrayList arrayList = new ArrayList();
                if (message != null) {
                    arrayList.add(message);
                }
                lVar.d().d(new t(rVar, s.ERROR, null, TextUtils.join(": ", arrayList), null));
            }
            Dialog dialog = getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    public final void t(String str, long j9, Long l) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions,name");
        Date date = j9 != 0 ? new Date((j9 * 1000) + new Date().getTime()) : null;
        Date date2 = l.longValue() != 0 ? new Date(l.longValue() * 1000) : null;
        Date date3 = date;
        ax.b bVar = new ax.b(str, ax.a0.b(), "0", null, null, null, null, date3, null, date2);
        String str2 = ax.h0.f4915j;
        ax.h0 h0VarY = qb.e.y(bVar, "me", new ax.c(2, this, str, date3, date2));
        h0VarY.k(ax.l0.GET);
        h0VarY.f4920d = bundle;
        h0VarY.d();
    }

    public final void u() {
        i iVar = this.f13524h;
        if (iVar != null) {
            iVar.f13516e = new Date().getTime();
        }
        Bundle bundle = new Bundle();
        i iVar2 = this.f13524h;
        bundle.putString("code", iVar2 != null ? iVar2.f13514c : null);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(ax.a0.b());
        sb2.append('|');
        tx.j.n();
        String str = ax.a0.f4856h;
        if (str == null) {
            throw new FacebookException("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
        }
        sb2.append(str);
        bundle.putString("access_token", sb2.toString());
        String str2 = ax.h0.f4915j;
        this.f13522f = new ax.h0(null, "device/login_status", bundle, ax.l0.POST, new f(this, 0)).d();
    }

    public final void v() {
        i iVar = this.f13524h;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = null;
        Long lValueOf = iVar != null ? Long.valueOf(iVar.f13515d) : null;
        if (lValueOf != null) {
            synchronized (l.f13530d) {
                try {
                    if (l.f13531e == null) {
                        l.f13531e = new ScheduledThreadPoolExecutor(1);
                    }
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = l.f13531e;
                    if (scheduledThreadPoolExecutor2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("backgroundExecutor");
                    } else {
                        scheduledThreadPoolExecutor = scheduledThreadPoolExecutor2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f13523g = scheduledThreadPoolExecutor.schedule(new al.u(this, 27), lValueOf.longValue(), TimeUnit.SECONDS);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(cy.i r15) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cy.k.w(cy.i):void");
    }

    public final void x(r rVar) {
        rVar.getClass();
        this.f13527k = rVar;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(MessageLogView.COMMA_SEPARATOR, rVar.f13554b));
        String str = rVar.f13561i;
        if (!n0.x(str)) {
            bundle.putString("redirect_uri", str);
        }
        String str2 = rVar.f13563k;
        if (!n0.x(str2)) {
            bundle.putString("target_user_id", str2);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(ax.a0.b());
        sb2.append('|');
        tx.j.n();
        String str3 = ax.a0.f4856h;
        if (str3 == null) {
            throw new FacebookException("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
        }
        sb2.append(str3);
        bundle.putString("access_token", sb2.toString());
        sx.b bVar = sx.b.f39284a;
        String str4 = null;
        if (!yx.a.f46339a.contains(sx.b.class)) {
            try {
                HashMap map = new HashMap();
                String str5 = Build.DEVICE;
                str5.getClass();
                map.put("device", str5);
                String str6 = Build.MODEL;
                str6.getClass();
                map.put("model", str6);
                String string = new JSONObject(map).toString();
                string.getClass();
                str4 = string;
            } catch (Throwable th2) {
                yx.a.a(sx.b.class, th2);
            }
        }
        bundle.putString("device_info", str4);
        String str7 = ax.h0.f4915j;
        new ax.h0(null, "device/login", bundle, ax.l0.POST, new f(this, 1)).d();
    }
}
