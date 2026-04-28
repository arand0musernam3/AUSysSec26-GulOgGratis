package go;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.app.NotificationManagerCompat;
import androidx.fragment.app.g1;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.m1;
import ao.g3;
import bg.k0;
import com.app.tgtg.R;
import com.app.tgtg.feature.orderview.charity.CharityOrderActivity;
import com.app.tgtg.feature.orderview.surprisebag.SurpriseBagOrderActivity;
import com.app.tgtg.model.remote.OrderId;
import com.app.tgtg.model.remote.order.Order;
import com.app.tgtg.model.remote.order.OrderState;
import go.w;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.x;
import v80.f0;
import y80.a2;
import y80.h1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class w extends k.h implements r70.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f20772i = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile p70.b f20773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f20774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a2 f20775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h1 f20776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ActivityResultLauncher f20777f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f20778g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f20779h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w(int i11) {
        this((byte) 0);
        this.f20778g = i11;
        switch (i11) {
            case 1:
                this((byte) 0);
                this.f20779h = false;
                addOnContextAvailableListener(new k.g((SurpriseBagOrderActivity) this, 5));
                break;
            default:
                this.f20779h = false;
                addOnContextAvailableListener(new ah.m((CharityOrderActivity) this, 18));
                break;
        }
    }

    public static final void z(w wVar, OrderState orderState, int i11) {
        Order order = (Order) wVar.C().f22215i.f45488a.getValue();
        if (order != null) {
            String strM429getOrderIdreIZeYA = order.m429getOrderIdreIZeYA();
            Intent intent = new Intent();
            intent.putExtra("orderId", OrderId.m209boximpl(strM429getOrderIdreIZeYA));
            intent.putExtra("orderState", orderState);
            wVar.setResult(i11, intent);
        }
    }

    public final void A() {
        if (Build.VERSION.SDK_INT >= 33 && !ft.c.E() && !NotificationManagerCompat.from(this).areNotificationsEnabled()) {
            ActivityResultLauncher activityResultLauncher = this.f20777f;
            if (activityResultLauncher == null) {
                Intrinsics.throwUninitializedPropertyAccessException("requestPermissionLauncher");
                activityResultLauncher = null;
            }
            activityResultLauncher.a(new String[]{"android.permission.POST_NOTIFICATIONS"}, null);
            return;
        }
        k0 k0Var = new k0(this);
        k0Var.f6171b = null;
        k0Var.a(R.string.notification_settings_push_notifications_body);
        k0Var.c(R.string.notification_settings_push_notifications_confirm_button);
        final int i11 = 0;
        k0Var.l = new Function0(this) { // from class: ho.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f22190b;

            {
                this.f22190b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        this.f22190b.C().f22213g.f26484a.a(f70.k.f17493a);
                        break;
                    case 1:
                        this.f22190b.C().m();
                        break;
                    default:
                        this.f22190b.C().m();
                        break;
                }
                return Unit.f26487a;
            }
        };
        k0Var.b(R.string.notification_settings_push_notifications_cancel_button);
        final int i12 = 1;
        k0Var.f6182n = new Function0(this) { // from class: ho.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f22190b;

            {
                this.f22190b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        this.f22190b.C().f22213g.f26484a.a(f70.k.f17493a);
                        break;
                    case 1:
                        this.f22190b.C().m();
                        break;
                    default:
                        this.f22190b.C().m();
                        break;
                }
                return Unit.f26487a;
            }
        };
        final int i13 = 2;
        k0Var.f6183o = new Function0(this) { // from class: ho.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f22190b;

            {
                this.f22190b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        this.f22190b.C().f22213g.f26484a.a(f70.k.f17493a);
                        break;
                    case 1:
                        this.f22190b.C().m();
                        break;
                    default:
                        this.f22190b.C().m();
                        break;
                }
                return Unit.f26487a;
            }
        };
        k0Var.f();
    }

    public final p70.b B() {
        if (this.f20773b == null) {
            synchronized (this.f20774c) {
                try {
                    if (this.f20773b == null) {
                        this.f20773b = new p70.b(this);
                    }
                } finally {
                }
            }
        }
        return this.f20773b;
    }

    public abstract ho.j C();

    public final void D() {
        switch (this.f20778g) {
            case 0:
                if (!this.f20779h) {
                    this.f20779h = true;
                    CharityOrderActivity charityOrderActivity = (CharityOrderActivity) this;
                    ag.i iVar = ((ag.b) ((n) a())).f1288a;
                    charityOrderActivity.f9164k = (e70.c) iVar.f1325h0.get();
                    charityOrderActivity.l = (gv.b) iVar.f1329j0.get();
                }
                break;
            default:
                if (!this.f20779h) {
                    this.f20779h = true;
                    SurpriseBagOrderActivity surpriseBagOrderActivity = (SurpriseBagOrderActivity) this;
                    ag.b bVar = (ag.b) ((x) a());
                    ag.i iVar2 = bVar.f1288a;
                    surpriseBagOrderActivity.f9180k = (e70.c) iVar2.f1325h0.get();
                    surpriseBagOrderActivity.l = new se.d((g3) bVar.f1288a.J.get());
                    surpriseBagOrderActivity.f9181m = (gv.b) iVar2.f1329j0.get();
                }
                break;
        }
    }

    public final boolean E() {
        if (mv.d.o(this) || ft.c.D()) {
            return (Build.VERSION.SDK_INT < 33 || NotificationManagerCompat.from(this).areNotificationsEnabled() || ft.c.E()) ? false : true;
        }
        return true;
    }

    public final void F(Bundle bundle) {
        super.onCreate(bundle);
        B().d();
    }

    @Override // r70.b
    public final Object a() {
        return B().a();
    }

    @Override // k.h, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        Resources resources;
        Resources resources2;
        if (context == null || (resources2 = context.getResources()) == null || (configuration = resources2.getConfiguration()) == null) {
            configuration = new Configuration((context == null || (resources = context.getResources()) == null) ? null : resources.getConfiguration());
        }
        configuration.fontScale = 1.0f;
        applyOverrideConfiguration(configuration);
        super.attachBaseContext(context);
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.p
    public final ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        return zz.f.q(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        F(bundle);
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new g1(2), new e.b(this, 13));
        activityResultLauncherRegisterForActivityResult.getClass();
        this.f20777f = activityResultLauncherRegisterForActivityResult;
        x70.c cVar = null;
        f0.B(m1.c(this), null, null, new ho.d(this, cVar, 0), 3);
        f0.B(m1.c(this), null, null, new ho.d(this, cVar, 1), 3);
    }

    @Override // k.h, androidx.fragment.app.o0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        B().b();
    }

    public w(byte b8) {
        this.f20774c = new Object();
        addOnContextAvailableListener(new ah.m(this, 24));
        a2 a2VarC = y80.r.c(0);
        this.f20775d = a2VarC;
        this.f20776e = new h1(a2VarC);
    }
}
