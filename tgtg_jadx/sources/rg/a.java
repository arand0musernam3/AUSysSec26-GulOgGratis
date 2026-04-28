package rg;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.RemoteViews;
import f2.y;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import v80.f0;
import v80.p0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends AppWidgetProvider {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f37990d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ao.v f37991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f37992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a90.d f37993c;

    public a() {
        c90.f fVar = p0.f42144a;
        this.f37993c = f0.b(c90.e.f7834b.plus(f0.d()));
    }

    public abstract RemoteViews a(Context context, g gVar);

    public final d b() {
        d dVar = this.f37992b;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("favouriteWidgetRepository");
        return null;
    }

    public final void c(Context context, RemoteViews remoteViews, int i11, String str, int i12, int i13, int i14, List list) {
        context.getClass();
        list.getClass();
        int iA = d70.b.a(i13);
        int iA2 = d70.b.a(i14);
        td.e eVar = new td.e(context);
        eVar.f39959c = str;
        fd.j jVar = td.k.f40020a;
        eVar.f39968m = new y(i12, 5);
        eVar.l = new y(i12, 6);
        td.j.a(eVar, list);
        dx.f.a(iA);
        ud.a aVar = new ud.a(iA);
        dx.f.a(iA2);
        eVar.f39969n = new ud.e(new ud.h(aVar, new ud.a(iA2)));
        eVar.f39960d = new oz.o(context, new ComponentName(context, getClass()), remoteViews, i11);
        fd.w.a(context).a(eVar.a());
    }

    public abstract int d();

    public abstract String e();

    @Override // android.appwidget.AppWidgetProvider
    public final void onDisabled(Context context) {
        context.getClass();
        d dVarB = b();
        String strE = e();
        dVarB.getClass();
        dVarB.f38001c.a(strE);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onEnabled(Context context) {
        context.getClass();
        b().b(e());
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        String action = intent != null ? intent.getAction() : null;
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != -1523599156) {
                if (iHashCode != -764522091) {
                    if (iHashCode == 1219338674 && action.equals("ACTION_REFRESH")) {
                        b().c();
                        return;
                    }
                    return;
                }
                if (action.equals("ACTION_CUSTOMER_ACCOUNT")) {
                    ft.c.J(!ft.c.C());
                    b().c();
                    return;
                }
                return;
            }
            if (action.equals("ACTION_CONTENT_REFRESH")) {
                SharedPreferences.Editor editorEdit = ft.c.x().edit();
                String strY = ft.c.y();
                editorEdit.putBoolean((strY != null ? strY : null) + "_favouriteWidgetRefreshed", true);
                editorEdit.apply();
                b().c();
            }
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        context.getClass();
        appWidgetManager.getClass();
        iArr.getClass();
        f0.B(this.f37993c, null, null, new os.c(this, iArr, context, appWidgetManager, (x70.c) null, 4), 3);
    }
}
