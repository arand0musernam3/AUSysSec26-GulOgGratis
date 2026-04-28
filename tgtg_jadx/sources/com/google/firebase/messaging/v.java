package com.google.firebase.messaging;

import android.content.Context;
import android.view.View;
import android.view.Window;
import com.app.tgtg.R;
import com.app.tgtg.feature.main.MainActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f12886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12888d;

    public /* synthetic */ v(boolean z11, df.g gVar, View view) {
        this.f12885a = 1;
        this.f12886b = z11;
        this.f12887c = gVar;
        this.f12888d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i11 = this.f12885a;
        Object obj = this.f12888d;
        boolean z11 = this.f12886b;
        Object obj2 = this.f12887c;
        switch (i11) {
            case 0:
                w.a((Context) obj2, z11, (d10.g) obj);
                break;
            case 1:
                df.g gVar = (df.g) obj2;
                View view = (View) obj;
                view.getClass();
                if (!z11) {
                    Window windowA = h70.g.a(view);
                    if (windowA != null) {
                        gVar.d(windowA);
                    }
                } else {
                    gVar.a(view);
                }
                break;
            default:
                MainActivity mainActivity = (MainActivity) obj2;
                Boolean bool = (Boolean) obj;
                boolean z12 = MainActivity.f9078v;
                if (mainActivity.f0().getVisibility() == 0) {
                    mainActivity.f0().getMenu().findItem(R.id.item_manufacturer).setVisible(z11);
                }
                mainActivity.f9086n = z11;
                if (z11 && mainActivity.f0().getVisibility() == 0) {
                    mainActivity.f0().b();
                }
                mainActivity.o0();
                mainActivity.j0();
                if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                    mainActivity.g0().l.f4432q = 0L;
                }
                break;
        }
    }

    public /* synthetic */ v(Context context, boolean z11, Object obj, int i11) {
        this.f12885a = i11;
        this.f12887c = context;
        this.f12886b = z11;
        this.f12888d = obj;
    }
}
