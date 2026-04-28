package cy;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.braze.h2;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.n0;
import kotlin.collections.p0;
import kotlin.jvm.internal.Intrinsics;
import zendesk.messaging.android.internal.conversationscreen.messagelog.MessageLogView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d9.a f13538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a50.d f13539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Messenger f13541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f13542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f13543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f13544h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f13545i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f13546j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f13547k;

    public m(Context context, r rVar) {
        context.getClass();
        rVar.getClass();
        String str = rVar.f13556d;
        String strValueOf = String.valueOf(rVar.f13557e);
        String str2 = rVar.f13568q;
        str.getClass();
        Context applicationContext = context.getApplicationContext();
        this.f13537a = applicationContext != null ? applicationContext : context;
        this.f13542f = 65536;
        this.f13543g = 65537;
        this.f13544h = str;
        this.f13545i = strValueOf;
        this.f13546j = 20121101;
        this.f13547k = str2;
        this.f13538b = new d9.a(this);
    }

    public final void a(Bundle bundle) {
        if (this.f13540d) {
            this.f13540d = false;
            a50.d dVar = this.f13539c;
            if (dVar != null) {
                n nVar = (n) dVar.f824b;
                r rVar = (r) dVar.f825c;
                rVar.getClass();
                m mVar = nVar.f13548c;
                View view = null;
                if (mVar != null) {
                    mVar.f13539c = null;
                }
                nVar.f13548c = null;
                se.b bVar = nVar.d().f13584e;
                if (bVar != null) {
                    View view2 = ((v) bVar.f39010b).f13595e;
                    if (view2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("progressBar");
                        view2 = null;
                    }
                    view2.setVisibility(8);
                }
                if (bundle != null) {
                    List stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
                    if (stringArrayList == null) {
                        stringArrayList = n0.f26529a;
                    }
                    Set<String> set = rVar.f13554b;
                    if (set == null) {
                        set = p0.f26531a;
                    }
                    String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
                    if (set.contains("openid") && (string == null || string.length() == 0)) {
                        nVar.d().j();
                        return;
                    }
                    if (stringArrayList.containsAll(set)) {
                        String string2 = bundle.getString("com.facebook.platform.extra.USER_ID");
                        if (string2 != null && string2.length() != 0) {
                            nVar.l(bundle, rVar);
                            return;
                        }
                        se.b bVar2 = nVar.d().f13584e;
                        if (bVar2 != null) {
                            View view3 = ((v) bVar2.f39010b).f13595e;
                            if (view3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("progressBar");
                            } else {
                                view = view3;
                            }
                            view.setVisibility(0);
                        }
                        String string3 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
                        if (string3 != null) {
                            tx.n0.o(string3, new a8.h(bundle, nVar, rVar, 15));
                            return;
                        } else {
                            h2.b("Required value was null.");
                            return;
                        }
                    }
                    HashSet hashSet = new HashSet();
                    for (String str : set) {
                        if (!stringArrayList.contains(str)) {
                            hashSet.add(str);
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        nVar.a("new_permissions", TextUtils.join(MessageLogView.COMMA_SEPARATOR, hashSet));
                    }
                    rVar.f13554b = hashSet;
                }
                nVar.d().j();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        componentName.getClass();
        iBinder.getClass();
        this.f13541e = new Messenger(iBinder);
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.f13544h);
        String str = this.f13547k;
        if (str != null) {
            bundle.putString("com.facebook.platform.extra.NONCE", str);
        }
        String str2 = this.f13545i;
        if (str2 != null) {
            bundle.putString("com.facebook.platform.extra.REDIRECT_URI", str2);
        }
        Message messageObtain = Message.obtain((Handler) null, this.f13542f);
        messageObtain.arg1 = this.f13546j;
        messageObtain.setData(bundle);
        messageObtain.replyTo = new Messenger(this.f13538b);
        try {
            Messenger messenger = this.f13541e;
            if (messenger != null) {
                messenger.send(messageObtain);
            }
        } catch (RemoteException unused) {
            a(null);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        componentName.getClass();
        this.f13541e = null;
        try {
            this.f13537a.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        a(null);
    }
}
